package com.p2082ss.android.ugc.aweme.homepage.story.sidebar;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.homepage.story.sidebar.l */
public final class C53296l implements AbstractC17641a {

    /* renamed from: a */
    public final Aweme f122331a;

    static {
        Covode.recordClassIndex(62847);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: c */
    public final Object mo28111c(AbstractC17641a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C53296l) && C89219l.m154714a(this.f122331a, ((C53296l) obj).f122331a);
        }
        return true;
    }

    public final int hashCode() {
        Aweme aweme = this.f122331a;
        if (aweme != null) {
            return aweme.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "StorySidebarListItem(aweme=" + this.f122331a + ")";
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: b */
    public final boolean mo28110b(AbstractC17641a aVar) {
        return aVar.equals(this);
    }

    public C53296l(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        this.f122331a = aweme;
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: a */
    public final boolean mo28109a(AbstractC17641a aVar) {
        C89219l.m154721d(aVar, "");
        if ((aVar instanceof C53296l) && this.f122331a == ((C53296l) aVar).f122331a) {
            return true;
        }
        return false;
    }
}
