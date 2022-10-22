package com.raywenderlich.android.majesticreader.interactors

import com.raywenderlich.android.majesticreader.data.DocumentRepository

class GetDocument(private val documentRepository: DocumentRepository) {
    suspend operator fun invoke() = documentRepository.getDocuments()
}