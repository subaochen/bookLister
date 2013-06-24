
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author subaochen
 */
public class ColonDelimitedBookFinder implements BookFinder{
    private String bookFile;
    public ColonDelimitedBookFinder(String bookFile){
        this.bookFile = bookFile;
        
    }

    @Override
    public List<Book> findAll() {
        List<Book> movies = new ArrayList<Book>(0);
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(bookFile)));
            String bookLine = br.readLine();
            while(bookLine != null){
                String[] items = bookLine.split(",");
                Book movie = new Book(items[0],items[1]);
                movies.add(movie);
                
                bookLine = br.readLine();
            }
            
            br.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        
        return movies;
    }
    
}
