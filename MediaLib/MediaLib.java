
/**
 * Write a description of class MediaLib here.
 *
 * @author (Izzie Mack)
 * @version (a version number or a date)
 */
public class MediaLib
{
    public static void main()
    {
       
        Song song1 = new Song();
        System.out.println(song1);
        
        song1.setTitle("Johnny B. Goode");  
        System.out.println(song1.getTitle());
        
        song1.setRating(5);  
        System.out.println(song1.getRating());
        
        song1.setPrice(5);  
        System.out.println(song1.getPrice());
        
        Movie movie1 =new Movie();
        System.out.println(movie1);
        
        Book book1 = new Book();
        System.out.println(book1);
        
    

    }

}

