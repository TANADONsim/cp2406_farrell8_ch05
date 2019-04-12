import javax.swing.*;
public class AscendingAndDescending
{
    public static void main (String args[])
    {
        int num1, num2, num3;
        String str, output;
        str = JOptionPane.showInputDialog(null,"Enter the first integer: ");
        num1 = Integer.parseInt(str);
        str = JOptionPane.showInputDialog(null,"Enter the second integer: ");
        num2 = Integer.parseInt(str);
        str = JOptionPane.showInputDialog(null,"Enter the third integer: ");
        num3 = Integer.parseInt(str);
        if(num1 > num2 && num2 > num3)
            output = "Ascending order: " + num3 + ", " + num2+ ", " + num1 + " and Descending order: " + num1 + ", " + num2 + ", " + num3;
        else
        if(num2 > num1 && num1 > num3)
            output = "Ascending order: " + num3 + ", " + num1 + ", " + num2 + " and Descending order: " + num2 + ", " + num1 + ", " + num3;
        else
        if(num3 > num1 && num1 > num2)
            output = "Ascending order: " + num2 + ", " + num1 + ", " + num3 + " and Descending order: " + num3 + ", " + num1 + ", " + num2;
        else
        if(num1 > num3 && num3 > num2)
            output = "Ascending order: " + num2 + ", " + num3 + ", " + num1 + " and Descending order: " + num1 + ", " + num3 + ", " + num2;
        else
        if(num2 > num3 && num3 > num1)
            output = "Ascending order: " + num1 + ", " + num3 + ", " + num2 + " and Descending order: " + num2 + ", " + num3 + ", " + num1;
        else
            output = "Ascending order: " + num1 + ", " + num2 + ", " + num3 + " and Descending order: " + num3 + ", " + num2 + ", " + num1;
        JOptionPane.showMessageDialog(null, output);

    }

}
