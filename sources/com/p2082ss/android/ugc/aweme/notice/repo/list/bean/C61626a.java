package com.p2082ss.android.ugc.aweme.notice.repo.list.bean;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.a */
public final class C61626a {
    @AbstractC27891c(mo46611a = "click")

    /* renamed from: a */
    public final boolean f139872a = false;

    static {
        Covode.recordClassIndex(72353);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C61626a) && this.f139872a == ((C61626a) obj).f139872a;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f139872a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "ActionToReportStruct(click=" + this.f139872a + ")";
    }

    private C61626a() {
    }
}
