class sum
{
    static int add(int a,int b)
    {
        return a+b;
    }
    static double add(double a,double b)
    {
        return a+b;
    }
}
class Main
{
    public static void main(String[]args)
    {
        System.out.println(sum.add(17,13));
        System.out.println(sum.add(10.4,10));
    }
}
