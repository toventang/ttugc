package com.bytedance.helios.sdk.p1105g;

import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import p4600h.p4622m.C89338d;

/* renamed from: com.bytedance.helios.sdk.g.a */
public final class C15474a {
    static {
        Covode.recordClassIndex(17726);
    }

    /* renamed from: a */
    public static byte[] m28469a(String str) {
        if (str == null) {
            return null;
        }
        return str.getBytes(C89338d.f202990a);
    }

    /* renamed from: a */
    public static long m28468a(byte[] bArr) {
        int length = bArr.length;
        int i = length >> 3;
        long j = 104729;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = (i2 << 3) + 0;
            j = (Long.rotateLeft(j ^ (Long.rotateLeft(((((((((((long) bArr[i3]) & 255) | ((((long) bArr[i3 + 1]) & 255) << 8)) | ((((long) bArr[i3 + 2]) & 255) << 16)) | ((((long) bArr[i3 + 3]) & 255) << 24)) | ((((long) bArr[i3 + 4]) & 255) << 32)) | ((((long) bArr[i3 + 5]) & 255) << 40)) | ((((long) bArr[i3 + 6]) & 255) << 48)) | ((((long) bArr[i3 + 7]) & 255) << 56)) * -8663945395140668459L, 31) * 5545529020109919103L), 27) * 5) + 1390208809;
        }
        int i4 = (i << 3) + 0;
        long j2 = 0;
        switch ((length + 0) - i4) {
            case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY /*{ENCODED_INT: 7}*/:
                j2 = 0 ^ ((((long) bArr[i4 + 6]) & 255) << 48);
            case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY /*{ENCODED_INT: 6}*/:
                j2 ^= (((long) bArr[i4 + 5]) & 255) << 40;
            case ABRConfig.ABR_STARTUP_MODEL_KEY /*{ENCODED_INT: 5}*/:
                j2 ^= (((long) bArr[i4 + 4]) & 255) << 32;
            case 4:
                j2 ^= (((long) bArr[i4 + 3]) & 255) << 24;
            case 3:
                j2 ^= (((long) bArr[i4 + 2]) & 255) << 16;
            case 2:
                j2 ^= (((long) bArr[i4 + 1]) & 255) << 8;
            case 1:
                j ^= Long.rotateLeft(((((long) bArr[i4]) & 255) ^ j2) * -8663945395140668459L, 31) * 5545529020109919103L;
                break;
        }
        long j3 = ((long) length) ^ j;
        long j4 = (j3 ^ (j3 >>> 33)) * -49064778989728563L;
        long j5 = (j4 ^ (j4 >>> 33)) * -4265267296055464877L;
        return j5 ^ (j5 >>> 33);
    }
}
