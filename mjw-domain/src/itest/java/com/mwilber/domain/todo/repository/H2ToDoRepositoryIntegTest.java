package com.mwilber.domain.todo.repository;

import com.mwilber.domain.todo.ToDoItem;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class H2ToDoRepositoryIntegTest {
    private ToDoRepository h2ToDoRepository;

    @Before
    public void setUp() {
        h2ToDoRepository = new H2ToDoRepository();
    }

    @Test
    public void testInsertToDoItem() {
        ToDoItem newToDoItem = new ToDoItem();
        newToDoItem.setName("Write integration tests");
        Long newId = h2ToDoRepository.insert(newToDoItem);
        newToDoItem.setId(newId);
        assertNotNull(newId);

        ToDoItem persistedToDoItem = h2ToDoRepository.findById(newId);
        assertNotNull(persistedToDoItem);
        assertEquals(newToDoItem, persistedToDoItem);
    }
}
