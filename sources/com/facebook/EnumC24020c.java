package com.facebook;

import com.bytedance.covode.number.Covode;

/* renamed from: com.facebook.c */
public enum EnumC24020c {
    NONE(false),
    FACEBOOK_APPLICATION_WEB(true),
    FACEBOOK_APPLICATION_NATIVE(true),
    FACEBOOK_APPLICATION_SERVICE(true),
    WEB_VIEW(true),
    CHROME_CUSTOM_TAB(true),
    TEST_USER(true),
    CLIENT_TOKEN(true),
    DEVICE_AUTH(true);
    
    public final boolean canExtendToken;

    static {
        Covode.recordClassIndex(28146);
    }

    private EnumC24020c(boolean z) {
        this.canExtendToken = z;
    }
}
