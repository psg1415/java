package chapter9_3;

public class PlayerTest {
	public static void main(String[]args) {
		Player player = new Player(); //초보자 레벨
		player.play(2);
		System.out.println();
		
		player.upgradeLevel(new AdvancedLevel());
		player.play(3);
		System.out.println();
		
		player.upgradeLevel(new SuperLevel());
		player.play(1);
		System.out.println();
	}
}
