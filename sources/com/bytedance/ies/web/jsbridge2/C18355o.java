package com.bytedance.ies.web.jsbridge2;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.p1285a.AbstractC18293d;
import com.bytedance.ies.web.p1285a.C18297h;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
/* renamed from: com.bytedance.ies.web.jsbridge2.o */
public final class C18355o extends AbstractC18333d {

    /* renamed from: b */
    private AbstractC18293d f43910b;

    static {
        Covode.recordClassIndex(21027);
    }

    C18355o(AbstractC18293d dVar) {
        this.f43910b = dVar;
    }

    /* access modifiers changed from: package-private */
    @Override // com.bytedance.ies.web.jsbridge2.AbstractC18333d
    /* renamed from: a */
    public final void mo29345a(C18362v vVar, C18306aa aaVar) {
        C18297h hVar = new C18297h();
        hVar.f43670c = vVar.f43915d;
        hVar.f43671d = new JSONObject(vVar.f43916e);
        hVar.f43669b = vVar.f43917f;
        hVar.f43668a = vVar.f43914c;
        hVar.f43672e = 0;
        hVar.f43673f = vVar.f43918g;
        hVar.f43674g = vVar.f43919h;
        hVar.f43676i = true;
        if (aaVar.f43782b != null) {
            hVar.f43675h = aaVar.f43782b.toString();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            this.f43910b.call(hVar, jSONObject);
        } catch (Exception unused) {
        }
        if (hVar.f43676i) {
            String jSONObject2 = jSONObject.toString();
            if (!aaVar.f43784d) {
                C18344j.m34123a((RuntimeException) new IllegalStateException("Jsb async call already finished: " + aaVar.f43781a + ", stub: " + aaVar.hashCode()));
            }
            aaVar.hashCode();
            aaVar.f43783c.mo29305a(jSONObject2);
            aaVar.f43784d = false;
            if (C18344j.f43884a) {
                jSONObject.optInt("code", 0);
            }
        }
    }
}
