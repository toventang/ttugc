package com.snapchat.kit.sdk.core.controller;

import com.bytedance.covode.number.Covode;

public interface FirebaseStateController {

    public interface OnFirebaseCustomTokenResultListener {
        static {
            Covode.recordClassIndex(35157);
        }

        void onFailure(EnumC28970a aVar);

        void onSuccess(String str);
    }

    static {
        Covode.recordClassIndex(35156);
    }

    void addOnFirebaseCustomTokenResultListener(OnFirebaseCustomTokenResultListener onFirebaseCustomTokenResultListener);

    void removeOnFirebaseCustomTokenResultListener(OnFirebaseCustomTokenResultListener onFirebaseCustomTokenResultListener);
}
