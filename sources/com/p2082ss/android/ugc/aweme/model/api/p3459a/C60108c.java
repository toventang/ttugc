package com.p2082ss.android.ugc.aweme.model.api.p3459a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.model.api.a.c */
public final class C60108c implements Serializable {
    @AbstractC27891c(mo46611a = "category_key")

    /* renamed from: a */
    private String f137014a;
    @AbstractC27891c(mo46611a = "info")

    /* renamed from: b */
    private String f137015b;

    static {
        Covode.recordClassIndex(70619);
    }

    public static /* synthetic */ C60108c copy$default(C60108c cVar, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cVar.f137014a;
        }
        if ((i & 2) != 0) {
            str2 = cVar.f137015b;
        }
        return cVar.copy(str, str2);
    }

    public final String component1() {
        return this.f137014a;
    }

    public final String component2() {
        return this.f137015b;
    }

    public final C60108c copy(String str, String str2) {
        return new C60108c(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60108c)) {
            return false;
        }
        C60108c cVar = (C60108c) obj;
        return C89219l.m154714a(this.f137014a, cVar.f137014a) && C89219l.m154714a(this.f137015b, cVar.f137015b);
    }

    public final int hashCode() {
        String str = this.f137014a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f137015b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ProfileNaviFeatureDataModel(category=" + this.f137014a + ", info=" + this.f137015b + ")";
    }

    public final String getCategory() {
        return this.f137014a;
    }

    public final String getInfo() {
        return this.f137015b;
    }

    public final void setCategory(String str) {
        this.f137014a = str;
    }

    public final void setInfo(String str) {
        this.f137015b = str;
    }

    public C60108c(String str, String str2) {
        this.f137014a = str;
        this.f137015b = str2;
    }
}
