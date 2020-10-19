package com.mindtree.bookingservices.service.impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.bookingservices.dto.BookingDto;
import com.mindtree.bookingservices.entity.Booking;
import com.mindtree.bookingservices.repository.BookingRepository;
import com.mindtree.bookingservices.service.BookingService;
import com.mindtree.bookingservices.service.InventoryService;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	private BookingRepository bookingRepository;

	@Autowired
	private InventoryService inventoryService;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public String bookATicketForUser(BookingDto bookingDto) {
		if (inventoryService.sendBookingDetails(bookingDto)) {
			Booking booking = modelMapper.map(bookingDto, Booking.class);
			bookingRepository.save(booking);
			return "booked tickets";

		} else {
			return "not booked";
		}
	}

}
