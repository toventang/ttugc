package com.p2082ss.android.ugc.aweme.commercialize.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.d */
public final class C38233d implements Serializable {
    @AbstractC27891c(mo46611a = "category_key")

    /* renamed from: a */
    private final String f90338a;
    @AbstractC27891c(mo46611a = "reason_text")

    /* renamed from: b */
    private final String f90339b;
    @AbstractC27891c(mo46611a = "toast_text")

    /* renamed from: c */
    private final String f90340c;

    static {
        Covode.recordClassIndex(45717);
    }

    public C38233d() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ C38233d copy$default(C38233d dVar, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dVar.f90338a;
        }
        if ((i & 2) != 0) {
            str2 = dVar.f90339b;
        }
        if ((i & 4) != 0) {
            str3 = dVar.f90340c;
        }
        return dVar.copy(str, str2, str3);
    }

    public final String component1() {
        return this.f90338a;
    }

    public final String component2() {
        return this.f90339b;
    }

    public final String component3() {
        return this.f90340c;
    }

    public final C38233d copy(String str, String str2, String str3) {
        return new C38233d(str, str2, str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38233d)) {
            return false;
        }
        C38233d dVar = (C38233d) obj;
        return C89219l.m154714a(this.f90338a, dVar.f90338a) && C89219l.m154714a(this.f90339b, dVar.f90339b) && C89219l.m154714a(this.f90340c, dVar.f90340c);
    }

    public final int hashCode() {
        String str = this.f90338a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f90339b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f90340c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "AdDislikeReasonModel(key=" + this.f90338a + ", reason=" + this.f90339b + ", toast=" + this.f90340c + ")";
    }

    public final String getKey() {
        return this.f90338a;
    }

    public final String getReason() {
        return this.f90339b;
    }

    public final String getToast() {
        return this.f90340c;
    }

    public C38233d(String str, String str2, String str3) {
        this.f90338a = str;
        this.f90339b = str2;
        this.f90340c = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C38233d(String str, String str2, String str3, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
