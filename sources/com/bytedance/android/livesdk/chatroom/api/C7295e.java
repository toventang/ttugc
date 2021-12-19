package com.bytedance.android.livesdk.chatroom.api;

import com.bytedance.android.live.network.response.C5831c;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.chatroom.model.p495b.C7668g;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88434g;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.chatroom.api.e */
public final /* synthetic */ class C7295e implements AbstractC88434g {

    /* renamed from: a */
    static final AbstractC88434g f18129a = new C7295e();

    static {
        Covode.recordClassIndex(8058);
    }

    private C7295e() {
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88434g
    public final Object apply(Object obj) {
        C5832d dVar = (C5832d) obj;
        C5831c cVar = new C5831c();
        cVar.f14683a = dVar.statusCode;
        cVar.f14685c = dVar.extra;
        cVar.f14686d = dVar.error;
        cVar.f14684b = ((C7668g) dVar.data).f19015a;
        return cVar;
    }
}
