package com.example.demo.service

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import com.example.demo.model.Book
import com.example.demo.repository.BookRepository

@Service
open class BookService @Autowired constructor(private val bookRepository: BookRepository) {

	    /**
     * 全ユーザリストの取得
     * @return ユーザリスト
     */
    fun findAllBook(): MutableList<Book> = bookRepository.findAll()
    fun findById(id:Int): Book{
        var book: Book = bookRepository.findById(id)
        return book
    }

}