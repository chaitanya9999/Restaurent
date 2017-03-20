package menu;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Menu {
	
	private List<Item> items;
	private Date startTime;
	private Date endTime;
	
	public Menu(){
		items = new ArrayList<Item>();

	}
	public void setItems(List<Item> items){
		this.items = items;
	}
	
	public List<Item> getItems(){
		return this.items;
	}
	
	public void setStartTime(Date startTime){
		this.startTime = startTime;
	}
	
	public Date getStartTime(){
		return this.startTime;
	}
	
	public void setEndTime(Date endTime){
		this.endTime = endTime;
	}
	
	public Date getEndTime(){
		return this.endTime;
	}
	
	public void addItem(Item item){
		this.items.add(item);
	}
	
	public void removeItem(Item item){
		this.items.remove(item);
	}
	
   
 

}