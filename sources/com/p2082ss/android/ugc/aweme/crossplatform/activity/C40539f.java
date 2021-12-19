package com.p2082ss.android.ugc.aweme.crossplatform.activity;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.base.BaseViewModel;
import com.p2082ss.android.ugc.aweme.activity.processor.C33103x;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.f */
final /* synthetic */ class C40539f implements AbstractC89172b {

    /* renamed from: a */
    private final C33103x f94860a;

    static {
        Covode.recordClassIndex(48360);
    }

    C40539f(C33103x xVar) {
        this.f94860a = xVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        BaseViewModel baseViewModel = (BaseViewModel) obj;
        baseViewModel.config(new C40541h(this.f94860a));
        baseViewModel.config(C40542i.f94863a);
        return null;
    }
}
