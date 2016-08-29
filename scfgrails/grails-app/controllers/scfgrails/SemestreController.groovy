package scfgrails

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class SemestreController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE", index: "GET"]

    def index() {
       [semestre: Semestre.findAll()]
    }

    def show(Semestre semestre) {
        respond semestre
    }

    def create() {
        respond new Semestre(params)
    }

    @Transactional
    def save(Semestre semestre) {
        if (semestre == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (semestre.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond semestre.errors, view:'create'
            return
        }

        semestre.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'semestre.label', default: 'Semestre'), semestre.id])
                redirect semestre
            }
            '*' { respond semestre, [status: CREATED] }
        }
    }

    def edit(Semestre semestre) {
        respond semestre
    }

    @Transactional
    def update(Semestre semestre) {
        if (semestre == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (semestre.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond semestre.errors, view:'edit'
            return
        }

        semestre.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'semestre.label', default: 'Semestre'), semestre.id])
                redirect semestre
            }
            '*'{ respond semestre, [status: OK] }
        }
    }

    @Transactional
    def delete(Semestre semestre) {

        if (semestre == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        semestre.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'semestre.label', default: 'Semestre'), semestre.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'semestre.label', default: 'Semestre'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
