package scfgrails

class Disciplina {

    Integer codigo
    Integer creditos
	String nome
	String mencao

	static belongsTo = [semestre:Semestre]

    static constraints = {
    	mencao(inList:["SM", "SR", "II", "MI", "MM", "MS", "SS"])
    }
}
