package menu;
import java.util.ArrayList;
import java.util.List;

import menu.Item;
import menu.Menu;
import menu.Restaurent;
public class RestaurentMenu {
public static void main(String[] args) {
	
		Restaurent details = new Restaurent("Indian Delicious", 5106747629L, "indiandelicious@gmail.com",
				"wwww.indiandeliciousrestaurant.com", "40640 High Street,Fremont,CA,94538");
		ItemDAO getitem =new ItemDAO();
		
		ArrayList<Item> items = getitem.returnitems();
		
		Menu breakfast = new Menu();
		Menu lunch = new Menu();
		Menu dinner = new Menu();
		
		for(Item item: items){
			if (item.getCategory().equals("tiffen")) {
				breakfast.addItem(item);
				}
				 else if (item.getCategory() == "starter"){
					 lunch.addItem(item);	 
				 }
				 	else  {
				 }
		}
	List<Item> items2 = breakfast.getItems();
	breakfast.getItems();
	for(Item item2: items2){
			
			System.out.println(item2.getName());
			}
		}
	}