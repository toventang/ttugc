package com.bytedance.android.livesdk.toolbar.p641a;

import com.bytedance.android.live.design.view.AbstractC4084b;
import com.bytedance.android.live.gift.C4333i;
import com.bytedance.android.livesdk.service.p625c.p627b.C10723a;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.toolbar.a.g */
public final /* synthetic */ class C10899g implements AbstractC4084b {

    /* renamed from: a */
    private final C10898f f26196a;

    static {
        Covode.recordClassIndex(12507);
    }

    C10899g(C10898f fVar) {
        this.f26196a = fVar;
    }

    @Override // com.bytedance.android.live.design.view.AbstractC4084b
    /* renamed from: a */
    public final void mo9538a(int i) {
        C10898f fVar = this.f26196a;
        fVar.f26190a.postDelayed(RunnableC10902j.f26201a, 3000);
        if (fVar.f26191b != null) {
            fVar.f26191b.mo28315b(C4333i.class, (Object) false);
        }
        if (i == 1) {
            C10723a.m19301a(C10723a.EnumC10724a.TIME_UP);
        } else if (i == 3) {
            C10723a.m19301a(C10723a.EnumC10724a.USER_CLOSE);
        } else {
            C10723a.m19301a(C10723a.EnumC10724a.OTHER);
        }
    }
}
