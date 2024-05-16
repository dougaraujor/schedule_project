package br.com.dougaraujor.todolist.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.dougaraujor.todolist.entities.Todo;
import br.com.dougaraujor.todolist.repositories.TodoRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public void run(String... args) throws Exception {

        Todo todo1 = new Todo(null, "teste", "todoteste", false, 4);

        todoRepository.saveAll(Arrays.asList(todo1));
    }
}
