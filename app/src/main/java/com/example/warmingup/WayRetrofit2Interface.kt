package com.example.warmingup

import com.google.gson.annotations.SerializedName
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.POST

//data class wayReq(
//    @SerializedName("startX")val startX: Double,
//    @SerializedName("startY")val startY: Double,
//    //@SerializedName("angle")val angle: Int,
//    //@SerializedName("speed")val speed: Int,
//    //@SerializedName("endPolid")val endPolid: String,
//    @SerializedName("endX")val endX: Double,
//    @SerializedName("endY")val endY: Double,
//    @SerializedName("passList")val passList: String,
//    //@SerializedName("reqCoordType")val reqCoordType: String,
//    //@SerializedName("startName")val startName: String,
//    //@SerializedName("endName")val endName: String,
//    @SerializedName("searchOption")val searchOption: Int,
//    //@SerializedName("resCoordType")val resCoordType: String,
//    //@SerializedName("sort")val sort: String,
//)
//
//data class wayRsp(
//    @SerializedName("type")val type: String,
//    @SerializedName("totalTime")val totalTime: Int,
//)
//
//interface WayRetrofit2Interface {
//    @POST("/tmap/routes/pedestrian?version=1")
//    fun createPost(@Body post: wayReq): Call<wayRsp>
//}
//
//object RetrofitBuilder {
//    var api: WayRetrofit2Interface = Retrofit.Builder()
//        .baseUrl("http://apis.openapi.sk.com")
//        .addConverterFactory(GsonConverterFactory.create())
//        .build()
//        .create(WayRetrofit2Interface::class.java)
//}

