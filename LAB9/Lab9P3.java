import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.*;

class Lab9P3 extends JFrame{
	Label l;
		
	Lab9P3(){
		super("JTree Demo");
		DefaultMutableTreeNode root=new DefaultMutableTreeNode("Fruits");
		DefaultMutableTreeNode apple=new DefaultMutableTreeNode("Apples");
		apple.add(new DefaultMutableTreeNode("Green Apple"));
		apple.add(new DefaultMutableTreeNode("Red Apple"));
		root.add(apple);
		
		DefaultMutableTreeNode sd=new DefaultMutableTreeNode("SoftDrinks");
		sd.add(new DefaultMutableTreeNode("Coca Cola"));
		sd.add(new DefaultMutableTreeNode("Thumps up"));
		root.add(sd);
		
		JTree jt=new JTree(root);
		add(jt);
	
	
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String...args){
		new Lab9P3();
	}
}
