package com.p2082ss.android.socialbase.downloader.impls;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.downloader.AbstractC30429u;

/* renamed from: com.ss.android.socialbase.downloader.impls.j */
public final class C30497j implements AbstractC30429u {
    static {
        Covode.recordClassIndex(37025);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30429u
    /* renamed from: a */
    public final long mo54207a(int i, int i2) {
        if (i == 1) {
            return 3000;
        }
        if (i == 2) {
            return 15000;
        }
        if (i == 3) {
            return 30000;
        }
        return i > 3 ? 300000 : 0;
    }
}
