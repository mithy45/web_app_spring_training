package fr.lernejo.todo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/api")
public class TodoListController {
    private final ArrayList<Todo> todoList = new ArrayList<Todo>();

    public TodoListController(){};

    @GetMapping("/todo")
    public ArrayList<Todo> getTodoList()
    {
        return todoList;
    }

    @PostMapping("/todo")
    public void addTodo(@RequestBody Todo todo)
    {
        todoList.add(todo);
    }
}
