package com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.seekbar.c */
public final class C50453c implements AbstractC81914b {

    /* renamed from: a */
    public final Aweme f116524a;

    /* renamed from: b */
    public final int f116525b;

    /* renamed from: c */
    public final String f116526c;

    static {
        Covode.recordClassIndex(59589);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50453c)) {
            return false;
        }
        C50453c cVar = (C50453c) obj;
        return C89219l.m154714a(this.f116524a, cVar.f116524a) && this.f116525b == cVar.f116525b && C89219l.m154714a(this.f116526c, cVar.f116526c);
    }

    public final int hashCode() {
        Aweme aweme = this.f116524a;
        int i = 0;
        int hashCode = (((aweme != null ? aweme.hashCode() : 0) * 31) + this.f116525b) * 31;
        String str = this.f116526c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "FullFeedFragmentPanelPageStateChangeEvent(mAweme=" + this.f116524a + ", state=" + this.f116525b + ", eventType=" + this.f116526c + ")";
    }

    public C50453c(Aweme aweme, int i, String str) {
        C89219l.m154721d(str, "");
        this.f116524a = aweme;
        this.f116525b = i;
        this.f116526c = str;
    }
}
