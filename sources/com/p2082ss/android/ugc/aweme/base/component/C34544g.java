package com.p2082ss.android.ugc.aweme.base.component;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.base.component.g */
public final class C34544g implements AbstractC81914b {

    /* renamed from: a */
    public final String f81560a;

    static {
        Covode.recordClassIndex(41506);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C34544g) && C89219l.m154714a(this.f81560a, ((C34544g) obj).f81560a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f81560a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "RetryEvent(publishId=" + this.f81560a + ")";
    }

    public C34544g(String str) {
        C89219l.m154721d(str, "");
        this.f81560a = str;
    }
}
