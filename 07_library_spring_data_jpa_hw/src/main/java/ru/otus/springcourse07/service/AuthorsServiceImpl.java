package ru.otus.springcourse07.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.otus.springcourse07.domain.Author;
import ru.otus.springcourse07.repository.AuthorsRepository;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class AuthorsServiceImpl implements AuthorsService {

    private final AuthorsRepository authorsRepository;

    public AuthorsServiceImpl(AuthorsRepository authorsRepository) {
        this.authorsRepository = authorsRepository;
    }

    @Override
    public Author getAuthorById(int id) {
        return authorsRepository.getOne(id);
    }

    @Override
    public void insertAuthor(Author author) {
        authorsRepository.save(author);
    }

    @Override
    public List<Author> outputListOfAuthors() {
        return authorsRepository.findAll();
    }
}
