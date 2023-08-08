package cap15;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class CreateTextFile {

	private static Formatter output;
	
	public static void main(String[] args) {
		
		openFile();
		addRecords();
		closeFile();

	}
	
	public static void openFile() {
		try {
			output = new Formatter("clients.txt");
		}
		catch(SecurityException e){
			System.err.println("Write permission denied");
			System.exit(1);
		}
		catch(FileNotFoundException e) {
			System.err.println("Error opening file. Try again.");
			System.exit(1);
		}
	}
	
	public static void addRecords() {
		Scanner input = new Scanner(System.in);
		System.out.printf("%s%n%s%n? ",
				"Enter account number, first name, last name and balance.",
				"Enter end-of-file indicator to end input.");
		
		while(input.hasNext()) {
			output.format("%d %s %s %.2f%n", input.nextInt(),
					input.next(), input.next(), input.nextDouble());
		}
		System.out.print("? ");
	}
	
	public static void closeFile() {
		if(output != null) output.close();
	}

}
