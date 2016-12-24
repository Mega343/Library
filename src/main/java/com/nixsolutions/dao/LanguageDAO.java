package com.nixsolutions.dao;

import com.nixsolutions.bean.Language;

import java.util.List;

public interface LanguageDAO {

    public int add(Language language);

    public void edit(Language language);

    public void delete(int id);

    public Language getLanguage(int id);

    public List<Language> getAllLanguages();
}
