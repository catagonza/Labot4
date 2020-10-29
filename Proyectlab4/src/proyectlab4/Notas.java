package proyectlab4;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class Notas extends javax.swing.JFrame {
    DefaultTableModel md=new DefaultTableModel();
    DefaultTableModel md2=new DefaultTableModel();
    double totalA=0.0,totalR=0.0;
    public Notas() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Notas");
        md2.addColumn("Nombres");
        md2.addColumn("Definitiva");
        md2.addColumn("Resultado");
        Tablanotas.setModel(md);
        Tabladefinitivas.setModel(md2);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tablanotas = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Notas = new javax.swing.JTextField();
        Estudiantes = new javax.swing.JTextField();
        Creartabla = new javax.swing.JButton();
        Calculardefi = new javax.swing.JButton();
        Nombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Mostrarhistorial = new javax.swing.JButton();
        Perdida = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabladefinitivas = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        NombreA = new javax.swing.JTextField();
        Exportar = new javax.swing.JToggleButton();
        Cargar = new javax.swing.JToggleButton();
        Export = new javax.swing.JToggleButton();
        Salir = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Notas de los estudiantes:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 7, 167, 26));

        Tablanotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Tablanotas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 44, -1, 232));

        jLabel2.setText("Número de estudiantes:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 48, -1, -1));

        jLabel3.setText("Número de notas:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 86, 115, -1));

        Notas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotasActionPerformed(evt);
            }
        });
        getContentPane().add(Notas, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 83, 116, -1));

        Estudiantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstudiantesActionPerformed(evt);
            }
        });
        getContentPane().add(Estudiantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 45, 116, -1));

        Creartabla.setText("Crear tabla");
        Creartabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreartablaActionPerformed(evt);
            }
        });
        getContentPane().add(Creartabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 138, 107, -1));

        Calculardefi.setText("Calcular definitivas");
        Calculardefi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalculardefiActionPerformed(evt);
            }
        });
        getContentPane().add(Calculardefi, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 138, -1, -1));

        Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreActionPerformed(evt);
            }
        });
        getContentPane().add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 215, 135, -1));

        jLabel4.setText("Nombre del estudiante:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 218, 125, -1));

        Mostrarhistorial.setText("Mostrar historial");
        Mostrarhistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarhistorialActionPerformed(evt);
            }
        });
        getContentPane().add(Mostrarhistorial, new org.netbeans.lib.awtextra.AbsoluteConstraints(507, 264, 112, -1));

        Perdida.setText("Perdida del curso");
        Perdida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PerdidaActionPerformed(evt);
            }
        });
        getContentPane().add(Perdida, new org.netbeans.lib.awtextra.AbsoluteConstraints(685, 264, 135, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Notas definitivas:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 167, 26));

        Tabladefinitivas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(Tabladefinitivas);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, 240));

        jLabel6.setText("Nombre csv:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, 90, 20));
        getContentPane().add(NombreA, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 360, 200, -1));

        Exportar.setText("Exportar Notas");
        Exportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportarActionPerformed(evt);
            }
        });
        getContentPane().add(Exportar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 410, 130, -1));

        Cargar.setText("Cargar");
        Cargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarActionPerformed(evt);
            }
        });
        getContentPane().add(Cargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 410, -1, -1));

        Export.setText("Exportar Definitivas");
        Export.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExportActionPerformed(evt);
            }
        });
        getContentPane().add(Export, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 450, 150, -1));

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        getContentPane().add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 580, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NotasActionPerformed

    private void EstudiantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstudiantesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EstudiantesActionPerformed

    private void NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreActionPerformed

    private void MostrarhistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarhistorialActionPerformed
        int j=0;
        boolean esta=false;
        for (int i = 0; i < Tablanotas.getRowCount(); i++) {
            String t=Tablanotas.getValueAt(i,0).toString();
            String tf= Nombre.getText();
            if (t.equals(tf)) {
              j=i; esta=true;
            }
        }
        if (esta) {
        DefaultCategoryDataset dts=new DefaultCategoryDataset();
        String s="";
        for (int i = 1; i < Tablanotas.getColumnCount(); i++) {
            s="nota "+Integer.toString(i);
            dts.addValue(Double.parseDouble(Tablanotas.getValueAt(j,i).toString()),"NOTAS",s);
        }
        JFreeChart ch= ChartFactory.createLineChart(Tablanotas.getValueAt(j,0).toString(),
                "N° NOTA",
                "NOTA", 
                dts,PlotOrientation.VERTICAL,
                true,
                true,
                false);
        ChartPanel panel=new ChartPanel(ch);
        JFrame ventana= new JFrame("");
        ventana.setVisible(true);
        ventana.setSize(800, 600);
        ventana.add(panel);
        }
        else{
        JOptionPane.showMessageDialog(null, "El nombre ingresado no se encuentra."
                + "\nIngrese un nombre diferente.");
        }
        Nombre.setText("");
    }//GEN-LAST:event_MostrarhistorialActionPerformed

    private void PerdidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PerdidaActionPerformed
        DefaultPieDataset dts=new DefaultPieDataset();
        dts.setValue("Aprobados",totalA);
        dts.setValue("Reprobados",totalR);
        JFreeChart ch= ChartFactory.createPieChart("Perdida",dts,true,true,false);
        ChartPanel panel=new ChartPanel(ch);
        JFrame ventana= new JFrame("");
        ventana.setVisible(true);
        ventana.setSize(800, 600);
        ventana.add(panel);
    }//GEN-LAST:event_PerdidaActionPerformed

    private void CreartablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreartablaActionPerformed
         md=new DefaultTableModel();
         md.addColumn("Nombres");
         int columnas=Integer.parseInt(Notas.getText());
          for(int i=0;i<columnas;i++)
         {
          md.addColumn("Nota "+( i+1));
         }
         int filas=Integer.parseInt(Estudiantes.getText());
         for(int i=0;i<filas;i++)
         {
          md.addRow(new Object[columnas]);
          }
         Tablanotas.setModel(md);
         Estudiantes.setText("");
         Notas.setText("");
    }//GEN-LAST:event_CreartablaActionPerformed

    private void ExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportarActionPerformed
         ArrayList<String[]> lista=new ArrayList<String[]>();
        for (int i = 0; i < Tablanotas.getRowCount(); i++) {
            String[] aux =new String[Tablanotas.getColumnCount()];
            for (int j = 0; j < Tablanotas.getColumnCount(); j++) {
            aux[j]=(String) Tablanotas.getValueAt(i, j);
            }
            lista.add(aux);
        }
        if (NombreA != null) {
            Exportar(lista,";",NombreA.getText()+".csv");
        }
        else {Exportar(lista,";","Tablanotas.csv");}
        NombreA.setText("");
    }//GEN-LAST:event_ExportarActionPerformed

    private void CargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarActionPerformed
        Extraer(NombreA.getText());
        NombreA.setText("");
    }//GEN-LAST:event_CargarActionPerformed

    private void CalculardefiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalculardefiActionPerformed
        double  Aprobo=0.0,Reprobo=0.0;
        totalA=0;totalR=0;
        double suma=0.0, NumeroN=Tablanotas.getColumnCount()-1;
        String resultado="",n="";
        double[] promedio=new double[Tablanotas.getRowCount()];
        
        DefaultTableModel md;
        String data[][]={};String cab[]={"Nombre","Definitiva","Resultado"};
        md=new DefaultTableModel(data,cab);
        for (int j=0;j<Tablanotas.getRowCount();j++)
        {
            suma=0;
            for (int i = 1; i < Tablanotas.getColumnCount(); i++) {
                suma+=Double.parseDouble(Tablanotas.getValueAt(j,i).toString());
            }
            promedio[j]=suma/NumeroN;
            if (promedio[j]<3) {resultado="Reprobado";totalR++;}
            else{resultado="Aprobado";totalA++;}
            n=Tablanotas.getValueAt(j,0).toString();
            
            String datos[]={n,Double.toString(promedio[j]),resultado};
            md.addRow(datos);
        }
        Tabladefinitivas.setModel(md);
    }//GEN-LAST:event_CalculardefiActionPerformed
    
    private void ExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExportActionPerformed
         ArrayList<String[]> lista2=new ArrayList<String[]>();
         for (int i = 0; i < Tabladefinitivas.getRowCount(); i++) {
            String[] aux =new String[Tabladefinitivas.getColumnCount()];
            for (int j = 0; j < Tabladefinitivas.getColumnCount(); j++) {
            aux[j]=(String) Tabladefinitivas.getValueAt(i, j);
            }
            lista2.add(aux);
         }
         if (NombreA != null) {
            Exportar(lista2,";",NombreA.getText()+".csv");}
         else {Exportar(lista2,";","TablaDefinitivas.csv");}
         NombreA.setText("");
    }//GEN-LAST:event_ExportActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        if (JOptionPane.showConfirmDialog(rootPane, "¿Salir de la aplicación?",
                "Notas", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE) == JOptionPane.YES_OPTION)
        {System.exit(0);
        }
        else{
                setDefaultCloseOperation(0);
        } 
    }//GEN-LAST:event_SalirActionPerformed
     public void Extraer(String a){
    
        File currentDirFile = new File(".");
        String path=System.getProperty("user.dir");
        Extraccion archivo=new Extraccion(path+"\\"+a+".csv");
        try{
             List<Estructura> lista=archivo.crearListado();
             md=new DefaultTableModel();
             md.addColumn("Nombres");
             for (int i = 1; i < lista.get(0).Nota.size(); i++) {
                md.addColumn("Nota "+i);
            }
             for (int i = 0; i < lista.size(); i++) {
                md.addRow(lista.get(i).Nota.toArray());
            }
            Tablanotas.setModel(md);
        }
        catch(FileNotFoundException ex){
            Logger.getLogger(Notas.class.getName()).log(Level.SEVERE,null,ex);
        }

    }
    public void Exportar(ArrayList<String[]> thingsToWrite, String separator, String fileName){
    try (FileWriter writer = new FileWriter(fileName)){
        for (String[] strings : thingsToWrite) {
            for (int i = 0; i < strings.length; i++) {
                writer.append(strings[i]);
                if(i < (strings.length-1))
                    writer.append(separator);
            }
            writer.append(System.lineSeparator());
        }
        writer.flush();
    } catch (IOException e) {
        e.printStackTrace();
    }
    }
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Notas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calculardefi;
    private javax.swing.JToggleButton Cargar;
    private javax.swing.JButton Creartabla;
    private javax.swing.JTextField Estudiantes;
    private javax.swing.JToggleButton Export;
    private javax.swing.JToggleButton Exportar;
    private javax.swing.JButton Mostrarhistorial;
    private javax.swing.JTextField Nombre;
    private javax.swing.JTextField NombreA;
    private javax.swing.JTextField Notas;
    private javax.swing.JButton Perdida;
    private javax.swing.JToggleButton Salir;
    private javax.swing.JTable Tabladefinitivas;
    private javax.swing.JTable Tablanotas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
