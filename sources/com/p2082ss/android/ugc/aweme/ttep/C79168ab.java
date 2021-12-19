package com.p2082ss.android.ugc.aweme.ttep;

import android.app.Application;
import android.content.Context;
import androidx.appcompat.app.ActivityC0218d;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.als.ApiCenter;
import com.bytedance.als.dsl.C2553d;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.p942a.AbstractC14210a;
import com.bytedance.creativex.recorder.filter.p942a.C14212b;
import com.bytedance.creativex.recorder.filter.p943b.C14223a;
import com.bytedance.creativex.recorder.filter.p943b.C14225c;
import com.bytedance.creativex.recorder.filter.p945d.C14243a;
import com.bytedance.creativex.recorder.p938a.C14117i;
import com.bytedance.p1559o.AbstractC21603p;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.C21597n;
import com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b;
import com.p2082ss.android.ugc.aweme.effectplatform.AbstractC46415f;
import com.p2082ss.android.ugc.aweme.effectplatform.C46404c;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.main.C50798l;
import com.p2082ss.android.ugc.aweme.p2306ah.C33449c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.beauty.C69857a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3836i.C71877d;
import com.p2082ss.android.ugc.aweme.shortvideo.p3836i.C71885j;
import com.p2082ss.android.ugc.aweme.shortvideo.p3839l.C71922a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.creationflow.C73592c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.C73378e;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.C73392h;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.C73412j;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.C73438r;
import com.p2082ss.android.ugc.aweme.shortvideo.p3889w.C74217i;
import com.p2082ss.android.ugc.aweme.shortvideo.p3889w.C74228n;
import com.p2082ss.android.ugc.aweme.sticker.C75393k;
import com.p2082ss.android.ugc.aweme.sticker.C75404l;
import com.p2082ss.android.ugc.aweme.sticker.favorite.AbstractC75361b;
import com.p2082ss.android.ugc.aweme.sticker.favorite.C75363c;
import com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75429h;
import com.p2082ss.android.ugc.aweme.sticker.p3965m.C75421b;
import com.p2082ss.android.ugc.aweme.sticker.p3970p.AbstractC75461d;
import com.p2082ss.android.ugc.aweme.sticker.panel.guide.AbstractC75550j;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75594h;
import com.p2082ss.android.ugc.aweme.sticker.presenter.C75657q;
import com.p2082ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences;
import com.p2082ss.android.ugc.aweme.sticker.repository.p3983a.AbstractC75715t;
import com.p2082ss.android.ugc.aweme.ttep.C79164a;
import com.p2082ss.android.ugc.aweme.ttep.filter.TTEPFilterLogicComponent;
import com.p2082ss.android.ugc.aweme.ttep.p4150a.C79166a;
import com.p2082ss.android.ugc.effectmanager.effect.model.EffectCategoryModel;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4309a.C83950a;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84012d;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.C84025h;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.p4312a.C83976c;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.p4312a.C83984d;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Type;
import java.util.ArrayList;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ttep.ab */
public final class C79168ab {

    /* renamed from: com.ss.android.ugc.aweme.ttep.ab$m */
    static final class C79200m extends AbstractC89220m implements AbstractC89172b<C14212b, C14212b> {

        /* renamed from: a */
        public static final C79200m f177987a = new C79200m();

        static {
            Covode.recordClassIndex(92387);
        }

        C79200m() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C14212b invoke(C14212b bVar) {
            C89219l.m154721d(bVar, "");
            return bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ab$n */
    static final class C79201n extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C79201n f177988a = new C79201n();

        static {
            Covode.recordClassIndex(92388);
        }

        C79201n() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return false;
        }
    }

