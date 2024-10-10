package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Shop;
import com.example.demo.repository.ShopRepository;

@Service
public class ShopServiceImpl implements ShopService{
	
	@Autowired
	ShopRepository shopRepository;

	@Override
	public Shop saveShop(Shop shop) {
		// TODO Auto-generated method stub
		return shopRepository.save(shop);
	}

	@Override
	public List<Shop> fetchShopList() {
		// TODO Auto-generated method stub
		return  shopRepository.findAll();
	}

	@Override
	public Shop fetchShopById(Long shopId) {
		// TODO Auto-generated method stub
		return shopRepository.findById(shopId).get();
	}

	@Override
	public void deleteShopById(Long shopId) {
		// TODO Auto-generated method stub
		shopRepository.deleteById(shopId);
		
	}
	


}
