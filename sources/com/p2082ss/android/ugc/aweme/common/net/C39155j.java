package com.p2082ss.android.ugc.aweme.common.net;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import com.p2082ss.android.websocket.p4394a.p4396b.C85627c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.common.net.j */
public final class C39155j implements AbstractC81914b {

    /* renamed from: a */
    public final C85627c f92369a;

    static {
        Covode.recordClassIndex(46778);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C39155j) && C89219l.m154714a(this.f92369a, ((C39155j) obj).f92369a);
        }
        return true;
    }

    public final int hashCode() {
        C85627c cVar = this.f92369a;
        if (cVar != null) {
            return cVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ReceivedMsgEvent(event=" + this.f92369a + ")";
    }

    public C39155j(C85627c cVar) {
        C89219l.m154721d(cVar, "");
        this.f92369a = cVar;
    }
}
