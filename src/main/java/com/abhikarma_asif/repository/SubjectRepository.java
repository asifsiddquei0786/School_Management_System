package com.abhikarma_asif.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.abhikarma_asif.entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long>
{
	public boolean existsBySubjectId(String subjectId);

	@Query("SELECT subject FROM Subject subject WHERE subject.id LIKE %?1%"
			+ " OR subject.subjectId LIKE %?1%"
			+ " OR subject.subjectName LIKE %?1%"
			+ " OR subject.className LIKE %?1%")
	public List<Subject> search(String keyword);
	
}
