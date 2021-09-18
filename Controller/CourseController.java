package lk.ac.vau.Controller;

import java.util.Collection;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.Model.Course;
import lk.ac.vau.Repo.Repo;

@RestController
@RequestMapping("course")
public class CourseController {

private Repo<String, Course> courses = new Repo<String, Course>();
    
	//Return all courses
	@GetMapping
	public Collection<Course> getAll()
	{
		return courses.getAll();
	}
	
	
	//Return particular course
	@GetMapping("/{id}")
	public Course get(@PathVariable("id") String id)
	{
		return courses.get(id);
	}
	
	
	//Insert a new student
	@PostMapping
	public void add(@RequestBody Course course)
	{
		courses.add(course);
	}
	
	
	//Delete a student
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id)
	{
		courses.delete(id);
	}
	
	//Update a student
	@PutMapping("/{id}")
	public void update(@PathVariable("id") String id,@RequestBody Course course)
	{
		courses.update(id, course);
	}
	
}
