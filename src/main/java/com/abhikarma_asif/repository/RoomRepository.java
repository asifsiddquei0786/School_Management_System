package com.abhikarma_asif.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.abhikarma_asif.entity.Room;

public interface RoomRepository extends JpaRepository<Room, Long> 
{
	@Query("SELECT ro FROM Room ro WHERE ro.block LIKE %?1%"
			+ " OR ro.roomNo LIKE %?1%"
			+ " OR ro.roomType LIKE %?1%")
		//	+ " OR ro.noOfBeds LIKE %?1%"
		//	+ " OR ro.costPerBed LIKE %?1%"
		//	+ " OR ro.availability LIKE %?1%")
	 List<Room> search(String keyword);

}
