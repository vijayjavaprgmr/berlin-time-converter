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

	@Test
	public void testTopMinutesShouldReturnRowAs_YYRYOOOOOOO() {
		assertThat(berlinTimeConverter.getTopMinutes("12:23:00"), is("YYRYOOOOOOO"));
	}

	@Test
	public void testTopMinutesShouldReturnRowAs_YYRYYRYOOOO() {
		assertThat(berlinTimeConverter.getTopMinutes("12:35:00"), is("YYRYYRYOOOO"));
	}

	@Test
	public void testBottomHoursShouldReturnRowAs_OOOO() {
		assertThat(berlinTimeConverter.getBottomHours("00:00:00"), is("OOOO"));
	}

	@Test
	public void testBottomHoursShouldReturnRowAs_RRRO() {
		assertThat(berlinTimeConverter.getBottomHours("23:59:59"), is("RRRO"));
	}

	@Test
	public void testBottomHoursShouldReturnRowAs_RROO() {
		assertThat(berlinTimeConverter.getBottomHours("02:04:00"), is("RROO"));
	}

	@Test
	public void testBottomHoursShouldReturnRowAs_RRRR() {
		assertThat(berlinTimeConverter.getBottomHours("14:35:00"), is("RRRR"));
	}

	@Test
	public void testTopHoursShouldReturnRowAs_OOOO() {
		assertThat(berlinTimeConverter.getTopHours("00:00:00"), is("OOOO"));
	}

	@Test
	public void testTopHoursShouldReturnRowAs_RRRR() {
		assertThat(berlinTimeConverter.getTopHours("23:59:59"), is("RRRR"));
	}

	@Test
	public void testTopHoursShouldReturnRowAs_ROOO() {
		assertThat(berlinTimeConverter.getTopHours("08:23:00"), is("ROOO"));
	}

	@Test
	public void testTopHoursShouldReturnRowAs_RRRO() {
		assertThat(berlinTimeConverter.getTopHours("16:35:00"), is("RRRO"));
	}

	@Test
	public void testTopLampShouldBlinkOnEveryEvenSeconds() {
		assertThat(berlinTimeConverter.getSeconds("00:00:00"), is("Y"));
	}

	@Test
	public void testTopLampShouldBlinkOffEveryOddSeconds() {
		assertThat(berlinTimeConverter.getSeconds("23:59:59"), is("O"));
	}

	@Test
	public void testEntireBerlinClockShouldReturnRowAs_YOOOOOOOOOOOOOOOOOOOOOOO() {
		assertThat(berlinTimeConverter.getBerlinClock("00:00:00"), is("YOOOOOOOOOOOOOOOOOOOOOOO"));
	}

	@Test
	public void testEntireBerlinClockShouldReturnRowAs_ORRRRRRROYYRYYRYYRYYYYYY() {
		assertThat(berlinTimeConverter.getBerlinClock("23:59:59"), is("ORRRRRRROYYRYYRYYRYYYYYY"));
	}

	@Test
	public void testEntireBerlinClockShouldReturnRowAs_YRRROROOOYYRYYRYYRYOOOOO() {
		assertThat(berlinTimeConverter.getBerlinClock("16:50:06"), is("YRRROROOOYYRYYRYYRYOOOOO"));
	}

	@Test
	public void testEntireBerlinClockShouldReturnRowAs_ORROOROOOYYRYYRYOOOOYYOO() {
		assertThat(berlinTimeConverter.getBerlinClock("11:37:01"), is("ORROOROOOYYRYYRYOOOOYYOO"));
	}

}