package com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.p4358b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.effect.model.ProviderEffect;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.AbstractC84596d;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.AbstractC84597e;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.AbstractC84598f;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84447f;
import com.p2082ss.android.ugc.tools.p4346h.p4349b.p4350a.AbstractC84461a;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.a.b.b.a */
public final class C84567a extends AbstractC84461a<ProviderEffect, String, C89391z> implements AbstractC84596d {

    /* renamed from: e */
    private final AbstractC84598f f188996e;

    /* renamed from: f */
    private final AbstractC89171a<AbstractC84597e> f188997f;

    static {
        Covode.recordClassIndex(98532);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.tools.p4346h.p4349b.p4350a.AbstractC84461a
    /* renamed from: a */
    public final /* synthetic */ String mo119499a(ProviderEffect providerEffect) {
        ProviderEffect providerEffect2 = providerEffect;
        C89219l.m154721d(providerEffect2, "");
        String id = providerEffect2.getId();
        if (id == null) {
            return "";
        }
        return id;
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.a.b.b.a$a */
    public static final class C84568a implements AbstractC84447f<ProviderEffect, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC84447f f188998a;

        /* renamed from: b */
        final /* synthetic */ String f188999b;

        static {
            Covode.recordClassIndex(98533);
        }

        C84568a(AbstractC84447f fVar, String str) {
            this.f188998a = fVar;
            this.f188999b = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
        @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84447f
        /* renamed from: a */
        public final /* synthetic */ void mo119502a(ProviderEffect providerEffect, int i) {
            C89219l.m154721d(providerEffect, "");
            this.f188998a.mo119502a(providerEffect, i);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84447f
        /* renamed from: a */
        public final /* synthetic */ void mo119504a(ProviderEffect providerEffect, String str) {
            C89219l.m154721d(providerEffect, "");
            AbstractC84447f fVar = this.f188998a;
            if (str == null) {
                str = this.f188999b;
            }
            fVar.mo119504a(providerEffect, str);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Exception, java.lang.Object, long] */
        @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84447f
        /* renamed from: a */
        public final /* synthetic */ void mo119503a(ProviderEffect providerEffect, Exception exc, C89391z zVar, long j) {
            C89219l.m154721d(providerEffect, "");
            C89219l.m154721d(zVar, "");
            this.f188998a.mo119503a((Object) providerEffect, exc, (Object) zVar, j);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, long] */
        @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84447f
        /* renamed from: a */
        public final /* synthetic */ void mo119505a(ProviderEffect providerEffect, String str, C89391z zVar, long j) {
            String str2 = str;
            C89219l.m154721d(providerEffect, "");
            C89219l.m154721d(zVar, "");
            AbstractC84447f fVar = this.f188998a;
            if (str2 == null) {
                str2 = this.f188999b;
            }
            fVar.mo119505a(providerEffect, str2, zVar, j);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.android.ugc.tools.h.a.f] */
    @Override // com.p2082ss.android.ugc.tools.p4346h.p4349b.p4350a.AbstractC84461a
    /* renamed from: a */
    public final /* synthetic */ void mo119500a(ProviderEffect providerEffect, AbstractC84447f<ProviderEffect, String, C89391z> fVar) {
        ProviderEffect providerEffect2 = providerEffect;
        C89219l.m154721d(providerEffect2, "");
        C89219l.m154721d(fVar, "");
        String a = this.f188996e.mo129514a(providerEffect2);
        if (this.f188996e.mo129515b(providerEffect2)) {
            fVar.mo119504a(providerEffect2, a);
        } else {
            this.f188997f.invoke().mo119501a(providerEffect2, new C84568a(fVar, a));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.infosticker.a.b.e> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84567a(AbstractC84598f fVar, AbstractC89171a<? extends AbstractC84597e> aVar, int i) {
        super(i);
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(aVar, "");
        this.f188996e = fVar;
        this.f188997f = aVar;
    }
}
