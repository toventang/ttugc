package com.p2082ss.android.ugc.aweme.util;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.util.a */
public final class C80121a {

    /* renamed from: a */
    private volatile boolean f179526a;

    /* renamed from: b */
    private volatile Long f179527b;

    /* renamed from: c */
    private final long f179528c;

    static {
        Covode.recordClassIndex(93365);
    }

    /* renamed from: b */
    private final void m138885b() {
        this.f179526a = true;
        this.f179527b = Long.valueOf(System.currentTimeMillis());
    }

    /* renamed from: a */
    public final boolean mo123577a() {
        if (this.f179527b == null) {
            m138885b();
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Long l = this.f179527b;
        if (l == null) {
            C89219l.m154715b();
        }
        if (currentTimeMillis - l.longValue() >= this.f179528c) {
            m138885b();
            return false;
        } else if (this.f179526a) {
            return true;
        } else {
            m138885b();
            return false;
        }
    }

    public C80121a(long j) {
        this.f179528c = j;
    }
}
