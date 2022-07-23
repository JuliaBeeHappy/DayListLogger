import homework.ListOfDays;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;



public class getDayTest {


    @Test
    public void positiveNum(){
        Integer dayNumber;
        String result = ListOfDays.getDay(1);

        assertNull(result, "hhfhtg");
        assertNotNull(result, "Null was returned");

    }
    @Test
    @DisplayName("Nullpointer Exeption test")
    public void errorTest(){
        int dayNumber;

        assertThrows(NullPointerException.class, ()->{ListOfDays.getDay(null);});

    }
    @ParameterizedTest
    @ValueSource(ints = {1, 2, -1})
    public void dayTest(int dayNumber){
        String result = ListOfDays.getDay(1);
    }


    static Stream<Arguments> dayTest(){
        return Stream.of(
                Arguments.of(1),
                Arguments.of(8),
                Arguments.of(-2)
        );
    }

    @ParameterizedTest
    @MethodSource("dayTest")
    public void methodTest(int dayNumber){
        String result = ListOfDays.getDay(dayNumber);
    }




}
