package com.p2082ss.android.ugc.aweme.emoji.p2906i.p2907a.p2910c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.p3070im.service.p3257g.AbstractC56225a;
import p4600h.C89387v;
import p4600h.p4601a.C89041ag;

/* renamed from: com.ss.android.ugc.aweme.emoji.i.a.c.a */
public final class C46550a extends AbstractC56225a {

    /* renamed from: a */
    public final boolean f108535a;

    static {
        Covode.recordClassIndex(55137);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C46550a) && this.f108535a == ((C46550a) obj).f108535a;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.f108535a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final String toString() {
        return "GeckoSmallEmojiLoadEventBody(isSuccess=" + this.f108535a + ")";
    }

    public C46550a(boolean z) {
        super(C89041ag.m154412a(C89387v.m154943a("is_success", Boolean.valueOf(z))), null, null, 6);
        this.f108535a = z;
    }
}
