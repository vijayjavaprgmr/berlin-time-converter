import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

import com.bnpp.kata.BerlinTimeConverter;

public class BerlinTimeConverterTest {

	@Test
	public void testBottomMinutesShouldReturnRowAs_OOOO() {
		BerlinTimeConverter berlinTimeConverter = new BerlinTimeConverter();
		assertThat(berlinTimeConverter.getBottomMinutes("00:00:00"), is("OOOO"));
	}

}