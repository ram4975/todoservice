package todo.helper;

import java.util.List;

import todo.vo.ToDo;

public class ToDoHelper {
	
	public List<ToDo> addToDo(List<ToDo> existingToDoList, ToDo newToDo){
		existingToDoList.add(newToDo);
		return existingToDoList;
	}
}
