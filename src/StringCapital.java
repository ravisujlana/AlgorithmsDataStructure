
public class StringCapital {
	
	public static void main(String args[]) {
		
		String str = "john doe";
		String[] std = str.split(" ");
		StringBuffer strBuf = new StringBuffer("");
		for(String s: std) {
			s = s.substring(0,1).toUpperCase() +s.substring(1,s.length());
			strBuf.append(s).append(" ");
		}
		System.out.println(strBuf.toString());
	}

}
