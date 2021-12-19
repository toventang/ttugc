package com.p2082ss.android.ugc.aweme.inbox;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.inbox.x */
public final class C56590x extends AbstractC56310ad {

    /* renamed from: a */
    public final EnumC56591a f129023a;

    /* renamed from: com.ss.android.ugc.aweme.inbox.x$a */
    public enum EnumC56591a {
        HIDE,
        SHOW,
        ERROR;

        static {
            Covode.recordClassIndex(66414);
        }
    }

    static {
        Covode.recordClassIndex(66413);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C56590x) && C89219l.m154714a(this.f129023a, ((C56590x) obj).f129023a);
        }
        return true;
    }

    public final int hashCode() {
        EnumC56591a aVar = this.f129023a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "LoadMorePod(state=" + this.f129023a + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C56590x(EnumC56591a aVar) {
        super(-1);
        C89219l.m154721d(aVar, "");
        this.f129023a = aVar;
    }
}
