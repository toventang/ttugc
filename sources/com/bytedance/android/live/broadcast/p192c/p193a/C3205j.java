package com.bytedance.android.live.broadcast.p192c.p193a;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.gift.model.C8837b;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* renamed from: com.bytedance.android.live.broadcast.c.a.j */
final /* synthetic */ class C3205j implements AbstractC88433f {

    /* renamed from: a */
    private final C3200g f9232a;

    /* renamed from: b */
    private final String f9233b;

    static {
        Covode.recordClassIndex(3686);
    }

    C3205j(C3200g gVar, String str) {
        this.f9232a = gVar;
        this.f9233b = str;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C3200g gVar = this.f9232a;
        String str = this.f9233b;
        C5832d dVar = (C5832d) obj;
        if (gVar.f9221b) {
            if (((C8837b) dVar.data).f21696a) {
                str = null;
            }
            gVar.mo8555a(str);
        }
    }
}
