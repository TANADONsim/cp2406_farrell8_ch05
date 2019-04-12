import java.io.*;
import java.lang.*;
class EvenOdd
{
    public static void main(String args[])throws IOException
    {
        int n;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number: ");
        n=Integer.parseInt(br.readLine());
        n=n%2;
        if(n==0)
            System.out.println("The given number is even ");
        else
            System.out.println("The given number is odd ");
    }
}