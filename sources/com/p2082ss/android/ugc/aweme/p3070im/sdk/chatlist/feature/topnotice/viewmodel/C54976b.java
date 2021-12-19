package com.p2082ss.android.ugc.aweme.p3070im.sdk.chatlist.feature.topnotice.viewmodel;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chatlist.feature.topnotice.viewmodel.b */
public final class C54976b<T> {

    /* renamed from: a */
    public final T f125859a;

    static {
        Covode.recordClassIndex(64702);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C54976b) && C89219l.m154714a(this.f125859a, ((C54976b) obj).f125859a);
        }
        return true;
    }

    public final int hashCode() {
        T t = this.f125859a;
        if (t != null) {
            return t.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "TopNoticeEvent(content=" + ((Object) this.f125859a) + ")";
    }

    public C54976b(T t) {
        this.f125859a = t;
    }
}
