require 'test_helper'

class FluxosControllerTest < ActionDispatch::IntegrationTest
  setup do
    @fluxo = fluxos(:one)
  end

  test "should get index" do
    get fluxos_url
    assert_response :success
  end

  test "should get new" do
    get new_fluxo_url
    assert_response :success
  end

  test "should create fluxo" do
    assert_difference('Fluxo.count') do
      post fluxos_url, params: { fluxo: { nome: @fluxo.nome } }
    end

    assert_redirected_to fluxo_url(Fluxo.last)
  end

  test "should show fluxo" do
    get fluxo_url(@fluxo)
    assert_response :success
  end

  test "should get edit" do
    get edit_fluxo_url(@fluxo)
    assert_response :success
  end

  test "should update fluxo" do
    patch fluxo_url(@fluxo), params: { fluxo: { nome: @fluxo.nome } }
    assert_redirected_to fluxo_url(@fluxo)
  end

  test "should destroy fluxo" do
    assert_difference('Fluxo.count', -1) do
      delete fluxo_url(@fluxo)
    end

    assert_redirected_to fluxos_url
  end
end
