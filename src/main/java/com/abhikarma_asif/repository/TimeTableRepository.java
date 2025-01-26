package com.abhikarma_asif.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.abhikarma_asif.entity.TimeTable;

public interface TimeTableRepository extends JpaRepository<TimeTable, Long>
{
	@Query("SELECT tim FROM TimeTable tim WHERE tim.teacherId LIKE %?1%"
			+ " OR tim.teacherName LIKE %?1%"
			+ " OR tim.className LIKE %?1%"
			+ " OR tim.section LIKE %?1%"
			+ " OR tim.subject LIKE %?1%")
	List<TimeTable> search(String keyword);

}
