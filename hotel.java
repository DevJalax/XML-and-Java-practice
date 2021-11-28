import java.io.*;
import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;


public class Customer{
    
    int table_no,quantity;
    char ordered_food[20],order_no[20];
    float pay,amount;

    public Customer(){
        table_no = 0;
        quantity = 0;
        pay = 0;
       amount = 20;
       ordered_food = 'null';
       order_no = 'null';
    }

    public void input(){
     Scanner s = new Scanner(System.in);
     System.out.println("Enter the table number");
     table_no = s.nextInt();
     System.out.println("Enter the order number");
     order_no = s.next();
     System.out.println("Enter the ordered food");
     ordered_food = s.next();
     DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
     LocalDateTime dt = LocalDateTime.now();
    }
}

public class Waiter extends Customer{
    String Menu[][] = new String[10][20];

    public Waiter(){

     Menu[][] = {"Idly,Dosa,Pongal,Poori,Uthappam,Gheeroast,Parotta,Sappathi,Fried rice,Gobi 65"}

    }

    public void food_check(){
        if(ordered_food==Menu){
            System.out.println("Food available is" + ordered_food);
        }
        else
        System.out.println("Out of stock");
    }

    public void menu_show(){
        for(int i=0;i<10;i++){
        System.out.println(Menu[i]);
        }
    }
     public bill_show(){
         System.out.println("Table number" + table_no);
         System.out.println("Order number" + order_no);
         System.out.println("Ordered food" + ordered_food);
         System.out.println("Amount paid" + Pay+amount);
     }

}

public static void main(String[] args){
    Waiter w;
    w.menu_show();
    w.input();
    w.food_check();
    w.bill_show();
}