package com.p2082ss.android.ugc.aweme.shortvideo.p3876ui;

import android.app.Application;
import androidx.appcompat.app.ActivityC0218d;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.als.ApiCenter;
import com.bytedance.als.dsl.C2553d;
import com.bytedance.als.dsl.C2554e;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.p942a.AbstractC14220j;
import com.bytedance.creativex.recorder.filter.p942a.C14212b;
import com.bytedance.creativex.recorder.filter.p943b.C14223a;
import com.bytedance.creativex.recorder.filter.p943b.C14225c;
import com.bytedance.creativex.recorder.filter.p945d.C14243a;
import com.bytedance.creativex.recorder.p938a.C14117i;
import com.bytedance.creativex.recorder.sticker.p948b.AbstractC14343f;
import com.bytedance.ies.abmock.C16048b;
import com.bytedance.p1559o.AbstractC21603p;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.C21597n;
import com.p2082ss.android.ugc.aweme.adaptation.ActivityC33402b;
import com.p2082ss.android.ugc.aweme.effectplatform.C46404c;
import com.p2082ss.android.ugc.aweme.filter.p2982b.C50647b;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.main.C50798l;
import com.p2082ss.android.ugc.aweme.filter.repository.internal.main.C50808r;
import com.p2082ss.android.ugc.aweme.filter.repository.p2986a.AbstractC50706n;
import com.p2082ss.android.ugc.aweme.p2306ah.C33449c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import com.p2082ss.android.ugc.aweme.setting.p3721i.C68093f;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.beauty.C69857a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3836i.C71877d;
import com.p2082ss.android.ugc.aweme.shortvideo.p3836i.C71878e;
import com.p2082ss.android.ugc.aweme.shortvideo.p3836i.C71885j;
import com.p2082ss.android.ugc.aweme.shortvideo.p3839l.C71922a;
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
import org.json.JSONObject;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ge */
public final class C73698ge {

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ge$p */
    public static final class C73731p extends AbstractC89220m implements AbstractC89172b<C14212b, C14212b> {

        /* renamed from: a */
        public static final C73731p f165565a = new C73731p();

        static {
            Covode.recordClassIndex(86469);
        }

        C73731p() {
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

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ge$q */
    public static final class C73732q extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C73732q f165566a = new C73732q();

        static {
            Covode.recordClassIndex(86470);
        }

        C73732q() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return true;
        }
    }

