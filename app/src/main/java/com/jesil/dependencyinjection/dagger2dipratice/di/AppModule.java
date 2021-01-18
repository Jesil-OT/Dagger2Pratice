package com.jesil.dependencyinjection.dagger2dipratice.di;

import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;

import androidx.core.content.ContextCompat;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.request.RequestOptions;
import com.jesil.dependencyinjection.dagger2dipratice.R;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @Module class for calling any application level dependency eg
 * the [Glide] instance, the [Retrofit] instance...
 */

@Module
public class AppModule {

   @Provides
   @Singleton
   static RequestOptions provideRequestOptions(){
       return RequestOptions
               .placeholderOf(R.drawable.white_background)
               .error(R.drawable.white_background);
   }

   @Provides
   @Singleton
    static RequestManager provideGlideInstance(Application application, RequestOptions requestOptions){
       return Glide.with(application)
               .setDefaultRequestOptions(requestOptions);
   }

   @Provides
   @Singleton
   static Drawable provideAppDrawable(Application application){
       return ContextCompat.getDrawable(application, R.drawable.logo);
   }


}
