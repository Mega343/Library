package com.nixsolutions.dao;


import com.nixsolutions.bean.DocumentType;

import java.util.List;

public interface DocumentTypeDAO {

    public int add(DocumentType docType);

    public void edit(DocumentType docType);

    public void delete(int id);

    public DocumentType getDocumentType(int id);

    public List<DocumentType> getAllDocumentTypes();
}
