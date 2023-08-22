package u1pp;

import static org.junit.jupiter.api.Assertions.*;

import java.io.PrintStream;
import java.io.ByteArrayOutputStream;

import org.junit.jupiter.api.*;




public class MainTest {
    
	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	@BeforeEach
	public void setUp() {
	    System.setOut(new PrintStream(outputStreamCaptor));
	}
	
	@AfterEach
	public void tearDown() {
	    System.setOut(standardOut);
	}
	
	@Test
	void printGreeting_givenNameNerd_outputSuccess() {
	    Main.printGreeting("Nerd");
	    assertEquals("Hello Nerd", outputStreamCaptor.toString().trim());
	}
	
	@Test
	void printGreeting_givenNameMrHsieh_outputSuccess() {
	    Main.printGreeting("Mr. Hsieh");
	    assertEquals("Hello Mr. Hsieh", outputStreamCaptor.toString().trim());
	}
	
	@Test
	public void averageOfThreeTest_given000() {
		assertEquals(0.0, Main.averageOfThree(0,0,0), 0.001);
	}
	
	@Test
	public void averageOfThreeTest_given100() {
		assertEquals(0.3333, Main.averageOfThree(1,0,0), 0.001);
	}
	
	@Test
	public void averageOfThreeTest_given110() {
		assertEquals(0.6666, Main.averageOfThree(1,1,0), 0.001);
	}
	
	@Test
	public void averageOfThreeTest_given111() {
		assertEquals(1.0, Main.averageOfThree(1,1,1), 0.001);
	}
}
