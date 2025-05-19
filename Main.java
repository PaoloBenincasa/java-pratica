package test;

public class Main {

	public static void main(String[] args) {
		// Scanner scanner = new Scanner(System.in);
		
		// System.out.println("inserisci il tuo nome");
		// String nome = scanner.nextLine();
		
		// System.out.println("inserisci il tuo cognome");
		// String cognome = scanner.nextLine();
		
		// System.out.println("quanti anni hai?");
		// int eta = scanner.nextInt();
		// scanner.nextLine();
		
		// System.out.println("dove abiti?");
		// String citta = scanner.nextLine();
		
		// System.out.println("ciao, " + nome + " " + cognome + ", hai " + eta + " anni e abiti a " + citta);

		String day = "Sunday";
		String typeOfDay = switch (day){
			case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "Weekday";
			case "Saturday", "Sunday"-> "Weekend";
			default -> "unknown day";
		};
		System.out.println(typeOfDay);

	}


}