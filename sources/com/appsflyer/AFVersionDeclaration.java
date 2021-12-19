package com.appsflyer;

import com.bytedance.covode.number.Covode;

public class AFVersionDeclaration {
    private static String googleSdkIdentifier;

    static {
        Covode.recordClassIndex(2497);
    }

    private AFVersionDeclaration() {
    }

    public static void init() {
        googleSdkIdentifier = "!SDK-VERSION-STRING!:com.appsflyer:af-android-sdk:5.4.1";
    }
}
