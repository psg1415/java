package study;

public class Ex {
	public static void main(String[] args) {
		int lineCount = 7;  
		int spaceCount = lineCount/2 +1;
		int starCount = 1;
		
		for(int i = 0; i<lineCount; i++) {
			for(int j = 0; j<spaceCount; j++) {
				System.out.print(' ');
			}
			for(int j=0; j<starCount; j++) {
				System.out.print('*');
			}
			for(int j = 0; j<spaceCount; j++) {
				System.out.print(' ');
			}
			if(i<3) {
				spaceCount-=1;
				starCount+=2;
				System.out.println();
			}else {
				spaceCount+=1;
				starCount-=2;
				System.out.println();
			}
		}
	}
}