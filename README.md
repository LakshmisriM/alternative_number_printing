# alternative_number_printing
Alternative_number_pattern_printing
import java.util.Scanner;
public class Main
{
public static void main(String[] args)
{
int i, j, x, y;
Scanner sc = new Scanner(System.in);
System.out.println("Please enter number of rows to print pattern: ");
int n = sc.nextInt();
for(i = 1; i <= n; i++)
{
if(i % 2 == 0)
{
 x = 1;
y = 0;
}
else
{
 x = 0;
 y = 1;
}
for(j = 1; j <= n; j++)
{
 if(j % 2 == 0)
{
System.out.print(x);
}
 else
 {
System.out.print(y);
}
}
System.out.println("");
 }
}
}

