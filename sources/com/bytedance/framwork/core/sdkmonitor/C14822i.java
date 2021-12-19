package com.bytedance.framwork.core.sdkmonitor;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.framwork.core.p999b.p1004e.C14800d;

/* renamed from: com.bytedance.framwork.core.sdkmonitor.i */
public final class C14822i {

    /* renamed from: a */
    private static String f36140a;

    static {
        Covode.recordClassIndex(16923);
    }

    /* renamed from: a */
    public static String m27214a(Context context) {
        if (f36140a == null) {
            String replace = C14800d.m27167a().replace(context.getPackageName(), "p").replace(":", "_");
            f36140a = replace;
            f36140a = replace.replace(".", "_");
        }
        return f36140a;
    }
}
