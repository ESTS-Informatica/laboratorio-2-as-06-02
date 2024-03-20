
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class CompanyTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CompanyTest
{
    
    User client1;
    User client2;
    User seller1;
    User seller2;
    Company company;
    ArrayList<User> clients = new ArrayList<>();
    ArrayList<User> sellers = new ArrayList<>();

    public CompanyTest(){
        
    }
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
        client1 = new User("José Manuel", "911111111", "zemanel@yahoo.com");
        client2 = new User("António Francisco", "922222222", "tochico@hotmail.com");
        seller1 = new User("Fernando Fernandes", "966777101", "fefe@remax.pt");
        seller2 = new User("Rodrigo Rodrigues", "966777152", "roro@remax.pt");
        clients.add(client1);
        clients.add(client2);
        sellers.add(seller1);
        sellers.add(seller2);
    }
    
    @Test
    public void testConstructor(){
        company = new Company(clients,sellers);
        assertNotNull(company.getClients());
        assertNotNull(company.getSellers());
    }

    
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }
}
