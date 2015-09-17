import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

//Mr. Uhl
//Sep 10, 2014
//Description:  

public class BookTester
{
   public static void main (String[] args) 
   {
//      Scanner myInput = new Scanner(System.in);
//      System.out.print("Enter the title: ");
//      String name = myInput.nextLine();
//      System.out.print("Enter the price: ");
//      double cost = myInput.nextDouble();
//   	Book[] booklist = new Book[10];
//      for (int i = 0;i<booklist.length; i++){
//      	booklist[i] = new Book("Book: "+ (1+i), ((i+1))*10);
//      }
//      for(Book k : booklist){
//      	System.out.println(k);
//      }
   	
   	ArrayList<Book> books = new ArrayList<Book>();
  
   	for (int i = 0;i<9; i++){
      	books.add(new Book("book",(i*10)));
      }
   	for (Book Book : books){
   		System.out.println(Book);
   	}
//      String title = JOptionPane.showInputDialog(System.getProperty("user.name")+"Enter the Title:");
//      JOptionPane.showMessageDialog(null, title + " is a great book.");
    }
}
