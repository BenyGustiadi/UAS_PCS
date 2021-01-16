package id.beny.githubuser.api

import id.beny.githubuser.data.model.DetailUserResponse
import id.beny.githubuser.data.model.User
import id.beny.githubuser.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token 291ebd7676fdbb6c200e02d8ff4a0ef9faf6351d")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token 291ebd7676fdbb6c200e02d8ff4a0ef9faf6351d")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token 291ebd7676fdbb6c200e02d8ff4a0ef9faf6351d")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token 291ebd7676fdbb6c200e02d8ff4a0ef9faf6351d")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}