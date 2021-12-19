package com.p2082ss.android.ugc.aweme.ftc;

import android.app.Application;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.als.ApiCenter;
import com.bytedance.als.dsl.C2553d;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.p945d.C14243a;
import com.bytedance.creativex.recorder.p938a.C14117i;
import com.bytedance.p1559o.AbstractC21603p;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.C21597n;
import com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b;
import com.p2082ss.android.ugc.aweme.effectplatform.C46404c;
import com.p2082ss.android.ugc.aweme.p2306ah.C33449c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.beauty.C69857a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3839l.C71922a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73698ge;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.creationflow.C73592c;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.C73360ad;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.C73378e;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.C73390g;
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
import com.p2082ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4309a.C83950a;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84012d;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.C84025h;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.p4312a.C83976c;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.p4312a.C83984d;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import java.lang.reflect.Type;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.ab */
public final class C51838ab {
    static {
        Covode.recordClassIndex(61207);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.ab$l */
    static final class C51850l extends AbstractC89220m implements AbstractC89172b<C21597n, C89391z> {

        /* renamed from: a */
        final /* synthetic */ FTCVideoRecordNewActivity f119499a;

        static {
            Covode.recordClassIndex(61219);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51850l(FTCVideoRecordNewActivity fTCVideoRecordNewActivity) {
            super(1);
            this.f119499a = fTCVideoRecordNewActivity;
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.ab$l$m */
        public static final class C51864m extends AbstractC21603p<AbstractC75429h> {

            /* renamed from: a */
            final /* synthetic */ C51850l f119507a;

            static {
                Covode.recordClassIndex(61233);
            }

            /* renamed from: com.ss.android.ugc.aweme.ftc.ab$l$m$a */
            static final class C51865a extends AbstractC89220m implements AbstractC89171a<AbstractC84089j> {

                /* renamed from: a */
                final /* synthetic */ C21582f f119508a;

                static {
                    Covode.recordClassIndex(61234);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C51865a(C21582f fVar) {
                    super(0);
                    this.f119508a = fVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ AbstractC84089j invoke() {
                    return this.f119508a.mo35249a((Type) AbstractC84089j.class, (String) null);
                }
            }

            public C51864m(C51850l lVar) {
                this.f119507a = lVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final AbstractC75429h get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                ShortVideoContext shortVideoContext = this.f119507a.f119499a.f119415g;
                C89219l.m154716b(shortVideoContext, "");
                return new C75421b(shortVideoContext, new C51865a(fVar));
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.ab$l$j */
        public static final class C51860j extends AbstractC21603p<AbstractC84012d> {

            /* renamed from: a */
            final /* synthetic */ C51850l f119505a;

            static {
                Covode.recordClassIndex(61229);
            }

            /* renamed from: com.ss.android.ugc.aweme.ftc.ab$l$j$a */
            static final class C51861a extends AbstractC89220m implements AbstractC89171a<C83976c.C83977a> {

                /* renamed from: a */
                final /* synthetic */ C51860j f119506a;

                static {
                    Covode.recordClassIndex(61230);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C51861a(C51860j jVar) {
                    super(0);
                    this.f119506a = jVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C83976c.C83977a invoke() {
                    return new C83976c.C83977a(this.f119506a.f119505a.f119499a.f119425q, this.f119506a.f119505a.f119499a.f119426r, this.f119506a.f119505a.f119499a.f119423o, this.f119506a.f119505a.f119499a.f119422n, !this.f119506a.f119505a.f119499a.f119431w);
                }
            }

            public C51860j(C51850l lVar) {
                this.f119505a = lVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final AbstractC84012d get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                C71922a aVar = this.f119505a.f119499a.f119427s;
                C89219l.m154716b(aVar, "");
                return new C83984d(fVar, aVar, new C51861a(this));
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.ab$l$a */
        public static final class C51851a extends AbstractC21603p<FTCVideoRecordNewActivity> {

            /* renamed from: a */
            final /* synthetic */ C51850l f119500a;

            static {
                Covode.recordClassIndex(61220);
            }

            public C51851a(C51850l lVar) {
                this.f119500a = lVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final FTCVideoRecordNewActivity get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return this.f119500a.f119499a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.ab$l$f */
        public static final class C51856f extends AbstractC21603p<ShortVideoContext> {

            /* renamed from: a */
            final /* synthetic */ C51850l f119501a;

            static {
                Covode.recordClassIndex(61225);
            }

            public C51856f(C51850l lVar) {
                this.f119501a = lVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final ShortVideoContext get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return this.f119501a.f119499a.f119415g;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.ab$l$g */
        public static final class C51857g extends AbstractC21603p<ActivityC33402b> {

            /* renamed from: a */
            final /* synthetic */ C51850l f119502a;

            static {
                Covode.recordClassIndex(61226);
            }

            public C51857g(C51850l lVar) {
                this.f119502a = lVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final ActivityC33402b get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return this.f119502a.f119499a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.ab$l$h */
        public static final class C51858h extends AbstractC21603p<ApiCenter> {

            /* renamed from: a */
            final /* synthetic */ C51850l f119503a;

            static {
                Covode.recordClassIndex(61227);
            }

            public C51858h(C51850l lVar) {
                this.f119503a = lVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final ApiCenter get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return ApiCenter.C2545a.m7450a(this.f119503a.f119499a);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.ab$l$i */
        public static final class C51859i extends AbstractC21603p<AbstractC1204m> {

            /* renamed from: a */
            final /* synthetic */ C51850l f119504a;

            static {
                Covode.recordClassIndex(61228);
            }

            public C51859i(C51850l lVar) {
                this.f119504a = lVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final AbstractC1204m get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return this.f119504a.f119499a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.ab$l$l */
        public static final class C51863l extends AbstractC21603p<AbstractC75461d> {
            static {
                Covode.recordClassIndex(61232);
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final AbstractC75461d get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return C33449c.f79502a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.ab$l$b */
        public static final class C51852b extends AbstractC21603p<AbstractC75361b> {
            static {
                Covode.recordClassIndex(61221);
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final AbstractC75361b get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return new C75363c(fVar);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.ab$l$k */
        public static final class C51862k extends AbstractC21603p<C73592c> {
            static {
                Covode.recordClassIndex(61231);
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final C73592c get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return new C73592c();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.ab$l$n */
        static final class C51866n extends AbstractC89220m implements AbstractC89172b<EffectPlatformBuilder, C89391z> {

            /* renamed from: a */
            public static final C51866n f119509a = new C51866n();

            static {
                Covode.recordClassIndex(61235);
            }

            C51866n() {
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

        /* renamed from: com.ss.android.ugc.aweme.ftc.ab$l$c */
        public static final class C51853c extends AbstractC21603p<AbstractC84398d> {
            static {
                Covode.recordClassIndex(61222);
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final AbstractC84398d get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                Application application = C63247i.f143610a;
                C89219l.m154716b(application, "");
                return C46404c.m89554a(application, C51866n.f119509a);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.ab$l$d */
        public static final class C51854d extends AbstractC21603p<StickerPreferences> {
            static {
                Covode.recordClassIndex(61223);
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
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ftc.C51838ab.C51850l.C51854d.get(com.bytedance.o.f):java.lang.Object");
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.ab$l$e */
        public static final class C51855e extends AbstractC21603p<AbstractC75550j> {
            static {
                Covode.recordClassIndex(61224);
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
            C89219l.m154716b(nVar2.mo35260a(FTCVideoRecordNewActivity.class, (String) null, (AbstractC21603p) new C51851a(this)), "");
            C89219l.m154716b(nVar2.mo35260a(ShortVideoContext.class, (String) null, (AbstractC21603p) new C51856f(this)), "");
            C89219l.m154716b(nVar2.mo35260a(ActivityC33402b.class, (String) null, (AbstractC21603p) new C51857g(this)), "");
            C89219l.m154716b(nVar2.mo35260a(ApiCenter.class, (String) null, (AbstractC21603p) new C51858h(this)), "");
            C89219l.m154716b(nVar2.mo35260a(AbstractC1204m.class, (String) null, (AbstractC21603p) new C51859i(this)), "");
            C89219l.m154716b(nVar2.mo35260a(AbstractC84012d.class, (String) null, (AbstractC21603p) new C51860j(this)), "");
            C89219l.m154716b(nVar2.mo35260a(C73592c.class, (String) null, (AbstractC21603p) new C51862k()), "");
            C89219l.m154716b(nVar2.mo35260a(AbstractC75461d.class, (String) null, (AbstractC21603p) new C51863l()), "");
            C89219l.m154716b(nVar2.mo35260a(AbstractC75429h.class, (String) null, (AbstractC21603p) new C51864m(this)), "");
            C89219l.m154716b(nVar2.mo35260a(AbstractC75361b.class, (String) null, (AbstractC21603p) new C51852b()), "");
            C89219l.m154716b(nVar2.mo35260a(AbstractC84398d.class, (String) null, (AbstractC21603p) new C51853c()), "");
            C89219l.m154716b(nVar2.mo35260a(StickerPreferences.class, (String) null, (AbstractC21603p) new C51854d()), "");
            C89219l.m154716b(nVar2.mo35260a(AbstractC75550j.class, (String) null, (AbstractC21603p) new C51855e()), "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.ab$a */
    public static final class C51839a extends AbstractC21603p<C83950a> {

        /* renamed from: a */
        final /* synthetic */ C2553d f119486a;

        static {
            Covode.recordClassIndex(61208);
        }

        public C51839a(C2553d dVar) {
            this.f119486a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C83950a get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C83950a(fVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.ab$b */
    public static final class C51840b extends AbstractC21603p<C73390g> {

        /* renamed from: a */
        final /* synthetic */ C2553d f119487a;

        static {
            Covode.recordClassIndex(61209);
        }

        public C51840b(C2553d dVar) {
            this.f119487a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C73390g get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C73390g(fVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.ab$c */
    public static final class C51841c extends AbstractC21603p<C73360ad> {

        /* renamed from: a */
        final /* synthetic */ C2553d f119488a;

        static {
            Covode.recordClassIndex(61210);
        }

        public C51841c(C2553d dVar) {
            this.f119488a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C73360ad get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return C73698ge.m129783a(fVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.ab$d */
    public static final class C51842d extends AbstractC21603p<C14243a> {

        /* renamed from: a */
        final /* synthetic */ C2553d f119489a;

        static {
            Covode.recordClassIndex(61211);
        }

        public C51842d(C2553d dVar) {
            this.f119489a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C14243a get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C14243a(fVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.ab$e */
    public static final class C51843e extends AbstractC21603p<C14117i> {

        /* renamed from: a */
        final /* synthetic */ C2553d f119490a;

        static {
            Covode.recordClassIndex(61212);
        }

        public C51843e(C2553d dVar) {
            this.f119490a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C14117i get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return C69857a.m123427a(fVar, true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.ab$f */
    public static final class C51844f extends AbstractC21603p<C84025h> {

        /* renamed from: a */
        final /* synthetic */ C2553d f119491a;

        static {
            Covode.recordClassIndex(61213);
        }

        public C51844f(C2553d dVar) {
            this.f119491a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C84025h get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            C63244g.m114602a().mo73295w();
            C89219l.m154716b("default", "");
            return C75404l.m132241a("default", fVar, null, null, null, null, 60);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.ab$g */
    public static final class C51845g extends AbstractC21603p<C73392h> {

        /* renamed from: a */
        final /* synthetic */ C2553d f119492a;

        static {
            Covode.recordClassIndex(61214);
        }

        public C51845g(C2553d dVar) {
            this.f119492a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C73392h get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C73392h(fVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.ab$h */
    public static final class C51846h extends AbstractC21603p<C73412j> {

        /* renamed from: a */
        final /* synthetic */ C2553d f119493a;

        static {
            Covode.recordClassIndex(61215);
        }

        public C51846h(C2553d dVar) {
            this.f119493a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C73412j get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C73412j(fVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.ab$i */
    public static final class C51847i extends AbstractC21603p<C73378e> {

        /* renamed from: a */
        final /* synthetic */ C2553d f119494a;

        static {
            Covode.recordClassIndex(61216);
        }

        public C51847i(C2553d dVar) {
            this.f119494a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C73378e get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C73378e(fVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.ab$j */
    public static final class C51848j extends AbstractC21603p<C73438r> {

        /* renamed from: a */
        final /* synthetic */ C2553d f119495a;

        /* renamed from: b */
        final /* synthetic */ FTCVideoRecordNewActivity f119496b;

        static {
            Covode.recordClassIndex(61217);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C73438r get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C73438r(fVar, this.f119496b.f119415g.f155817b, this.f119496b.f119415g.f155830o);
        }

        public C51848j(C2553d dVar, FTCVideoRecordNewActivity fTCVideoRecordNewActivity) {
            this.f119495a = dVar;
            this.f119496b = fTCVideoRecordNewActivity;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.ab$k */
    public static final class C51849k extends AbstractC21603p<C74228n> {

        /* renamed from: a */
        final /* synthetic */ C2553d f119497a;

        /* renamed from: b */
        final /* synthetic */ FTCVideoRecordNewActivity f119498b;

        static {
            Covode.recordClassIndex(61218);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C74228n get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            ShortVideoContext shortVideoContext = this.f119498b.f119415g;
            C89219l.m154716b(shortVideoContext, "");
            return C74217i.m130483a(fVar, shortVideoContext);
        }

        public C51849k(C2553d dVar, FTCVideoRecordNewActivity fTCVideoRecordNewActivity) {
            this.f119497a = dVar;
            this.f119498b = fTCVideoRecordNewActivity;
        }
    }
}
