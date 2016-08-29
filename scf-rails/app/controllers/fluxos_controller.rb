class FluxosController < ApplicationController
  before_action :set_fluxo, only: [:show, :edit, :update, :destroy]

  # GET /fluxos
  # GET /fluxos.json
  def index
    @fluxos = Fluxo.all
  end

  # GET /fluxos/1
  # GET /fluxos/1.json
  def show
  end

  # GET /fluxos/new
  def new
    @fluxo = Fluxo.new
  end

  # GET /fluxos/1/edit
  def edit
  end

  # POST /fluxos
  # POST /fluxos.json
  def create
    @fluxo = Fluxo.new(fluxo_params)

    respond_to do |format|
      if @fluxo.save
        format.html { redirect_to @fluxo, notice: 'Fluxo was successfully created.' }
        format.json { render :show, status: :created, location: @fluxo }
      else
        format.html { render :new }
        format.json { render json: @fluxo.errors, status: :unprocessable_entity }
      end
    end
  end

  # PATCH/PUT /fluxos/1
  # PATCH/PUT /fluxos/1.json
  def update
    respond_to do |format|
      if @fluxo.update(fluxo_params)
        format.html { redirect_to @fluxo, notice: 'Fluxo was successfully updated.' }
        format.json { render :show, status: :ok, location: @fluxo }
      else
        format.html { render :edit }
        format.json { render json: @fluxo.errors, status: :unprocessable_entity }
      end
    end
  end

  # DELETE /fluxos/1
  # DELETE /fluxos/1.json
  def destroy
    @fluxo.destroy
    respond_to do |format|
      format.html { redirect_to fluxos_url, notice: 'Fluxo was successfully destroyed.' }
      format.json { head :no_content }
    end
  end

  private
    # Use callbacks to share common setup or constraints between actions.
    def set_fluxo
      @fluxo = Fluxo.find(params[:id])
    end

    # Never trust parameters from the scary internet, only allow the white list through.
    def fluxo_params
      params.require(:fluxo).permit(:nome)
    end
end
