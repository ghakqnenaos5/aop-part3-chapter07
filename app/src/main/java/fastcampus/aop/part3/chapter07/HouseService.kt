package fastcampus.aop.part3.chapter07

import retrofit2.Call
import retrofit2.http.GET

interface HouseService {
    @GET("/v3/1b04d77f-0b1d-47db-a9e9-ef789d8ad495")
    fun getHouseList(): Call<HouseDto>
}