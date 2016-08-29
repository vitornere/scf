json.extract! disciplina, :id, :codigo, :nome, :creditos, :mencao, :pre_requisito, :semestre_id, :created_at, :updated_at
json.url disciplina_url(disciplina, format: :json)