package services;
import entities.Todolist;
import repositories.TodoListRepository;

public class TodoListServiceImpl  implements TodoListServices{
    private final TodoListRepository todolostRepository;


    public TodoListServiceImpl(final TodoListRepository todoListRepository){
        this.todolostRepository = todoListRepository;
    }
    @Override
    public Todolist[] getTodoList() {
        return todolostRepository.getAll();
    }

    @Override
    public void addTodoList(String todo) {
        if (todo.isEmpty()|| todo.isBlank()) {
            System.out.println("masukkan todo dengan benar");
            return;
        }

    }

    @Override
    public Boolean removeTodoList(Integer number) {
        return removeTodoList(number);
    }

    @Override
    public Boolean editTodoList(Integer number, String todo) {
        Todolist todolist = new Todolist();
        todolist.setId(number);
        todolist.setTodo(todo);
        return todolostRepository.edit(todolist);
    }
}