    static {
        Covode.recordClassIndex(86436);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ge$m */
    static final class C73711m extends AbstractC89220m implements AbstractC89172b<C21597n, C89391z> {

        /* renamed from: a */
        final /* synthetic */ VideoRecordNewActivity f165551a;

        static {
            Covode.recordClassIndex(86449);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C73711m(VideoRecordNewActivity videoRecordNewActivity) {
            super(1);
            this.f165551a = videoRecordNewActivity;
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ge$m$m */
        public static final class C73725m extends AbstractC21603p<AbstractC75429h> {

            /* renamed from: a */
            final /* synthetic */ C73711m f165559a;

            static {
                Covode.recordClassIndex(86463);
            }

            /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ge$m$m$a */
            static final class C73726a extends AbstractC89220m implements AbstractC89171a<AbstractC84089j> {

                /* renamed from: a */
                final /* synthetic */ C21582f f165560a;

                static {
                    Covode.recordClassIndex(86464);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C73726a(C21582f fVar) {
                    super(0);
                    this.f165560a = fVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ AbstractC84089j invoke() {
                    return this.f165560a.mo35249a((Type) AbstractC84089j.class, (String) null);
                }
            }

            public C73725m(C73711m mVar) {
                this.f165559a = mVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final AbstractC75429h get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                ShortVideoContext shortVideoContext = this.f165559a.f165551a.f164812g;
                C89219l.m154716b(shortVideoContext, "");
                return new C75421b(shortVideoContext, new C73726a(fVar));
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ge$m$j */
        public static final class C73721j extends AbstractC21603p<AbstractC84012d> {

            /* renamed from: a */
            final /* synthetic */ C73711m f165557a;

            static {
                Covode.recordClassIndex(86459);
            }

            /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ge$m$j$a */
            static final class C73722a extends AbstractC89220m implements AbstractC89171a<C83976c.C83977a> {

                /* renamed from: a */
                final /* synthetic */ C73721j f165558a;

                static {
                    Covode.recordClassIndex(86460);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C73722a(C73721j jVar) {
                    super(0);
                    this.f165558a = jVar;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C83976c.C83977a invoke() {
                    return new C83976c.C83977a(this.f165558a.f165557a.f165551a.f164823r, this.f165558a.f165557a.f165551a.f164824s, this.f165558a.f165557a.f165551a.f164820o, this.f165558a.f165557a.f165551a.f164819n, !this.f165558a.f165557a.f165551a.f164830y);
                }
            }

            public C73721j(C73711m mVar) {
                this.f165557a = mVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final AbstractC84012d get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                C71922a aVar = this.f165557a.f165551a.f164825t;
                C89219l.m154716b(aVar, "");
                return new C83984d(fVar, aVar, new C73722a(this));
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ge$m$a */
        public static final class C73712a extends AbstractC21603p<VideoRecordNewActivity> {

            /* renamed from: a */
            final /* synthetic */ C73711m f165552a;

            static {
                Covode.recordClassIndex(86450);
            }

            public C73712a(C73711m mVar) {
                this.f165552a = mVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final VideoRecordNewActivity get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return this.f165552a.f165551a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ge$m$f */
        public static final class C73717f extends AbstractC21603p<ShortVideoContext> {

            /* renamed from: a */
            final /* synthetic */ C73711m f165553a;

            static {
                Covode.recordClassIndex(86455);
            }

            public C73717f(C73711m mVar) {
                this.f165553a = mVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final ShortVideoContext get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return this.f165553a.f165551a.f164812g;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ge$m$g */
        public static final class C73718g extends AbstractC21603p<ActivityC33402b> {

            /* renamed from: a */
            final /* synthetic */ C73711m f165554a;

            static {
                Covode.recordClassIndex(86456);
            }

            public C73718g(C73711m mVar) {
                this.f165554a = mVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final ActivityC33402b get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return this.f165554a.f165551a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ge$m$h */
        public static final class C73719h extends AbstractC21603p<ApiCenter> {

            /* renamed from: a */
            final /* synthetic */ C73711m f165555a;

            static {
                Covode.recordClassIndex(86457);
            }

            public C73719h(C73711m mVar) {
                this.f165555a = mVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final ApiCenter get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return ApiCenter.C2545a.m7450a(this.f165555a.f165551a);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ge$m$i */
        public static final class C73720i extends AbstractC21603p<AbstractC1204m> {

            /* renamed from: a */
            final /* synthetic */ C73711m f165556a;

            static {
                Covode.recordClassIndex(86458);
            }

            public C73720i(C73711m mVar) {
                this.f165556a = mVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final AbstractC1204m get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return this.f165556a.f165551a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ge$m$l */
        public static final class C73724l extends AbstractC21603p<AbstractC75461d> {
            static {
                Covode.recordClassIndex(86462);
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final AbstractC75461d get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return C33449c.f79502a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ge$m$b */
        public static final class C73713b extends AbstractC21603p<AbstractC75361b> {
            static {
                Covode.recordClassIndex(86451);
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final AbstractC75361b get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return new C75363c(fVar);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ge$m$k */
        public static final class C73723k extends AbstractC21603p<C73592c> {
            static {
                Covode.recordClassIndex(86461);
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final C73592c get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return new C73592c();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ge$m$n */
        static final class C73727n extends AbstractC89220m implements AbstractC89172b<EffectPlatformBuilder, C89391z> {

            /* renamed from: a */
            public static final C73727n f165561a = new C73727n();

            static {
                Covode.recordClassIndex(86465);
            }

            C73727n() {
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

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ge$m$c */
        public static final class C73714c extends AbstractC21603p<AbstractC84398d> {
            static {
                Covode.recordClassIndex(86452);
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final AbstractC84398d get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                Application application = C63247i.f143610a;
                C89219l.m154716b(application, "");
                return C46404c.m89554a(application, C73727n.f165561a);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ge$m$d */
        public static final class C73715d extends AbstractC21603p<StickerPreferences> {
            static {
                Covode.recordClassIndex(86453);
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
                throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.C73698ge.C73711m.C73715d.get(com.bytedance.o.f):java.lang.Object");
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ge$m$e */
        public static final class C73716e extends AbstractC21603p<AbstractC75550j> {
            static {
                Covode.recordClassIndex(86454);
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
            C89219l.m154716b(nVar2.mo35260a(VideoRecordNewActivity.class, (String) null, (AbstractC21603p) new C73712a(this)), "");
            C89219l.m154716b(nVar2.mo35260a(ShortVideoContext.class, (String) null, (AbstractC21603p) new C73717f(this)), "");
            C89219l.m154716b(nVar2.mo35260a(ActivityC33402b.class, (String) null, (AbstractC21603p) new C73718g(this)), "");
            C89219l.m154716b(nVar2.mo35260a(ApiCenter.class, (String) null, (AbstractC21603p) new C73719h(this)), "");
            C89219l.m154716b(nVar2.mo35260a(AbstractC1204m.class, (String) null, (AbstractC21603p) new C73720i(this)), "");
            C89219l.m154716b(nVar2.mo35260a(AbstractC84012d.class, (String) null, (AbstractC21603p) new C73721j(this)), "");
            C89219l.m154716b(nVar2.mo35260a(C73592c.class, (String) null, (AbstractC21603p) new C73723k()), "");
            C89219l.m154716b(nVar2.mo35260a(AbstractC75461d.class, (String) null, (AbstractC21603p) new C73724l()), "");
            C89219l.m154716b(nVar2.mo35260a(AbstractC75429h.class, (String) null, (AbstractC21603p) new C73725m(this)), "");
            C89219l.m154716b(nVar2.mo35260a(AbstractC75361b.class, (String) null, (AbstractC21603p) new C73713b()), "");
            C89219l.m154716b(nVar2.mo35260a(AbstractC84398d.class, (String) null, (AbstractC21603p) new C73714c()), "");
            C89219l.m154716b(nVar2.mo35260a(StickerPreferences.class, (String) null, (AbstractC21603p) new C73715d()), "");
            C89219l.m154716b(nVar2.mo35260a(AbstractC75550j.class, (String) null, (AbstractC21603p) new C73716e()), "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ge$a */
    public static final class C73699a extends AbstractC21603p<C83950a> {

        /* renamed from: a */
        final /* synthetic */ C2553d f165537a;

        static {
            Covode.recordClassIndex(86437);
        }

        public C73699a(C2553d dVar) {
            this.f165537a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C83950a get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C83950a(fVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ge$b */
    public static final class C73700b extends AbstractC21603p<C73390g> {

        /* renamed from: a */
        final /* synthetic */ C2553d f165538a;

        static {
            Covode.recordClassIndex(86438);
        }

        public C73700b(C2553d dVar) {
            this.f165538a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C73390g get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C73390g(fVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ge$c */
    public static final class C73701c extends AbstractC21603p<C73360ad> {

        /* renamed from: a */
        final /* synthetic */ C2553d f165539a;

        static {
            Covode.recordClassIndex(86439);
        }

        public C73701c(C2553d dVar) {
            this.f165539a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C73360ad get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return C73698ge.m129783a(fVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ge$d */
    public static final class C73702d extends AbstractC21603p<C14243a> {

        /* renamed from: a */
        final /* synthetic */ C2553d f165540a;

        static {
            Covode.recordClassIndex(86440);
        }

        public C73702d(C2553d dVar) {
            this.f165540a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C14243a get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C14243a(fVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ge$e */
    public static final class C73703e extends AbstractC21603p<C14117i> {

        /* renamed from: a */
        final /* synthetic */ C2553d f165541a;

        static {
            Covode.recordClassIndex(86441);
        }

        public C73703e(C2553d dVar) {
            this.f165541a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C14117i get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return C69857a.m123427a(fVar, true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ge$f */
    public static final class C73704f extends AbstractC21603p<C84025h> {

        /* renamed from: a */
        final /* synthetic */ C2553d f165542a;

        static {
            Covode.recordClassIndex(86442);
        }

        public C73704f(C2553d dVar) {
            this.f165542a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C84025h get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            C63244g.m114602a().mo73295w();
            C89219l.m154716b("default", "");
            return C75404l.m132241a("default", fVar, C73728n.f165562a, null, null, null, 56);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ge$g */
    public static final class C73705g extends AbstractC21603p<C73392h> {

        /* renamed from: a */
        final /* synthetic */ C2553d f165543a;

        static {
            Covode.recordClassIndex(86443);
        }

        public C73705g(C2553d dVar) {
            this.f165543a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C73392h get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C73392h(fVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ge$h */
    public static final class C73706h extends AbstractC21603p<C73412j> {

        /* renamed from: a */
        final /* synthetic */ C2553d f165544a;

        static {
            Covode.recordClassIndex(86444);
        }

        public C73706h(C2553d dVar) {
            this.f165544a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C73412j get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C73412j(fVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ge$i */
    public static final class C73707i extends AbstractC21603p<C73378e> {

        /* renamed from: a */
        final /* synthetic */ C2553d f165545a;

        static {
            Covode.recordClassIndex(86445);
        }

        public C73707i(C2553d dVar) {
            this.f165545a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C73378e get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C73378e(fVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ge$l */
    static final class C73710l extends AbstractC89220m implements AbstractC89172b<C2554e, C89391z> {

        /* renamed from: a */
        public static final C73710l f165550a = new C73710l();

        static {
            Covode.recordClassIndex(86448);
        }

        C73710l() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C2554e eVar) {
            C2554e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            eVar2.f7721a = C68093f.m120394a();
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ge$n */
    static final class C73728n extends AbstractC89220m implements AbstractC89172b<AbstractC14343f.C14344a, C89391z> {

        /* renamed from: a */
        public static final C73728n f165562a = new C73728n();

        static {
            Covode.recordClassIndex(86466);
        }

        C73728n() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC14343f.C14344a aVar) {
            AbstractC14343f.C14344a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            aVar2.f34750b = C737291.f165563a;
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ge$j */
    public static final class C73708j extends AbstractC21603p<C73438r> {

        /* renamed from: a */
        final /* synthetic */ C2553d f165546a;

        /* renamed from: b */
        final /* synthetic */ VideoRecordNewActivity f165547b;

        static {
            Covode.recordClassIndex(86446);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C73438r get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C73438r(fVar, this.f165547b.f164812g.f155817b, this.f165547b.f164812g.f155830o);
        }

        public C73708j(C2553d dVar, VideoRecordNewActivity videoRecordNewActivity) {
            this.f165546a = dVar;
            this.f165547b = videoRecordNewActivity;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ge$k */
    public static final class C73709k extends AbstractC21603p<C74228n> {

        /* renamed from: a */
        final /* synthetic */ C2553d f165548a;

        /* renamed from: b */
        final /* synthetic */ VideoRecordNewActivity f165549b;

        static {
            Covode.recordClassIndex(86447);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C74228n get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            ShortVideoContext shortVideoContext = this.f165549b.f164812g;
            C89219l.m154716b(shortVideoContext, "");
            return C74217i.m130483a(fVar, shortVideoContext);
        }

        public C73709k(C2553d dVar, VideoRecordNewActivity videoRecordNewActivity) {
            this.f165548a = dVar;
            this.f165549b = videoRecordNewActivity;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.ui.ge$o */
    public static final class C73730o extends AbstractC89220m implements AbstractC89172b<C14223a, C89391z> {

        /* renamed from: a */
        public static final C73730o f165564a = new C73730o();

        static {
            Covode.recordClassIndex(86468);
        }

        C73730o() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C14223a aVar) {
            C14223a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            boolean z = true;
            if (!C16048b.m29633a().mo25421a(true, "disable_use_last_used_filter", false) || C63244g.m114602a().mo73255A().mo93901a()) {
                z = false;
            }
            aVar2.f34510a = z;
            return C89391z.f203057a;
        }
    }

    /* renamed from: a */
    public static final C73360ad m129783a(C21582f fVar) {
        AbstractC50706n a;
        AbstractC14220j eVar;
        C89219l.m154721d(fVar, "");
        C73731p pVar = C73731p.f165565a;
        C73732q qVar = C73732q.f165566a;
        if (!C50647b.m94905a()) {
            a = C50798l.C50799a.m95127a("VideoRecordNewActivity");
        } else {
            a = C50808r.C50809a.m95157a("VideoRecordNewActivity");
        }
        if (!C50647b.m94905a()) {
            eVar = new C71877d(C71885j.m126949a());
        } else {
            eVar = new C71878e(C71885j.m126950b());
        }
        return new C73360ad(fVar, (ActivityC0218d) fVar.mo35248a(ActivityC0218d.class, (String) null), new C14225c.C14226a(C63244g.m114602a().mo73290r().mo86006d(), a, eVar), pVar, qVar, C73730o.f165564a);
    }

    /* renamed from: a */
    public static final JSONObject m129784a(ActivityC0945e eVar) {
        C89219l.m154721d(eVar, "");
        AbstractC1174ac a = C1181ae.m3881a(eVar, (C1175ad.AbstractC1177b) null).mo3983a(ShortVideoContextViewModel.class);
        C89219l.m154716b(a, "");
        ShortVideoContextViewModel shortVideoContextViewModel = (ShortVideoContextViewModel) a;
        ShortVideoContext shortVideoContext = shortVideoContextViewModel.f155842a;
        if (shortVideoContext == null) {
            JSONObject a2 = new C69840ar().mo110191a();
            C89219l.m154716b(a2, "");
            return a2;
        }
        String str = "1";
        C69840ar a3 = new C69840ar().mo110189a("creation_id", shortVideoContext.f155830o).mo110189a("shoot_way", shortVideoContext.f155831p).mo110189a("route", str);
        if (!shortVideoContextViewModel.mo110049a()) {
            str = "0";
        }
        C69840ar a4 = a3.mo110189a("is_photo", str).mo110189a("position", "shoot_page");
        C89219l.m154716b(a4, "");
        JSONObject a5 = a4.mo110191a();
        C89219l.m154716b(a5, "");
        return a5;
    }
}
