import java.util.Scanner;

import javax.swing.JOptionPane;

//Mr. Uhl
//Sep 10, 2014
//Description:  
//
public class BookTester
{
   public static void main (String[] args) 
   {
      Scanner myInput = new Scanner(System.in);
      System.out.print("Enter the title: ");
      String name = myInput.nextLine();
      System.out.print("Enter the price: ");
      double cost = myInput.nextDouble();
      
      Book textbook = new Book(name, cost);
      System.out.println("My computer textbook, " + textbook.getTitle()
            + ", has a cost of: $" + textbook.getPrice());
      System.out.println(textbook);
      
//      String title = JOptionPane.showInputDialog(System.getProperty("user.name")+"Enter the Title:");
//      JOptionPane.showMessageDialog(null, title + " is a great book.");
    }
}
