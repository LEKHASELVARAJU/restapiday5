package com.example.demo.controller;

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

import com.example.demo.entity.Book;
import com.example.demo.service.BookSer;

@RestController
public class BookCont {
	@Autowired
	BookSer kl;
	@PostMapping("/")
	public Book postt(@RequestBody Book b)
	{
		return kl.posting(b);
	}@GetMapping("/")
	public List<Book> gett()
	{
		return kl.getting();
	}
	@GetMapping("/{id}")
	public Optional<Book> getId(@PathVariable int id)
	{
		return kl.getById(id);
	}
	@PutMapping("update/{id}")
	public void  upd(@PathVariable int id,  @RequestBody Book b)
	{
		kl.update(id,b);
	}
	@DeleteMapping("delid/{id}")
	public void del(@PathVariable int id)
	{
		 kl.deleteById(id);
	}
	

}
