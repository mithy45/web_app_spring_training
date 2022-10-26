package fr.lernejo.todo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/todo")
public class TodoListController {
    private TodoRepository todoRepository;

    public TodoListController(TodoRepository todoRepository){
        this.todoRepository = todoRepository;
    };

    @GetMapping
    public Iterable<TodoEntity> getTodoList()
    {
        return todoRepository.findAll();
    }

    @PostMapping
    public void addTodo(@RequestBody TodoEntity todoEntity)
    {
        todoRepository.save(todoEntity);
    }
}
