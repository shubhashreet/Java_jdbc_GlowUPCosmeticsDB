package shubha_cosmetic;

public class cosmetic {
	private String name;

    private String brand;

    private int quan;

    private int price;

    private String id;

    public cosmetic() {

   

    }

    public cosmetic(String name,String id) {

    this.name=name;

    this .id=id;

    }

    public cosmetic(String name,String brand, int quan,int price) {

    this.name=name;

    this.brand = brand;

    this.quan= quan;

    this.price=price;

}

    public void setname(String name) {

    this.name=name;

    }

    public String getname() {

    return this.name;

    }

    public void setbrand(String brand) {

    this.brand=brand;

    }

    public String getbrand() {

    return this.brand;

    }

    public void setquan(int quan) {

    this.quan=quan;

    }

    public int getquan() {

     return this.quan;

    }

    public void setprice(int price) {

    this.price=price;

    }

    public int getprice() {

    return this.price;

    }

    public void setid(String id) {

    this.id=id;

    }

    public String getid() {

    return this.id;

    }

	@Override

	public String toString() {

		return "cosmetic [name=" + name + ", brand=" + brand + ", quan=" + quan + ", price=" + price + ", id=" + id

				+ "]";

	}





}

