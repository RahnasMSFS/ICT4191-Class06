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

import lk.ac.vau.Model.Lecturer;
import lk.ac.vau.Repo.Repo;

@RequestMapping("lecturer")
@RestController
public class LecturerController {

private Repo<Long, Lecturer> lectures = new Repo<Long, Lecturer>();
    
	//Return all lectures
	@GetMapping
	public Collection<Lecturer> getAll()
	{
		return lectures.getAll();
	}
	
	
	//Return particular lecturer
	@GetMapping("/{id}")
	public Lecturer get(@PathVariable("id") long id)
	{
		return lectures.get(id);
	}
	
	
	//Insert a new lecturer
	@PostMapping
	public void add(@RequestBody Lecturer lecturer)
	{
		lectures.add(lecturer);
	}
	
	
	//Delete a lecturer
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") long id)
	{
		lectures.delete(id);
	}
	
	//Update a lecturer
	@PutMapping("/{id}")
	public void update(@PathVariable("id") long id,@RequestBody Lecturer lecturer)
	{
		lectures.update(id, lecturer);
	}
	
}
