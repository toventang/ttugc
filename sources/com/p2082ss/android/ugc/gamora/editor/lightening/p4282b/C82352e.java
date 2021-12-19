package com.p2082ss.android.ugc.gamora.editor.lightening.p4282b;

import android.content.Context;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2564l;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20382b;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20365ac;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.group.AbstractC22186b;
import com.google.gson.C27910f;
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.canvas.C35376e;
import com.p2082ss.android.ugc.aweme.lancet.p3384a.C58003a;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.C40888d;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.property.C65393cf;
import com.p2082ss.android.ugc.aweme.property.C65494q;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.C70976bp;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.C71419h;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.p2082ss.android.ugc.aweme.tools.EnumC78601i;
import com.p2082ss.android.ugc.gamora.editor.AbstractC82036ac;
import com.p2082ss.android.ugc.gamora.editor.C83098t;
import com.p2082ss.android.ugc.gamora.editor.lightening.C82306a;
import com.p2082ss.android.ugc.gamora.editor.lightening.p4282b.C82370j;
import com.p2082ss.android.ugc.gamora.editor.music.AbstractC82427a;
import com.p2082ss.android.ugc.gamora.editor.music.EditMusicViewModel;
import com.p2082ss.android.ugc.gamora.editor.p4278e.AbstractC82155c;
import com.p2082ss.android.ugc.gamora.editor.sticker.info.EditInfoStickerViewModel;
import com.p2082ss.android.ugc.gamora.editor.toolbar.AbstractC83233s;
import com.p2082ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel;
import com.p2082ss.android.ugc.trill.R;
import com.p2082ss.android.vesdk.C85581w;
import com.p2082ss.android.vesdk.clipparam.VEClipTimelineParam;
import dmt.p4542av.video.VEPreviewMusicParams;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.AbstractC88984x;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4567d.AbstractC88434g;
import p4560f.p4561a.p4568e.p4570b.C88466b;
import p4560f.p4561a.p4568e.p4573e.p4578e.C88790v;
import p4560f.p4561a.p4587h.C88925a;
import p4560f.p4561a.p4590k.C88946a;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89217j;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4619j.C89271h;
import p4600h.p4620k.AbstractC89286i;
import p4600h.p4620k.AbstractC89290k;
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.e */
public final class C82352e extends AbstractC2562j<AbstractC82351d> implements AbstractC20382b, AbstractC21566a, AbstractC82351d {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f184213a = {new C89232y(C82352e.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C89232y(C82352e.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0), new C89232y(C82352e.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0), new C89232y(C82352e.class, "editToolbarApi", "getEditToolbarApi()Lcom/ss/android/ugc/gamora/editor/toolbar/EditToolbarApi;", 0), new C89232y(C82352e.class, "musicController", "getMusicController()Lcom/ss/android/ugc/gamora/editor/IEditMusicController;", 0), new C89232y(C82352e.class, "editMusicApi", "getEditMusicApi()Lcom/ss/android/ugc/gamora/editor/music/EditMusicApi;", 0)};

    /* renamed from: A */
    private final int f184214A = R.id.c4z;

    /* renamed from: B */
    private final boolean f184215B;

    /* renamed from: b */
    public final C82352e f184216b;

    /* renamed from: c */
    final AbstractC89248d f184217c;

    /* renamed from: d */
    public C82332b f184218d;

    /* renamed from: e */
    public final C82370j f184219e;

    /* renamed from: f */
    public final AbstractC22186b f184220f;

    /* renamed from: g */
    private final AbstractC89248d f184221g;

    /* renamed from: h */
    private final AbstractC89248d f184222h;

    /* renamed from: i */
    private final AbstractC89244h f184223i;

    /* renamed from: j */
    private final AbstractC89248d f184224j;

    /* renamed from: k */
    private final AbstractC89248d f184225k;

    /* renamed from: l */
    private final AbstractC89248d f184226l;

    /* renamed from: m */
    private final C2564l<String> f184227m;

    /* renamed from: n */
    private final C2564l<Boolean> f184228n;

    /* renamed from: o */
    private final C2564l<TextUtils.TruncateAt> f184229o;

    /* renamed from: p */
    private final C2564l<Boolean> f184230p;

