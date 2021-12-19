package com.p2082ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.api.model.b */
public final class C39241b implements Serializable {
    @AbstractC27891c(mo46611a = "ban_type")

    /* renamed from: a */
    private final Integer f92682a;
    @AbstractC27891c(mo46611a = "ban_platform")

    /* renamed from: b */
    private final Integer f92683b;

    static {
        Covode.recordClassIndex(46899);
    }

    public C39241b() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ C39241b copy$default(C39241b bVar, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = bVar.f92682a;
        }
        if ((i & 2) != 0) {
            num2 = bVar.f92683b;
        }
        return bVar.copy(num, num2);
    }

    public final Integer component1() {
        return this.f92682a;
    }

    public final Integer component2() {
        return this.f92683b;
    }

    public final C39241b copy(Integer num, Integer num2) {
        return new C39241b(num, num2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39241b)) {
            return false;
        }
        C39241b bVar = (C39241b) obj;
        return C89219l.m154714a(this.f92682a, bVar.f92682a) && C89219l.m154714a(this.f92683b, bVar.f92683b);
    }

    public final int hashCode() {
        Integer num = this.f92682a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f92683b;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "BanInfo(banType=" + this.f92682a + ", banPlatform=" + this.f92683b + ")";
    }

    public final Integer getBanPlatform() {
        return this.f92683b;
    }

    public final Integer getBanType() {
        return this.f92682a;
    }

    public C39241b(Integer num, Integer num2) {
        this.f92682a = num;
        this.f92683b = num2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C39241b(Integer num, Integer num2, int i, C89214g gVar) {
        this((i & 1) != 0 ? 0 : num, (i & 2) != 0 ? 0 : num2);
    }
}
