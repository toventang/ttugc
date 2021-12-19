package com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.p4358b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.AbstractC84534b;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.AbstractC84535c;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.AbstractC84581c;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.AbstractC84597e;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.AbstractC84598f;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84454k;
import java.io.File;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.a.b.b.e */
public final class C84575e implements AbstractC84535c {

    /* renamed from: a */
    public final AbstractC89171a<AbstractC84398d> f189011a;

    /* renamed from: b */
    private AbstractC89171a<? extends AbstractC84598f> f189012b;

    /* renamed from: c */
    private AbstractC89171a<? extends AbstractC84597e> f189013c;

    /* renamed from: d */
    private Integer f189014d;

    /* renamed from: e */
    private AbstractC89171a<? extends AbstractC84454k<ProviderEffect, C89391z>> f189015e;

    /* renamed from: f */
    private Integer f189016f;

    /* renamed from: g */
    private Integer f189017g;

    /* renamed from: h */
    private AbstractC89171a<? extends AbstractC84581c> f189018h;

    /* renamed from: i */
    private final Context f189019i;

    /* renamed from: j */
    private final AbstractC89171a<String> f189020j;

    /* renamed from: k */
    private final AbstractC89171a<String> f189021k;

    static {
        Covode.recordClassIndex(98540);
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.a.b.b.e$a */
    static final class C84576a extends AbstractC89220m implements AbstractC89171a<C84580h> {

        /* renamed from: a */
        final /* synthetic */ C84575e f189022a;

        static {
            Covode.recordClassIndex(98541);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84576a(C84575e eVar) {
            super(0);
            this.f189022a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C84580h invoke() {
            return new C84580h(this.f189022a.f189011a);
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.AbstractC84535c
    /* renamed from: a */
    public final AbstractC84534b mo129482a() {
        AbstractC84598f fVar;
        int i;
        int i2;
        int i3;
        AbstractC84581c cVar;
        AbstractC89171a<? extends AbstractC84598f> aVar = this.f189012b;
        if (aVar == null || (fVar = (AbstractC84598f) aVar.invoke()) == null) {
            Context context = this.f189019i;
            if (C58016d.f132222c == null || !C58016d.f132224e) {
                C58016d.f132222c = context.getFilesDir();
            }
            String absolutePath = new File(C58016d.f132222c, "effect").getAbsolutePath();
            C89219l.m154716b(absolutePath, "");
            fVar = new C84569b(absolutePath);
        }
        AbstractC89171a aVar2 = this.f189013c;
        if (aVar2 == null) {
            aVar2 = new C84576a(this);
        }
        Integer num = this.f189014d;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 3;
        }
        C84567a aVar3 = new C84567a(fVar, aVar2, i);
        AbstractC89171a<? extends AbstractC84454k<ProviderEffect, C89391z>> aVar4 = this.f189015e;
        if (aVar4 != null) {
            aVar3.mo129440a((AbstractC84454k) aVar4.invoke());
        }
        C84577f fVar2 = new C84577f(aVar3, fVar);
        Integer num2 = this.f189016f;
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = 30;
        }
        Integer num3 = this.f189017g;
        if (num3 != null) {
            i3 = num3.intValue();
        } else {
            i3 = 30;
        }
        AbstractC89171a<? extends AbstractC84581c> aVar5 = this.f189018h;
        if (aVar5 == null || (cVar = (AbstractC84581c) aVar5.invoke()) == null) {
            cVar = new C84579g(this.f189011a, this.f189020j, this.f189021k, i2, i3);
        }
        return new C84570c(cVar, fVar2, aVar3, fVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.b.a.d> */
    /* JADX WARN: Multi-variable type inference failed */
    public C84575e(Context context, AbstractC89171a<? extends AbstractC84398d> aVar, AbstractC89171a<String> aVar2, AbstractC89171a<String> aVar3) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        C89219l.m154721d(aVar3, "");
        this.f189019i = context;
        this.f189011a = aVar;
        this.f189020j = aVar2;
        this.f189021k = aVar3;
    }
}
