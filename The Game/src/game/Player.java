package game;

public class Player extends Creature {//the player has a spell book
	private Spellbook sb;//
  
  public Player (Spellbook sb){ // constructure this is creating a player, in order to create a player you need to pass it details of a spellbook //
  this.sb = sb;
  }
  
  public Spellbook readSpellBook(){//a behaviour, it sends a spellbook back
  return sb;
  }
  
}