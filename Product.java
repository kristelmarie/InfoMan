public class Product {
    private String Product_ID;
    private String Product_Name;
    private int Product_Price;
    private String Order_Size;
    private int Order_Quantity;
    private int TotalAmount;

    // Constructor
    public Product(String Product_ID, String Product_Name, int Product_Price, String Order_Size, int Order_Quantity) {
        this.Product_ID = Product_ID;
        this.Product_Name = Product_Name;
        this.Product_Price = Product_Price;
        this.Order_Size = Order_Size;
        this.Order_Quantity = Order_Quantity;
        this.TotalAmount = Product_Price * Order_Quantity;
    }

	public String getProduct_ID() {
		return Product_ID;
	}

	public void setProduct_ID(String product_ID) {
		Product_ID = product_ID;
	}

	public String getProduct_Name() {
		return Product_Name;
	}

	public void setProduct_Name(String product_Name) {
		Product_Name = product_Name;
	}

	public int getProduct_Price() {
		return Product_Price;
	}

	public void setProduct_Price(int product_Price) {
		Product_Price = product_Price;
	}

	public String getOrder_Size() {
		return Order_Size;
	}

	public void setOrder_Size(String order_Size) {
		Order_Size = order_Size;
	}

	public int getOrder_Quantity() {
		return Order_Quantity;
	}

	public void setOrder_Quantity(int order_Quantity) {
		Order_Quantity = order_Quantity;
	}

	public int getTotalAmount() {
		return TotalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		TotalAmount = totalAmount;
	}
    
    
    

//    // Getters
//    public String getId() {
//        return Product_ID;
//    }
//
//    public String getName() {
//        return Product_Name;
//    }
//
//    public int getPrice() {
//        return Product_Price;
//    }
//
//    public String getSize() {
//        return Order_Size;
//    }
//
//    public int getQuantity() {
//        return Order_Quantity;
//    }
//
//    public int getTotalAmount() {
//        return TotalAmount;
//    }
//}
}