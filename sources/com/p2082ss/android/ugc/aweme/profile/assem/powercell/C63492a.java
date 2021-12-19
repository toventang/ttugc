package com.p2082ss.android.ugc.aweme.profile.assem.powercell;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.assem.powercell.a */
public final class C63492a implements AbstractC17641a {

    /* renamed from: a */
    public final Aweme f144110a;

    static {
        Covode.recordClassIndex(74800);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: c */
    public final Object mo28111c(AbstractC17641a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C63492a) && C89219l.m154714a(this.f144110a, ((C63492a) obj).f144110a);
        }
        return true;
    }

    public final int hashCode() {
        Aweme aweme = this.f144110a;
        if (aweme != null) {
            return aweme.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "MyVideoItem(data=" + this.f144110a + ")";
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

    public C63492a(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        this.f144110a = aweme;
    }
}
