package com.mindtree.bookingservices.testController;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.mindtree.bookingservices.controller.BookingServiceController;
import com.mindtree.bookingservices.service.impl.BookingServiceImpl;

@WebMvcTest(BookingServiceController.class)
@AutoConfigureDataJpa
public class TestBookingServiceController {

	@Autowired
	private MockMvc mockMvc;

	@InjectMocks
	private BookingServiceController bookingServiceController;

	@Mock
	private BookingServiceImpl bookingServiceImpl;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		mockMvc = MockMvcBuilders.standaloneSetup(bookingServiceController).build();
	}

}
