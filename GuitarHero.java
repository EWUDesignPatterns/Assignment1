public class GuitarHero {
	public static void main(String[] args) {
		
		GameCharacter player1 = new GameCharacterSlash();
    GameCharacter player2 = new GameCharacterHendrix();
    player1.playGuitar();
    player2.playGuitar();
    player1.playSolo();
    player2.playSolo();
	}
}