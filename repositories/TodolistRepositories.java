package repositories;

import entities.Todolist;
import entities.Todolistist;

public interface TodoListRepository {
    Todolist[] getAll();
    void add(Todolist todoList);
    Boolean remove(Integer id);
    Boolean edit(Todolist doList);
}
