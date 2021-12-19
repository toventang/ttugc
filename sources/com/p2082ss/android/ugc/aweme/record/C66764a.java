package com.p2082ss.android.ugc.aweme.record;

import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.als.AbstractC2547b;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.AlsLogicContainer;
import com.bytedance.als.ApiCenter;
import com.bytedance.als.dsl.C2551b;
import com.bytedance.als.dsl.C2552c;
import com.bytedance.als.dsl.C2553d;
import com.bytedance.als.dsl.C2554e;
import com.bytedance.als.dsl.C2555f;
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
import com.bytedance.creativex.recorder.sticker.panel.C14395g;
import com.bytedance.creativex.recorder.sticker.panel.RecordStickerPanelViewModel;
import com.bytedance.p1559o.AbstractC21603p;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.C21597n;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.scene.ktx.C22228c;
import com.p2082ss.android.ugc.aweme.C34359ay;
import com.p2082ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p2082ss.android.ugc.aweme.commentStickerPanel.CommentAndQuestionAndQuestionStickerPanelViewModel;
import com.p2082ss.android.ugc.aweme.experiment.C46955fu;
import com.p2082ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.p2082ss.android.ugc.aweme.p2306ah.C33450d;
import com.p2082ss.android.ugc.aweme.p2306ah.C33458f;
import com.p2082ss.android.ugc.aweme.p2443cg.AbstractC35471a;
import com.p2082ss.android.ugc.aweme.p2443cg.C35472b;
import com.p2082ss.android.ugc.aweme.p2721cx.C40801b;
import com.p2082ss.android.ugc.aweme.p2721cx.C40832d;
import com.p2082ss.android.ugc.aweme.p4244z.AbstractC81785a;
import com.p2082ss.android.ugc.aweme.p4244z.C81788d;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65365be;
import com.p2082ss.android.ugc.aweme.services.IAVServiceProxy;
import com.p2082ss.android.ugc.aweme.services.mvtemplate.MvTemplateDependentsImpl;
import com.p2082ss.android.ugc.aweme.servicimpl.C67917h;
import com.p2082ss.android.ugc.aweme.servicimpl.C67936u;
import com.p2082ss.android.ugc.aweme.servicimpl.C67943y;
import com.p2082ss.android.ugc.aweme.servicimpl.EnumC67895ad;
import com.p2082ss.android.ugc.aweme.setting.p3721i.C68093f;
import com.p2082ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.C69926ch;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.countdown.AbstractC69937a;
import com.p2082ss.android.ugc.aweme.shortvideo.countdown.C69938b;
import com.p2082ss.android.ugc.aweme.shortvideo.duet.C70659a;
import com.p2082ss.android.ugc.aweme.shortvideo.duet.C70735z;
import com.p2082ss.android.ugc.aweme.shortvideo.duet.DuetLayoutModeViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.QaUtils;
import com.p2082ss.android.ugc.aweme.shortvideo.p3806e.AbstractC70753a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3806e.C70754b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3835h.AbstractC71864a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3835h.C71866b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3848n.AbstractC72453a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3848n.C72459d;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.AbstractC73415k;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.C73416l;
import com.p2082ss.android.ugc.aweme.sticker.C75393k;
import com.p2082ss.android.ugc.aweme.sticker.data.QaStruct;
import com.p2082ss.android.ugc.aweme.sticker.favorite.AbstractC75361b;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75300d;
import com.p2082ss.android.ugc.aweme.sticker.p3965m.AbstractC75429h;
import com.p2082ss.android.ugc.aweme.sticker.p3965m.C75424c;
import com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75573i;
import com.p2082ss.android.ugc.aweme.sticker.panel.C75574j;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.repository.internals.StickerPreferences;
import com.p2082ss.android.ugc.aweme.sticker.types.lock.AbstractC76085a;
import com.p2082ss.android.ugc.aweme.sticker.types.lock.C76086b;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.main.C76177c;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.main.C76196m;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4016b.C76245b;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.search.AbstractC76329a;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.search.C76359j;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.search.TTSearchStickerViewModel;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76115b;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76125l;
import com.p2082ss.android.ugc.aweme.tools.AVApi;
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4137c.AbstractC78928a;
import com.p2082ss.android.ugc.aweme.utils.C80573ig;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.gamora.PageFactory;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.AbstractC83490a;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.C83509d;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.p4296a.AbstractC83492a;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.p4296a.C83496c;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.AbstractC83566a;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.C83591c;
import com.p2082ss.android.ugc.gamora.recorder.p4293a.C83398a;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83405a;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.C83422h;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.C83442i;
import com.p2082ss.android.ugc.gamora.recorder.p4295c.C83472b;
import com.p2082ss.android.ugc.gamora.recorder.p4297d.AbstractC83623a;
import com.p2082ss.android.ugc.gamora.recorder.p4297d.C83625c;
import com.p2082ss.android.ugc.gamora.recorder.p4298e.AbstractC83634a;
import com.p2082ss.android.ugc.gamora.recorder.p4298e.C83635b;
import com.p2082ss.android.ugc.gamora.recorder.p4300g.AbstractC83678a;
import com.p2082ss.android.ugc.gamora.recorder.p4300g.C83681c;
import com.p2082ss.android.ugc.gamora.recorder.p4302i.AbstractC83727a;
import com.p2082ss.android.ugc.gamora.recorder.p4302i.C83728b;
import com.p2082ss.android.ugc.gamora.recorder.p4303j.AbstractC83734a;
import com.p2082ss.android.ugc.gamora.recorder.p4303j.C83735b;
import com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83746a;
import com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83750d;
import com.p2082ss.android.ugc.gamora.recorder.p4304k.C83751e;
import com.p2082ss.android.ugc.gamora.recorder.p4304k.C83809g;
import com.p2082ss.android.ugc.gamora.recorder.p4304k.C83855i;
import com.p2082ss.android.ugc.gamora.recorder.p4305l.AbstractC83869f;
import com.p2082ss.android.ugc.gamora.recorder.p4305l.C83858b;
import com.p2082ss.android.ugc.gamora.recorder.p4306m.AbstractC83881a;
import com.p2082ss.android.ugc.gamora.recorder.p4306m.C83882b;
import com.p2082ss.android.ugc.gamora.recorder.p4307n.p4308a.AbstractC83912e;
import com.p2082ss.android.ugc.gamora.recorder.p4307n.p4308a.C83913f;
import com.p2082ss.android.ugc.gamora.recorder.permission.C83942a;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.gamora.recorder.sticker.support.AbstractC84102a;
import com.p2082ss.android.ugc.gamora.recorder.sticker.support.C84103b;
import com.p2082ss.android.ugc.tools.p4337b.p4338a.AbstractC84398d;
import com.p2082ss.android.ugc.tools.view.style.C84984j;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.record.a */
public final class C66764a implements PageFactory {
    static {
        Covode.recordClassIndex(78336);
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$ag */
    static final class C66772ag extends AbstractC89220m implements AbstractC89172b<C21597n, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C66764a f149989a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f149990b;

        /* renamed from: c */
        final /* synthetic */ C69926ch f149991c;

        static {
            Covode.recordClassIndex(78344);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C66772ag(C66764a aVar, AbstractC22186b bVar, C69926ch chVar) {
            super(1);
            this.f149989a = aVar;
            this.f149990b = bVar;
            this.f149991c = chVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.record.a$ag$d */
        public static final class C66776d extends AbstractC21603p<AbstractC76085a> {
            static {
                Covode.recordClassIndex(78348);
            }

            /* renamed from: com.ss.android.ugc.aweme.record.a$ag$d$a */
            public static final class C66777a implements AbstractC76085a {

                /* renamed from: a */
                final /* synthetic */ C21582f f149994a;

                /* renamed from: b */
                private final C75574j f149995b;

                static {
                    Covode.recordClassIndex(78349);
                }

                @Override // com.p2082ss.android.ugc.aweme.sticker.types.lock.AbstractC76085a
                public final boolean isLockStickerEnable() {
                    return this.f149995b.f169847i;
                }

                @Override // com.p2082ss.android.ugc.aweme.sticker.types.lock.AbstractC76085a
                public final boolean reallyLockedSticker(Effect effect) {
                    return C76086b.m133425b(effect);
                }

                C66777a(C21582f fVar) {
                    this.f149994a = fVar;
                    this.f149995b = (C75574j) fVar.mo35248a(C75574j.class, (String) null);
                }
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final AbstractC76085a get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return new C66777a(fVar);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.record.a$ag$f */
        public static final class C66780f extends AbstractC21603p<AbstractC76115b<C84984j, Fragment>> {

            /* renamed from: a */
            final /* synthetic */ C66772ag f149997a;

            static {
                Covode.recordClassIndex(78352);
            }

            /* renamed from: com.ss.android.ugc.aweme.record.a$ag$f$a */
            static final class C66781a extends AbstractC89220m implements AbstractC89171a<C89391z> {

                /* renamed from: a */
                final /* synthetic */ C21582f f149998a;

                /* renamed from: b */
                final /* synthetic */ C66780f f149999b;

                static {
                    Covode.recordClassIndex(78353);
                }

                /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                C66781a(C21582f fVar, C66780f fVar2) {
                    super(0);
                    this.f149998a = fVar;
                    this.f149999b = fVar2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ C89391z invoke() {
                    AbstractC75573i v = ((AbstractC84089j) this.f149998a.mo35249a((Type) AbstractC84089j.class, (String) null)).mo23169v();
                    if (v != null) {
                        v.mo119148l();
                    }
                    return C89391z.f203057a;
                }
            }

            public C66780f(C66772ag agVar) {
                this.f149997a = agVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final AbstractC76115b<C84984j, Fragment> get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                C76177c cVar = new C76177c((byte) 0);
                cVar.mo119931a("sticker_category:favorite", new C76245b((AbstractC1204m) fVar.mo35248a(AbstractC1204m.class, (String) null), (AbstractC75361b) fVar.mo35248a(AbstractC75361b.class, (String) null), ((AbstractC84089j) fVar.mo35248a(AbstractC84089j.class, (String) null)).mo23167t(), (StickerPreferences) fVar.mo35248a(StickerPreferences.class, (String) null)));
                if (C65365be.m117061a()) {
                    cVar.mo119931a("sticker_category:search", new C76359j((ActivityC0945e) fVar.mo35248a(ActivityC0945e.class, (String) null), (AbstractC76329a) fVar.mo35248a(AbstractC76329a.class, (String) null), new AbstractC76125l.C76127b(((AbstractC84089j) fVar.mo35248a(AbstractC84089j.class, (String) null)).mo23167t(), ((AbstractC84089j) fVar.mo35248a(AbstractC84089j.class, (String) null)).mo23168u(), (AbstractC75429h) fVar.mo35248a(AbstractC75429h.class, (String) null), new C75424c(), new C76196m((AbstractC84398d) fVar.mo35248a(AbstractC84398d.class, (String) null)), ((C75574j) fVar.mo35248a(C75574j.class, (String) null)).f169851m), (C75574j) fVar.mo35248a(C75574j.class, (String) null), new C66781a(fVar, this)));
                }
                return cVar;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.record.a$ag$a */
        public static final class C66773a extends AbstractC21603p<C69926ch> {

            /* renamed from: a */
            final /* synthetic */ C66772ag f149992a;

            static {
                Covode.recordClassIndex(78345);
            }

            public C66773a(C66772ag agVar) {
                this.f149992a = agVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final C69926ch get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return this.f149992a.f149991c;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.record.a$ag$b */
        public static final class C66774b extends AbstractC21603p<ApiCenter> {

            /* renamed from: a */
            final /* synthetic */ C66772ag f149993a;

            static {
                Covode.recordClassIndex(78346);
            }

            public C66774b(C66772ag agVar) {
                this.f149993a = agVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final ApiCenter get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return ApiCenter.C2545a.m7450a(C22228c.m41832b(this.f149993a.f149990b));
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.record.a$ag$g */
        public static final class C66782g extends AbstractC21603p<AbstractC78928a> {
            static {
                Covode.recordClassIndex(78354);
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final AbstractC78928a get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return new MvTemplateDependentsImpl();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.record.a$ag$e */
        public static final class C66778e extends AbstractC21603p<AbstractC76329a> {
            static {
                Covode.recordClassIndex(78350);
            }

            /* renamed from: com.ss.android.ugc.aweme.record.a$ag$e$a */
            static final class C66779a<T> implements AbstractC2565m {

                /* renamed from: a */
                final /* synthetic */ TTSearchStickerViewModel f149996a;

                static {
                    Covode.recordClassIndex(78351);
                }

                C66779a(TTSearchStickerViewModel tTSearchStickerViewModel) {
                    this.f149996a = tTSearchStickerViewModel;
                }

                @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
                public final /* synthetic */ void onChanged(Object obj) {
                    if (C89219l.m154714a(obj, (Object) true)) {
                        this.f149996a.f171455i.setValue(true);
                    }
                }
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final AbstractC76329a get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                AbstractC75655o t = ((AbstractC84089j) fVar.mo35248a(AbstractC84089j.class, (String) null)).mo23167t();
                AbstractC75300d u = ((AbstractC84089j) fVar.mo35248a(AbstractC84089j.class, (String) null)).mo23168u();
                Object a = fVar.mo35247a(AbstractC84398d.class);
                C89219l.m154716b(a, "");
                TTSearchStickerViewModel tTSearchStickerViewModel = new TTSearchStickerViewModel((AbstractC1204m) fVar.mo35248a(AbstractC1204m.class, (String) null), t, u, new C76196m((AbstractC84398d) a));
                AVApi b = AVApiImpl.m123134b();
                C89219l.m154716b(b, "");
                String a2 = b.mo109850a();
                C89219l.m154716b(a2, "");
                tTSearchStickerViewModel.mo120034b(a2);
                ((AbstractC84089j) fVar.mo35249a(AbstractC84089j.class, (String) null)).mo128893A().mo6997a((AbstractC1204m) fVar.mo35249a(AbstractC1204m.class, (String) null), new C66779a(tTSearchStickerViewModel));
                return tTSearchStickerViewModel;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.record.a$ag$c */
        public static final class C66775c extends AbstractC21603p<C75574j> {
            static {
                Covode.recordClassIndex(78347);
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final C75574j get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return C33458f.m68566a((ActivityC0945e) fVar.mo35249a(ActivityC0945e.class, (String) null), (AbstractC14177d) fVar.mo35249a(AbstractC14177d.class, (String) null), !C63244g.m114602a().mo73255A().mo93901a(), false, 16);
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C21597n nVar) {
            C21597n nVar2 = nVar;
            C89219l.m154721d(nVar2, "");
            C89219l.m154716b(nVar2.mo35260a(C69926ch.class, (String) null, (AbstractC21603p) new C66773a(this)), "");
            C89219l.m154716b(nVar2.mo35260a(ApiCenter.class, (String) null, (AbstractC21603p) new C66774b(this)), "");
            C89219l.m154716b(nVar2.mo35260a(C75574j.class, (String) null, (AbstractC21603p) new C66775c()), "");
            C89219l.m154716b(nVar2.mo35260a(AbstractC76085a.class, (String) null, (AbstractC21603p) new C66776d()), "");
            if (C65365be.m117061a()) {
                C89219l.m154716b(nVar2.mo35260a(AbstractC76329a.class, (String) null, (AbstractC21603p) new C66778e()), "");
            }
            C89219l.m154716b(nVar2.mo35260a(AbstractC76115b.class, (String) null, (AbstractC21603p) new C66780f(this)), "");
            C89219l.m154716b(nVar2.mo35260a(AbstractC78928a.class, (String) null, (AbstractC21603p) new C66782g()), "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$a */
    public static final class C66765a extends AbstractC21603p<C71866b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f149972a;

        static {
            Covode.recordClassIndex(78337);
        }

        public C66765a(C2553d dVar) {
            this.f149972a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C71866b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C71866b(fVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$b */
    public static final class C66783b extends AbstractC21603p<C72459d> {

        /* renamed from: a */
        final /* synthetic */ C2553d f150000a;

        static {
            Covode.recordClassIndex(78355);
        }

        public C66783b(C2553d dVar) {
            this.f150000a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C72459d get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C72459d(fVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$c */
    public static final class C66784c extends AbstractC21603p<C84103b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f150001a;

        static {
            Covode.recordClassIndex(78356);
        }

        public C66784c(C2553d dVar) {
            this.f150001a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C84103b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C84103b(fVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$d */
    public static final class C66785d extends AbstractC21603p<C73416l> {

        /* renamed from: a */
        final /* synthetic */ C2553d f150002a;

        static {
            Covode.recordClassIndex(78357);
        }

        public C66785d(C2553d dVar) {
            this.f150002a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C73416l get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C73416l(fVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$e */
    public static final class C66786e extends AbstractC21603p<C70754b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f150003a;

        static {
            Covode.recordClassIndex(78358);
        }

        public C66786e(C2553d dVar) {
            this.f150003a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C70754b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C70754b(fVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$f */
    public static final class C66787f extends AbstractC21603p<C83591c> {

        /* renamed from: a */
        final /* synthetic */ C2553d f150004a;

        static {
            Covode.recordClassIndex(78359);
        }

        public C66787f(C2553d dVar) {
            this.f150004a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C83591c get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C83591c(fVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$g */
    public static final class C66788g extends AbstractC21603p<C83942a> {

        /* renamed from: a */
        final /* synthetic */ C2553d f150005a;

        static {
            Covode.recordClassIndex(78360);
        }

        public C66788g(C2553d dVar) {
            this.f150005a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C83942a get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C83942a(fVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$h */
    public static final class C66789h extends AbstractC21603p<C83496c> {

        /* renamed from: a */
        final /* synthetic */ C2553d f150006a;

        static {
            Covode.recordClassIndex(78361);
        }

        public C66789h(C2553d dVar) {
            this.f150006a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C83496c get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C83496c(fVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$ad */
    public static final class C66769ad extends AbstractC21603p<C83858b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f149982a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f149983b;

        /* renamed from: c */
        final /* synthetic */ C21582f f149984c;

        static {
            Covode.recordClassIndex(78341);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C83858b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C83858b(this.f149983b, fVar);
        }

        public C66769ad(C2553d dVar, AbstractC22186b bVar, C21582f fVar) {
            this.f149982a = dVar;
            this.f149983b = bVar;
            this.f149984c = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$ae */
    public static final class C66770ae extends AbstractC21603p<C14395g> {

        /* renamed from: a */
        final /* synthetic */ C2553d f149985a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f149986b;

        /* renamed from: c */
        final /* synthetic */ C21582f f149987c;

        static {
            Covode.recordClassIndex(78342);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C14395g get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return C75393k.m132222a(fVar, this.f149986b);
        }

        public C66770ae(C2553d dVar, AbstractC22186b bVar, C21582f fVar) {
            this.f149985a = dVar;
            this.f149986b = bVar;
            this.f149987c = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$af */
    static final class C66771af extends AbstractC89220m implements AbstractC89172b<C2554e, C89391z> {

        /* renamed from: a */
        public static final C66771af f149988a = new C66771af();

        static {
            Covode.recordClassIndex(78343);
        }

        C66771af() {
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

    /* renamed from: com.ss.android.ugc.aweme.record.a$i */
    public static final class C66790i extends AbstractC21603p<C14325c> {

        /* renamed from: a */
        final /* synthetic */ C2553d f150007a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f150008b;

        /* renamed from: c */
        final /* synthetic */ C21582f f150009c;

        static {
            Covode.recordClassIndex(78362);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C14325c get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C14325c(this.f150008b, fVar, R.id.b_e);
        }

        public C66790i(C2553d dVar, AbstractC22186b bVar, C21582f fVar) {
            this.f150007a = dVar;
            this.f150008b = bVar;
            this.f150009c = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$j */
    public static final class C66791j extends AbstractC21603p<C83751e> {

        /* renamed from: a */
        final /* synthetic */ C2553d f150010a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f150011b;

        /* renamed from: c */
        final /* synthetic */ C21582f f150012c;

        static {
            Covode.recordClassIndex(78363);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C83751e get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C83751e(fVar, this.f150011b);
        }

        public C66791j(C2553d dVar, AbstractC22186b bVar, C21582f fVar) {
            this.f150010a = dVar;
            this.f150011b = bVar;
            this.f150012c = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$l */
    public static final class C66793l extends AbstractC21603p<C83882b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f150016a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f150017b;

        /* renamed from: c */
        final /* synthetic */ C21582f f150018c;

        static {
            Covode.recordClassIndex(78365);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C83882b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C83882b(this.f150017b, fVar);
        }

        public C66793l(C2553d dVar, AbstractC22186b bVar, C21582f fVar) {
            this.f150016a = dVar;
            this.f150017b = bVar;
            this.f150018c = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$m */
    public static final class C66794m extends AbstractC21603p<C83635b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f150019a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f150020b;

        /* renamed from: c */
        final /* synthetic */ C21582f f150021c;

        static {
            Covode.recordClassIndex(78366);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C83635b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C83635b(this.f150020b, fVar);
        }

        public C66794m(C2553d dVar, AbstractC22186b bVar, C21582f fVar) {
            this.f150019a = dVar;
            this.f150020b = bVar;
            this.f150021c = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$p */
    public static final class C66797p extends AbstractC21603p<C83625c> {

        /* renamed from: a */
        final /* synthetic */ C2553d f150028a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f150029b;

        /* renamed from: c */
        final /* synthetic */ C21582f f150030c;

        static {
            Covode.recordClassIndex(78369);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C83625c get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C83625c(this.f150029b, fVar);
        }

        public C66797p(C2553d dVar, AbstractC22186b bVar, C21582f fVar) {
            this.f150028a = dVar;
            this.f150029b = bVar;
            this.f150030c = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$q */
    public static final class C66798q extends AbstractC21603p<C14277a> {

        /* renamed from: a */
        final /* synthetic */ C2553d f150031a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f150032b;

        /* renamed from: c */
        final /* synthetic */ C21582f f150033c;

        static {
            Covode.recordClassIndex(78370);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C14277a get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return C33450d.m68560a(this.f150032b, fVar);
        }

        public C66798q(C2553d dVar, AbstractC22186b bVar, C21582f fVar) {
            this.f150031a = dVar;
            this.f150032b = bVar;
            this.f150033c = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$r */
    public static final class C66799r extends AbstractC21603p<C14237a> {

        /* renamed from: a */
        final /* synthetic */ C2553d f150034a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f150035b;

        /* renamed from: c */
        final /* synthetic */ C21582f f150036c;

        static {
            Covode.recordClassIndex(78371);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C14237a get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C14237a(this.f150035b, fVar);
        }

        public C66799r(C2553d dVar, AbstractC22186b bVar, C21582f fVar) {
            this.f150034a = dVar;
            this.f150035b = bVar;
            this.f150036c = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$s */
    public static final class C66800s extends AbstractC21603p<C83735b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f150037a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f150038b;

        /* renamed from: c */
        final /* synthetic */ C21582f f150039c;

        static {
            Covode.recordClassIndex(78372);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C83735b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C83735b(this.f150038b, fVar);
        }

        public C66800s(C2553d dVar, AbstractC22186b bVar, C21582f fVar) {
            this.f150037a = dVar;
            this.f150038b = bVar;
            this.f150039c = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$t */
    public static final class C66801t extends AbstractC21603p<C83728b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f150040a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f150041b;

        /* renamed from: c */
        final /* synthetic */ C21582f f150042c;

        static {
            Covode.recordClassIndex(78373);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C83728b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C83728b(this.f150041b, fVar);
        }

        public C66801t(C2553d dVar, AbstractC22186b bVar, C21582f fVar) {
            this.f150040a = dVar;
            this.f150041b = bVar;
            this.f150042c = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$u */
    public static final class C66802u extends AbstractC21603p<C69938b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f150043a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f150044b;

        /* renamed from: c */
        final /* synthetic */ C21582f f150045c;

        static {
            Covode.recordClassIndex(78374);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C69938b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C69938b(this.f150044b, fVar);
        }

        public C66802u(C2553d dVar, AbstractC22186b bVar, C21582f fVar) {
            this.f150043a = dVar;
            this.f150044b = bVar;
            this.f150045c = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$v */
    public static final class C66803v extends AbstractC21603p<C70735z> {

        /* renamed from: a */
        final /* synthetic */ C2553d f150046a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f150047b;

        /* renamed from: c */
        final /* synthetic */ C21582f f150048c;

        static {
            Covode.recordClassIndex(78375);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C70735z get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C70735z(this.f150047b, fVar);
        }

        public C66803v(C2553d dVar, AbstractC22186b bVar, C21582f fVar) {
            this.f150046a = dVar;
            this.f150047b = bVar;
            this.f150048c = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$w */
    public static final class C66804w extends AbstractC21603p<C81788d> {

        /* renamed from: a */
        final /* synthetic */ C2553d f150049a;

        /* renamed from: b */
        final /* synthetic */ CommentVideoModel f150050b;

        /* renamed from: c */
        final /* synthetic */ AbstractC22186b f150051c;

        /* renamed from: d */
        final /* synthetic */ C21582f f150052d;

        static {
            Covode.recordClassIndex(78376);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C81788d get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C81788d(this.f150051c, fVar, this.f150050b);
        }

        public C66804w(C2553d dVar, CommentVideoModel commentVideoModel, AbstractC22186b bVar, C21582f fVar) {
            this.f150049a = dVar;
            this.f150050b = commentVideoModel;
            this.f150051c = bVar;
            this.f150052d = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$y */
    public static final class C66806y extends AbstractC21603p<C14151k> {

        /* renamed from: a */
        final /* synthetic */ C2553d f150057a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f150058b;

        /* renamed from: c */
        final /* synthetic */ C21582f f150059c;

        static {
            Covode.recordClassIndex(78378);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C14151k get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return C83398a.m143790a(this.f150058b, fVar);
        }

        public C66806y(C2553d dVar, AbstractC22186b bVar, C21582f fVar) {
            this.f150057a = dVar;
            this.f150058b = bVar;
            this.f150059c = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$z */
    public static final class C66807z extends AbstractC21603p<C83681c> {

        /* renamed from: a */
        final /* synthetic */ C2553d f150060a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f150061b;

        /* renamed from: c */
        final /* synthetic */ C21582f f150062c;

        static {
            Covode.recordClassIndex(78379);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C83681c get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C83681c(this.f150061b, fVar);
        }

        public C66807z(C2553d dVar, AbstractC22186b bVar, C21582f fVar) {
            this.f150060a = dVar;
            this.f150061b = bVar;
            this.f150062c = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$aa */
    public static final class C66766aa extends AbstractC21603p<C83509d> {

        /* renamed from: a */
        final /* synthetic */ C2553d f149973a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f149974b;

        /* renamed from: c */
        final /* synthetic */ C21582f f149975c;

        static {
            Covode.recordClassIndex(78338);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C83509d get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            AbstractC22186b bVar = this.f149974b;
            C89219l.m154721d(bVar, "");
            C89219l.m154721d(fVar, "");
            return new C83509d(bVar, fVar);
        }

        public C66766aa(C2553d dVar, AbstractC22186b bVar, C21582f fVar) {
            this.f149973a = dVar;
            this.f149974b = bVar;
            this.f149975c = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$ab */
    public static final class C66767ab extends AbstractC21603p<C83472b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f149976a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f149977b;

        /* renamed from: c */
        final /* synthetic */ C21582f f149978c;

        static {
            Covode.recordClassIndex(78339);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C83472b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            AbstractC22186b bVar = this.f149977b;
            Object a = this.f149978c.mo35247a(ShortVideoContext.class);
            C89219l.m154716b(a, "");
            return new C83472b(bVar, fVar, (ShortVideoContext) a);
        }

        public C66767ab(C2553d dVar, AbstractC22186b bVar, C21582f fVar) {
            this.f149976a = dVar;
            this.f149977b = bVar;
            this.f149978c = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$ac */
    public static final class C66768ac extends AbstractC21603p<C83913f> {

        /* renamed from: a */
        final /* synthetic */ C2553d f149979a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f149980b;

        /* renamed from: c */
        final /* synthetic */ C21582f f149981c;

        static {
            Covode.recordClassIndex(78340);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C83913f get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C40801b().mo70037a(this.f149980b, fVar, new C40832d());
        }

        public C66768ac(C2553d dVar, AbstractC22186b bVar, C21582f fVar) {
            this.f149979a = dVar;
            this.f149980b = bVar;
            this.f149981c = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$k */
    public static final class C66792k extends AbstractC21603p<C83809g> {

        /* renamed from: a */
        final /* synthetic */ C2553d f150013a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f150014b;

        /* renamed from: c */
        final /* synthetic */ C21582f f150015c;

        static {
            Covode.recordClassIndex(78364);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C83809g get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C83809g(fVar, this.f150014b, new C83855i());
        }

        public C66792k(C2553d dVar, AbstractC22186b bVar, C21582f fVar) {
            this.f150013a = dVar;
            this.f150014b = bVar;
            this.f150015c = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$o */
    public static final class C66796o extends AbstractC21603p<C83442i> {

        /* renamed from: a */
        final /* synthetic */ C2553d f150025a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f150026b;

        /* renamed from: c */
        final /* synthetic */ C21582f f150027c;

        static {
            Covode.recordClassIndex(78368);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C83442i get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C83442i(this.f150026b, fVar, C34359ay.m70308a().mo108507a(fVar));
        }

        public C66796o(C2553d dVar, AbstractC22186b bVar, C21582f fVar) {
            this.f150025a = dVar;
            this.f150026b = bVar;
            this.f150027c = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$x */
    public static final class C66805x extends AbstractC21603p<C35472b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f150053a;

        /* renamed from: b */
        final /* synthetic */ QaStruct f150054b;

        /* renamed from: c */
        final /* synthetic */ AbstractC22186b f150055c;

        /* renamed from: d */
        final /* synthetic */ C21582f f150056d;

        static {
            Covode.recordClassIndex(78377);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C35472b get(C21582f fVar) {
            QaStruct qaStruct;
            C89219l.m154721d(fVar, "");
            AbstractC22186b bVar = this.f150055c;
            if (QaUtils.isDataValid(this.f150054b)) {
                qaStruct = this.f150054b;
            } else {
                qaStruct = null;
            }
            return new C35472b(bVar, fVar, qaStruct);
        }

        public C66805x(C2553d dVar, QaStruct qaStruct, AbstractC22186b bVar, C21582f fVar) {
            this.f150053a = dVar;
            this.f150054b = qaStruct;
            this.f150055c = bVar;
            this.f150056d = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.record.a$n */
    public static final class C66795n extends AbstractC21603p<C83422h> {

        /* renamed from: a */
        final /* synthetic */ C2553d f150022a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f150023b;

        /* renamed from: c */
        final /* synthetic */ C21582f f150024c;

        static {
            Covode.recordClassIndex(78367);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C83422h get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            AbstractC22186b bVar = this.f150023b;
            List<AbstractC83405a> a = C34359ay.m70308a().mo108507a(fVar);
            C67917h hVar = new C67917h();
            C89219l.m154721d(fVar, "");
            ArrayList arrayList = new ArrayList();
            Object a2 = fVar.mo35247a(ShortVideoContext.class);
            C89219l.m154716b(a2, "");
            hVar.f152130a = (ShortVideoContext) a2;
            if (hVar.mo108515c()) {
                arrayList.add(new C67943y(C80573ig.m139668a(EnumC67895ad.RECORD_LIGHTENING_PHOTO.getNameResId()), C80573ig.m139668a(EnumC67895ad.PHOTO_SHORT.getTagResId()), "quick_photo", false, false, fVar));
            }
            if (hVar.mo108514b()) {
                arrayList.add(new C67936u(C80573ig.m139668a(EnumC67895ad.RECORD_LIGHTENING_VIDEO.getNameResId()), C80573ig.m139668a(EnumC67895ad.RECORD_LIGHTENING_VIDEO.getTagResId()), "quick_video", false, fVar));
            }
            return new C83422h(bVar, fVar, a, arrayList);
        }

        public C66795n(C2553d dVar, AbstractC22186b bVar, C21582f fVar) {
            this.f150022a = dVar;
            this.f150023b = bVar;
            this.f150024c = fVar;
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.PageFactory
    /* renamed from: a */
    public final void mo88345a(AbstractC22186b bVar) {
        C89219l.m154721d(bVar, "");
        C2555f.m7466a(bVar, C66771af.f149988a);
        C21582f a = C2556g.m7472a(bVar, new C66772ag(this, bVar, (C69926ch) bVar));
        C2551b bVar2 = new C2551b(C2552c.m7462a(bVar));
        C2553d dVar = new C2553d();
        AlsLogicContainer alsLogicContainer = bVar2.f7720a;
        alsLogicContainer.f7696d.mo35260a(C14325c.class, (String) null, (AbstractC21603p) new C66790i(dVar, bVar, a));
        alsLogicContainer.mo7005a(AbstractC14315b.class, C14325c.class);
        C2553d dVar2 = new C2553d();
        AlsLogicContainer alsLogicContainer2 = bVar2.f7720a;
        alsLogicContainer2.f7696d.mo35260a(C83728b.class, (String) null, (AbstractC21603p) new C66801t(dVar2, bVar, a));
        alsLogicContainer2.mo7005a(AbstractC83727a.class, C83728b.class);
        C2553d dVar3 = new C2553d();
        AlsLogicContainer alsLogicContainer3 = bVar2.f7720a;
        alsLogicContainer3.f7696d.mo35260a(C14151k.class, (String) null, (AbstractC21603p) new C66806y(dVar3, bVar, a));
        alsLogicContainer3.mo7005a(AbstractC14103e.class, C14151k.class);
        C2553d dVar4 = new C2553d();
        AlsLogicContainer alsLogicContainer4 = bVar2.f7720a;
        alsLogicContainer4.f7696d.mo35260a(C83681c.class, (String) null, (AbstractC21603p) new C66807z(dVar4, bVar, a));
        alsLogicContainer4.mo7005a(AbstractC83678a.class, C83681c.class);
        C2553d dVar5 = new C2553d();
        AlsLogicContainer alsLogicContainer5 = bVar2.f7720a;
        alsLogicContainer5.f7696d.mo35260a(C83509d.class, (String) null, (AbstractC21603p) new C66766aa(dVar5, bVar, a));
        alsLogicContainer5.mo7005a(AbstractC83490a.class, C83509d.class);
        C2553d dVar6 = new C2553d();
        AlsLogicContainer alsLogicContainer6 = bVar2.f7720a;
        alsLogicContainer6.f7696d.mo35260a(C83472b.class, (String) null, (AbstractC21603p) new C66767ab(dVar6, bVar, a));
        alsLogicContainer6.mo7005a(CommentAndQuestionAndQuestionStickerPanelViewModel.class, C83472b.class);
        C2553d dVar7 = new C2553d();
        AlsLogicContainer alsLogicContainer7 = bVar2.f7720a;
        alsLogicContainer7.f7696d.mo35260a(C83913f.class, (String) null, (AbstractC21603p) new C66768ac(dVar7, bVar, a));
        alsLogicContainer7.mo7005a(AbstractC83912e.class, C83913f.class);
        C2553d dVar8 = new C2553d();
        AlsLogicContainer alsLogicContainer8 = bVar2.f7720a;
        alsLogicContainer8.f7696d.mo35260a(C83858b.class, (String) null, (AbstractC21603p) new C66769ad(dVar8, bVar, a));
        alsLogicContainer8.mo7005a(AbstractC83869f.class, C83858b.class);
        C2553d dVar9 = new C2553d();
        AlsLogicContainer alsLogicContainer9 = bVar2.f7720a;
        alsLogicContainer9.f7696d.mo35260a(C83496c.class, (String) null, (AbstractC21603p) new C66789h(dVar9));
        alsLogicContainer9.mo7005a(AbstractC83492a.class, C83496c.class);
        C2553d dVar10 = new C2553d();
        AlsLogicContainer alsLogicContainer10 = bVar2.f7720a;
        alsLogicContainer10.f7696d.mo35260a(C14395g.class, (String) null, (AbstractC21603p) new C66770ae(dVar10, bVar, a));
        alsLogicContainer10.mo7005a(RecordStickerPanelViewModel.class, C14395g.class);
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        C89219l.m154716b(createIAVServiceProxybyMonsterPlugin, "");
        if (createIAVServiceProxybyMonsterPlugin.getStoryService().mo93871e()) {
            C2553d dVar11 = new C2553d();
            AlsLogicContainer alsLogicContainer11 = bVar2.f7720a;
            alsLogicContainer11.f7696d.mo35260a(C83751e.class, (String) null, (AbstractC21603p) new C66791j(dVar11, bVar, a));
            alsLogicContainer11.mo7005a(AbstractC83750d.class, C83751e.class);
        } else {
            C2553d dVar12 = new C2553d();
            AlsLogicContainer alsLogicContainer12 = bVar2.f7720a;
            alsLogicContainer12.f7696d.mo35260a(C83809g.class, (String) null, (AbstractC21603p) new C66792k(dVar12, bVar, a));
            alsLogicContainer12.mo7005a(AbstractC83746a.class, C83809g.class);
        }
        C2553d dVar13 = new C2553d();
        AlsLogicContainer alsLogicContainer13 = bVar2.f7720a;
        alsLogicContainer13.f7696d.mo35260a(C83882b.class, (String) null, (AbstractC21603p) new C66793l(dVar13, bVar, a));
        alsLogicContainer13.mo7005a(AbstractC83881a.class, C83882b.class);
        C2553d dVar14 = new C2553d();
        AlsLogicContainer alsLogicContainer14 = bVar2.f7720a;
        alsLogicContainer14.f7696d.mo35260a(C83635b.class, (String) null, (AbstractC21603p) new C66794m(dVar14, bVar, a));
        alsLogicContainer14.mo7005a(AbstractC83634a.class, C83635b.class);
        IAVServiceProxy createIAVServiceProxybyMonsterPlugin2 = AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false);
        C89219l.m154716b(createIAVServiceProxybyMonsterPlugin2, "");
        if (createIAVServiceProxybyMonsterPlugin2.getStoryService().mo93871e()) {
            C2553d dVar15 = new C2553d();
            AlsLogicContainer alsLogicContainer15 = bVar2.f7720a;
            alsLogicContainer15.f7696d.mo35260a(C83422h.class, (String) null, (AbstractC21603p) new C66795n(dVar15, bVar, a));
            alsLogicContainer15.mo7005a(AbstractC83406b.class, C83422h.class);
        } else {
            C2553d dVar16 = new C2553d();
            AlsLogicContainer alsLogicContainer16 = bVar2.f7720a;
            alsLogicContainer16.f7696d.mo35260a(C83442i.class, (String) null, (AbstractC21603p) new C66796o(dVar16, bVar, a));
            alsLogicContainer16.mo7005a(AbstractC83406b.class, C83442i.class);
        }
        C2553d dVar17 = new C2553d();
        AlsLogicContainer alsLogicContainer17 = bVar2.f7720a;
        alsLogicContainer17.f7696d.mo35260a(C83625c.class, (String) null, (AbstractC21603p) new C66797p(dVar17, bVar, a));
        alsLogicContainer17.mo7005a(AbstractC83623a.class, C83625c.class);
        C2553d dVar18 = new C2553d();
        AlsLogicContainer alsLogicContainer18 = bVar2.f7720a;
        alsLogicContainer18.f7696d.mo35260a(C14277a.class, (String) null, (AbstractC21603p) new C66798q(dVar18, bVar, a));
        alsLogicContainer18.mo7005a(FilterPanelViewModel.class, C14277a.class);
        C2553d dVar19 = new C2553d();
        AlsLogicContainer alsLogicContainer19 = bVar2.f7720a;
        alsLogicContainer19.f7696d.mo35260a(C14237a.class, (String) null, (AbstractC21603p) new C66799r(dVar19, bVar, a));
        alsLogicContainer19.mo7005a(AbstractC14213c.class, C14237a.class);
        C2553d dVar20 = new C2553d();
        AlsLogicContainer alsLogicContainer20 = bVar2.f7720a;
        alsLogicContainer20.f7696d.mo35260a(C83735b.class, (String) null, (AbstractC21603p) new C66800s(dVar20, bVar, a));
        alsLogicContainer20.mo7005a(AbstractC83734a.class, C83735b.class);
        C2553d dVar21 = new C2553d();
        AlsLogicContainer alsLogicContainer21 = bVar2.f7720a;
        alsLogicContainer21.f7696d.mo35260a(C69938b.class, (String) null, (AbstractC21603p) new C66802u(dVar21, bVar, a));
        alsLogicContainer21.mo7005a(AbstractC69937a.class, C69938b.class);
        C2553d dVar22 = new C2553d();
        AlsLogicContainer alsLogicContainer22 = bVar2.f7720a;
        alsLogicContainer22.f7696d.mo35260a(C71866b.class, (String) null, (AbstractC21603p) new C66765a(dVar22));
        alsLogicContainer22.mo7005a(AbstractC71864a.class, C71866b.class);
        C2553d dVar23 = new C2553d();
        AlsLogicContainer alsLogicContainer23 = bVar2.f7720a;
        alsLogicContainer23.f7696d.mo35260a(C72459d.class, (String) null, (AbstractC21603p) new C66783b(dVar23));
        alsLogicContainer23.mo7005a(AbstractC72453a.class, C72459d.class);
        Object a2 = a.mo35249a((Type) ShortVideoContext.class, (String) null);
        C89219l.m154716b(a2, "");
        if (C70659a.m124890a((ShortVideoContext) a2)) {
            C2553d dVar24 = new C2553d();
            AlsLogicContainer alsLogicContainer24 = bVar2.f7720a;
            alsLogicContainer24.f7696d.mo35260a(C70735z.class, (String) null, (AbstractC21603p) new C66803v(dVar24, bVar, a));
            alsLogicContainer24.mo7005a(DuetLayoutModeViewModel.class, C70735z.class);
        }
        CommentVideoModel commentVideoModel = ((ShortVideoContext) a.mo35249a((Type) ShortVideoContext.class, (String) null)).f155825j;
        C2553d dVar25 = new C2553d();
        AlsLogicContainer alsLogicContainer25 = bVar2.f7720a;
        alsLogicContainer25.f7696d.mo35260a(C81788d.class, (String) null, (AbstractC21603p) new C66804w(dVar25, commentVideoModel, bVar, a));
        alsLogicContainer25.mo7005a(AbstractC81785a.class, C81788d.class);
        QaStruct qaStruct = ((ShortVideoContext) a.mo35249a((Type) ShortVideoContext.class, (String) null)).f155826k;
        C2553d dVar26 = new C2553d();
        AlsLogicContainer alsLogicContainer26 = bVar2.f7720a;
        alsLogicContainer26.f7696d.mo35260a(C35472b.class, (String) null, (AbstractC21603p) new C66805x(dVar26, qaStruct, bVar, a));
        alsLogicContainer26.mo7005a(AbstractC35471a.class, C35472b.class);
        C2553d dVar27 = new C2553d();
        AlsLogicContainer alsLogicContainer27 = bVar2.f7720a;
        alsLogicContainer27.f7696d.mo35260a(C84103b.class, (String) null, (AbstractC21603p) new C66784c(dVar27));
        alsLogicContainer27.mo7005a(AbstractC84102a.class, C84103b.class);
        C2553d dVar28 = new C2553d();
        AlsLogicContainer alsLogicContainer28 = bVar2.f7720a;
        alsLogicContainer28.f7696d.mo35260a(C73416l.class, (String) null, (AbstractC21603p) new C66785d(dVar28));
        alsLogicContainer28.mo7005a(AbstractC73415k.class, C73416l.class);
        if (C46955fu.m90243a() != 0) {
            C2553d dVar29 = new C2553d();
            AlsLogicContainer alsLogicContainer29 = bVar2.f7720a;
            alsLogicContainer29.f7696d.mo35260a(C70754b.class, (String) null, (AbstractC21603p) new C66786e(dVar29));
            alsLogicContainer29.mo7005a(AbstractC70753a.class, C70754b.class);
        }
        C2553d dVar30 = new C2553d();
        AlsLogicContainer alsLogicContainer30 = bVar2.f7720a;
        alsLogicContainer30.f7696d.mo35260a(C83591c.class, (String) null, (AbstractC21603p) new C66787f(dVar30));
        alsLogicContainer30.mo7005a(AbstractC83566a.class, C83591c.class);
        C2553d dVar31 = new C2553d();
        AlsLogicContainer alsLogicContainer31 = bVar2.f7720a;
        alsLogicContainer31.f7696d.mo35260a(C83942a.class, (String) null, (AbstractC21603p) new C66788g(dVar31));
        alsLogicContainer31.mo7005a(AbstractC2547b.class, C83942a.class);
        bVar2.mo7031a();
    }
}
