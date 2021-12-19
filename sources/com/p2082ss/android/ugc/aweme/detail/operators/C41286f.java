package com.p2082ss.android.ugc.aweme.detail.operators;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.param.C49812b;

/* renamed from: com.ss.android.ugc.aweme.detail.operators.f */
final class C41286f extends C41285e {
    static {
        Covode.recordClassIndex(49174);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa, com.p2082ss.android.ugc.aweme.detail.operators.C41285e
    public final int getPageType(int i) {
        return i + 3000;
    }

    C41286f(String str) {
        super(str);
    }

    @Override // com.p2082ss.android.ugc.aweme.detail.operators.AbstractC41262aa, com.p2082ss.android.ugc.aweme.detail.operators.C41285e
    public final void request(int i, C49812b bVar, int i2, boolean z) {
        this.f96384a.f96340a = bVar.getPageType();
        super.request(i, bVar, i2, z);
    }
}
