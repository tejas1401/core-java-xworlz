class IceCream{
static String icecream[]={null,null,null,null,null,null,null,null,null,null};
static int index;
public static void getIceCream(){
  String reference="";
   for(int i=0;i<icecream.length;i++){
     reference= icecream[i];
    System.out.println(reference+" At position "+i);
   }
}
public static void addIceCream(String ice){
if(ice!=null){
	icecream[index++]=ice;
}
else System.out.println("Cannot add chai, as it is already null");
}
public static void updateIcecreamNames(String oldname, String newname ){
  for(int i =0; i<icecream.length;i++){
    if(icecream[i]==oldname){
      icecream[i]=newname;
      System.out.println("Updated "+oldname+" to "+newname+" at index "+i);
    }
  }
}
public static void deleteIceCream(String deleteName){
  int i;
  for(i=0;i<icecream.length;i++){
    if(icecream[i]==deleteName){
      break;
    }
  }
  int j;
  for(j=i;j<icecream.length-1;j++){
    icecream[j]=icecream[j+1];
  }
  icecream[j]=null;
--index;
  
System.out.println("The new number of elements is"+index);
}
}
