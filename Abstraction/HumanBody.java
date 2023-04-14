
public class HumanBody extends Body {
	
	
	 public void walk(){
		 System.out.println("Human is walking");
	 }
	 public void hair(){
		 System.out.println("A Human has hair on his head ");
	 }
	 public void color(){
		 System.out.println("human has different different color");
	 }
	 public void behaviour(){
		 System.out.println("human behavior can be classified into four basic personality types: Optimistic, Pessimistic, Trusting and Envious");
	 }
	  public void lifeSpan(){
		 System.out.println("Life span of human is 100 years");
	 }
	
	 
	public static void main(String args[]){
		System.out.println("****Common funcnality of Body are as follows****");
		HumanBody humanBody = new HumanBody();
		humanBody.birth();
		
		humanBody.respiratory();
		humanBody.bloodCirculation();
		humanBody.brainInstruction();
		
		System.out.println("****Human Funcnality****");
		humanBody.walk();
		humanBody.hair();
		humanBody.color();
		humanBody.behaviour();
		humanBody.lifeSpan();
		
		humanBody.death();
		
		
		
	}
	
}
