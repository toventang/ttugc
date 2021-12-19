package com.p2082ss.android.ugc.aweme.favorites.viewmodel;

import com.bytedance.assem.arch.extensions.AbstractC12783f;
import com.bytedance.assem.arch.extensions.C12797s;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.d */
public final class C47802d implements AbstractC12853j {

    /* renamed from: a */
    public final AbstractC12783f<List<C47797a>> f110751a;

    /* renamed from: b */
    public final long f110752b;

    /* renamed from: c */
    public final boolean f110753c;

    static {
        Covode.recordClassIndex(56428);
    }

    /* renamed from: a */
    public static C47802d m90812a(AbstractC12783f<? extends List<C47797a>> fVar, long j, boolean z) {
        C89219l.m154721d(fVar, "");
        return new C47802d(fVar, j, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47802d)) {
            return false;
        }
        C47802d dVar = (C47802d) obj;
        return C89219l.m154714a(this.f110751a, dVar.f110751a) && this.f110752b == dVar.f110752b && this.f110753c == dVar.f110753c;
    }

    public final String toString() {
        return "VideoCollectionContentState(data=" + this.f110751a + ", cursor=" + this.f110752b + ", hasMore=" + this.f110753c + ")";
    }

    public /* synthetic */ C47802d() {
        this(C12797s.f31127a, 0, true);
    }

    public final int hashCode() {
        int i;
        AbstractC12783f<List<C47797a>> fVar = this.f110751a;
        if (fVar != null) {
            i = fVar.hashCode();
        } else {
            i = 0;
        }
        long j = this.f110752b;
        int i2 = ((i * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        boolean z = this.f110753c;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.assem.arch.extensions.f<? extends java.util.List<com.ss.android.ugc.aweme.favorites.viewmodel.a>> */
    /* JADX WARN: Multi-variable type inference failed */
    public C47802d(AbstractC12783f<? extends List<C47797a>> fVar, long j, boolean z) {
        C89219l.m154721d(fVar, "");
        this.f110751a = fVar;
        this.f110752b = j;
        this.f110753c = z;
    }
}
