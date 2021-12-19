package com.p2082ss.android.ugc.aweme.ttep;

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
import com.bytedance.creativex.recorder.sticker.panel.C14395g;
import com.bytedance.creativex.recorder.sticker.panel.RecordStickerPanelViewModel;
import com.bytedance.p1559o.AbstractC21603p;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.C21597n;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.scene.ktx.C22228c;
import com.p2082ss.android.ugc.aweme.comment.model.CommentVideoModel;
import com.p2082ss.android.ugc.aweme.p2306ah.C33450d;
import com.p2082ss.android.ugc.aweme.p2306ah.C33458f;
import com.p2082ss.android.ugc.aweme.p2721cx.C40801b;
import com.p2082ss.android.ugc.aweme.p4244z.AbstractC81785a;
import com.p2082ss.android.ugc.aweme.p4244z.C81788d;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.services.mvtemplate.MvTemplateDependentsImpl;
import com.p2082ss.android.ugc.aweme.shortvideo.C69926ch;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.countdown.AbstractC69937a;
import com.p2082ss.android.ugc.aweme.shortvideo.countdown.C69938b;
import com.p2082ss.android.ugc.aweme.shortvideo.duet.C70659a;
import com.p2082ss.android.ugc.aweme.shortvideo.duet.C70735z;
import com.p2082ss.android.ugc.aweme.shortvideo.duet.DuetLayoutModeViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.model.CommentUtils;
import com.p2082ss.android.ugc.aweme.shortvideo.p3835h.AbstractC71864a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3835h.C71866b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3848n.AbstractC72453a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3848n.C72459d;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.p3877a.AbstractC73415k;
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
import com.p2082ss.android.ugc.aweme.tools.mvtemplate.p4137c.AbstractC78928a;
import com.p2082ss.android.ugc.aweme.ttep.p4152c.C79253a;
import com.p2082ss.android.ugc.aweme.ttep.p4153d.C79255a;
import com.p2082ss.android.ugc.aweme.ttep.ttepcomponent.AbstractC79278a;
import com.p2082ss.android.ugc.aweme.ttep.ttepcomponent.TTEPPreviewEffectLogicComponent;
import com.p2082ss.android.ugc.aweme.ttep.ttepcomponent.bottomtab.TTEPRecordBottomTabComponent;
import com.p2082ss.android.ugc.aweme.ttep.ttepcomponent.choosemusic.TTEPRecordChooseMusicComponent;
import com.p2082ss.android.ugc.aweme.ttep.ttepcomponent.dockbar.TTEPRecordDockBarComponent;
import com.p2082ss.android.ugc.aweme.ttep.ttepcomponent.p4154a.C79303b;
import com.p2082ss.android.ugc.aweme.ttep.ttepcomponent.p4155b.C79306a;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.gamora.TTEPPageFactory;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.AbstractC83490a;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.AbstractC83566a;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.C83591c;
import com.p2082ss.android.ugc.gamora.recorder.p4293a.C83398a;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b;
import com.p2082ss.android.ugc.gamora.recorder.p4297d.AbstractC83623a;
import com.p2082ss.android.ugc.gamora.recorder.p4297d.C83625c;
import com.p2082ss.android.ugc.gamora.recorder.p4298e.AbstractC83634a;
import com.p2082ss.android.ugc.gamora.recorder.p4300g.AbstractC83678a;
import com.p2082ss.android.ugc.gamora.recorder.p4300g.C83681c;
import com.p2082ss.android.ugc.gamora.recorder.p4302i.AbstractC83727a;
import com.p2082ss.android.ugc.gamora.recorder.p4302i.C83728b;
import com.p2082ss.android.ugc.gamora.recorder.p4303j.AbstractC83734a;
import com.p2082ss.android.ugc.gamora.recorder.p4303j.C83735b;
import com.p2082ss.android.ugc.gamora.recorder.p4304k.AbstractC83746a;
import com.p2082ss.android.ugc.gamora.recorder.p4304k.C83809g;
import com.p2082ss.android.ugc.gamora.recorder.p4305l.AbstractC83869f;
import com.p2082ss.android.ugc.gamora.recorder.p4305l.C83858b;
import com.p2082ss.android.ugc.gamora.recorder.p4306m.AbstractC83881a;
import com.p2082ss.android.ugc.gamora.recorder.p4307n.p4308a.AbstractC83912e;
import com.p2082ss.android.ugc.gamora.recorder.p4307n.p4308a.C83913f;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.gamora.recorder.sticker.support.AbstractC84102a;
import com.p2082ss.android.ugc.gamora.recorder.sticker.support.C84103b;
import com.p2082ss.android.ugc.tools.view.style.C84984j;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Type;
import java.util.ArrayList;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ttep.ad */
public final class C79203ad implements TTEPPageFactory {
    static {
        Covode.recordClassIndex(92390);
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ad$z */
    static final class C79229z extends AbstractC89220m implements AbstractC89172b<C21597n, C89391z> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22186b f178053a;

        /* renamed from: b */
        final /* synthetic */ C69926ch f178054b;

        static {
            Covode.recordClassIndex(92416);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C79229z(AbstractC22186b bVar, C69926ch chVar) {
            super(1);
            this.f178053a = bVar;
            this.f178054b = chVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.ttep.ad$z$d */
        public static final class C79233d extends AbstractC21603p<AbstractC76085a> {
            static {
                Covode.recordClassIndex(92420);
            }

            /* renamed from: com.ss.android.ugc.aweme.ttep.ad$z$d$a */
            public static final class C79234a implements AbstractC76085a {

                /* renamed from: a */
                final /* synthetic */ C21582f f178057a;

                /* renamed from: b */
                private final C75574j f178058b;

                static {
                    Covode.recordClassIndex(92421);
                }

                @Override // com.p2082ss.android.ugc.aweme.sticker.types.lock.AbstractC76085a
                public final boolean isLockStickerEnable() {
                    return this.f178058b.f169847i;
                }

                @Override // com.p2082ss.android.ugc.aweme.sticker.types.lock.AbstractC76085a
                public final boolean reallyLockedSticker(Effect effect) {
                    return C76086b.m133425b(effect);
                }

                C79234a(C21582f fVar) {
                    this.f178057a = fVar;
                    this.f178058b = (C75574j) fVar.mo35248a(C75574j.class, (String) null);
                }
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final AbstractC76085a get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return new C79234a(fVar);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ttep.ad$z$a */
        public static final class C79230a extends AbstractC21603p<C69926ch> {

            /* renamed from: a */
            final /* synthetic */ C79229z f178055a;

            static {
                Covode.recordClassIndex(92417);
            }

            public C79230a(C79229z zVar) {
                this.f178055a = zVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final C69926ch get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return this.f178055a.f178054b;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ttep.ad$z$b */
        public static final class C79231b extends AbstractC21603p<ApiCenter> {

            /* renamed from: a */
            final /* synthetic */ C79229z f178056a;

            static {
                Covode.recordClassIndex(92418);
            }

            public C79231b(C79229z zVar) {
                this.f178056a = zVar;
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final ApiCenter get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return ApiCenter.C2545a.m7450a(C22228c.m41832b(this.f178056a.f178053a));
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ttep.ad$z$f */
        public static final class C79236f extends AbstractC21603p<AbstractC78928a> {
            static {
                Covode.recordClassIndex(92423);
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final AbstractC78928a get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return new MvTemplateDependentsImpl();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ttep.ad$z$c */
        public static final class C79232c extends AbstractC21603p<C75574j> {
            static {
                Covode.recordClassIndex(92419);
            }

            @Override // com.bytedance.p1559o.AbstractC21603p
            public final C75574j get(C21582f fVar) {
                C89219l.m154721d(fVar, "");
                return C33458f.m68566a((ActivityC0945e) fVar.mo35249a(ActivityC0945e.class, (String) null), (AbstractC14177d) fVar.mo35249a(AbstractC14177d.class, (String) null), !C63244g.m114602a().mo73255A().mo93901a(), false, 16);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.ttep.ad$z$e */
        public static final class C79235e extends AbstractC21603p<AbstractC76115b<C84984j, Fragment>> {
            static {
                Covode.recordClassIndex(92422);
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
            C89219l.m154716b(nVar2.mo35260a(C69926ch.class, (String) null, (AbstractC21603p) new C79230a(this)), "");
            C89219l.m154716b(nVar2.mo35260a(ApiCenter.class, (String) null, (AbstractC21603p) new C79231b(this)), "");
            C89219l.m154716b(nVar2.mo35260a(C75574j.class, (String) null, (AbstractC21603p) new C79232c()), "");
            C89219l.m154716b(nVar2.mo35260a(AbstractC76085a.class, (String) null, (AbstractC21603p) new C79233d()), "");
            C89219l.m154716b(nVar2.mo35260a(AbstractC76115b.class, (String) null, (AbstractC21603p) new C79235e()), "");
            C89219l.m154716b(nVar2.mo35260a(AbstractC78928a.class, (String) null, (AbstractC21603p) new C79236f()), "");
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ad$a */
    public static final class C79204a extends AbstractC21603p<C71866b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f177989a;

        static {
            Covode.recordClassIndex(92391);
        }

        public C79204a(C2553d dVar) {
            this.f177989a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C71866b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C71866b(fVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ad$b */
    public static final class C79205b extends AbstractC21603p<C72459d> {

        /* renamed from: a */
        final /* synthetic */ C2553d f177990a;

        static {
            Covode.recordClassIndex(92392);
        }

        public C79205b(C2553d dVar) {
            this.f177990a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C72459d get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C72459d(fVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ad$c */
    public static final class C79206c extends AbstractC21603p<C83591c> {

        /* renamed from: a */
        final /* synthetic */ C2553d f177991a;

        static {
            Covode.recordClassIndex(92393);
        }

        public C79206c(C2553d dVar) {
            this.f177991a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C83591c get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C83591c(fVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ad$d */
    public static final class C79207d extends AbstractC21603p<C84103b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f177992a;

        static {
            Covode.recordClassIndex(92394);
        }

        public C79207d(C2553d dVar) {
            this.f177992a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C84103b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C84103b(fVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ad$e */
    public static final class C79208e extends AbstractC21603p<C73416l> {

        /* renamed from: a */
        final /* synthetic */ C2553d f177993a;

        static {
            Covode.recordClassIndex(92395);
        }

        public C79208e(C2553d dVar) {
            this.f177993a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C73416l get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C73416l(fVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ad$f */
    public static final class C79209f extends AbstractC21603p<TTEPPreviewEffectLogicComponent> {

        /* renamed from: a */
        final /* synthetic */ C2553d f177994a;

        static {
            Covode.recordClassIndex(92396);
        }

        public C79209f(C2553d dVar) {
            this.f177994a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ TTEPPreviewEffectLogicComponent get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new TTEPPreviewEffectLogicComponent(fVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ad$g */
    public static final class C79210g extends AbstractC21603p<C14325c> {

        /* renamed from: a */
        final /* synthetic */ C2553d f177995a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f177996b;

        /* renamed from: c */
        final /* synthetic */ C21582f f177997c;

        static {
            Covode.recordClassIndex(92397);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C14325c get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C14325c(this.f177996b, fVar, R.id.b_e);
        }

        public C79210g(C2553d dVar, AbstractC22186b bVar, C21582f fVar) {
            this.f177995a = dVar;
            this.f177996b = bVar;
            this.f177997c = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ad$h */
    public static final class C79211h extends AbstractC21603p<C79306a> {

        /* renamed from: a */
        final /* synthetic */ C2553d f177998a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f177999b;

        /* renamed from: c */
        final /* synthetic */ C21582f f178000c;

        static {
            Covode.recordClassIndex(92398);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C79306a get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C79306a(this.f177999b, fVar);
        }

        public C79211h(C2553d dVar, AbstractC22186b bVar, C21582f fVar) {
            this.f177998a = dVar;
            this.f177999b = bVar;
            this.f178000c = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ad$i */
    public static final class C79212i extends AbstractC21603p<TTEPRecordDockBarComponent> {

        /* renamed from: a */
        final /* synthetic */ C2553d f178001a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f178002b;

        /* renamed from: c */
        final /* synthetic */ C21582f f178003c;

        static {
            Covode.recordClassIndex(92399);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ TTEPRecordDockBarComponent get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new TTEPRecordDockBarComponent(this.f178002b, fVar);
        }

        public C79212i(C2553d dVar, AbstractC22186b bVar, C21582f fVar) {
            this.f178001a = dVar;
            this.f178002b = bVar;
            this.f178003c = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ad$k */
    public static final class C79214k extends AbstractC21603p<C83625c> {

        /* renamed from: a */
        final /* synthetic */ C2553d f178007a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f178008b;

        /* renamed from: c */
        final /* synthetic */ C21582f f178009c;

        static {
            Covode.recordClassIndex(92401);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C83625c get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C83625c(this.f178008b, fVar);
        }

        public C79214k(C2553d dVar, AbstractC22186b bVar, C21582f fVar) {
            this.f178007a = dVar;
            this.f178008b = bVar;
            this.f178009c = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ad$l */
    public static final class C79215l extends AbstractC21603p<C14277a> {

        /* renamed from: a */
        final /* synthetic */ C2553d f178010a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f178011b;

        /* renamed from: c */
        final /* synthetic */ C21582f f178012c;

        static {
            Covode.recordClassIndex(92402);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C14277a get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return C33450d.m68560a(this.f178011b, fVar);
        }

        public C79215l(C2553d dVar, AbstractC22186b bVar, C21582f fVar) {
            this.f178010a = dVar;
            this.f178011b = bVar;
            this.f178012c = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ad$m */
    public static final class C79216m extends AbstractC21603p<C14237a> {

        /* renamed from: a */
        final /* synthetic */ C2553d f178013a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f178014b;

        /* renamed from: c */
        final /* synthetic */ C21582f f178015c;

        static {
            Covode.recordClassIndex(92403);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C14237a get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C14237a(this.f178014b, fVar);
        }

        public C79216m(C2553d dVar, AbstractC22186b bVar, C21582f fVar) {
            this.f178013a = dVar;
            this.f178014b = bVar;
            this.f178015c = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ad$n */
    public static final class C79217n extends AbstractC21603p<C83735b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f178016a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f178017b;

        /* renamed from: c */
        final /* synthetic */ C21582f f178018c;

        static {
            Covode.recordClassIndex(92404);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C83735b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C83735b(this.f178017b, fVar);
        }

        public C79217n(C2553d dVar, AbstractC22186b bVar, C21582f fVar) {
            this.f178016a = dVar;
            this.f178017b = bVar;
            this.f178018c = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ad$o */
    public static final class C79218o extends AbstractC21603p<C69938b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f178019a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f178020b;

        /* renamed from: c */
        final /* synthetic */ C21582f f178021c;

        static {
            Covode.recordClassIndex(92405);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C69938b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C69938b(this.f178020b, fVar);
        }

        public C79218o(C2553d dVar, AbstractC22186b bVar, C21582f fVar) {
            this.f178019a = dVar;
            this.f178020b = bVar;
            this.f178021c = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ad$p */
    public static final class C79219p extends AbstractC21603p<C70735z> {

        /* renamed from: a */
        final /* synthetic */ C2553d f178022a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f178023b;

        /* renamed from: c */
        final /* synthetic */ C21582f f178024c;

        static {
            Covode.recordClassIndex(92406);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C70735z get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C70735z(this.f178023b, fVar);
        }

        public C79219p(C2553d dVar, AbstractC22186b bVar, C21582f fVar) {
            this.f178022a = dVar;
            this.f178023b = bVar;
            this.f178024c = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ad$q */
    public static final class C79220q extends AbstractC21603p<C81788d> {

        /* renamed from: a */
        final /* synthetic */ C2553d f178025a;

        /* renamed from: b */
        final /* synthetic */ CommentVideoModel f178026b;

        /* renamed from: c */
        final /* synthetic */ AbstractC22186b f178027c;

        /* renamed from: d */
        final /* synthetic */ C21582f f178028d;

        static {
            Covode.recordClassIndex(92407);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C81788d get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C81788d(this.f178027c, fVar, this.f178026b);
        }

        public C79220q(C2553d dVar, CommentVideoModel commentVideoModel, AbstractC22186b bVar, C21582f fVar) {
            this.f178025a = dVar;
            this.f178026b = commentVideoModel;
            this.f178027c = bVar;
            this.f178028d = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ad$r */
    public static final class C79221r extends AbstractC21603p<C83728b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f178029a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f178030b;

        /* renamed from: c */
        final /* synthetic */ C21582f f178031c;

        static {
            Covode.recordClassIndex(92408);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C83728b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C83728b(this.f178030b, fVar);
        }

        public C79221r(C2553d dVar, AbstractC22186b bVar, C21582f fVar) {
            this.f178029a = dVar;
            this.f178030b = bVar;
            this.f178031c = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ad$s */
    public static final class C79222s extends AbstractC21603p<C14151k> {

        /* renamed from: a */
        final /* synthetic */ C2553d f178032a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f178033b;

        /* renamed from: c */
        final /* synthetic */ C21582f f178034c;

        static {
            Covode.recordClassIndex(92409);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C14151k get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return C83398a.m143790a(this.f178033b, fVar);
        }

        public C79222s(C2553d dVar, AbstractC22186b bVar, C21582f fVar) {
            this.f178032a = dVar;
            this.f178033b = bVar;
            this.f178034c = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ad$t */
    public static final class C79223t extends AbstractC21603p<C83681c> {

        /* renamed from: a */
        final /* synthetic */ C2553d f178035a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f178036b;

        /* renamed from: c */
        final /* synthetic */ C21582f f178037c;

        static {
            Covode.recordClassIndex(92410);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C83681c get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C83681c(this.f178036b, fVar);
        }

        public C79223t(C2553d dVar, AbstractC22186b bVar, C21582f fVar) {
            this.f178035a = dVar;
            this.f178036b = bVar;
            this.f178037c = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ad$u */
    public static final class C79224u extends AbstractC21603p<TTEPRecordChooseMusicComponent> {

        /* renamed from: a */
        final /* synthetic */ C2553d f178038a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f178039b;

        /* renamed from: c */
        final /* synthetic */ C21582f f178040c;

        static {
            Covode.recordClassIndex(92411);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ TTEPRecordChooseMusicComponent get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new TTEPRecordChooseMusicComponent(this.f178039b, fVar);
        }

        public C79224u(C2553d dVar, AbstractC22186b bVar, C21582f fVar) {
            this.f178038a = dVar;
            this.f178039b = bVar;
            this.f178040c = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ad$x */
    public static final class C79227x extends AbstractC21603p<C14395g> {

        /* renamed from: a */
        final /* synthetic */ C2553d f178047a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f178048b;

        /* renamed from: c */
        final /* synthetic */ C21582f f178049c;

        static {
            Covode.recordClassIndex(92414);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C14395g get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return C75393k.m132222a(fVar, this.f178048b);
        }

        public C79227x(C2553d dVar, AbstractC22186b bVar, C21582f fVar) {
            this.f178047a = dVar;
            this.f178048b = bVar;
            this.f178049c = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ad$j */
    public static final class C79213j extends AbstractC21603p<TTEPRecordBottomTabComponent> {

        /* renamed from: a */
        final /* synthetic */ C2553d f178004a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f178005b;

        /* renamed from: c */
        final /* synthetic */ C21582f f178006c;

        static {
            Covode.recordClassIndex(92400);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ TTEPRecordBottomTabComponent get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            AbstractC22186b bVar = this.f178005b;
            C89219l.m154721d(fVar, "");
            return new TTEPRecordBottomTabComponent(bVar, fVar, new ArrayList());
        }

        public C79213j(C2553d dVar, AbstractC22186b bVar, C21582f fVar) {
            this.f178004a = dVar;
            this.f178005b = bVar;
            this.f178006c = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ad$v */
    public static final class C79225v extends AbstractC21603p<C83913f> {

        /* renamed from: a */
        final /* synthetic */ C2553d f178041a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f178042b;

        /* renamed from: c */
        final /* synthetic */ C21582f f178043c;

        static {
            Covode.recordClassIndex(92412);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C83913f get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C40801b().mo70037a(this.f178042b, fVar, new C79255a());
        }

        public C79225v(C2553d dVar, AbstractC22186b bVar, C21582f fVar) {
            this.f178041a = dVar;
            this.f178042b = bVar;
            this.f178043c = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ad$w */
    public static final class C79226w extends AbstractC21603p<C83858b> {

        /* renamed from: a */
        final /* synthetic */ C2553d f178044a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f178045b;

        /* renamed from: c */
        final /* synthetic */ C21582f f178046c;

        static {
            Covode.recordClassIndex(92413);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C83858b get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C83858b(this.f178045b, fVar, new C79253a());
        }

        public C79226w(C2553d dVar, AbstractC22186b bVar, C21582f fVar) {
            this.f178044a = dVar;
            this.f178045b = bVar;
            this.f178046c = fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ttep.ad$y */
    public static final class C79228y extends AbstractC21603p<C83809g> {

        /* renamed from: a */
        final /* synthetic */ C2553d f178050a;

        /* renamed from: b */
        final /* synthetic */ AbstractC22186b f178051b;

        /* renamed from: c */
        final /* synthetic */ C21582f f178052c;

        static {
            Covode.recordClassIndex(92415);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // com.bytedance.p1559o.AbstractC21603p
        public final /* synthetic */ C83809g get(C21582f fVar) {
            C89219l.m154721d(fVar, "");
            return new C83809g(fVar, this.f178051b, new C79303b());
        }

        public C79228y(C2553d dVar, AbstractC22186b bVar, C21582f fVar) {
            this.f178050a = dVar;
            this.f178051b = bVar;
            this.f178052c = fVar;
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.TTEPPageFactory
    /* renamed from: a */
    public final void mo108498a(AbstractC22186b bVar) {
        C89219l.m154721d(bVar, "");
        C21582f a = C2556g.m7472a(bVar, new C79229z(bVar, (C69926ch) bVar));
        C2551b bVar2 = new C2551b(C2552c.m7462a(bVar));
        C2553d dVar = new C2553d();
        AlsLogicContainer alsLogicContainer = bVar2.f7720a;
        alsLogicContainer.f7696d.mo35260a(C14325c.class, (String) null, (AbstractC21603p) new C79210g(dVar, bVar, a));
        alsLogicContainer.mo7005a(AbstractC14315b.class, C14325c.class);
        C2553d dVar2 = new C2553d();
        AlsLogicContainer alsLogicContainer2 = bVar2.f7720a;
        alsLogicContainer2.f7696d.mo35260a(C83728b.class, (String) null, (AbstractC21603p) new C79221r(dVar2, bVar, a));
        alsLogicContainer2.mo7005a(AbstractC83727a.class, C83728b.class);
        C2553d dVar3 = new C2553d();
        AlsLogicContainer alsLogicContainer3 = bVar2.f7720a;
        alsLogicContainer3.f7696d.mo35260a(C14151k.class, (String) null, (AbstractC21603p) new C79222s(dVar3, bVar, a));
        alsLogicContainer3.mo7005a(AbstractC14103e.class, C14151k.class);
        C2553d dVar4 = new C2553d();
        AlsLogicContainer alsLogicContainer4 = bVar2.f7720a;
        alsLogicContainer4.f7696d.mo35260a(C83681c.class, (String) null, (AbstractC21603p) new C79223t(dVar4, bVar, a));
        alsLogicContainer4.mo7005a(AbstractC83678a.class, C83681c.class);
        C2553d dVar5 = new C2553d();
        AlsLogicContainer alsLogicContainer5 = bVar2.f7720a;
        alsLogicContainer5.f7696d.mo35260a(TTEPRecordChooseMusicComponent.class, (String) null, (AbstractC21603p) new C79224u(dVar5, bVar, a));
        alsLogicContainer5.mo7005a(AbstractC83490a.class, TTEPRecordChooseMusicComponent.class);
        C2553d dVar6 = new C2553d();
        AlsLogicContainer alsLogicContainer6 = bVar2.f7720a;
        alsLogicContainer6.f7696d.mo35260a(C83913f.class, (String) null, (AbstractC21603p) new C79225v(dVar6, bVar, a));
        alsLogicContainer6.mo7005a(AbstractC83912e.class, C83913f.class);
        C2553d dVar7 = new C2553d();
        AlsLogicContainer alsLogicContainer7 = bVar2.f7720a;
        alsLogicContainer7.f7696d.mo35260a(C83858b.class, (String) null, (AbstractC21603p) new C79226w(dVar7, bVar, a));
        alsLogicContainer7.mo7005a(AbstractC83869f.class, C83858b.class);
        C2553d dVar8 = new C2553d();
        AlsLogicContainer alsLogicContainer8 = bVar2.f7720a;
        alsLogicContainer8.f7696d.mo35260a(C14395g.class, (String) null, (AbstractC21603p) new C79227x(dVar8, bVar, a));
        alsLogicContainer8.mo7005a(RecordStickerPanelViewModel.class, C14395g.class);
        C2553d dVar9 = new C2553d();
        AlsLogicContainer alsLogicContainer9 = bVar2.f7720a;
        alsLogicContainer9.f7696d.mo35260a(C83809g.class, (String) null, (AbstractC21603p) new C79228y(dVar9, bVar, a));
        alsLogicContainer9.mo7005a(AbstractC83746a.class, C83809g.class);
        C2553d dVar10 = new C2553d();
        AlsLogicContainer alsLogicContainer10 = bVar2.f7720a;
        alsLogicContainer10.f7696d.mo35260a(C79306a.class, (String) null, (AbstractC21603p) new C79211h(dVar10, bVar, a));
        alsLogicContainer10.mo7005a(AbstractC83881a.class, C79306a.class);
        C2553d dVar11 = new C2553d();
        AlsLogicContainer alsLogicContainer11 = bVar2.f7720a;
        alsLogicContainer11.f7696d.mo35260a(TTEPRecordDockBarComponent.class, (String) null, (AbstractC21603p) new C79212i(dVar11, bVar, a));
        alsLogicContainer11.mo7005a(AbstractC83634a.class, TTEPRecordDockBarComponent.class);
        C2553d dVar12 = new C2553d();
        AlsLogicContainer alsLogicContainer12 = bVar2.f7720a;
        alsLogicContainer12.f7696d.mo35260a(TTEPRecordBottomTabComponent.class, (String) null, (AbstractC21603p) new C79213j(dVar12, bVar, a));
        alsLogicContainer12.mo7005a(AbstractC83406b.class, TTEPRecordBottomTabComponent.class);
        C2553d dVar13 = new C2553d();
        AlsLogicContainer alsLogicContainer13 = bVar2.f7720a;
        alsLogicContainer13.f7696d.mo35260a(C83625c.class, (String) null, (AbstractC21603p) new C79214k(dVar13, bVar, a));
        alsLogicContainer13.mo7005a(AbstractC83623a.class, C83625c.class);
        C2553d dVar14 = new C2553d();
        AlsLogicContainer alsLogicContainer14 = bVar2.f7720a;
        alsLogicContainer14.f7696d.mo35260a(C14277a.class, (String) null, (AbstractC21603p) new C79215l(dVar14, bVar, a));
        alsLogicContainer14.mo7005a(FilterPanelViewModel.class, C14277a.class);
        C2553d dVar15 = new C2553d();
        AlsLogicContainer alsLogicContainer15 = bVar2.f7720a;
        alsLogicContainer15.f7696d.mo35260a(C14237a.class, (String) null, (AbstractC21603p) new C79216m(dVar15, bVar, a));
        alsLogicContainer15.mo7005a(AbstractC14213c.class, C14237a.class);
        C2553d dVar16 = new C2553d();
        AlsLogicContainer alsLogicContainer16 = bVar2.f7720a;
        alsLogicContainer16.f7696d.mo35260a(C83735b.class, (String) null, (AbstractC21603p) new C79217n(dVar16, bVar, a));
        alsLogicContainer16.mo7005a(AbstractC83734a.class, C83735b.class);
        C2553d dVar17 = new C2553d();
        AlsLogicContainer alsLogicContainer17 = bVar2.f7720a;
        alsLogicContainer17.f7696d.mo35260a(C69938b.class, (String) null, (AbstractC21603p) new C79218o(dVar17, bVar, a));
        alsLogicContainer17.mo7005a(AbstractC69937a.class, C69938b.class);
        C2553d dVar18 = new C2553d();
        AlsLogicContainer alsLogicContainer18 = bVar2.f7720a;
        alsLogicContainer18.f7696d.mo35260a(C71866b.class, (String) null, (AbstractC21603p) new C79204a(dVar18));
        alsLogicContainer18.mo7005a(AbstractC71864a.class, C71866b.class);
        C2553d dVar19 = new C2553d();
        AlsLogicContainer alsLogicContainer19 = bVar2.f7720a;
        alsLogicContainer19.f7696d.mo35260a(C72459d.class, (String) null, (AbstractC21603p) new C79205b(dVar19));
        alsLogicContainer19.mo7005a(AbstractC72453a.class, C72459d.class);
        C2553d dVar20 = new C2553d();
        AlsLogicContainer alsLogicContainer20 = bVar2.f7720a;
        alsLogicContainer20.f7696d.mo35260a(C83591c.class, (String) null, (AbstractC21603p) new C79206c(dVar20));
        alsLogicContainer20.mo7005a(AbstractC83566a.class, C83591c.class);
        Object a2 = a.mo35249a((Type) ShortVideoContext.class, (String) null);
        C89219l.m154716b(a2, "");
        if (C70659a.m124890a((ShortVideoContext) a2)) {
            C2553d dVar21 = new C2553d();
            AlsLogicContainer alsLogicContainer21 = bVar2.f7720a;
            alsLogicContainer21.f7696d.mo35260a(C70735z.class, (String) null, (AbstractC21603p) new C79219p(dVar21, bVar, a));
            alsLogicContainer21.mo7005a(DuetLayoutModeViewModel.class, C70735z.class);
        }
        CommentVideoModel commentVideoModel = ((ShortVideoContext) a.mo35249a((Type) ShortVideoContext.class, (String) null)).f155825j;
        if (CommentUtils.isDataValid(commentVideoModel)) {
            C2553d dVar22 = new C2553d();
            AlsLogicContainer alsLogicContainer22 = bVar2.f7720a;
            alsLogicContainer22.f7696d.mo35260a(C81788d.class, (String) null, (AbstractC21603p) new C79220q(dVar22, commentVideoModel, bVar, a));
            alsLogicContainer22.mo7005a(AbstractC81785a.class, C81788d.class);
        }
        C2553d dVar23 = new C2553d();
        AlsLogicContainer alsLogicContainer23 = bVar2.f7720a;
        alsLogicContainer23.f7696d.mo35260a(C84103b.class, (String) null, (AbstractC21603p) new C79207d(dVar23));
        alsLogicContainer23.mo7005a(AbstractC84102a.class, C84103b.class);
        C2553d dVar24 = new C2553d();
        AlsLogicContainer alsLogicContainer24 = bVar2.f7720a;
        alsLogicContainer24.f7696d.mo35260a(C73416l.class, (String) null, (AbstractC21603p) new C79208e(dVar24));
        alsLogicContainer24.mo7005a(AbstractC73415k.class, C73416l.class);
        C2553d dVar25 = new C2553d();
        AlsLogicContainer alsLogicContainer25 = bVar2.f7720a;
        alsLogicContainer25.f7696d.mo35260a(TTEPPreviewEffectLogicComponent.class, (String) null, (AbstractC21603p) new C79209f(dVar25));
        alsLogicContainer25.mo7005a(AbstractC79278a.class, TTEPPreviewEffectLogicComponent.class);
        bVar2.mo7031a();
    }
}