    static {
        Covode.recordClassIndex(92355);
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ab$k */
    static final class C79182k extends AbstractC89220m implements AbstractC89172b<C21597n, C89391z> {

        /* renamed from: a */
        final /* synthetic */ TTEPEffectPreviewActivity f177975a;

        static {
            Covode.recordClassIndex(92369);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79182k(TTEPEffectPreviewActivity tTEPEffectPreviewActivity) {
            super(1);
            this.f177975a = tTEPEffectPreviewActivity;
        }

        /* renamed from: com.ss.android.ugc.aweme.ttep.ab$k$m */
        public static final class C79196m extends AbstractC21603p<AbstractC75429h> {

            /* renamed from: a */
            final /* synthetic */ C79182k f177983a;

            static {
                Covode.recordClassIndex(92383);
            }

            /* renamed from: com.ss.android.ugc.aweme.ttep.ab$k$m$a */
            static final class C79197a extends AbstractC89220m implements AbstractC89171a<AbstractC84089j> {

                /* renamed from: a */
                final /* synthetic */ C21582f f177984a;

                static {
                    Covode.recordClassIndex(92384);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C79197a(C21582f fVar) {
                    super(0);
                    this.f177984a = fVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ AbstractC84089j invoke() {
                    return this.f177984a.mo35249a((Type) AbstractC84089j.class, (String) null);
                }
            }

            public C79196m(C79182k kVar) {
                this.f177983a = kVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final AbstractC75429h get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                ShortVideoContext shortVideoContext = this.f177983a.f177975a.f177930g;
                C89219l.m154716b(shortVideoContext, "");
                return new C75421b(shortVideoContext, new C79197a(fVar));
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ttep.ab$k$j */
        public static final class C79192j extends AbstractC21603p<AbstractC84012d> {

            /* renamed from: a */
            final /* synthetic */ C79182k f177981a;

            static {
                Covode.recordClassIndex(92379);
            }

            /* renamed from: com.ss.android.ugc.aweme.ttep.ab$k$j$a */
            static final class C79193a extends AbstractC89220m implements AbstractC89171a<C83976c.C83977a> {

                /* renamed from: a */
                final /* synthetic */ C79192j f177982a;

                static {
                    Covode.recordClassIndex(92380);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C79193a(C79192j jVar) {
                    super(0);
                    this.f177982a = jVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C83976c.C83977a invoke() {
                    return new C83976c.C83977a(this.f177982a.f177981a.f177975a.f177939p, this.f177982a.f177981a.f177975a.f177940q, this.f177982a.f177981a.f177975a.f177937n, this.f177982a.f177981a.f177975a.f177936m, !this.f177982a.f177981a.f177975a.f177946w);
                }
            }

            public C79192j(C79182k kVar) {
                this.f177981a = kVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final AbstractC84012d get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                C71922a aVar = this.f177981a.f177975a.f177941r;
                C89219l.m154716b(aVar, "");
                return new C83984d(fVar, aVar, new C79193a(this));
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ttep.ab$k$a */
        public static final class C79183a extends AbstractC21603p<TTEPEffectPreviewActivity> {

            /* renamed from: a */
            final /* synthetic */ C79182k f177976a;

            static {
                Covode.recordClassIndex(92370);
            }

            public C79183a(C79182k kVar) {
                this.f177976a = kVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final TTEPEffectPreviewActivity get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return this.f177976a.f177975a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ttep.ab$k$f */
        public static final class C79188f extends AbstractC21603p<ShortVideoContext> {

            /* renamed from: a */
            final /* synthetic */ C79182k f177977a;

            static {
                Covode.recordClassIndex(92375);
            }

            public C79188f(C79182k kVar) {
                this.f177977a = kVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final ShortVideoContext get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return this.f177977a.f177975a.f177930g;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ttep.ab$k$g */
        public static final class C79189g extends AbstractC21603p<ActivityC33402b> {

            /* renamed from: a */
            final /* synthetic */ C79182k f177978a;

            static {
                Covode.recordClassIndex(92376);
            }

            public C79189g(C79182k kVar) {
                this.f177978a = kVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final ActivityC33402b get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return this.f177978a.f177975a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ttep.ab$k$h */
        public static final class C79190h extends AbstractC21603p<ApiCenter> {

            /* renamed from: a */
            final /* synthetic */ C79182k f177979a;

            static {
                Covode.recordClassIndex(92377);
            }

            public C79190h(C79182k kVar) {
                this.f177979a = kVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final ApiCenter get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return ApiCenter.C2545a.m7450a(this.f177979a.f177975a);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ttep.ab$k$i */
        public static final class C79191i extends AbstractC21603p<AbstractC1204m> {

            /* renamed from: a */
            final /* synthetic */ C79182k f177980a;

            static {
                Covode.recordClassIndex(92378);
            }

            public C79191i(C79182k kVar) {
                this.f177980a = kVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final AbstractC1204m get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return this.f177980a.f177975a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ttep.ab$k$l */
        public static final class C79195l extends AbstractC21603p<AbstractC75461d> {
            static {
                Covode.recordClassIndex(92382);
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final AbstractC75461d get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return C33449c.f79502a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ttep.ab$k$b */
        public static final class C79184b extends AbstractC21603p<AbstractC75361b> {
            static {
                Covode.recordClassIndex(92371);
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final AbstractC75361b get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return new C75363c(fVar);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ttep.ab$k$k */
        public static final class C79194k extends AbstractC21603p<C73592c> {
            static {
                Covode.recordClassIndex(92381);
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final C73592c get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return new C73592c();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ttep.ab$k$n */
        static final class C79198n extends AbstractC89220m implements AbstractC89172b<EffectPlatformBuilder, C89391z> {

            /* renamed from: a */
            public static final C79198n f177985a = new C79198n();

            static {
                Covode.recordClassIndex(92385);
            }

            C79198n() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(EffectPlatformBuilder effectPlatformBuilder) {
                EffectPlatformBuilder effectPlatformBuilder2 = effectPlatformBuilder;
                C89219l.m154721d(effectPlatformBuilder2, "");
                effectPlatformBuilder2.setEnableKNEffectPlatform(true);
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ttep.ab$k$c */
        public static final class C79185c extends AbstractC21603p<AbstractC84398d> {
            static {
                Covode.recordClassIndex(92372);
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final AbstractC84398d get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                Application application = C63247i.f143610a;
                C89219l.m154716b(application, "");
                AbstractC46415f a = C46404c.m89554a(application, C79198n.f177985a);
                C89219l.m154721d(a, "");
                return new C79164a.C79165a(a);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ttep.ab$k$d */
        public static final class C79186d extends AbstractC21603p<StickerPreferences> {
            static {
                Covode.recordClassIndex(92373);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences, java.lang.Object] */
            /* JADX WARNING: Unknown variable types count: 1 */
            @Override // com.bytedance.p1559o.AbstractC21603p
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.p2082ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences get(com.bytedance.p1559o.C21582f r5) {
                /*
                    r4 = this;
                    java.lang.String r3 = ""
                    p4600h.p4611f.p4613b.C89219l.m154721d(r5, r3)
                    com.bytedance.cukaie.closet.a r2 = new com.bytedance.cukaie.closet.a
                    com.bytedance.cukaie.closet.internal.d r0 = new com.bytedance.cukaie.closet.internal.d
                    r0.<init>()
                    r2.<init>(r0)
                    android.app.Application r1 = com.p2082ss.android.ugc.aweme.port.p3561in.C63247i.f143610a
                    p4600h.p4611f.p4613b.C89219l.m154716b(r1, r3)
                    java.lang.Class<com.ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences> r0 = com.p2082ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences.class
                    java.lang.Object r0 = r2.mo23215a(r1, r0)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ttep.C79168ab.C79182k.C79186d.get(com.bytedance.o.f):java.lang.Object");
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ttep.ab$k$e */
        public static final class C79187e extends AbstractC21603p<AbstractC75550j> {
            static {
                Covode.recordClassIndex(92374);
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final AbstractC75550j get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return C75393k.m132223a((ShortVideoContext) fVar.mo35249a(ShortVideoContext.class, (String) null));
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C21597n nVar) {
            C21597n nVar2 = nVar;
            C89219l.m154721d(nVar2, "");
            C89219l.m154716b(nVar2.mo35260a(TTEPEffectPreviewActivity.class, (String) null, (AbstractC21603p) new C79183a(this)), "");
            C89219l.m154716b(nVar2.mo35260a(ShortVideoContext.class, (String) null, (AbstractC21603p) new C79188f(this)), "");
            C89219l.m154716b(nVar2.mo35260a(ActivityC33402b.class, (String) null, (AbstractC21603p) new C79189g(this)), "");
            C89219l.m154716b(nVar2.mo35260a(ApiCenter.class, (String) null, (AbstractC21603p) new C79190h(this)), "");
            C89219l.m154716b(nVar2.mo35260a(AbstractC1204m.class, (String) null, (AbstractC21603p) new C79191i(this)), "");
            C89219l.m154716b(nVar2.mo35260a(AbstractC84012d.class, (String) null, (AbstractC21603p) new C79192j(this)), "");
            C89219l.m154716b(nVar2.mo35260a(C73592c.class, (String) null, (AbstractC21603p) new C79194k()), "");
            C89219l.m154716b(nVar2.mo35260a(AbstractC75461d.class, (String) null, (AbstractC21603p) new C79195l()), "");
            C89219l.m154716b(nVar2.mo35260a(AbstractC75429h.class, (String) null, (AbstractC21603p) new C79196m(this)), "");
            C89219l.m154716b(nVar2.mo35260a(AbstractC75361b.class, (String) null, (AbstractC21603p) new C79184b()), "");
            C89219l.m154716b(nVar2.mo35260a(AbstractC84398d.class, (String) null, (AbstractC21603p) new C79185c()), "");
            C89219l.m154716b(nVar2.mo35260a(StickerPreferences.class, (String) null, (AbstractC21603p) new C79186d()), "");
            C89219l.m154716b(nVar2.mo35260a(AbstractC75550j.class, (String) null, (AbstractC21603p) new C79187e()), "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ab$e */
    public static final class C79173e extends AbstractC21603p<C84025h> {

        /* renamed from: a */
        final /* synthetic */ C2553d f177962a;

        static {
            Covode.recordClassIndex(92360);
        }

        /* renamed from: com.ss.android.ugc.aweme.ttep.ab$e$a */
        static final class C79174a extends AbstractC89220m implements AbstractC89171a<C75657q> {

            /* renamed from: a */
            final /* synthetic */ String f177963a;

            static {
                Covode.recordClassIndex(92361);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C79174a(String str) {
                super(0);
                this.f177963a = str;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C75657q invoke() {
                String str = this.f177963a;
                C89219l.m154716b(str, "");
                return new C75657q(str, true, false);
            }
        }

        public C79173e(C2553d dVar) {
            this.f177962a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C84025h get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            C63244g.m114602a().mo73295w();
            C89219l.m154716b("default", "");
            return C75404l.m132241a("default", fVar, null, new C79166a(), new C79174a("default"), new C79175b(fVar), 4);
        }

        /* renamed from: com.ss.android.ugc.aweme.ttep.ab$e$b */
        static final class C79175b extends AbstractC89220m implements AbstractC89183m<C75657q, AbstractC75715t, AbstractC89171a<? extends AbstractC75594h>> {

            /* renamed from: a */
            final /* synthetic */ C21582f f177964a;

            static {
                Covode.recordClassIndex(92362);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C79175b(C21582f fVar) {
                super(2);
                this.f177964a = fVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89183m
            public final /* synthetic */ AbstractC89171a<? extends AbstractC75594h> invoke(C75657q qVar, AbstractC75715t tVar) {
                final C75657q qVar2 = qVar;
                final AbstractC75715t tVar2 = tVar;
                C89219l.m154721d(qVar2, "");
                C89219l.m154721d(tVar2, "");
                return new AbstractC89171a<AbstractC75594h>(this) {
                    /* class com.p2082ss.android.ugc.aweme.ttep.C79168ab.C79173e.C79175b.C791761 */

                    /* renamed from: a */
                    final /* synthetic */ C79175b f177965a;

                    static {
                        Covode.recordClassIndex(92363);
                    }

                    {
                        this.f177965a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    @Override // p4600h.p4611f.p4612a.AbstractC89171a
                    public final /* synthetic */ AbstractC75594h invoke() {
                        ActivityC0218d dVar = (ActivityC0218d) this.f177965a.f177964a.mo35249a((Type) ActivityC0218d.class, (String) null);
                        C75657q qVar = qVar2;
                        AbstractC75715t tVar = tVar2;
                        AbstractC84398d dVar2 = (AbstractC84398d) this.f177965a.f177964a.mo35249a((Type) AbstractC84398d.class, (String) null);
                        String string = ((Context) this.f177965a.f177964a.mo35249a((Type) ActivityC0218d.class, (String) null)).getString(R.string.p);
                        C89219l.m154716b(string, "");
                        ArrayList arrayList = new ArrayList();
                        for (String str : C89070n.m154516a(string)) {
                            EffectCategoryModel effectCategoryModel = new EffectCategoryModel(null, 1, null);
                            effectCategoryModel.setName(str);
                            arrayList.add(effectCategoryModel);
                        }
                        return C75404l.m132238a(dVar, qVar, tVar, dVar2, arrayList);
                    }
                };
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ab$a */
    public static final class C79169a extends AbstractC21603p<C83950a> {

        /* renamed from: a */
        final /* synthetic */ C2553d f177958a;

        static {
            Covode.recordClassIndex(92356);
        }

        public C79169a(C2553d dVar) {
            this.f177958a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C83950a get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C83950a(fVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ab$b */
    public static final class C79170b extends AbstractC21603p<C14225c<AbstractC14210a>> {

        /* renamed from: a */
        final /* synthetic */ C2553d f177959a;

        static {
            Covode.recordClassIndex(92357);
        }

        public C79170b(C2553d dVar) {
            this.f177959a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C14225c<AbstractC14210a> get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            C89219l.m154721d(fVar, "");
            C79200m mVar = C79200m.f177987a;
            C79201n nVar = C79201n.f177988a;
            return new TTEPFilterLogicComponent(fVar, (ActivityC0218d) fVar.mo35248a(ActivityC0218d.class, (String) null), new C14225c.C14226a(C63244g.m114602a().mo73290r().mo86006d(), C50798l.C50799a.m95127a("TTEPEffectPreviewActivity"), new C71877d(C71885j.m126949a())), mVar, nVar, C79199l.f177986a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ab$c */
    public static final class C79171c extends AbstractC21603p<C14243a> {

        /* renamed from: a */
        final /* synthetic */ C2553d f177960a;

        static {
            Covode.recordClassIndex(92358);
        }

        public C79171c(C2553d dVar) {
            this.f177960a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C14243a get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C14243a(fVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ab$d */
    public static final class C79172d extends AbstractC21603p<C14117i> {

        /* renamed from: a */
        final /* synthetic */ C2553d f177961a;

        static {
            Covode.recordClassIndex(92359);
        }

        public C79172d(C2553d dVar) {
            this.f177961a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C14117i get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return C69857a.m123427a(fVar, true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ab$f */
    public static final class C79177f extends AbstractC21603p<C73392h> {

        /* renamed from: a */
        final /* synthetic */ C2553d f177968a;

        static {
            Covode.recordClassIndex(92364);
        }

        public C79177f(C2553d dVar) {
            this.f177968a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C73392h get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C73392h(fVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ab$g */
    public static final class C79178g extends AbstractC21603p<C73412j> {

        /* renamed from: a */
        final /* synthetic */ C2553d f177969a;

        static {
            Covode.recordClassIndex(92365);
        }

        public C79178g(C2553d dVar) {
            this.f177969a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C73412j get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C73412j(fVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ab$h */
    public static final class C79179h extends AbstractC21603p<C73378e> {

        /* renamed from: a */
        final /* synthetic */ C2553d f177970a;

        static {
            Covode.recordClassIndex(92366);
        }

        public C79179h(C2553d dVar) {
            this.f177970a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C73378e get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C73378e(fVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ab$l */
    static final class C79199l extends AbstractC89220m implements AbstractC89172b<C14223a, C89391z> {

        /* renamed from: a */
        public static final C79199l f177986a = new C79199l();

        static {
            Covode.recordClassIndex(92386);
        }

        C79199l() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C14223a aVar) {
            C14223a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f34510a = false;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ab$i */
    public static final class C79180i extends AbstractC21603p<C73438r> {

        /* renamed from: a */
        final /* synthetic */ C2553d f177971a;

        /* renamed from: b */
        final /* synthetic */ TTEPEffectPreviewActivity f177972b;

        static {
            Covode.recordClassIndex(92367);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C73438r get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C73438r(fVar, this.f177972b.f177930g.f155817b, this.f177972b.f177930g.f155830o);
        }

        public C79180i(C2553d dVar, TTEPEffectPreviewActivity tTEPEffectPreviewActivity) {
            this.f177971a = dVar;
            this.f177972b = tTEPEffectPreviewActivity;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ab$j */
    public static final class C79181j extends AbstractC21603p<C74228n> {

        /* renamed from: a */
        final /* synthetic */ C2553d f177973a;

        /* renamed from: b */
        final /* synthetic */ TTEPEffectPreviewActivity f177974b;

        static {
            Covode.recordClassIndex(92368);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C74228n get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            ShortVideoContext shortVideoContext = this.f177974b.f177930g;
            C89219l.m154716b(shortVideoContext, "");
            return C74217i.m130483a(fVar, shortVideoContext);
        }

        public C79181j(C2553d dVar, TTEPEffectPreviewActivity tTEPEffectPreviewActivity) {
            this.f177973a = dVar;
            this.f177974b = tTEPEffectPreviewActivity;
        }
    }
}
