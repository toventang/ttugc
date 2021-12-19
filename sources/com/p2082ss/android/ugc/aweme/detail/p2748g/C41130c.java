package com.p2082ss.android.ugc.aweme.detail.p2748g;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.detail.g.c */
public final class C41130c implements AbstractC81914b {

    /* renamed from: a */
    public final String f96131a;

    static {
        Covode.recordClassIndex(49013);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C41130c) && C89219l.m154714a(this.f96131a, ((C41130c) obj).f96131a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f96131a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "DetailVideoFirstFrameEvent(aid=" + this.f96131a + ")";
    }

    public C41130c(String str) {
        this.f96131a = str;
    }
}
