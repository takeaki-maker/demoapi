package com.example.demo.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.*
import org.springframework.web.servlet.ModelAndView
import com.example.demo.model.Book
import com.example.demo.service.BookService


@Controller
class BookController @Autowired constructor(private val bookService: BookService) {

	@RequestMapping("/api/books")
	fun api_index(): ResponseEntity<MutableList<Book>> {
		return ResponseEntity.ok(bookService.findAllBook())

	}
}