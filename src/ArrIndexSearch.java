import java.util.Scanner;
public class ArrIndexSearch{
public static void main (String[] args){
Scanner sc=new Scanner(System.in);
int j,i;
int arr[]=new int [10];
System.out.println("Enter the element of Array");
for(i=0;i<10;i++)
{
	arr[i]=sc.nextInt();
}
System.out.println("Enter the element you want to search");
int a=sc.nextInt();
for(j=0;j<10;j++){
	if (arr[j]==a)
break;
else
 continue;
}
if(j==9)
	System.out.println("-1");
else
	System.out.println("the entered is "+ arr[j]+ "and the index is"+j);
}
}
