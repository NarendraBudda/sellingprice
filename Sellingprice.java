class Sellingprice {
	public static void main(String[] args) {
		String itemname = "Kaisa Bowl";
		int price = 10;
		int increases = (price*10)/100;
		int selling = price+increases;
		System.out.println("selling item name is "+itemname);
		System.out.println("item selling price is "+selling);
	}
}