package com.p2082ss.android.ugc.aweme.shortvideo.p3836i;

import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.p943b.AbstractC14236d;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.i.e */
public final class C71878e implements AbstractC14236d {

    /* renamed from: a */
    private final AbstractC71874a f161065a;

    static {
        Covode.recordClassIndex(84427);
    }

    @Override // com.bytedance.creativex.recorder.filter.p943b.AbstractC14236d
    /* renamed from: b */
    public final String mo22994b() {
        return this.f161065a.mo113521a();
    }

    @Override // com.bytedance.creativex.recorder.filter.p943b.AbstractC14236d
    /* renamed from: c */
    public final boolean mo22995c() {
        return this.f161065a.mo113523b();
    }

    @Override // com.bytedance.creativex.recorder.filter.p942a.AbstractC14220j
    /* renamed from: a */
    public final boolean mo22980a() {
        return C63244g.m114602a().mo73277e().getDisableFilter(false);
    }

    @Override // com.bytedance.creativex.recorder.filter.p942a.AbstractC14220j
    /* renamed from: a */
    public final int mo22977a(int i) {
        return this.f161065a.mo113524a(i);
    }

    public C71878e(AbstractC71874a aVar) {
        C89219l.m154721d(aVar, "");
        this.f161065a = aVar;
    }

    @Override // com.bytedance.creativex.recorder.filter.p943b.AbstractC14236d
    /* renamed from: a */
    public final void mo22993a(String str) {
        C89219l.m154721d(str, "");
        this.f161065a.mo113522a(str);
    }

    @Override // com.bytedance.creativex.recorder.filter.p942a.AbstractC14220j
    /* renamed from: a */
    public final void mo22979a(boolean z) {
        C63244g.m114602a().mo73277e().setDisableFilter(z);
    }

    @Override // com.bytedance.creativex.recorder.filter.p942a.AbstractC14220j
    /* renamed from: a */
    public final void mo22978a(int i, int i2) {
        this.f161065a.mo113525a(i, i2);
    }
}
