package com.p2082ss.android.socialbase.downloader.impls;

import android.text.TextUtils;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.downloader.AbstractC30421m;
import com.p2082ss.android.socialbase.downloader.p2189k.C30535g;

/* renamed from: com.ss.android.socialbase.downloader.impls.i */
public final class C30496i implements AbstractC30421m {
    static {
        Covode.recordClassIndex(37024);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30421m
    /* renamed from: a */
    public final int mo54141a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return 0;
        }
        String c = C30535g.m62590c(C1764a.m5928a("%s_%s", new Object[]{str, str2}));
        if (TextUtils.isEmpty(c)) {
            return 0;
        }
        return c.hashCode();
    }
}
