package com.p2082ss.android.ugc.aweme.common.net;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import com.p2082ss.android.websocket.p4394a.p4396b.C85626b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.common.net.i */
public final class C39154i implements AbstractC81914b {

    /* renamed from: a */
    public final C85626b f92368a;

    static {
        Covode.recordClassIndex(46777);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C39154i) && C89219l.m154714a(this.f92368a, ((C39154i) obj).f92368a);
        }
        return true;
    }

    public final int hashCode() {
        C85626b bVar = this.f92368a;
        if (bVar != null) {
            return bVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "OpenWSSuccessEvent(event=" + this.f92368a + ")";
    }

    public C39154i(C85626b bVar) {
        C89219l.m154721d(bVar, "");
        this.f92368a = bVar;
    }
}
