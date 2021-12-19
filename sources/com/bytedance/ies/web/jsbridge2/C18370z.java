package com.bytedance.ies.web.jsbridge2;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.C18362v;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18297h;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.web.jsbridge2.z */
public final class C18370z implements AbstractC18293d {

    /* renamed from: a */
    private Set<String> f43947a;

    /* renamed from: b */
    private C18327al f43948b;

    static {
        Covode.recordClassIndex(21042);
    }

    C18370z(C18327al alVar, Set<String> set) {
        this.f43947a = set;
        this.f43948b = alVar;
    }

    @Override // com.bytedance.ies.web.p1285a.AbstractC18293d
    public final void call(C18297h hVar, JSONObject jSONObject) {
        if (this.f43947a.contains(hVar.f43670c)) {
            jSONObject.put("code", "-1");
            return;
        }
        hVar.f43676i = false;
        C18362v.C18363a a = C18362v.m34176a();
        a.f43923c = hVar.f43670c;
        a.f43922b = hVar.f43668a;
        a.f43924d = hVar.f43671d.toString();
        a.f43925e = hVar.f43669b;
        a.f43921a = String.valueOf(hVar.f43672e);
        a.f43926f = hVar.f43673f;
        a.f43927g = hVar.f43674g;
        this.f43948b.mo29335a(a.mo29399a());
    }
}
