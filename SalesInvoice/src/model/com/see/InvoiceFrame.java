/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.com.see;

import com.action.TableSelcetionListener;
import com.action.InvoiceAction;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;
import newp.com.InvoiceHeader;
import newp.com.InvoiceHeaderTable;
import newp.com.InvoiceLine;


/**
 *
 * @author HP
 */
public class InvoiceFrame extends javax.swing.JFrame {

    /**
     * Creates new form InvoiceFrame
     */
    public InvoiceFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        hTbl = new javax.swing.JTable();
        creatInvoice = new javax.swing.JButton();
        deletInvoice = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        numLbl = new javax.swing.JLabel();
        dateLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        totelLbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lTbl = new javax.swing.JTable();
        newLine = new javax.swing.JButton();
        deletLine = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        loadM = new javax.swing.JMenuItem();
        saveM = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        hTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        hTbl.getSelectionModel().addListSelectionListener(selectionListener);
        jScrollPane1.setViewportView(hTbl);

        creatInvoice.setText(" New Invoice");
        creatInvoice.setActionCommand("New Invoice");
        creatInvoice.setDefaultCapable(false);
        creatInvoice.addActionListener(actionListener);

        deletInvoice.setText("Delet Invoice");
        deletInvoice.addActionListener(actionListener);

        jLabel1.setText("Invoice Num");

        jLabel2.setText("Invoice Date");

        jLabel3.setText("Customer Name");

        jLabel4.setText("Invoice Totel");

        lTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(lTbl);

        newLine.setText("New Line");
        newLine.addActionListener(actionListener);

        deletLine.setText("Delet Line");
        deletLine.addActionListener(actionListener);

        jMenu1.setText("File");

        loadM.setText("Load Files");
        loadM.addActionListener(actionListener);
        loadM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadMActionPerformed(evt);
            }
        });
        jMenu1.add(loadM);

        saveM.setText("Save Files");
        saveM.addActionListener(actionListener);
        jMenu1.add(saveM);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(creatInvoice)
                        .addGap(127, 127, 127)
                        .addComponent(deletInvoice)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(18, 18, 18))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(33, 33, 33)))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(32, 32, 32)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(35, 35, 35)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(numLbl)
                                    .addComponent(totelLbl)
                                    .addComponent(nameLbl)
                                    .addComponent(dateLbl)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(newLine)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(deletLine)
                        .addGap(58, 58, 58))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(numLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(dateLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(nameLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(totelLbl)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(creatInvoice)
                    .addComponent(deletInvoice)
                    .addComponent(newLine)
                    .addComponent(deletLine))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_loadMActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InvoiceFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton creatInvoice;
    private javax.swing.JLabel dateLbl;
    private javax.swing.JButton deletInvoice;
    private javax.swing.JButton deletLine;
    private javax.swing.JTable hTbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable lTbl;
    private javax.swing.JMenuItem loadM;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JButton newLine;
    private javax.swing.JLabel numLbl;
    private javax.swing.JMenuItem saveM;
    private javax.swing.JLabel totelLbl;
    // End of variables declaration//GEN-END:variables
   private InvoiceAction actionListener=new InvoiceAction(this);
   private ArrayList<InvoiceLine>LinesArray;
   private ArrayList<InvoiceHeader>invoiceArr;
   private InvoiceHeaderTable headerTable;
   public static SimpleDateFormat date=new SimpleDateFormat("dd-MM-YYYY");
   private TableSelcetionListener selectionListener=new TableSelcetionListener(this);

    public ArrayList<InvoiceLine> getLinesArray() {
        return LinesArray;
    }

    public void setLineArray(ArrayList<InvoiceLine> LineArray) {
        this.LinesArray = LineArray;
    }
   
    public void setInvoiceArr(ArrayList<InvoiceHeader> invoiceArr) {
        this.invoiceArr = invoiceArr;
    }

    public ArrayList<InvoiceHeader> getInvoiceArr() {
        return invoiceArr;
    }
    
   
    public InvoiceHeader getobj(int core){
        for (InvoiceHeader in :invoiceArr){
            if(in.getNumb()==core){
                return in;
            }
        }
      return null;  
    }

    public InvoiceHeaderTable getHeaderTable() {
        return headerTable;
    }

    public void setHeaderTable(InvoiceHeaderTable headerTable) {
        this.headerTable = headerTable;
    }

    public JTable gethTbl() {
        return hTbl;
    }

    public JTable getlTbl() {
        return lTbl;
    }

    public JLabel getDateLbl() {
        return dateLbl;
    }

    public JLabel getNameLbl() {
        return nameLbl;
    }

    public JLabel getNumLbl() {
        return numLbl;
    }

    public JLabel getTotelLbl() {
        return totelLbl;
    }

    public InvoiceAction getActionListener() {
        return actionListener;
    }
    HeaderDialog headerDialog = new HeaderDialog(this);

    
       
    

   

}
