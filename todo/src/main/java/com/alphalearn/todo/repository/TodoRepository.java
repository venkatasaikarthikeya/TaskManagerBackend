package com.alphalearn.todo.repository;

import com.alphalearn.todo.model.Todo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Author: Karthik
 * Date: 6/11/2023
 * Time: 11:24 AM
 */

@Repository
@Transactional
public class TodoRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public Todo addNew(Todo todo) {
        return entityManager.merge(todo);
    }

    public Todo update(Todo todo) {
        return entityManager.merge(todo);
    }

    public void deleteById(Integer id) {
        Todo todoToBeDeleted = findById(id);
        entityManager.remove(todoToBeDeleted);
    }

    public Todo findById(Integer id) {
        return entityManager.find(Todo.class, id);
    }

    public List<Todo> fetchAllTodos() {
        TypedQuery<Todo> namedQuery =entityManager.createNamedQuery("fetch_all_todos", Todo.class);
        return namedQuery.getResultList();
    }
}
