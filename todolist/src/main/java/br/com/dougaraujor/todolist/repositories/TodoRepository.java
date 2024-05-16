package br.com.dougaraujor.todolist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dougaraujor.todolist.entities.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
