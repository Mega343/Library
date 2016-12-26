package com.nixsolutions.dao;


import com.nixsolutions.bean.DocumentType;

import java.util.List;

public interface DocumentTypeDAO {

    public int add(DocumentType docType);

    public void edit(DocumentType docType);

    public void delete(Integer id);

    public DocumentType getDocumentType(Integer id);

    public List<DocumentType> getAllDocumentTypes();
}
