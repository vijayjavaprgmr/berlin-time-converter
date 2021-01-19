import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.bnpp.kata.BerlinTimeConverter;

public class BerlinTimeConverterTest {

	BerlinTimeConverter berlinTimeConverter;

	@Before
	public void initializeBerlinTimeConverterObj() {
		berlinTimeConverter = new BerlinTimeConverter();
	}

	@Test
	public void testBottomMinutesShouldReturnRowAs_OOOO() {
		assertThat(berlinTimeConverter.getBottomMinutes("00:00:00"), is("OOOO"));
	}

	@Test
	public void testBottomMinutesShouldReturnRowAs_YYYY() {
		assertThat(berlinTimeConverter.getBottomMinutes("23:59:59"), is("YYYY"));
	}

	@Test
	public void testBottomMinutesShouldReturnRowAs_YYOO() {
		assertThat(berlinTimeConverter.getBottomMinutes("12:32:00"), is("YYOO"));
	}

	@Test
	public void testTopMinutesShouldReturnRowAs_OOOOOOOOOOO() {
		assertThat(berlinTimeConverter.getTopMinutes("00:00:00"), is("OOOOOOOOOOO"));
	}

	@Test
	public void testTopMinutesShouldReturnRowAs_YYRYYRYYRYY() {
		assertThat(berlinTimeConverter.getTopMinutes("23:59:59"), is("YYRYYRYYRYY"));
	}

}