   public abstract class Publication 
    {
      private String _ISBN;
      private String _Title;
      private String _Publication;
      private float _Price;

      public String getISBN() { return _ISBN;}
      public void setISBN(String isbn)
      {
        _ISBN = isbn;
      }

      public String getTitle() { return _Title;}
      public void setTitle(String title)
      {
        _Title = title;
      }

      public String getTitle() { return _Title;}
      public void setTitle(String title)
      {
        _Title = title;
      } 

      public String getPublisher() { return _Publication;}
      public void setPublisher(String publication)
      {
        _Publication= publication;
      } 

       public float getPrice() { return _Price;}
       public void setPrice(float price)
       {
           _Price= price;
       } 
    }

    public class Book extends Publication
    {

    }  

    public class Magazine extends Publication
    {

    }  

//using the class
Book book = new Book();
book.getPrice();
