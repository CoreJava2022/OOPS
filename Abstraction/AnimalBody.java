public class AnimalBody extends Body{
	 public void walk(){
		 System.out.println("Animal is walking");
	 }
	 public void hair(){
		 System.out.println("A Animal has hair on his whole Body");
	 }
	 public void color(){
		 System.out.println("Animal has different different color");
	 }
	 public void behaviour(){
		 System.out.println("Instinct, imprinting, conditioning, and imitation are the four types of animal behavior.");
	 }
	  public void lifeSpan(){
		 System.out.println("Life span of human is 100 years");
	 }
	public static void main(String args[]){
		System.out.println("****Common funcnality of Body are as follows****");
		AnimalBody animalBody = new AnimalBody();
		animalBody.respiratory();
		animalBody.bloodCirculation();
		animalBody.brainInstruction();
		
		System.out.println("****Human Funcnality****");
		animalBody.walk();
		animalBody.hair();
		animalBody.color();
		animalBody.behaviour();
		animalBody.lifeSpan();
		
	}
	
}