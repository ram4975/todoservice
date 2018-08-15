package todo.hepler;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;

import todo.helper.ToDoHelper;
import todo.vo.ToDo;

public class ToDoHelperTest {

	@Test
	public void testAddToDoList(){
		
		List<ToDo> toDoList = new ArrayList<ToDo>();
		ToDo toDo = new ToDo();
		toDo.setId("1");
		toDo.setDescription("Attend meeting at 3:00 PM");
		toDoList.add(toDo);
		
		ToDo newToDo = new ToDo();
		newToDo.setId("2");
		newToDo.setDescription("Prepare for presentation");
		
		ToDoHelper toDoHelper = new ToDoHelper();
		toDoHelper.addToDo(toDoList, newToDo);
		
		assertEquals(toDoList.size(), 2);
		assertEquals(toDoList.get(1), newToDo);
	}
}
