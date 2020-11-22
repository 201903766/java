package lyj;
import java.util.*;
public class Lyj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,c=1,d=0;
Scanner reader=new Scanner(System.in);
System.out.print("请输入数字：");
b=reader.nextInt();
for(a=1;a<=b;a++)
{
c=c*a;
d=d+c;
}
System.out.println("结果为"+d);
	}

}
