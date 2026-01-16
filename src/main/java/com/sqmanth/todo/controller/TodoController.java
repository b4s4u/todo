package com.sqmanth.todo.controller;

import com.sqmanth.todo.controller.api.request.CreateTodoRequest;
import com.sqmanth.todo.controller.api.response.CreateTodoResponse;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/todos")
public class TodoController {
    @PostMapping
    public CreateTodoResponse createTodo(@Valid @RequestBody CreateTodoRequest request) {
        // Logic to create a new todo item
        System.out.println("Creating todo: " + request);
        var response = new CreateTodoResponse();
        response.setId(1L); // Dummy ID for illustration
        return response;
    }
}
