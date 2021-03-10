package com.example.demo.model

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "books")
data class Book(@Id @GeneratedValue var id: Int? = 0,
                @Column(nullable = false) var name: String = "",
                @Column(nullable = false) var author: String = "",
                @Column(nullable = false) var isbn: String = "") {
}