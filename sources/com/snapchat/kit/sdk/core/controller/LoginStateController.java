package com.snapchat.kit.sdk.core.controller;

import com.bytedance.covode.number.Covode;

public interface LoginStateController {

    public interface OnLoginStartListener {
        static {
            Covode.recordClassIndex(35159);
        }

        void onLoginStart();
    }

    public interface OnLoginStateChangedListener {
        static {
            Covode.recordClassIndex(35160);
        }

        void onLoginFailed();

        void onLoginSucceeded();

        void onLogout();
    }

    static {
        Covode.recordClassIndex(35158);
    }

    void addOnLoginStartListener(OnLoginStartListener onLoginStartListener);

    void addOnLoginStateChangedListener(OnLoginStateChangedListener onLoginStateChangedListener);

    void removeOnLoginStartListener(OnLoginStartListener onLoginStartListener);

    void removeOnLoginStateChangedListener(OnLoginStateChangedListener onLoginStateChangedListener);
}
