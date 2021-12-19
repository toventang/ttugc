package com.bytedance.android.livesdk.widgets.giftwidget.p662b;

import com.bytedance.android.livesdk.chatroom.p488c.C7381an;
import com.bytedance.android.livesdk.gift.p548d.C8803g;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.livesdk.widgets.giftwidget.b.g */
final /* synthetic */ class C11490g implements AbstractC88433f {

    /* renamed from: a */
    private final C11483b f27563a;

    static {
        Covode.recordClassIndex(13149);
    }

    C11490g(C11483b bVar) {
        this.f27563a = bVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C11483b bVar = this.f27563a;
        if ((obj instanceof C7381an) && bVar.f27546a != null && bVar.mo18317a() && bVar.f27547b != null) {
            C8803g gVar = new C8803g();
            C7381an anVar = (C7381an) obj;
            gVar.f21681c = anVar.f18294a;
            gVar.f21683e = anVar.f18295b;
            gVar.f21680b = anVar.f18296c == null ? "jsb" : anVar.f18296c;
            bVar.f27547b.mo18280a(gVar);
        }
    }
}
