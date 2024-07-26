/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.controller;

import edu.ijse.dto.ItemDto;
import edu.ijse.service.ServiceFactory;
import edu.ijse.service.custom.ItemService;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public class ItemController {
    private ItemService itemService = (ItemService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.ITEM);
    public String save(ItemDto itemDto) throws Exception{
        return itemService.save(itemDto);
    }
    
    public String update(ItemDto itemDto) throws Exception{
        return itemService.update(itemDto);
    }
    
    public String delete(String itemCode) throws Exception{
        return itemService.delete(itemCode);
    }
    
    public ArrayList<ItemDto> getAll() throws Exception{
        return itemService.getAll();
    }
    
    public ItemDto get(String itemCode) throws Exception{
        return itemService.get(itemCode);
    }
}
