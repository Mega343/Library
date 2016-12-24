package com.nixsolutions.dao.impl.h2;

import com.nixsolutions.bean.DocumentType;
import com.nixsolutions.dao.DocumentTypeDAO;

import java.util.List;

public class H2DocumentTypeDAO implements DocumentTypeDAO {
    @Override
    public int add(DocumentType docType) {
        return 0;
    }

    @Override
    public void edit(DocumentType docType) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public DocumentType getDocumentType(int id) {
        return null;
    }

    @Override
    public List<DocumentType> getAllDocumentTypes() {
        return null;
    }
}
