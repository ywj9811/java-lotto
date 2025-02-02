package lotto.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class CheckNumbersTest {
    private static final List<Integer> LOTTO_NUMBERS = Arrays.asList(1,2,3,4,5,7);
    private CheckNumbers checkNumbers;
    private List<Integer> myNumbers;
    private int count;

    @BeforeEach
    public void setUp() {
        checkNumbers = new CheckNumbers();
    }

    @Test
    @SuppressWarnings("unchecked")
    @DisplayName("개수_정상리턴_확인")
    public void correctReturn() {
        myNumbers = Arrays.asList(1,2,3,4,5,6);
        count = checkNumbers.getCorrect(LOTTO_NUMBERS, myNumbers, 6);
        assertThat(count).isEqualTo(6);
    }
    @Test
    @SuppressWarnings("unchecked")
    @DisplayName("개수_정상리턴_확인2")
    public void correctReturn2() {
        myNumbers = Arrays.asList(1,2,8,4,5,33);
        count = checkNumbers.getCorrect(LOTTO_NUMBERS, myNumbers, 6);
        assertThat(count).isEqualTo(4);
    }
}
