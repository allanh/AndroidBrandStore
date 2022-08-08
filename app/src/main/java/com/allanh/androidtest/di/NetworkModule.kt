
package com.allanh.androidtest.di

import android.content.Context
import androidx.annotation.NonNull
import com.allanh.androidtest.BuildConfig
import com.allanh.androidtest.api.SpaceApiService
import com.allanh.androidtest.utils.*
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


/**
 * Static methods used to inject classes needed for various Activities and Fragments.
 */
val networkModule = module {
    single { provideGson() }
    single { provideHttpClient(get()) }

    single { provideRetrofit(get(), get(), BuildConfig.APIServer) }

    single { provideRetrofitService(get(), SpaceApiService::class.java) }
}

fun provideGson(): Gson {
    return GsonBuilder()
        .registerTypeAdapter(String::class.java, StringTypeAdapter())
        .registerTypeAdapter(Int::class.java, IntTypeAdapter())
        .registerTypeAdapter(Long::class.java, LongTypeAdapter())
        .registerTypeAdapter(Float::class.java, FloatTypeAdapter())
        .registerTypeAdapter(Double::class.java, DoubleTypeAdapter())
        .create()
}

fun provideHttpClient(context: Context): OkHttpClient {
    val builder = OkHttpClient.Builder()

    builder.readTimeout(10, TimeUnit.SECONDS)
        .connectTimeout(10, TimeUnit.SECONDS)

    if (BuildConfig.DEBUG) {
        val httpLoggingInterceptor = HttpLoggingInterceptor()
        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        builder.addInterceptor(httpLoggingInterceptor)
    }

    return builder.build()
}

fun provideRetrofit(@NonNull okHttpClient: OkHttpClient, gson: Gson, apiHost: String): Retrofit {
    return Retrofit.Builder()
        .client(okHttpClient)
        .baseUrl(apiHost)
        .addConverterFactory(GsonConverterFactory.create(gson))
        .build()
}

fun <T> provideRetrofitService(@NonNull retrofit: Retrofit, className: Class<T>): T =
    retrofit.create(className)