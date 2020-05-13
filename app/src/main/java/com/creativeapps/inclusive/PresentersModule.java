package com.creativeapps.inclusive;

import com.creativeapps.inclusive.ui.home.DefaultHomePresenter;
import com.creativeapps.inclusive.ui.home.HomePresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class PresentersModule {

    @Provides
    HomePresenter provideHomePresender() {
        return new DefaultHomePresenter();
    }
}