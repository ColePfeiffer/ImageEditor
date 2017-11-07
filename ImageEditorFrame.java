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
		setTitle("Tims und Suses Projekt");
	}
}
