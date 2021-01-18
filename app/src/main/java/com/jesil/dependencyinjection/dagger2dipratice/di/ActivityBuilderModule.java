package com.jesil.dependencyinjection.dagger2dipratice.di;

import com.jesil.dependencyinjection.dagger2dipratice.AuthActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

//[@Module] class for calling any Activity class

@Module
public abstract class ActivityBuilderModule {

    /** Any class that uses the [@ContributesAndroidInjector]
        must be an abstract class
     */

    @ContributesAndroidInjector
    abstract AuthActivity contributeAuthActivity();

}
