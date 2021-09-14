package com.restapiproject.learnspringboot.Courses.Repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.restapiproject.learnspringboot.Courses.courses;



public interface CoursesRepository extends JpaRepository<courses,Long> {

}
