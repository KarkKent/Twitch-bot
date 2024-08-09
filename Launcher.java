import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I'm future");
		Scanner input = new Scanner(System.in);
		String commandLine=input.next();
		switch(commandLine) {
		case "!pc":
			System.out.println("My pc configuration");
			break;
		default:
			System.out.println("There is no such command");
			break;
		}

		
	}

}
