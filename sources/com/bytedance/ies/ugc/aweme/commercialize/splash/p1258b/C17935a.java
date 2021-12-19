package com.bytedance.ies.ugc.aweme.commercialize.splash.p1258b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import com.p2082ss.android.ugc.p4258d.p4259a.AbstractC81914b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.ugc.aweme.commercialize.splash.b.a */
public final class C17935a implements AbstractC81914b {

    /* renamed from: a */
    public final Aweme f42754a;

    static {
        Covode.recordClassIndex(20551);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C17935a) && C89219l.m154714a(this.f42754a, ((C17935a) obj).f42754a);
        }
        return true;
    }

    public final int hashCode() {
        Aweme aweme = this.f42754a;
        if (aweme != null) {
            return aweme.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "DeleteTopviewAwemeEvent(aweme=" + this.f42754a + ")";
    }

    public C17935a(Aweme aweme) {
        C89219l.m154721d(aweme, "");
        this.f42754a = aweme;
    }
}
