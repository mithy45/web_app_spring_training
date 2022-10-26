package fr.lernejo.todo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/todo")
public class TodoListController {
    private final ArrayList<Todo> todoList = new ArrayList<Todo>();

    public TodoListController(){};

    @GetMapping
    public ArrayList<Todo> getTodoList()
    {
        return todoList;
    }

    @PostMapping
    public void addTodo(@RequestBody Todo todo)
    {
        todoList.add(todo);
    }
}
