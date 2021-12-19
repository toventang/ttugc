package com.p1795d.p1796a.p1797a.p1798a.p1800b;

import com.bytedance.covode.number.Covode;
import com.p1795d.p1796a.p1797a.p1798a.p1804e.C23798b;
import com.p1795d.p1796a.p1797a.p1798a.p1804e.C23801d;
import org.json.JSONObject;

/* renamed from: com.d.a.a.a.b.c */
public final class C23772c {

    /* renamed from: a */
    final EnumC23778i f56230a;

    /* renamed from: b */
    public final EnumC23778i f56231b;

    /* renamed from: c */
    private final boolean f56232c;

    /* renamed from: d */
    private final EnumC23775f f56233d;

    /* renamed from: e */
    private final EnumC23777h f56234e;

    static {
        Covode.recordClassIndex(27880);
    }

    private C23772c(EnumC23775f fVar, EnumC23777h hVar, EnumC23778i iVar, EnumC23778i iVar2) {
        this.f56233d = fVar;
        this.f56234e = hVar;
        this.f56230a = iVar;
        if (iVar2 == null) {
            this.f56231b = EnumC23778i.NONE;
        } else {
            this.f56231b = iVar2;
        }
        this.f56232c = false;
    }

    /* renamed from: a */
    public final JSONObject mo39240a() {
        Object obj;
        String str;
        JSONObject jSONObject = new JSONObject();
        C23798b.m44985a(jSONObject, "impressionOwner", this.f56230a);
        if (this.f56233d == null || this.f56234e == null) {
            obj = this.f56231b;
            str = "videoEventsOwner";
        } else {
            C23798b.m44985a(jSONObject, "mediaEventsOwner", this.f56231b);
            C23798b.m44985a(jSONObject, "creativeType", this.f56233d);
            obj = this.f56234e;
            str = "impressionType";
        }
        C23798b.m44985a(jSONObject, str, obj);
        C23798b.m44985a(jSONObject, "isolateVerificationScripts", Boolean.valueOf(this.f56232c));
        return jSONObject;
    }

    /* renamed from: a */
    public static C23772c m44935a(EnumC23775f fVar, EnumC23777h hVar, EnumC23778i iVar, EnumC23778i iVar2) {
        C23801d.m44992a(fVar, "CreativeType is null");
        C23801d.m44992a(hVar, "ImpressionType is null");
        C23801d.m44992a(iVar, "Impression owner is null");
        if (iVar == EnumC23778i.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        } else if (fVar == EnumC23775f.DEFINED_BY_JAVASCRIPT && iVar == EnumC23778i.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        } else if (hVar != EnumC23777h.DEFINED_BY_JAVASCRIPT || iVar != EnumC23778i.NATIVE) {
            return new C23772c(fVar, hVar, iVar, iVar2);
        } else {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }
}
