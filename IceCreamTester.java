class IceCreamTester{
   public static void main(String[] args) {
   	IceCream.addIceCream("Black Current");
   	IceCream.addIceCream("Chocolate");
   	IceCream.addIceCream("Vanilla");
   	IceCream.addIceCream("Mint Chocolate Chip");
   	IceCream.addIceCream("Strawberry");
   	IceCream.addIceCream("Double Chocolate");
   	IceCream.addIceCream("Pista");
   	IceCream.addIceCream("Mango");
   	IceCream.addIceCream("Kulfi");
      IceCream.addIceCream("Badam");
   	System.out.println("Array after adding elements");
      IceCream.getIceCream();
      IceCream.updateIcecreamNames("Kulfi","Cone ice cream");
      System.out.println("Array after updating elements");
      IceCream.getIceCream();
      System.out.println("Array after deleting elements");
      IceCream.deleteIceCream("Vanilla");
      IceCream.deleteIceCream("Badam");
      IceCream.getIceCream();


   }
}