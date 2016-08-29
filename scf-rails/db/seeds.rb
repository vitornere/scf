# This file should contain all the record creation needed to seed the database with its default values.
# The data can then be loaded with the rails db:seed command (or created alongside the database with db:setup).
#
# Examples:
#
#   movies = Movie.create([{ name: 'Star Wars' }, { name: 'Lord of the Rings' }])
#   Character.create(name: 'Luke', movie: movies.first)

# Disciplina codigo:string nome:string creditos:integer pre_requisito:string
Fluxo.create(nome: 'Engenharias')

Semestre.create(numero: '1', fluxo_id: Fluxo.find_by(nome: 'Engenharias'))
Semestre.create(numero: '2', fluxo_id: Fluxo.find_by(nome: 'Engenharias'))

Disciplina.create(codigo: '113034', nome: 'Cálulo 1', creditos: 6)
Disciplina.create(codigo: '113093', nome: 'Introdução à Álgebra Linear', creditos: 4)
Disciplina.create(codigo: '113042', nome: 'Cálulo 2', creditos: 6, pre_requisito: '113034')
