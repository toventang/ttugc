package com.p2082ss.android.vesdk.runtime.oauth;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ttve.nativePort.C30731d;

/* renamed from: com.ss.android.vesdk.runtime.oauth.TEOAuth */
public class TEOAuth {
    private static native int nativeActivate(String str, String str2, String str3, String str4, String str5, String str6);

    private static native String nativeGetActivationCode();

    static {
        Covode.recordClassIndex(99737);
        C30731d.m63114a();
    }
}
