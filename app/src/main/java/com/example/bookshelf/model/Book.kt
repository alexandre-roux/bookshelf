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

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * This data class defines a Book which includes an ID, and the image URL. //TODO
 */
@Serializable
data class Book(
    @SerialName("id") val id: String,
    @SerialName("etag") val etag: String,
    @SerialName("selfLink") val selfLink: String,
    @SerialName("volumeInfo") val volumeInfo: VolumeInfo,
    @SerialName("saleInfo") val saleInfo: SaleInfo,
    @SerialName("accessInfo") val accessInfo: AccessInfo,
    @SerialName("searchInfo") val searchInfo: SearchInfo
)

@Serializable
data class VolumeInfo(
    @SerialName("title") val title: String,
    @SerialName("subtitle") val subtitle: String?,
    @SerialName("authors") val authors: List<String>,
    @SerialName("publisher") val publisher: String?,
    @SerialName("publishedDate") val publishedDate: String?,
    @SerialName("description") val description: String?,
    @SerialName("industryIdentifiers") val industryIdentifiers: List<IndustryIdentifier>,
    @SerialName("readingModes") val readingModes: ReadingModes,
    @SerialName("pageCount") val pageCount: Int?,
    @SerialName("printType") val printType: String?,
    @SerialName("categories") val categories: List<String>?,
    @SerialName("maturityRating") val maturityRating: String?,
    @SerialName("allowAnonLogging") val allowAnonLogging: Boolean?,
    @SerialName("contentVersion") val contentVersion: String?,
    @SerialName("panelizationSummary") val panelizationSummary: PanelizationSummary?,
    @SerialName("imageLinks") val imageLinks: ImageLinks?,
    @SerialName("language") val language: String?,
    @SerialName("previewLink") val previewLink: String?,
    @SerialName("infoLink") val infoLink: String?,
    @SerialName("canonicalVolumeLink") val canonicalVolumeLink: String?
)

@Serializable
data class IndustryIdentifier(
    @SerialName("type") val type: String,
    @SerialName("identifier") val identifier: String
)

@Serializable
data class ReadingModes(
    @SerialName("text") val text: Boolean,
    @SerialName("image") val image: Boolean
)

@Serializable
data class PanelizationSummary(
    @SerialName("containsEpubBubbles") val containsEpubBubbles: Boolean,
    @SerialName("containsImageBubbles") val containsImageBubbles: Boolean
)

@Serializable
data class ImageLinks(
    @SerialName("smallThumbnail") val smallThumbnail: String?,
    @SerialName("thumbnail") val thumbnail: String?
)

@Serializable
data class SaleInfo(
    @SerialName("country") val country: String?,
    @SerialName("saleability") val saleability: String?,
    @SerialName("isEbook") val isEbook: Boolean?
)

@Serializable
data class AccessInfo(
    @SerialName("country") val country: String?,
    @SerialName("viewability") val viewability: String?,
    @SerialName("embeddable") val embeddable: Boolean?,
    @SerialName("publicDomain") val publicDomain: Boolean?,
    @SerialName("textToSpeechPermission") val textToSpeechPermission: String?,
    @SerialName("epub") val epub: Epub?,
    @SerialName("pdf") val pdf: Pdf?,
    @SerialName("webReaderLink") val webReaderLink: String?,
    @SerialName("accessViewStatus") val accessViewStatus: String?,
    @SerialName("quoteSharingAllowed") val quoteSharingAllowed: Boolean?
)

@Serializable
data class Epub(
    @SerialName("isAvailable") val isAvailable: Boolean?,
    @SerialName("acsTokenLink") val acsTokenLink: String?
)

@Serializable
data class Pdf(
    @SerialName("isAvailable") val isAvailable: Boolean?,
    @SerialName("acsTokenLink") val acsTokenLink: String?
)

@Serializable
data class SearchInfo(
    @SerialName("textSnippet") val textSnippet: String?
)