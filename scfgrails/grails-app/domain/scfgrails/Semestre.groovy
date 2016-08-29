package scfgrails

class Semestre {

	Integer posicao
	Integer creditosAtual

	static hasMany = [disciplinas:Disciplina]
	static belongsTo = [fluxo:Fluxo]

    static constraints = {
    }
}
