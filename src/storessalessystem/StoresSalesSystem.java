/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package storessalessystem;

import java.util.Scanner;

import SSSviews.loginView;

/**
 *
 * @author lukastk
 */
public class StoresSalesSystem {
    // Creates Scanner to read Keyboard input
    Scanner scan = new Scanner(System.in);
    
    // Shows the login screen 
    public void login(){
        // Start
        System.out.println("\t ~~~Log in~~~ ");
        
        System.out.print("\n Username: ");
        String username = scan.nextLine();
        
        System.out.print("\n Password: ");
        String password = scan.nextLine();
        
        if("Gatitos".equals(username) && "Gatos".equals(password)){
            //Prints if both the username or password is correct
            System.out.println("\n Welcome to Our System. Click any key to Enter");
            scan.nextLine();
            mainPage();
        }
        else{
            //Prints if either the username or password is incorrect
            System.out.println("\n Incorrect password or username. Click any key to try Again! \n");
            scan.nextLine();
            login();
        }
    }
    
    // Shows the main page screen 
    public void mainPage(){
        // Variable Declaration
        int menuOption, subMenuOption;
        
        // Main Menu printing
        System.out.println(" Main menu:");
        System.out.println(" 1.Menu \n 2.Consults \n 3.Reports");
        System.out.print("\n Enter Number of wished option:");
        System.out.print("\n > ");
        
        // Menu Selection
        menuOption = scan.nextInt();
        scan.nextLine();
        System.out.println();
        
        switch(menuOption){
            case 1:
                // Case if option 1 is selected
                System.out.println(" Sub Menu:");
                System.out.println(" 1.Start New Sale \n ---------------- \n 2.Close Session \n 3.Close System");
                System.out.print("\n Enter Number of wished option:");
                System.out.print("\n > ");
                
                // Sub menu Selection
                subMenuOption = scan.nextInt();
                scan.nextLine();
                System.out.println();
                
                switch (subMenuOption){
                    case 1:
                        
                    break;
                    
                    case 2:
                        
                    break;
                    
                    case 3:
                        
                    break;
                    
                    default:
                        
                    break;
                    
                }
                
            break;
            
            case 2:
                // Case if option 2 is selected
                System.out.println(" Sub Menu:");
                System.out.println(" 1.Add New Product \n 2.Edit Products \n 3.Delete Products \n ---------------- \n 4.View Products");
                System.out.print("\n Enter Number of wished option:");
                System.out.print("\n > ");
                
                // Sub menu Selection
                subMenuOption = scan.nextInt();
                scan.nextLine();
                System.out.println();
                
                switch (subMenuOption){
                    case 1:
                        
                    break;
                    
                    case 2:
                        
                    break;
                    
                    case 3:
                        
                    break;
                    
                    case 4:
                        
                    break;
                    
                    default:
                        
                    break;
                }
            break;
            
            case 3:
                // Case if option 3 is selected
                System.out.println(" Sub Menu:");
                System.out.println(" 1.Start Daily Report \n 2.End Daily Report \n 3.View Daily Report \n ----------------  \n 4.View Past Reports");
                System.out.print("\n Enter Number of wished option:");
                System.out.print("\n > ");
                
                // Sub menu Selection
                subMenuOption = scan.nextInt();
                scan.nextLine();
                System.out.println();
                
                switch (subMenuOption){
                    case 1:
                        
                    break;
                    
                    case 2:
                        
                    break;
                    
                    case 3:
                        
                    break;
                    
                    case 4:
                        
                    break;
                    
                    default:
                        
                    break;
                }
            break;
            
            default:
                // Case if a option not in the menu is selected
                System.out.println("This isn't a valid option. Click any key to try again");
                scan.nextLine();
                mainPage();
            break;
        }
    }
    
    // Shows the new sale screen
    public void startNewSale(){
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creates an object of the class to be able to access all its functions
        StoresSalesSystem SSS = new StoresSalesSystem();
        SSS.login();
        
        // Creates an object of the main Log in form
        //loginView log = new loginView();
        
        // Sets the form to be visible
        //log.setVisible(true);
    }
    
}
