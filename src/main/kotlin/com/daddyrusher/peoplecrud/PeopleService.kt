package com.daddyrusher.peoplecrud

import org.springframework.stereotype.Service

@Service
class PeopleService(private val repository: PeopleRepository): IService {
    override fun save(person: Person) {
        repository.save(person)
    }

    override fun getById(id: String): Person = repository.findById(id).get()
    override fun getAll(): List<Person> = repository.findAll()
    override fun delete(person: Person) = repository.delete(person)
    override fun deleteById(id: String) {
        repository.deleteById(id)
    }

    override fun update(person: Person) { repository.save(person) }
}
