
/**
 * Write a description of class Movie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Movie
{

     private int rating;
    private String title;
    
    /**
     * Constructor for objects of class Song
     */
    public Movie()
    {
        // initialise instance variables
        rating = 0;
        title = "";
        
        
    }
    public String getTitle() 
    {
        return title;
    }
    public void setTitle(String t) {
    title = t;
}
    public int getRating() 
    {
        return rating;
    }
    public void setRating(int r) 
    {
        rating = r;
    }


}