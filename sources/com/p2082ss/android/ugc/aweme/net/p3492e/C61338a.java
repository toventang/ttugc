package com.p2082ss.android.ugc.aweme.net.p3492e;

import android.net.NetworkInfo;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.framework.p3006a.C51423a;

/* renamed from: com.ss.android.ugc.aweme.net.e.a */
public final class C61338a {
    static {
        Covode.recordClassIndex(71971);
    }

    /* renamed from: a */
    public static NetworkInfo m111034a() {
        try {
            return (NetworkInfo) Class.forName("android.net.NetworkInfo").getConstructor(Integer.TYPE, Integer.TYPE, String.class, String.class).newInstance(1, 0, "CONNECTED", "CONNECTED");
        } catch (Exception e) {
            C51423a.m95790a((Throwable) e);
            return null;
        }
    }
}
