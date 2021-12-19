package com.p2082ss.android.ugc.tools.p4346h.p4349b.p4352c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.CategoryEffectModel;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84451j;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.C84443b;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.p4348a.AbstractC84437b;
import com.p2082ss.android.ugc.tools.p4346h.p4349b.p4351b.C84519k;
import com.p2082ss.android.ugc.tools.p4346h.p4349b.p4351b.C84522n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.h.b.c.b */
public final class C84529b implements AbstractC84437b<Effect> {

    /* renamed from: a */
    private final AbstractC89171a<AbstractC84398d> f188931a;

    /* renamed from: b */
    private final int f188932b;

    /* renamed from: c */
    private final boolean f188933c;

    static {
        Covode.recordClassIndex(98494);
    }

    /* Return type fixed from 'com.ss.android.ugc.tools.h.a.j' to match base method */
    @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.p4348a.AbstractC84437b
    /* renamed from: a */
    public final /* synthetic */ AbstractC84451j<Effect, CategoryEffectModel> mo129419a(C84443b bVar) {
        String str = "";
        C89219l.m154721d(bVar, str);
        AbstractC89171a<AbstractC84398d> aVar = this.f188931a;
        String str2 = bVar.f188775a;
        int i = this.f188932b;
        String str3 = bVar.f188777c;
        if (str3 != null) {
            str = str3;
        }
        return new C84522n(aVar, str2, i, new C84519k(0, 0, "", true, str), this.f188933c);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.b.a.d> */
    /* JADX WARN: Multi-variable type inference failed */
    public C84529b(AbstractC89171a<? extends AbstractC84398d> aVar, int i, boolean z) {
        C89219l.m154721d(aVar, "");
        this.f188931a = aVar;
        this.f188932b = i;
        this.f188933c = z;
    }
}
