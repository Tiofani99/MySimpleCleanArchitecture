package com.tiooooo.mymysimplecleanarchitecture.di

import com.tiooooo.mymysimplecleanarchitecture.data.IMessageDataSource
import com.tiooooo.mymysimplecleanarchitecture.data.MessageDataSource
import com.tiooooo.mymysimplecleanarchitecture.data.MessageRepository
import com.tiooooo.mymysimplecleanarchitecture.domain.IMessageRepository
import com.tiooooo.mymysimplecleanarchitecture.domain.MessageInteractor
import com.tiooooo.mymysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource= provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}