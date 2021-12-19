package com.p2082ss.android.ugc.aweme.app.host;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.ActivityC0945e;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.p046f.p047a.AbstractC0924b;
import androidx.p046f.p047a.C0927d;
import androidx.p046f.p047a.C0928e;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeAgeThresholdSetting;
import com.bytedance.assem.arch.core.AbstractC12748a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.google.p1998c.p2001c.AbstractC27349ab;
import com.google.p1998c.p2001c.AbstractC27381ai;
import com.p2082ss.android.ugc.aweme.app.host.C33761c;
import com.p2082ss.android.ugc.aweme.comment.page.tag.api.C36858h;
import com.p2082ss.android.ugc.aweme.comment.page.tag.p2502b.C36861a;
import com.p2082ss.android.ugc.aweme.comment.page.tag.p2502b.C36862b;
import com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel.C36947h;
import com.p2082ss.android.ugc.aweme.comment.page.tag.viewmodel.C36948i;
import com.p2082ss.android.ugc.aweme.commercialize.e_commerce.pdp.log.PdpLogHelper;
import com.p2082ss.android.ugc.aweme.commercialize.e_commerce.pdp.p2546ui.C37712d;
import com.p2082ss.android.ugc.aweme.commercialize.e_commerce.wishlist.manager.C37764b;
import com.p2082ss.android.ugc.aweme.commercialize.e_commerce.wishlist.p2548b.C37738b;
import com.p2082ss.android.ugc.aweme.commercialize.e_commerce.wishlist.p2548b.C37739c;
import com.p2082ss.android.ugc.aweme.commercialize.e_commerce.wishlist.p2548b.C37740d;
import com.p2082ss.android.ugc.aweme.commercialize.e_commerce.wishlist.p2551e.C37753b;
import com.p2082ss.android.ugc.aweme.commercialize.preview.manager.AdsPreviewStateManager;
import com.p2082ss.android.ugc.aweme.commercialize.preview.p2613ui.AdsPreviewFragment;
import com.p2082ss.android.ugc.aweme.favorites.p2919a.C47185f;
import com.p2082ss.android.ugc.aweme.favorites.p2921c.C47202a;
import com.p2082ss.android.ugc.aweme.favorites.p2921c.C47203b;
import com.p2082ss.android.ugc.aweme.favorites.p2921c.C47204c;
import com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47604ac;
import com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47741x;
import com.p2082ss.android.ugc.aweme.favorites.p2928ui.C47742y;
import com.p2082ss.android.ugc.aweme.favorites.p2928ui.UserFavoritesActivity;
import com.p2082ss.android.ugc.aweme.music.assem.list.C60619q;
import com.p2082ss.android.ugc.aweme.music.assem.list.C60624u;
import com.p2082ss.android.ugc.aweme.music.assem.list.C60625v;
import com.p2082ss.android.ugc.aweme.music.assem.video.C60705d;
import com.p2082ss.android.ugc.aweme.music.search.C61055q;
import com.p2082ss.android.ugc.aweme.music.search.C61059t;
import com.p2082ss.android.ugc.aweme.music.search.C61060u;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifpanel.C54157a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifpanel.C54177e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifpanel.C54178f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifpanel.C54179g;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifpanel.GiphyViewModel;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifsearch.C54183b;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifsearch.GiphyAnalytics;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifsearch.giphy.AbstractC54184a;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifsearch.giphy.C54193c;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifsearch.giphy.C54194d;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.chat.feature.input.gifsearch.giphy.C54195e;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.p3180i.C55153b;
import com.p2082ss.android.ugc.aweme.profile.edit.C63534h;
import com.p2082ss.android.ugc.aweme.profile.edit.C63540l;
import com.p2082ss.android.ugc.aweme.profile.edit.C63541m;
import com.p2082ss.android.ugc.aweme.profile.edit.InstagramPresenter;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.C64004az;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.C64048bm;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.C64097ck;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.ProfileEditActivity;
import com.p2082ss.android.ugc.aweme.profile.p3576ui.p3577a.C63968b;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.C64642m;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.C64645o;
import com.p2082ss.android.ugc.aweme.profile.widgets.common.C64646p;
import com.p2082ss.android.ugc.aweme.profile.widgets.follow.C64764n;
import com.p2082ss.android.ugc.aweme.profile.widgets.follow.C64767p;
import com.p2082ss.android.ugc.aweme.profile.widgets.follow.C64768q;
import com.p2082ss.android.ugc.aweme.profile.widgets.follow.p3589a.C64714b;
import com.p2082ss.android.ugc.aweme.profile.widgets.recommend.user.C65123d;
import com.p2082ss.android.ugc.aweme.profile.widgets.recommend.user.C65158m;
import com.p2082ss.android.ugc.aweme.profile.widgets.recommend.user.C65159n;
import com.p2082ss.android.ugc.aweme.qrcode.C66413i;
import com.p2082ss.android.ugc.aweme.qrcode.QRCodeFragment;
import com.p2082ss.android.ugc.aweme.qrcode.p3652a.C66370b;
import com.p2082ss.android.ugc.aweme.qrcode.presenter.p3658a.C66437j;
import com.p2082ss.android.ugc.aweme.qrcode.presenter.p3658a.C66444k;
import com.p2082ss.android.ugc.aweme.recommend.users.profile.p3670a.C66654b;
import com.p2082ss.android.ugc.aweme.recommend.users.profile.p3671ui.C66740i;
import com.p2082ss.android.ugc.aweme.recommend.users.profile.p3671ui.C66741j;
import com.p2082ss.android.ugc.aweme.relation.api.C66860a;
import com.p2082ss.android.ugc.aweme.relation.api.C66861b;
import com.p2082ss.android.ugc.aweme.relation.api.C66863d;
import com.p2082ss.android.ugc.aweme.relation.viewmodel.C67101c;
import com.p2082ss.android.ugc.aweme.relation.viewmodel.C67102d;
import com.p2082ss.android.ugc.playerkit.model.C84224v;
import dagger.hilt.android.internal.p4538a.AbstractC88092a;
import dagger.hilt.android.internal.p4538a.AbstractC88093b;
import dagger.hilt.android.internal.p4538a.AbstractC88094c;
import dagger.hilt.android.internal.p4538a.AbstractC88095d;
import dagger.hilt.android.internal.p4538a.AbstractC88096e;
import dagger.hilt.android.internal.p4538a.AbstractC88097f;
import dagger.hilt.android.internal.p4540c.C88102b;
import dagger.hilt.android.internal.p4540c.C88103c;
import dagger.hilt.android.internal.p4540c.C88104d;
import dagger.hilt.android.p4537a.AbstractC88086a;
import dagger.hilt.android.p4537a.AbstractC88087b;
import dagger.hilt.android.p4537a.AbstractC88088c;
import dagger.hilt.android.p4537a.AbstractC88089d;
import dagger.hilt.android.p4537a.AbstractC88090e;
import dagger.hilt.android.p4537a.AbstractC88091f;
import dagger.p4535a.C88077b;
import dagger.p4535a.C88080e;
import dagger.p4535a.C88081f;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.p4631a.AbstractC89405a;
import p4560f.p4561a.AbstractC88398aa;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.app.host.j */
public final class C33775j extends C33761c.AbstractC33764c {

