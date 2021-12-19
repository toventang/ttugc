package com.p2082ss.android.ugc.aweme.discover.p2760a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.a.b */
public final class C41524b {
    @AbstractC27891c(mo46611a = "text_sug_count")

    /* renamed from: a */
    public final Integer f96859a;
    @AbstractC27891c(mo46611a = "rich_sug_count")

    /* renamed from: b */
    public final Integer f96860b;

    static {
        Covode.recordClassIndex(49431);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41524b)) {
            return false;
        }
        C41524b bVar = (C41524b) obj;
        return C89219l.m154714a(this.f96859a, bVar.f96859a) && C89219l.m154714a(this.f96860b, bVar.f96860b);
    }

    public final int hashCode() {
        Integer num = this.f96859a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f96860b;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "AccountSugExperimentConfig(textSugCount=" + this.f96859a + ", richSugCount=" + this.f96860b + ")";
    }

    private C41524b() {
        this.f96859a = null;
        this.f96860b = null;
    }

    public /* synthetic */ C41524b(byte b) {
        this();
    }
}
