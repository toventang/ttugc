package com.p2082ss.android.ugc.aweme.commercialize.profile.talent.p2615a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.profile.talent.a.b */
public final class C38482b {
    @AbstractC27891c(mo46611a = "previous_item_id")

    /* renamed from: a */
    public final String f90901a;
    @AbstractC27891c(mo46611a = "aweme_info")

    /* renamed from: b */
    public final Aweme f90902b;

    static {
        Covode.recordClassIndex(45993);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38482b)) {
            return false;
        }
        C38482b bVar = (C38482b) obj;
        return C89219l.m154714a(this.f90901a, bVar.f90901a) && C89219l.m154714a(this.f90902b, bVar.f90902b);
    }

    public final int hashCode() {
        String str = this.f90901a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Aweme aweme = this.f90902b;
        if (aweme != null) {
            i = aweme.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ProfileAdData(previousItemId=" + this.f90901a + ", aweme=" + this.f90902b + ")";
    }
}
