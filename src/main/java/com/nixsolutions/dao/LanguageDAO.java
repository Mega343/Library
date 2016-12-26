package com.nixsolutions.dao;

import com.nixsolutions.bean.Language;

import java.util.List;

public interface LanguageDAO {

    public int add(Language language);

    public void edit(Language language);

    public void delete(Integer id);

    public Language getLanguage(Integer id);

    public List<Language> getAllLanguages();
}
