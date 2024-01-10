import java.util.Vector;
class V
{
public static void main(String args[])
{
Vector<String>vegetables=new Vector<>();
vegetables.add("Brinjal");
vegetables.add("Drumstick");
vegetables.add("Lady's Finger");
vegetables.add("Beetroot");
vegetables.add("Pumpkin");
vegetables.add("Bottle guard");
vegetables.add("Tomato");
vegetables.add("Carrot");
System.out.println(" New Vector Vegetables:"+ vegetables);

Vector<String>veg=new Vector<>();
veg.add("Bitter Guard");
veg.addAll(vegetables);
System.out.println(" New Vectors:"+veg);
}
}