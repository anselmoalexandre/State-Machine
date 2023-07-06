package mz.co.bilheteira.statemachine.ui.search

import kotlinx.coroutines.flow.Flow
import mz.co.bilheteira.domain.data.LocationModel
import mz.co.bilheteira.statemanager.State

/**
 * Configuration of different UI States of the Search screen
 */
sealed class SearchViewState : State {
    object Loading : SearchViewState()
    object Success : SearchViewState()
    data class Error(
        val message: String
    ) : SearchViewState()

    data class LocationContent(
        val locations: Flow<List<LocationModel>>
    ) : SearchViewState()
}
