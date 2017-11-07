package base;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;

public class ImageEditorFrame extends JFrame {

	ImageEditorPanel panel;

	public ImageEditorFrame() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 300);
		createMenuBar();
		setVisible(true);
	}
	
	private void createMenuBar() {
		JMenuBar menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);

		JMenu menuFile = new JMenu("File");
		menuBar.add(menuFile);

		JMenuItem menuItemOpen = new JMenuItem("Open");
		menuFile.add(menuItemOpen);

		menuItemOpen.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				onOpen();
			}
		});
	}

	private void onOpen() {
		JOptionPane.showMessageDialog(this, "Open Selected");
	}
}
