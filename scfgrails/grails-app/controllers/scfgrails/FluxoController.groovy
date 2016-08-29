package scfgrails

import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class FluxoController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE", list: "GET"]

    def index() {
        def fluxo = Fluxo.last()

        [def semestre = fluxo.semestres.list()]
    }

    def show(Fluxo fluxo) {
        respond fluxo
    }

    def create() {
        respond new Fluxo(params)
    }

    @Transactional
    def save(Fluxo fluxo) {
        if (fluxo == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (fluxo.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond fluxo.errors, view:'create'
            return
        }

        fluxo.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.created.message', args: [message(code: 'fluxo.label', default: 'Fluxo'), fluxo.id])
                redirect fluxo
            }
            '*' { respond fluxo, [status: CREATED] }
        }
    }

    def edit(Fluxo fluxo) {
        respond fluxo
    }

    @Transactional
    def update(Fluxo fluxo) {
        if (fluxo == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        if (fluxo.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond fluxo.errors, view:'edit'
            return
        }

        fluxo.save flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'fluxo.label', default: 'Fluxo'), fluxo.id])
                redirect fluxo
            }
            '*'{ respond fluxo, [status: OK] }
        }
    }

    @Transactional
    def delete(Fluxo fluxo) {

        if (fluxo == null) {
            transactionStatus.setRollbackOnly()
            notFound()
            return
        }

        fluxo.delete flush:true

        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'fluxo.label', default: 'Fluxo'), fluxo.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form multipartForm {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'fluxo.label', default: 'Fluxo'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
