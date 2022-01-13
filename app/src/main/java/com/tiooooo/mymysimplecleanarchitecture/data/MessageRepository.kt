package com.tiooooo.mymysimplecleanarchitecture.data

import com.tiooooo.mymysimplecleanarchitecture.domain.IMessageRepository
import com.tiooooo.mymysimplecleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String) = messageDataSource.getMessageFromSource(name)

}