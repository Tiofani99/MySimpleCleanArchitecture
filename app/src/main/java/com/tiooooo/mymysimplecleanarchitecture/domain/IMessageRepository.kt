package com.tiooooo.mymysimplecleanarchitecture.domain

interface IMessageRepository {
    fun getWelcomeMessage(name: String):MessageEntity
}