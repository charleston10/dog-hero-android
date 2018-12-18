package br.com.charleston.doghero.data.cloud.requests

import br.com.charleston.doghero.data.cloud.responses.HeroResponse
import io.reactivex.Observable
import retrofit2.http.GET

interface HeroesApi {

    @GET("v1/heroes")
    fun getMyHeroes(): Observable<List<HeroResponse>>
}
