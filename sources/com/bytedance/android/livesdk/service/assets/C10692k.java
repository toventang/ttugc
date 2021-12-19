package com.bytedance.android.livesdk.service.assets;

import android.os.SystemClock;
import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.live.network.response.C5832d;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdk.p425aa.p429d.C6542d;
import com.bytedance.android.livesdk.service.assets.C10690j;
import com.bytedance.android.livesdk.service.network.C10761a;
import com.bytedance.covode.number.Covode;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.service.assets.k */
public final /* synthetic */ class C10692k implements AbstractC88433f {

    /* renamed from: a */
    private final C10690j f25748a;

    /* renamed from: b */
    private final long f25749b;

    static {
        Covode.recordClassIndex(12289);
    }

    C10692k(C10690j jVar, long j) {
        this.f25748a = jVar;
        this.f25749b = j;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C10690j jVar = this.f25748a;
        long j = this.f25749b;
        C5832d dVar = (C5832d) obj;
        jVar.f25745a.clear();
        jVar.f25745a.addAll(((C10761a) dVar.data).f25918a);
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = dVar.extra.now;
        for (Prop prop : jVar.f25745a) {
            prop.setNowTimeDiff((j2 - currentTimeMillis) / 1000);
        }
        for (C10690j.AbstractC10691a aVar : jVar.f25746b) {
            aVar.mo16813b(jVar.f25745a);
        }
        C3868c.m9488a(C6542d.m13984a("ttlive_prop_list_status"), 0, SystemClock.uptimeMillis() - j);
    }
}
