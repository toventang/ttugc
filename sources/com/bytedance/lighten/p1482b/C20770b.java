package com.bytedance.lighten.p1482b;

import com.bytedance.covode.number.Covode;
import com.facebook.p1870h.C24314c;
import com.facebook.p1870h.C24317e;

/* renamed from: com.bytedance.lighten.b.b */
public final class C20770b implements C24314c.AbstractC24315a {

    /* renamed from: a */
    public static final C24314c f49132a = new C24314c("DNG", "dng");

    /* renamed from: b */
    private static final byte[] f49133b = {73, 73, 42, 0};

    /* renamed from: c */
    private static final byte[] f49134c = {77, 77, 0, 42};

    @Override // com.facebook.p1870h.C24314c.AbstractC24315a
    /* renamed from: a */
    public final int mo34188a() {
        return f49133b.length;
    }

    static {
        Covode.recordClassIndex(24343);
    }

    @Override // com.facebook.p1870h.C24314c.AbstractC24315a
    /* renamed from: a */
    public final C24314c mo34189a(byte[] bArr, int i) {
        byte[] bArr2 = f49133b;
        if (i < bArr2.length) {
            return null;
        }
        if (C24317e.m46273a(bArr, bArr2) || C24317e.m46273a(bArr, f49134c)) {
            return f49132a;
        }
        return null;
    }
}
