package com.bytedance.android.livesdk.rank.impl.ranks;

import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.model.message.C9682bo;
import com.bytedance.android.livesdk.rank.impl.api.model.C10365b;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.rank.impl.ranks.g */
public final /* synthetic */ class C10547g implements AbstractC88433f {

    /* renamed from: a */
    private final C10546f f25366a;

    static {
        Covode.recordClassIndex(12122);
    }

    C10547g(C10546f fVar) {
        this.f25366a = fVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C10546f fVar = this.f25366a;
        C5832d dVar = (C5832d) obj;
        if (!(dVar == null || dVar.data == null || ((C10365b) dVar.data).f25048a == null || ((C10365b) dVar.data).f25048a.isEmpty())) {
            fVar.f25355a.clear();
            for (C9682bo boVar : ((C10365b) dVar.data).f25048a) {
                if (boVar.f23558a) {
                    fVar.f25355a.add(boVar);
                } else {
                    fVar.mo17373a(boVar.f23562e, (String) null, (String) null, "hide_by_api_request");
                }
            }
            if (!fVar.f25355a.isEmpty()) {
                fVar.mo17375b(C10546f.m19082a(fVar.f25355a));
            } else {
                fVar.mo17376b(true);
            }
        }
        fVar.mo17377c();
        fVar.f25356b = false;
    }
}
