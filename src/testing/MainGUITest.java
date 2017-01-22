package testing;

import static org.junit.Assert.*;
import UI.MainGUI;
import org.junit.Before;
import org.junit.Test;

public class MainGUITest {
	MainGUI myGUI;
	@Before
	public void setUp() throws Exception {
		myGUI = new MainGUI();
	}

	@Test
	public void test() {
		assert(myGUI.isEnabled() == true);
	}

}
