package com.tiooooo.mymysimplecleanarchitecture.data

import com.tiooooo.mymysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource : IMessageDataSource {
    override fun getMessageFromSource(name: String) =
        MessageEntity("Hello $name! Welcome to Clean Architecture")

}