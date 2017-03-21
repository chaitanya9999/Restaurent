package menu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class MenuDAO {
	

	
	public ArrayList<Item> connect() {

		Connection con = null;
		ArrayList<Item> items = new ArrayList<Item>();
		

		try {
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurent", "root", "chaitu@369");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from breakfast");
		    
			
			
			while (rs.next())
				
				Item item = new Item();
				item.setName(rs.getString("name"));
				item.setPrice(rs.getDouble("price"));
				item.setCategory(rs.getString("category"));
				item.setType(rs.getString("type"));
				items.add(item);
				return items;
				con.close();
	

		} catch (Exception e) {
			System.out.println("Exception at Connect(): " +e);
	}
		return items;
	}
  
}