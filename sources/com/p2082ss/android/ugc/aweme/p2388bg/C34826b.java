package com.p2082ss.android.ugc.aweme.p2388bg;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.specact.api.C74935b;
import com.p2082ss.android.ugc.aweme.specact.p3925a.C74932a;
import java.util.Arrays;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.bg.b */
public final class C34826b {
    @AbstractC27891c(mo46611a = "round_robin_interval")

    /* renamed from: a */
    public final Long f82262a = null;
    @AbstractC27891c(mo46611a = "rand_time")

    /* renamed from: b */
    public final Long f82263b = null;
    @AbstractC27891c(mo46611a = "popups")

    /* renamed from: c */
    public final C34829e[] f82264c = null;
    @AbstractC27891c(mo46611a = "notice")

    /* renamed from: d */
    public final C74935b[] f82265d = null;
    @AbstractC27891c(mo46611a = "activity_video_resource")

    /* renamed from: e */
    public final C74932a[] f82266e = null;

    static {
        Covode.recordClassIndex(41834);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34826b)) {
            return false;
        }
        C34826b bVar = (C34826b) obj;
        return C89219l.m154714a(this.f82262a, bVar.f82262a) && C89219l.m154714a(this.f82263b, bVar.f82263b) && C89219l.m154714a(this.f82264c, bVar.f82264c) && C89219l.m154714a(this.f82265d, bVar.f82265d) && C89219l.m154714a(this.f82266e, bVar.f82266e);
    }

    public final int hashCode() {
        Long l = this.f82262a;
        int i = 0;
        int hashCode = (l != null ? l.hashCode() : 0) * 31;
        Long l2 = this.f82263b;
        int hashCode2 = (hashCode + (l2 != null ? l2.hashCode() : 0)) * 31;
        C34829e[] eVarArr = this.f82264c;
        int hashCode3 = (hashCode2 + (eVarArr != null ? Arrays.hashCode(eVarArr) : 0)) * 31;
        C74935b[] bVarArr = this.f82265d;
        int hashCode4 = (hashCode3 + (bVarArr != null ? Arrays.hashCode(bVarArr) : 0)) * 31;
        C74932a[] aVarArr = this.f82266e;
        if (aVarArr != null) {
            i = Arrays.hashCode(aVarArr);
        }
        return hashCode4 + i;
    }

    public final String toString() {
        return "KproActivityResponseData(interval=" + this.f82262a + ", randTime=" + this.f82263b + ", popupSettings=" + Arrays.toString(this.f82264c) + ", mesEntraSettings=" + Arrays.toString(this.f82265d) + ", activityVideoResource=" + Arrays.toString(this.f82266e) + ")";
    }

    private C34826b() {
    }
}
