package com.p2082ss.android.ugc.aweme.model.api.p3459a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.model.api.a.f */
public final class C60112f implements Serializable {
    @AbstractC27891c(mo46611a = "starter_navi_id")

    /* renamed from: a */
    private String f137025a;
    @AbstractC27891c(mo46611a = "staticImage")

    /* renamed from: b */
    private C60113g f137026b;

    static {
        Covode.recordClassIndex(70623);
    }

    public static /* synthetic */ C60112f copy$default(C60112f fVar, String str, C60113g gVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fVar.f137025a;
        }
        if ((i & 2) != 0) {
            gVar = fVar.f137026b;
        }
        return fVar.copy(str, gVar);
    }

    public final String component1() {
        return this.f137025a;
    }

    public final C60113g component2() {
        return this.f137026b;
    }

    public final C60112f copy(String str, C60113g gVar) {
        return new C60112f(str, gVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60112f)) {
            return false;
        }
        C60112f fVar = (C60112f) obj;
        return C89219l.m154714a(this.f137025a, fVar.f137025a) && C89219l.m154714a(this.f137026b, fVar.f137026b);
    }

    public final int hashCode() {
        String str = this.f137025a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C60113g gVar = this.f137026b;
        if (gVar != null) {
            i = gVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ProfileNaviInitialDataModel(id=" + this.f137025a + ", image=" + this.f137026b + ")";
    }

    public final String getId() {
        return this.f137025a;
    }

    public final C60113g getImage() {
        return this.f137026b;
    }

    public final void setId(String str) {
        this.f137025a = str;
    }

    public final void setImage(C60113g gVar) {
        this.f137026b = gVar;
    }

    public C60112f(String str, C60113g gVar) {
        this.f137025a = str;
        this.f137026b = gVar;
    }
}
