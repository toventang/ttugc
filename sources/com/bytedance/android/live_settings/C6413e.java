package com.bytedance.android.live_settings;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live_settings.e */
public final class C6413e implements AbstractC6412d {

    /* renamed from: a */
    private final boolean f15990a;

    static {
        Covode.recordClassIndex(7145);
    }

    @Override // com.bytedance.android.live_settings.AbstractC6412d
    /* renamed from: a */
    public final void mo12559a(String str, long j) {
        C89219l.m154719c(str, "");
    }

    public C6413e(boolean z) {
        this.f15990a = z;
    }

    @Override // com.bytedance.android.live_settings.AbstractC6412d
    /* renamed from: a */
    public final void mo12560a(String str, String str2) {
        C89219l.m154719c(str, "");
        C89219l.m154719c(str2, "");
        if (this.f15990a) {
            throw new Throwable(str + ' ' + str2);
        }
    }
}
