package com.sqmanth.todo.controller;

import com.sqmanth.todo.controller.api.request.CreateTodoRequest;
import com.sqmanth.todo.controller.api.response.CreateTodoResponse;
import com.sqmanth.todo.service.TodoService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/todos")
@AllArgsConstructor
public class TodoController {
    private final TodoService todoService;
    @PostMapping
    public ResponseEntity<CreateTodoResponse> createTodo(@Valid @RequestBody CreateTodoRequest request) {
        // Logic to create a new todo item
        Long id =  todoService.createTodo(request).getId();
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(CreateTodoResponse.builder()
                        .id(id)
                        .build()
                );
    }
}
