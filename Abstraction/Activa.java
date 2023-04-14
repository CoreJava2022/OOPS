class Scooter{
	public void scooterInfo(){
		System.out.println("Blue In color");
	}
		
	}
	
 class Engine {
	public void start(){
		System.out.println("Engine Started:");
	}
	public void stop(){
		System.out.println("Engine Stopped:");
	}
}

public class Activa extends Scooter {
	public static void main(String[] args) {		
		Activa myScooter = new Activa();
		Engine scooterEngine = new Engine();
		scooterEngine.start();	
		scooterEngine.stop();
         myScooter.scooterInfo();
	}
}