    import java.awt.BorderLayout;
	import java.awt.Container;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	 

	import javax.swing.*;
	 
	public class SwingPaint  {
		
	  JButton  blackBtn,redBtn,blueBtn,clearBtn;
	  DrawArea drawArea;
	  JFrame frame = new JFrame();
	  ActionListener actionListener = new ActionListener() {
	 
	  public void actionPerformed(ActionEvent e) {
	      if (e.getSource() == clearBtn) {
	        drawArea.clear();
	      } else if (e.getSource() == blackBtn) {
	        drawArea.black();
	      } else if (e.getSource() == redBtn) {
		        drawArea.red();
	      } else if (e.getSource() == blueBtn) {
	        drawArea.blue();
	    //  } else if (e.getSource() == greenBtn) {
	       // drawArea.green();
	     
//	      } else if (e.getSource() == magentaBtn) {
//	        drawArea.magenta();
//	      }
//	      else if (e.getSource() == yellowBtn) {
//		        drawArea.yellow();
		      }
	    }
	  };
	 
	  public static void main(String[] args) {
//	    new SwingPaint().show();
		  SwingPaint p = new SwingPaint();
		  p.show();
	  }
	 
	  public void show() {
	    // create main frame
	     frame = new JFrame("                                                                         Whiteboard");
	    Container content = frame.getContentPane();
	    // set layout on content pane
	    content.setLayout(new BorderLayout());
	    JPanel jp = new JPanel();
	     JLabel jlabel = new JLabel("Masum's WhiteBoard");
	    
	    jlabel.setBounds(20,0,400,200);
	    jp.add(jlabel);
	    // create draw area
	    drawArea = new DrawArea();
	    content.add(jp, BorderLayout.NORTH);
	   
	    // add to content pane
	    content.add(drawArea, BorderLayout.CENTER);
	 
	    // create controls to apply colors and call clear feature
	    JPanel controls = new JPanel();
	 
	    clearBtn = new JButton("Clear");
	    clearBtn.addActionListener(actionListener);
	    blackBtn = new JButton("Black");
	    blackBtn.addActionListener(actionListener);
	    redBtn = new JButton("<html><div style='color:red;'>Red</div></html>");
	    redBtn.addActionListener(actionListener);
	    blueBtn = new JButton("<html><div style='color:blue;'>Blue</div></html>");
	    blueBtn.addActionListener(actionListener);
	    
	    
//	    greenBtn = new JButton("<html><div style='color:green;'>Green</div></html>");
//	    greenBtn.addActionListener(actionListener);
//	  
//	    magentaBtn = new JButton("<html><div style='color:purple;'>Magenta</div></html>");
//	    magentaBtn.addActionListener(actionListener);
//	    yellowBtn = new JButton("<html><div style='color:yellow;'>Yellow</div></html>");
//	    yellowBtn.addActionListener(actionListener);
	    // add to panel
	    //controls.add(greenBtn);
	   
	    controls.add(blackBtn);
	    controls.add(redBtn);
	    controls.add(blueBtn);
	    controls.add(clearBtn);
	    
//	    controls.add(redBtn);
//	    controls.add(magentaBtn);
//	    controls.add(yellowBtn);
//	    controls.add(clearBtn);
//	 
	    // add to content pane
	    content.add(controls, BorderLayout.SOUTH);
	 
	    frame.setSize(600, 600);
	    // can close frame
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    // show the swing paint result
	    frame.setVisible(true);
	    // Now you can try our Swing Paint !!! Enjoy :D
	  }
	 }

