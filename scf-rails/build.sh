rails generate scaffold fluxo nome:string
rails generate scaffold semestre numero:string fluxo_id:integer
rails generate scaffold disciplina codigo:string nome:string creditos:integer mencao:string pre_requisito:integer semestre_id:integer

sed -i -e 's|class Fluxo < ApplicationRecord|class Fluxo < ApplicationRecord\n\thas_many :semestres|' app/models/fluxo.rb
sed -i -e 's|class Semestre < ApplicationRecord|class Semestre < ApplicationRecord\n\thas_many :disciplinas\n\tbelongs_to :fluxos|' app/models/semestre.rb
sed -i -e 's|class Disciplina < ApplicationRecord|class Disciplina < ApplicationRecord\n\thas_many :disciplinas\n\tbelongs_to :disciplinas\n\tbelongs_to :semestres|' app/models/disciplina.rb
