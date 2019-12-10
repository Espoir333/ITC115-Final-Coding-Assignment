public interface PublicationInterface
{
    /**
     * Returns the book publisher name (as a String) 
     */
    public String getPublisher();

    /**
     * Returns the book publication title (as a String)
     */
    public String getPublicationTitle();

    /**
     * Returns the book price (as a float)
     */
    public float getPrice();

    /**
     * Sets the book publication details.
     * 
     * @param publisherIn   The Book Publisher (as a String)
     * @param titleIn       The Book Title (as a String)
     * @param priceIn       The Book Price (as a float)
     */
    public void setPublication(String publisherIn, String publicationTitleIn, float priceIn);
}

abstract public class Publications implements PublicationInterface
{
   // Attributes
  protected String publisher;
  protected String publicationTitle;
  protected float price;

        public Publications(String publisherIn, String publicationTitleIn, float priceIn)
            {
                publisher = publisherIn;
                publicationTitle = publicationTitleIn;
                price = priceIn;
            }

        public String getPublisher()
            {
                return (publisher);
            }

        public String getPublicationTitle()
            {
                return (publicationTitle);
            }

        public float getPrice()
            {
                return (price);
            }

        public void setPublication(String publisherIn, String publicationTitleIn, float priceIn)
            {
                publisher = publisherIn;
                publicationTitle = publicationTitleIn;
                price = priceIn;
           }

}

public class Magazine extends Publications
{
    String editor;
    String date;

    public Magazine(String publisherIn , String publicationTitleIn, float priceIn, String editorIn, String dateIn)
        {
            super (publisherIn , publicationTitleIn, priceIn);

            editor = editorIn;
            date = dateIn;
        }

    public void setPublication(String publisherIn, String publicationTitleIn, float priceIn)
        {
            publisherIn = publisher;
            publicationTitleIn = publicationTitle;
            priceIn = price;
        }

    public String getEditor()
        {
            System.out.println("The editor of this magazine is " + editor);
            return (editor);
        }

    public String getDate()
        {
            System.out.println("The publication date of this magazine is " + date);
            return (date);
        }

    public String getPublisher()
        {
            System.out.println("The publisher of this magazine is " + publisher);
            return (publisher);
        }

    public String getPublicationTitle()
        {
            System.out.println("The publication title of this magazine is " + publicationTitle);
            return (publicationTitle);
        }

    public float getPrice()
        {
            System.out.println("The price of this magazine is £" + price);
            return (price);
        }

}

public class ReferenceMaterial extends Publications
{

    String genre;
    String subject;

    public ReferenceMaterial(String publisherIn , String publicationTitleIn, float priceIn,     String genreIn, String subjectIn)
        {
            super (publisherIn , publicationTitleIn, priceIn);            

            genre = genreIn;
            subject = subjectIn;
        }

    public String getGenre()
        {
            System.out.println("The genre of this material is " + genre);
            return (genre);
        }

    public String getSubject()
        {
            System.out.println("The subject of this material is " + subject);
            return (subject);
        }

    public String getPublisher()
        {
            System.out.println("The publisher of this material is " + publisher);
            return (publisher);
        }

    public String getPublicationTitle()
        {
            System.out.println("The publication title of this material is " + publicationTitle);
            return (publicationTitle);
        }

    public float getPrice()
        {
            System.out.println("The price of this material is £" + price);
            return (price);
        }
}


public class Book extends Publications
{
    int pageNumber;
    String author;

    public Book(String publisherIn , String publicationTitleIn, float priceIn, int pageNumberIn,     String authorIn)
        {
            super (publisherIn , publicationTitleIn, priceIn);

            pageNumber = pageNumberIn;
            author = authorIn;

        }

    public int getPageNumber()
        {
            System.out.println("The number of pages in this book are " + pageNumber);
            return (pageNumber);
        }

    public String getAuthor()
        {
            System.out.println("The author of this book is " + author);
            return (author);
        }

    public String getPublisher()
        {
            System.out.println("The publisher of this book is " + publisher);
            return (publisher);
        }

    public String getPublicationTitle()
        {
            System.out.println("The publication title of this book is " + publicationTitle);
            return (publicationTitle);
        }

    public float getPrice()
        {
            System.out.println("The price of this book is £" + price);
            return (price);
        }

}

public class TestLibrary
{

    public static void main()
      {     
        Magazine magazine1 = new Magazine ("SanYonic Publishing", "Ayup Magazine", 99, "Yeshumenku Suni", "12/09/2011");

        System.out.println();
        magazine1.getEditor();
        magazine1.getDate();
        magazine1.getPublisher();
        magazine1.getPublicationTitle();
        magazine1.getPrice();
        System.out.println();

        ReferenceMaterial referenceMaterial1 = new ReferenceMaterial ("Dorling kindesy", "killer Sharks In The Solent", 200, "Nature", "Sharks");

        referenceMaterial1.getGenre();
        referenceMaterial1.getSubject();
        referenceMaterial1.getPublisher();
        referenceMaterial1.getPublicationTitle();
        referenceMaterial1.getPrice();
        System.out.println();

        Book Book1 = new Book ("Hodder & Soughton", "One Day", 75, 1105, "David Nicholls");

        Book1.getPageNumber();
        Book1.getAuthor();
        Book1.getPublisher();
        Book1.getPublicationTitle();
        Book1.getPrice();
        System.out.println();        
      }

}
