package edu.university.s40131055.property;

import edu.university.s40131055.property.service.PropertyService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PropertyServiceApplicationTests {

    @Test
    void serviceCanBeInstantiated() {
        PropertyService service = new PropertyService();
        assertNotNull(service);
    }
}
