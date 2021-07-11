package ru.otus.retrofittest;

import ru.otus.retrofittest.jsonExamples.pojo.User;
import retrofit2.Call;
import retrofit2.http.GET;

public interface APIInterface {
    @GET("2")
    Call<User> getUser();
}
