/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.dto;

/**
 *
 * @author HP
 */
public class ItemDto {
    private String itemCode;
    private String description;
    private String pack;
    private Integer qohInteger;
    private Double unitPrice;

    public ItemDto() {
    }

    public ItemDto(String itemCode, String description, String pack, Integer qohInteger, Double unitPrice) {
        this.itemCode = itemCode;
        this.description = description;
        this.pack = pack;
        this.qohInteger = qohInteger;
        this.unitPrice = unitPrice;
    }

    /**
     * @return the itemCode
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * @param itemCode the itemCode to set
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the pack
     */
    public String getPack() {
        return pack;
    }

    /**
     * @param pack the pack to set
     */
    public void setPack(String pack) {
        this.pack = pack;
    }

    /**
     * @return the qohInteger
     */
    public Integer getQohInteger() {
        return qohInteger;
    }

    /**
     * @param qohInteger the qohInteger to set
     */
    public void setQohInteger(Integer qohInteger) {
        this.qohInteger = qohInteger;
    }

    /**
     * @return the unitPrice
     */
    public Double getUnitPrice() {
        return unitPrice;
    }

    /**
     * @param unitPrice the unitPrice to set
     */
    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "ItemDto{" + "itemCode=" + itemCode + ", description=" + description + ", pack=" + pack + ", qohInteger=" + qohInteger + ", unitPrice=" + unitPrice + '}';
    }    
}
