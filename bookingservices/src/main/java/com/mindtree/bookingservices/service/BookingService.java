package com.mindtree.bookingservices.service;

import org.springframework.stereotype.Service;

import com.mindtree.bookingservices.dto.BookingDto;

@Service
public interface BookingService {

	String bookATicketForUser(BookingDto bookingDto);
}
