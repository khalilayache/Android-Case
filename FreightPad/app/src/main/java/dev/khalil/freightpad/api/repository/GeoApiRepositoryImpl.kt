package dev.khalil.freightpad.api.repository

import dev.khalil.freightpad.api.service.GeoApiService
import dev.khalil.freightpad.model.Place
import dev.khalil.freightpad.model.PlaceRequest
import dev.khalil.freightpad.model.RouteRequest
import dev.khalil.freightpad.model.RouteResponse
import io.reactivex.Single

class GeoApiRepositoryImpl(private val api: GeoApiService) :
  GeoApiRepository {

  override fun getRoute(
    fuelConsume: Double,
    fuelPrice: Double,
    start: Place,
    destination: Place): Single<RouteResponse> {
    val routeRequest = RouteRequest(
      listOf(
        PlaceRequest(start.point),
        PlaceRequest(destination.point)),
      fuelConsume, fuelPrice)
    return api.getRoute(routeRequest)
  }
}
