import java.util.Random;

public class TestCompartment {

	public static void main(String[] args) {
		Compartment arr[] = new Compartment[10];
		int number;
		Random ob = new Random();
		
		for(int  i = 0; i < arr.length; i++) {
			number = 1+ob.nextInt(4);
			
			switch(number) {
			
			case 1:
				arr[i] = new FirstClass();
				arr[i].notice();
				break;
				
			case 2:
				arr[i] = new Ladies();
				arr[i].notice();
				break;
				
			case 3:
				arr[i] = new General();
				arr[i].notice();
				break;
				
			case 4:
				arr[i] = new Luggage();
				arr[i].notice();
				break;
			}
		}
		
	}

}
