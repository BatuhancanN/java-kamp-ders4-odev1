package Kodlama.io.Devs.business.abstracts;

import Kodlama.io.Devs.entities.concretes.Language;

import java.util.List;

public interface ILanguageService
{
    List<Language> getAll();
    void add(Language language);
    void delete(int id);
    void update(Language language);
    Language getById(int id);
}
