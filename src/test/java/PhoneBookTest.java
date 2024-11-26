import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.PhoneBook;

public class PhoneBookTest {

    private final String NAME = "Анастасия Попова";
    private final String NUMBER = "629005789";

    @Test
    public void test_addContact() {
        PhoneBook phoneBook = new PhoneBook();
        int expectedContactAmount = 1;

        int actualContactAmount = phoneBook.add(NAME, NUMBER);

        Assertions.assertEquals(expectedContactAmount, actualContactAmount);
    }

    @Test()
    public void test_addSameContact() {
        PhoneBook phoneBook = new PhoneBook();
        int expectedContactAmount = 1;
        phoneBook.add(NAME, NUMBER);

        int actualContactAmount = phoneBook.add(NAME, NUMBER);

        Assertions.assertEquals(expectedContactAmount, actualContactAmount);
    }

    @Test
    public void test_positive_findByNumber() {
        PhoneBook phoneBook = new PhoneBook();
        String expectedName = NAME;
        phoneBook.add(NAME, NUMBER);

        String actualName = phoneBook.findByNumber(NUMBER);

        Assertions.assertEquals(expectedName, actualName);
    }

    @Test
    public void test_negative_findByNumber() {
        PhoneBook phoneBook = new PhoneBook();

        String actualName = phoneBook.findByNumber(NUMBER);

        Assertions.assertNull(actualName);
    }

    @Test
    public void test_positive_findByName() {
        PhoneBook phoneBook = new PhoneBook();
        String expectedNumber = NUMBER;
        phoneBook.add(NAME, NUMBER);

        String actualNumber = phoneBook.findByName(NAME);

        Assertions.assertEquals(expectedNumber, actualNumber);
    }

    @Test
    public void test_negative_findByName() {
        PhoneBook phoneBook = new PhoneBook();

        String actualNumber = phoneBook.findByName(NAME);

        Assertions.assertNull(actualNumber);
    }
}