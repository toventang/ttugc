package com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.data.p3088d;

import com.bytedance.covode.number.Covode;
import com.bytedance.p1399im.core.p1408d.C19537ah;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.data.d.aa */
public final class C53733aa extends AbstractC53732a {

    /* renamed from: a */
    public final List<C19537ah> f123263a;

    static {
        Covode.recordClassIndex(63313);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C53733aa) && C89219l.m154714a(this.f123263a, ((C53733aa) obj).f123263a);
        }
        return true;
    }

    public final int hashCode() {
        List<C19537ah> list = this.f123263a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "OnUpdateMembersEvent(list=" + this.f123263a + ")";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.bytedance.im.core.d.ah> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53733aa(List<? extends C19537ah> list) {
        super((byte) 0);
        C89219l.m154721d(list, "");
        this.f123263a = list;
    }
}
