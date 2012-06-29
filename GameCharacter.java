public class GameCharacter {
	protected GuitarBehavior guitar;
	protected SoloBehavior solo;

	
	private String name;
	
	public void GameCharacter(String name) {
	  this.name = name;
	}
	
	public String getName()
	{
	  return this.name;
	}

	public void	playGuitar()
	{
		this.guitar.playGuitar(this.name);
	}
	
	public void playSolo()
	{
		this.solo.playSolo(this.name);
	}
}