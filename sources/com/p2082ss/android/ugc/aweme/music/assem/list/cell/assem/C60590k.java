package com.p2082ss.android.ugc.aweme.music.assem.list.cell.assem;

import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.assem.list.cell.assem.k */
public final class C60590k implements AbstractC12853j {

    /* renamed from: a */
    public final boolean f137806a;

    /* renamed from: b */
    public final C12776a<String> f137807b;

    static {
        Covode.recordClassIndex(71144);
    }

    /* renamed from: a */
    public static /* synthetic */ C60590k m110154a(C60590k kVar, boolean z, C12776a aVar, int i) {
        if ((i & 1) != 0) {
            z = kVar.f137806a;
        }
        if ((i & 2) != 0) {
            aVar = kVar.f137807b;
        }
        return m110155a(z, aVar);
    }

    /* renamed from: a */
    private static C60590k m110155a(boolean z, C12776a<String> aVar) {
        return new C60590k(z, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60590k)) {
            return false;
        }
        C60590k kVar = (C60590k) obj;
        return this.f137806a == kVar.f137806a && C89219l.m154714a(this.f137807b, kVar.f137807b);
    }

    public final int hashCode() {
        boolean z = this.f137806a;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        C12776a<String> aVar = this.f137807b;
        return i4 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "MusicCellState(isCollect=" + this.f137806a + ", toastEvent=" + this.f137807b + ")";
    }

    public /* synthetic */ C60590k() {
        this(false, null);
    }

    private C60590k(boolean z, C12776a<String> aVar) {
        this.f137806a = z;
        this.f137807b = aVar;
    }
}
