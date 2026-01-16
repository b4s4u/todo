package com.sqmanth.todo.service;

import com.sqmanth.todo.controller.api.request.CreateTodoRequest;
import com.sqmanth.todo.repository.TodoRepository;
import com.sqmanth.todo.repository.entity.TodoEntity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TodoService {
    private final TodoRepository todoRepository;
    public TodoEntity createTodo(CreateTodoRequest createTodoRequest){
        // Logic to create a new todo item
        TodoEntity todoEntity = TodoEntity.builder()
                .title(createTodoRequest.getTitle())
                .description(createTodoRequest.getDescription())
                .dueDate(createTodoRequest.getDueDateEpochMillis())
                .build();
        TodoEntity todo = todoRepository.save(todoEntity);
        return todo; // Fake ID for illustration
    }
}
