import semester2.lektion16.opgave2.Palindrom;

class Test {

    @org.junit.jupiter.api.Test
    void test_palindrom() {
        // Arrange

        Palindrom palindrom = new Palindrom();

        String palindrome = "ibofobi";

        // Act
        boolean expected = true;
        boolean actual = palindrom.palindrom(palindrome);
        // Assert
    }

    @org.junit.jupiter.api.Test
    void test_palindrom_empty() {
        Palindrom palindrom = new Palindrom();

        String empty = "";

        boolean expected = false;
        boolean actual = palindrom.palindrom(empty);

        assert false;
    }


}
