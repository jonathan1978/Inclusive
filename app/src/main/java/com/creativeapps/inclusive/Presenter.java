package com.creativeapps.inclusive;

public interface Presenter<T extends View> {
    void onDestroy();
    void setView(T view);
}
