import java.awt.event.*;
import java.awt.*;

class Lab7P1{
	public static void main(String...args){
		final int []a={1};
		Frame f=new Frame();
		f.setLayout(new FlowLayout());
		f.setSize(400,400);
		TextField tf=new TextField(20);
		Button b=new Button("Click");
		b.setSize(20,30);
		Label l=new Label();
		l.setPreferredSize(new Dimension(100,100));
		f.add(tf);
		f.add(b);
		f.add(l);
		f.setVisible(true);
		b.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent ae){
					System.out.println("hello");
					l.setText(tf.getText()+" "+a[0]);
					a[0]++;
				}
			}
		);
		f.addWindowListener(
			new WindowAdapter(){
				public void windowClosing(WindowEvent we){
					f.dispose();
				}
			}
		);
	}	
}
