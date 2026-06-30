package edu.university.s40131055.property;

import edu.university.s40131055.property.service.PropertyService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class PropertyServiceApplicationTests {

    @Test
    void contextLoads() {
        PropertyService service = new PropertyService();
        assertNotNull(service);
    }
}
