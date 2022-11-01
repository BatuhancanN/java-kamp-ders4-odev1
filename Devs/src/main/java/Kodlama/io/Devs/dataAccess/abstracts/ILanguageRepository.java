package Kodlama.io.Devs.dataAccess.abstracts;

import Kodlama.io.Devs.entities.concretes.Language;

import java.util.List;

public interface ILanguageRepository
{
    List<Language> getAll();
    Language getById();

    Language getById(int id);

    public void add(Language language);
    public void update(Language language);
    public void delete(int id);
}
