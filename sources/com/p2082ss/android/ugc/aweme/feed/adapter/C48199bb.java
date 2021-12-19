package com.p2082ss.android.ugc.aweme.feed.adapter;

import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import p4600h.C89391z;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.bb */
public final class C48199bb implements AbstractC12853j {

    /* renamed from: a */
    public final C12776a<C89391z> f111662a;

    static {
        Covode.recordClassIndex(56941);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C48199bb) && C89219l.m154714a(this.f111662a, ((C48199bb) obj).f111662a);
        }
        return true;
    }

    public final int hashCode() {
        C12776a<C89391z> aVar = this.f111662a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "VideoPlaySearchState(onPausePlay=" + this.f111662a + ")";
    }

    public /* synthetic */ C48199bb() {
        this(null);
    }

    public C48199bb(C12776a<C89391z> aVar) {
        this.f111662a = aVar;
    }
}
