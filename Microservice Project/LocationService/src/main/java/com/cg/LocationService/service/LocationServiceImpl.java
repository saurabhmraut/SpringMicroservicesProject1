package com.cg.LocationService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.LocationService.entity.Location;

@Service
public class LocationServiceImpl implements LocationService {
	
	private List<Location> list = List.of(
			new Location(10L, "Pune"),
			new Location(11L, "Mumbai"),
			new Location(13L, "Ahmdnagar"),
			new Location(14L, "pimpri")
			);
	

	@Override
	public Location getLocation(Long Id) { 
		return this.list.stream().filter(loc -> loc.getLocId().equals(Id)).findAny().orElse(null) ;
	}

}
