package com.p2082ss.android.ugc.aweme.editSticker.text.effect;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2739b.AbstractC41088b;
import com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2739b.AbstractC41089c;
import com.p2082ss.android.ugc.aweme.editSticker.p2878b.C45850a;
import p4600h.C89391z;
import p4600h.p4603c.AbstractC89124d;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.editSticker.text.effect.h */
public final class C46146h<T extends C45850a> extends AbstractC41089c<T, Void> {

    /* renamed from: a */
    private final AbstractC89183m<T, AbstractC89124d<? super C89391z>, Object> f107426a;

    static {
        Covode.recordClassIndex(54705);
    }

    private /* synthetic */ C46146h() {
        this(null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: h.f.a.m<? super T extends com.ss.android.ugc.aweme.editSticker.b.a, ? super h.c.d<? super h.z>, ? extends java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    public C46146h(AbstractC89183m<? super T, ? super AbstractC89124d<? super C89391z>, ? extends Object> mVar) {
        this.f107426a = mVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.dependence.p2736a.p2737a.p2739b.AbstractC41089c
    /* renamed from: a */
    public final /* synthetic */ AbstractC41088b mo70308a(Object obj, String str) {
        C45850a aVar = (C45850a) obj;
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(str, "");
        return new C46144g(str, aVar, this.f107426a);
    }
}
