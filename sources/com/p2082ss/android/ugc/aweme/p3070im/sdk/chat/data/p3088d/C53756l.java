package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19538ai;
import com.bytedance.p1399im.core.p1408d.C19593ar;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.d.l */
public final class C53756l extends AbstractC53746c {

    /* renamed from: a */
    public final List<C19538ai> f123292a;

    /* renamed from: b */
    public final int f123293b;

    /* renamed from: c */
    public final C19593ar f123294c;

    static {
        Covode.recordClassIndex(63336);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C53756l)) {
            return false;
        }
        C53756l lVar = (C53756l) obj;
        return C89219l.m154714a(this.f123292a, lVar.f123292a) && this.f123293b == lVar.f123293b && C89219l.m154714a(this.f123294c, lVar.f123294c);
    }

    public final int hashCode() {
        List<C19538ai> list = this.f123292a;
        int i = 0;
        int hashCode = (((list != null ? list.hashCode() : 0) * 31) + this.f123293b) * 31;
        C19593ar arVar = this.f123294c;
        if (arVar != null) {
            i = arVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "OnGetMessageEvent(list=" + this.f123292a + ", msgSource=" + this.f123293b + ", extra=" + this.f123294c + ")";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53756l(List<C19538ai> list, int i, C19593ar arVar) {
        super((byte) 0);
        C89219l.m154721d(list, "");
        C89219l.m154721d(arVar, "");
        this.f123292a = list;
        this.f123293b = i;
        this.f123294c = arVar;
    }
}
