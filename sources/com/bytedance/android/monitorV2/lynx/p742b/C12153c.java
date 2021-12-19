package com.bytedance.android.monitorV2.lynx.p742b;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import java.util.WeakHashMap;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.monitorV2.lynx.b.c */
public final class C12153c {

    /* renamed from: a */
    private final Map<String, String> f29210a = new WeakHashMap();

    static {
        Covode.recordClassIndex(13882);
    }

    /* renamed from: a */
    public final String mo19515a(String str) {
        return this.f29210a.get(str);
    }

    /* renamed from: a */
    public final void mo19516a(String str, String str2) {
        C89219l.m154719c(str2, "");
        if (str != null && str.length() != 0) {
            this.f29210a.put(str, str2);
        }
    }
}
