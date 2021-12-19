package com.p2082ss.android.ugc.gamora.editor.lightening.p4281a;

import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.als.AbstractC2547b;
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
import com.p2082ss.android.ugc.asve.editor.AbstractC31071f;
import com.p2082ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63253l;
import com.p2082ss.android.ugc.aweme.property.C65435dr;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C71817eu;
import com.p2082ss.android.ugc.aweme.shortvideo.SafeHandler;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import com.p2082ss.android.ugc.aweme.shortvideo.edit.multiedit.p3827b.C71429d;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3841a.C71993c;
import com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3842b.AbstractC72004a;
import com.p2082ss.android.ugc.aweme.shortvideo.preview.AbstractC72510a;
import com.p2082ss.android.ugc.gamora.editor.AbstractC83397z;
import com.p2082ss.android.ugc.gamora.editor.lightening.C82306a;
import com.p2082ss.android.ugc.gamora.editor.lightening.p4283c.AbstractC82387b;
import com.p2082ss.android.ugc.gamora.editor.music.EditMusicViewModel;
import com.p2082ss.android.ugc.gamora.editor.toolbar.EditToolbarViewModel;
import com.p2082ss.android.ugc.trill.R;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
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
import p4600h.p4620k.AbstractC89286i;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.gamora.editor.lightening.a.a */
public final class C82307a extends AbstractC2562j<AbstractC2547b> implements AbstractC2547b, AbstractC20382b, AbstractC21566a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f184112a = {new C89232y(C82307a.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0), new C89232y(C82307a.class, "compileStickers", "getCompileStickers()Lcom/ss/android/ugc/gamora/editor/ICompileStickers;", 0), new C89232y(C82307a.class, "mModel", "getMModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C89232y(C82307a.class, "lighteningPublishApiComponent", "getLighteningPublishApiComponent()Lcom/ss/android/ugc/gamora/editor/lightening/publish/LighteningPublishApiComponent;", 0), new C89232y(C82307a.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0)};

    /* renamed from: b */
    final AbstractC89248d f184113b = C21572a.m40504a(getDiContainer(), AbstractC83397z.class);

    /* renamed from: c */
    final AbstractC89248d f184114c = C21572a.m40504a(getDiContainer(), AbstractC82387b.class);

    /* renamed from: d */
    public final C2564l<Boolean> f184115d;

    /* renamed from: e */
    public final C2564l<Boolean> f184116e;

    /* renamed from: f */
    public final C82322c f184117f;

    /* renamed from: g */
    public boolean f184118g;

    /* renamed from: h */
    public final AbstractC22186b f184119h;

    /* renamed from: i */
    private final AbstractC2547b f184120i = this;

    /* renamed from: j */
    private final SafeHandler f184121j = new SafeHandler(this);

    /* renamed from: k */
    private final AbstractC89244h f184122k = C89250i.m154773a((AbstractC89171a) new C82308a(this));

    /* renamed from: l */
    private EditMusicViewModel f184123l;

    /* renamed from: m */
    private final AbstractC89248d f184124m = C21572a.m40504a(getDiContainer(), ActivityC0945e.class);

    /* renamed from: n */
    private final AbstractC89248d f184125n = C21572a.m40504a(getDiContainer(), VideoPublishEditModel.class);

    /* renamed from: o */
    private final AbstractC89248d f184126o = C21572a.m40504a(getDiContainer(), AbstractC72510a.class);

    /* renamed from: p */
    private final C2564l<Boolean> f184127p;

    /* renamed from: q */
    private final C82330d f184128q;

    /* renamed from: r */
    private final C21582f f184129r;

    /* renamed from: s */
    private final int f184130s = R.id.ue;

    static {
        Covode.recordClassIndex(96141);
    }

    /* renamed from: h */
    private final EditToolbarViewModel m142364h() {
        return (EditToolbarViewModel) this.f184122k.getValue();
    }

    /* renamed from: a */
    public final ActivityC0945e mo127442a() {
        return (ActivityC0945e) this.f184124m.mo23374a(this, f184112a[0]);
    }

    /* renamed from: b */
    public final VideoPublishEditModel mo127443b() {
        return (VideoPublishEditModel) this.f184125n.mo23374a(this, f184112a[2]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final AbstractC72510a mo127444c() {
        return (AbstractC72510a) this.f184126o.mo23374a(this, f184112a[4]);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final AbstractC2547b getApiComponent() {
        return this.f184120i;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f184129r;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.a.a$g */
    static final class C82314g implements AbstractC72004a {

        /* renamed from: a */
        final /* synthetic */ C82307a f184137a;

        static {
            Covode.recordClassIndex(96148);
        }

        C82314g(C82307a aVar) {
            this.f184137a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3842b.AbstractC72004a
        /* renamed from: a */
        public final void mo87651a() {
            this.f184137a.mo127445d();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.a.a$i */
    static final class C82316i implements AbstractC72004a {

        /* renamed from: a */
        final /* synthetic */ C82307a f184139a;

        static {
            Covode.recordClassIndex(96150);
        }

        C82316i(C82307a aVar) {
            this.f184139a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3842b.AbstractC72004a
        /* renamed from: a */
        public final void mo87651a() {
            this.f184139a.mo127445d();
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

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.a.a$l */
    static final /* synthetic */ class C82320l extends C89217j implements AbstractC89171a<C89391z> {
        static {
            Covode.recordClassIndex(96154);
        }

        C82320l(C82307a aVar) {
            super(0, aVar, C82307a.class, "next", "next()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            ((C82307a) this.receiver).mo127444c().mo114789N();
            return C89391z.f203057a;
        }
    }

    /* renamed from: d */
    public final void mo127445d() {
        this.f184121j.post(new RunnableC82317j(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final AbstractC31071f mo127446e() {
        return mo127444c().mo114778C().getValue();
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onResume() {
        super.onResume();
        if (C70005cr.m123611a().f156482a != null) {
            mo127447f();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.a.a$a */
    static final class C82308a extends AbstractC89220m implements AbstractC89171a<EditToolbarViewModel> {

        /* renamed from: a */
        final /* synthetic */ C82307a f184131a;

        static {
            Covode.recordClassIndex(96142);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82308a(C82307a aVar) {
            super(0);
            this.f184131a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ EditToolbarViewModel invoke() {
            JediViewModel a = C20531t.m38716a(this.f184131a.mo127442a()).mo33800a(EditToolbarViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.a.a$j */
    public static final class RunnableC82317j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C82307a f184140a;

        static {
            Covode.recordClassIndex(96151);
        }

        RunnableC82317j(C82307a aVar) {
            this.f184140a = aVar;
        }

        public final void run() {
            C82307a aVar = this.f184140a;
            ((AbstractC83397z) aVar.f184113b.mo23374a(aVar, C82307a.f184112a[1])).mo128363a(new Runnable(this) {
                /* class com.p2082ss.android.ugc.gamora.editor.lightening.p4281a.C82307a.RunnableC82317j.RunnableC823181 */

                /* renamed from: a */
                final /* synthetic */ RunnableC82317j f184141a;

                static {
                    Covode.recordClassIndex(96152);
                }

                {
                    this.f184141a = r1;
                }

                public final void run() {
                    C82307a aVar = this.f184141a.f184140a;
                    ((AbstractC82387b) aVar.f184114c.mo23374a(aVar, C82307a.f184112a[3])).mo127476a();
                }
            });
        }
    }

    /* renamed from: f */
    public final void mo127447f() {
        this.f184115d.mo7019b(Boolean.valueOf(C82306a.m142360b(mo127443b())));
    }

    /* renamed from: g */
    public final void mo127448g() {
        if (C65435dr.m117153a()) {
            this.f184127p.mo7019b(Boolean.valueOf(m142365i()));
        }
    }

    /* renamed from: i */
    private final boolean m142365i() {
        if (mo127443b().mIsFromDraft || !this.f184115d.f7727a.getValue().booleanValue()) {
            return false;
        }
        if (C89070n.m154522b("slide_right", "click_upper_left_camera", "click_west_window_camera", "click_head_plus", "click_story_bottom_camera", "click_intro", "click_fullscreen_intro", "click_story_label").contains(mo127443b().shootEnterMethod)) {
            return true;
        }
        if (!C89219l.m154714a((Object) C71817eu.m126794e(mo127443b()), (Object) "fast_shoot") || mo127443b().mOrigin != 1) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        JediViewModel a = C20531t.m38716a(mo127442a()).mo33800a(EditMusicViewModel.class);
        C89219l.m154716b(a, "");
        this.f184123l = (EditMusicViewModel) a;
        this.f184119h.mo36387a(this.f184130s, this.f184117f, "StoryEditBottomBarScene");
        mo127448g();
        this.f184115d.mo7036a(this, new C82309b(this));
        m142364h().mo128260j().observe(this, new C82310c(this));
        EditMusicViewModel editMusicViewModel = this.f184123l;
        if (editMusicViewModel == null) {
            C89219l.m154710a("musicViewModel");
        }
        subscribeMultiEvent(editMusicViewModel, C82321b.f184142a, new C20370ah(), new C82311d(this));
        mo127447f();
        m142364h().mo128257g().observe(this, new C82312e(this));
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.a.a$k */
    static final /* synthetic */ class C82319k extends C89217j implements AbstractC89171a<C89391z> {
        static {
            Covode.recordClassIndex(96153);
        }

        C82319k(C82307a aVar) {
            super(0, aVar, C82307a.class, "publish", "publish()V", 0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            String str;
            C82307a aVar = (C82307a) this.receiver;
            if (C63244g.m114602a().mo73287o().mo104786f()) {
                AVExternalServiceImpl.m113114a().storyService().showPublishingToast(aVar.mo127442a());
            } else if (!aVar.f184118g) {
                aVar.f184118g = true;
                AbstractC31071f value = aVar.mo127444c().mo114778C().getValue();
                if (value != null) {
                    aVar.mo127443b().getPreviewInfo().setPreviewVideoLength(value.mo56368j());
                }
                if (aVar.mo127443b().mIsFromDraft && aVar.mo127443b().isDraftMusicIllegal && C70005cr.m123611a().f156482a != null) {
                    aVar.mo127443b().isDraftMusicIllegal = false;
                }
                if (aVar.mo127443b().isMvThemeVideoType()) {
                    if (TextUtils.isEmpty(aVar.mo127443b().mvCreateVideoData.videoCoverImgPath)) {
                        aVar.mo127443b().mvCreateVideoData.videoCoverImgPath = C63253l.f143623a.mo73308d().mo101651a().mo101653a();
                    }
                    new C71993c(aVar.mo127446e(), aVar.mo127443b().mvCreateVideoData.videoCoverImgPath, aVar.mo127443b().mvCreateVideoData.videoCoverStartTime, new C82313f(aVar), new C82314g(aVar));
                } else if (!aVar.mo127443b().isMultiVideoEdit() || !C71817eu.m126799j(aVar.mo127443b())) {
                    aVar.mo127445d();
                } else {
                    MultiEditVideoStatusRecordData multiEditVideoStatusRecordData = aVar.mo127443b().multiEditVideoRecordData;
                    if (multiEditVideoStatusRecordData != null && ((str = multiEditVideoStatusRecordData.coverImagePath) == null || str.length() == 0)) {
                        multiEditVideoStatusRecordData.coverImagePath = C71429d.m126154a();
                    }
                    new C71993c(aVar.mo127446e(), aVar.mo127443b().multiEditVideoRecordData.coverImagePath, (int) aVar.mo127443b().getMultiEditVideoStartTime(), new C82315h(aVar), new C82316i(aVar));
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.a.a$b */
    static final class C82309b<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C82307a f184132a;

        static {
            Covode.recordClassIndex(96143);
        }

        C82309b(C82307a aVar) {
            this.f184132a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f184132a.mo127448g();
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.a.a$e */
    static final class C82312e<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C82307a f184135a;

        static {
            Covode.recordClassIndex(96146);
        }

        C82312e(C82307a aVar) {
            this.f184135a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                this.f184135a.f184116e.mo7019b(Boolean.valueOf(bool.booleanValue()));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.a.a$f */
    static final class C82313f implements C71993c.AbstractC71996b {

        /* renamed from: a */
        final /* synthetic */ C82307a f184136a;

        static {
            Covode.recordClassIndex(96147);
        }

        C82313f(C82307a aVar) {
            this.f184136a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3841a.C71993c.AbstractC71996b
        /* renamed from: a */
        public final void mo78807a(String str) {
            C63244g.m114602a().mo73263I().mo101628a(str);
            this.f184136a.f184118g = false;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.a.a$h */
    static final class C82315h implements C71993c.AbstractC71996b {

        /* renamed from: a */
        final /* synthetic */ C82307a f184138a;

        static {
            Covode.recordClassIndex(96149);
        }

        C82315h(C82307a aVar) {
            this.f184138a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.mvtemplate.p3841a.C71993c.AbstractC71996b
        /* renamed from: a */
        public final void mo78807a(String str) {
            C63244g.m114602a().mo73263I().mo101628a(str);
            this.f184138a.f184118g = false;
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.a.a$c */
    static final class C82310c<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C82307a f184133a;

        static {
            Covode.recordClassIndex(96144);
        }

        C82310c(C82307a aVar) {
            this.f184133a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool == null) {
                return;
            }
            if (bool.booleanValue()) {
                this.f184133a.f184119h.mo36417e(this.f184133a.f184117f);
            } else {
                this.f184133a.f184119h.mo36413d(this.f184133a.f184117f);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.editor.lightening.a.a$d */
    static final class C82311d extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, C69905c, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C82307a f184134a;

        static {
            Covode.recordClassIndex(96145);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C82311d(C82307a aVar) {
            super(2);
            this.f184134a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, C69905c cVar) {
            C89219l.m154721d(bVar, "");
            this.f184134a.mo127447f();
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    public C82307a(C21582f fVar, AbstractC22186b bVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(bVar, "");
        this.f184129r = fVar;
        this.f184119h = bVar;
        C2564l<Boolean> lVar = new C2564l<>(true);
        this.f184115d = lVar;
        C2564l<Boolean> lVar2 = new C2564l<>(true);
        this.f184116e = lVar2;
        C2564l<Boolean> lVar3 = new C2564l<>(false);
        this.f184127p = lVar3;
        C82330d dVar = new C82330d();
        C89219l.m154721d(lVar, "");
        dVar.f184161a = lVar;
        C89219l.m154721d(lVar2, "");
        dVar.f184162b = lVar2;
        C89219l.m154721d(lVar3, "");
        dVar.f184163c = lVar3;
        C82319k kVar = new C82319k(this);
        C89219l.m154721d(kVar, "");
        dVar.f184164d = kVar;
        C82320l lVar4 = new C82320l(this);
        C89219l.m154721d(lVar4, "");
        dVar.f184165e = lVar4;
        this.f184128q = dVar;
        this.f184117f = new C82322c(dVar, getDiContainer());
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
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
