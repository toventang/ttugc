package com.p2082ss.android.ugc.aweme.music.presenter;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.music.presenter.u */
final /* synthetic */ class C60869u implements AbstractC89172b {

    /* renamed from: a */
    private final int f138337a;

    static {
        Covode.recordClassIndex(71457);
    }

    C60869u(int i) {
        this.f138337a = i;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        int i = this.f138337a;
        if (((Integer) obj).intValue() == 0) {
            return Integer.valueOf(i);
        }
        return Integer.valueOf(i + 1);
    }
}