    /* renamed from: q */
    private final C2564l<Boolean> f184231q;

    /* renamed from: r */
    private final C2564l<Boolean> f184232r;

    /* renamed from: s */
    private final C2564l<Boolean> f184233s;

    /* renamed from: t */
    private final AbstractC89244h f184234t;

    /* renamed from: u */
    private final C82331a f184235u;

    /* renamed from: v */
    private EditMusicViewModel f184236v;

    /* renamed from: w */
    private boolean f184237w;

    /* renamed from: x */
    private final AbstractC89244h f184238x;

    /* renamed from: y */
    private final C88411a f184239y;

    /* renamed from: z */
    private final C21582f f184240z;

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.e$h */
    static final class C82360h<T> implements AbstractC88433f {

        /* renamed from: a */
        public static final C82360h f184248a = new C82360h();

        static {
            Covode.recordClassIndex(96194);
        }

        C82360h() {
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    static {
        Covode.recordClassIndex(96186);
    }

    /* renamed from: j */
    private final boolean m142400j() {
        return ((Boolean) this.f184238x.getValue()).booleanValue();
    }

    /* renamed from: b */
    public final VideoPublishEditModel mo127458b() {
        return (VideoPublishEditModel) this.f184221g.mo23374a(this, f184213a[0]);
    }

    /* renamed from: c */
    public final ActivityC0945e mo127459c() {
        return (ActivityC0945e) this.f184222h.mo23374a(this, f184213a[1]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final AbstractC82155c mo127460d() {
        return (AbstractC82155c) this.f184224j.mo23374a(this, f184213a[2]);
    }

    /* renamed from: e */
    public final AbstractC82036ac mo127461e() {
        return (AbstractC82036ac) this.f184225k.mo23374a(this, f184213a[4]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C65494q mo127462f() {
        return (C65494q) this.f184234t.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC82351d getApiComponent() {
        return this.f184216b;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f184240z;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.e$a */
    static final class C82353a extends AbstractC89220m implements AbstractC89171a<C65494q> {

        /* renamed from: a */
        public static final C82353a f184241a = new C82353a();

        static {
            Covode.recordClassIndex(96187);
        }

        C82353a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C65494q invoke() {
            return C35376e.m72402a();
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public final AbstractC1204m getLifecycleOwner() {
        return AbstractC20382b.C20383a.m38581a(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20534v getLifecycleOwnerHolder() {
        return AbstractC20382b.C20383a.m38601b(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return AbstractC20382b.C20383a.m38604c(this);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.e$l */
    static final /* synthetic */ class C82364l extends C89217j implements AbstractC89171a<C89391z> {
        static {
            Covode.recordClassIndex(96198);
        }

        C82364l(C82352e eVar) {
            super(0, eVar, C82352e.class, "clearMusic", "clearMusic()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            ((C82352e) this.receiver).mo127463g();
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.editor.lightening.p4282b.AbstractC82351d
    /* renamed from: a */
    public final void mo127456a() {
        this.f184232r.mo7019b(false);
    }

    /* renamed from: g */
    public final void mo127463g() {
        C70005cr.m123611a().mo70083a((C69905c) null);
        mo127461e().mo127274a();
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onDestroy() {
        super.onDestroy();
        this.f184239y.dispose();
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.e$b */
    static final class C82354b extends AbstractC89220m implements AbstractC89171a<EditToolbarViewModel> {

        /* renamed from: a */
        final /* synthetic */ C82352e f184242a;

        static {
            Covode.recordClassIndex(96188);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82354b(C82352e eVar) {
            super(0);
            this.f184242a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditToolbarViewModel invoke() {
            JediViewModel a = C20531t.m38716a(this.f184242a.mo127459c()).mo33800a(EditToolbarViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.e$c */
    static final class C82355c extends AbstractC89220m implements AbstractC89171a<Boolean> {

        /* renamed from: a */
        public static final C82355c f184243a = new C82355c();

        static {
            Covode.recordClassIndex(96189);
        }

        C82355c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(AVExternalServiceImpl.m113114a().configService().avsettingsConfig().enableNewMusicMarquee());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.e$k */
    static final /* synthetic */ class C82363k extends C89217j implements AbstractC89171a<C89391z> {
        static {
            Covode.recordClassIndex(96197);
        }

        C82363k(C82352e eVar) {
            super(0, eVar, C82352e.class, "openMusicPanel", "openMusicPanel()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            C82352e eVar = (C82352e) this.receiver;
            ((AbstractC83233s) eVar.f184217c.mo23374a(eVar, C82352e.f184213a[3])).mo128237a(1);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onResume() {
        super.onResume();
        C69905c cVar = C70005cr.m123611a().f156482a;
        if (cVar != null) {
            mo127457a(cVar);
        } else {
            mo127464h();
        }
    }

    /* renamed from: i */
    public final void mo127465i() {
        this.f184232r.mo7019b(true);
        if (m142400j()) {
            this.f184227m.mo7019b(mo127459c().getString(R.string.g1j));
        }
        this.f184230p.mo7019b(false);
    }

    /* renamed from: h */
    public final void mo127464h() {
        if (!C89219l.m154714a((Object) this.f184227m.f7727a.getValue(), (Object) mo127459c().getString(R.string.g1j))) {
            this.f184227m.mo7019b(mo127459c().getString(R.string.fsz));
        }
        if (!C82306a.m142357a() && C65393cf.m117091b()) {
            this.f184233s.mo7019b(false);
        }
        this.f184229o.mo7019b(TextUtils.TruncateAt.MIDDLE);
        this.f184230p.mo7019b(false);
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        AbstractC88979t<R> d;
        Integer num;
        super.onCreate();
        if (!mo127458b().isDuet() && !mo127458b().isReaction() && !C70976bp.m125305b(mo127458b())) {
            C89219l.m154721d(mo127458b(), "");
            JediViewModel a = C20531t.m38716a(mo127459c()).mo33800a(EditMusicViewModel.class);
            C89219l.m154716b(a, "");
            this.f184236v = (EditMusicViewModel) a;
            if (this.f184215B) {
                this.f184218d = new C82332b(getDiContainer(), this.f184235u);
                this.f184227m.mo7019b(mo127459c().getString(R.string.fsz));
                if (!C82306a.m142357a() && C65393cf.m117091b()) {
                    this.f184233s.mo7019b(false);
                }
                this.f184229o.mo7019b(TextUtils.TruncateAt.MIDDLE);
                this.f184230p.mo7019b(false);
                this.f184231q.mo7019b(Boolean.valueOf(!mo127458b().isStickPointMode));
                ((EditToolbarViewModel) this.f184223i.getValue()).mo128260j().observe(mo127459c(), new C82361i(this));
            }
            mo127460d().mo114834w().observe(this, new C82362j(this));
            mo127461e().mo127280g().mo7038b(this, new C82357e(this));
            if (C83098t.m143513a(mo127458b())) {
                C69905c cVar = C70005cr.m123611a().f156482a;
                if (cVar != null) {
                    C89219l.m154716b(cVar, "");
                    mo127457a(cVar);
                }
            } else {
                VideoPublishEditModel b = mo127458b();
                if (C70005cr.m123611a().f156482a == null && b != null && !b.mIsFromDraft && b.canvasVideoData != null) {
                    this.f184219e.f184262c = new C82358f(this);
                    C82370j jVar = this.f184219e;
                    Context applicationContext = mo127459c().getApplicationContext();
                    if (C58003a.f132201c && applicationContext == null) {
                        applicationContext = C58003a.f132199a;
                    }
                    C89219l.m154716b(applicationContext, "");
                    VideoPublishEditModel b2 = mo127458b();
                    C89219l.m154721d(applicationContext, "");
                    jVar.f184260a = b2;
                    jVar.f184261b = applicationContext;
                    HashMap<String, Integer> extraShareOptions = mo127458b().creativeFlowData.getExtraShareOptions();
                    if (extraShareOptions == null || (num = extraShareOptions.get("tiktok_videokit_disable_music_selection")) == null || num.intValue() != 1) {
                        C82370j jVar2 = this.f184219e;
                        AbstractC63154aa aaVar = (AbstractC63154aa) C63244g.m114602a().mo73291s();
                        if (aaVar == null) {
                            d = C88925a.m154171a(C88790v.f201616a);
                            C89219l.m154716b(d, "");
                        } else {
                            d = aaVar.mo101552k().mo101556a(2).mo143292d(C82370j.C82378f.f184277a);
                            C89219l.m154716b(d, "");
                        }
                        AbstractC88979t<R> d2 = d.mo143276b(1).mo143292d(C82370j.C82379g.f184278a).mo143267a((AbstractC88434g<? super R, ? extends AbstractC88984x<? extends R>>) new C82370j.C82380h(jVar2), false).mo143292d(C82370j.C82381i.f184280a);
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        AbstractC88979t a2 = AbstractC88979t.m154302a(new RuntimeException("load music time out"));
                        C88466b.m153697a((Object) a2, "other is null");
                        AbstractC88979t<R> a3 = d2.mo143260a(20, timeUnit, a2, C88925a.m154160a(C88946a.f201990b)).mo143278b(C88925a.m154180b(C88946a.f201991c)).mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143285c(new C82370j.C82382j(jVar2)).mo143262a(new C82370j.C82383k(jVar2)).mo143280b(new C82370j.C82384l(jVar2)).mo143264a(new C82370j.C82385m(jVar2));
                        C89219l.m154716b(a3, "");
                        this.f184239y.mo142945a(a3.mo143254a(new C82359g(this), C82360h.f184248a));
                    }
                    if (this.f184219e.mo127473a()) {
                        mo127465i();
                    } else {
                        mo127464h();
                    }
                    this.f184219e.f184264e.observe(this, new C82356d(this));
                }
            }
            if (mo127458b().mMusicPath != null) {
                this.f184237w = true;
            }
            C82332b bVar = this.f184218d;
            if (bVar != null) {
                this.f184220f.mo36387a(this.f184214A, bVar, "StoryChooseMusicScene");
            }
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.e$i */
    static final class C82361i<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C82352e f184249a;

        static {
            Covode.recordClassIndex(96195);
        }

        C82361i(C82352e eVar) {
            this.f184249a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C82332b bVar;
            Boolean bool = (Boolean) obj;
            if (bool != null && (bVar = this.f184249a.f184218d) != null) {
                if (bool.booleanValue()) {
                    this.f184249a.f184220f.mo36417e(bVar);
                } else {
                    this.f184249a.f184220f.mo36413d(bVar);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.e$d */
    static final class C82356d<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C82352e f184244a;

        static {
            Covode.recordClassIndex(96190);
        }

        C82356d(C82352e eVar) {
            this.f184244a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            int i = C82365f.f184251a[((C82366g) obj).f184253a.ordinal()];
            if (i == 1) {
                this.f184244a.mo127465i();
            } else if (i == 2) {
                this.f184244a.mo127456a();
            } else if (i == 3) {
                this.f184244a.mo127456a();
                this.f184244a.mo127463g();
            } else if (i == 4) {
                this.f184244a.mo127456a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.e$e */
    static final class C82357e<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C82352e f184245a;

        static {
            Covode.recordClassIndex(96191);
        }

        C82357e(C82352e eVar) {
            this.f184245a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            T t;
            C20391d dVar = (C20391d) obj;
            if (this.f184245a.f184219e.mo127473a()) {
                C82370j jVar = this.f184245a.f184219e;
                jVar.f184264e.setValue(new C82366g<>(EnumC82368h.CANCEL, null, null, 6));
                AbstractC88412b bVar = jVar.f184265f;
                if (bVar != null) {
                    bVar.dispose();
                }
                jVar.f184265f = null;
            }
            if (dVar == null || (t = dVar.f48283b) == null) {
                this.f184245a.mo127464h();
            } else {
                this.f184245a.mo127457a(t);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.e$f */
    static final class C82358f extends AbstractC89220m implements AbstractC89172b<C69905c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82352e f184246a;

        static {
            Covode.recordClassIndex(96192);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82358f(C82352e eVar) {
            super(1);
            this.f184246a = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C69905c cVar) {
            C69905c cVar2 = cVar;
            C89219l.m154721d(cVar2, "");
            if (C70976bp.m125300a()) {
                this.f184246a.mo127461e().mo127276a(cVar2.path, cVar2, true);
            } else {
                this.f184246a.mo127461e().mo127275a(C40888d.C40889a.m82358a(false, "edit_page_list", cVar2, cVar2.path));
            }
            this.f184246a.mo127457a(cVar2);
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.e$g */
    static final class C82359g<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C82352e f184247a;

        static {
            Covode.recordClassIndex(96193);
        }

        C82359g(C82352e eVar) {
            this.f184247a = eVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C69905c cVar = (C69905c) obj;
            String musicId = cVar.getMusicId();
            if (musicId != null && !C89361p.m154870a((CharSequence) musicId)) {
                this.f184247a.mo127458b().mFirstStickerMusicIdsJson = new C27910f().mo46674b(C89070n.m154516a(cVar.getMusicId()));
            }
        }
    }

    /* renamed from: a */
    public final void mo127457a(C69905c cVar) {
        StringBuilder sb = new StringBuilder("");
        String name = cVar.getName();
        boolean z = false;
        if (name == null || name.length() == 0) {
            String singer = cVar.getSinger();
            if (!(singer == null || singer.length() == 0)) {
                sb.append(cVar.getSinger());
            }
        } else {
            sb.append(cVar.getName());
            String singer2 = cVar.getSinger();
            if (!(singer2 == null || singer2.length() == 0)) {
                sb.append('-');
                sb.append(cVar.getSinger());
            }
        }
        this.f184227m.mo7019b(sb.toString());
        if (!m142400j() && !C82306a.m142357a() && C65393cf.m117091b()) {
            this.f184233s.mo7019b(true);
        }
        this.f184229o.mo7019b(TextUtils.TruncateAt.MARQUEE);
        if (m142400j()) {
            C2564l<Boolean> lVar = this.f184230p;
            if (!mo127458b().isStickPointMode && !mo127458b().isTemplateMv()) {
                z = true;
            }
            lVar.mo7019b(Boolean.valueOf(z));
        } else if (!C65393cf.m117091b()) {
            this.f184230p.mo7019b(Boolean.valueOf(!mo127458b().isStickPointMode));
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.b.e$j */
    static final class C82362j<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C82352e f184250a;

        static {
            Covode.recordClassIndex(96196);
        }

        C82362j(C82352e eVar) {
            this.f184250a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            VideoFileInfo videoFileInfo;
            Integer valueOf;
            VEPreviewMusicParams vEPreviewMusicParams = (VEPreviewMusicParams) obj;
            if (this.f184250a.mo127458b().canvasVideoData != null) {
                if (vEPreviewMusicParams.f200084d <= 0 || Math.abs(vEPreviewMusicParams.f200083c - vEPreviewMusicParams.f200084d) < 1000) {
                    i = vEPreviewMusicParams.f200083c;
                } else {
                    i = vEPreviewMusicParams.f200084d;
                }
                C82352e eVar = this.f184250a;
                if (i == 0) {
                    i = eVar.mo127462f().f147709a;
                }
                int c = C89271h.m154772c(C89271h.m154769b(i, eVar.mo127462f().f147710b), eVar.mo127462f().f147711c);
                AbstractC31071f value = eVar.mo127460d().mo114778C().getValue();
                if (value == null || (valueOf = Integer.valueOf(value.mo56246G())) == null || valueOf.intValue() != c) {
                    VEClipTimelineParam vEClipTimelineParam = new VEClipTimelineParam();
                    vEClipTimelineParam.speed = (double) EnumC78601i.NORMAL.value();
                    vEClipTimelineParam.trimIn = 0;
                    vEClipTimelineParam.trimOut = c;
                    if (value != null) {
                        value.mo56271a(0, new int[]{0}, new VEClipTimelineParam[]{vEClipTimelineParam});
                        value.mo56388t();
                    }
                    EditVideoSegment editVideoSegment = (EditVideoSegment) C89070n.m154583g((List) eVar.mo127458b().getPreviewInfo().getVideoList());
                    if (editVideoSegment != null) {
                        videoFileInfo = editVideoSegment.getVideoFileInfo();
                    } else {
                        videoFileInfo = null;
                    }
                    EditVideoSegment editVideoSegment2 = (EditVideoSegment) C89070n.m154583g((List) eVar.mo127458b().getPreviewInfo().getVideoList());
                    if (videoFileInfo != null && editVideoSegment2 != null) {
                        eVar.mo127458b().setPreviewInfo(new C71419h(videoFileInfo.getWidth(), videoFileInfo.getHeight(), null, 28).mo113031a(new EditVideoSegment(editVideoSegment2.getVideoPath(), null, new VideoFileInfo(videoFileInfo.getWidth(), videoFileInfo.getHeight(), (long) c, 30, 0, 0, 0, 0, 240, null))));
                        if (value != null) {
                            JediViewModel a = C20531t.m38716a(eVar.mo127459c()).mo33800a(EditInfoStickerViewModel.class);
                            C89219l.m154716b(a, "");
                            ((EditInfoStickerViewModel) a).mo127917a(new C89378p<>(Integer.valueOf(c), Integer.valueOf(c)));
                            value.mo56259a(0, c, C85581w.EnumC85608g.EDITOR_TIMERANGE_FLAG_AFTER_SPEED);
                        }
                    }
                }
            }
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
    }

    public C82352e(C21582f fVar, AbstractC22186b bVar, boolean z) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f184240z = fVar;
        this.f184220f = bVar;
        this.f184215B = z;
        this.f184216b = this;
        this.f184221g = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);
        this.f184222h = C21572a.m40504a(getDiContainer(), ActivityC0945e.class);
        this.f184223i = C89250i.m154773a((AbstractC89171a) new C82354b(this));
        this.f184224j = C21572a.m40504a(getDiContainer(), AbstractC82155c.class);
        this.f184217c = C21572a.m40504a(getDiContainer(), AbstractC83233s.class);
        this.f184225k = C21572a.m40504a(getDiContainer(), AbstractC82036ac.class);
        this.f184226l = C21572a.m40505b(getDiContainer(), AbstractC82427a.class);
        C2564l<String> lVar = new C2564l<>("");
        this.f184227m = lVar;
        C2564l<Boolean> lVar2 = new C2564l<>(true);
        this.f184228n = lVar2;
        C2564l<TextUtils.TruncateAt> lVar3 = new C2564l<>(TextUtils.TruncateAt.MIDDLE);
        this.f184229o = lVar3;
        C2564l<Boolean> lVar4 = new C2564l<>(false);
        this.f184230p = lVar4;
        C2564l<Boolean> lVar5 = new C2564l<>(true);
        this.f184231q = lVar5;
        C2564l<Boolean> lVar6 = new C2564l<>(false);
        this.f184232r = lVar6;
        C2564l<Boolean> lVar7 = new C2564l<>(false);
        this.f184233s = lVar7;
        this.f184234t = C89250i.m154773a((AbstractC89171a) C82353a.f184241a);
        C82331a aVar = new C82331a();
        C89219l.m154721d(lVar, "");
        aVar.f184166a = lVar;
        C89219l.m154721d(lVar3, "");
        aVar.f184168c = lVar3;
        C89219l.m154721d(lVar2, "");
        aVar.f184167b = lVar2;
        C89219l.m154721d(lVar4, "");
        aVar.f184169d = lVar4;
        C89219l.m154721d(lVar5, "");
        aVar.f184170e = lVar5;
        C89219l.m154721d(lVar6, "");
        aVar.f184171f = lVar6;
        C82363k kVar = new C82363k(this);
        C89219l.m154721d(kVar, "");
        aVar.f184173h = kVar;
        C82364l lVar8 = new C82364l(this);
        C89219l.m154721d(lVar8, "");
        aVar.f184174i = lVar8;
        C89219l.m154721d(lVar7, "");
        aVar.f184172g = lVar7;
        this.f184235u = aVar;
        this.f184238x = C89250i.m154773a((AbstractC89171a) C82355c.f184243a);
        this.f184219e = new C82370j();
        this.f184239y = new C88411a();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38599a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38606d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void subscribeEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20391d<? extends A>> kVar, C20370ah<C20373ak<C20391d<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38602b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20365ac<? extends A>> kVar, C20370ah<C20373ak<C20365ac<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38605c(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20382b.C20383a.m38585a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20382b.C20383a.m38584a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20382b.C20383a.m38586a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(sVar, "");
        return AbstractC20382b.C20383a.m38587a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
