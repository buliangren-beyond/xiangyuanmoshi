package xiangyuan;

public class CPiece extends APiece {
	public CPiece(String ink) {
		super(ink);
	}

	public void play(int x, int y) {
		System.out.println("��"+ink+"����("+x+","+y+")��λ����");
	}
}
