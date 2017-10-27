package com.skaliotisdev.github.repositories.Model

import com.skaliotisdev.github.repositories.SearchRepository
import com.skaliotisdev.github.repositories.Interface.interfaceGitHub

/*
    Created By Spiros Skaliotis 27/10/2017
 */

object objectRepository {

    fun provideSearchRepository(): SearchRepository {
        return SearchRepository(interfaceGitHub.create())
    }

}