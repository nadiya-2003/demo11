
import java.util.Vector;
public class VectorExample2
{
public static void main(String args[])
{
Vector<Integer>in=new Vector<>();
in.add(100);
in.add(200);
in.add(300);
in.add(400);
in.add(500);
in.add(600);
in.add(700);
System.out.println("Values in vector:"+in);
System.out.println("Remove first occurance of element 200:"+in.remove((Integer)200));
System.out.println("Values in vector:"+in);
System.out.println("Remove element at index 4:"+in.remove(4));
System.out.println("New Value list in Vector:"+in);
in.removeElementAt(4);
System.out.println("Vector element after removal:"+in);
System.out.println("Hash code of this vector="+in.hashCode());
System.out.println("Element at index 1 is="+in.get(1));
}
}