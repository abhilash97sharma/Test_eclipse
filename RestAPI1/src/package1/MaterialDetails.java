package package1;

public class MaterialDetails {
   
    @Override
	public String toString() {
		return "MaterialDetails [orderid=" + orderid + ", mer_name=" + mer_name + "]";
	}

	int orderid;
	String mer_name;
	
	public int getOrderid() {
		return orderid;
	}
	
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	
	public String getMer_name() {
		return mer_name;
	}
	
	public void setMer_name(String mer_name) {
		this.mer_name = mer_name;
	}
}
