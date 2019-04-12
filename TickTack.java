import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
class TickTack extends JPanel implements ActionListener {
	JButton B1,B2,B3,B4,B5,B6,B7,B8,B9;
	JLabel l;
	static int a1=10;
	static int a2=100;
	static int a3=250;
	static int a4=50;

	static int chan=10;
	TickTack(){
		 setVisible(true);
		 setSize(500,500);

		 setLayout(new GridLayout(3,3));
		  l=new JLabel("Game Over");
          l.setBounds(240,220,10,30);
          l.setVisible(false);
         B1=new JButton("  ");
          B2=new JButton("  ");
           B3=new JButton("  ");
            B4=new JButton("  ");
             B5=new JButton("  ");
              B6=new JButton("  ");
               B7=new JButton("  ");
                B8=new JButton("  ");
                 B9=new JButton("  ");

                 add(B1);
                 add(B2);
                 add(B3);
                 add(B4);
                 add(B5);
                 add(B6);
                 add(B7);
                 add(B8);
                 add(B9);
                 B1.addActionListener(this);
                 B2.addActionListener(this);
                 B3.addActionListener(this);
                 B4.addActionListener(this);
                 B5.addActionListener(this);
                 B6.addActionListener(this);
                 B7.addActionListener(this);
                 B8.addActionListener(this);
                 B9.addActionListener(this);
                


	}
	
	public void actionPerformed(ActionEvent e){
		try{
		if(e.getSource()==B1){
			Color c=new Color(a2,a3,a1);
			B3.setBackground(c);
			a1+=2;
			a2+=4;
			a3-=5;
			
		}else if(e.getSource()==B2){
			if(B2.getText().equals("  ")){
				Color c=new Color(a3,a1,a2);
				B1.setBackground(c);
			a1+=2;
			a2+=4;
			a3-=5;
			}
		}else if(e.getSource()==B3){
			if(B3.getText().equals("  ")){
				Color c=new Color(a1,a3,a2);
				B5.setBackground(c);
			a1+=2;
			a2+=4;
			a3-=5;
			}
		}
		else if(e.getSource()==B4){
			if(B4.getText().equals("  ")){
				Color c=new Color(a1,a2,a3);
				B9.setBackground(c);
			a1+=2;
			a2+=4;
			a3-=5;
			}
		}
		else if(e.getSource()==B5){
			if(B5.getText().equals("  ")){
				Color c=new Color(a3,a2,a1);
				B8.setBackground(c);
			a1+=2;
			a2+=4;
			a3-=5;
			}
		}
		else if(e.getSource()==B6){
			if(B6.getText().equals("  ")){
				Color c=new Color(a3,a3,a3);
				B7.setBackground(c);
				int j;
			a1+=2;
			a2+=4;
			a3-=5;
			}
		}else if(e.getSource()==B7){
			if(B7.getText().equals("  ")){
				Color c=new Color(a3,a2,a2);
				B2.setBackground(c);
			a1+=2;
			a2+=4;
			a3-=5;
			}
		}else if(e.getSource()==B8){
			if(B8.getText().equals("  ")){
				Color c=new Color(a2,a1,a3);
				B4.setBackground(c);
			a1+=2;
			a2+=4;
			a3-=5;
			}
		}else if(e.getSource()==B9){
			if(B9.getText().equals("  ")){
				Color c=new Color(a1,a2,a3);
				B6.setBackground(c);
			a1+=2;
			a2+=4;
			a3-=5;
			}
		}
	}catch(Exception e1){
		 B5.setBackground(Color.white);
		 B5.setText("      GAME OVER");
	}

	}
public static void main(String[] args) {
	TickTack j=new TickTack();
}
}
