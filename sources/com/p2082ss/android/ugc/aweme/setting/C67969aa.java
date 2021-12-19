package com.p2082ss.android.ugc.aweme.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.base.BaseViewModel;
import com.p2082ss.android.ugc.aweme.activity.processor.C33103x;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.setting.aa */
final /* synthetic */ class C67969aa implements AbstractC89172b {

    /* renamed from: a */
    private final C33103x f152291a;

    static {
        Covode.recordClassIndex(80148);
    }

    C67969aa(C33103x xVar) {
        this.f152291a = xVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        BaseViewModel baseViewModel = (BaseViewModel) obj;
        baseViewModel.config(new C68005at(this.f152291a));
        baseViewModel.config(C68006au.f152356a);
        return null;
    }
}
