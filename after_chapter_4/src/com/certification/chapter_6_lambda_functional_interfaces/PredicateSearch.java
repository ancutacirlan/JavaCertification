package com.certification.chapter_6_lambda_functional_interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateSearch {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        print(animals, a -> a.isCanHop());
        print(animals, a -> a.isCanSwim());
    }
    private static void print(List<Animal> animals, Predicate<Animal> checker) {
        for (Animal animal : animals) {
            if (checker.test(animal))
                System.out.print(animal.getSpecies() + " ");
        }
        System.out.println();
    }
}
