

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author subaochen
 */
public class BookLister {
    private BookFinder finder;

    public BookFinder getFinder() {
        return finder;
    }

    public void setFinder(BookFinder finder) {
        this.finder = finder;
    }
    
    
    public List<Book> booksWrittenBy(String author){
        List books = new ArrayList<Book>(0);
        List<Book> allMovies = finder.findAll();
        for(Book movie:allMovies)
            if(movie.getAuthor().equalsIgnoreCase(author))
                books.add(movie);
        
        return books;
    }
}
