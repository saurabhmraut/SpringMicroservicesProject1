package com.cg.LocationService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.LocationService.entity.Location;
import com.cg.LocationService.service.LocationService;

@RestController
@RequestMapping("/loc")
public class LocationController {
	
//	@RequestMapping("/")
//	public String getString() {
//		return "It's a Location controler";
//	}
	
	@Autowired
	private LocationService locationService;
	
	@RequestMapping("/{locId}")
	public Location getLocation(@PathVariable("locId") Long Id) {
		Location  location = this.locationService.getLocation(Id);
		return location;
	}
}
