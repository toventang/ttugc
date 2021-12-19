package com.p2082ss.android.ugc.aweme.shoutouts.review.cell;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shoutouts.review.p3904b.C74542b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.review.cell.a */
public final class C74558a {

    /* renamed from: a */
    public final C74542b f167662a;

    static {
        Covode.recordClassIndex(87365);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C74558a) && C89219l.m154714a(this.f167662a, ((C74558a) obj).f167662a);
        }
        return true;
    }

    public final int hashCode() {
        C74542b bVar = this.f167662a;
        if (bVar != null) {
            return bVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ShoutoutsRemoveCell(item=" + this.f167662a + ")";
    }

    public C74558a(C74542b bVar) {
        C89219l.m154721d(bVar, "");
        this.f167662a = bVar;
    }
}
