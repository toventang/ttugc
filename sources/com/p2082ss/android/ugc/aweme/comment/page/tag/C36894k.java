package com.p2082ss.android.ugc.aweme.comment.page.tag;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.comment.page.tag.k */
public final class C36894k implements AbstractC17641a {

    /* renamed from: a */
    public final String f86893a;

    static {
        Covode.recordClassIndex(44232);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: c */
    public final Object mo28111c(AbstractC17641a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C36894k) && C89219l.m154714a(this.f86893a, ((C36894k) obj).f86893a);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f86893a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "TextItem(str=" + this.f86893a + ")";
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: a */
    public final boolean mo28109a(AbstractC17641a aVar) {
        return aVar.equals(this);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: b */
    public final boolean mo28110b(AbstractC17641a aVar) {
        return aVar.equals(this);
    }

    public C36894k(String str) {
        C89219l.m154721d(str, "");
        this.f86893a = str;
    }
}
