package com.denofdevelopers.amphibians.data

import com.denofdevelopers.amphibians.model.Amphibian
import com.denofdevelopers.amphibians.network.AmphibiansApiService

interface AmphibiansRepository {
    suspend fun getAmphibians(): List<Amphibian>
}

class DefaultAmphibianRepository(
    private val amphibiansApiService: AmphibiansApiService
): AmphibiansRepository {
    override suspend fun getAmphibians(): List<Amphibian> = amphibiansApiService.getAmphibians()

}