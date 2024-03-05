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

package com.example.bookshelf.model

import kotlinx.serialization.Serializable

/**
 * This data class defines a Book which includes an ID, and the image URL. //TODO
 */
@Serializable
data class Book(
    val title: String,
    val subtitle: String?,
    val authors: List<String>,
    val publisher: String?,
    val publishedDate: String?,
    val description: String?,
    val imageLinks: ImageLinks?,
)

@Serializable
data class ImageLinks(
    var smallThumbnail: String?,
    var thumbnail: String?
)