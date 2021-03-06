package ru.otus.springcourse07.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.otus.springcourse07.domain.Genre;
import ru.otus.springcourse07.repository.GenresRepository;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class GenresServiceImpl implements GenresService {

    private final GenresRepository genresRepository;

    public GenresServiceImpl(GenresRepository genresRepository) {
        this.genresRepository = genresRepository;
    }

    @Override
    public void insertGenre(Genre genre) {
        genresRepository.save(genre);
    }

    @Override
    public List<Genre> outputListOfGenres() {
        return genresRepository.findAll();
    }

    @Override
    public Genre getGenreById(int id) {
        return genresRepository.getOne(id);
    }
}
