package com.tiooooo.mymysimplecleanarchitecture.data

import com.tiooooo.mymysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}