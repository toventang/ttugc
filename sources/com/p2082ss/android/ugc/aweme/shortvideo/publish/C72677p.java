package com.p2082ss.android.ugc.aweme.shortvideo.publish;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.publish.p */
public final class C72677p {

    /* renamed from: a */
    public final String f162923a;

    /* renamed from: b */
    public final String f162924b;

    /* renamed from: c */
    public final boolean f162925c;

    /* renamed from: d */
    public final Throwable f162926d;

    /* renamed from: e */
    public final Object f162927e;

    static {
        Covode.recordClassIndex(85360);
    }

    public final String toString() {
        return "errorCode:" + this.f162923a + " stage:" + this.f162924b;
    }

    public C72677p(String str, String str2, boolean z, Throwable th, Object obj) {
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        this.f162923a = str;
        this.f162924b = str2;
        this.f162925c = z;
        this.f162926d = th;
        this.f162927e = obj;
    }
}
