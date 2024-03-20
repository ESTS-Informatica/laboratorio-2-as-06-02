

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class PropertyTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PropertyTest
{
    
    Property property;
    /**
     * Default constructor for test class PropertyTest
     */
    public PropertyTest()
    {
        
    }
    
    
    @Test
    public void testConstructor(){
        property = new Property("T3 Monte Belo", 150000.0);
        assertEquals(150000.0, property.getPrice());
        assertEquals("T3 Monte Belo", property.getDescription());
    }
    
    @Test
    public void testToString(){
        property = new Property("T3 Monte Belo", 150000.0);
        assertEquals("Descricao : T3 Monte Belo\nPreco : 150000.0 Euros", property.toString());;
    }
}
