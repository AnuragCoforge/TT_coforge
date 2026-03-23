
package com.coforge.daos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coforge.entities.Item;
import com.coforge.repositories.ItemRepository;

@Repository
public class ItemDao {

    @Autowired
    private ItemRepository repo;

    public Item saveItem(Item item) {
        return repo.save(item);
    }

    public Optional<Item> getById(long id) {
        return repo.findById(id);
    }

    public List<Item> getAllItems() {
        return repo.findAll();
    }
}
