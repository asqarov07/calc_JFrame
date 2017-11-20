package calculater;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.awt.Color;
import javax.swing.*;

import com.sun.glass.events.MouseEvent;


public class calculater extends JFrame {
	
	int a;
	double A;
	int b;
	double B;
	char c;
	calc obj = new calc();
	boolean db=false;
	int count=0;
	
	calculater(){
		setSize(400,350);//super(400,400);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocation(450, 220);
		setBackground(Color.green);
		
		JTextField tf = new JTextField();
		tf.setHorizontalAlignment(JTextField.RIGHT);
		
		
		tf.setBounds(50, 50, 300, 30);
		tf.setBackground(Color.cyan);
		tf.setFont(new Font("TimesRoman", Font.PLAIN, 20));
		 
		JButton b1 = new JButton("<html><h2>1");
		JButton b2 = new JButton("<html><h2>2");
		JButton b3 = new JButton("<html><h2>3");
		JButton b4 = new JButton("<html><h2>4");
		JButton b5 = new JButton("<html><h2>5");
		JButton b6 = new JButton("<html><h2>6");
		JButton b7 = new JButton("<html><h2>7");
		JButton b8 = new JButton("<html><h2>8");
		JButton b9 = new JButton("<html><h2>9");
		JButton b0 = new JButton("<html><h2>0");
		
		b3.setBounds(170, 190, 50, 30);
		b3.setBackground(Color.orange);
		b2.setBounds(110, 190, 50, 30);
		b2.setBackground(Color.orange);
		b1.setBounds(50, 190, 50, 30);
		b1.setBackground(Color.orange);
		b6.setBounds(170, 140, 50, 30);
		b6.setBackground(Color.orange);
		b5.setBounds(110, 140, 50, 30);
		b5.setBackground(Color.orange);
		b4.setBounds(50, 140, 50, 30);
		b4.setBackground(Color.orange);
		b9.setBounds(170, 90, 50, 30);
		b9.setBackground(Color.orange);
		b8.setBounds(110, 90, 50, 30);
		b8.setBackground(Color.orange);
		b7.setBounds(50, 90, 50, 30);
		b7.setBackground(Color.orange);
		b0.setBounds(50, 240, 50, 30);
		b0.setBackground(Color.orange);
		
		JButton plus = new JButton("<html><h2>+");
		JButton minus = new JButton("<html><h2>-");
		JButton multi = new JButton("<html><h2>*");
		JButton div = new JButton("<html><h2>/");
		JButton equal = new JButton("<html><h2>=");
		JButton AC = new JButton("<html><h2>AC");
		JButton point = new JButton("<html><h2>f");
		JButton sqrt = new JButton("<html><h2>√");
		JButton pow = new JButton("<html><h2>x²");
		JButton C = new JButton("<html><h2>C");
		
		plus.setBounds(240, 90, 50, 30);
		plus.setBackground(Color.blue);
		minus.setBounds(300, 90, 50, 30);
		minus.setBackground(Color.blue);
		multi.setBounds(240, 140, 50, 30);
		multi.setBackground(Color.blue);
		div.setBounds(300, 140, 50, 30);
		div.setBackground(Color.blue);
		point.setBounds(110, 240, 50, 30);
		point.setBackground(Color.blue);
		AC.setBounds(170, 240, 50, 30);
		AC.setBackground(Color.blue);
		equal.setBounds(300, 240, 50, 30);
		equal.setBackground(Color.blue);
		sqrt.setBounds(240, 190, 50, 30);
		sqrt.setBackground(Color.blue);
		pow.setBounds(300, 190, 50, 30);
		pow.setBackground(Color.blue);
		C.setBounds(240, 240, 50, 30);
		C.setBackground(Color.blue);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"1");
			
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"2");
			
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"3");
			
			}
		});
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"4");
			
			}
		});
		b5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"5");
			
			}
		});
		b6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"6");
			
			}
		});
		b7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"7");
			
			}
		});
		b8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"8");
			
			}
		});
		b9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"9");
			
			}
		});
		b0.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"0");
			}
		});
		
		
		plus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(db) {
					A = Double.parseDouble(tf.getText());
					tf.setText("");
					c = '+';
					
				}else {
					a = Integer.parseInt(tf.getText());
					tf.setText("");
					c = '+';
					
				}
			}
		});
		minus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(db) {
					A = Double.parseDouble(tf.getText());
					tf.setText("");
					c = '-';
					
				}else {
					a = Integer.parseInt(tf.getText());
					tf.setText("");
					c = '-';
					
				}
			}
		});
		multi.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(db) {
					A = Double.parseDouble(tf.getText());
					tf.setText("");
					c = '*';
					
				}else {
					a = Integer.parseInt(tf.getText());
					tf.setText("");
					c = '*';
					
				}
			}
		});
		div.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(db) {
					A = Double.parseDouble(tf.getText());
					tf.setText("");
					c = '/';
					
				}else {
					a = Integer.parseInt(tf.getText());
					tf.setText("");
					c = '/';
					
				}
			}
		});
		pow.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(db) {
					A = Double.parseDouble(tf.getText());
					A=obj.pow(A,2);
					tf.setText(A+"");
					
				}else {
					a = Integer.parseInt(tf.getText());
					a=(int)obj.pow(a,2);
					tf.setText(a+"");
					
				}
			}
		});
		sqrt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				if(db) {
					A = Double.parseDouble(tf.getText());
					tf.setText(obj.sqrt(A)+"");
				}else {
					a = Integer.parseInt(tf.getText());
					tf.setText((int)obj.sqrt(a)+"");					
				}
				
			}
		});
		AC.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				a=0;
				b=0;
				tf.setText("");
			}
		});
		C.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				a = Integer.parseInt(tf.getText());
				double s=a/10;
				if(tf.getText().length()>0)
					a=(int)Math.floor(s);
				tf.setText(a+"");
				c = 'b';
			}
		});
		point.addActionListener(new ActionListener() { 
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(tf.getText().length()<10) {
					tf.setText(tf.getText()+".");
					db=true;
				}
			}
		});
		
		
		equal.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			
				
				if(db==false) {
					b = Integer.parseInt(tf.getText());
					
					if(c=='+') {
						a=(int)obj.plus(a, b);
						
						tf.setText(a+"");
					}
					if(c=='-') {
						a=(int)obj.minus(a, b);
						tf.setText(a+"");
					}
					if(c=='*') {
						a=(int)obj.multi(a, b);
						tf.setText(a+"");
					}
					if(c=='/') {
						a=(int)obj.div(a, b);
						tf.setText(a+"");
					}
					
				}else {
					
					B = Double.parseDouble(tf.getText());
					
					if(c=='+') {
						A=obj.plus(A, B);
						tf.setText(A+"");
					}	
					if(c=='-') {
						A=obj.minus(A, B);
						tf.setText(A+"");
					}
					if(c=='*') {
						A=obj.multi(A, B);
						tf.setText(A+"");
					}
					if(c=='/') {
						A=obj.div(A, B);
						tf.setText(A+"");
					}
					a=(int)A;				
				}
			}
		});
		
		add(tf);
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b0);
		
		add(plus);
		add(minus);
		add(equal);
		add(multi);
		add(div);
		add(point);
		add(AC);
		add(C);
		add(pow);
		add(sqrt);
		
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculater calc=new calculater();
		
	}

}
