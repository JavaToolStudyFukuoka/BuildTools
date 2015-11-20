package packagename;

import static org.junit.Assert.*; 
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;

public class HogeTest {
    @Test
    public void addTest() {
        Hoge sut = new Hoge();
        assertThat(sut.add(1,2), is(3));
    }
}