package com.p2082ss.android.ugc.aweme.live.livehostimpl;

import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.AbstractC34824bg;
import com.p2082ss.android.ugc.aweme.ttlive.C79335a;

/* renamed from: com.ss.android.ugc.aweme.live.livehostimpl.h */
final /* synthetic */ class C58685h implements AbstractC34824bg {

    /* renamed from: a */
    private final IHostAction.AbstractC11786a f133601a;

    /* renamed from: b */
    private final C79335a f133602b;

    static {
        Covode.recordClassIndex(68987);
    }

    C58685h(IHostAction.AbstractC11786a aVar, C79335a aVar2) {
        this.f133601a = aVar;
        this.f133602b = aVar2;
    }

    @Override // com.p2082ss.android.ugc.aweme.AbstractC34824bg
    /* renamed from: a */
    public final void mo61666a(String str, boolean z) {
        IHostAction.AbstractC11786a aVar = this.f133601a;
        C79335a aVar2 = this.f133602b;
        if (z) {
            aVar.mo8361a(str, aVar2.f178246d);
        } else {
            aVar.mo8360a("");
        }
    }
}
