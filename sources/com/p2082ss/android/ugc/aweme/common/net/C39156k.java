package com.p2082ss.android.ugc.aweme.common.net;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import com.p2082ss.android.websocket.p4394a.p4395a.C85623d;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.common.net.k */
public final class C39156k implements AbstractC81914b {

    /* renamed from: a */
    public final C85623d f92370a;

    static {
        Covode.recordClassIndex(46779);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C39156k) && C89219l.m154714a(this.f92370a, ((C39156k) obj).f92370a);
        }
        return true;
    }

    public final int hashCode() {
        C85623d dVar = this.f92370a;
        if (dVar != null) {
            return dVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "SendWSMsgEvent(event=" + this.f92370a + ")";
    }

    public C39156k(C85623d dVar) {
        C89219l.m154721d(dVar, "");
        this.f92370a = dVar;
    }
}
