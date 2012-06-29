public class GameCharacter {
	private GuitarBehavior guitar;
	private SoloBehavior solo;
	
	private name;
	
	public void GameCharacter(String name) {
	  this.name = name;
	}
	
	public String getName()
	{
	  return this.name;
	}

	public void	playGuitar()
	{
		this.guitar.playGuitar();
	}
	
	public void playSolo()
	{
		this.solo.playSolo();
	}
}