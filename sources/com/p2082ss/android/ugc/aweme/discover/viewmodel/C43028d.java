package com.p2082ss.android.ugc.aweme.discover.viewmodel;

import com.bytedance.assem.arch.extensions.AbstractC12783f;
import com.bytedance.assem.arch.extensions.C12797s;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.discover.model.SearchLiveList;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.viewmodel.d */
public final class C43028d implements AbstractC12853j {

    /* renamed from: a */
    public final AbstractC12783f<SearchLiveList> f100291a;

    static {
        Covode.recordClassIndex(51170);
    }

    /* renamed from: a */
    public static C43028d m85854a(AbstractC12783f<? extends SearchLiveList> fVar) {
        C89219l.m154721d(fVar, "");
        return new C43028d(fVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C43028d) && C89219l.m154714a(this.f100291a, ((C43028d) obj).f100291a);
        }
        return true;
    }

    public final int hashCode() {
        AbstractC12783f<SearchLiveList> fVar = this.f100291a;
        if (fVar != null) {
            return fVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "SearchLiveState(request=" + this.f100291a + ")";
    }

    public /* synthetic */ C43028d() {
        this(C12797s.f31127a);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.bytedance.assem.arch.extensions.f<? extends com.ss.android.ugc.aweme.discover.model.SearchLiveList> */
    /* JADX WARN: Multi-variable type inference failed */
    private C43028d(AbstractC12783f<? extends SearchLiveList> fVar) {
        C89219l.m154721d(fVar, "");
        this.f100291a = fVar;
    }
}
