
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
    User nullClient;
    User seller1;
    User seller2;
    User nullSeller;
    Property property1;
    Property property2;
    Property nullproperty;
    ArrayList<User> clients = new ArrayList<>();
    ArrayList<User> sellers = new ArrayList<>();
    ArrayList<User> properties = new ArrayList<>();

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
        nullClient = null;
        
        seller1 = new User("Fernando Fernandes", "966777101", "fefe@remax.pt");
        seller2 = new User("Rodrigo Rodrigues", "966777152", "roro@remax.pt");
        nullSeller = null;
        
        property1 = new Property("Propriedade 1", 10000.00);
        property2= new Property("Propriedade 2", 15000.00);
        nullproperty = null;
        
        clients.add(client1);
        clients.add(client2);
        sellers.add(seller1);
        sellers.add(seller2);
    }
    
    @Test
    public void testConstructor(){
        Company company = new Company(clients,sellers);
        assertNotNull(company.getClients());
        assertNotNull(company.getSellers());
    }
    
    @Test
    public void testRegisterClient(){
        Company company = new Company();
        assertTrue(company.registerClient(client1));
    }
    
    @Test
    public void testRegisterClients(){
        Company company = new Company();
        assertTrue(company.registerClient(client1));
        assertTrue(company.registerClient(client2));
    }
    
    @Test
    public void testRegisterClientsDuplicate(){
        Company company = new Company();
        assertTrue(company.registerClient(client1));
        assertFalse(company.registerClient(client1));
    }
    
    @Test
    public void testRegisterClientsNull(){
        Company company = new Company();
        assertFalse(company.registerClient(nullClient));
    }

    @Test
    public void testRegisterSeller(){
        Company company = new Company();
        assertTrue(company.registerSeller(seller1));
    }
    
    @Test
    public void testRegisterSellers(){
        Company company = new Company();
        assertTrue(company.registerSeller(seller1));
        assertTrue(company.registerSeller(seller2));
    }
    
    @Test
    public void testRegisterSellersDuplicate(){
        Company company = new Company();
        assertTrue(company.registerSeller(seller1));
        assertFalse(company.registerSeller(seller1));
    }
    
    @Test
    public void testRegisterSellersNull(){
        Company company = new Company();
        assertFalse(company.registerSeller(nullSeller));
    }
    
    @Test
    public void testRegisterProperty(){
        Company company = new Company();
        assertTrue(company.registerProperty(property1));
    }
    
    @Test
    public void testRegisterProperties(){
        Company company = new Company();
        assertTrue(company.registerProperty(property1));
        assertTrue(company.registerProperty(property2));
    }
    
    @Test
    public void testRegisterPropertiesDuplicate(){
        Company company = new Company();
        assertTrue(company.registerProperty(property1));
        assertFalse(company.registerProperty(property1));
    }
    
    @Test
    public void testRegisterPropertysNull(){
        Company company = new Company();
        assertFalse(company.registerProperty(nullproperty));
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
