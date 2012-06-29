public class GameCharacter {
	private GuitarBehavior guitar;
	private SoloBehavior solo;

	
	public void	playGuitar()
	{
		this.guitar.playGuitar();
	}
	
	public void playSolo()
	{
		this.solo.playSolo();
	}
}