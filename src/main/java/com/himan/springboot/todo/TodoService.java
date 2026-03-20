package com.himan.springboot.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos =  new ArrayList<>();
    static{
        todos.add(new Todo(1,"himan","Learn AWS", LocalDate.now().plusYears(1),false));
        todos.add(new Todo(2,"himan","Learn Devops", LocalDate.now().plusYears(2),false));
        todos.add(new Todo(3,"himan","Learn FullStack", LocalDate.now().plusYears(3),false));
        todos.add(new Todo(4,"himan","Learn DSA", LocalDate.now().plusDays(30),false));
    }

    public List<Todo> findByUsername(String username){
        return todos;
    }
}
