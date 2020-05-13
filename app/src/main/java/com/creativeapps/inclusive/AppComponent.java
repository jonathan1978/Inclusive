package com.creativeapps.inclusive;

import com.creativeapps.inclusive.api.ApiModule;
import com.creativeapps.inclusive.ui.home.HomeActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, ApiModule.class, PresentersModule.class})
public interface AppComponent {
    // to update the fields for your presenters
    void inject(HomeActivity main);
}