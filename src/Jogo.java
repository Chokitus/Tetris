import base.*;

public class Jogo {

	public static void main(String[] args) {
		Bloco principal = new Bloco();
		Bloco secundario = new Bloco(1,0);
		principal.setProxBloco(secundario);
		Estrutura movel = new Estrutura();
		movel.setBlocoPrincipal(principal);
		Estrutura fixa = new Estrutura();
		
		Bloco fixa1 = new Bloco(); 
		Bloco fixa2 = new Bloco(3,0);
		fixa.setBlocoPrincipal(fixa1);
		fixa1.setProxBloco(fixa2);
		
		//Setar a altura e largura de forma automática ao adicionar bloco principal
		fixa.setAltura(1);
		fixa.setLargura(3);		
		
		movel.setPosX(1);
		movel.setPosY(1);
		
		System.out.println(movel.existeBlocoAbaixo(fixa));		
	}
}
