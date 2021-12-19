package com.p2082ss.android.ugc.aweme.common.net;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import com.p2082ss.android.websocket.p4394a.p4396b.C85629e;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.common.net.m */
public final class C39158m implements AbstractC81914b {

    /* renamed from: a */
    public final C85629e f92372a;

    static {
        Covode.recordClassIndex(46781);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C39158m) && C89219l.m154714a(this.f92372a, ((C39158m) obj).f92372a);
        }
        return true;
    }

    public final int hashCode() {
        C85629e eVar = this.f92372a;
        if (eVar != null) {
            return eVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "WSStatusChangeEvent(event=" + this.f92372a + ")";
    }

    public C39158m(C85629e eVar) {
        C89219l.m154721d(eVar, "");
        this.f92372a = eVar;
    }
}
