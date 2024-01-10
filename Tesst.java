class Person
{
public void move()
{
System.out.println("I'm a Person");
}
}

class Faculty extends Person
{
public void move()
{
System.out.println("I'm a Faculty");
}
}

class Student extends Faculty
{
public void move()
{
System.out.println("I'm a Student");
}
}



class Tesst
{
public static void main(String args[])
{
Person a=new Person();
Person b=new Faculty();
Person c=new Student();

a.move();
b.move();
c.move();
}
}