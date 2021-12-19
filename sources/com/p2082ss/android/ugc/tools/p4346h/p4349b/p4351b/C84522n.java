package com.p2082ss.android.ugc.tools.p4346h.p4349b.p4351b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84451j;
import java.util.List;
import p4560f.p4561a.AbstractC88403ab;
import p4600h.C89378p;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.h.b.b.n */
public final class C84522n extends C84491c implements AbstractC84451j<Effect, CategoryEffectModel> {

    /* renamed from: i */
    private final int f188913i;

    static {
        Covode.recordClassIndex(98487);
    }

    @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84451j
    /* renamed from: a */
    public final AbstractC88403ab<C89378p<List<Effect>, CategoryEffectModel>> mo129432a() {
        return mo129458a(this.f188913i);
    }

    @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84451j
    /* renamed from: b */
    public final AbstractC88403ab<List<Effect>> mo129433b() {
        return AbstractC84451j.C84452a.m145274a(this);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84522n(AbstractC89171a<? extends AbstractC84398d> aVar, String str, int i, C84519k kVar, boolean z) {
        super(aVar, str, kVar, z);
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(kVar, "");
        this.f188913i = i;
    }
}
