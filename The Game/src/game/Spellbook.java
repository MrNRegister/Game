package game;

import java.util.*;
public class Spellbook{
	private ArrayList<Spell> spells = new ArrayList();
  
  public void addSpell(Spell s){
  	spells.add(s);
  }
  
  public ArrayList<Spell> getSpells(){//It's a behavior that returns all the spells in the spell book.
  	return spells;
  }
}