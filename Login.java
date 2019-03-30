import java.util.Scanner;
import java.io.*;


public class Login {
	static User[] user = new User[100];
	int obj_count = 0;
	int countOfUser = 0;
	

	
	public void login_page() throws IOException{ 
		System.out.println("-------------------------");
		System.out.println("Enter username and password: ");
		Scanner in = new Scanner(System.in);
		System.out.print("username: ");
		String username = in.nextLine();
		
		Scanner in1 = new Scanner(System.in);
		System.out.print("password: ");
		String password = in1.nextLine();
		
		
		FileReader fr = new FileReader("User_Info.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String str;
		int count = 0;
		
		//System.out.println(user[0].getUsername());
		
		
		
		while((str = br.readLine()) != null) {
			countOfUser++; 
		}
		fill();
		for(int i = 0; i<2; i++) {
			if(user[i].getUsername().contentEquals(username)) {
				System.out.println("You already signed up...");
				count = 1;
			}
			countOfUser++;
		}
		
		if(count == 0) {
				System.out.println("You need to sign up!\t Fill the form below...");
				
				Scanner in2 = new Scanner(System.in);
				System.out.print("username: ");
				String usrname = in2.nextLine();
				
				Scanner in3 = new Scanner(System.in);
				System.out.print("password: ");
				String passwrd = in3.nextLine();
				
				Scanner in4 = new Scanner(System.in);
				System.out.print("email: ");
				String email = in4.nextLine();
				
				user[obj_count] = new User(username, email, 10, passwrd);
				
				FileWriter fw = new FileWriter("User_Info.txt", true);
				PrintWriter pw = new PrintWriter(fw);
				
				pw.println(usrname);
				pw.println(passwrd);
				pw.println(email);
				
				pw.close();	
				System.out.println("\nYou need to login again...");
				
				Scanner in5= new Scanner(System.in);
				System.out.print("username: ");
				String username_new = in5.nextLine();
				
				Scanner in6 = new Scanner(System.in);
				System.out.print("password: ");
				String password_new = in6.nextLine();
			
				obj_count += 1;	
		} 
		
	}
	public User getUser(int i){
		return user[i];
	}
	
	void fill() throws IOException {
		
		String string;
		FileReader fr = new FileReader("User_Info.txt");
		BufferedReader br = new BufferedReader(fr);

			for(int k = 0;k<countOfUser/3;k++) {
				user[k]=new User();
				user[k].set_Coin(1000);

					for(int j =1;j<=3;j++) {
						string = br.readLine();
						if(j%3==1) {
							user[k].setUsername(string);
						}
						else if(j%3==2) {
							user[k].setPassword(string);

						}
						else if(j%3==0) {
							user[k].setE_mail(string);

						}
						

					}
				}
	}
	
}
				
				
			
		

