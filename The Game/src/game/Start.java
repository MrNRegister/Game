package game;


public class Start{
	public static void main (String[] args){
  	Fireball fb = new Fireball();
    Repair r = new Repair();
    Heal h = new Heal();
    Spellbook sb = new Spellbook();
    
    Player me = new Player(sb);sb.addSpell(fb);
    sb.addSpell(fb);
    sb.addSpell(r);
    sb.addSpell(h);
  }
}