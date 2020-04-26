package xiangyuan;
//享元模式
import java.util.Random;

public class PieceClient {
	public static void main(String args[]) {
		PieceFactory pf = new PieceFactory();
		Random rd = new Random();
		for(int i=0;i<19;i++) {
			for(int j=0;j<19;j++) {
				APiece api;
				if(rd.nextInt()%2==0) 
					api = pf.getPiece("黑棋");
				else 
					api = pf.getPiece("白棋");
				api.play(rd.nextInt(19), rd.nextInt(19));
			}
		}
		System.out.println("总共棋子个数为:"+pf.getCount());
	}
}
