package com.p2082ss.android.ugc.aweme.qna.p3651vm;

import com.bytedance.assem.arch.extensions.C12776a;
import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.qna.fragment.AbstractC66098a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.qna.vm.h */
public final class C66362h implements AbstractC12853j {

    /* renamed from: a */
    public final C12776a<AbstractC66098a> f149240a;

    static {
        Covode.recordClassIndex(77880);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C66362h) && C89219l.m154714a(this.f149240a, ((C66362h) obj).f149240a);
        }
        return true;
    }

    public final int hashCode() {
        C12776a<AbstractC66098a> aVar = this.f149240a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "QnaSelectedPageState(event=" + this.f149240a + ")";
    }

    public /* synthetic */ C66362h() {
        this(null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.bytedance.assem.arch.extensions.a<? extends com.ss.android.ugc.aweme.qna.fragment.a> */
    /* JADX WARN: Multi-variable type inference failed */
    public C66362h(C12776a<? extends AbstractC66098a> aVar) {
        this.f149240a = aVar;
    }
}
