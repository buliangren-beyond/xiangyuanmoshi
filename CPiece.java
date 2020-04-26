package xiangyuan;

public class CPiece extends APiece {
	public CPiece(String ink) {
		super(ink);
	}

	public void play(int x, int y) {
		System.out.println("将"+ink+"放在("+x+","+y+")的位置上");
	}
}
