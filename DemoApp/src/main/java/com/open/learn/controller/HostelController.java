/**
 * 
 */
package com.open.learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.open.learn.model.Hostel;
import com.open.learn.service.HostelService;

/**
 * @author swapnilwarekar
 *
 */

@RestController
public class HostelController {
	
	@Autowired
	private HostelService hostelService;
	
	@GetMapping("/hostels")
	public List<Hostel> allHostels() {
		return hostelService.findAllHostel();
	}

}
