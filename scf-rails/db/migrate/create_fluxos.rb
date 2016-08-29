class CreateFluxos < ActiveRecord::Migration[5.0]
  def change
    create_table :fluxos do |t|
      t.string :nome

      t.timestamps
    end
  end
end
