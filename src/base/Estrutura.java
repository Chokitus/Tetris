package base;

public class Estrutura {
	private int largura;
	private int altura;
	private int posX;
	private int posY;
	private Bloco blocoPrincipal;
	
	public Estrutura() {
		this.setPosX(0);
		this.setPosY(0);
	}
	
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public Bloco getBlocoPrincipal() {
		return blocoPrincipal;
	}
	public void setBlocoPrincipal(Bloco blocoPrincipal) {
		this.blocoPrincipal = blocoPrincipal;
	}
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	public int getLargura() {
		return largura;
	}
	public void setLargura(int largura) {
		this.largura = largura;
	}
	public void andaX(int x) {
		setPosX(getPosX() + x);
	}
	public void andaY(int y) {
		setPosX(getPosY() + y);
	}
	public Bloco getBlocoPorPosicao(int x, int y, Bloco blocoEstrutura) {
		while(blocoEstrutura != null) {
			if((blocoEstrutura.getPosY() == y) && (blocoEstrutura.getPosX() == x)) break;
			blocoEstrutura = blocoEstrutura.getProxBloco();
		}
		return blocoEstrutura;
	}
	public boolean existeBlocoAbaixo(Estrutura fixa) {
		Bloco blocoEstrutura = getBlocoPrincipal();
		if((fixa.getAltura() < this.getPosY()-1) || (fixa.getLargura() < this.getPosX())){
			return false;
		}
		int posAbsolutaX = 0;
		int posAbsolutaY = 0;
		while(blocoEstrutura != null) {
			posAbsolutaX = this.getPosX() + blocoEstrutura.getPosX();
			posAbsolutaY = this.getPosY() + blocoEstrutura.getPosY();
			if(fixa.getBlocoPorPosicao(posAbsolutaX, posAbsolutaY - 1, fixa.getBlocoPrincipal()) != null) {
				return true;
			}
			blocoEstrutura = blocoEstrutura.getProxBloco();
		}
		return false;
	}	
}
