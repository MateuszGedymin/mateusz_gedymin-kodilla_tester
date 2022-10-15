import org.junit.jupiter.api.Test;


import static com.kodilla.stream.UsersManager.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsersManagerTest {
    @Test
    public void shouldReturnChemists() {
        assertEquals(2, filterChemistGroupUsernames().size());
    }
    @Test
    public void shouldPrintPplOlderThanNUmber() {
        assertEquals(4, pplOlderThanNumber(40).size());
    }

    @Test
    public void shouldPrintPplWhoPostedSomething() {
        assertEquals(4, pplEverPosted().size());
    }
}
