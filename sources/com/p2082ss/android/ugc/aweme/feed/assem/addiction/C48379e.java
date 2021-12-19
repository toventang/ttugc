package com.p2082ss.android.ugc.aweme.feed.assem.addiction;

import com.bytedance.assem.arch.viewModel.AbstractC12853j;
import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.assem.addiction.e */
public final class C48379e implements AbstractC12853j {

    /* renamed from: a */
    public final C48360a f112084a;

    static {
        Covode.recordClassIndex(57152);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof C48379e) && C89219l.m154714a(this.f112084a, ((C48379e) obj).f112084a);
        }
        return true;
    }

    public final int hashCode() {
        C48360a aVar = this.f112084a;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "VideoAntiAddictionState(data=" + this.f112084a + ")";
    }

    public /* synthetic */ C48379e() {
        this(null);
    }

    public C48379e(C48360a aVar) {
        this.f112084a = aVar;
    }
}
