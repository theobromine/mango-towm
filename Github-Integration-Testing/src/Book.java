
public class Book
{
   // INSTANCE FIELDS
   private String title;
   private double price; 
   
   // CONSTRUCTORS
   public Book() 
   {
      title = "";
      price = 0;
   }

   public Book(String aTitle, double aPrice)
   {
      title = aTitle;
      price = aPrice;
   }

   // METHODS
   public String getTitle()
   {
      return title;
   }
   
   public void setTitle(String aTitle)
   {
      title = aTitle;
   }
   
   public double getPrice()
   {
      return price;
   }
   
   public void setPrice(double aPrice)
   {
      price = aPrice;
   }
   
}