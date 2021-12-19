package com.p2082ss.android.ugc.aweme.discover.helper;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.helper.ab */
public final class C41980ab implements AbstractC42023j {

    /* renamed from: a */
    private int f97906a;

    static {
        Covode.recordClassIndex(49910);
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.helper.AbstractC42023j
    /* renamed from: a */
    public final void mo71150a() {
        this.f97906a = 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.discover.helper.AbstractC42023j
    /* renamed from: a */
    public final void mo71151a(AbstractC89172b<? super Integer, Integer> bVar) {
        C89219l.m154721d(bVar, "");
        int i = this.f97906a;
        this.f97906a = i + bVar.invoke(Integer.valueOf(i)).intValue();
    }
}
