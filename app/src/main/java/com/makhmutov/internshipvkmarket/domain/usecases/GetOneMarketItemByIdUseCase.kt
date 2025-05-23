package com.makhmutov.internshipvkmarket.domain.usecases

import com.makhmutov.internshipvkmarket.domain.respository.MarketRepository
import javax.inject.Inject

/**
 * Класс-резултат запроса товара по id
 */
class GetOneMarketItemByIdUseCase @Inject constructor(
    private val repository: MarketRepository
) {
    operator fun invoke(id: Int) = repository.getOneMarketItemByIdFlow(id)
}