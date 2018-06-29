package base;

public class Bloco {
	private int posX;
	private int posY;
	private Bloco proxBloco = null;
	public Bloco() {
		this(0,0);
	}
	
	public Bloco(int x, int y) {
		setPosY(y);
		setPosX(x);		
	}
	
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public Bloco getProxBloco() {
		return proxBloco;
	}
	public void setProxBloco(Bloco proxBloco) {
		this.proxBloco = proxBloco;
	}
}
