package controller;

import org.junit.jupiter.api.Test;
import main.java.semester2.lektion20.controller.Controller;
import main.java.semester2.lektion20.ordination.Laegemiddel;
import main.java.semester2.lektion20.ordination.Patient;
import main.java.semester2.lektion20.storage.Storage;
import main.java.semester2.lektion20.storage.StorageInterface;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ControllerTest {

    @Test
    void test_antalOrdinationerPrVægtPrLægemiddel() {

        // Arrange
        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("1", "Hans", 80));

        StorageInterface mockedStorage = mock(StorageInterface.class);
        when(mockedStorage.getAllPatienter()).thenReturn(patients);
        Controller controller = new Controller(mockedStorage);
        Laegemiddel laegemiddel = new Laegemiddel("Studydrug", 0,
                10, 20, "stk");

        // Act
        controller.antalOrdinationerPrVægtPrLægemiddel(0.0, 100.0, laegemiddel);

        // Assert
    }
}
