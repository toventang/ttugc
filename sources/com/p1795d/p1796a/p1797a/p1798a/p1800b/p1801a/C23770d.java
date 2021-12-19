package com.p1795d.p1796a.p1797a.p1798a.p1800b.p1801a;

import com.bytedance.covode.number.Covode;
import com.p1795d.p1796a.p1797a.p1798a.p1804e.C23800c;
import com.p1795d.p1796a.p1797a.p1798a.p1804e.C23801d;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.d.a.a.a.b.a.d */
public final class C23770d {

    /* renamed from: a */
    public final boolean f56226a = false;

    /* renamed from: b */
    public final Float f56227b = null;

    /* renamed from: c */
    public final boolean f56228c = true;

    /* renamed from: d */
    public final EnumC23769c f56229d;

    static {
        Covode.recordClassIndex(27878);
    }

    private C23770d(EnumC23769c cVar) {
        this.f56229d = cVar;
    }

    /* renamed from: a */
    public static C23770d m44927a(EnumC23769c cVar) {
        C23801d.m44992a(cVar, "Position is null");
        return new C23770d(cVar);
    }

    /* renamed from: a */
    public final JSONObject mo39234a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f56226a);
            if (this.f56226a) {
                jSONObject.put("skipOffset", this.f56227b);
            }
            jSONObject.put("autoPlay", this.f56228c);
            jSONObject.put("position", this.f56229d);
        } catch (JSONException unused) {
            C23800c.m44990b("VastProperties: JSON error");
        }
        return jSONObject;
    }
}
