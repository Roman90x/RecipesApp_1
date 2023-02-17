package me.roman.recipesapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping
    public String runApplication() {
        return "Приложение запущено.";
    }
    @GetMapping("/info")
    public String info() {
        return "Имя ученика: Роман, " +
                "Название проекта: Приложение рецептов, " +
                "Дата создания проекта: 18.02.2023, " +
                "Описание проекта: Проект создан для работ с рецептами блюд, с использованием Spring Boot DevTools, Lombok, Spring Web. " +
                "Написан на языке Java (v.19)";
    }

}
