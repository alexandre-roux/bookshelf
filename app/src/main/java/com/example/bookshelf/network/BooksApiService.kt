/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.bookshelf.network

import com.example.bookshelf.model.ApiResponse
import com.example.bookshelf.model.Book
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

/**
 * A public interface that exposes the [getBooks] method
 */
interface BooksApiService {
    /**
     * Returns a [List] of [Book] and this method can be called from a Coroutine.
     * The @GET annotation indicates that the "volumes" endpoint will be requested with the GET
     * HTTP method
     */
    @Headers("Content-Type: application/json")
    @GET("volumes")
    suspend fun getBooks(@Query("q") query: String): ApiResponse
}
