package com.p2082ss.android.ugc.aweme.crossplatform.p2712e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.web.jsbridge.p4241a.C81577a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.e.d */
public final class C40651d {

    /* renamed from: a */
    public final C81577a.C81579b f95228a;

    /* renamed from: b */
    public final C81577a.C81581d f95229b;

    static {
        Covode.recordClassIndex(48491);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40651d)) {
            return false;
        }
        C40651d dVar = (C40651d) obj;
        return C89219l.m154714a(this.f95228a, dVar.f95228a) && C89219l.m154714a(this.f95229b, dVar.f95229b);
    }

    public final int hashCode() {
        C81577a.C81579b bVar = this.f95228a;
        int i = 0;
        int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
        C81577a.C81581d dVar = this.f95229b;
        if (dVar != null) {
            i = dVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "JsRequestAndResponse(jsRequest=" + this.f95228a + ", jsResponse=" + this.f95229b + ")";
    }

    public C40651d(C81577a.C81579b bVar, C81577a.C81581d dVar) {
        this.f95228a = bVar;
        this.f95229b = dVar;
    }
}
