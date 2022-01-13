package com.tiooooo.mymysimplecleanarchitecture.domain

interface MessageUseCase {
    fun getMessage(name: String):MessageEntity
}