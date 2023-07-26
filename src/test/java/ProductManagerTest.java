
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.*;

public class ProductManagerTest {
    ProductRepository repo = new ProductRepository();
    ProductManager manager = new ProductManager(repo);
    Product item1 = new Smartphone(13, "Iphone11", 350, "Apple");
    Product item2 = new Smartphone(16, "Iphone13Pro", 350, "Apple");
    Product item3 = new Smartphone(1, "A50", 350, "Samsung");
    Product item4 = new Book(153, "The Prize", 350, "Ergin");

    @BeforeEach
    public void setUp() {
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
    }

    @Test
    public void shouldSerch1() {
        Product[] expected = {item2};
        Product[] actual = manager.serchBy("Iphone13Pro");

        Assertions.assertArrayEquals(expected, actual);
    }
}