package text_editor;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

/**
 *
 * @author MANAN PAL
 */
public class font extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public font() {
        initComponents();
    }
    @SuppressWarnings({ "unchecked", "rawtypes" })                          
    private void initComponents() {

        c1 = new javax.swing.JComboBox();
        c2 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        c3 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Font Window");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        c1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        c1.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"<html><font face='Agency FB'>Agency FB", "<html><font face='Algerian'>Algerian", "<html><font face='Arial'>Arial", "<html><font face='Arial Rounded MT'>Arial Rounded MT", "<html><font face='Arial Unicode MS'>Arial Unicode MS", "<html><font face='Baskerville Old Face'>Baskerville Old Face", "<html><font face='Bauhaus 93'>Bauhaus 93", "<html><font face='Bell MT'>Bell MT", "<html><font face='Berlin Sans FB'>Berlin Sans FB", "<html><font face='Bernard MT'>Bernard MT", "<html><font face='Blackladder ITC'>Blackadder ITC", "<html><font face='Bodoni MT'>Bodoni MT", "<html><font face='Book Antiqua'>Book Antiqua", "<html><font face='Bookman Old Style'>Bookman Old Style", "<html><font face='Bookshelf Symbol 7'>Bookshelf Symbol 7", "<html><font face='Bradley Hand ITC'>Bradley Hand ITC", "<html><font face='Britannic'>Britannic", "<html><font face='Broadway'>Broadway", "<html><font face='Calibri'>Calibri", "<html><font face='Californian FB'>Californian FB", "<html><font face='Calisto MT'>Calisto MT", "<html><font face='Cambria'>Cambria", "<html><font face='Candara'>Candara", "<html><font face='Castellar'>Castellar", "<html><font face='Centaur'>Centaur", "<html><font face='Century'>Century", "<html><font face='Century Gothic'>Century Gothic", "<html><font face='Chiller'>Chiller", "<html><font face='Colona MT'>Colonna MT", "<html><font face='Comic Sans MS'>Comic Sans MS", "<html><font face='Consolas'>Consolas", "<html><font face='Constantia'>Constantia", "<html><font face='Cooper'>Cooper", "<html><font face='Corbel'>Corbel", "<html><font face='Courier'>Courier", "<html><font face='Curlz MT'>Curlz MT", "<html><font face='Edwardian Script ITC'>Edwardian Script ITC", "<html><font face='Elephant'>Elephant", "<html><font face='Engravers MT'>Engravers MT", "<html><font face='Fixedsys'>Fixedsys", "<html><font face='Forte'>Forte", "<html><font face='French Script MT'>French Script MT", "<html><font face='Georgia'>Georgia", "<html><font face='Gigi'>Gigi", "<html><font face='Gill Sans'>Gill Sans", "<html><font face='Harlow Solid'>Harlow Solid", "<html><font face='Harrington'>Harrington", "<html><font face='Jokerman'>Jokerman", "<html><font face='Kristen ITC'>Kristen ITC", "<html><font face='Kunstler Script'>Kunstler Script", "<html><font face='Lucida Calligraphy'>Lucida Calligraphy", "<html><font face='Magneto'>Magneto", "<html><font face='Mistral'>Mistral", "<html><font face='Monotype Corsiva'>Monotype Corsiva", "<html><font face='Palace Script MT'>Palace Script MT", "<html><font face='Pristina'>Pristina", "<html><font face='Rage'>Rage", "<html><font face='Ravie'>Ravie", "<html><font face='Snap ITC'>Snap ITC", "<html><font face='Tahoma'>Tahoma", "<html><font face='Times New Roman'>Times New Roman", "<html><font face='TW Cen MT'>Tw Cen MT", "<html><font face='Viner Hand ITC'>Viner Hand ITC", "<html><font face='Vivaldi'>Vivaldi", "<html><font face='Vladimir Script'>Vladimir Script"}));

        c2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        c2.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"PLAIN", "<html><b>BOLD", "<html><i>ITALIC"}));

        jLabel2.setText("Font Style :");

        jLabel3.setText("Size :");

        t4.setEditable(false);
        t4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        t4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        t4.setText("AaBbCc");
        t4.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t4ActionPerformed(evt);
            }
        });

        jButton3.setText("OK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("Font :");

        c3.setFont(new java.awt.Font("Tahoma", 0, 12));
        c3.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"8", "9", "10", "11", "12", "14", "16", "18", "20", "22", "24", "26", "28", "36", "48", "72"}));

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("PREVIEW");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addContainerGap())
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(t4)
                        .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(c1)
                                .addComponent(c2)
                                .addComponent(c3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(t4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1)
                                .addComponent(jButton2)
                                .addComponent(jButton3))
                        .addContainerGap())
        );

        pack();
    }

    private void t4ActionPerformed(java.awt.event.ActionEvent evt) {
    	
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {

        String d, e, f;
        e = c2.getSelectedItem().toString();
        f = c3.getSelectedItem().toString();
        d = c1.getSelectedItem().toString();
        int z = d.indexOf(">");
        d = d.substring(z + 1, d.length());
        int zz = d.indexOf(">");
        d = d.substring(zz + 1, d.length());
        try {
			PrintWriter writer = new PrintWriter("fonts.txt","UTF-8");
			writer.println(d+"\n"+e+"\n"+f);
			writer.close();
			this.dispose();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
        
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        this.dispose();
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

        String d, f;
        int g, e;
        d = c1.getSelectedItem().toString();
        e = c2.getSelectedIndex();
        f = c3.getSelectedItem().toString();
        g = Integer.parseInt(f);
        Font q = null;
        int z = d.indexOf(">");
        d = d.substring(z + 1, d.length());
        int zz = d.indexOf(">");
        d = d.substring(zz + 1, d.length());
        if (e == 0) {
            q = new Font(d, Font.PLAIN, g);
        }
        if (e == 1) {
            q = new Font(d, Font.BOLD, g);
        }
        if (e == 2) {
            q = new Font(d, Font.ITALIC, g);
        }
        t4.setFont(q);
    }

    private void formWindowActivated(java.awt.event.WindowEvent evt) {

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width / 2 - this.getSize().width / 2, dim.height / 2 - this.getSize().height / 2);
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
            java.util.logging.Logger.getLogger(font.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new font().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    @SuppressWarnings("rawtypes")
	private javax.swing.JComboBox c1;
    @SuppressWarnings("rawtypes")
	private javax.swing.JComboBox c2;
    @SuppressWarnings("rawtypes")
	private javax.swing.JComboBox c3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField t4;                   
}
