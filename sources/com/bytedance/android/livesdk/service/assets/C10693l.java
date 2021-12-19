package com.bytedance.android.livesdk.service.assets;

import com.bytedance.android.live.core.p214d.C3868c;
import com.bytedance.android.livesdk.p425aa.p426a.C6499a;
import com.bytedance.android.livesdk.p425aa.p426a.EnumC6500b;
import com.bytedance.android.livesdk.p425aa.p429d.C6542d;
import com.bytedance.android.livesdk.service.assets.C10690j;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Iterator;
import p4560f.p4561a.p4567d.AbstractC88433f;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.android.livesdk.service.assets.l */
public final /* synthetic */ class C10693l implements AbstractC88433f {

    /* renamed from: a */
    private final C10690j f25750a;

    static {
        Covode.recordClassIndex(12290);
    }

    C10693l(C10690j jVar) {
        this.f25750a = jVar;
    }

    @Override // p4560f.p4561a.p4567d.AbstractC88433f
    public final void accept(Object obj) {
        C10690j jVar = this.f25750a;
        Throwable th = (Throwable) obj;
        if (th instanceof Exception) {
            Iterator<C10690j.AbstractC10691a> it = jVar.f25746b.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        jVar.f25747c = false;
        String message = th.getMessage();
        HashMap hashMap = new HashMap();
        hashMap.put("error_msg", message);
        C3868c.m9489a(C6542d.m13984a("ttlive_prop_list_status"), 1, 0, hashMap);
        C3868c.m9491a(C6542d.m13985b("ttlive_prop_list_status"), 1, hashMap);
        C6499a.m13906a();
        C6499a.m13912a(EnumC6500b.Gift.info, "ttlive_prop_list_status", hashMap);
    }
}
