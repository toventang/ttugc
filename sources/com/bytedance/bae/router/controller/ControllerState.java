package com.bytedance.bae.router.controller;

import com.bytedance.covode.number.Covode;

interface ControllerState {
    static {
        Covode.recordClassIndex(15047);
    }

    int getState();

    void onEvent(int i, int i2);
}
