package xiangyuan;

import java.util.HashMap;

public class PieceFactory {
	private HashMap piecetool = new HashMap();
	public APiece getPiece(String key) {
		if(!piecetool.containsKey(key)) {
			APiece ap = new CPiece(key);
			piecetool.put(key, ap);
			return ap;
		}
		else return (APiece)piecetool.get(key);
	}
	
	public int getCount() {
		return piecetool.size();
	}
}
