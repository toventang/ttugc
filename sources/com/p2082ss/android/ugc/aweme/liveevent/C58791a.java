package com.p2082ss.android.ugc.aweme.liveevent;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.liveevent.a */
public final class C58791a {
    @AbstractC27891c(mo46611a = "anchorId")

    /* renamed from: a */
    public String f133799a;

    static {
        Covode.recordClassIndex(69101);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C58791a) && C89219l.m154714a(this.f133799a, ((C58791a) obj).f133799a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f133799a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "Anchor(anchorId=" + this.f133799a + ")";
    }
}
