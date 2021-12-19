package com.p2082ss.android.ugc.aweme.compliance.business.setting.p2657ui;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.base.BaseViewModel;
import com.p2082ss.android.ugc.aweme.activity.processor.C33103x;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.setting.ui.c */
final /* synthetic */ class C39541c implements AbstractC89172b {

    /* renamed from: a */
    private final C33103x f93273a;

    static {
        Covode.recordClassIndex(47249);
    }

    C39541c(C33103x xVar) {
        this.f93273a = xVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        BaseViewModel baseViewModel = (BaseViewModel) obj;
        baseViewModel.config(new C39551m(this.f93273a));
        baseViewModel.config(C39543e.f93275a);
        return null;
    }
}
