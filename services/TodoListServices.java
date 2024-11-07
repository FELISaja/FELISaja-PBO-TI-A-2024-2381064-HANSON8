package services;

import entities.Todolist;

public interface TodoListServices {
    Todolist[] getTodoList();
    void addTodoList(String todo);
    Boolean removeTodoList(Integer number);
    Boolean editTodoList(Integer number, String todo);

}
