package com.p2082ss.android.socialbase.downloader.impls;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.downloader.AbstractC30429u;

/* renamed from: com.ss.android.socialbase.downloader.impls.q */
public final class C30505q implements AbstractC30429u {

    /* renamed from: a */
    private final long[] f72729a;

    static {
        Covode.recordClassIndex(37033);
    }

    public C30505q(String str) {
        this.f72729a = m62433a(str);
    }

    /* renamed from: a */
    private static long[] m62433a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String[] split = str.split(",");
            if (split.length == 0) {
                return null;
            }
            long[] jArr = new long[split.length];
            for (int i = 0; i < split.length; i++) {
                jArr[i] = Long.parseLong(split[i]);
            }
            return jArr;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30429u
    /* renamed from: a */
    public final long mo54207a(int i, int i2) {
        long[] jArr = this.f72729a;
        if (jArr == null || jArr.length <= 0) {
            return 0;
        }
        int i3 = i - 1;
        if (i3 < 0) {
            i3 = 0;
        }
        if (i3 > jArr.length - 1) {
            i3 = jArr.length - 1;
        }
        return jArr[i3];
    }
}
