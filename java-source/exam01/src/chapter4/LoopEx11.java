package chapter4;

public class LoopEx11 {
	public static void main(String[]args) {
		int i=1;
		parent : while(i<=9) {
			int j=1;
			while(j <=9) {
				System.out.println(i+"X"+j+"="+(i*j));
				if(i>=5) {
					break parent;
				}
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
