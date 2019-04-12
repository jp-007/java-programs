import java.awt.*;
import java.awt.event.*;
import java.util.Random;
public class Snake extends Frame implements ActionListener,MouseMotionListener,TextListener,KeyListener{
	Button bbb,bb,bc,bd,be,target,test;
	TextField t,t1,t2;

	Random random = new Random();
    Random random1 = new Random();
    static int score=0;
    static int a=10;
    static int b=10;
    static int c=60;
    static int d=60;
    static int q1=10;
    static int q2=10;
    static boolean LR=false;
    static boolean RL=false;
    static boolean UD=true;
    static boolean DU=false;
    static boolean x=true;
    int z;
    int y;
	Panel p;
    Label l1;
    Rectangle r;
    
	Snake(){
		 setVisible(true);
		 setSize(500,500);
         setBackground(Color.black);
		 setLayout(new BorderLayout());
         p=new Panel();
         p.setSize(100,100);
         p.setLayout(new BorderLayout(1,1));
         p.setVisible(true);
         add(p,BorderLayout.NORTH);
        
         bbb=new Button("   ");
        
         
         bb=new Button("DOWN");
         bd=new Button("LEFT");
          bc=new Button("RIGHT"); 
         be=new Button("UP");
    

         target=new Button();
         t=new TextField(10);
         t1=new TextField();
          t2=new TextField();
        test=new Button();

        t.setVisible(false);
        t1.setVisible(false);
        t2.setVisible(false);
        
         t.addTextListener(this);
         t.setVisible(true);
         add(bbb);
        add(target);
         p.add(bb,BorderLayout.SOUTH);
         p.add(bc,BorderLayout.EAST);
         p.add(bd,BorderLayout.NORTH);
         p.add(be,BorderLayout.WEST);
         add(target);
         add(t,BorderLayout.SOUTH);
         add(t1,BorderLayout.NORTH);
         add(t2,BorderLayout.EAST);
        
        bbb.setBackground(Color.yellow);
         bb.setBackground(Color.red);
    
         bb.addActionListener(this);
         bc.addActionListener(this);
         bd.addActionListener(this);
         be.addActionListener(this);
         addKeyListener(this);
         t.addKeyListener(this);
         t1.addKeyListener(this);
         t2.addKeyListener(this);
         t1.setText("200");
         
            try
            {
                for(int i=1;i<=2000;i++){
                int x=Integer.parseInt(t1.getText());
                Thread.sleep(x);
                r=getBounds();
                t.setText(""+i);
            }

            }catch(Exception e)
            {
                t1.setText("100");
              System.out.println(""+e);

            }
           addWindowListener(new WindowAdapter(){

         	public void windowClosing(WindowEvent w){
         		System.exit(1);
         	}
         });
         addMouseMotionListener(this);

         bbb.setBounds(10,10,20,20);

	}
	public void textValueChanged(TextEvent t)
    {
        
             r=getBounds();   
            bbb.setBounds(a,b,20,20);
            if(LR){
                a+=10;
                 bbb.setBounds(a,b,q1,q1);
            }
            if(UD){
                b+=10;
                 bbb.setBounds(a,b,q1,q1);
            }
            if(RL){
                a-=10;
                 bbb.setBounds(a,b,q1,q1);
            }
            if(DU){
                b-=10;
                bbb.setBounds(a,b,q1,q1);
            }

            if(x){
                target.setBounds(c,d,q1,q1);
                
            }


            if(Math.abs(a-c)<2&&Math.abs(b-d)<2){                                                                                                             
                score++;
                
                add(test);

                
                q1+=10;
                bbb.setBounds(a,b,q1,q1);

                //SETTING RANDOM CORDINATES FOR TARGET
                c=((random1.nextInt((r.width-q1)/10)));
                c=c*10;
                d=((random.nextInt((r.height-q1)/10)));
                d=d*10;
                t2.setText(""+r.width+" "+c+" "+d);
            }
            System.out.println(r.width/10);

          //IF MOVING OBJECT GOES BEYOND BOUNDARIES  
           if(a>=r.width){
            a=10;
           }
            if(b>=r.width){
                b=10;
            }
            if(a<=0){
                a=r.width-q1;
            }
            if(b<=0){
                b=r.height-q1;
            }

        
        }
            
          //1366,768 
	
	public void mouseDragged(MouseEvent m){
         l1.setText("dragged");
	}
	public void mouseMoved(MouseEvent m){
         l1.setText("moved");
	}
	public void actionPerformed(ActionEvent e){
		
        if(e.getSource()==bb){
            UD=true;
            LR=false;
            RL=false;
            DU=false;
        }
         if(e.getSource()==bc){
            UD=false;
            LR=true;
            RL=false;
            DU=false;
        }
         if(e.getSource()==bd){
            UD=false;
            LR=false;
            RL=true;
            DU=false;
        }
         if(e.getSource()==be){
            UD=false;
            LR=false;
            RL=false;
            DU=true;
        }
}


         public void keyPressed (KeyEvent ke) {  
        if(ke.getKeyCode()==KeyEvent.VK_DOWN){
            UD=true;
            LR=false;
            RL=false;
            DU=false;
        }
         if(ke.getKeyCode()==KeyEvent.VK_RIGHT){
            UD=false;
            LR=true;
            RL=false;
            DU=false;
        }
         if(ke.getKeyCode()==KeyEvent.VK_LEFT){
            UD=false;
            LR=false;
            RL=true;
            DU=false;
        }
         if(ke.getKeyCode()==KeyEvent.VK_UP){
            UD=false;
            LR=false;
            RL=false;
            DU=true;
        }
    }  
    public void keyReleased(KeyEvent e) {  
        
    }  
    public void keyTyped(KeyEvent e) {  
       
    }  

	
	
public static void main(String[] args) {
	Snake j=new Snake();
}
}
