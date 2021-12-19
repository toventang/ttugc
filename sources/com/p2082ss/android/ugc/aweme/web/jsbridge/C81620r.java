package com.p2082ss.android.ugc.aweme.web.jsbridge;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18288a;
import com.bytedance.ies.web.p1285a.C18297h;
import com.p2082ss.android.ugc.aweme.web.jsbridge.p4241a.AbstractC81582b;
import com.p2082ss.android.ugc.aweme.web.jsbridge.p4241a.C81577a;
import com.p2082ss.android.ugc.aweme.web.jsbridge.p4241a.C81583c;
import com.p2082ss.android.ugc.aweme.web.jsbridge.p4241a.C81589d;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.r */
public final class C81620r implements AbstractC18293d {

    /* renamed from: a */
    private C18288a f182512a;

    /* renamed from: b */
    private C81577a.AbstractC81580c f182513b;

    static {
        Covode.recordClassIndex(95017);
    }

    public C81620r(C18288a aVar, C81577a.AbstractC81580c cVar) {
        this.f182512a = aVar;
        this.f182513b = cVar;
    }

    @Override // com.bytedance.ies.web.p1285a.AbstractC18293d
    public final void call(C18297h hVar, JSONObject jSONObject) {
        AbstractC81582b dVar;
        try {
            hVar.f43676i = false;
            C18288a aVar = this.f182512a;
            C81577a.AbstractC81580c cVar = this.f182513b;
            String a = C81577a.m141440a(hVar);
            if (a.hashCode() == 3708 && a.equals("v2")) {
                dVar = new C81589d(hVar, jSONObject, aVar, null, cVar);
            } else {
                dVar = new C81583c(hVar, jSONObject, aVar, null, cVar);
            }
            dVar.mo125268a();
        } catch (Exception unused) {
        }
    }
}
