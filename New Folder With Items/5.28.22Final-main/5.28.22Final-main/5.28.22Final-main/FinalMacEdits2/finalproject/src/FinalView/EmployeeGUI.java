
package FinalView;

import FinalModel.Employee;
import FinalModel.EmployeeCRUD;
import java.awt.*;
import javax.swing.*;
import javax.swing.JTabbedPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

//JAVA STANDALONE 
public class EmployeeGUI extends JFrame {
    public static final int width=400;
    public static final int height=510;
    
    
    
    private Employee emp;
    private Employee emp1;
    private Employee emp2;
    private Employee emp3;
    
    private EmployeeCRUD crud=new EmployeeCRUD();
  //panels
    private JTabbedPane tp;
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    private JPanel panel4;
    private JTable table4; // tables only work with arrays and objects
//PANEL 1 Objects
    private JLabel lblTitle;
    private JLabel lbllname;
    private JLabel lblfname;
    private JLabel lbladdress1;
    private JLabel lbladdress2;
    private JLabel lblcity;
    private JLabel lblstate;
    private JLabel lblDOB;
    private JLabel lblsalary;
    
    private JTextField txtlname;
    private JTextField txtfname;
    private JTextField txtaddress1;
    private JTextField txtaddress2;
    private JTextField txtcity;
    private JTextField txtstate;
    private JTextField txtDOB;
    private JTextField txtsalary;
    
    private JButton btnSave;
    private JButton btnClear;
    
    
 //PANEL 2 OBJECTS
    private JLabel lblTitle2;
    private JLabel lblid2;
    private JLabel lbllname2;
    private JLabel lblfname2;
    private JLabel lbladdress12;
    private JLabel lbladdress22;
    private JLabel lblcity2;
    private JLabel lblstate2;
    private JLabel lblDOB2;
    private JLabel lblsalary2;
    
    private JTextField txtid2;
    private JTextField txtlname2;
    private JTextField txtfname2;
    private JTextField txtaddress12;
    private JTextField txtaddress22;
    private JTextField txtcity2;
    private JTextField txtstate2;
    private JTextField txtDOB2;
    private JTextField txtsalary2;
    
    private JButton btnSearch2;
    private JButton btnDelete2;
    private JButton btnClear2;
    
    //PANEL 3 OBJECTS
    private JLabel lblTitle3;
    private JLabel lblid3;
    private JLabel lbllname3;
    private JLabel lblfname3;
    private JLabel lbladdress13;
    private JLabel lbladdress23;
    private JLabel lblcity3;
    private JLabel lblstate3;
    private JLabel lblDOB3;
    private JLabel lblsalary3;
    
    private JTextField txtid3;
    private JTextField txtlname3;
    private JTextField txtfname3;
    private JTextField txtaddress13;
    private JTextField txtaddress23;
    private JTextField txtcity3;
    private JTextField txtstate3;
    private JTextField txtDOB3;
    private JTextField txtsalary3;
    
    private JButton btnSearch3;
    private JButton btnUpdate3;
    private JButton btnClear3;
    
