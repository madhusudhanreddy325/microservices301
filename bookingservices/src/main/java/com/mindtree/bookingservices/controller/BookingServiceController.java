package com.mindtree.bookingservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.bookingservices.dto.BookingDto;
import com.mindtree.bookingservices.service.BookingService;

@RestController
public class BookingServiceController {

	@Autowired
	private BookingService bookingService;

	@RequestMapping("/booking")
	public String sendBookingDetails(@RequestBody BookingDto bookingDto) {
		return bookingService.bookATicketForUser(bookingDto);
	}

}
