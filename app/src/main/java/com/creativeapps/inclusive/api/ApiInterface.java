package com.creativeapps.inclusive.api;

import com.creativeapps.inclusive.data.User;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiInterface {

    @Multipart
    @POST("/v1/verifications/test/file_upload ")
    Call<User> addUser(
                        @Part("document") RequestBody document,
                        @Part("userId") RequestBody userId);
}
