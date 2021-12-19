package com.p2082ss.android.socialbase.downloader.impls;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.socialbase.downloader.downloader.AbstractC30415i;
import com.p2082ss.android.socialbase.downloader.p2184g.EnumC30467l;

/* renamed from: com.ss.android.socialbase.downloader.impls.b */
public final class C30481b implements AbstractC30415i {
    static {
        Covode.recordClassIndex(37009);
    }

    @Override // com.p2082ss.android.socialbase.downloader.downloader.AbstractC30415i
    /* renamed from: a */
    public final int mo54080a(int i, EnumC30467l lVar) {
        if (lVar.ordinal() <= EnumC30467l.MODERATE.ordinal()) {
            return 1;
        }
        if (lVar == EnumC30467l.GOOD) {
            return i - 1;
        }
        return i;
    }
}
