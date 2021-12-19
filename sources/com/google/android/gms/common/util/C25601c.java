package com.google.android.gms.common.util;

import android.util.Base64;
import com.bytedance.covode.number.Covode;

/* renamed from: com.google.android.gms.common.util.c */
public final class C25601c {
    static {
        Covode.recordClassIndex(31011);
    }

    /* renamed from: a */
    public static String m49405a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
