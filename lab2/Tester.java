import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Tester {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass");

	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("setUp");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("tearDown");
	}

	@Test
	void testSwapLargestAndSmallest() {
		// fail("Not yet implemented");
		int[] a = new int[] { 5, 4, 1, 9, 2, 6 };
		int[] b = new int[] { 5, 4, 9, 1, 2, 6 };
		Arrays.swapLargestAndSmallest(a);
		// System.out.println(java.util.Arrays.toString(a));
		// System.out.println("Expected: [5, 4, 9, 1, 2, 6]");
		assertArrayEquals(a, b);
	}

	@Test
	void testSwapLargestAndSmallest2() {
		int[] a = new int[] { 1, 4, 1, 9, 2, 6 };
		int[] b = new int[] { 9, 4, 1, 1, 2, 6 };
		Arrays.swapLargestAndSmallest(a);
		// System.out.println(java.util.Arrays.toString(a));
		// System.out.println("Expected: [9, 4, 1, 1, 2, 6]");
		assertArrayEquals(a, b);
	}

	@Test
	void testSwapLargestAndSmallest3() {
		int[] a = new int[] { 1, 4, 2, 9, 9, 6 };
		int[] b = new int[] { 9, 4, 2, 1, 9, 6 };
		Arrays.swapLargestAndSmallest(a);
		// System.out.println(java.util.Arrays.toString(a));
		// System.out.println("Expected: [9, 4, 2, 1, 9, 6]");
		assertArrayEquals(a, b);
	}

	@Test
	void testSwapLargestAndSmallest4() {
		int[] a = new int[] { 1 };
		int[] b = new int[] { 1 };
		Arrays.swapLargestAndSmallest(a);
		// System.out.println(java.util.Arrays.toString(a));
		// System.out.println("Expected: [1]");
		assertArrayEquals(a, b);
	}
}
