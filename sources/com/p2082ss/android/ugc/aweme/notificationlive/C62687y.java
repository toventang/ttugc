package com.p2082ss.android.ugc.aweme.notificationlive;

import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.notificationlive.y */
public final class C62687y implements AbstractC12853j {

    /* renamed from: a */
    public final int f142118a;

    /* renamed from: b */
    public final int f142119b;

    /* renamed from: c */
    public final C62562r f142120c;

    /* renamed from: d */
    public final C62562r f142121d;

    static {
        Covode.recordClassIndex(73490);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C62687y)) {
            return false;
        }
        C62687y yVar = (C62687y) obj;
        return this.f142118a == yVar.f142118a && this.f142119b == yVar.f142119b && C89219l.m154714a(this.f142120c, yVar.f142120c) && C89219l.m154714a(this.f142121d, yVar.f142121d);
    }

    public final int hashCode() {
        int i = ((this.f142118a * 31) + this.f142119b) * 31;
        C62562r rVar = this.f142120c;
        int i2 = 0;
        int hashCode = (i + (rVar != null ? rVar.hashCode() : 0)) * 31;
        C62562r rVar2 = this.f142121d;
        if (rVar2 != null) {
            i2 = rVar2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "ResponseVMState(pushState=" + this.f142118a + ", statusCode=" + this.f142119b + ", cacheEvent=" + this.f142120c + ", networkEvent=" + this.f142121d + ")";
    }

    public /* synthetic */ C62687y() {
        this(-1, -1, null, null);
    }

    public C62687y(int i, int i2, C62562r rVar, C62562r rVar2) {
        this.f142118a = i;
        this.f142119b = i2;
        this.f142120c = rVar;
        this.f142121d = rVar2;
    }
}
