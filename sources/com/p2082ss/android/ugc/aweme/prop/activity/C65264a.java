package com.p2082ss.android.ugc.aweme.prop.activity;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.foundation.base.BaseViewModel;
import com.p2082ss.android.ugc.aweme.activity.processor.C33103x;
import p4600h.p4611f.p4612a.AbstractC89172b;

/* renamed from: com.ss.android.ugc.aweme.prop.activity.a */
final /* synthetic */ class C65264a implements AbstractC89172b {

    /* renamed from: a */
    private final C33103x f147270a;

    static {
        Covode.recordClassIndex(76742);
    }

    C65264a(C33103x xVar) {
        this.f147270a = xVar;
    }

    @Override // p4600h.p4611f.p4612a.AbstractC89172b
    public final Object invoke(Object obj) {
        BaseViewModel baseViewModel = (BaseViewModel) obj;
        baseViewModel.config(new C65265b(this.f147270a));
        baseViewModel.config(C65266c.f147272a);
        return null;
    }
}
