package com.bytedance.android.livesdk.rank.impl.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.livesdk.rank.impl.api.model.f */
public final class C10369f {
    @AbstractC27891c(mo46611a = "config")

    /* renamed from: a */
    public ArrayList<C10368e> f25056a = null;

    static {
        Covode.recordClassIndex(11943);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C10369f) && C89219l.m154714a(this.f25056a, ((C10369f) obj).f25056a);
        }
        return true;
    }

    public final int hashCode() {
        ArrayList<C10368e> arrayList = this.f25056a;
        if (arrayList != null) {
            return arrayList.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ScoreDisplayConfigResponse(configList=" + this.f25056a + ")";
    }

    private C10369f() {
    }
}
