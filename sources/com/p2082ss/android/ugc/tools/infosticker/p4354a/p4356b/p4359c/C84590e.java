package com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.p4359c;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58016d;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.AbstractC84538f;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.AbstractC84539g;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.AbstractC84600h;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.AbstractC84602j;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.AbstractC84603k;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84454k;
import com.p2082ss.ugc.effectplatform.model.net.InfoStickerEffect;
import java.io.File;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.a.b.c.e */
public final class C84590e implements AbstractC84539g {

    /* renamed from: a */
    public final AbstractC89171a<AbstractC84398d> f189047a;

    /* renamed from: b */
    private AbstractC89171a<? extends AbstractC84603k> f189048b;

    /* renamed from: c */
    private AbstractC89171a<? extends AbstractC84602j> f189049c;

    /* renamed from: d */
    private Integer f189050d;

    /* renamed from: e */
    private AbstractC89171a<? extends AbstractC84454k<InfoStickerEffect, C89391z>> f189051e;

    /* renamed from: f */
    private Integer f189052f;

    /* renamed from: g */
    private Integer f189053g;

    /* renamed from: h */
    private AbstractC89171a<? extends AbstractC84600h> f189054h;

    /* renamed from: i */
    private final Context f189055i;

    /* renamed from: j */
    private final AbstractC89171a<String> f189056j;

    static {
        Covode.recordClassIndex(98555);
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.a.b.c.e$a */
    static final class C84591a extends AbstractC89220m implements AbstractC89171a<C84595h> {

        /* renamed from: a */
        final /* synthetic */ C84590e f189057a;

        static {
            Covode.recordClassIndex(98556);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C84591a(C84590e eVar) {
            super(0);
            this.f189057a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C84595h invoke() {
            return new C84595h(this.f189057a.f189047a);
        }
    }

    @Override // com.p2082ss.android.ugc.tools.infosticker.p4354a.p4355a.AbstractC84539g
    /* renamed from: a */
    public final AbstractC84538f mo129487a() {
        AbstractC84603k kVar;
        int i;
        int i2;
        AbstractC84600h hVar;
        AbstractC89171a<? extends AbstractC84603k> aVar = this.f189048b;
        if (aVar == null || (kVar = (AbstractC84603k) aVar.invoke()) == null) {
            Context context = this.f189055i;
            if (C58016d.f132222c == null || !C58016d.f132224e) {
                C58016d.f132222c = context.getFilesDir();
            }
            String absolutePath = new File(C58016d.f132222c, "effect").getAbsolutePath();
            C89219l.m154716b(absolutePath, "");
            kVar = new C84584b(absolutePath);
        }
        AbstractC89171a aVar2 = this.f189049c;
        if (aVar2 == null) {
            aVar2 = new C84591a(this);
        }
        Integer num = this.f189050d;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 3;
        }
        C84582a aVar3 = new C84582a(kVar, aVar2, i);
        AbstractC89171a<? extends AbstractC84454k<InfoStickerEffect, C89391z>> aVar4 = this.f189051e;
        if (aVar4 != null) {
            aVar3.mo129440a((AbstractC84454k) aVar4.invoke());
        }
        C84592f fVar = new C84592f(kVar, aVar3);
        Integer num2 = this.f189052f;
        int i3 = 30;
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = 30;
        }
        Integer num3 = this.f189053g;
        if (num3 != null) {
            i3 = num3.intValue();
        }
        AbstractC89171a<? extends AbstractC84600h> aVar5 = this.f189054h;
        if (aVar5 == null || (hVar = (AbstractC84600h) aVar5.invoke()) == null) {
            hVar = new C84594g(this.f189047a, this.f189056j, i2, i3);
        }
        return new C84585c(hVar, fVar, aVar3, kVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.b.a.d> */
    /* JADX WARN: Multi-variable type inference failed */
    public C84590e(Context context, AbstractC89171a<? extends AbstractC84398d> aVar, AbstractC89171a<String> aVar2) {
        C89219l.m154721d(context, "");
        C89219l.m154721d(aVar, "");
        C89219l.m154721d(aVar2, "");
        this.f189055i = context;
        this.f189047a = aVar;
        this.f189056j = aVar2;
    }
}
