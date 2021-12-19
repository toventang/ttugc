package com.p2082ss.android.ugc.aweme.commerce_challenge_api.p2523b;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commerce_challenge_api.b.a */
public final class C37538a {

    /* renamed from: a */
    public int f88706a;

    /* renamed from: b */
    public String f88707b;

    static {
        Covode.recordClassIndex(44932);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37538a)) {
            return false;
        }
        C37538a aVar = (C37538a) obj;
        return this.f88706a == aVar.f88706a && C89219l.m154714a(this.f88707b, aVar.f88707b);
    }

    public final int hashCode() {
        int i = this.f88706a * 31;
        String str = this.f88707b;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "CommerceHeaderParam(buttonType=" + this.f88706a + ", enterFrom=" + this.f88707b + ")";
    }

    private /* synthetic */ C37538a() {
        this(0, null);
    }

    public C37538a(int i, String str) {
        this.f88706a = i;
        this.f88707b = str;
    }
}
