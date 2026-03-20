package com.himan.springboot.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class TodoController {
        private TodoService todoService;
        //@Autowired
        public TodoController(TodoService todoService){
            this.todoService = todoService;
        }
        @RequestMapping("list-todos")
        public String getToDoList(ModelMap modelMap){
            modelMap.put("todoList",todoService.findByUsername("Himan"));
            return "listTodos";
        }
}
