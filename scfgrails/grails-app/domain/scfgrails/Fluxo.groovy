package scfgrails

class Fluxo {

	Integer creditosExigidos
	Integer creditosObtidos
	Integer creditosAObter
	Float ira

	static hasMany = [semestres:Semestre]

    static constraints = {
    	semestres(nullable:true)
    }
}
