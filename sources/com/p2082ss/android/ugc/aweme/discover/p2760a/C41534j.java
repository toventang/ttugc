package com.p2082ss.android.ugc.aweme.discover.p2760a;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.a.j */
public final class C41534j {
    @AbstractC27891c(mo46611a = "enabled")

    /* renamed from: a */
    public final Integer f96875a;
    @AbstractC27891c(mo46611a = "show_tips")

    /* renamed from: b */
    public final Integer f96876b;
    @AbstractC27891c(mo46611a = "show_tips_delay")

    /* renamed from: c */
    public final Long f96877c;

    static {
        Covode.recordClassIndex(49441);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41534j)) {
            return false;
        }
        C41534j jVar = (C41534j) obj;
        return C89219l.m154714a(this.f96875a, jVar.f96875a) && C89219l.m154714a(this.f96876b, jVar.f96876b) && C89219l.m154714a(this.f96877c, jVar.f96877c);
    }

    public final int hashCode() {
        Integer num = this.f96875a;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Integer num2 = this.f96876b;
        int hashCode2 = (hashCode + (num2 != null ? num2.hashCode() : 0)) * 31;
        Long l = this.f96877c;
        if (l != null) {
            i = l.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "FeedSearchEntrance(enabled=" + this.f96875a + ", showTips=" + this.f96876b + ", showTipsDelay=" + this.f96877c + ")";
    }

    private C41534j() {
        this.f96875a = null;
        this.f96876b = null;
        this.f96877c = null;
    }

    public /* synthetic */ C41534j(byte b) {
        this();
    }
}
