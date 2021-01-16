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
    @Headers("Authorization: token f3614b99a8e87b675bf01155b11342dbc94e5211")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token f3614b99a8e87b675bf01155b11342dbc94e5211")
    fun getUserDetail(
        @Path("username") username : String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token f3614b99a8e87b675bf01155b11342dbc94e5211")
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token f3614b99a8e87b675bf01155b11342dbc94e5211")
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}