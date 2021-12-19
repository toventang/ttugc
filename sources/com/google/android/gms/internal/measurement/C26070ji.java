package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.internal.measurement.ji */
final class C26070ji {
    static {
        Covode.recordClassIndex(31485);
    }

    /* renamed from: a */
    static /* synthetic */ boolean m51016a(byte b) {
        return b < -32;
    }

    /* renamed from: b */
    static /* synthetic */ boolean m51017b(byte b) {
        return b < -16;
    }

    /* renamed from: c */
    private static boolean m51018c(byte b) {
        return b > -65;
    }

    /* renamed from: a */
    static /* synthetic */ void m51015a(byte b, char[] cArr, int i) {
        cArr[i] = (char) b;
    }

    /* renamed from: a */
    static /* synthetic */ void m51014a(byte b, byte b2, char[] cArr, int i) {
        if (b < -62 || m51018c(b2)) {
            throw C25994gr.m50614h();
        }
        cArr[i] = (char) (((b & 31) << 6) | (b2 & 63));
    }

    /* renamed from: a */
    static /* synthetic */ void m51013a(byte b, byte b2, byte b3, char[] cArr, int i) {
        if (m51018c(b2) || (b != -32 ? !(b != -19 || b2 < -96) : b2 < -96) || m51018c(b3)) {
            throw C25994gr.m50614h();
        }
        cArr[i] = (char) (((b & 15) << 12) | ((b2 & 63) << 6) | (b3 & 63));
    }

    /* renamed from: a */
    static /* synthetic */ void m51012a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (m51018c(b2) || (((b << 28) + (b2 + 112)) >> 30) != 0 || m51018c(b3) || m51018c(b4)) {
            throw C25994gr.m50614h();
        }
        int i2 = ((b & 7) << 18) | ((b2 & 63) << 12) | ((b3 & 63) << 6) | (b4 & 63);
        cArr[i] = (char) ((i2 >>> 10) + 55232);
        cArr[i + 1] = (char) ((i2 & 1023) + 56320);
    }
}
