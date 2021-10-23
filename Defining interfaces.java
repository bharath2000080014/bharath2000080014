interface FirstInterface
{
    int addMethod (int x, int y);
    float divMethod (int m, int n);
    void display();
    int VAR1=10;
    float VAR2 = 20.65f;
}
class MyClass implements FirstInterface
{
    public int addMethod(int a, int b)
    {
        return(a+b);
    }
    public float divMethod(int i,int j)
    {
        return(i/j);
    }
    public void display(){
        System.out.println("Variable 1 :"+VAR1);
        System.out.println("Variable 2 :"+VAR2);
    }
}
class Main
{
    public static void main(String []args){
        MyClass obj=new MyClass();
        System.out.println(obj.addMethod(2,3));
        System.out.println(obj.addMethod(2,3));
        obj.display();
    }
}
