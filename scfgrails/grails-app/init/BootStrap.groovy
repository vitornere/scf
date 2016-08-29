import scfgrails.Fluxo
import scfgrails.Semestre
import scfgrails.Disciplina
class BootStrap {

    def init = { servletContext ->
    	if (!Fluxo.count()) {
    		new Fluxo(creditosExigidos:0, creditosAObter:0, creditosObtidos:0, ira:5.00).save()

    		new Semestre(posicao:1, creditosAtual:0, fluxo:Fluxo.last()).save()
    		new Semestre(posicao:2, creditosAtual:0, fluxo:Fluxo.last()).save()
    		new Semestre(posicao:3, creditosAtual:0, fluxo:Fluxo.last()).save()
    		new Semestre(posicao:4, creditosAtual:0, fluxo:Fluxo.last()).save()
    		new Semestre(posicao:5, creditosAtual:0, fluxo:Fluxo.last()).save()
    		new Semestre(posicao:6, creditosAtual:0, fluxo:Fluxo.last()).save()
    		new Semestre(posicao:7, creditosAtual:0, fluxo:Fluxo.last()).save()
    		new Semestre(posicao:8, creditosAtual:0, fluxo:Fluxo.last()).save()
    		new Semestre(posicao:9, creditosAtual:0, fluxo:Fluxo.last()).save()
    		new Semestre(posicao:10, creditosAtual:0, fluxo:Fluxo.last()).save()

    		// Primeiro Semestre
    		new Disciplina(mencao:"SM", creditos:6, codigo:1, nome:"Calc 1", semestre:Semestre.findByPosicao(1)).save()
    		new Disciplina(mencao:"SM", creditos:6, codigo:2, nome:"Des Ind", semestre:Semestre.findByPosicao(1)).save()
    		new Disciplina(mencao:"SM", creditos:4, codigo:3, nome:"IAL", semestre:Semestre.findByPosicao(1)).save()
    		new Disciplina(mencao:"SM", creditos:4, codigo:4, nome:"EA", semestre:Semestre.findByPosicao(1)).save()
    		new Disciplina(mencao:"SM", creditos:4, codigo:5, nome:"Hum & Cid", semestre:Semestre.findByPosicao(1)).save()
    		new Disciplina(mencao:"SM", creditos:4, codigo:6, nome:"IA", semestre:Semestre.findByPosicao(1)).save()

    		// Segundo Semestre
    		new Disciplina(mencao:"SM", creditos:6, codigo:7, nome:"Calc 2", semestre:Semestre.findByPosicao(2)).save()
    		new Disciplina(mencao:"SM", creditos:6, codigo:8, nome:"CB", semestre:Semestre.findByPosicao(2)).save()
    		new Disciplina(mencao:"SM", creditos:4, codigo:9, nome:"Fis 1", semestre:Semestre.findByPosicao(2)).save()
    		new Disciplina(mencao:"SM", creditos:4, codigo:10, nome:"Prob e Est", semestre:Semestre.findByPosicao(2)).save()
    		new Disciplina(mencao:"SM", creditos:4, codigo:11, nome:"Eng Ec", semestre:Semestre.findByPosicao(2)).save()
    		new Disciplina(mencao:"SM", creditos:4, codigo:12, nome:"PDS", semestre:Semestre.findByPosicao(2)).save()
    		new Disciplina(mencao:"SM", creditos:2, codigo:13, nome:"Fis 1 Exp", semestre:Semestre.findByPosicao(2)).save()

    		// Terceiro Semestre
    		new Disciplina(mencao:"SM", creditos:4, codigo:14, nome:"Métodos", semestre:Semestre.findByPosicao(3)).save()
    		new Disciplina(mencao:"SM", creditos:4, codigo:15, nome:"GPeQ", semestre:Semestre.findByPosicao(3)).save()
    		new Disciplina(mencao:"SM", creditos:6, codigo:16, nome:"SD1", semestre:Semestre.findByPosicao(3)).save()
    		new Disciplina(mencao:"SM", creditos:4, codigo:17, nome:"OO", semestre:Semestre.findByPosicao(3)).save()
    		new Disciplina(mencao:"SM", creditos:4, codigo:18, nome:"EMC", semestre:Semestre.findByPosicao(3)).save()

    		// Quarto Semestre
    		new Disciplina(mencao:"SM", creditos:4, codigo:19, nome:"PI1", semestre:Semestre.findByPosicao(4)).save()
    		new Disciplina(mencao:"SM", creditos:4, codigo:20, nome:"Banco", semestre:Semestre.findByPosicao(4)).save()
    		new Disciplina(mencao:"SM", creditos:4, codigo:21, nome:"MDS", semestre:Semestre.findByPosicao(4)).save()
    		new Disciplina(mencao:"SM", creditos:4, codigo:22, nome:"FAC", semestre:Semestre.findByPosicao(4)).save()
    		new Disciplina(mencao:"SM", creditos:4, codigo:23, nome:"EDA", semestre:Semestre.findByPosicao(4)).save()
    		new Disciplina(mencao:"SM", creditos:4, codigo:24, nome:"Paradigmas", semestre:Semestre.findByPosicao(4)).save()

    		// Quinto Semestre
    		new Disciplina(mencao:"SM", creditos:4, codigo:25, nome:"FSO", semestre:Semestre.findByPosicao(5)).save()
    		new Disciplina(mencao:"SM", creditos:4, codigo:26, nome:"Tec Prog", semestre:Semestre.findByPosicao(5)).save()
    		new Disciplina(mencao:"SM", creditos:4, codigo:27, nome:"Requisitos", semestre:Semestre.findByPosicao(5)).save()
    		new Disciplina(mencao:"SM", creditos:4, codigo:28, nome:"IHellC", semestre:Semestre.findByPosicao(5)).save()
    		new Disciplina(mencao:"SM", creditos:4, codigo:29, nome:"Compiladores", semestre:Semestre.findByPosicao(5)).save()
    		new Disciplina(mencao:"SM", creditos:4, codigo:31, nome:"EDA2", semestre:Semestre.findByPosicao(5)).save()
    		new Disciplina(mencao:"SM", creditos:4, codigo:32, nome:"Tec M F de S", semestre:Semestre.findByPosicao(5)).save()

    		// Sexto Semestre
    		new Disciplina(mencao:"SM", creditos:4, codigo:33, nome:"GPP", semestre:Semestre.findByPosicao(6)).save()
    		new Disciplina(mencao:"SM", creditos:4, codigo:34, nome:"Des", semestre:Semestre.findByPosicao(6)).save()
    		new Disciplina(mencao:"SM", creditos:4, codigo:35, nome:"Medi Anal", semestre:Semestre.findByPosicao(6)).save()
    		new Disciplina(mencao:"SM", creditos:4, codigo:36, nome:"Veri Val", semestre:Semestre.findByPosicao(6)).save()
    		new Disciplina(mencao:"SM", creditos:4, codigo:37, nome:"Fund Rede", semestre:Semestre.findByPosicao(6)).save()

    		// Sétimo Semestre
    		new Disciplina(mencao:"SM", creditos:2, codigo:38, nome:"Manut & Evol", semestre:Semestre.findByPosicao(7)).save()
    		new Disciplina(mencao:"SM", creditos:4, codigo:39, nome:"DAS", semestre:Semestre.findByPosicao(7)).save()
    		new Disciplina(mencao:"SM", creditos:4, codigo:40, nome:"MPS", semestre:Semestre.findByPosicao(7)).save()
    		new Disciplina(mencao:"SM", creditos:4, codigo:41, nome:"GCS", semestre:Semestre.findByPosicao(7)).save()
    		new Disciplina(mencao:"SM", creditos:4, codigo:42, nome:"TEP", semestre:Semestre.findByPosicao(7)).save()

    		// Oitavo Semestre
    		new Disciplina(mencao:"SM", creditos:6, codigo:43, nome:"PI2", semestre:Semestre.findByPosicao(8)).save()
    		new Disciplina(mencao:"SM", creditos:4, codigo:44, nome:"PPS", semestre:Semestre.findByPosicao(8)).save()
    		new Disciplina(mencao:"SM", creditos:4, codigo:45, nome:"ESExp", semestre:Semestre.findByPosicao(8)).save()

    		// Nono Semestre
    		new Disciplina(mencao:"SM", creditos:14, codigo:46, nome:"ES", semestre:Semestre.findByPosicao(9)).save()
    		new Disciplina(mencao:"SM", creditos:4, codigo:47, nome:"TCC1", semestre:Semestre.findByPosicao(9)).save()
    		new Disciplina(mencao:"SM", creditos:2, codigo:48, nome:"Seminarios", semestre:Semestre.findByPosicao(9)).save()

    		// Décimo Semestre
    		new Disciplina(mencao:"SM", creditos:6,codigo:49, nome:"TCC2", semestre:Semestre.findByPosicao(10)).save()
    	}
    }
    def destroy = {
    }
}

