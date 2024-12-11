package com.xworkz.collection1.runner;

import com.xworkz.collection1.dto.GiftDTO;

import java.util.*;
import java.util.stream.Collectors;

public class GiftDTORunner {

    public static void main(String[] args) {
        Set<GiftDTO> giftSet = new HashSet<>();
        giftSet.add(new GiftDTO(1, "Teddy Bear", 50.0, "Deepak", "Abishake"));
        giftSet.add(new GiftDTO(2, "Chocolate Box", 30.0, "Ravi", "Arun"));
        giftSet.add(new GiftDTO(3, "Flower Bouquet", 40.0, "Bharath", "Darshan"));
        giftSet.add(new GiftDTO(4, "Perfume", 60.0, "Bhargav", "Vijay"));
        giftSet.add(new GiftDTO(5, "Watch", 150.0, "Vinay", "Vinayaka"));
        giftSet.add(new GiftDTO(6, "Book", 25.0, "Darshan", "Keshav"));
        giftSet.add(new GiftDTO(7, "Laptop", 500.0, "Renuka", "Priya"));
        giftSet.add(new GiftDTO(8, "Phone", 300.0, "Eshaana", "Deepak"));
        giftSet.add(new GiftDTO(1, "Teddy Bear", 50.0, "Deepak", "Abishake")); // Duplicate
        giftSet.add(new GiftDTO(2, "Chocolate Box", 30.0, "Ravi", "Arun")); // Duplicate


        Set<GiftDTO> sortedByCostDesc = new TreeSet<>((g1, g2) -> Double.compare(g2.getCost(), g1.getCost()));
        sortedByCostDesc.addAll(giftSet);
        System.out.println("\nSorted by cost (desc): " + sortedByCostDesc);

        List<Integer> ids = giftSet.stream().
                map(GiftDTO::getId).
                collect(Collectors.toList());
        System.out.println("\nOnly IDs: " + ids);

        Set<GiftDTO> sortedByNameAndFromAsc = new TreeSet<>(
                Comparator.comparing(GiftDTO::getName).
                        thenComparing(GiftDTO::getFrom));
                                    sortedByNameAndFromAsc.
                                            addAll(giftSet);
        System.out.println("\nSorted by name and from (asc): " + sortedByNameAndFromAsc);
    }

}
