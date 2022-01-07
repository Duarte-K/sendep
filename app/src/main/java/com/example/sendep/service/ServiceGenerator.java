package com.example.sendep.service;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.convert.AnnotationStrategy;
import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.strategy.Strategy;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

public class ServiceGenerator {
   public static <S> S createService(Class<S> serviceClass){
       HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();

       interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

       Strategy strategy = new AnnotationStrategy();

       Serializer serializer = new Persister(strategy);

       OkHttpClient okHttpClient = new OkHttpClient.Builder()
               .addInterceptor(interceptor)
               .connectTimeout(2, TimeUnit.MINUTES)
               .writeTimeout(2, TimeUnit.MINUTES)
               .readTimeout(2, TimeUnit.MINUTES)
               .build();

       Retrofit retrofit =  new Retrofit.Builder()
               .addConverterFactory(SimpleXmlConverterFactory.create(serializer))
               .baseUrl("http://www.webservicex.net/")
               .client(okHttpClient)
               .build();

       return retrofit.create(serviceClass);
   }
}
