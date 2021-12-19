package com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.p4359c;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.AbstractC84601i;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.AbstractC84602j;
import com.p2082ss.android.ugc.tools.infosticker.p4354a.p4356b.AbstractC84603k;
import com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84447f;
import com.p2082ss.android.ugc.tools.p4346h.p4349b.p4350a.AbstractC84461a;
import com.p2082ss.ugc.effectplatform.model.net.InfoStickerEffect;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.tools.infosticker.a.b.c.a */
public final class C84582a extends AbstractC84461a<InfoStickerEffect, String, C89391z> implements AbstractC84601i {

    /* renamed from: e */
    private final AbstractC84603k f189032e;

    /* renamed from: f */
    private final AbstractC89171a<AbstractC84602j> f189033f;

    static {
        Covode.recordClassIndex(98547);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.p2082ss.android.ugc.tools.p4346h.p4349b.p4350a.AbstractC84461a
    /* renamed from: a */
    public final /* synthetic */ String mo119499a(InfoStickerEffect infoStickerEffect) {
        InfoStickerEffect infoStickerEffect2 = infoStickerEffect;
        C89219l.m154721d(infoStickerEffect2, "");
        return infoStickerEffect2.getId();
    }

    /* renamed from: com.ss.android.ugc.tools.infosticker.a.b.c.a$a */
    public static final class C84583a implements AbstractC84447f<InfoStickerEffect, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC84447f f189034a;

        /* renamed from: b */
        final /* synthetic */ String f189035b;

        static {
            Covode.recordClassIndex(98548);
        }

        C84583a(AbstractC84447f fVar, String str) {
            this.f189034a = fVar;
            this.f189035b = str;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, int] */
        @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84447f
        /* renamed from: a */
        public final /* synthetic */ void mo119502a(InfoStickerEffect infoStickerEffect, int i) {
            C89219l.m154721d(infoStickerEffect, "");
            this.f189034a.mo119502a(infoStickerEffect, i);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84447f
        /* renamed from: a */
        public final /* synthetic */ void mo119504a(InfoStickerEffect infoStickerEffect, String str) {
            C89219l.m154721d(infoStickerEffect, "");
            AbstractC84447f fVar = this.f189034a;
            if (str == null) {
                str = this.f189035b;
            }
            fVar.mo119504a(infoStickerEffect, str);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Exception, java.lang.Object, long] */
        @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84447f
        /* renamed from: a */
        public final /* synthetic */ void mo119503a(InfoStickerEffect infoStickerEffect, Exception exc, C89391z zVar, long j) {
            C89219l.m154721d(infoStickerEffect, "");
            C89219l.m154721d(zVar, "");
            this.f189034a.mo119503a((Object) infoStickerEffect, exc, (Object) zVar, j);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, long] */
        @Override // com.p2082ss.android.ugc.tools.p4346h.p4347a.AbstractC84447f
        /* renamed from: a */
        public final /* synthetic */ void mo119505a(InfoStickerEffect infoStickerEffect, String str, C89391z zVar, long j) {
            String str2 = str;
            C89219l.m154721d(infoStickerEffect, "");
            C89219l.m154721d(zVar, "");
            AbstractC84447f fVar = this.f189034a;
            if (str2 == null) {
                str2 = this.f189035b;
            }
            fVar.mo119505a(infoStickerEffect, str2, zVar, j);
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.ss.android.ugc.tools.h.a.f] */
    @Override // com.p2082ss.android.ugc.tools.p4346h.p4349b.p4350a.AbstractC84461a
    /* renamed from: a */
    public final /* synthetic */ void mo119500a(InfoStickerEffect infoStickerEffect, AbstractC84447f<InfoStickerEffect, String, C89391z> fVar) {
        InfoStickerEffect infoStickerEffect2 = infoStickerEffect;
        C89219l.m154721d(infoStickerEffect2, "");
        C89219l.m154721d(fVar, "");
        String a = this.f189032e.mo129520a(infoStickerEffect2);
        if (this.f189032e.mo129521b(infoStickerEffect2)) {
            fVar.mo119504a(infoStickerEffect2, a);
        } else {
            this.f189033f.invoke().mo119501a(infoStickerEffect2, new C84583a(fVar, a));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: h.f.a.a<? extends com.ss.android.ugc.tools.infosticker.a.b.j> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C84582a(AbstractC84603k kVar, AbstractC89171a<? extends AbstractC84602j> aVar, int i) {
        super(i);
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(aVar, "");
        this.f189032e = kVar;
        this.f189033f = aVar;
    }
}
