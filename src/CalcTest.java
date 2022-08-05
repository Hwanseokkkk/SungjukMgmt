import static org.junit.Assert.*;

import org.junit.Test;

public class CalcTest {

	@Test
	public void test() {
		Student [] array = {new Student("2022-001","한지",97,58,67,45)};
		Calc calc = new Calc(array);
		calc.calc(1);
		assertEquals(267, array[0].getTot());
	}

}
