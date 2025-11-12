import java.awt.event.*;
import java.awt.*;

class Lab7P2 implements ActionListener{
	Frame f=new Frame();
	TextField tf=new TextField(20);
	Button b=new Button("Click");
	Label l=new Label();
	int a=1;
	Lab7P2(){
		f.setLayout(new FlowLayout());
		f.setSize(400,400);
		b.setSize(20,30);
		l.setPreferredSize(new Dimension(100,100));
		f.add(tf);
		f.add(b);
		f.add(l);
		f.setVisible(true);
		b.addActionListener(this);
		f.addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent we){
					f.dispose();
				}
			});
	}
	public void actionPerformed(ActionEvent ae){
		System.out.println("hello");
		l.setText(tf.getText()+" "+a);
		a++;
	}
	public static void main(String...args){
		Lab7P2 p=new Lab7P2();
		
	}
}
