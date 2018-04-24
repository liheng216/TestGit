package com.liheng.dao;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
public interface IPublicDao<T> {
    void update(Query query, Update update, Class T);
}
