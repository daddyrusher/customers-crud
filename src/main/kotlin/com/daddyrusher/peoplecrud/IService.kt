package com.daddyrusher.peoplecrud

interface IService {
    fun save(person: Person)
    fun getById(id: String): Person
    fun getAll(): List<Person>
    fun delete(person: Person)
    fun deleteById(id: String)
    fun update(person: Person)
}
