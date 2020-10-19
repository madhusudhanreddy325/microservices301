package com.mindtree.inventoryservcie.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("userservice")
public interface UserProxy {
	
	@RequestMapping("/checkUserRole/{userId}")
	public boolean checkUserRole(@PathVariable String userId);
}
