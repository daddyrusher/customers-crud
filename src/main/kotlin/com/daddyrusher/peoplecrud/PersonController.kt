package com.daddyrusher.peoplecrud

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/person")
class PersonController(private val service: PeopleService) {
    @GetMapping
    fun getAll(): ResponseEntity<List<Person>> = ResponseEntity.ok(service.getAll())

    @GetMapping("/{id}")
    fun getById(@PathVariable id: String): ResponseEntity<Person> = ResponseEntity.ok(service.getById(id))

    @PostMapping
    fun save(@RequestBody person: Person): ResponseEntity<Any> {
        service.save(person)
        return ResponseEntity.ok().build()
    }

    @DeleteMapping
    fun delete(@RequestBody person: Person): ResponseEntity<Any> {
        service.delete(person)
        return ResponseEntity.ok().build()
    }

    @DeleteMapping("/{id}")
    fun deleteById(@PathVariable id: String): ResponseEntity<Any> {
        service.deleteById(id)
        return ResponseEntity.ok().build()
    }
}
