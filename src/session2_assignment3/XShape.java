package session2_assignment3;

public class XShape{
	public static void main(String[] args) {
		int x=5;
		char[] chars = new char[x];
		for (int i = 0; i < x; i++) {
			chars[i] = 'x';
			chars[x - 1 - i] = 'x';
			for (int j = 0; j < x; j++) {				
				if (j == i || j == (x - 1 - i)){					
					continue;
				}
				chars[j] = ' ';
			}
			System.out.println(new String(chars));
		}
	}
}


