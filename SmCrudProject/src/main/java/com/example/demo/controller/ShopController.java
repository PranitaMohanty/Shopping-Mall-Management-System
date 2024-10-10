package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Shop;
import com.example.demo.service.ShopService;

@RestController
public class ShopController {
	@Autowired
	ShopService shopService;
	
	@PostMapping("/shops")
	public Shop saveShop(@RequestBody Shop shop) {
		
		return shopService.saveShop(shop);
	}
	
	@GetMapping("/shops")
    public List<Shop> fetchShopList() {
        //LOGGER.info("Inside fetchDepartmentList of DepartmentController");
        return shopService.fetchShopList();
    }
	
	@GetMapping("/shops/{id}")
    public Shop fetchShopById(@PathVariable("id") Long ShopId)
            {
        return shopService.fetchShopById(ShopId);
    }
	
	@DeleteMapping("/shops/{id}")
    public String deleteShopById(@PathVariable("id") Long shopId) {
        shopService.deleteShopById(shopId);
        return "Shop deleted Successfully!!";
    }
}
