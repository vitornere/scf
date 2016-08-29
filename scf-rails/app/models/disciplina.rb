class Disciplina < ApplicationRecord
	has_many :disciplinas
	belongs_to :disciplinas
	belongs_to :semestres
end
