class CreateDisciplinas < ActiveRecord::Migration[5.0]
  def change
    create_table :disciplinas do |t|
      t.string :codigo
      t.string :nome
      t.integer :creditos
      t.string :mencao
      t.integer :pre_requisito
      t.integer :semestre_id

      t.timestamps
    end
    add_foreign_key :disciplinas, column: :pre_requisito
    add_foreign_key :disciplinas, :semestres
  end
end
