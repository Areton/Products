import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.Book;
import ru.netology.Product;
import ru.netology.ProductRepository;
import ru.netology.Smartphone;

public class ProductRepositoryTest {

    Product item1 = new Smartphone(13, "Iphone11", 350, "Apple");
    Product item2 = new Smartphone(16, "Iphone13Pro", 350, "Apple");
    Product item3 = new Smartphone(1, "A50", 350, "Samsung");
    Product item4 = new Book(153, "The Prize", 350, "Ergin");

    @Test
    public void shouldSave() {
        ProductRepository repo = new ProductRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.save(item4);
        Product[] expected = {item1, item2, item3, item4};
        Product[] actual = repo.getItems();

        Assertions.assertArrayEquals(expected, actual);
    }

}
