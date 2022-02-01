package ru.job4j.di.model;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("ru.job4j.di.model");
        context.refresh();
        StartUI ui = context.getBean(StartUI.class);
        ui.add("Petr Arsentev");
        Store another = context.getBean(Store.class);
        another.add("Ivan Ivanov");
        another.getAll().forEach(System.out::println);
    }
}
