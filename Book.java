public class Book
{
    public String authorName;
    public String title;
    public int publishedYear;
    public int publishedMonth;
    public int publishedDay;
    public String genre;
    public int numPages;
    public boolean isCheckedOut;
    public int price;

    public Book(String authorName, String title, int publishedYear, int publishedMonth, int publishedDay, String genre, int numPages, boolean isCheckedOut,int price)
    {
        this.authorName = authorName;
        this.title = title;
        this.publishedYear = publishedYear;
        this.publishedMonth = publishedMonth;
        this.publishedDay = publishedDay;
        this.genre = genre;
        this.numPages = numPages;
        this.isCheckedOut = isCheckedOut;
        this.price = price;
    }
}
