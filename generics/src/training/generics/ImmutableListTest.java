package training.generics;

import static org.junit.Assert.*;

import org.junit.Test;

public class ImmutableListTest {

	private static final ImmutableList<Integer> EMPTY = ImmutableList.empty();
	private static final ImmutableList<Integer>
		ONE_TWO_THREE = EMPTY.prepend(3).prepend(2).prepend(1),
		ZERO_ONE_TWO_THREE = ONE_TWO_THREE.prepend(0);

	private static final Function<Integer, Integer>
		SQUARE_FUNCTION = new Function<Integer, Integer>() {
			@Override
			public Integer apply(Integer value) {
				return value * value;
			}
		};
	
	
	
	
	@Test
	public void listsMustShareSubstructure() {
		assertSame(ONE_TWO_THREE, ZERO_ONE_TWO_THREE.tail);
	}

}