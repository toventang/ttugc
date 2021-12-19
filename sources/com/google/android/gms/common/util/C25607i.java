package com.google.android.gms.common.util;

import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.common.util.i */
public final class C25607i {

    /* renamed from: a */
    public static final char[] f60720a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    private static final char[] f60721b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    static {
        Covode.recordClassIndex(31017);
    }

    /* renamed from: a */
    public static String m49417a(byte[] bArr) {
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length << 1);
        for (int i = 0; i < length; i++) {
            char[] cArr = f60721b;
            sb.append(cArr[(bArr[i] & 240) >>> 4]);
            sb.append(cArr[bArr[i] & 15]);
        }
        return sb.toString();
    }
}
