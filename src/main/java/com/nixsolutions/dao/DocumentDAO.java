package com.nixsolutions.dao;

import com.nixsolutions.bean.Document;

public interface DocumentDAO {

    public int add(Document document);

    public void edit(Document document);

    public void delete(int id);

    public Document getDocument(int id);

}
