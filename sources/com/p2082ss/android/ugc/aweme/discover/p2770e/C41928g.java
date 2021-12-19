package com.p2082ss.android.ugc.aweme.discover.p2770e;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.e.g */
public final class C41928g implements AbstractC81914b {

    /* renamed from: a */
    public final String f97807a;

    static {
        Covode.recordClassIndex(49854);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C41928g) && C89219l.m154714a(this.f97807a, ((C41928g) obj).f97807a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f97807a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "HideLoadingBallEvent(page=" + this.f97807a + ")";
    }

    public C41928g(String str) {
        C89219l.m154721d(str, "");
        this.f97807a = str;
    }
}
