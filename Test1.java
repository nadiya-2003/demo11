import java.util.Vector;
class Test1
{
public static void main(String args[])
{
Vector<String>groceries=new Vector<>();
groceries.add("Wheat");
groceries.add("Flour");
groceries.add("Sugar");
groceries.add("Pulses");
groceries.add("Dal");
groceries.add(2,"Rice");
System.out.println("Vector:"+groceries);

Vector<String>grocery=new Vector<>();
grocery.add("Tamarind");
grocery.addAll(groceries);
System.out.println("New Vector:"+grocery);
}
}