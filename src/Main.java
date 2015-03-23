import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.math.BigDecimal;



/**
 * @author okomski
 * Przedstawiony problem mo¿na rozwi¹zaæ przy u¿yciu funkcji poni¿ej oraz  bez utworzenia obiektu transaction-
 *  line.split("@amount:|PLN);    
 * Takie rozwi¹zanie mo¿e i jest ³atwiejsze w implementacji ale tracimy wszystkie korzyœci id¹ce z OOP oraz np. sprawdzenie odbiorcy.
 */
public class Main {
	public static void main(String[] args){
		String line;
		String path;
		Scanner scan = null;
		BigDecimal result  = new BigDecimal("0.0");
		BigDecimal resultKowalski  = new BigDecimal("0.0");
		ArrayList<Transfer> transferList = new ArrayList<Transfer>();

		if(args.length == 0)
		{   
			System.out.print("Wprowadz sciezke pliku");
			Scanner scanner = new Scanner(System.in);
			path = scanner.next();
			scanner.close();
		}else
			path = args[0];

		try {
			File file = new File(path);
			scan = new Scanner(file);			
			while(scan.hasNext()){
				line = scan.nextLine();
				if(!line.isEmpty()){
					transferList.add(new Transfer(line));
				}
			}
			scan.close();
		} catch (Exception e) {
			System.out.println("Brak pliku");
		}

		for(Transfer t: transferList){		
			if(t.getCurrency().equals("PLN")){ //Gdyby w pliku by³a obca waluta
				result = result.add(t.getAmount());
				if(t.getName().equals("Jan") && t.getSurname().equals("Kowalski") )//przyk³ad przydatnoœci obiektu
					resultKowalski = resultKowalski.add(t.getAmount());
			}


		}

		System.out.println("Suma wszystkich transakcji u¿ytkowników z pliku to " + result.toString() + "PLN");	
		System.out.println("W tym suma transkacji Kowalskiego to " + resultKowalski.toString() + "PLN");	

	}

}
