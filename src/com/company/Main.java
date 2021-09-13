package com.company;


import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        long timeStart = System.currentTimeMillis();
        PhonecallsPool pool = new PhonecallsPool();
        ATX atx = new ATX(pool);
        atx.start();

        List<Operator> operators = Stream.of(
                new Operator("Оператор 1", pool),
                new Operator("Оператор 2", pool),
                new Operator("Оператор 3", pool),
                new Operator("Оператор 4", pool),
                new Operator("Оператор 5", pool))
                .collect(Collectors.toList());
        for (Operator operator : operators) {
            operator.start();
        }
        for (Operator operator : operators) {
            operator.join();
        }

        long timeFinish = System.currentTimeMillis();
        System.out.println("Время программы: " + (timeFinish - timeStart));
    }
}
