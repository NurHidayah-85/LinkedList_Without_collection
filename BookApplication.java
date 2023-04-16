/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;


import java.util.*;


/**
 * Description : 
 * 1)Implementation LinkedList class to create A collection of elements of the same type.
 * 2)Using method add,removeFirst and remove by selected number.
 * 
 * Prepared for PROFESOR MADYA DR NURAZZAH BINTI ABD RAHMAN
 * 
 * LAB 3 (Topic : LinkedList)
* 
 * Submission date : 16 April 2023
 * Course : CSC508 (Data Structures)
 * 
 * @author NUR HIDAYAH BINTI ISHAK | ID: 2020496204 | Group: CS2304A
 * @version 1.0
 * 
 */

//the Book application
public class BookApplication
{
        // Main driver method
        public static void main(String[] args) {
            
         
           
            LinkedList  Blinked = new LinkedList ();// Create the LinkedList object
            Scanner s = new Scanner (System.in);// Create a Scanner object as input
            
            //initial attributes //  Input data for object
            String title, author;
            int year,i=0;
            double price;
            String choice;
            
            System.out.print("Please insert the book information: "); 
                        
            do{
                                             
                System.out.print("\nTitle: "); //Prompt title from the user
                title = s.nextLine();

                System.out.print("Publication Year: "); // Prompt year from the user
                year = Integer.parseInt(s.nextLine());
             
                System.out.print("Price: RM"); // Prompt price from the user
                price = Double.parseDouble(s.nextLine());
                
                System.out.print("Author's name: "); // Prompt author's name from the user
                author = s.nextLine();
               
                System.out.println("\nWant to add another book? (y/n)");
                System.out.print("Input: ");
                choice = s.nextLine();
                
                // Create and store data into object
                Book book = new Book(title, year, price, author);
                
                // Insert object at front into linked list
                Blinked.insertAtBack(book);
              
              
                
                if (("n").equals(choice) || ("N").equals(choice)) // If user wish to end the loop
                 {
                     System.out.println("");
                     break;
                 }
                

              }while (i < Blinked.size());
            
            System.out.println("----------------------------");
            Blinked.print(); // display the elements in the list
            

          
            System.out.println("----------------------------");
            System.out.println("The size of LinkedList is = " + Blinked.size()); // Display the number of LinkedList size
         
   
            Blinked.removeFromFront();//to remove the first element in LinkedList
             
            System.out.println("----------------------------");
            System.out.println("LinkedList after deletion of first element.");
            Blinked.print(); // display the elements in the list
            
            
            /*Scanner inputdel = new Scanner (System.in);// Create a Scanner object as input
            System.out.println("----------------------------");
            System.out.println(" Please enter a number of book element to remove: ");
            int numdel =Integer.parseInt (inputdel.nextLine()); */
           
                       
            
            Scanner inputnew = new Scanner (System.in);// Create a Scanner object as input
            System.out.println(" Please enter a number of book(s) to add: ");
            int number =Integer.parseInt (inputnew.nextLine());  //number of book(s) to add
                        
            for (i=0; i<number; i++){
                            
                System.out.print("\nTitle: "); //Prompt title from the user
                title = inputnew.nextLine();
             
                System.out.print("Publication Year: "); // Prompt year from the user
                year = Integer.parseInt(inputnew.nextLine());
   
                System.out.print("Price: RM"); // Prompt price from the user
                price = Double.parseDouble(inputnew .nextLine());
    
                System.out.print("Author's name: "); // Prompt author's name from the user
                author = inputnew.nextLine();
    
                Book book = new Book(title, year, price, author);
                
                Blinked.insertAtBack(book);
            }
            
           System.out.println("----------------------------");
           System.out.println("The new LinkedList after add new data element.");
           Blinked.print(); // display the elements in the list
             
            
            System.out.println("----------------------------");
            System.out.println("The number of new LinkedList size is = " + Blinked.size()); // Display the number of LinkedList size
     
            
            
        }
            
            
              
    }
        
            
   