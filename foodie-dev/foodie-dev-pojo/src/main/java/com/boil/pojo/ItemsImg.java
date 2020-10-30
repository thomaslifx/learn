package com.boil.pojo;

import javax.persistence.*;
import java.util.Date;

@Table(name = "items_img")
public class ItemsImg {
    /**
     * 图片主键
     */
    @Id
    private String id;

    /**
     * 商品外键Id
     */
    @Column(name = "item_id")
    private String itemId;

    /**
     * 图片地址
     */
    private String url;

    /**
     * 顺序
     */
    private String sort;

    /**
     * 是否主图
     */
    @Column(name = "is_main")
    private String isMain;

    /**
     * 创建时间
     */
    @Column(name = "CREATED_TIME")
    private Date createdTime;

    /**
     * 更新时间
     */
    @Column(name = "UPDATED_TIME")
    private Date updatedTime;

    /**
     * 获取图片主键
     *
     * @return id - 图片主键
     */
    public String getId() {
        return id;
    }

    /**
     * 设置图片主键
     *
     * @param id 图片主键
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取商品外键Id
     *
     * @return item_id - 商品外键Id
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * 设置商品外键Id
     *
     * @param itemId 商品外键Id
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * 获取图片地址
     *
     * @return url - 图片地址
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置图片地址
     *
     * @param url 图片地址
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取顺序
     *
     * @return sort - 顺序
     */
    public String getSort() {
        return sort;
    }

    /**
     * 设置顺序
     *
     * @param sort 顺序
     */
    public void setSort(String sort) {
        this.sort = sort;
    }

    /**
     * 获取是否主图
     *
     * @return is_main - 是否主图
     */
    public String getIsMain() {
        return isMain;
    }

    /**
     * 设置是否主图
     *
     * @param isMain 是否主图
     */
    public void setIsMain(String isMain) {
        this.isMain = isMain;
    }

    /**
     * 获取创建时间
     *
     * @return CREATED_TIME - 创建时间
     */
    public Date getCreatedTime() {
        return createdTime;
    }

    /**
     * 设置创建时间
     *
     * @param createdTime 创建时间
     */
    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 获取更新时间
     *
     * @return UPDATED_TIME - 更新时间
     */
    public Date getUpdatedTime() {
        return updatedTime;
    }

    /**
     * 设置更新时间
     *
     * @param updatedTime 更新时间
     */
    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}