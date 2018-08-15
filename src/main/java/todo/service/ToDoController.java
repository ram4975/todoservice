package todo.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import todo.vo.ToDo;

@RestController
public class ToDoController {
	
	@RequestMapping("/todo")
    public ToDo greeting() {
		ToDo toDo = new ToDo();
		toDo.setDescription("Attend meeting");
		toDo.setId("1");
        return new ToDo();
    }
	
}
