package com.google.android.gms.internal.p1942authapi;

import android.util.Base64;
import com.bytedance.covode.number.Covode;
import java.util.Random;

/* renamed from: com.google.android.gms.internal.auth-api.n */
public final class C25692n {

    /* renamed from: a */
    private static final Random f60830a = new Random();

    static {
        Covode.recordClassIndex(31106);
    }

    /* renamed from: a */
    public static String m49618a() {
        byte[] bArr = new byte[16];
        f60830a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
