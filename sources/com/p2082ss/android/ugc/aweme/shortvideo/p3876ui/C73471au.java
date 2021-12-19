package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.services.IAVMixFeedServiceImpl;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.au */
public final /* synthetic */ class C73471au implements AbstractC89172b {

    /* renamed from: a */
    private final C73461ak f165076a;

    /* renamed from: b */
    private final int f165077b;

    static {
        Covode.recordClassIndex(86208);
    }

    C73471au(C73461ak akVar, int i) {
        this.f165076a = akVar;
        this.f165077b = i;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        C73461ak akVar = this.f165076a;
        int i = this.f165077b;
        akVar.f165035T = i;
        akVar.mo116061a(i);
        akVar.f165026K = "";
        akVar.mo116065b();
        IAVMixFeedServiceImpl.createIAVMixFeedServicebyMonsterPlugin(false).updateFeedEvent();
        return C89391z.f203057a;
    }
}
