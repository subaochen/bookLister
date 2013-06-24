
import java.util.List;

/**
 *
 * @author subaochen
 */
public class Client {
    public static void main(String[] args){
        List<Book> books = new BookLister("books.txt").booksWrittenBy("lu xun");
        
        for(Book book:books)
            System.out.println(book.getTitle());
    }
}
