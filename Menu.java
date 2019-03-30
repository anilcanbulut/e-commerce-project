import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public abstract class Menu {
	Technology[] tech = new Technology[100];
	Sports[] sport = new Sports[100];
	public String category;
	public String name;
	public String price;
	int countofTechnology = 0;
	int countofSports = 0;
	int choose;	
	String product;
	int counter2;
	
	abstract String Discount_Message();

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
}


