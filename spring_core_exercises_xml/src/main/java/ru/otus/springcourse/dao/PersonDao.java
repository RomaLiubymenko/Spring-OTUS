package ru.otus.springcourse.dao;

import ru.otus.springcourse.domain.Person;

public interface PersonDao {
    Person findByName(String name);
}
