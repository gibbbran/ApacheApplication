package UI;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.KeyStroke;
import java.awt.event.InputEvent;

public class MainGUI extends JFrame implements ActionListener{
	private static String aboutUs = "We are Team Apache:\n Brandon Gibbons --Gibbo\n Jorie Fernandez --J \n Griffin Toyoda --Griff\n "
			+ "Zeeshan Aziz Karim --**Needs nickname**\n Max Kullish --**Needs Nickname**";
	
	public MainGUI() {
		setMinimumSize(new Dimension(500, 500));
		setForeground(Color.ORANGE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Apache");
		
		JLabel lblApacheApp = new JLabel("Apache App");
		lblApacheApp.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblApacheApp, BorderLayout.NORTH);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu menu = new JMenu("Menu");
		menu.setActionCommand("Menu");
		menuBar.add(menu);
		
		JMenuItem aboutMenuItem = new JMenuItem("About...");
		aboutMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_MASK));
		aboutMenuItem.setActionCommand("About");
		aboutMenuItem.setMnemonic(KeyEvent.VK_A);
		aboutMenuItem.addActionListener(this);
		menu.add(aboutMenuItem);
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 5009798814042290230L;

	public static void main(String[] args) {
		MainGUI mainFrame = new MainGUI();
		mainFrame.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent args) {
		
		if(args.getActionCommand() == "About") {
			JOptionPane.showMessageDialog(this, aboutUs);
		}
		
	}

}
