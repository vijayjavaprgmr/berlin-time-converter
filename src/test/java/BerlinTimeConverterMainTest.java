import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

import com.bnpp.kata.BerlinTimeConverterMain;

public class BerlinTimeConverterMainTest {

	@Test
	public void testBerlinTimeConverterMainShouldReturnRowAs_ORRRRRRROYYRYYRYYRYYYYYY() {
		BerlinTimeConverterMain main = new BerlinTimeConverterMain();
		assertThat(main.getEntireBerlinClock("23:59:59"), is("ORRRRRRROYYRYYRYYRYYYYYY"));
	}

}
