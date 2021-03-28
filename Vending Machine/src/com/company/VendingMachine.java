package com.company;

import java.util.*;


public class VendingMachine {

    HashMap<ProductType, ArrayList<MyQueue<Product>>> board = new HashMap<>();

    private void initializeChips() {
        MyQueue<Product> doritos = new MyLinkedList<>();
        for (int i = 0; i < 10; i++) {
            doritos.add(new Doritos());
        }
        MyQueue<Product> lays = new MyLinkedList<>();
        for (int i = 0; i < 10; i++) {
            lays.add(new Lays());
        }
        MyQueue<Product> pringles = new MyLinkedList<>();
        for (int i = 0; i < 10; i++) {
            pringles.add(new Pringles());
        }

        ArrayList<MyQueue<Product>> chips = new ArrayList<>();
        chips.add(doritos);
        chips.add(lays);
        chips.add(pringles);
        board.put(ProductType.CHIPS, chips);

    }

    private void initializeChocolates() {
        MyQueue<Product> baunti = new MyLinkedList<>();
        for (int i = 0; i < 10; i++) {
            baunti.add(new Baunti());
        }
        MyQueue<Product> mars = new MyLinkedList<>();
        for (int i = 0; i < 10; i++) {
            mars.add(new Mars());
        }
        MyQueue<Product> snickers = new MyLinkedList<>();
        for (int i = 0; i < 10; i++) {
            snickers.add(new Snickers());
        }

        ArrayList<MyQueue<Product>> chocolates = new ArrayList<>();
        chocolates.add(mars);
        chocolates.add(baunti);
        chocolates.add(snickers);
        board.put(ProductType.CHOCOLATE, chocolates);

    }

    private void initializeDrinks() {
        MyQueue<Product> pepsi = new MyLinkedList<>();
        for (int i = 0; i < 10; i++) {
            pepsi.add(new Pepsi());
        }
        MyQueue<Product> cola = new MyLinkedList<>();
        for (int i = 0; i < 10; i++) {
            cola.add(new Cola());
        }
        MyQueue<Product> sprite = new MyLinkedList<>();
        for (int i = 0; i < 10; i++) {
            sprite.add(new Sprite());
        }

        ArrayList<MyQueue<Product>> drinks = new ArrayList<>();
        drinks.add(cola);
        drinks.add(sprite);
        drinks.add(pepsi);
        board.put(ProductType.DRINKS, drinks);
//        try{
//           board.put(ProductType.DRINKS, drinks);
//        }catch (NullPointerException e){
//            System.out.println("NullPointerException");
//        }

    }
    public VendingMachine() {
        initializeChips();
        initializeChocolates();
        initializeDrinks();
    }

    public ArrayList<Product> getProducts(Command command){
        if (command.getProductType().equals(ProductType.DRINKS)) {
            return board.get(ProductType.DRINKS).get(command.getProductIndex()).pollMultiple(command.getCount());

        } else if (command.getProductType().equals(ProductType.CHOCOLATE)) {
            return board.get(ProductType.CHOCOLATE).get(command.getProductIndex()).pollMultiple(command.getCount());
        } else if (command.getProductType().equals(ProductType.CHIPS)) {
            return board.get(ProductType.CHIPS).get(command.getProductIndex()).pollMultiple(command.getCount());
        } else return null;

    }


    //Alternative, without customized queue

//
//    HashMap<ProductType, ArrayList<Queue<Product>>> board = new HashMap<>();
//    public Product getProduct(Command command) {
//
//        if (command.getProductType().equals(ProductType.DRINKS)) {
//            for (int i = 1; i <= command.getCount(); i++) {
//                return board.get(ProductType.DRINKS).get(command.getProductIndex()).poll();
//            }
//        } else if (command.getProductType().equals(ProductType.CHOCOLATE)) {
//            for (int i = 1; i <= command.getCount(); i++) {
//                return board.get(ProductType.CHOCOLATE).get(command.getProductIndex()).poll();
//            }
//        } else if (command.getProductType().equals(ProductType.CHIPS)) {
//            for (int i = 1; i <= command.getCount(); i++) {
//                return board.get(ProductType.CHIPS).get(command.getProductIndex()).poll();
//            }
//        } else return null;
//        return null;
//    }
//
//
//    public VendingMachine() {
//        initializeDrinks();
//        initializeChocolates();
//        initializeChips();
//    }
//
//    private void initializeChips() {
//        Queue<Product> doritos = new LinkedList<>();
//        for (int i = 0; i < 10; i++) {
//            doritos.add(new Doritos());
//        }
//        Queue<Product> lays = new LinkedList<>();
//        for (int i = 0; i < 10; i++) {
//            lays.add(new Lays());
//        }
//        Queue<Product> pringles = new LinkedList<>();
//        for (int i = 0; i < 10; i++) {
//            pringles.add(new Pringles());
//        }
//
//        ArrayList<Queue<Product>> chips = new ArrayList<>();
//        chips.add(doritos);
//        chips.add(lays);
//        chips.add(pringles);
//        board.put(ProductType.CHOCOLATE, chips);
//    }
//
//    private void initializeChocolates() {
//        Queue<Product> baunti = new LinkedList<>();
//        for (int i = 0; i < 10; i++) {
//            baunti.add(new Baunti());
//        }
//        Queue<Product> mars = new LinkedList<>();
//        for (int i = 0; i < 10; i++) {
//            mars.add(new Mars());
//        }
//        Queue<Product> snickers = new LinkedList<>();
//        for (int i = 0; i < 10; i++) {
//            snickers.add(new Snickers());
//        }
//
//        ArrayList<Queue<Product>> chocolates = new ArrayList<>();
//        chocolates.add(mars);
//        chocolates.add(baunti);
//        chocolates.add(snickers);
//        board.put(ProductType.CHOCOLATE, chocolates);
//    }
//
//    private void initializeDrinks() {
//        Queue<Product> pepsi = new LinkedList<>();
//        for (int i = 0; i < 10; i++) {
//            pepsi.add(new Pepsi());
//        }
//        Queue<Product> cola = new LinkedList<>();
//        for (int i = 0; i < 10; i++) {
//            cola.add(new Cola());
//        }
//        Queue<Product> sprite = new LinkedList<>();
//        for (int i = 0; i < 10; i++) {
//            sprite.add(new Sprite());
//        }
//
//        ArrayList<Queue<Product>> drinks = new ArrayList<>();
//        drinks.add(cola);
//        drinks.add(sprite);
//        drinks.add(pepsi);
//        board.put(ProductType.DRINKS, drinks);
//    }
}