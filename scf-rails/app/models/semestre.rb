class Semestre < ApplicationRecord
	has_many :disciplinas
	belongs_to :fluxos
end
