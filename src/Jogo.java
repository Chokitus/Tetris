import base.*;

public class Jogo {

	public static void main(String[] args) {
		Estrutura movel = new Estrutura(0,1);
		Estrutura fixa = new Estrutura();

		Bloco[][] blocos = new Bloco[5][5];
		
		blocos[2][2] = new Bloco("X");
		blocos[2][3] = new Bloco("X");
		blocos[3][3] = new Bloco("X");
		blocos[2][1] = new Bloco("X");

		movel.setBlocos(blocos);
		String str = "";
		for (int i = 4; i >= 0; i--){
			for (int j = 0; j < 5; j++){
				if(blocos[j][i] == null){
					str = str + " ";
				}
				else{
					str = str + blocos[j][i];
				}				
			}						
			System.out.println(str);
			str = "";
		}
		movel.rotacionar();
		blocos = movel.getBlocos();
		for (int i = 4; i >= 0; i--){
			for (int j = 0; j < 5; j++){
				if(blocos[j][i] == null){
					str = str + " ";
				}
				else{
					str = str + blocos[j][i];
				}				
			}						
			System.out.println(str);
			str = "";
		}
		movel.rotacionar();
		blocos = movel.getBlocos();
		for (int i = 4; i >= 0; i--){
			for (int j = 0; j < 5; j++){
				if(blocos[j][i] == null){
					str = str + " ";
				}
				else{
					str = str + blocos[j][i];
				}				
			}						
			System.out.println(str);
			str = "";
		}
		movel.rotacionar();
		blocos = movel.getBlocos();
		for (int i = 4; i >= 0; i--){
			for (int j = 0; j < 5; j++){
				if(blocos[j][i] == null){
					str = str + " ";
				}
				else{
					str = str + blocos[j][i];
				}				
			}						
			System.out.println(str);
			str = "";
		}
	}
}
