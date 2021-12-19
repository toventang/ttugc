package com.bytedance.sdk.bdlynx.view;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.bdlynx.p1677a.p1678a.C22589a;
import com.bytedance.sdk.bdlynx.p1677a.p1680c.C22607a;
import com.bytedance.sdk.bdlynx.p1686d.AbstractC22631a;
import com.lynx.tasm.C28818l;
import com.lynx.tasm.C28820n;
import org.json.JSONObject;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.sdk.bdlynx.view.c */
public final class C22677c {

    /* renamed from: a */
    public C28818l f53567a;

    /* renamed from: b */
    public String f53568b;

    /* renamed from: c */
    public boolean f53569c;

    /* renamed from: d */
    public C28820n f53570d;

    /* renamed from: e */
    public C22607a f53571e;

    /* renamed from: f */
    public AbstractC22631a f53572f;

    /* renamed from: g */
    public boolean f53573g;

    /* renamed from: h */
    public JSONObject f53574h;

    static {
        Covode.recordClassIndex(26496);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22677c)) {
            return false;
        }
        C22677c cVar = (C22677c) obj;
        return C89219l.m154714a(this.f53570d, cVar.f53570d) && C89219l.m154714a(this.f53571e, cVar.f53571e) && C89219l.m154714a(this.f53572f, cVar.f53572f) && this.f53573g == cVar.f53573g && C89219l.m154714a(this.f53574h, cVar.f53574h);
    }

    public final int hashCode() {
        C28820n nVar = this.f53570d;
        int i = 0;
        int hashCode = (nVar != null ? nVar.hashCode() : 0) * 31;
        C22607a aVar = this.f53571e;
        int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
        AbstractC22631a aVar2 = this.f53572f;
        int hashCode3 = (hashCode2 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
        boolean z = this.f53573g;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode3 + i2) * 31;
        JSONObject jSONObject = this.f53574h;
        if (jSONObject != null) {
            i = jSONObject.hashCode();
        }
        return i5 + i;
    }

    public final String toString() {
        return "BDLynxInitParams(lynxViewBuilder=" + this.f53570d + ", bdLynxInfo=" + this.f53571e + ", resLoader=" + this.f53572f + ", useDefaultClient=" + this.f53573g + ", globalProps=" + this.f53574h + ")";
    }

    public /* synthetic */ C22677c() {
        this(new C28820n(), new C22607a(), new JSONObject());
    }

    private C22677c(C28820n nVar, C22607a aVar, JSONObject jSONObject) {
        C89219l.m154719c(nVar, "");
        C89219l.m154719c(aVar, "");
        C89219l.m154719c(jSONObject, "");
        this.f53570d = nVar;
        this.f53571e = aVar;
        this.f53572f = null;
        this.f53573g = true;
        this.f53574h = jSONObject;
        Boolean c = C22589a.m42626a().mo36875c();
        C89219l.m154709a((Object) c, "");
        this.f53569c = c.booleanValue();
    }
}
