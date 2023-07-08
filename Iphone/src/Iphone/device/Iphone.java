package Iphone.device;

import Iphone.process.AparelhoTelefonico;
import Iphone.process.NavegadorInternet;
import Iphone.process.ReprodutorMusical;

public class Iphone {
	public static void main(String[] args) {
		AparelhoTelefonico apt = new AparelhoTelefonico();
		NavegadorInternet ni = new NavegadorInternet();
		ReprodutorMusical rm = new ReprodutorMusical();
		
		System.out.println("Aparelho telefônico".toUpperCase());
		apt.ligar();
		apt.atender();
		apt.iniciarCorreioVoz();
		
		System.out.println();
		System.out.println("Navegador de internet".toUpperCase());
		ni.exibirPagina();
		ni.adicionarNovaAba();
		ni.atualizarPagina();
		
		System.out.println();
		System.out.println("Reprodutor Musical");
		rm.selecionarMusica("We Are Number One");
		rm.tocar();
		rm.pausar();
	}
	
}
