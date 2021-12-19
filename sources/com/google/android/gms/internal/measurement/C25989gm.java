package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.measurement.gm */
public final class C25989gm {

    /* renamed from: a */
    static final Charset f61260a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f61261b;

    /* renamed from: c */
    private static final Charset f61262c = Charset.forName("ISO-8859-1");

    /* renamed from: d */
    private static final ByteBuffer f61263d;

    /* renamed from: e */
    private static final AbstractC25955fn f61264e;

    /* renamed from: a */
    public static int m50598a(boolean z) {
        return z ? 1231 : 1237;
    }

    static {
        Covode.recordClassIndex(31404);
        byte[] bArr = new byte[0];
        f61261b = bArr;
        f61263d = ByteBuffer.wrap(bArr);
        f61264e = AbstractC25955fn.m50255a(bArr, bArr.length);
    }

    /* renamed from: a */
    static <T> T m50599a(T t) {
        Objects.requireNonNull(t);
        return t;
    }

    /* renamed from: a */
    public static String m50602a(byte[] bArr) {
        return new String(bArr, f61260a);
    }

    /* renamed from: a */
    static Object m50600a(Object obj, Object obj2) {
        return ((AbstractC26020hq) obj).mo42622n().mo42357a((AbstractC26020hq) obj2).mo42628v();
    }

    /* renamed from: a */
    static <T> T m50601a(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    /* renamed from: a */
    static int m50597a(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }
}
