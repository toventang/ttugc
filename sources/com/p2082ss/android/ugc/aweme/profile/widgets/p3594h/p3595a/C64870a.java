package com.p2082ss.android.ugc.aweme.profile.widgets.p3594h.p3595a;

import com.bytedance.assem.arch.extensions.AbstractC12779c;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.h.a.a */
public final class C64870a implements AbstractC12779c {

    /* renamed from: a */
    public final String f146658a;

    /* renamed from: b */
    public final String f146659b;

    /* renamed from: c */
    public final boolean f146660c;

    /* renamed from: d */
    public final String f146661d;

    /* renamed from: e */
    public final String f146662e;

    static {
        Covode.recordClassIndex(76337);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C64870a)) {
            return false;
        }
        C64870a aVar = (C64870a) obj;
        return C89219l.m154714a(this.f146658a, aVar.f146658a) && C89219l.m154714a(this.f146659b, aVar.f146659b) && this.f146660c == aVar.f146660c && C89219l.m154714a(this.f146661d, aVar.f146661d) && C89219l.m154714a(this.f146662e, aVar.f146662e);
    }

    public final int hashCode() {
        String str = this.f146658a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f146659b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        boolean z = this.f146660c;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = (hashCode2 + i2) * 31;
        String str3 = this.f146661d;
        int hashCode3 = (i5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f146662e;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "MineProfileInitData(from=" + this.f146658a + ", enterFrom=" + this.f146659b + ", isMine=" + this.f146660c + ", uid=" + this.f146661d + ", secUid=" + this.f146662e + ")";
    }

    private /* synthetic */ C64870a() {
        this(null, null, false, null, null);
    }

    public C64870a(String str, String str2, boolean z, String str3, String str4) {
        this.f146658a = str;
        this.f146659b = str2;
        this.f146660c = z;
        this.f146661d = str3;
        this.f146662e = str4;
    }
}
