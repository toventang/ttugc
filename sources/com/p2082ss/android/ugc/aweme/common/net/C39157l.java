package com.p2082ss.android.ugc.aweme.common.net;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import com.p2082ss.android.websocket.p4394a.p4396b.C85628d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.common.net.l */
public final class C39157l implements AbstractC81914b {

    /* renamed from: a */
    public final C85628d f92371a;

    static {
        Covode.recordClassIndex(46780);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C39157l) && C89219l.m154714a(this.f92371a, ((C39157l) obj).f92371a);
        }
        return true;
    }

    public final int hashCode() {
        C85628d dVar = this.f92371a;
        if (dVar != null) {
            return dVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "WSFailEvent(event=" + this.f92371a + ")";
    }

    public C39157l(C85628d dVar) {
        C89219l.m154721d(dVar, "");
        this.f92371a = dVar;
    }
}