    /* renamed from: a */
    public final C88103c f79973a;

    static {
        Covode.recordClassIndex(40672);
    }

    /* renamed from: com.ss.android.ugc.aweme.app.host.j$c */
    public static final class C33791c {

        /* renamed from: a */
        C88103c f80034a;

        static {
            Covode.recordClassIndex(40688);
        }

        private C33791c() {
        }

        /* synthetic */ C33791c(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.app.host.j$b */
    final class C33777b extends C33761c.AbstractC33763b {

        /* renamed from: a */
        volatile AbstractC89405a<AbstractC54184a> f79975a;

        /* renamed from: b */
        volatile AbstractC89405a<GiphyAnalytics> f79976b;

        /* renamed from: c */
        volatile AbstractC89405a<GiphyViewModel.AbstractC54147a> f79977c;

        /* renamed from: d */
        volatile AbstractC89405a<AbstractC88398aa> f79978d;

        static {
            Covode.recordClassIndex(40674);
        }

        /* renamed from: com.ss.android.ugc.aweme.app.host.j$b$b */
        final class C33779b extends C33761c.AbstractC33762a {

            /* renamed from: A */
            private volatile AbstractC89405a<C65158m> f79982A;

            /* renamed from: B */
            private volatile AbstractC89405a<C36947h> f79983B;

            /* renamed from: C */
            private volatile Object f79984C;

            /* renamed from: D */
            private volatile Object f79985D;

            /* renamed from: E */
            private volatile Object f79986E;

            /* renamed from: F */
            private volatile Object f79987F;

            /* renamed from: a */
            public final Activity f79988a;

            /* renamed from: b */
            final C66860a f79989b;

            /* renamed from: c */
            final C36861a f79990c;

            /* renamed from: d */
            volatile AbstractC89405a<C60619q> f79991d;

            /* renamed from: e */
            volatile AbstractC89405a<C66863d> f79992e;

            /* renamed from: f */
            volatile AbstractC89405a<C61055q> f79993f;

            /* renamed from: g */
            volatile AbstractC89405a<C64764n> f79994g;

            /* renamed from: h */
            volatile AbstractC89405a<C64642m> f79995h;

            /* renamed from: i */
            volatile AbstractC89405a<C66654b> f79996i;

            /* renamed from: j */
            volatile AbstractC89405a<C65123d> f79997j;

            /* renamed from: k */
            volatile AbstractC89405a<C36858h> f79998k;

            /* renamed from: l */
            volatile AbstractC89405a<String> f79999l;

            /* renamed from: n */
            private volatile ActivityC0945e f80001n;

            /* renamed from: o */
            private volatile Object f80002o;

            /* renamed from: p */
            private volatile AbstractC89405a<Fragment> f80003p;

            /* renamed from: q */
            private volatile Object f80004q;

            /* renamed from: r */
            private volatile AbstractC89405a<C64004az> f80005r;

            /* renamed from: s */
            private volatile AbstractC89405a<C54178f> f80006s;

            /* renamed from: t */
            private volatile AbstractC89405a<C60705d> f80007t;

            /* renamed from: u */
            private volatile AbstractC89405a<C60624u> f80008u;

            /* renamed from: v */
            private volatile AbstractC89405a<C67101c> f80009v;

            /* renamed from: w */
            private volatile AbstractC89405a<C61059t> f80010w;

            /* renamed from: x */
            private volatile AbstractC89405a<C64767p> f80011x;

            /* renamed from: y */
            private volatile AbstractC89405a<C64645o> f80012y;

            /* renamed from: z */
            private volatile AbstractC89405a<C66740i> f80013z;

            static {
                Covode.recordClassIndex(40676);
            }

            /* renamed from: com.ss.android.ugc.aweme.app.host.j$b$b$d */
            final class C33783d extends C33761c.AbstractC33766e {

                /* renamed from: b */
                private volatile Object f80020b;

                /* renamed from: c */
                private volatile AbstractC89405a<C47185f> f80021c;

                static {
                    Covode.recordClassIndex(40680);
                }

                @Override // dagger.hilt.android.internal.managers.C88116g.AbstractC88119c
                /* renamed from: a */
                public final AbstractC88097f mo60024a() {
                    return new C33785b(this, (byte) 0);
                }

                /* renamed from: com.ss.android.ugc.aweme.app.host.j$b$b$d$a */
                final class C33784a<T> implements AbstractC89405a<T> {

                    /* renamed from: b */
                    private final int f80023b = 0;

                    static {
                        Covode.recordClassIndex(40681);
                    }

                    @Override // javax.p4631a.AbstractC89405a
                    public final T get() {
                        if (this.f80023b == 0) {
                            C33783d dVar = C33783d.this;
                            AbstractC0952i e = C33779b.this.mo60011e();
                            Activity activity = C33779b.this.f79988a;
                            C33779b.this.mo60012f();
                            C33779b.this.mo60013g();
                            return (T) new C47185f(e, activity);
                        }
                        throw new AssertionError(this.f80023b);
                    }

                    C33784a() {
                    }
                }

                /* renamed from: com.ss.android.ugc.aweme.app.host.j$b$b$d$b */
                final class C33785b implements AbstractC33774i {

                    /* renamed from: b */
                    private View f80025b;

                    static {
                        Covode.recordClassIndex(40682);
                    }

                    @Override // dagger.hilt.android.internal.p4538a.AbstractC88097f
                    /* renamed from: a */
                    public final /* synthetic */ AbstractC88091f mo60031a() {
                        if (this.f80025b != null) {
                            return new C33786c(C33783d.this, (byte) 0);
                        }
                        throw new IllegalStateException(View.class.getCanonicalName() + " must be set");
                    }

                    private C33785b() {
                    }

                    @Override // dagger.hilt.android.internal.p4538a.AbstractC88097f
                    /* renamed from: a */
                    public final /* bridge */ /* synthetic */ AbstractC88097f mo60032a(View view) {
                        this.f80025b = (View) C88081f.m153152a(view);
                        return this;
                    }

                    /* synthetic */ C33785b(C33783d dVar, byte b) {
                        this();
                    }
                }

                /* renamed from: b */
                private C37764b m69132b() {
                    Object obj;
                    MethodCollector.m26663i(3920);
                    Object obj2 = this.f80020b;
                    if (obj2 instanceof C88080e) {
                        synchronized (obj2) {
                            try {
                                obj = this.f80020b;
                                if (obj instanceof C88080e) {
                                    obj = C37740d.m76369a(C37739c.m76368a(), C37738b.m76367a());
                                    this.f80020b = C88077b.m153148a(this.f80020b, obj);
                                }
                            } catch (Throwable th) {
                                MethodCollector.m26664o(3920);
                                throw th;
                            }
                        }
                        obj2 = obj;
                    }
                    C37764b bVar = (C37764b) obj2;
                    MethodCollector.m26664o(3920);
                    return bVar;
                }

                /* renamed from: com.ss.android.ugc.aweme.app.host.j$b$b$d$c */
                final class C33786c extends C33761c.AbstractC33768g {
                    static {
                        Covode.recordClassIndex(40683);
                    }

                    private C33786c() {
                    }

                    /* synthetic */ C33786c(C33783d dVar, byte b) {
                        this();
                    }
                }

                private C33783d() {
                    this.f80020b = new C88080e();
                }

                @Override // com.p2082ss.android.ugc.aweme.commercialize.e_commerce.pdp.p2546ui.AbstractC37734e
                /* renamed from: a */
                public final void mo60025a(C37712d dVar) {
                    dVar.f89090a = new PdpLogHelper();
                }

                @Override // com.p2082ss.android.ugc.aweme.commercialize.e_commerce.wishlist.p2551e.AbstractC37758c
                /* renamed from: a */
                public final void mo60026a(C37753b bVar) {
                    bVar.f89154a = m69132b();
                }

                @Override // com.p2082ss.android.ugc.aweme.commercialize.preview.p2613ui.AbstractC38340a
                /* renamed from: a */
                public final void mo60027a(AdsPreviewFragment adsPreviewFragment) {
                    adsPreviewFragment.f90573a = new AdsPreviewStateManager();
                }

                @Override // com.p2082ss.android.ugc.aweme.favorites.p2928ui.AbstractC47603ab
                /* renamed from: a */
                public final void mo60028a(C47742y yVar) {
                    AbstractC89405a aVar = this.f80021c;
                    if (aVar == null) {
                        aVar = new C33784a();
                        this.f80021c = aVar;
                    }
                    C47604ac.m90638a(yVar, C88077b.m153150b(aVar));
                    C33779b bVar = C33779b.this;
                    AbstractC89405a aVar2 = bVar.f79999l;
                    if (aVar2 == null) {
                        aVar2 = new C33787e(20);
                        bVar.f79999l = aVar2;
                    }
                    C47604ac.m90639b(yVar, C88077b.m153150b(aVar2));
                }

                @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64096cj
                /* renamed from: a */
                public final void mo60029a(C64048bm bmVar) {
                    InstagramPresenter instagramPresenter = new InstagramPresenter();
                    instagramPresenter.f144141b = C33779b.this.mo60009c();
                    instagramPresenter.f144142c = C33779b.this.mo60005a();
                    C64097ck.m116002a(bmVar, instagramPresenter);
                    C63534h hVar = new C63534h();
                    C63540l.m115143a(hVar, C33779b.this.mo60009c());
                    C63540l.m115142a(hVar, C33779b.this.mo60005a());
                    C64097ck.m116003a(bmVar, hVar);
                    C64097ck.m116004a(bmVar, new C63541m(C33779b.this.mo60005a(), C33779b.this.mo60009c()));
                }

                @Override // com.p2082ss.android.ugc.aweme.qrcode.AbstractC66412h
                /* renamed from: a */
                public final void mo60030a(QRCodeFragment qRCodeFragment) {
                    C66437j jVar = new C66437j();
                    C66444k.m118175a(jVar, C33779b.this.mo60014h());
                    C66444k.m118174a(jVar, C33779b.this.mo60005a());
                    C66413i.m118116a(qRCodeFragment, jVar);
                }

                /* synthetic */ C33783d(C33779b bVar, byte b) {
                    this();
                }
            }

            @Override // dagger.hilt.android.internal.managers.C88110c.AbstractC88111a
            /* renamed from: j */
            public final AbstractC88094c mo60016j() {
                return new C33780a(this, (byte) 0);
            }

            @Override // dagger.hilt.android.internal.managers.C88113e.AbstractC88114a
            /* renamed from: k */
            public final AbstractC88095d mo60017k() {
                return new C33782c(this, (byte) 0);
            }

            @Override // dagger.hilt.android.internal.managers.C88116g.AbstractC88118b
            /* renamed from: l */
            public final AbstractC88096e mo60018l() {
                return new C33788f(this, (byte) 0);
            }

            /* renamed from: a */
            public final ActivityC0945e mo60005a() {
                ActivityC0945e eVar = this.f80001n;
                if (eVar != null) {
                    return eVar;
                }
                ActivityC0945e a = C88102b.m153174a(this.f79988a);
                this.f80001n = a;
                return a;
            }

            /* renamed from: com.ss.android.ugc.aweme.app.host.j$b$b$b */
            final class C33781b extends C33761c.AbstractC33765d {
                static {
                    Covode.recordClassIndex(40678);
                }

                @Override // dagger.hilt.android.internal.p4539b.C88098a.AbstractC88100b
                /* renamed from: a */
                public final Set<C1175ad.AbstractC1177b> mo60021a() {
                    return AbstractC27381ai.m54719of(C0928e.m3143a(C88104d.m153176a(C33775j.this.f79973a), C33779b.this.mo60010d()));
                }

                private C33781b() {
                }

                /* synthetic */ C33781b(C33779b bVar, byte b) {
                    this();
                }
            }

            @Override // dagger.hilt.android.internal.p4539b.C88098a.AbstractC88099a
            /* renamed from: i */
            public final Set<C1175ad.AbstractC1177b> mo60015i() {
                return AbstractC27381ai.m54719of(C0927d.m3142a(this.f79988a, C88104d.m153176a(C33775j.this.f79973a), mo60010d()));
            }

            /* renamed from: com.ss.android.ugc.aweme.app.host.j$b$b$a */
            final class C33780a implements AbstractC33771f {

                /* renamed from: b */
                private AbstractC12748a f80015b;

                static {
                    Covode.recordClassIndex(40677);
                }

                @Override // dagger.hilt.android.internal.p4538a.AbstractC88094c
                /* renamed from: a */
                public final /* synthetic */ AbstractC88088c mo60019a() {
                    if (this.f80015b != null) {
                        return new C33781b(C33779b.this, (byte) 0);
                    }
                    throw new IllegalStateException(AbstractC12748a.class.getCanonicalName() + " must be set");
                }

                private C33780a() {
                }

                @Override // dagger.hilt.android.internal.p4538a.AbstractC88094c
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ AbstractC88094c mo60020a(AbstractC12748a aVar) {
                    this.f80015b = (AbstractC12748a) C88081f.m153152a(aVar);
                    return this;
                }

                /* synthetic */ C33780a(C33779b bVar, byte b) {
                    this();
                }
            }

            /* renamed from: com.ss.android.ugc.aweme.app.host.j$b$b$c */
            final class C33782c implements AbstractC33772g {

                /* renamed from: b */
                private Fragment f80018b;

                static {
                    Covode.recordClassIndex(40679);
                }

                @Override // dagger.hilt.android.internal.p4538a.AbstractC88095d
                /* renamed from: a */
                public final /* synthetic */ AbstractC88089d mo60022a() {
                    if (this.f80018b != null) {
                        return new C33783d(C33779b.this, (byte) 0);
                    }
                    throw new IllegalStateException(Fragment.class.getCanonicalName() + " must be set");
                }

                private C33782c() {
                }

                @Override // dagger.hilt.android.internal.p4538a.AbstractC88095d
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ AbstractC88095d mo60023a(Fragment fragment) {
                    this.f80018b = (Fragment) C88081f.m153152a(fragment);
                    return this;
                }

                /* synthetic */ C33782c(C33779b bVar, byte b) {
                    this();
                }
            }

            /* renamed from: com.ss.android.ugc.aweme.app.host.j$b$b$f */
            final class C33788f implements AbstractC33773h {

                /* renamed from: b */
                private View f80030b;

                static {
                    Covode.recordClassIndex(40685);
                }

                @Override // dagger.hilt.android.internal.p4538a.AbstractC88096e
                /* renamed from: a */
                public final /* synthetic */ AbstractC88090e mo60033a() {
                    if (this.f80030b != null) {
                        return new C33789g(C33779b.this, (byte) 0);
                    }
                    throw new IllegalStateException(View.class.getCanonicalName() + " must be set");
                }

                private C33788f() {
                }

                @Override // dagger.hilt.android.internal.p4538a.AbstractC88096e
                /* renamed from: a */
                public final /* bridge */ /* synthetic */ AbstractC88096e mo60034a(View view) {
                    this.f80030b = (View) C88081f.m153152a(view);
                    return this;
                }

                /* synthetic */ C33788f(C33779b bVar, byte b) {
                    this();
                }
            }

            /* renamed from: b */
            public final Fragment mo60008b() {
                Object obj;
                MethodCollector.m26663i(357);
                Object obj2 = this.f80002o;
                if (obj2 instanceof C88080e) {
                    synchronized (obj2) {
                        try {
                            obj = this.f80002o;
                            if (obj instanceof C88080e) {
                                obj = C47204c.m90377a(mo60005a());
                                this.f80002o = C88077b.m153148a(this.f80002o, obj);
                            }
                        } catch (Throwable th) {
                            MethodCollector.m26664o(357);
                            throw th;
                        }
                    }
                    obj2 = obj;
                }
                Fragment fragment = (Fragment) obj2;
                MethodCollector.m26664o(357);
                return fragment;
            }

            /* renamed from: c */
            public final C64004az mo60009c() {
                Object obj;
                MethodCollector.m26663i(364);
                Object obj2 = this.f80004q;
                if (obj2 instanceof C88080e) {
                    synchronized (obj2) {
                        try {
                            obj = this.f80004q;
                            if (obj instanceof C88080e) {
                                obj = C63968b.m115687a(mo60005a());
                                this.f80004q = C88077b.m153148a(this.f80004q, obj);
                            }
                        } catch (Throwable th) {
                            MethodCollector.m26664o(364);
                            throw th;
                        }
                    }
                    obj2 = obj;
                }
                C64004az azVar = (C64004az) obj2;
                MethodCollector.m26664o(364);
                return azVar;
            }

            /* renamed from: e */
            public final AbstractC0952i mo60011e() {
                Object obj;
                MethodCollector.m26663i(410);
                Object obj2 = this.f79984C;
                if (obj2 instanceof C88080e) {
                    synchronized (obj2) {
                        try {
                            obj = this.f79984C;
                            if (obj instanceof C88080e) {
                                obj = C47203b.m90376a(mo60008b());
                                this.f79984C = C88077b.m153148a(this.f79984C, obj);
                            }
                        } catch (Throwable th) {
                            MethodCollector.m26664o(410);
                            throw th;
                        }
                    }
                    obj2 = obj;
                }
                AbstractC0952i iVar = (AbstractC0952i) obj2;
                MethodCollector.m26664o(410);
                return iVar;
            }

            /* renamed from: h */
            public final QRCodeFragment mo60014h() {
                Object obj;
                MethodCollector.m26663i(476);
                Object obj2 = this.f79987F;
                if (obj2 instanceof C88080e) {
                    synchronized (obj2) {
                        try {
                            obj = this.f79987F;
                            if (obj instanceof C88080e) {
                                obj = C66370b.m118057a(mo60005a());
                                this.f79987F = C88077b.m153148a(this.f79987F, obj);
                            }
                        } catch (Throwable th) {
                            MethodCollector.m26664o(476);
                            throw th;
                        }
                    }
                    obj2 = obj;
                }
                QRCodeFragment qRCodeFragment = (QRCodeFragment) obj2;
                MethodCollector.m26664o(476);
                return qRCodeFragment;
            }

            /* renamed from: f */
            public final String mo60012f() {
                Object obj;
                MethodCollector.m26663i(429);
                Object obj2 = this.f79985D;
                if (obj2 instanceof C88080e) {
                    synchronized (obj2) {
                        try {
                            obj = this.f79985D;
                            if (obj instanceof C88080e) {
                                ActivityC0945e a = mo60005a();
                                C89219l.m154721d(a, "");
                                if (a.getIntent() == null) {
                                    obj = "personal_homepage";
                                } else if (a.getIntent().hasExtra("enter_from")) {
                                    obj = C47202a.m90375a(a.getIntent(), "enter_from");
                                } else {
                                    obj = "h5";
                                }
                                this.f79985D = C88077b.m153148a(this.f79985D, obj);
                            }
                        } catch (Throwable th) {
                            MethodCollector.m26664o(429);
                            throw th;
                        }
                    }
                    obj2 = obj;
                }
                String str = (String) obj2;
                MethodCollector.m26664o(429);
                return str;
            }

            /* renamed from: d */
            public final Map<String, AbstractC89405a<AbstractC0924b<? extends AbstractC1174ac>>> mo60010d() {
                AbstractC27349ab.C27351a builderWithExpectedSize = AbstractC27349ab.builderWithExpectedSize(10);
                AbstractC89405a aVar = this.f80006s;
                if (aVar == null) {
                    aVar = new C33787e(2);
                    this.f80006s = aVar;
                }
                AbstractC27349ab.C27351a a = builderWithExpectedSize.mo45567a("com.ss.android.ugc.aweme.im.sdk.chat.feature.input.gifpanel.GiphyViewModel", aVar);
                AbstractC89405a aVar2 = this.f80007t;
                if (aVar2 == null) {
                    aVar2 = new C33787e(3);
                    this.f80007t = aVar2;
                }
                AbstractC27349ab.C27351a a2 = a.mo45567a("com.ss.android.ugc.aweme.music.assem.video.MusicPlayViewModel", aVar2);
                AbstractC89405a aVar3 = this.f80008u;
                if (aVar3 == null) {
                    aVar3 = new C33787e(4);
                    this.f80008u = aVar3;
                }
                AbstractC27349ab.C27351a a3 = a2.mo45567a("com.ss.android.ugc.aweme.music.assem.list.OriginMusicListViewModel", aVar3);
                AbstractC89405a aVar4 = this.f80009v;
                if (aVar4 == null) {
                    aVar4 = new C33787e(6);
                    this.f80009v = aVar4;
                }
                AbstractC27349ab.C27351a a4 = a3.mo45567a("com.ss.android.ugc.aweme.relation.viewmodel.RecFriendsListViewModel", aVar4);
                AbstractC89405a aVar5 = this.f80010w;
                if (aVar5 == null) {
                    aVar5 = new C33787e(8);
                    this.f80010w = aVar5;
                }
                AbstractC27349ab.C27351a a5 = a4.mo45567a("com.ss.android.ugc.aweme.music.search.SearchMusicListViewModel", aVar5);
                AbstractC89405a aVar6 = this.f80011x;
                if (aVar6 == null) {
                    aVar6 = new C33787e(10);
                    this.f80011x = aVar6;
                }
                AbstractC27349ab.C27351a a6 = a5.mo45567a("com.ss.android.ugc.aweme.profile.widgets.follow.UserProfileFollowVM", aVar6);
                AbstractC89405a aVar7 = this.f80012y;
                if (aVar7 == null) {
                    aVar7 = new C33787e(12);
                    this.f80012y = aVar7;
                }
                AbstractC27349ab.C27351a a7 = a6.mo45567a("com.ss.android.ugc.aweme.profile.widgets.common.UserProfileInfoVM", aVar7);
                AbstractC89405a aVar8 = this.f80013z;
                if (aVar8 == null) {
                    aVar8 = new C33787e(14);
                    this.f80013z = aVar8;
                }
                AbstractC27349ab.C27351a a8 = a7.mo45567a("com.ss.android.ugc.aweme.recommend.users.profile.ui.UserProfilePublishListRecommendUserVM", aVar8);
                AbstractC89405a aVar9 = this.f79982A;
                if (aVar9 == null) {
                    aVar9 = new C33787e(16);
                    this.f79982A = aVar9;
                }
                AbstractC27349ab.C27351a a9 = a8.mo45567a("com.ss.android.ugc.aweme.profile.widgets.recommend.user.UserProfileRecommendUserVM", aVar9);
                AbstractC89405a aVar10 = this.f79983B;
                if (aVar10 == null) {
                    aVar10 = new C33787e(18);
                    this.f79983B = aVar10;
                }
                return a9.mo45567a("com.ss.android.ugc.aweme.comment.page.tag.viewmodel.VideoTagFriendsListViewModel", aVar10).mo45568a();
            }

            /* renamed from: g */
            public final ArrayList<String> mo60013g() {
                Object obj;
                String str;
                List<String> list;
                MethodCollector.m26663i(464);
                Object obj2 = this.f79986E;
                if (obj2 instanceof C88080e) {
                    synchronized (obj2) {
                        try {
                            obj = this.f79986E;
                            if (obj instanceof C88080e) {
                                ActivityC0945e a = mo60005a();
                                C89219l.m154721d(a, "");
                                obj = null;
                                if (a.getIntent() != null) {
                                    if (a.getIntent().hasExtra("tab_name")) {
                                        str = C47202a.m90375a(a.getIntent(), "tab_name");
                                    } else {
                                        str = null;
                                    }
                                    if (a.getIntent().hasExtra("push_ids")) {
                                        String a2 = C47202a.m90375a(a.getIntent(), "push_ids");
                                        if (C89219l.m154714a((Object) "compilation", (Object) str)) {
                                            if (a2 != null) {
                                                list = C89361p.m154915b(a2, new String[]{","});
                                            } else {
                                                list = null;
                                            }
                                            if (list != null) {
                                                obj = new ArrayList(list);
                                            }
                                        }
                                    }
                                }
                                this.f79986E = C88077b.m153148a(this.f79986E, obj);
                            }
                        } catch (Throwable th) {
                            MethodCollector.m26664o(464);
                            throw th;
                        }
                    }
                    obj2 = obj;
                }
                ArrayList<String> arrayList = (ArrayList) obj2;
                MethodCollector.m26664o(464);
                return arrayList;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: com.ss.android.ugc.aweme.app.host.j$b$b$e */
            public final class C33787e<T> implements AbstractC89405a<T> {

                /* renamed from: b */
                private final int f80028b;

                static {
                    Covode.recordClassIndex(40684);
                }

                @Override // javax.p4631a.AbstractC89405a
                public final T get() {
                    switch (this.f80028b) {
                        case 0:
                            return (T) C33779b.this.mo60008b();
                        case 1:
                            return (T) C33779b.this.mo60009c();
                        case 2:
                            C33779b bVar = C33779b.this;
                            C33777b bVar2 = C33777b.this;
                            AbstractC89405a aVar = bVar2.f79975a;
                            if (aVar == null) {
                                aVar = new C33790c(0);
                                bVar2.f79975a = aVar;
                            }
                            C33777b bVar3 = C33777b.this;
                            AbstractC89405a aVar2 = bVar3.f79976b;
                            if (aVar2 == null) {
                                aVar2 = new C33790c(1);
                                bVar3.f79976b = aVar2;
                            }
                            C33777b bVar4 = C33777b.this;
                            AbstractC89405a aVar3 = bVar4.f79977c;
                            if (aVar3 == null) {
                                aVar3 = new C33790c(2);
                                bVar4.f79977c = aVar3;
                            }
                            C33777b bVar5 = C33777b.this;
                            AbstractC89405a aVar4 = bVar5.f79978d;
                            if (aVar4 == null) {
                                aVar4 = new C33790c(3);
                                bVar5.f79978d = aVar4;
                            }
                            return (T) C54179g.m99450a(aVar, aVar2, aVar3, aVar4);
                        case 3:
                            return (T) new C60705d();
                        case 4:
                            C33779b bVar6 = C33779b.this;
                            AbstractC89405a aVar5 = bVar6.f79991d;
                            if (aVar5 == null) {
                                aVar5 = new C33787e(5);
                                bVar6.f79991d = aVar5;
                            }
                            return (T) C60625v.m110185a(aVar5);
                        case ABRConfig.ABR_STARTUP_MODEL_KEY:
                            return (T) new C60619q();
                        case ABRConfig.ABR_PLAYER_DISPLAY_WIDTH_KEY:
                            C33779b bVar7 = C33779b.this;
                            AbstractC89405a aVar6 = bVar7.f79992e;
                            if (aVar6 == null) {
                                aVar6 = new C33787e(7);
                                bVar7.f79992e = aVar6;
                            }
                            return (T) C67102d.m118756a(aVar6);
                        case ABRConfig.ABR_PLAYER_DISPLAY_HEIGHT_KEY:
                            T t = (T) new C66863d();
                            t.f150134a = C66861b.m118566a();
                            return t;
                        case ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY:
                            C33779b bVar8 = C33779b.this;
                            AbstractC89405a aVar7 = bVar8.f79993f;
                            if (aVar7 == null) {
                                aVar7 = new C33787e(9);
                                bVar8.f79993f = aVar7;
                            }
                            return (T) C61060u.m110555a(aVar7);
                        case ABRConfig.ABR_STALL_PENALTY_PARAMETER_KEY:
                            return (T) new C61055q();
                        case ABRConfig.ABR_SWITCH_PENALTY_PARAMETER_KEY:
                            C33779b bVar9 = C33779b.this;
                            AbstractC89405a aVar8 = bVar9.f79994g;
                            if (aVar8 == null) {
                                aVar8 = new C33787e(11);
                                bVar9.f79994g = aVar8;
                            }
                            return (T) C64768q.m116609a(aVar8);
                        case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
                            return (T) new C64764n(C64714b.m116571a());
                        case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
                            C33779b bVar10 = C33779b.this;
                            AbstractC89405a aVar9 = bVar10.f79995h;
                            if (aVar9 == null) {
                                aVar9 = new C33787e(13);
                                bVar10.f79995h = aVar9;
                            }
                            return (T) C64646p.m116544a(aVar9);
                        case ABRConfig.ABR_STARTUP_MAX_BITRATE:
                            return (T) new C64642m();
                        case ABRConfig.ABR_SELECT_SCENE:
                            C33779b bVar11 = C33779b.this;
                            AbstractC89405a aVar10 = bVar11.f79996i;
                            if (aVar10 == null) {
                                aVar10 = new C33787e(15);
                                bVar11.f79996i = aVar10;
                            }
                            return (T) C66741j.m118528a(aVar10);
                        case 15:
                            return (T) new C66654b();
                        case 16:
                            C33779b bVar12 = C33779b.this;
                            AbstractC89405a aVar11 = bVar12.f79997j;
                            if (aVar11 == null) {
                                aVar11 = new C33787e(17);
                                bVar12.f79997j = aVar11;
                            }
                            return (T) C65159n.m116850a(aVar11);
                        case 17:
                            return (T) new C65123d();
                        case LiveRechargeAgeThresholdSetting.DEFAULT:
                            C33779b bVar13 = C33779b.this;
                            AbstractC89405a aVar12 = bVar13.f79998k;
                            if (aVar12 == null) {
                                aVar12 = new C33787e(19);
                                bVar13.f79998k = aVar12;
                            }
                            return (T) C36948i.m74560a(aVar12);
                        case 19:
                            T t2 = (T) new C36858h();
                            t2.f86844a = C36862b.m74502a();
                            return t2;
                        case C84224v.f188239U /*{ENCODED_INT: 20}*/:
                            return (T) C33779b.this.mo60012f();
                        default:
                            throw new AssertionError(this.f80028b);
                    }
                }

                C33787e(int i) {
                    this.f80028b = i;
                }
            }

            /* renamed from: com.ss.android.ugc.aweme.app.host.j$b$b$g */
            final class C33789g extends C33761c.AbstractC33767f {
                static {
                    Covode.recordClassIndex(40686);
                }

                private C33789g() {
                }

                /* synthetic */ C33789g(C33779b bVar, byte b) {
                    this();
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.favorites.p2928ui.AbstractC47740w
            /* renamed from: a */
            public final void mo60006a(UserFavoritesActivity userFavoritesActivity) {
                AbstractC89405a aVar = this.f80003p;
                if (aVar == null) {
                    aVar = new C33787e(0);
                    this.f80003p = aVar;
                }
                C47741x.m90791a(userFavoritesActivity, C88077b.m153150b(aVar));
            }

            @Override // com.p2082ss.android.ugc.aweme.profile.p3576ui.AbstractC64023bi
            /* renamed from: a */
            public final void mo60007a(ProfileEditActivity profileEditActivity) {
                AbstractC89405a aVar = this.f80005r;
                if (aVar == null) {
                    aVar = new C33787e(1);
                    this.f80005r = aVar;
                }
                profileEditActivity.f145007a = C88077b.m153150b(aVar);
            }

            private C33779b(C66860a aVar, C36861a aVar2, Activity activity) {
                this.f80002o = new C88080e();
                this.f80004q = new C88080e();
                this.f79984C = new C88080e();
                this.f79985D = new C88080e();
                this.f79986E = new C88080e();
                this.f79987F = new C88080e();
                this.f79988a = activity;
                this.f79989b = aVar;
                this.f79990c = aVar2;
            }

            /* synthetic */ C33779b(C33777b bVar, C66860a aVar, C36861a aVar2, Activity activity, byte b) {
                this(aVar, aVar2, activity);
            }
        }

        @Override // dagger.hilt.android.internal.managers.C88107a.AbstractC88108a
        /* renamed from: a */
        public final AbstractC88092a mo60002a() {
            return new C33778a(this, (byte) 0);
        }

        /* renamed from: com.ss.android.ugc.aweme.app.host.j$b$a */
        final class C33778a implements AbstractC33769d {

            /* renamed from: b */
            private Activity f79981b;

            static {
                Covode.recordClassIndex(40675);
            }

            @Override // dagger.hilt.android.internal.p4538a.AbstractC88092a
            /* renamed from: a */
            public final /* synthetic */ AbstractC88086a mo60003a() {
                if (this.f79981b != null) {
                    return new C33779b(C33777b.this, new C66860a(), new C36861a(), this.f79981b, (byte) 0);
                }
                throw new IllegalStateException(Activity.class.getCanonicalName() + " must be set");
            }

            private C33778a() {
            }

            @Override // dagger.hilt.android.internal.p4538a.AbstractC88092a
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ AbstractC88092a mo60004a(Activity activity) {
                this.f79981b = (Activity) C88081f.m153152a(activity);
                return this;
            }

            /* synthetic */ C33778a(C33777b bVar, byte b) {
                this();
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.app.host.j$b$c */
        final class C33790c<T> implements AbstractC89405a<T> {

            /* renamed from: b */
            private final int f80033b;

            static {
                Covode.recordClassIndex(40687);
            }

            @Override // javax.p4631a.AbstractC89405a
            public final T get() {
                int i = this.f80033b;
                if (i == 0) {
                    return (T) C54195e.m99459a(C54194d.m99458a(C54193c.m99457a()));
                }
                if (i == 1) {
                    return (T) C54183b.m99453a();
                }
                if (i == 2) {
                    return (T) C54177e.m99448a(new C54157a.C54163d());
                }
                if (i == 3) {
                    return (T) C55153b.m100861a();
                }
                throw new AssertionError(this.f80033b);
            }

            C33790c(int i) {
                this.f80033b = i;
            }
        }

        private C33777b() {
        }

        /* synthetic */ C33777b(C33775j jVar, byte b) {
            this();
        }
    }

    @Override // dagger.hilt.android.internal.managers.ActivityRetainedComponentManager.AbstractC88106a
    /* renamed from: a */
    public final AbstractC88093b mo60000a() {
        return new C33776a(this, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.app.host.j$a */
    final class C33776a implements AbstractC33770e {
        static {
            Covode.recordClassIndex(40673);
        }

        @Override // dagger.hilt.android.internal.p4538a.AbstractC88093b
        /* renamed from: a */
        public final /* synthetic */ AbstractC88087b mo60001a() {
            return new C33777b(C33775j.this, (byte) 0);
        }

        private C33776a() {
        }

        /* synthetic */ C33776a(C33775j jVar, byte b) {
            this();
        }
    }

    private C33775j(C88103c cVar) {
        this.f79973a = cVar;
    }

    /* synthetic */ C33775j(C88103c cVar, byte b) {
        this(cVar);
    }
}
