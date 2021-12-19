package com.p2082ss.android.ugc.aweme.music.assem;

import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.music.assem.a */
public final class C60343a implements AbstractC12853j {

    /* renamed from: a */
    public final C12776a<Object> f137530a;

    /* renamed from: b */
    public final C12776a<Object> f137531b;

    static {
        Covode.recordClassIndex(70892);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C60343a)) {
            return false;
        }
        C60343a aVar = (C60343a) obj;
        return C89219l.m154714a(this.f137530a, aVar.f137530a) && C89219l.m154714a(this.f137531b, aVar.f137531b);
    }

    public final int hashCode() {
        C12776a<Object> aVar = this.f137530a;
        int i = 0;
        int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
        C12776a<Object> aVar2 = this.f137531b;
        if (aVar2 != null) {
            i = aVar2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "LegacyCommunicateState(lazyLoadEvent=" + this.f137530a + ", loadEmptyEvent=" + this.f137531b + ")";
    }

    public /* synthetic */ C60343a() {
        this(null, null);
    }

    private C60343a(C12776a<? extends Object> aVar, C12776a<? extends Object> aVar2) {
        this.f137530a = aVar;
        this.f137531b = aVar2;
    }

    /* renamed from: a */
    public static /* synthetic */ C60343a m110054a(C60343a aVar, C12776a aVar2, C12776a aVar3, int i) {
        if ((i & 1) != 0) {
            aVar2 = aVar.f137530a;
        }
        if ((i & 2) != 0) {
            aVar3 = aVar.f137531b;
        }
        return new C60343a(aVar2, aVar3);
    }
}
