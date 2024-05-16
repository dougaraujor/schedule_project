package br.com.dougaraujor.todolist.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import br.com.dougaraujor.todolist.entities.Todo;
import br.com.dougaraujor.todolist.repositories.TodoRepository;

@Service
public class TodoService {

    @Autowired
    private TodoRepository repository;

    public List<Todo> findAll() {
        return repository.findAll();
    }

    public Todo findById(Long id) {
        Optional<Todo> obj = repository.findById(id);
        return obj.orElseThrow();
    }

    public Todo insert(Todo todo) {
        return repository.save(todo);
    }
}
