package com.p2082ss.android.ugc.aweme.common.net;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import com.p2082ss.android.websocket.p4394a.p4395a.C85620a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.common.net.a */
public final class C39146a implements AbstractC81914b {

    /* renamed from: a */
    public final C85620a f92362a;

    static {
        Covode.recordClassIndex(46769);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C39146a) && C89219l.m154714a(this.f92362a, ((C39146a) obj).f92362a);
        }
        return true;
    }

    public final int hashCode() {
        C85620a aVar = this.f92362a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "CloseWSEvent(event=" + this.f92362a + ")";
    }

    public C39146a(C85620a aVar) {
        C89219l.m154721d(aVar, "");
        this.f92362a = aVar;
    }
}
