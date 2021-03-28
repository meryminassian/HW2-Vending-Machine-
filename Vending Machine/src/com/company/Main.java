package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String type = in.nextLine();
        String[] s = type.split(":");

        //s[0] is the ProductType
        //s[1] is the ProductIndex, i.e. the specific product// indexes 0, 1, 2
        //s[2] is the count of the wanted products

        Command command = new Command();
        if(s[0].equals("A")){
            command.setProductType(ProductType.DRINKS);
        } else if (s[0].equals("B")){
            command.setProductType(ProductType.CHIPS);
        } else if (s[0].equals("C")){
            command.setProductType(ProductType.CHOCOLATE);
        } else System.out.println("unknown");

        command.setProductIndex(Integer.parseInt(s[1]));
        command.setCount(Integer.parseInt(s[2]));

        VendingMachine vendingMachine = new VendingMachine();

        ArrayList<Product> products = vendingMachine.getProducts(command);
        //System.out.println(products.get(1)); //A:1:3--> sprite
        for (int i = 0; i < command.getCount(); i++) {
            products.get(i);
        }

        //for alt.
//        for (int i = 0; i < command.getCount(); i++) {
//            System.out.println(vendingMachine.getProduct(command));
//        }



    }
}
