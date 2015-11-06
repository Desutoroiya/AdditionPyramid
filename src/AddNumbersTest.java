import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class AddNumbersTest {

	@Test
	public void test() {
		NumberList myList = new NumberList();
		ArrayList<Integer> result = myList.addNumbers(new int[] { 1, 2, 3, 4, 5 });
		ArrayList<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		expected.add(4);
		expected.add(5);
		assertEquals(result, expected);
	}

}
