//HERNANDEZ QUIROZ JOSELYN BETZABE 
// 4°B DE ING. SISTEMAS COMPUTACIONALES 

import javax.swing.*;
import java.awt.event.*;
public class Calculadora extends JFrame{
   //---------------------------------------------------------------------------------------------
  JLabel Letrero, lblCant1, lblCant2, lblRes;
  JButton btnSumar, btnRestar, btnMulti, btnDivi, btnSalir;
  JTextField txtCant1, txtCant2, txtRes;
  JPanel panel;
  //---------------------------------------------------------------------------------------------
  public Calculadora(){
   initComponents();
  }
  //---------------------------------------------------------------------------------------------
  private void initComponents(){
    setSize(650, 200);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    txtCant1 = new JTextField(10);
    txtCant2 = new JTextField(10);
    txtRes = new JTextField(10);
    txtRes.setEditable(false);
   
    
       Letrero = new JLabel("Calculadora Con interfas");
       lblCant1 = new JLabel("numero 1: ");
       lblCant2 = new JLabel("\nnumero 2: ");
       btnSumar = new JButton("Suma");
       btnSumar.setMnemonic('s');
       btnRestar = new JButton("Resta");
       btnRestar.setMnemonic('R');
       btnMulti = new JButton("Multiplicacion");
       btnMulti.setMnemonic('M');
       btnDivi = new JButton("Divicion");
       btnDivi.setMnemonic('D');
       btnSalir = new JButton("Salir");
       btnSalir.setMnemonic('S');
    
    btnSumar.addMouseListener(new Suma());
    btnRestar.addMouseListener(new Resta());
    btnMulti.addMouseListener(new Multiplicacion());
    btnDivi.addMouseListener(new Divicion());
    btnSalir.addMouseListener(new MyListener());
    
    panel = new JPanel();
    panel.add(Letrero);
    panel.add(lblCant1);
    panel.add(txtCant1);
    panel.add(lblCant2);
    panel.add(txtCant2);
    panel.add(txtRes);
    panel.add(btnSumar);
    panel.add(btnRestar);
    panel.add(btnMulti);
    panel.add(btnDivi);
    panel.add(btnSalir);
    
    setTitle("Calculadora");
    setContentPane(panel);
    setVisible(true);
  }
  
   private class Suma extends MouseAdapter{
    float n1 = 0, n2 = 0, suma;
   //---------------------------------------------------------------------------------------------
    public void mouseClicked(MouseEvent event){ 
       String num1 = txtCant1.getText();
       n1 = Integer.parseInt(num1);
       String num2 = txtCant2.getText();
       n2 = Integer.parseInt(num2);
      try{
           suma = n1 + n2;
           txtRes.setText(String.valueOf(suma));          
      }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null, "El valor no es correcto");
        txtCant1.setText(" "); 
        txtCant1.requestFocus();
        txtCant2.setText(" "); 
        txtCant2.requestFocus();
        txtRes.setText("0.00");
      }
    }
  }
  //---------------------------------------------------------------------------------------------
  private class Resta extends MouseAdapter{
    float n1 = 0, n2 = 0, suma;
   
    public void mouseClicked(MouseEvent event){ 
       String num1 = txtCant1.getText();
       n1 = Integer.parseInt(num1);
       String num2 = txtCant2.getText();
       n2 = Integer.parseInt(num2);
      try{
           suma = n1 - n2;
           txtRes.setText(String.valueOf(suma));           
      }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null, "El valor no es correcto");
        txtCant1.setText(" "); 
        txtCant1.requestFocus();
        txtCant2.setText(" "); 
        txtCant2.requestFocus();
        txtRes.setText("0.00");
      }
    }
  }
  //---------------------------------------------------------------------------------------------
  private class Multiplicacion extends MouseAdapter{
    float n1 = 0, n2 = 0, suma;
   
    public void mouseClicked(MouseEvent event){ 
       String num1 = txtCant1.getText();
       n1 = Integer.parseInt(num1);
       String num2 = txtCant2.getText();
       n2 = Integer.parseInt(num2);
      try{
           suma = n1 * n2;
           txtRes.setText(String.valueOf(suma));          
      }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null, "El valor no es correcto");
        txtCant1.setText(" "); 
        txtCant1.requestFocus();
        txtCant2.setText(" "); 
        txtCant2.requestFocus();
        txtRes.setText("0.00");
      }
    }
  }
  //---------------------------------------------------------------------------------------------
  private class Divicion extends MouseAdapter{
    float n1 = 0, n2 = 0, suma;
   
    public void mouseClicked(MouseEvent event){ 
       String num1 = txtCant1.getText();
       n1 = Integer.parseInt(num1);
       String num2 = txtCant2.getText();
       n2 = Integer.parseInt(num2);
      try{
           suma = n1 / n2;
           txtRes.setText(String.valueOf(suma));         
      }catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null, "El valor no es correcto");
        txtCant1.setText(" "); 
        txtCant1.requestFocus();
        txtCant2.setText(" "); 
        txtCant2.requestFocus();
        txtRes.setText("0.00");
      }
    }
  }
  //---------------------------------------------------------------------------------------------
  private class MyListener extends MouseAdapter
  {
   public void mouseClicked(MouseEvent event)
   {
      System.exit(0);
   }
  }
}