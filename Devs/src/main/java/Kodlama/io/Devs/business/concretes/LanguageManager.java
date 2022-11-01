package Kodlama.io.Devs.business.concretes;

import Kodlama.io.Devs.business.abstracts.ILanguageService;
import Kodlama.io.Devs.dataAccess.abstracts.ILanguageRepository;
import Kodlama.io.Devs.dataAccess.concretes.InMemoryLanguageRepository;
import Kodlama.io.Devs.entities.concretes.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LanguageManager implements ILanguageService
{
    private ILanguageRepository languageRepository;

    @Autowired
    public LanguageManager(ILanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public List<Language> getAll() {
        return languageRepository.getAll();
    }

    @Override
    public void add(Language language) {
        for(Language lang : this.getAll())
        {
            if(lang.getName().equals(language.getName()) || language.getName().isEmpty() || language.getName().isBlank())
            {
                return;
            }
        }
        this.languageRepository.add(language);
    }

    @Override
    public void delete(int id) {
        this.languageRepository.delete(id);
    }

    @Override
    public void update(Language language) {
        this.languageRepository.update(language);
    }

    @Override
    public Language getById(int id) {
        return this.languageRepository.getById(id);
    }
}
