package testing;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import UI.MainGUI;

public class MainGUITest {
	MainGUI myGUI;
	
	@Before
	public void setUp() throws Exception {
		myGUI = new MainGUI();
	}

	@Test
	public void test() {
		assertTrue(myGUI.isActive());
	}

}
