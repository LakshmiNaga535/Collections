

public class Item {
	
	private int ItemId;
	private String ItemName;
	private float ItemPrice;
	public Item() {
		// TODO Auto-generated constructor stub
	}
	public Item(int itemId, String itemName, float itemPrice) {
		super();
		ItemId = itemId;
		ItemName = itemName;
		ItemPrice = itemPrice;
	}
	public int getItemId() {
		return ItemId;
	}
	public void setItemId(int itemId) {
		ItemId = itemId;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public float getItemPrice() {
		return ItemPrice;
	}
	public void setItemPrice(float itemPrice) {
		ItemPrice = itemPrice;
	}
	
	
}
