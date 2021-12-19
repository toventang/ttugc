package com.bytedance.android.livesdk.feed.drawerfeed;

import com.bytedance.android.livesdk.feed.p529e.C8565a;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.feed.drawerfeed.m */
final /* synthetic */ class C8557m implements AbstractC88433f {

    /* renamed from: a */
    private final C8555l f21155a;

    static {
        Covode.recordClassIndex(9412);
    }

    C8557m(C8555l lVar) {
        this.f21155a = lVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C8555l lVar = this.f21155a;
        int i = ((C8565a) obj).f21171a;
        if (i == 0) {
            lVar.f21148f.mo14732b();
        } else if (i == 1) {
            lVar.f21148f.mo14731a();
        }
    }
}
