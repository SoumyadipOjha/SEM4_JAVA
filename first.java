import java.util.*;

import javax.swing.JOptionPane;

import java.util.Random;

public class first {
    public static void main(String[] args) {

        // !variable

        // int x=123;
        // System.out.println(x);
        // double y=3.14;
        // System.out.println(y);
        // boolean z=true;
        // System.out.println(z);
        // char symbol='@';
        // System.out.println(symbol);
        // String name="Soumya";
        // System.out.println("Hello "+ name);

        // !user input

        // //import java.util.*;
        // Scanner sc=new Scanner(System.in);
        // // String name=sc.nextLine();
        // // String charr=sc.next();
        // int num=sc.nextInt();
        // System.out.println(
        // //name
        // //charr
        // // num
        // );

        // !GUI

        // import javax.swing.JOptionPane;
        String name = JOptionPane.showInputDialog("Enter your name");
        JOptionPane.showMessageDialog(null, "Hello " + name);
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        JOptionPane.showMessageDialog(null, "you are " + age + " years old");
        double height=Double.parseDouble(JOptionPane.showInputDialog("Enter your height"));
        JOptionPane.showMessageDialog(null, "your height is " + height + " cm");
        //!math class

        // double x=3.14;
        // double y=10;
        // double z=Math.max(x,y);
        // double z=Math.abs(y);// negetive to positive
        // double z=Math.sqrt(y);
        // double z=Math.round(x);
        // double z=Math.ceil(x);
        // double z=Math.floor(x);
        // System.out.println(z);


        //!random value
        //import java.util.Random;
        // Random random =new Random();
        // int x =random.nextInt(6)+1;
        // double y=random.nextDouble(10.0)+1;
        // boolean z=random.nextBoolean();
        // System.out.println(y);
        
        //!if-else

        //!switch case

        //!loop        

        //!1d array

        //!2d array

        //!string
        // String name="Soumya";
        // boolean rs=name.equals("soumya");
        // boolean rs2=name.equalsIgnoreCase("soumya");
        // int len=name.length();
        // char ind=name.charAt(1); // ind=o
        // int result =name.indexOf("S"); //result =0
        // boolean result=name.isEmpty();
        // String result=name.toUpperCase();
        // String result=name.toLowerCase();
        // String result=name.trim();//to erase the empty spaces from thr string;
        // String result=name.replace('o','u');
        // System.out.println(result);
        
    }
}