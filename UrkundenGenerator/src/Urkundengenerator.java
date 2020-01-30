
public class Urkundengenerator {
	
	private static Urkundengenerator urkundengenerator;
	private Generator generator;
	
	public static void main(String[] args) {
		System.out.println("[main] start");
		urkundengenerator = new Urkundengenerator();
		System.out.println("[main] end");
	}
	
	public Urkundengenerator() {
		System.out.println("[Urkundengenerator-Constructor] start");
		generator = new Generator();
		
		generator.generateUrkunde();
		System.out.println("[Urkundengenerator-Constructor] end");
	}
	
}
