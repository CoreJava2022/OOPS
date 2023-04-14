abstract class Body implements Life{
	 
public void respiratory(){
System.out.println("Delivers oxygen to the cells in the body");
}
 public void bloodCirculation(){
 System.out.println("Circulates blood in the body");
 }
   public void brainInstruction(){
 System.out.println("Brain gives instruction to the body.");
 }
 
  public void birth(){
		 System.out.println("birth");
	 }
	 public void death(){
		 System.out.println("death");
	 }
	 
	 
  public abstract void walk();
  public abstract void hair();
  public abstract void color();
  public abstract void behaviour();
  public abstract void lifeSpan();
}