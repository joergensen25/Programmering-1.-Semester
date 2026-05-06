import org.junit.jupiter.api.Test;
import main.java.semester2.lektion19.opgave1.BogTitel;
import main.java.semester2.lektion19.opgave1.Indkoeber;
import main.java.semester2.lektion19.opgave1.Kunde;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BogTitelTest {

    @Test
    void etKoeb_automatiskIndkoeb() {

        // OBS: Bemærk specifikation af Indkoeber

        // Arrange
        BogTitel bogTitel = new BogTitel("Det forsømte forår", 6);
        Kunde kunde = new Kunde("Litterær studerende");
        Indkoeber indkoeber = new Indkoeber("Finansøkonom");

        bogTitel.addObserver(indkoeber);

        // Act
        bogTitel.etKoeb(kunde);

        // Assert
        assertEquals(15, bogTitel.getAntal());

    }
}
