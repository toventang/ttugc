package com.bytedance.ies.xbridge.platform.lynx;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xbridge.AbstractC18754n;
import com.bytedance.ies.xbridge.EnumC18483e;
import com.bytedance.ies.xbridge.p1290b.AbstractC18408d;
import com.bytedance.ies.xbridge.platform.lynx.p1355a.C18837d;
import com.bytedance.ies.xbridge.platform.lynx.p1355a.C18840g;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.xbridge.platform.lynx.b */
public final class C18842b implements AbstractC18408d {
    static {
        Covode.recordClassIndex(21539);
    }

    @Override // com.bytedance.ies.xbridge.p1290b.AbstractC18408d
    /* renamed from: a */
    public final boolean mo29438a(EnumC18483e eVar) {
        C89219l.m154719c(eVar, "");
        if (eVar == EnumC18483e.LYNX) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.ies.xbridge.p1290b.AbstractC18408d
    /* renamed from: a */
    public final AbstractC18754n mo29437a(JSONObject jSONObject) {
        C89219l.m154719c(jSONObject, "");
        C89219l.m154719c(jSONObject, "");
        return new C18840g(C18837d.m34973a(jSONObject));
    }
}
