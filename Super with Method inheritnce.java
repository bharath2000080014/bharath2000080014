class person 
{
 void message()
 {
   System.out.println("this is person class");
 }
}
class student extends person
{
 void message()
 {
   System.out.println("this is student class");
 }
 void display()
 {
    message();
    super.message();
 }
}
class Main
{
 public static void main(String args[])
 {
  student s=new student();
  person p=new person();
  p.message();
  s.display();
  s.message();
 }
}
