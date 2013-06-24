
import java.util.List;

/**
 *
 * @author subaochen
 */
public class Client {
    public static void main(String[] args){
        Container container = configureContainer();
        BookLister lister = (BookLister)container.getComponent(BookLister.class);
        List<Book> books = lister.booksWrittenBy("lu xun");
        
        for(Book book:books)
            System.out.println(book.getTitle());
    }
    
    public static Container configureContainer(){
        Container container = new MyContainer();
        Object[] finderParams = new String[]{"books.txt"};
        container.registerComponent(BookFinder.class, ColonDelimitedBookFinder.class, finderParams);
        container.registerComponent(BookLister.class);
        return container;
    }    
}
