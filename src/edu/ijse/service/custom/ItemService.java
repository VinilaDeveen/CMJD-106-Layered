/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.service.custom;

import edu.ijse.dto.ItemDto;
import edu.ijse.service.SuperService;
import java.util.ArrayList;

/**
 *
 * @author HP
 */
public interface ItemService extends SuperService{
    String save (ItemDto itemDto) throws Exception;
    String update (ItemDto itemDto) throws Exception;
    String delete (String itemCode) throws Exception;
    ItemDto get(String itemCode) throws Exception;
    ArrayList<ItemDto> getAll() throws Exception;
}
