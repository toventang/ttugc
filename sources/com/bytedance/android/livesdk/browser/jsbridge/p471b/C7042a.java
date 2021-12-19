package com.bytedance.android.livesdk.browser.jsbridge.p471b;

import com.bytedance.android.live.p407t.C6193a;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.browser.jsbridge.b.a */
public final class C7042a {
    static {
        Covode.recordClassIndex(7781);
    }

    /* renamed from: a */
    public static String m15006a(String str) {
        String str2 = "?";
        if (str.indexOf(str2) > 0) {
            str2 = "&";
        }
        return str + str2 + "live_sdk_version=" + ((IHostContext) C6193a.m13435a(IHostContext.class)).getVersionCode();
    }
}
