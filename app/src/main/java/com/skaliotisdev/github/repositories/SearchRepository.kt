package com.skaliotisdev.github.repositories

import com.skaliotisdev.github.repositories.Interface.interfaceGitHub

/*
    Created By Spiros Skaliotis 27/10/2017
 */

class SearchRepository(val apiService: interfaceGitHub) {

    fun searchUsers(created : String): io.reactivex.Observable<Result> {
        return apiService.search(query = "created:$created")
    }

}