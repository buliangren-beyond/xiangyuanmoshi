package xiangyuan;

public abstract class APiece {
	protected String ink;
	public APiece(String ink) {
		this.ink = ink;
	}
	
	public abstract void play(int x,int y);
}
