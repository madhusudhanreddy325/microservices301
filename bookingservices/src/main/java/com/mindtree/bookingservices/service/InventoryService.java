package com.mindtree.bookingservices.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mindtree.bookingservices.dto.BookingDto;

@FeignClient(name = "inventoryservice")
public interface InventoryService {

	@RequestMapping("/checkAvailablity")
	public Boolean sendBookingDetails(@RequestBody BookingDto bookingDto);

}
