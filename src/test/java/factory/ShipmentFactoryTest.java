package factory;

import org.junit.jupiter.api.Test;
import domain.Shipment;
import factory.ShipmentFactory;

import static org.junit.jupiter.api.Assertions.*;

        import java.util.Date;

public class ShipmentFactoryTest {

    @Test
    void createShipment() {
        Shipment shipment = ShipmentFactory.createShipment(
                "Cape Town",
                new Date(),
                new Date(),
                "Shipped"
        );

        assertNotNull(shipment);
        assertNotNull(shipment.getShipmentId());
    }
}