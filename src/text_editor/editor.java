package text_editor;

import java.awt.*;
import java.awt.print.PrinterException;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
/**
 *
 * @author MANAN PAL
 */
public class editor extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String a, b, c;
    public static DefaultHighlighter.DefaultHighlightPainter highlightPainter = new DefaultHighlighter.DefaultHighlightPainter(Color.GREEN);
    Stack<Integer> ss = new Stack<Integer>();
    
    public editor() {
        initComponents();
    }
                              
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        t1 = new javax.swing.JTextArea();
        t2 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        a8 = new javax.swing.JMenuItem();
        a9 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        a3 = new javax.swing.JMenuItem();
        a4 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        a6 = new javax.swing.JMenuItem();
        a7 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        a1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        a2 = new javax.swing.JCheckBoxMenuItem();
        jMenu6 = new javax.swing.JMenu();
        new javax.swing.JPopupMenu.Separator();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Text Editor");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }

            @Override
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        t1.setColumns(20);
        t1.setLineWrap(true);
        t1.setRows(5);
        t1.setWrapStyleWord(true);
        t1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseExited(java.awt.event.MouseEvent evt) {
                t1MouseExited(evt);
            }
        });
        t1.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                t1KeyPressed(evt);
            }

            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                t1KeyReleased(evt);
            }

            @Override
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t1KeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(t1);

        t2.setEditable(false);
        t2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        t2.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("New");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Open");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        a8.setText("Save");
        a8.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a8ActionPerformed(evt);
            }
        });
        jMenu1.add(a8);

        a9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        a9.setText("Save As");
        a9.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a9ActionPerformed(evt);
            }
        });
        jMenu1.add(a9);

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem6.setText("Print");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);
        jMenu1.add(jSeparator1);

        jMenuItem5.setText("Exit");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        
        jMenuItem4.setText("Undo");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            @Override
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);
        jMenu2.add(jSeparator2);

        a3.setText("Cut");
        a3.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a3ActionPerformed(evt);
            }
        });
        jMenu2.add(a3);

        a4.setText("Copy");
        a4.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a4ActionPerformed(evt);
            }
        });
        jMenu2.add(a4);

        jMenuItem9.setText("Paste");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);
        jMenu2.add(jSeparator3);

        a6.setText("Find");
        a6.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a6ActionPerformed(evt);
            }
        });
        jMenu2.add(a6);

        a7.setText("Replace");
        a7.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a7ActionPerformed(evt);
            }
        });
        jMenu2.add(a7);
        jMenu2.add(jSeparator4);

        jMenuItem13.setText("Time/Date");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem13);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Format");

        a1.setSelected(true);
        a1.setText("Word Wrap");
        a1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });
        jMenu3.add(a1);

        jMenuItem14.setText("Font...");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem14);
        jMenu3.add(jSeparator6);

        jMenu5.setText("Text Color");

        jMenuItem8.setText("Red");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem8);

        jMenuItem10.setText("Blue");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem10);

        jMenuItem11.setText("Black");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem11);

        jMenuItem12.setText("White");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem12);

        jMenuItem16.setText("Green");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem16);

        jMenuItem17.setText("Yellow");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem17);

        jMenu3.add(jMenu5);

        jMenu7.setText("Background Color");

        jMenuItem18.setText("Red");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem18);

        jMenuItem19.setText("Blue");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem19);

        jMenuItem20.setText("Black");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem20);

        jMenuItem21.setText("White");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem21);

        jMenuItem22.setText("Green");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem22);

        jMenuItem23.setText("Yellow");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu7.add(jMenuItem23);

        jMenu3.add(jMenu7);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("View");

        a2.setSelected(true);
        a2.setText("Status Bar");
        a2.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2ActionPerformed(evt);
            }
        });
        jMenu4.add(a2);

        jMenuBar1.add(jMenu4);

        jMenu6.setText("About");

        jMenuItem3.setText("Help");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem3);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(t2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }                        

    private void t1MouseExited(java.awt.event.MouseEvent evt) {
    	
    }

    private void t1KeyTyped(java.awt.event.KeyEvent evt) {

    }

    private void t1KeyReleased(java.awt.event.KeyEvent evt) {
        
    	a3.setEnabled(true);
        a4.setEnabled(true);
        a6.setEnabled(true);
        a7.setEnabled(true);
        a8.setEnabled(true);
        a9.setEnabled(true);
        if (t1.getText().equals("")) {
            a3.setEnabled(false);
            a4.setEnabled(false);
            a6.setEnabled(false);
            a7.setEnabled(false);
            a8.setEnabled(false);
            a9.setEnabled(false);
        }
        if (a2.isSelected()) {
            int w = t1.getLineCount();
            t2.setText("Line " + w);
        }
    }

    private void t1KeyPressed(java.awt.event.KeyEvent evt) {
    	
    	int tt = evt.getKeyCode();
        if(tt == 8)
            ss.pop();
        else if(tt == 9 || tt == 10 || tt == 32 || (tt >= 48 && tt <= 57))
            ss.push(tt);
        else if((tt >= 65 && tt <= 90) || (tt >= 97 && tt <= 122)) {
            char cc = evt.getKeyChar();
            ss.push((int)cc);
        }
    }

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
        
        String d = t1.getText();
        if (!(d.equals(""))) {

            if (JOptionPane.showConfirmDialog(new JFrame(), "Do you want to save the changes made to the file ?", "Alert", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                try {
                    
                    String aa;
                    aa = JOptionPane.showInputDialog("Save as (.txt) :");
                    File myFile = new File("C:\\" + aa + ".txt");
                    FileWriter fw = new FileWriter(myFile.getAbsoluteFile(), true);
                    t1.write(fw);
                } catch (IOException ex) {
                    Logger.getLogger(editor.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                t1.setText("");
            }
        }
    }

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
        
    	t1.setText("");
        String Text;
        try {
            JFileChooser fc = new JFileChooser();
            fc.showOpenDialog(null);
            File f = fc.getSelectedFile();
            String q = f.getAbsolutePath();
            FileReader l = new FileReader(q);
            BufferedReader u = new BufferedReader(l);
            try {
                while ((Text = u.readLine()) != (null)) {
                    t1.append(Text + "\n");
                }
                t1.setText(t1.getText().substring(0, t1.getText().length() - 1));
                u.close();
            } catch (IOException ex) {
                Logger.getLogger(editor.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(editor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void a8ActionPerformed(java.awt.event.ActionEvent evt) {
        
    	if (JOptionPane.showConfirmDialog(new JFrame(), "This will save the file in the default location (LOCAL DISK E)", "Alert", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                
                File myFile = new File("E:\\untitled.txt");
                FileWriter fw = new FileWriter(myFile.getAbsoluteFile(), true);
                t1.write(fw);
            } catch (IOException ex) {
                Logger.getLogger(editor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void a9ActionPerformed(java.awt.event.ActionEvent evt) {
        
        JFileChooser fc = new JFileChooser();
        fc.showSaveDialog(null);
        File f = fc.getSelectedFile();
        try {
            File myFile = new File(f + ".txt");
            FileWriter fw = new FileWriter(myFile.getAbsoluteFile(), true);
            t1.write(fw);
        } catch (IOException ex) {
            Logger.getLogger(editor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {
        
        if (t1.getText().equals("")) {
            System.exit(0);
        }
        if (!(t1.getText().equals(""))) {
            if (JOptionPane.showConfirmDialog(new JFrame(), "Are you sure you want to exit without saving the file ?", "Alert", JOptionPane.YES_NO_OPTION) == JOptionPane.NO_OPTION) {
                JFileChooser fc = new JFileChooser();
                fc.showSaveDialog(null);
                File f = fc.getSelectedFile();
                try {
                    File myFile = new File(f + ".txt");
                    FileWriter fw = new FileWriter(myFile.getAbsoluteFile(), true);
                    t1.write(fw);
                } catch (IOException ex) {
                    Logger.getLogger(editor.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                System.exit(0);
            }
        }
    }

    private void a6ActionPerformed(java.awt.event.ActionEvent evt) {
        
        t1.getHighlighter().removeAllHighlights();
        String aa = t1.getText();
        String bb = JOptionPane.showInputDialog(rootPane, "Find :");
        for (int i = 0; i < aa.length() - bb.length(); i++) {
            String x = aa.substring(i, i + bb.length());
            if (x.equals(bb)) {
                try {
                    t1.getHighlighter().addHighlight(i, i + bb.length(), highlightPainter);
                } catch (BadLocationException ex) {
                    Logger.getLogger(editor.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {
        
        String aa;
        aa = t1.getText();
        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        t1.setText("" + aa.concat(dateFormat.format(cal.getTime())));
    }

    private void a1ActionPerformed(java.awt.event.ActionEvent evt) {
    	
        if (a1.isSelected() == true) {
            t1.setLineWrap(true);
            a2.setEnabled(false);
            a2.setSelected(false);
        }
        if (a1.isSelected() == false) {
            t1.setLineWrap(false);
            a2.setEnabled(true);
        }
        t2.setText("");
    }

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {
        
        new font().setVisible(true);
    }

    private void a2ActionPerformed(java.awt.event.ActionEvent evt) {
        
        if (a2.isEnabled() == true) {
            int w = t1.getLineCount();
            if (a2.isSelected()) {
                t2.setText("Line " + w);
            } else {
                t2.setText("");
            }
        }
    }

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {
        
        JOptionPane.showMessageDialog(rootPane, "By default, all the files are saved in local disk E. \n For any other problem contact : masco.united@gmail.com");
    }

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {
        
    }
    
    private void a7ActionPerformed(java.awt.event.ActionEvent evt) {
        
        String r, s;
        r = JOptionPane.showInputDialog(rootPane, "Find");
        s = JOptionPane.showInputDialog(rootPane, "Replace");
        String o = t1.getText();
        String p = o.replaceAll(r, s);
        t1.setText(p);
    }

    private void a3ActionPerformed(java.awt.event.ActionEvent evt) {
        
        t1.cut();
    }

    private void a4ActionPerformed(java.awt.event.ActionEvent evt) {
        
        t1.copy();
    }

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {
        
        t1.paste();
    }

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {
        
        try {
            
            t2.print();
        } catch (PrinterException ex) {
            Logger.getLogger(editor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {
        
        a1.setEnabled(true);
        a2.setEnabled(false);
        a2.setSelected(false);
        
        int flag = 0;
        
        BufferedReader brb;
		try {
			brb = new BufferedReader(new FileReader("fonts.txt"));
			if(brb.readLine() != null)
				flag = 1;
			brb.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
        if(flag == 1) {
        	try {
				BufferedReader br = new BufferedReader(new FileReader("fonts.txt"));
				String line1 = br.readLine().toString();
				String line2 = br.readLine().toString();
				String line3 = br.readLine().toString();
				br.close();
				String f1 = line1, f2 = line2, f3 = line3;
				Font x = null;
				if(f2.equals("PLAIN"))
					x = new Font(f1, Font.PLAIN, Integer.parseInt(f3));
				else if(f2.equals("BOLD"))
					x = new Font(f1, Font.BOLD, Integer.parseInt(f3));
				else
					x = new Font(f1, Font.ITALIC, Integer.parseInt(f3));
				t1.setFont(x);
				PrintWriter writer = new PrintWriter("fonts.txt","UTF-8");
				writer.print("");
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
        }
    }

    private void formWindowActivated(java.awt.event.WindowEvent evt) {
        
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
    }

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {
        
        t1.setForeground(Color.red);
    }

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {
        
        t1.setForeground(Color.blue);
    }

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {
        
        t1.setForeground(Color.black);
    }

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {
        
        t1.setForeground(Color.white);
    }

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {
        
        t1.setForeground(Color.green);
    }

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {
        
        t1.setForeground(Color.yellow);
    }

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {
        
        t1.setBackground(Color.red);
    }

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {
        
        t1.setBackground(Color.blue);
    }

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {
        
        t1.setBackground(Color.black);
    }

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {
        
        t1.setBackground(Color.white);
    }

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {
        
        t1.setBackground(Color.green);
    }

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {
        
        t1.setBackground(Color.yellow);
    }
    
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
    	ss.pop();
        String aa = "";
        for(int i = 0; i < ss.size(); i++) {
            char dd = (char)Integer.parseInt(ss.elementAt(i).toString());
            aa += dd;
        }
        t1.setText(aa);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new editor().setVisible(true);
            }
        });
    }
    // Variables declaration                     
    private javax.swing.JCheckBoxMenuItem a1;
    private javax.swing.JCheckBoxMenuItem a2;
    private javax.swing.JMenuItem a3;
    private javax.swing.JMenuItem a4;
    private javax.swing.JMenuItem a6;
    private javax.swing.JMenuItem a7;
    private javax.swing.JMenuItem a8;
    private javax.swing.JMenuItem a9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JTextArea t1;
    private javax.swing.JTextField t2;                   
}