package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepo;

@Service
public class BookSer {
	@Autowired
	BookRepo br;
	public Book posting(Book b)
	{
		return br.save(b);
	}
	public List<Book> getting()
	{
		return br.findAll();
	}
	public Optional<Book> getById(int id)
	{
		return br.findById(id);
	}
	public String deleteById(int id)
	{
		br.deleteById(id);
		if(br.existsById(id))
		{
			
			return "deleted";
		}
		else
		{
			return "enter valid id to delete";
		}
	}
	public String update(int id,Book b)
	{
		br.saveAndFlush(b);
		if(br.existsById(id))
		{
			return "updated";
		}
		else
			
		return "Invalid input";
	}
	

}
