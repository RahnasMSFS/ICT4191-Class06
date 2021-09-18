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

import lk.ac.vau.Model.Student;
import lk.ac.vau.Repo.Repo;

@RestController
@RequestMapping("student")
public class StudentController {
	
    private Repo<String, Student> students = new Repo<String, Student>();
    
	//Return all students
	@GetMapping
	public Collection<Student> getAll()
	{
		return students.getAll();
	}
	
	
	//Return particular student
	@GetMapping("/{id}")
	public Student get(@PathVariable("id") String id)
	{
		return students.get(id);
	}
	
	
	//Insert a new student
	@PostMapping
	public void add(@RequestBody Student student)
	{
		students.add(student);
	}
	
	
	//Delete a student
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id)
	{
		students.delete(id);
	}
	
	//Update a student
	@PutMapping("/{id}")
	public void update(@PathVariable("id") String id,@RequestBody Student student)
	{
		students.update(id, student);
	}
	
}
