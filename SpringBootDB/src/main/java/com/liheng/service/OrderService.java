package com.liheng.service;
import com.liheng.bean.Order;
import com.liheng.dao.IPublicDao;
import com.liheng.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private IPublicDao<Order> publicDao;
    public void save(Order order) {
        orderRepository.save(order);
    }

    public Order findOne(String id) {
        return orderRepository.findOne(id);
    }

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public int updateNameById(String id, String name) {
        Query query = new Query(Criteria.where("_id").is(id));
        Update update = Update.update("name",name);
        publicDao.update(query,update,Order.class);
        return 1;
    }

    public void deleteById(String id) {
        orderRepository.delete(id);
    }
}
