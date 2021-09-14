package com.restapiproject.learnspringboot.Courses.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapiproject.learnspringboot.Courses.courses;
import com.restapiproject.learnspringboot.Courses.Repository.CoursesRepository;


@RestController
public class CoursesController {
	@Autowired
	private CoursesRepository repository;

	public CoursesController() {
		// TODO Auto-generated constructor stub
	}
	//GET API
	// http://localhost:8080/Courses/all
	@GetMapping("/courses/all")
	public List<courses> getAllCourses1(){
		return repository.findAll();
		//return List.of(new Courses(1,"Learn Microservices 1","in 28 min"));	
	}

		// http://localhost:8080/Courses/1
		@GetMapping("/courses/{id}")
		public courses getAllCourses2(@PathVariable long id){
			Optional<courses> course=repository.findById(id);
			if(course.isEmpty())
				throw new RuntimeException("Course not find with id "+ id);
			return course.get();
			
			// List.of(new Courses(2,"Learn reaact","in 28 min"));
}
		//POST API
		@PostMapping("/courses")
		public void createCourse(@RequestBody courses course)
		{
			repository.save(course);
		}
		//update a course(PUT)
		@PutMapping("/courses/{id}")
		public void updateCourse(@PathVariable long id, @RequestBody courses course)
		{
			repository.save(course);
		}
		//deleting aa course
		@DeleteMapping("/courses/{id}")
		public void updateCourse(@PathVariable long id)
		{
			repository.deleteById(id);
		}
}
		