    public EmployeeGUI()
    {
        super();//call itself
        createPanel();
        setFrame();
        
    }
    private void createPanel()
    {
        super.setLayout(null);
        tp=new JTabbedPane();
        panel1=new JPanel(null);
        panel2=new JPanel(null);
        panel3=new JPanel(null);
        panel4=new JPanel(new BorderLayout());

    //=============
    //PANEL 1 SETUP
    //=============
        panel1.setSize(400, 480);
        lblTitle=new JLabel("EMPLOYEE INPUT DATA");
        lblTitle.setFont(new Font("Verdana", Font.BOLD, 16));
        lblTitle.setHorizontalAlignment(JLabel.CENTER);
        lblTitle.setForeground(Color.BLUE);
        lblTitle.setBounds(100, 20, 220, 30);
        panel1.add(lblTitle);
        
        lbllname=new JLabel("Last Name : ");
        txtlname=new JTextField(20);
        lbllname.setHorizontalAlignment(JLabel.RIGHT);
        lbllname.setBounds(100, 70, 100,25);
        txtlname.setBounds(200, 70, 100,25);
        panel1.add(lbllname);
        panel1.add(txtlname);
        
        lblfname=new JLabel("First Name : ");
        txtfname=new JTextField(20);
        lblfname.setHorizontalAlignment(JLabel.RIGHT);
        lblfname.setBounds(100, 105, 100,25);
        txtfname.setBounds(200, 105, 100,25);
        panel1.add(lblfname);
        panel1.add(txtfname);

        lbladdress1=new JLabel("Address 1 : ");
        txtaddress1=new JTextField(20);
        lbladdress1.setHorizontalAlignment(JLabel.RIGHT);
        lbladdress1.setBounds(100, 140, 100,25);
        txtaddress1.setBounds(200, 140, 120,25);
        panel1.add(lbladdress1);
        panel1.add(txtaddress1);
        
        lbladdress2=new JLabel("Address 2 : ");
        txtaddress2=new JTextField(20);
        lbladdress2.setHorizontalAlignment(JLabel.RIGHT);
        lbladdress2.setBounds(100, 175, 100,25);
        txtaddress2.setBounds(200, 175, 120,25);
        panel1.add(lbladdress2);
        panel1.add(txtaddress2);
        
        lblcity=new JLabel("City : ");
        txtcity=new JTextField(20);
        lblcity.setHorizontalAlignment(JLabel.RIGHT);
        lblcity.setBounds(100, 210, 100,25);
        txtcity.setBounds(200, 210, 100,25);
        panel1.add(lblcity);
        panel1.add(txtcity);

        lblstate=new JLabel("State : ");
        txtstate=new JTextField(20);
        lblstate.setHorizontalAlignment(JLabel.RIGHT);
        lblstate.setBounds(100, 245, 100,25);
        txtstate.setBounds(200, 245, 100,25);
        panel1.add(lblstate);
        panel1.add(txtstate);
        
        lblDOB=new JLabel("DOB : ");
        txtDOB=new JTextField(20);
        lblDOB.setHorizontalAlignment(JLabel.RIGHT);
        lblDOB.setBounds(100, 280, 100,25);
        txtDOB.setBounds(200, 280, 100,25);
        panel1.add(lblDOB);
        panel1.add(txtDOB);
        
        lblsalary=new JLabel("Salary : ");
        txtsalary=new JTextField(20);
        lblsalary.setHorizontalAlignment(JLabel.RIGHT);
        lblsalary.setBounds(100, 315, 100,25);
        txtsalary.setBounds(200, 315, 100,25);
        panel1.add(lblsalary);
        panel1.add(txtsalary);

        btnSave=new JButton("Save Employee");
        btnSave.addActionListener(new Save());
        btnSave.setBounds(80, 360, 130, 25);
        panel1.add(btnSave);
        
        btnClear=new JButton("Clear");
        btnClear.addActionListener(new Clear());
        btnClear.setBounds(230, 360, 100, 25);
        panel1.add(btnClear);
   //=============
   //PANEL 2 SETUP
   //=============
        panel2.setSize(400, 480);
        lblTitle2=new JLabel("EMPLOYEE DELETE DATA");
        lblTitle2.setFont(new Font("Verdana", Font.BOLD, 16));
        lblTitle2.setHorizontalAlignment(JLabel.CENTER);
        lblTitle2.setForeground(Color.BLUE);
        lblTitle2.setBounds(100, 20, 230, 30);
        panel2.add(lblTitle2);
        
        lblid2=new JLabel("Employee ID : ");
        txtid2=new JTextField(20);
        lblid2.setHorizontalAlignment(JLabel.RIGHT);
        lblid2.setBounds(100, 70, 100,25);
        txtid2.setBounds(200, 70, 100,25);
        panel2.add(lblid2);
        panel2.add(txtid2);
        
        lbllname2=new JLabel("Last Name : ");
        txtlname2=new JTextField(20);
        lbllname2.setHorizontalAlignment(JLabel.RIGHT);
        lbllname2.setBounds(100, 105, 100,25);
        txtlname2.setBounds(200, 105, 100,25);
        txtlname2.setEditable(false);
        panel2.add(lbllname2);
        panel2.add(txtlname2);
        
        lblfname2=new JLabel("First Name : ");
        txtfname2=new JTextField(20);
        lblfname2.setHorizontalAlignment(JLabel.RIGHT);
        lblfname2.setBounds(100, 140, 100,25);
        txtfname2.setBounds(200, 140, 100,25);
        txtfname2.setEditable(false);
        panel2.add(lblfname2);
        panel2.add(txtfname2);
        
        lbladdress12=new JLabel("Address 1 : ");
        txtaddress12=new JTextField(20);
        lbladdress12.setHorizontalAlignment(JLabel.RIGHT);
        lbladdress12.setBounds(100, 175, 100,25);
        txtaddress12.setBounds(200, 175, 120,25);
        txtaddress12.setEditable(false);
        panel2.add(lbladdress12);
        panel2.add(txtaddress12);
        
        lbladdress22=new JLabel("Address 2 : ");
        txtaddress22=new JTextField(20);
        lbladdress22.setHorizontalAlignment(JLabel.RIGHT);
        lbladdress22.setBounds(100, 210, 100,25);
        txtaddress22.setBounds(200, 210, 120,25);
        txtaddress22.setEditable(false);
        panel2.add(lbladdress22);
        panel2.add(txtaddress22);
        
        lblcity2=new JLabel("City : ");
        txtcity2=new JTextField(20);
        lblcity2.setHorizontalAlignment(JLabel.RIGHT);
        lblcity2.setBounds(100, 245, 100,25);
        txtcity2.setBounds(200, 245, 100,25);
        txtcity2.setEditable(false);
        panel2.add(lblcity2);
        panel2.add(txtcity2);
        
        lblstate2=new JLabel("State : ");
        txtstate2=new JTextField(20);
        lblstate2.setHorizontalAlignment(JLabel.RIGHT);
        lblstate2.setBounds(100, 280, 100,25);
        txtstate2.setBounds(200, 280, 100,25);
        txtstate2.setEditable(false);
        panel2.add(lblstate2);
        panel2.add(txtstate2);
        
        lblDOB2=new JLabel("DOB : ");
        txtDOB2=new JTextField(20);
        lblDOB2.setHorizontalAlignment(JLabel.RIGHT);
        lblDOB2.setBounds(100, 315, 100,25);
        txtDOB2.setBounds(200, 315, 100,25);
        txtDOB2.setEditable(false);
        panel2.add(lblDOB2);
        panel2.add(txtDOB2);
        
        lblsalary2=new JLabel("Salary : ");
        txtsalary2=new JTextField(20);
        lblsalary2.setHorizontalAlignment(JLabel.RIGHT);
        lblsalary2.setBounds(100, 350, 100,25);
        txtsalary2.setBounds(200, 350, 100,25);
        txtsalary2.setEditable(false);
        panel2.add(lblsalary2);
        panel2.add(txtsalary2);
        
        btnSearch2=new JButton("Search");
        btnSearch2.addActionListener(new Search2());
        btnSearch2.setBounds(70, 390, 80, 25);
        panel2.add(btnSearch2);
        
        btnDelete2=new JButton("Delete");
        //btnDelete2.addActionListener(new Delete2());
        btnDelete2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               boolean x=false;
               try{
                   x=crud.deleteUser(emp2.getId());
               }
               catch(Exception ex){
                   System.out.println(ex);
               }
               if(x){
                   JOptionPane.showMessageDialog(null,"You just deleted an Employee # "+emp2.getId());   
               }
               else{
                    JOptionPane.showMessageDialog(null,"Unsuccesful Delete");  
               }
            }
        });
        
        btnDelete2.setBounds(160, 390, 80, 25);
        btnDelete2.setEnabled(false);
        panel2.add(btnDelete2);
        
        btnClear2=new JButton("Clear");
        btnClear2.addActionListener(new Clear2());
        btnClear2.setBounds(250, 390, 80, 25);
        btnClear2.setEnabled(false);
        panel2.add(btnClear2);    
    
    
     //=============
     //PANEL 3 SETUP
     //=============
        panel3.setSize(400, 480);
        lblTitle3=new JLabel("EMPLOYEE UPDATE DATA");
        lblTitle3.setFont(new Font("Verdana", Font.BOLD, 16));
        lblTitle3.setHorizontalAlignment(JLabel.CENTER);
        lblTitle3.setForeground(Color.BLUE);
        lblTitle3.setBounds(100, 20, 230, 30);
        panel3.add(lblTitle3);
        
        lblid3=new JLabel("Employee ID : ");
        txtid3=new JTextField(20);
        lblid3.setHorizontalAlignment(JLabel.RIGHT);
        lblid3.setBounds(100, 70, 100,25);
        txtid3.setBounds(200, 70, 100,25);
        panel3.add(lblid3);
        panel3.add(txtid3);
        
        lbllname3=new JLabel("Last Name : ");
        txtlname3=new JTextField(20);
        lbllname3.setHorizontalAlignment(JLabel.RIGHT);
        lbllname3.setBounds(100, 105, 100,25);
        txtlname3.setBounds(200, 105, 100,25);
        txtlname3.setEditable(false);
        panel3.add(lbllname3);
        panel3.add(txtlname3);
        
        lblfname3=new JLabel("First Name : ");
        txtfname3=new JTextField(20);
        lblfname3.setHorizontalAlignment(JLabel.RIGHT);
        lblfname3.setBounds(100, 140, 100,25);
        txtfname3.setBounds(200, 140, 100,25);
        txtfname3.setEditable(false);
        panel3.add(lblfname3);
        panel3.add(txtfname3);
        
        lbladdress13=new JLabel("Address 1 : ");
        txtaddress13=new JTextField(20);
        lbladdress13.setHorizontalAlignment(JLabel.RIGHT);
        lbladdress13.setBounds(100, 175, 100,25);
        txtaddress13.setBounds(200, 175, 120,25);
        txtaddress13.setEditable(false);
        panel3.add(lbladdress13);
        panel3.add(txtaddress13);
        
        lbladdress23=new JLabel("Address 2 : ");
        txtaddress23=new JTextField(20);
        lbladdress23.setHorizontalAlignment(JLabel.RIGHT);
        lbladdress23.setBounds(100, 210, 100,25);
        txtaddress23.setBounds(200, 210, 120,25);
        txtaddress23.setEditable(false);
        panel3.add(lbladdress23);
        panel3.add(txtaddress23);
        
        lblcity3=new JLabel("City : ");
        txtcity3=new JTextField(20);
        lblcity3.setHorizontalAlignment(JLabel.RIGHT);
        lblcity3.setBounds(100, 245, 100,25);
        txtcity3.setBounds(200, 245, 100,25);
        txtcity3.setEditable(false);
        panel3.add(lblcity3);
        panel3.add(txtcity3);
        
        lblstate3=new JLabel("State : ");
        txtstate3=new JTextField(20);
        lblstate3.setHorizontalAlignment(JLabel.RIGHT);
        lblstate3.setBounds(100, 280, 100,25);
        txtstate3.setBounds(200, 280, 100,25);
        txtstate3.setEditable(false);
        panel3.add(lblstate3);
        panel3.add(txtstate3);
        
        lblDOB3=new JLabel("DOB : ");
        txtDOB3=new JTextField(20);
        lblDOB3.setHorizontalAlignment(JLabel.RIGHT);
        lblDOB3.setBounds(100, 315, 100,25);
        txtDOB3.setBounds(200, 315, 100,25);
        txtDOB3.setEditable(false);
        panel3.add(lblDOB3);
        panel3.add(txtDOB3);
        
        lblsalary3=new JLabel("Salary : ");
        txtsalary3=new JTextField(20);
        lblsalary3.setHorizontalAlignment(JLabel.RIGHT);
        lblsalary3.setBounds(100, 350, 100,25);
        txtsalary3.setBounds(200, 350, 100,25);
        txtsalary3.setEditable(false);
        panel3.add(lblsalary3);
        panel3.add(txtsalary3);
        
        btnSearch3=new JButton("Search");
        btnSearch3.addActionListener(new Search3());
        btnSearch3.setBounds(70, 390, 80, 25);
        panel3.add(btnSearch3);
        
        btnUpdate3=new JButton("Update");
        btnUpdate3.addActionListener(new Update3());
        btnUpdate3.setBounds(160, 390, 80, 25);
        btnUpdate3.setEnabled(false);
        panel3.add(btnUpdate3);
        
        btnClear3=new JButton("Clear");
        //btnClear3.addActionListener(new Clear3());
        btnClear3.setBounds(250, 390, 80, 25);
        btnClear3.setEnabled(false);
        panel3.add(btnClear3); 
     

     //=============
     //PANEL 4 SETUP
     //============= 
        // seting up the size of the panel
        panel4.setSize(320,440);
        String[] ColumNames={"ID","Last Name","First Name","Address 1","Address 2","City","State","DOB","Salary"};
        List <Employee> listEmployee = new ArrayList<>(); // array list of the type "Employee"
        listEmployee=(List<Employee>)crud.selectAllUsers(); // casted in case there are any issues with diff platforms 
        int counter = listEmployee.size();// getting the size of the rows to create the array 
        int r=0;
        
        String[][] temp = new String[counter][9];
       //iterator -- will do the loop until there are no more and will move to gust  
        for ( Employee gust: listEmployee){
            temp[r][0]=String.valueOf(gust.getId());
            temp[r][1]= gust.getLname();
            temp[r][2]=gust.getFname();
            temp[r][3]=gust.getAddress1();
            temp[r][4]=gust.getAddress2();
            temp[r][5]=gust.getCity();
            temp[r][6]=gust.getState();
            temp[r][7]=gust.getDOB();
            temp[r][8]=String.valueOf(gust.getSalary());
            r++;
        }
        //adapter
        DefaultTableModel model= new DefaultTableModel(temp,ColumNames);
        table4=new JTable(model); // implementing the table 4 Jtable 
        TableColumnModel columnModel=table4.getColumnModel();
        columnModel.getColumn(0).setPreferredWidth(20);
        columnModel.getColumn(1).setPreferredWidth(100);
        columnModel.getColumn(2).setPreferredWidth(100);
        columnModel.getColumn(3).setPreferredWidth(150);
        columnModel.getColumn(4).setPreferredWidth(100);
        columnModel.getColumn(5).setPreferredWidth(100);
        columnModel.getColumn(6).setPreferredWidth(100);
        columnModel.getColumn(7).setPreferredWidth(100);
        columnModel.getColumn(8).setPreferredWidth(80);
        
        table4.setSize(320,400);
        table4.setShowGrid(true);
        table4.setShowVerticalLines(true);
        table4.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        JScrollPane sp=new JScrollPane(table4,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        
        panel4.add(sp,BorderLayout.CENTER);
        
        
        
        //put together 
        tp.setBounds(0,0,400,470);
        tp.addTab("Insert", panel1);
        tp.addTab("Delete", panel2);
        tp.addTab("Update", panel3);
        tp.addTab("List", panel4);
        
        this.add(tp);
    }
    private void setFrame()
    {
        super.setTitle("Employee System Version 1.0");
        super.setDefaultCloseOperation(JFrame. EXIT_ON_CLOSE);
        super.setLocation(200,100);
        super.setResizable(false);
        super.setSize(width, height);
        super.setVisible(true);   
    }
    
