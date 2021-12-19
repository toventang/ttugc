package com.p2082ss.android.ugc.aweme.notice.api.p3514e;

import com.bytedance.common.wschannel.p912b.C13654b;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notice.api.e.w */
public final class C61604w {

    /* renamed from: a */
    public final C13654b f139803a;

    /* renamed from: b */
    public final JSONObject f139804b;

    static {
        Covode.recordClassIndex(72282);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C61604w)) {
            return false;
        }
        C61604w wVar = (C61604w) obj;
        return C89219l.m154714a(this.f139803a, wVar.f139803a) && C89219l.m154714a(this.f139804b, wVar.f139804b);
    }

    public final int hashCode() {
        C13654b bVar = this.f139803a;
        int i = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        JSONObject jSONObject = this.f139804b;
        if (jSONObject != null) {
            i = jSONObject.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "WsConnectState(connectEvent=" + this.f139803a + ", connectJson=" + this.f139804b + ")";
    }

    public C61604w(C13654b bVar, JSONObject jSONObject) {
        this.f139803a = bVar;
        this.f139804b = jSONObject;
    }
}
