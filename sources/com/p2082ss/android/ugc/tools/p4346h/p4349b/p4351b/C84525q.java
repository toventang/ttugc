package com.p2082ss.android.ugc.tools.p4346h.p4349b.p4351b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffectModel;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84451j;
import java.util.List;
import p4560f.p4561a.AbstractC88403ab;
import p4600h.C89378p;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.h.b.b.q */
public final class C84525q extends C84505f implements AbstractC84451j<ProviderEffect, ProviderEffectModel> {

    /* renamed from: j */
    private final int f188920j;

    static {
        Covode.recordClassIndex(98490);
    }

    @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84451j
    /* renamed from: a */
    public final AbstractC88403ab<C89378p<List<ProviderEffect>, ProviderEffectModel>> mo129432a() {
        return mo129458a(this.f188920j);
    }

    @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84451j
    /* renamed from: b */
    public final AbstractC88403ab<List<ProviderEffect>> mo129433b() {
        return AbstractC84451j.C84452a.m145274a(this);
    }

    public /* synthetic */ C84525q(AbstractC89171a aVar, String str, String str2, String str3, int i) {
        this(aVar, str, str2, str3, i, C84517i.f188902a);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C84525q(AbstractC89171a<? extends AbstractC84398d> aVar, String str, String str2, String str3, int i, C84520l lVar) {
        super(aVar, str, str2, str3, lVar);
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(str, "");
        C89219l.m154721d(str2, "");
        C89219l.m154721d(str3, "");
        C89219l.m154721d(lVar, "");
        this.f188920j = i;
    }
}
