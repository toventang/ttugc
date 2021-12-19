package com.p2082ss.android.ugc.aweme.story.avatar;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.story.avatar.r */
public final class C76589r implements AbstractC17641a {

    /* renamed from: a */
    public final Aweme f171909a;

    static {
        Covode.recordClassIndex(89574);
    }

    @Override // com.bytedance.ies.powerlist.p1231b.AbstractC17641a
    /* renamed from: c */
    public final Object mo28111c(AbstractC17641a aVar) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C76589r) && C89219l.m154714a(this.f171909a, ((C76589r) obj).f171909a);
        }
        return true;
    }

    public final int hashCode() {
        Aweme aweme = this.f171909a;
        if (aweme != null) {
            return aweme.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "UserStoryItem(aweme=" + this.f171909a + ")";
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

    public C76589r(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        this.f171909a = aweme;
    }
}
