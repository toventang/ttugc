package com.bytedance.android.monitor.p720m;

import com.bytedance.covode.number.Covode;
import java.net.URL;

/* renamed from: com.bytedance.android.monitor.m.b */
public final class C12000b {
    static {
        Covode.recordClassIndex(13727);
    }

    /* renamed from: a */
    public static String[] m21196a(String str) {
        try {
            URL url = new URL(str);
            return new String[]{url.getHost(), url.getPath()};
        } catch (Exception unused) {
            return new String[]{"", ""};
        }
    }
}
