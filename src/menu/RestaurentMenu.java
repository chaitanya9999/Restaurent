package menu;

import java.util.ArrayList;
import java.util.Date;

import menu.Item;
import menu.Menu;
import menu.Restaurent;

public class RestaurentMenu {

	public static void main(String[] args) {

		Restaurent details = new Restaurent("Indian Delicious", 5106747629L, "indiandelicious@gmail.com",
				"wwww.indiandeliciousrestaurant.com", "40640 High Street,Fremont,CA,94538");
		MenuDAO menu = new MenuDAO();
		menu.connect();;
		ArrayList<Item> items = new ArrayList<Item>();


		Item item1 = new Item("Gobi Manchuria", 10.0, "Starter", "Veg");
		Item item2 = new Item("Chicken Wings", 12.0, "Starter", "Non-veg");
		Item item3 = new Item("idly", 13.0, "tiffen", "veg");
		Item item4 = new Item("dosa", 15.0, "tiffen", "veg");
		Item item5 = new Item("poori", 1.0, "tiffen", "veg");
		Item item6 = new Item("veg-biryani", 15, "rice", "veg");
		Item item7 = new Item("non-biryani", 25, "rice", "nonveg");
		Item item8 = new Item("egg-biryani", 15, "rice", "veg");

		Menu breakfast = new Menu();
		Menu lunch = new Menu();
		Menu dinner = new Menu();
		breakfast.addItem(item3);
		breakfast.addItem(item4);
		breakfast.addItem(item5);
		breakfast.setStartTime(new Date());
		breakfast.setEndTime(new Date());
		lunch.addItem(item6);
		lunch.addItem(item7);
		lunch.addItem(item8);
		lunch.addItem(item1);
		lunch.addItem(item2);
		lunch.setStartTime(new Date());
		dinner.addItem(item6);
		dinner.addItem(item7);
		dinner.addItem(item8);

		items.addAll(breakfast.getItems());
		items.addAll(lunch.getItems());

		// System.out.println("Restaurant Name:"+ details.getName() +"\n"
		// +"Address:"+ details.getAddress() + "\n"+"Phone Number:"+
		// +details.getPhoneNumberL() +"\n"+"Email:" +details.getEmail() +"\n"
		// +"Website Name:"+ details.getWebSiteName());
		// System.out.println("***************");

		// System.out.println("Starters:");

		for (Item item11 : items) {
			if (item11.getCategory() == "Starter") {
				// System.out.println(item11.getName());
			}
		}

		// System.out.println("Rice:");

		for (Item item12 : items) {
			if (item12.getCategory() == "rice") {

				// System.out.println(item12.getName());
			}
		}
	}
}