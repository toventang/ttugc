package com.p2082ss.optimizer.live.sdk.dns;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.optimizer.live.sdk.dns.b */
public final class C86151b {
    static {
        Covode.recordClassIndex(101293);
    }

    /* renamed from: a */
    public static String m147957a(String str, AbstractC86157e eVar) {
        if (TextUtils.isEmpty(str) || eVar == null) {
            return null;
        }
        String a = eVar.mo136414a(str);
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        return null;
    }
}