private class Save implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e){
            String lname=txtlname.getText();
            String fname=txtfname.getText();
            String address1=txtaddress1.getText();
            String address2=txtaddress2.getText();
            String city=txtcity.getText();
            String state=txtstate.getText();
            String DOB=txtDOB.getText();
            double salary=Double.parseDouble(txtsalary.getText());
            emp=new Employee(lname, fname, address1, address2, city, state, DOB, salary);
            try
            {
            crud.insertUser(emp);
            }
            catch(Exception ex)
            {
                System.out.println(ex);
            }
            JOptionPane.showMessageDialog(null,"You just added an Employee");  
        }
    }
    
 
      private class Clear implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            txtlname.setText("");
            txtfname.setText("");
            txtaddress1.setText("");
            txtaddress2.setText("");
            txtcity.setText("");
            txtstate.setText("");
            txtDOB.setText("");
            txtsalary.setText("");
            txtlname.requestFocus();
        }
       
    }
      private class Search2 implements ActionListener{
          @Override
          public void actionPerformed(ActionEvent e){
              int id=Integer.parseInt(txtid2.getText());
              emp2=crud.selectUser(id);
              
              if(emp2 != null){
                txtlname2.setText(emp2.getLname());
                txtfname2.setText(emp2.getFname());
                txtaddress12.setText(emp2.getAddress1());
                txtaddress22.setText(emp2.getAddress2());
                txtcity2.setText(emp2.getCity());
                txtstate2.setText(emp2.getState());
                txtDOB2.setText(emp2.getDOB());
                txtsalary2.setText(String.valueOf(emp2.getSalary()));
                txtid2.requestFocus();
                btnDelete2.setEnabled(true);
                btnClear2.setEnabled(true);
              }
              else{
                  txtid2.setText("");
                  txtid2.requestFocus();
                  JOptionPane.showMessageDialog(null, "Employee # " + id+ " Was not found!!");
              }
          }
      }
      
      
      private class Search3 implements ActionListener{
          @Override
          public void actionPerformed(ActionEvent e){
              int id=Integer.parseInt(txtid3.getText());
              emp3=crud.selectUser(id);
              
              if(emp3 != null){
                txtlname3.setText(emp3.getLname());
                txtfname3.setText(emp3.getFname());
                txtaddress13.setText(emp3.getAddress1());
                txtaddress23.setText(emp3.getAddress2());
                txtcity3.setText(emp3.getCity());
                txtstate3.setText(emp3.getState());
                txtDOB3.setText(emp3.getDOB());
                //txtsalary3.setText(String.valueOf(emp3.getSalary()));
                txtid3.requestFocus();
            
            //buttons enabler   
                btnSearch3.setEnabled(false);
                btnUpdate3.setEnabled(true);
                btnClear3.setEnabled(true);
                txtid3.setEnabled(false);
            // buttons editable     
                txtlname3.setEditable(true);
                txtfname3.setEditable(true);
                txtaddress13.setEditable(true);
                txtaddress23.setEditable(true);
                txtcity3.setEditable(true);
                txtstate3.setEditable(true);
                txtDOB3.setEditable(true);
                txtsalary3.setEditable(true);    
              }
              else{
                  txtid3.setText("");
                  txtid3.requestFocus();
                  JOptionPane.showMessageDialog(null, "Employee # " + id+ " Was not found!!");
              }
          }
      }        
              
      
      private class Clear2 implements ActionListener{
          
          @Override
          public void actionPerformed(ActionEvent e){
            txtid2.setText("");
            txtlname2.setText("");
            txtfname2.setText("");
            txtaddress12.setText("");
            txtaddress22.setText("");
            txtcity2.setText("");
            txtstate2.setText("");
            txtDOB2.setText("");
            txtsalary2.setText("");
            txtid2.requestFocus();
            btnDelete2.setEnabled(false);
            btnClear2.setEnabled(false);
            
          }
      }
      private class Update3 implements ActionListener{
          @Override
          public void actionPerformed(ActionEvent e){
              boolean x = false;
              
              try{
                  emp3.setId(Integer.parseInt(txtid3.getText()));
                  emp3.setLname(txtlname3.getText());
                  emp3.setFname(txtfname3.getText());
                  emp3.setAddress1(txtaddress13.getText());
                  emp3.setAddress2(txtaddress23.getText());
                  emp3.setCity(txtcity3.getText());
                  emp3.setState(txtstate3.getText());
                  emp3.setDOB(txtDOB3.getText());
                  emp3.setSalary(Double.parseDouble(txtsalary3.getText()));
                  
                  System.out.println("Employee lname ==> "+emp3.getLname());
                  x=crud.updateUser(emp3);
                  
              }
              catch(Exception ex){
                  System.out.println(ex);
              }
              if(x){
                  JOptionPane.showMessageDialog(null, "You just updated the employee #"+emp3.getId());
              }
              else{
                   JOptionPane.showMessageDialog(null, "Unsuccessful update");
              }
                     
          }
      }
      
//        private class Clear3 implements ActionListener{
//          
//          @Override
//          public void actionPerformed(ActionEvent e){
//            txtid3.setText("");
//            txtlname3.setText("");
//            txtfname3.setText("");
//            txtaddress13.setText("");
//            txtaddress23.setText("");
//            txtcity3.setText("");
//            txtstate3.setText("");
//            txtDOB3.setText("");
//            txtsalary3.setText("");
//            txtid3.requestFocus();
//            //btnDelete3.setEnabled(false);
//            btnClear3.setEnabled(false);
//            
//          }
     
    
}
