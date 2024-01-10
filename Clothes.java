import java.util.Vector;
class Clothes
{
public static void main(String args[])
{
Vector<String>types=new Vector<>();
types.add("chudidhar");
types.add("pijama");
types.add("Saree ");
types.add("Jumpsuit");
types.add("Kurta");
types.add("Palazzo ");
types.add("Anarcali");
types.add("frock");
System.out.println(" Vector:"+types);

Vector<String>type=new Vector<>();
type.add(" Long frock");
type.addAll(types);
System.out.println(" New Vectors:"+type);
}
}