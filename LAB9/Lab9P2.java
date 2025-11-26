import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Lab9P2 extends JFrame{
	Label l;
	
	Lab9P2(){
		super("JTable Demo");
		String[] heading={"Name","Branch","Rollno"};
		String[][] data={
				{"Bindu","CSE","13"},
				{"Brunda","CSD","05"},
				{"Yamuna","CSM","20"},
				{"Siri","CSO","25"}
		};
		JTable jt=new JTable(data,heading);
		JScrollPane jsp=new JScrollPane(jt);
		add(jsp);
		
		setVisible(true);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String...args){
		new Lab9P2();
	}
}
