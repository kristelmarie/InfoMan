import java.awt.Color;
import java.awt.EventQueue;

import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.Font;
import javax.swing.DefaultComboBoxModel;


public class preOrderSelection {

    JFrame selectionFrame;
    private JComboBox<String> cBoxSize001;
    private JComboBox<String> cBoxQuantity001;
    private JComboBox<String> cBoxSize002;
    private JComboBox<String> cBoxQuantity002;
    private JCheckBox cboxUnif001;
    private JCheckBox cboxUnif002;


    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    preOrderSelection window = new preOrderSelection();
                    window.selectionFrame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public preOrderSelection() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        selectionFrame = new JFrame();
        selectionFrame.getContentPane().setBackground(new Color(53, 64, 143));
        selectionFrame.setBounds(100, 100, 1170, 670);
        selectionFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        selectionFrame.getContentPane().setLayout(null);

        JPanel selectionPanel = new JPanel();
        selectionPanel.setBackground(Color.WHITE);
        selectionPanel.setBounds(15, 140, 1120, 450);
        selectionFrame.getContentPane().add(selectionPanel);
        selectionPanel.setLayout(null);

        
        // trad blouse
        cboxUnif001 = new JCheckBox("");
        cboxUnif001.setBackground(new Color(255, 255, 255));
        cboxUnif001.setBounds(10, 10, 20, 20);
        selectionPanel.add(cboxUnif001);
        
        JLabel lblUnif001 = new JLabel("Traditional Uniform Blouse");
        lblUnif001.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblUnif001.setBounds(40, 12, 170, 15);
        selectionPanel.add(lblUnif001);
        
        JLabel lblProduct001 = new JLabel("NUBEUNIF0001");
        lblProduct001.setFont(new Font("Tahoma", Font.PLAIN, 10));
        lblProduct001.setBounds(80, 28, 70, 15);
        selectionPanel.add(lblProduct001);
        
        JLabel lblPrice001 = new JLabel("₱560");
        lblPrice001.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice001.setBounds(220, 12, 40, 15);
        selectionPanel.add(lblPrice001);

        cBoxSize001 = new JComboBox<>();
        cBoxSize001.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxSize001.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL"}));
        cBoxSize001.setBounds(270, 12, 40, 20);
        selectionPanel.add(cBoxSize001);

        cBoxQuantity001 = new JComboBox<>();
        cBoxQuantity001.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxQuantity001.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
        cBoxQuantity001.setBounds(320, 12, 40, 20);
        selectionPanel.add(cBoxQuantity001);
        
        
        // trad polo
        cboxUnif002 = new JCheckBox("");
        cboxUnif002.setBackground(new Color(255, 255, 255));
        cboxUnif002.setBounds(10, 50, 20, 20);
        selectionPanel.add(cboxUnif002);
        
        JLabel lblUnif002 = new JLabel("Traditional Uniform Polo");
        lblUnif002.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblUnif002.setBounds(40, 52, 170, 15);
        selectionPanel.add(lblUnif002);
        
        JLabel lblProduct002 = new JLabel("NUBEUNIF0002");
        lblProduct002.setFont(new Font("Tahoma", Font.PLAIN, 10));
        lblProduct002.setBounds(80, 68, 70, 15);
        selectionPanel.add(lblProduct002);
        
        JLabel lblPrice002 = new JLabel("₱560");
        lblPrice002.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPrice002.setBounds(220, 52, 40, 15);
        selectionPanel.add(lblPrice002);

        cBoxSize002 = new JComboBox<>();
        cBoxSize002.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxSize002.setModel(new DefaultComboBoxModel(new String[] {"XS", "S", "M", "L", "XL"}));
        cBoxSize002.setBounds(270, 50, 40, 20);
        selectionPanel.add(cBoxSize002);

        cBoxQuantity002 = new JComboBox<>();
        cBoxQuantity002.setFont(new Font("Tahoma", Font.PLAIN, 10));
        cBoxQuantity002.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
        cBoxQuantity002.setBounds(320, 50, 40, 20);
        selectionPanel.add(cBoxQuantity002);
        
   
        
        
        
        
        
        // go to cart button
        JButton btnCart = new JButton("Go to Cart");
        btnCart.setBounds(500, 600, 100, 25);
        selectionFrame.getContentPane().add(btnCart);
        btnCart.addActionListener(e -> {
            String selectedItems = getSelectedItems();
            preOrderCart cart = new preOrderCart(selectedItems);
            cart.cartFrame.setVisible(true);
        });

        
        JLabel lblSelectionBanner = new JLabel("");
        lblSelectionBanner.setHorizontalAlignment(SwingConstants.CENTER);
        lblSelectionBanner.setIcon(new ImageIcon(preOrderSelection.class.getResource("Main Banner.png")));
        lblSelectionBanner.setBounds(0, 0, 1170, 120);
        selectionFrame.getContentPane().add(lblSelectionBanner);
    }
    
    private String getSelectedItems() {
        StringBuilder selectedItems = new StringBuilder();
        if (cboxUnif001.isSelected()) {
            int quantity001 = Integer.parseInt((String) cBoxQuantity001.getSelectedItem());
            int totalAmount001 = quantity001 * 560; 
            selectedItems.append("<html>PRODUCT NAME: Traditional Uniform Blouse<br/>")
                         .append("PRODUCT ID: NUBEUNIF0001<br/>")
                         .append("PRICE: ₱560<br/>")
                         .append("SIZE: ").append(cBoxSize001.getSelectedItem()).append("<br/>")
                         .append("QUANTITY: ").append(quantity001).append("<br/>")
                         .append("TOTAL AMOUNT: ₱").append(totalAmount001).append("</html>");
        }
        else if (cboxUnif002.isSelected()) {
            int quantity002 = Integer.parseInt((String) cBoxQuantity002.getSelectedItem());
            int totalAmount002 = quantity002 * 560; 
            if (selectedItems.length() > 0) {
                // If data for the first checkbox is already added, add a separator
                selectedItems.append("<br/><br/>");
            }
            selectedItems.append("<html>PRODUCT NAME: Traditional Uniform Polo<br/>")
                         .append("PRODUCT ID: NUBEUNIF0002<br/>")
                         .append("PRICE: ₱560<br/>")
                         .append("SIZE: ").append(cBoxSize002.getSelectedItem()).append("<br/>")
                         .append("QUANTITY: ").append(quantity002).append("<br/>")
                         .append("TOTAL AMOUNT: ₱").append(totalAmount002).append("</html>");
        }
        else {
        
        }
        return selectedItems.toString();
    }
    
    
            
       
    
    
}