package com.p2082ss.android.ugc.aweme.mvtemplate;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.mvtemplate.C61242a;
import com.p2082ss.android.ugc.aweme.utils.C80273bt;
import p4600h.p4611f.p4612a.AbstractC89171a;

/* renamed from: com.ss.android.ugc.aweme.mvtemplate.c */
final /* synthetic */ class C61253c implements AbstractC89171a {

    /* renamed from: a */
    private final C61242a.C612431 f139103a;

    static {
        Covode.recordClassIndex(71868);
    }

    C61253c(C61242a.C612431 r1) {
        this.f139103a = r1;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89171a
    public final Object invoke() {
        C61242a.C612431 r1 = this.f139103a;
        if (C61242a.this.f139057a != null) {
            C80273bt.m139146b(C61242a.this.f139057a);
        }
        if (C61242a.this.f139063g == null) {
            return null;
        }
        C61242a.this.f139063g.onFinish(0);
        return null;
    }
}
