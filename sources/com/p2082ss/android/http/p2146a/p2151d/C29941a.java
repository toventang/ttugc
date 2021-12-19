package com.p2082ss.android.http.p2146a.p2151d;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.http.a.d.a */
public final class C29941a {

    /* renamed from: a */
    public byte[] f71425a;

    /* renamed from: b */
    public int f71426b;

    static {
        Covode.recordClassIndex(36353);
    }

    public C29941a(int i) {
        if (i >= 0) {
            this.f71425a = new byte[i];
            return;
        }
        throw new IllegalArgumentException("Buffer capacity may not be negative");
    }
}
