package Kodlama.io.Devs.dataAccess.concretes;

import Kodlama.io.Devs.dataAccess.abstracts.ILanguageRepository;
import Kodlama.io.Devs.entities.concretes.Language;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryLanguageRepository implements ILanguageRepository
{
    List<Language> languages;

    public InMemoryLanguageRepository(List<Language> languages) {
        languages = new ArrayList<Language>();
        languages.add(new Language(1,"C++"));
        languages.add(new Language(2,"C#"));
        languages.add(new Language(3,"Java"));
        languages.add(new Language(4,"Python"));
        languages.add(new Language(5,"Silinecek"));
    }

    @Override
    public List<Language> getAll() {
        return languages;
    }


    public Language getById() {
        return null;
    }

    @Override
    public Language getById(int id) {
        for (Language language : languages)
        {
            if (language.getId() == id)
            {
                return language;
            }
            System.out.println("Kayıt getirildi...");
        }
        return null;
    }

    @Override
    public void add(Language language) {
        this.languages.add(language);
        System.out.println("Kayot eklendi...");
    }

    @Override
    public void update(Language language) {
        Language languageUpdate = this.getById(language.getId());
        languages.set(languageUpdate.getId()-1,language);
        System.out.println("Kayıt güncellendi...");

    }

    @Override
    public void delete(int id) {
        Language languageDelete = this.getById(id);
        this.languages.remove(languageDelete);
        System.out.println("Kayıt silindi...");
    }
}
