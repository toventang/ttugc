package com.p2082ss.android.ugc.aweme.common.net;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import com.p2082ss.android.websocket.p4394a.p4395a.C85621b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.common.net.h */
public final class C39153h implements AbstractC81914b {

    /* renamed from: a */
    public final C85621b f92367a;

    static {
        Covode.recordClassIndex(46776);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C39153h) && C89219l.m154714a(this.f92367a, ((C39153h) obj).f92367a);
        }
        return true;
    }

    public final int hashCode() {
        C85621b bVar = this.f92367a;
        if (bVar != null) {
            return bVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "OpenWSEvent(event=" + this.f92367a + ")";
    }

    public C39153h(C85621b bVar) {
        C89219l.m154721d(bVar, "");
        this.f92367a = bVar;
    }
}
