package com.p2082ss.android.ugc.aweme.shortvideo.p3836i;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.p942a.AbstractC14220j;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.i.d */
public final class C71877d implements AbstractC14220j {

    /* renamed from: a */
    private final AbstractC71875b f161064a;

    static {
        Covode.recordClassIndex(84426);
    }

    @Override // com.bytedance.creativex.recorder.filter.p942a.AbstractC14220j
    /* renamed from: a */
    public final boolean mo22980a() {
        return C63244g.m114602a().mo73277e().getDisableFilter(false);
    }

    @Override // com.bytedance.creativex.recorder.filter.p942a.AbstractC14220j
    /* renamed from: a */
    public final int mo22977a(int i) {
        return this.f161064a.mo113524a(i);
    }

    public C71877d(AbstractC71875b bVar) {
        C89219l.m154721d(bVar, "");
        this.f161064a = bVar;
    }

    @Override // com.bytedance.creativex.recorder.filter.p942a.AbstractC14220j
    /* renamed from: a */
    public final void mo22979a(boolean z) {
        C63244g.m114602a().mo73277e().setDisableFilter(z);
    }

    @Override // com.bytedance.creativex.recorder.filter.p942a.AbstractC14220j
    /* renamed from: a */
    public final void mo22978a(int i, int i2) {
        this.f161064a.mo113525a(i, i2);
    }
}
