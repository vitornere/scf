class CreateSemestres < ActiveRecord::Migration[5.0]
  def change
    create_table :semestres do |t|
      t.string :numero
      t.integer :fluxo_id

      t.timestamps
    end
    add_foreign_key :semestres, :fluxos
  end
end
