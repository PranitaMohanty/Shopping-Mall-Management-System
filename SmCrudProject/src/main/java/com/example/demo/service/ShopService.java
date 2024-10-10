package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Shop;

public interface ShopService {

	Shop saveShop(Shop shop);

	List<Shop> fetchShopList();

	Shop fetchShopById(Long shopId);

	void deleteShopById(Long shopId);

}
