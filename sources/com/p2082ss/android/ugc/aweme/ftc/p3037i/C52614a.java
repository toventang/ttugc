package com.p2082ss.android.ugc.aweme.ftc.p3037i;

import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.als.AlsLogicContainer;
import com.bytedance.als.ApiCenter;
import com.bytedance.als.dsl.C2551b;
import com.bytedance.als.dsl.C2552c;
import com.bytedance.als.dsl.C2553d;
import com.bytedance.als.dsl.C2556g;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.filter.p942a.AbstractC14213c;
import com.bytedance.creativex.recorder.filter.p944c.C14237a;
import com.bytedance.creativex.recorder.filter.panel.C14277a;
import com.bytedance.creativex.recorder.filter.panel.FilterPanelViewModel;
import com.bytedance.creativex.recorder.gesture.C14325c;
import com.bytedance.creativex.recorder.gesture.api.AbstractC14315b;
import com.bytedance.creativex.recorder.p938a.C14151k;
import com.bytedance.creativex.recorder.p938a.p939a.AbstractC14103e;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.sticker.panel.C14395g;
import com.bytedance.creativex.recorder.sticker.panel.RecordStickerPanelViewModel;
import com.bytedance.p1559o.AbstractC21603p;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.C21597n;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.scene.ktx.C22228c;
import com.p2082ss.android.ugc.aweme.beauty.C34809f;
import com.p2082ss.android.ugc.aweme.ftc.C51913c;
import com.p2082ss.android.ugc.aweme.ftc.countdown.AbstractC52454a;
import com.p2082ss.android.ugc.aweme.ftc.countdown.C52455b;
import com.p2082ss.android.ugc.aweme.ftc.p3026a.AbstractC51821a;
import com.p2082ss.android.ugc.aweme.ftc.p3026a.C51822b;
import com.p2082ss.android.ugc.aweme.ftc.p3027b.AbstractC51869a;
import com.p2082ss.android.ugc.aweme.ftc.p3027b.C51877f;
import com.p2082ss.android.ugc.aweme.ftc.p3032d.AbstractC52502a;
import com.p2082ss.android.ugc.aweme.ftc.p3032d.C52503b;
import com.p2082ss.android.ugc.aweme.ftc.p3033e.AbstractC52527a;
import com.p2082ss.android.ugc.aweme.ftc.p3033e.C52528b;
import com.p2082ss.android.ugc.aweme.ftc.p3034f.AbstractC52535a;
import com.p2082ss.android.ugc.aweme.ftc.p3034f.C52536b;
import com.p2082ss.android.ugc.aweme.ftc.p3036h.AbstractC52568a;
import com.p2082ss.android.ugc.aweme.ftc.p3036h.C52570b;
import com.p2082ss.android.ugc.aweme.ftc.p3038j.C52640a;
import com.p2082ss.android.ugc.aweme.ftc.p3038j.EnumC52642b;
import com.p2082ss.android.ugc.aweme.ftc.p3039k.AbstractC52653d;
import com.p2082ss.android.ugc.aweme.ftc.p3039k.C52644a;
import com.p2082ss.android.ugc.aweme.ftc.p3040l.C52655a;
import com.p2082ss.android.ugc.aweme.ftc.p3040l.C52712c;
import com.p2082ss.android.ugc.aweme.ftc.p3040l.p3041a.AbstractC52688c;
import com.p2082ss.android.ugc.aweme.ftc.p3040l.p3041a.C52689d;
import com.p2082ss.android.ugc.aweme.p2306ah.C33450d;
import com.p2082ss.android.ugc.aweme.p2306ah.C33458f;
import com.p2082ss.android.ugc.aweme.shortvideo.C71811eo;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.p3835h.AbstractC71864a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3835h.C71866b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3836i.C71882h;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.AbstractC73415k;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.C73357ab;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.C73416l;
import com.p2082ss.android.ugc.aweme.sticker.C75393k;
import com.p2082ss.android.ugc.aweme.sticker.favorite.AbstractC75361b;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75574j;
import com.p2082ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences;
import com.p2082ss.android.ugc.aweme.sticker.types.lock.AbstractC76085a;
import com.p2082ss.android.ugc.aweme.sticker.types.lock.C76086b;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.main.C76177c;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4016b.C76245b;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76115b;
import com.p2082ss.android.ugc.aweme.utils.C80573ig;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.gamora.PageFactory;
import com.p2082ss.android.ugc.gamora.recorder.p4293a.C83398a;
import com.p2082ss.android.ugc.gamora.recorder.p4298e.AbstractC83634a;
import com.p2082ss.android.ugc.gamora.recorder.p4298e.C83635b;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.tools.view.style.C84984j;
import com.p2082ss.android.ugc.trill.R;
import java.util.ArrayList;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ftc.i.a */
public final class C52614a implements PageFactory {
    static {
        Covode.recordClassIndex(62010);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.i.a$r */
    static final class C52632r extends AbstractC89220m implements AbstractC89172b<C21597n, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22186b f121162a;

        /* renamed from: b */
        final /* synthetic */ C51913c f121163b;

        static {
            Covode.recordClassIndex(62028);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52632r(AbstractC22186b bVar, C51913c cVar) {
            super(1);
            this.f121162a = bVar;
            this.f121163b = cVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.i.a$r$d */
        public static final class C52636d extends AbstractC21603p<AbstractC76085a> {
            static {
                Covode.recordClassIndex(62032);
            }

            /* renamed from: com.ss.android.ugc.aweme.ftc.i.a$r$d$a */
            public static final class C52637a implements AbstractC76085a {

                /* renamed from: a */
                final /* synthetic */ C21582f f121166a;

                /* renamed from: b */
                private final C75574j f121167b;

                static {
                    Covode.recordClassIndex(62033);
                }

                @Override // com.p2082ss.android.ugc.aweme.sticker.types.lock.AbstractC76085a
                public final boolean isLockStickerEnable() {
                    return this.f121167b.f169847i;
                }

                @Override // com.p2082ss.android.ugc.aweme.sticker.types.lock.AbstractC76085a
                public final boolean reallyLockedSticker(Effect effect) {
                    return C76086b.m133425b(effect);
                }

                C52637a(C21582f fVar) {
                    this.f121166a = fVar;
                    this.f121167b = (C75574j) fVar.mo35248a(C75574j.class, (String) null);
                }
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final AbstractC76085a get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return new C52637a(fVar);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.i.a$r$a */
        public static final class C52633a extends AbstractC21603p<C51913c> {

            /* renamed from: a */
            final /* synthetic */ C52632r f121164a;

            static {
                Covode.recordClassIndex(62029);
            }

            public C52633a(C52632r rVar) {
                this.f121164a = rVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final C51913c get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return this.f121164a.f121163b;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.i.a$r$b */
        public static final class C52634b extends AbstractC21603p<ApiCenter> {

            /* renamed from: a */
            final /* synthetic */ C52632r f121165a;

            static {
                Covode.recordClassIndex(62030);
            }

            public C52634b(C52632r rVar) {
                this.f121165a = rVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final ApiCenter get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return ApiCenter.C2545a.m7450a(C22228c.m41832b(this.f121165a.f121162a));
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.i.a$r$c */
        public static final class C52635c extends AbstractC21603p<C75574j> {
            static {
                Covode.recordClassIndex(62031);
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final C75574j get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return C33458f.m68566a((ActivityC0945e) fVar.mo35249a(ActivityC0945e.class, (String) null), (AbstractC14177d) fVar.mo35249a(AbstractC14177d.class, (String) null), false, false, 28);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ftc.i.a$r$e */
        public static final class C52638e extends AbstractC21603p<AbstractC76115b<C84984j, Fragment>> {
            static {
                Covode.recordClassIndex(62034);
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final AbstractC76115b<C84984j, Fragment> get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                C76177c cVar = new C76177c((byte) 0);
                cVar.mo119931a("sticker_category:favorite", new C76245b((AbstractC1204m) fVar.mo35248a(AbstractC1204m.class, (String) null), (AbstractC75361b) fVar.mo35248a(AbstractC75361b.class, (String) null), ((AbstractC84089j) fVar.mo35248a(AbstractC84089j.class, (String) null)).mo23167t(), (StickerPreferences) fVar.mo35248a(StickerPreferences.class, (String) null)));
                return cVar;
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C21597n nVar) {
            C21597n nVar2 = nVar;
            C89219l.m154721d(nVar2, "");
            C89219l.m154716b(nVar2.mo35260a(C51913c.class, (String) null, (AbstractC21603p) new C52633a(this)), "");
            C89219l.m154716b(nVar2.mo35260a(ApiCenter.class, (String) null, (AbstractC21603p) new C52634b(this)), "");
            C89219l.m154716b(nVar2.mo35260a(C75574j.class, (String) null, (AbstractC21603p) new C52635c()), "");
            C89219l.m154716b(nVar2.mo35260a(AbstractC76085a.class, (String) null, (AbstractC21603p) new C52636d()), "");
            C89219l.m154716b(nVar2.mo35260a(AbstractC76115b.class, (String) null, (AbstractC21603p) new C52638e()), "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.i.a$a */
    public static final class C52615a extends AbstractC21603p<C71866b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f121130a;

        static {
            Covode.recordClassIndex(62011);
        }

        public C52615a(C2553d dVar) {
            this.f121130a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C71866b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C71866b(fVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.i.a$b */
    public static final class C52616b extends AbstractC21603p<C73416l> {

        /* renamed from: a */
        final /* synthetic */ C2553d f121131a;

        static {
            Covode.recordClassIndex(62012);
        }

        public C52616b(C2553d dVar) {
            this.f121131a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C73416l get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C73416l(fVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.i.a$c */
    public static final class C52617c extends AbstractC21603p<C14325c> {

        /* renamed from: a */
        final /* synthetic */ C2553d f121132a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f121133b;

        static {
            Covode.recordClassIndex(62013);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C14325c get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C14325c(this.f121133b, fVar, R.id.b_e);
        }

        public C52617c(C2553d dVar, AbstractC22186b bVar) {
            this.f121132a = dVar;
            this.f121133b = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.i.a$d */
    public static final class C52618d extends AbstractC21603p<C83635b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f121134a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f121135b;

        static {
            Covode.recordClassIndex(62014);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C83635b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C83635b(this.f121135b, fVar);
        }

        public C52618d(C2553d dVar, AbstractC22186b bVar) {
            this.f121134a = dVar;
            this.f121135b = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.i.a$f */
    public static final class C52620f extends AbstractC21603p<C14277a> {

        /* renamed from: a */
        final /* synthetic */ C2553d f121138a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f121139b;

        static {
            Covode.recordClassIndex(62016);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C14277a get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return C33450d.m68560a(this.f121139b, fVar);
        }

        public C52620f(C2553d dVar, AbstractC22186b bVar) {
            this.f121138a = dVar;
            this.f121139b = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.i.a$g */
    public static final class C52621g extends AbstractC21603p<C14237a> {

        /* renamed from: a */
        final /* synthetic */ C2553d f121140a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f121141b;

        static {
            Covode.recordClassIndex(62017);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C14237a get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C14237a(this.f121141b, fVar);
        }

        public C52621g(C2553d dVar, AbstractC22186b bVar) {
            this.f121140a = dVar;
            this.f121141b = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.i.a$h */
    public static final class C52622h extends AbstractC21603p<C52536b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f121142a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f121143b;

        static {
            Covode.recordClassIndex(62018);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C52536b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C52536b(this.f121143b, fVar);
        }

        public C52622h(C2553d dVar, AbstractC22186b bVar) {
            this.f121142a = dVar;
            this.f121143b = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.i.a$i */
    public static final class C52623i extends AbstractC21603p<C52455b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f121144a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f121145b;

        static {
            Covode.recordClassIndex(62019);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C52455b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C52455b(this.f121145b, fVar);
        }

        public C52623i(C2553d dVar, AbstractC22186b bVar) {
            this.f121144a = dVar;
            this.f121145b = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.i.a$j */
    public static final class C52624j extends AbstractC21603p<C52528b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f121146a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f121147b;

        static {
            Covode.recordClassIndex(62020);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C52528b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C52528b(this.f121147b, fVar);
        }

        public C52624j(C2553d dVar, AbstractC22186b bVar) {
            this.f121146a = dVar;
            this.f121147b = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.i.a$k */
    public static final class C52625k extends AbstractC21603p<C14151k> {

        /* renamed from: a */
        final /* synthetic */ C2553d f121148a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f121149b;

        static {
            Covode.recordClassIndex(62021);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C14151k get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return C83398a.m143790a(this.f121149b, fVar);
        }

        public C52625k(C2553d dVar, AbstractC22186b bVar) {
            this.f121148a = dVar;
            this.f121149b = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.i.a$l */
    public static final class C52626l extends AbstractC21603p<C52503b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f121150a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f121151b;

        static {
            Covode.recordClassIndex(62022);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C52503b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C52503b(this.f121151b, fVar);
        }

        public C52626l(C2553d dVar, AbstractC22186b bVar) {
            this.f121150a = dVar;
            this.f121151b = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.i.a$m */
    public static final class C52627m extends AbstractC21603p<C51877f> {

        /* renamed from: a */
        final /* synthetic */ C2553d f121152a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f121153b;

        static {
            Covode.recordClassIndex(62023);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C51877f get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C51877f(this.f121153b, fVar);
        }

        public C52627m(C2553d dVar, AbstractC22186b bVar) {
            this.f121152a = dVar;
            this.f121153b = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.i.a$o */
    public static final class C52629o extends AbstractC21603p<C52644a> {

        /* renamed from: a */
        final /* synthetic */ C2553d f121156a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f121157b;

        static {
            Covode.recordClassIndex(62025);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C52644a get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C52644a(this.f121157b, fVar);
        }

        public C52629o(C2553d dVar, AbstractC22186b bVar) {
            this.f121156a = dVar;
            this.f121157b = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.i.a$p */
    public static final class C52630p extends AbstractC21603p<C14395g> {

        /* renamed from: a */
        final /* synthetic */ C2553d f121158a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f121159b;

        static {
            Covode.recordClassIndex(62026);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C14395g get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return C75393k.m132222a(fVar, this.f121159b);
        }

        public C52630p(C2553d dVar, AbstractC22186b bVar) {
            this.f121158a = dVar;
            this.f121159b = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.i.a$q */
    public static final class C52631q extends AbstractC21603p<C52570b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f121160a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f121161b;

        static {
            Covode.recordClassIndex(62027);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C52570b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C52570b(fVar, this.f121161b);
        }

        public C52631q(C2553d dVar, AbstractC22186b bVar) {
            this.f121160a = dVar;
            this.f121161b = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.i.a$e */
    public static final class C52619e extends AbstractC21603p<C51822b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f121136a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f121137b;

        static {
            Covode.recordClassIndex(62015);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C51822b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            AbstractC22186b bVar = this.f121137b;
            C89219l.m154721d(fVar, "");
            ArrayList arrayList = new ArrayList();
            C89219l.m154716b(fVar.mo35247a(ShortVideoContext.class), "");
            arrayList.add(new C52640a(C80573ig.m139668a(EnumC52642b.RECORD_COMBINE_60.getNameResId()), C80573ig.m139668a(EnumC52642b.RECORD_COMBINE_60.getTagResId()), "video_60", false));
            arrayList.add(new C52640a(C80573ig.m139668a(EnumC52642b.RECORD_COMBINE_15.getNameResId()), C80573ig.m139668a(EnumC52642b.RECORD_COMBINE_15.getTagResId()), "video_15", true));
            return new C51822b(bVar, fVar, arrayList);
        }

        public C52619e(C2553d dVar, AbstractC22186b bVar) {
            this.f121136a = dVar;
            this.f121137b = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.i.a$n */
    public static final class C52628n extends AbstractC21603p<C52689d> {

        /* renamed from: a */
        final /* synthetic */ C2553d f121154a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f121155b;

        static {
            Covode.recordClassIndex(62024);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C52689d get(C21582f fVar) {
            boolean z;
            C89219l.m154721d(fVar, "");
            C52655a aVar = new C52655a();
            AbstractC22186b bVar = this.f121155b;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(fVar, "");
            Object a = fVar.mo35249a(AbstractC14177d.class, (String) null);
            C89219l.m154716b(a, "");
            aVar.f121202b = (AbstractC14177d) a;
            Object a2 = fVar.mo35249a(AbstractC14193m.class, (String) null);
            C89219l.m154716b(a2, "");
            aVar.f121203c = (AbstractC14193m) a2;
            Object a3 = fVar.mo35249a(ShortVideoContext.class, (String) null);
            C89219l.m154716b(a3, "");
            aVar.f121204d = (ShortVideoContext) a3;
            Object a4 = fVar.mo35249a(ActivityC0945e.class, (String) null);
            C89219l.m154716b(a4, "");
            aVar.f121205e = (ActivityC0945e) a4;
            ActivityC0945e eVar = aVar.f121205e;
            if (eVar == null) {
                C89219l.m154710a("activity");
            }
            aVar.f121206f = C71811eo.m126782a(eVar);
            C52712c cVar = new C52712c(fVar, aVar.f121206f);
            boolean a5 = C34809f.m71120a();
            C71882h hVar = new C71882h(new C73357ab());
            C52655a.C52658b bVar2 = aVar.f121201a;
            if (aVar.f121204d == null) {
                C89219l.m154710a("shortVideoContext");
            }
            if (hVar.mo113534a() == 1) {
                z = true;
            } else {
                z = false;
            }
            bVar2.f121212a = z;
            C52655a.C52658b bVar3 = aVar.f121201a;
            AbstractC14177d dVar = aVar.f121202b;
            if (dVar == null) {
                C89219l.m154710a("cameraApiComponent");
            }
            bVar3.f121213b = dVar.mo22792a(aVar.f121201a.f121212a, false);
            C52655a.C52658b bVar4 = aVar.f121201a;
            ShortVideoContext shortVideoContext = aVar.f121204d;
            if (shortVideoContext == null) {
                C89219l.m154710a("shortVideoContext");
            }
            bVar4.f121214c = shortVideoContext.f155817b.mo109888a();
            C52655a.C52656a aVar2 = new C52655a.C52656a();
            aVar2.mo88364a(cVar.mo88390a(), C52655a.C52656a.C52657a.f121211a).mo88364a(cVar.mo88391b(), new C52655a.C52659c(aVar)).mo88364a(cVar.mo88392c(), new C52655a.C52660d(a5)).mo88364a(cVar.mo88393d(), C52655a.C52656a.C52657a.f121211a).mo88364a(cVar.mo88394e(), new C52655a.C52661e(a5)).mo88364a(cVar.mo88395f(), new C52655a.C52662f(aVar)).mo88364a(cVar.mo88398i(), new C52655a.C52663g(aVar));
            boolean z2 = aVar.f121206f;
            try {
                Class<?> cls = Class.forName("com.ss.android.ugc.toolbar.IsModeo");
                cls.getDeclaredMethod("addIcons", C52655a.C52656a.class, Boolean.TYPE).invoke(cls.newInstance(), aVar2, Boolean.valueOf(z2));
            } catch (Exception e) {
                e.printStackTrace();
            }
            AbstractC14193m mVar = aVar.f121203c;
            if (mVar == null) {
                C89219l.m154710a("recordControlApi");
            }
            ShortVideoContext shortVideoContext2 = aVar.f121204d;
            if (shortVideoContext2 == null) {
                C89219l.m154710a("shortVideoContext");
            }
            mVar.mo22887a(shortVideoContext2.f155817b.f155664t, true);
            AbstractC14177d dVar2 = aVar.f121202b;
            if (dVar2 == null) {
                C89219l.m154710a("cameraApiComponent");
            }
            if (dVar2.mo22759M()) {
                AbstractC14177d dVar3 = aVar.f121202b;
                if (dVar3 == null) {
                    C89219l.m154710a("cameraApiComponent");
                }
                dVar3.mo22806b(5);
            }
            return new C52689d(bVar, fVar, aVar2.f121210a, cVar.mo88397h(), new C52655a.C52664h(aVar, bVar, fVar, cVar), C52655a.m97531a());
        }

        public C52628n(C2553d dVar, AbstractC22186b bVar) {
            this.f121154a = dVar;
            this.f121155b = bVar;
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.PageFactory
    /* renamed from: a */
    public final void mo88345a(AbstractC22186b bVar) {
        C89219l.m154721d(bVar, "");
        C2556g.m7472a(bVar, new C52632r(bVar, (C51913c) bVar));
        C2551b bVar2 = new C2551b(C2552c.m7462a(bVar));
        C2553d dVar = new C2553d();
        AlsLogicContainer alsLogicContainer = bVar2.f7720a;
        alsLogicContainer.f7696d.mo35260a(C14325c.class, (String) null, (AbstractC21603p) new C52617c(dVar, bVar));
        alsLogicContainer.mo7005a(AbstractC14315b.class, C14325c.class);
        C2553d dVar2 = new C2553d();
        AlsLogicContainer alsLogicContainer2 = bVar2.f7720a;
        alsLogicContainer2.f7696d.mo35260a(C52528b.class, (String) null, (AbstractC21603p) new C52624j(dVar2, bVar));
        alsLogicContainer2.mo7005a(AbstractC52527a.class, C52528b.class);
        C2553d dVar3 = new C2553d();
        AlsLogicContainer alsLogicContainer3 = bVar2.f7720a;
        alsLogicContainer3.f7696d.mo35260a(C14151k.class, (String) null, (AbstractC21603p) new C52625k(dVar3, bVar));
        alsLogicContainer3.mo7005a(AbstractC14103e.class, C14151k.class);
        C2553d dVar4 = new C2553d();
        AlsLogicContainer alsLogicContainer4 = bVar2.f7720a;
        alsLogicContainer4.f7696d.mo35260a(C52503b.class, (String) null, (AbstractC21603p) new C52626l(dVar4, bVar));
        alsLogicContainer4.mo7005a(AbstractC52502a.class, C52503b.class);
        C2553d dVar5 = new C2553d();
        AlsLogicContainer alsLogicContainer5 = bVar2.f7720a;
        alsLogicContainer5.f7696d.mo35260a(C51877f.class, (String) null, (AbstractC21603p) new C52627m(dVar5, bVar));
        alsLogicContainer5.mo7005a(AbstractC51869a.class, C51877f.class);
        C2553d dVar6 = new C2553d();
        AlsLogicContainer alsLogicContainer6 = bVar2.f7720a;
        alsLogicContainer6.f7696d.mo35260a(C52689d.class, (String) null, (AbstractC21603p) new C52628n(dVar6, bVar));
        alsLogicContainer6.mo7005a(AbstractC52688c.class, C52689d.class);
        C2553d dVar7 = new C2553d();
        AlsLogicContainer alsLogicContainer7 = bVar2.f7720a;
        alsLogicContainer7.f7696d.mo35260a(C52644a.class, (String) null, (AbstractC21603p) new C52629o(dVar7, bVar));
        alsLogicContainer7.mo7005a(AbstractC52653d.class, C52644a.class);
        C2553d dVar8 = new C2553d();
        AlsLogicContainer alsLogicContainer8 = bVar2.f7720a;
        alsLogicContainer8.f7696d.mo35260a(C14395g.class, (String) null, (AbstractC21603p) new C52630p(dVar8, bVar));
        alsLogicContainer8.mo7005a(RecordStickerPanelViewModel.class, C14395g.class);
        C2553d dVar9 = new C2553d();
        AlsLogicContainer alsLogicContainer9 = bVar2.f7720a;
        alsLogicContainer9.f7696d.mo35260a(C52570b.class, (String) null, (AbstractC21603p) new C52631q(dVar9, bVar));
        alsLogicContainer9.mo7005a(AbstractC52568a.class, C52570b.class);
        C2553d dVar10 = new C2553d();
        AlsLogicContainer alsLogicContainer10 = bVar2.f7720a;
        alsLogicContainer10.f7696d.mo35260a(C83635b.class, (String) null, (AbstractC21603p) new C52618d(dVar10, bVar));
        alsLogicContainer10.mo7005a(AbstractC83634a.class, C83635b.class);
        C2553d dVar11 = new C2553d();
        AlsLogicContainer alsLogicContainer11 = bVar2.f7720a;
        alsLogicContainer11.f7696d.mo35260a(C51822b.class, (String) null, (AbstractC21603p) new C52619e(dVar11, bVar));
        alsLogicContainer11.mo7005a(AbstractC51821a.class, C51822b.class);
        C2553d dVar12 = new C2553d();
        AlsLogicContainer alsLogicContainer12 = bVar2.f7720a;
        alsLogicContainer12.f7696d.mo35260a(C14277a.class, (String) null, (AbstractC21603p) new C52620f(dVar12, bVar));
        alsLogicContainer12.mo7005a(FilterPanelViewModel.class, C14277a.class);
        C2553d dVar13 = new C2553d();
        AlsLogicContainer alsLogicContainer13 = bVar2.f7720a;
        alsLogicContainer13.f7696d.mo35260a(C14237a.class, (String) null, (AbstractC21603p) new C52621g(dVar13, bVar));
        alsLogicContainer13.mo7005a(AbstractC14213c.class, C14237a.class);
        C2553d dVar14 = new C2553d();
        AlsLogicContainer alsLogicContainer14 = bVar2.f7720a;
        alsLogicContainer14.f7696d.mo35260a(C52536b.class, (String) null, (AbstractC21603p) new C52622h(dVar14, bVar));
        alsLogicContainer14.mo7005a(AbstractC52535a.class, C52536b.class);
        C2553d dVar15 = new C2553d();
        AlsLogicContainer alsLogicContainer15 = bVar2.f7720a;
        alsLogicContainer15.f7696d.mo35260a(C52455b.class, (String) null, (AbstractC21603p) new C52623i(dVar15, bVar));
        alsLogicContainer15.mo7005a(AbstractC52454a.class, C52455b.class);
        C2553d dVar16 = new C2553d();
        AlsLogicContainer alsLogicContainer16 = bVar2.f7720a;
        alsLogicContainer16.f7696d.mo35260a(C71866b.class, (String) null, (AbstractC21603p) new C52615a(dVar16));
        alsLogicContainer16.mo7005a(AbstractC71864a.class, C71866b.class);
        C2553d dVar17 = new C2553d();
        AlsLogicContainer alsLogicContainer17 = bVar2.f7720a;
        alsLogicContainer17.f7696d.mo35260a(C73416l.class, (String) null, (AbstractC21603p) new C52616b(dVar17));
        alsLogicContainer17.mo7005a(AbstractC73415k.class, C73416l.class);
        bVar2.mo7031a();
    }
}
