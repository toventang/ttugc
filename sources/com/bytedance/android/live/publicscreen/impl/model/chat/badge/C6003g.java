package com.bytedance.android.live.publicscreen.impl.model.chat.badge;

import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.android.live.design.C4079b;
import com.bytedance.android.live.publicscreen.p386a.C5889g;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.android.live.publicscreen.impl.model.chat.badge.g */
public final class C6003g extends AbstractC5996b {
    static {
        Covode.recordClassIndex(6614);
    }

    @Override // com.bytedance.android.live.publicscreen.impl.model.chat.badge.AbstractC5996b
    /* renamed from: a */
    public final int mo11890a() {
        return 10;
    }

    @Override // com.bytedance.android.live.publicscreen.impl.model.chat.badge.AbstractC5996b
    /* renamed from: c */
    public final /* synthetic */ AbstractC5995a mo11892c() {
        C6007k kVar = new C6007k(this.f15057b.f14747d);
        String a = C3966y.m9657a((int) R.string.edj);
        C89219l.m154716b(a, "");
        kVar.mo11897a(a);
        kVar.f15075i = -1;
        kVar.f15071e = C4079b.m9888a(kVar.f15055d, (int) R.attr.aln);
        kVar.f15072f = C3966y.m9653a(2.0f);
        kVar.f15073g = C3966y.m9653a(6.0f);
        kVar.f15077k = 8;
        kVar.f15078l = 600;
        return kVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C6003g(C5889g gVar) {
        super(gVar);
        C89219l.m154721d(gVar, "");
    }
}
