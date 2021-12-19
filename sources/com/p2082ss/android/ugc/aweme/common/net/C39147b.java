package com.p2082ss.android.ugc.aweme.common.net;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import com.p2082ss.android.websocket.p4394a.p4396b.C85625a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.common.net.b */
public final class C39147b implements AbstractC81914b {

    /* renamed from: a */
    public final C85625a f92363a;

    static {
        Covode.recordClassIndex(46770);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C39147b) && C89219l.m154714a(this.f92363a, ((C39147b) obj).f92363a);
        }
        return true;
    }

    public final int hashCode() {
        C85625a aVar = this.f92363a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "CloseWSSuccessEvent(event=" + this.f92363a + ")";
    }

    public C39147b(C85625a aVar) {
        C89219l.m154721d(aVar, "");
        this.f92363a = aVar;
    }
}
