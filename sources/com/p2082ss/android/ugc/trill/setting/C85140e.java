package com.p2082ss.android.ugc.trill.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.base.BaseViewModel;
import com.p2082ss.android.ugc.aweme.activity.processor.C33103x;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.trill.setting.e */
final /* synthetic */ class C85140e implements AbstractC89172b {

    /* renamed from: a */
    private final C33103x f190492a;

    static {
        Covode.recordClassIndex(99180);
    }

    C85140e(C33103x xVar) {
        this.f190492a = xVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        ((BaseViewModel) obj).config(new C85141f(this.f190492a));
        return null;
    }
}
