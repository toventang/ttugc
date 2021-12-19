package com.p2082ss.android.ugc.aweme.feed.assem.digg;

import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.digg.k */
public final class C48701k implements AbstractC12853j {

    /* renamed from: a */
    public final boolean f112558a;

    /* renamed from: b */
    public final C48702l f112559b;

    /* renamed from: c */
    public final C12776a<Boolean> f112560c;

    static {
        Covode.recordClassIndex(57481);
    }

    public C48701k() {
        this(false, (C48702l) null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48701k)) {
            return false;
        }
        C48701k kVar = (C48701k) obj;
        return this.f112558a == kVar.f112558a && C89219l.m154714a(this.f112559b, kVar.f112559b) && C89219l.m154714a(this.f112560c, kVar.f112560c);
    }

    public final int hashCode() {
        boolean z = this.f112558a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        C48702l lVar = this.f112559b;
        int i5 = 0;
        int hashCode = (i4 + (lVar != null ? lVar.hashCode() : 0)) * 31;
        C12776a<Boolean> aVar = this.f112560c;
        if (aVar != null) {
            i5 = aVar.hashCode();
        }
        return hashCode + i5;
    }

    public final String toString() {
        return "VideoDiggState(showFestival=" + this.f112558a + ", displayState=" + this.f112559b + ", showClickAnim=" + this.f112560c + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C48701k(boolean z, C48702l lVar, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : lVar, (C12776a<Boolean>) null);
    }

    private C48701k(boolean z, C48702l lVar, C12776a<Boolean> aVar) {
        this.f112558a = z;
        this.f112559b = lVar;
        this.f112560c = aVar;
    }

    /* renamed from: a */
    public static /* synthetic */ C48701k m92027a(C48701k kVar, boolean z, C48702l lVar, C12776a aVar, int i) {
        if ((i & 1) != 0) {
            z = kVar.f112558a;
        }
        if ((i & 2) != 0) {
            lVar = kVar.f112559b;
        }
        if ((i & 4) != 0) {
            aVar = kVar.f112560c;
        }
        return new C48701k(z, lVar, aVar);
    }
}
