import java.util.Scanner;
import java.io.*;


public class Shopping {	
	static Technology[] tech = new Technology[100];
	static Sports[] sport = new Sports[100];
	static int countofTechnology = 0;
	static int countofSports = 0;
	static int choose;	
	static String product;
	static int counter2;
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		
		Login login = new Login();
		
		String[] arr = new String[3];
		login.login_page();
		login.fill();
		
		System.out.print("\t\t\t-----------------------------------------");
		System.out.println("\n\t\t\t\tWelcome to E-Commerce Website!!!");
		System.out.print("\t\t\t-----------------------------------------\n");
		System.out.print("\n0) Technology \t1) Sports");
		System.out.println("\nWhich category you want?");
		System.out.println("category ->");
		Scanner in = new Scanner(System.in);
		choose = in.nextInt();
		
		Scanner in2 = new Scanner(System.in);
		
		
		FileReader fr = new FileReader("Technology.txt");
		BufferedReader br = new BufferedReader(fr);
		String str;
		while(!(str = br.readLine()).contentEquals("")) {
			countofTechnology++; 
		}

		FileReader fr2 = new FileReader("Sports.txt");
		BufferedReader br2 = new BufferedReader(fr2);
		while((str = br2.readLine()) != null) {
			countofSports++; 
		}
		
		if (choose == 0) {
			fillTech();
			System.out.println(tech[0].Discount_Message());
			System.out.print("\nEnter the name of the product: ");
			product = in2.nextLine();
			for(int i = 0; i < countofTechnology/2;i++) {
				if(tech[i].getName().contentEquals(product)) {
					System.out.println("Found It.");
					System.out.println("It's "+tech[i].getPrice()+" $");
					
					System.out.println("To Buy: 1 \t\t Cancel: 0");
					Scanner scan2 = new Scanner(System.in);
					int choosen = scan2.nextInt();
					if(choosen == 1) {
						if(Login.user[i].get_Coin() < Integer.parseInt(tech[i].getPrice())) {
							System.out.println("You don't have enough money!");
						}else {
							Login.user[i].set_Coin(Login.user[i].get_Coin() - Integer.valueOf(tech[i].getPrice()));
							System.out.println("Payment successfully completed...");
						}	
						
					} else {
						System.out.println("Cancelled Successfully...");
					}
				}
			}


		

		}else if (choose == 1) {
			fillSport();
			System.out.println(sport[0].Discount_Message());
			System.out.print("\nEnter the name of the product: ");
			product = in2.nextLine();
			for(int i = 0; i < countofSports/2;i++) {
				if(sport[i].getName().contentEquals(product)) {
					System.out.println("Found It.");
					System.out.println("It's "+sport[i].getPrice()+" $");
					
					System.out.println("To Buy: 1 \t\t Cancel: 0");
					Scanner scan3 = new Scanner(System.in);
					int choosen = scan3.nextInt();
					if(choosen == 1) {
						if(Login.user[i].get_Coin() < Integer.parseInt(sport[i].getPrice())) {
							System.out.println("You don't have enough money!");
						}else {
							Login.user[i].set_Coin(Login.user[i].get_Coin() - Integer.valueOf(sport[i].getPrice()));
							System.out.println("Payment successfully completed...");
						}	
						
					} else {
						System.out.println("Cancelled Successfully...");
					}
				}
			}
			

		}
		

		
		
	}
	static void fillTech() throws IOException {
		String string;
		FileReader fr = new FileReader("Technology.txt");
		BufferedReader br = new BufferedReader(fr);
		
		for(int k = 0; k<countofSports/2; k++) {
			tech[k] = new Technology();
			for(int j = 1; j<=2; j++) {
				string = br.readLine();
				if(j%2==1) {
					tech[k].setName(string);
				}else if(j%2==0) {
					tech[k].setPrice(string);

				}
						
			}
		}
	}

static void fillSport() throws IOException {
		
		String string;
		
		FileReader fr = new FileReader("Sports.txt");
		BufferedReader br = new BufferedReader(fr);

		for(int k = 0; k<(countofSports/2); k++) {
			sport[k]=new Sports();
			for(int j =1; j<=2; j++) {
				string = br.readLine();
				
				if(j%2==1) {
					sport[k].setName(string);
					
				}else if(j%2==0) {
					sport[k].setPrice(string);
				}
			}	
		} 
}
		
}
		
		
		
		
	


