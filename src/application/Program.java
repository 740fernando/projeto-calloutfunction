package application;

import entities.Product;
import services.ProductService;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    public static void main(String args[]){

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv",500.00));
        list.add(new Product("Geladeira",800.00));
        list.add(new Product("mouse",30.00));

        ProductService ps = new ProductService();

        double sum = ps.filteredSum(list, p ->p.getName().charAt(0) == 'G'); // funcao que recebe uma funcao lambda como argumento


        System.out.println("Sum = "+String.format("%.2f",sum));
    }
}
