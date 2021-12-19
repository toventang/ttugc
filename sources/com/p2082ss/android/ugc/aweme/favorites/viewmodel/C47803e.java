package com.p2082ss.android.ugc.aweme.favorites.viewmodel;

import com.bytedance.assem.arch.extensions.AbstractC12783f;
import com.bytedance.assem.arch.extensions.C12797s;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import java.util.List;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.favorites.viewmodel.e */
public final class C47803e implements AbstractC12853j {

    /* renamed from: a */
    public final AbstractC12783f<List<C47799b>> f110754a;

    /* renamed from: b */
    public final long f110755b;

    /* renamed from: c */
    public final boolean f110756c;

    static {
        Covode.recordClassIndex(56429);
    }

    /* renamed from: a */
    public static C47803e m90814a(AbstractC12783f<? extends List<C47799b>> fVar, long j, boolean z) {
        C89219l.m154721d(fVar, "");
        return new C47803e(fVar, j, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47803e)) {
            return false;
        }
        C47803e eVar = (C47803e) obj;
        return C89219l.m154714a(this.f110754a, eVar.f110754a) && this.f110755b == eVar.f110755b && this.f110756c == eVar.f110756c;
    }

    public final String toString() {
        return "VideoCollectionListState(data=" + this.f110754a + ", cursor=" + this.f110755b + ", hasMore=" + this.f110756c + ")";
    }

    public /* synthetic */ C47803e() {
        this(C12797s.f31127a, 0, true);
    }

    public final int hashCode() {
        int i;
        AbstractC12783f<List<C47799b>> fVar = this.f110754a;
        if (fVar != null) {
            i = fVar.hashCode();
        } else {
            i = 0;
        }
        long j = this.f110755b;
        int i2 = ((i * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        boolean z = this.f110756c;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        return i2 + i3;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.assem.arch.extensions.f<? extends java.util.List<com.ss.android.ugc.aweme.favorites.viewmodel.b>> */
    /* JADX WARN: Multi-variable type inference failed */
    private C47803e(AbstractC12783f<? extends List<C47799b>> fVar, long j, boolean z) {
        C89219l.m154721d(fVar, "");
        this.f110754a = fVar;
        this.f110755b = j;
        this.f110756c = z;
    }
}
