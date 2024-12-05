package com.xworkz.detergent.runner;

import com.xworkz.detergent.dto.DetergentDTO;


import java.util.Arrays;
import java.util.Collection;

public class DetergentDTORunner {

    public static void main(String[] args) {
        Collection<DetergentDTO> detergents = Arrays.asList(
                new DetergentDTO("Tide", 95.0, 4, 10.0, "Amazon"),
                new DetergentDTO("Surf Excel", 150.0, 6, 15.0, "Flipkart"),
                new DetergentDTO("Ariel", 85.0, 3, 20.0, "Amazon"),
                new DetergentDTO("Rin", 70.0, 2, 5.0, "BigBasket"),
                new DetergentDTO("Wheel", 60.0, 5, 8.0, "Flipkart"),
                new DetergentDTO("Ghadi", 50.0, 4, 12.0, "JioMart"),
                new DetergentDTO("Nirma", 40.0, 3, 7.0, "BigBasket"),
                new DetergentDTO("Henko", 110.0, 7, 10.0, "Amazon"),
                new DetergentDTO("Mr. White", 120.0, 5, 18.0, "Flipkart"),
                new DetergentDTO("Sunlight", 80.0, 6, 9.0, "BigBasket")
        );
        System.out.println("Detergents with pricePerKg < 100:");
        detergents.stream()
                .filter(dto -> dto.getPricePerKg() < 100)
                .forEach(dto -> System.out.println(dto));


        System.out.println("===============================================");

        System.out.println("\nDetergents with quantity < 5:");
        detergents.stream()
                .filter(dto -> dto.getQuantity() < 5)
                .forEach(dto -> System.out.println(dto));

        System.out.println("===============================================");

        System.out.println("\nDetergents with discount > 10 and brand contains 'A':");
        detergents.stream()
                .filter(dto->dto.getDiscount() > 10 && dto.getBrand().contains("A"))
                .forEach(dto -> System.out.println(dto));



        System.out.println("===============================================");

        System.out.println("\nDetergents sold by Amazon, brand contains 'S', and quantity > 3:");
        detergents.stream()
                .filter(dto -> dto.getSoldBy().equals("Amazon") && dto.getBrand().contains("S") && dto.getQuantity() > 3)
                .forEach(d -> System.out.println(d));

        System.out.println("===============================================");

        System.out.println("\nDetergents sorted by pricePerKg in descending order:");
        detergents.stream()
                .sorted((dto1, dto2) -> Double.compare(dto2.getPricePerKg(), dto1.getPricePerKg()))
                .forEach(dto -> System.out.println(dto));

    }


    }

