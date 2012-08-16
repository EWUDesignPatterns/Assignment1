public class GameCharacter {
  
	protected GuitarBehavior guitar;
	protected SoloBehavior solo;
	private String name;
	
	public GameCharacter(String name) {
	  this.name = name;
	}

	public void	playGuitar()
	{
		this.guitar.playGuitar(this.name);
	}
	
	public void playSolo()
	{
		this.solo.playSolo(this.name);
	}


	public String getName()
	{
	  return this.name;
	}
	
	public void setGuitar(GuitarBehavior gb) {
	  this.guitar = gb;
	}
	
	public void setSolo(SoloBehavior sb) {
	  this.solo = sb;
	}
}
