package com.google.android.gms.common.internal;

import com.C1764a;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.common.internal.j */
public final class C25549j {

    /* renamed from: a */
    private static final int f60627a = 15;

    /* renamed from: b */
    private final String f60628b;

    /* renamed from: c */
    private final String f60629c;

    static {
        Covode.recordClassIndex(30952);
    }

    private C25549j(String str) {
        boolean z;
        C25565r.m49315a((Object) str, (Object) "log tag cannot be null");
        if (str.length() <= 23) {
            z = true;
        } else {
            z = false;
        }
        Object[] objArr = {str, 23};
        if (z) {
            this.f60628b = str;
            this.f60629c = null;
            return;
        }
        throw new IllegalArgumentException(C1764a.m5928a("tag \"%s\" is longer than the %d character maximum", objArr));
    }

    public C25549j(String str, byte b) {
        this(str);
    }
}
