package com.nixsolutions.dao.impl.h2;

import com.nixsolutions.bean.Language;
import com.nixsolutions.dao.LanguageDAO;

import java.util.List;

public class H2LanguageDAO implements LanguageDAO {
    @Override
    public int add(Language language) {
        return 0;
    }

    @Override
    public void edit(Language language) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public Language getLanguage(Integer id) {
        return null;
    }

    @Override
    public List<Language> getAllLanguages() {
        return null;
    }
}
