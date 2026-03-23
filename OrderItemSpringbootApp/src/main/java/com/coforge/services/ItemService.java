
package com.coforge.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.daos.ItemDao;
import com.coforge.dtos.ItemDto;
import com.coforge.entities.Item;

@Service
public class ItemService {

    @Autowired
    ItemDao itemdao;

    public Item saveItem(Item item) {
        return itemdao.saveItem(item);
    }

    public Item getItemById(long itemid) {
        return itemdao.getById(itemid)
                .orElseThrow(() -> new RuntimeException("Item not found"));
    }

    public List<ItemDto> getAllItems() {
        return itemdao.getAllItems()
                .stream()
                .map(this::getItemDtoFromItem)
                .collect(Collectors.toList());
    }

    public ItemDto getItemDtoFromItem(Item item) {
        return new ItemDto(item.getItemId(), item.getItemName(), item.getItemPrice());
    }
}
