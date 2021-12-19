package com.p2082ss.android.ugc.aweme.shortvideo;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.bm */
public final class C69891bm implements AbstractC70644do {
    static {
        Covode.recordClassIndex(82300);
    }

    C69891bm() {
    }

    @Override // com.p2082ss.android.ugc.aweme.shortvideo.AbstractC70644do
    /* renamed from: a */
    public final boolean mo110180a() {
        int beautificationMode = C63244g.m114602a().mo73277e().getBeautificationMode(0);
        if (beautificationMode == 0 || beautificationMode != 1) {
            return false;
        }
        return true;
    }
}
