package com.bytedance.android.live.core.paging.p226c;

import com.bytedance.android.live.core.p213c.C3854a;
import com.bytedance.android.live.core.paging.p225b.C3988c;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.live.core.paging.c.h */
public final /* synthetic */ class C3998h implements AbstractC88433f {

    /* renamed from: a */
    private final AbstractC3993c f10952a;

    /* renamed from: b */
    private final C3988c f10953b;

    static {
        Covode.recordClassIndex(4529);
    }

    C3998h(AbstractC3993c cVar, C3988c cVar2) {
        this.f10952a = cVar;
        this.f10953b = cVar2;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        AbstractC3993c cVar = this.f10952a;
        C3988c cVar2 = this.f10953b;
        if (!cVar.f10942l.f10922h) {
            if (cVar2.f10923i) {
                C3854a.m9453a(3, "RxCacheDataSource", "called refresh, but paging not rebuild data source");
            }
            cVar2.f10923i = true;
            cVar.mo3719f_();
        }
    }
}
