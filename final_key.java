final class final_key
{
void show()
{
System.out.println("This class cannot be extended furthur");
}
}
class flower
{
public static void main(String args[])
{
final_key f=new final_key();
f.show();
}
}