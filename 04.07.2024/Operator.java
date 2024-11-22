public class Operator
{
public static void main(String args[])
{
int a =10,b=20,c=40;
String valueA="a:";
System.out.println(valueA+(a));
String valueB="b:";
System.out.println(valueB+(b));
String valueC="c:";
System.out.println(valueC+(c));
String add="a+b:";
System.out.println(add+(a+b));
String sub="a-b+c:";
System.out.println(sub+(a-b+c));
String mul="a*b*c:";
System.out.println(mul+(a*b*c));
String div="a/b:";
System.out.println(div+(a/b));
String mod="a%b:";
System.out.println(mod+(a%b));
a+=50;
String plusAssign="a+=50:";
System.out.println(plusAssign+(a));
b*=20;
String mulAssign="b*=20:";
System.out.println(mulAssign+(b));
c%=2;
String modAssign="c%=2:";
System.out.println(modAssign+(c));
String greater="a>b:";
System.out.println(greater+(a>b));
String lesser="a<b:";
System.out.println(lesser+(a<b));
String equalTo="a==b:";
System.out.println(equalTo+(a==b));
String check="a>b-15:";
System.out.println(check+(a>b-15));
String notEqual="a!=b:";
System.out.println(notEqual+(a!=b));

}
}