package com.epam.mjc;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class InterfaceCreator {

    public Predicate<List<String>> isValuesStartWithUpperCase() {

        return listOfStrings -> {

            for (String element : listOfStrings) {

                if (!Character.isUpperCase(element.charAt(0))) {

                    return false;
                }
            }

            return true;
        };
    }

    public Consumer<List<Integer>> addEvenValuesAtTheEnd() {

        return listOfIntegers -> {

            List<Integer> doublesOfEvenIntegers = new ArrayList<>();

            for (int element : listOfIntegers) {

                if (element % 2 == 0) {

                    doublesOfEvenIntegers.add(element);
                }
            }

            listOfIntegers.addAll(doublesOfEvenIntegers);
        };
    }

    public Supplier<List<String>> filterCollection(List<String> values) {

        return () -> {

            List<String> filteredList = new ArrayList<>();

            for (String element : values) {

                if ((Character.isUpperCase(element.charAt(0)))
                    && (element.charAt(element.length() - 1) == '.')
                    && (element.split(" ").length > 3)) {

                    filteredList.add(element);
                }
            }

            return filteredList;
        };
    }

    public Function<List<String>, Map<String, Integer>> stringSize() {

        return listOfStrings -> {

            Map<String, Integer> mapOfStrings = new HashMap<>();

            for (String element : listOfStrings) {

                mapOfStrings.put(element, element.length());
            }

            return mapOfStrings;
        };
    }

    public BiFunction<List<Integer>, List<Integer>, List<Integer>> concatList() {

        return (list1, list2) -> {

           List<Integer> resultList = new ArrayList<>();

            resultList.addAll(list1);
            resultList.addAll(list2);

            return resultList;
        };
    }
}
