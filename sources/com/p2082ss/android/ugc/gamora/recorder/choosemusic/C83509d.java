package com.p2082ss.android.ugc.gamora.recorder.choosemusic;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2559g;
import com.bytedance.als.C2563k;
import com.bytedance.als.dsl.C2556g;
import com.bytedance.bpea.basics.C13349j;
import com.bytedance.bpea.basics.C13350k;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.bpea.store.p878a.C13401b;
import com.bytedance.common.utility.collection.C13603b;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.p940b.p941a.C14190j;
import com.bytedance.creativex.recorder.p940b.p941a.C14191k;
import com.bytedance.creativex.recorder.p940b.p941a.C14201t;
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
import com.bytedance.jedi.arch.C20377ao;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.C20536x;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.group.AbstractC22186b;
import com.p2082ss.android.medialib.listener.AbstractC30012b;
import com.p2082ss.android.ugc.asve.p2217f.C31098f;
import com.p2082ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.experiment.C46790cg;
import com.p2082ss.android.ugc.aweme.experiment.C46952fr;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.C40888d;
import com.p2082ss.android.ugc.aweme.p2730de.C40964c;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63154aa;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63257p;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.property.C65473f;
import com.p2082ss.android.ugc.aweme.setting.C68026bl;
import com.p2082ss.android.ugc.aweme.setting.C68027bm;
import com.p2082ss.android.ugc.aweme.setting.p3721i.C68109p;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.C69792ad;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70643dn;
import com.p2082ss.android.ugc.aweme.shortvideo.EnumC69833ak;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p2082ss.android.ugc.aweme.shortvideo.countdown.C69938b;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3793af.C69823b;
import com.p2082ss.android.ugc.aweme.shortvideo.p3835h.AbstractC71864a;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72847c;
import com.p2082ss.android.ugc.aweme.sticker.model.C75439a;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.C83528e;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.p4296a.AbstractC83492a;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.AbstractC83566a;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.model.C83621a;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83406b;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.C83408c;
import com.p2082ss.android.ugc.gamora.recorder.p4298e.AbstractC83634a;
import com.p2082ss.android.ugc.gamora.recorder.p4303j.C83735b;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.C84090k;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89386u;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.EnumC89331m;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4612a.AbstractC89190t;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.d */
public class C83509d extends AbstractC2562j<AbstractC83490a> implements AbstractC20382b, AbstractC21566a, AbstractC83490a {
    static final /* synthetic */ AbstractC89286i[] $$delegatedProperties = {new C89232y(C83509d.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0), new C89232y(C83509d.class, "cameraApi", "getCameraApi()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new C89232y(C83509d.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new C89232y(C83509d.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new C89232y(C83509d.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/gamora/recorder/bottom/BottomTabApiComponent;", 0), new C89232y(C83509d.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0), new C89232y(C83509d.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new C89232y(C83509d.class, "musicCutComponent", "getMusicCutComponent()Lcom/ss/android/ugc/gamora/recorder/musiccut/MusicCutComponent;", 0), new C89232y(C83509d.class, "countDownComponent", "getCountDownComponent()Lcom/ss/android/ugc/aweme/shortvideo/countdown/CountDownComponent;", 0)};
    private final AbstractC89248d activity$delegate = C21572a.m40504a(getDiContainer(), ActivityC0945e.class);
    private final AbstractC89248d bottomTabApiComponent$delegate = C21572a.m40504a(getDiContainer(), AbstractC83406b.class);
    private final AbstractC89248d cameraApi$delegate = C21572a.m40504a(getDiContainer(), AbstractC14177d.class);
    private final AbstractC89244h chooseMusicHandler$delegate = C89250i.m154773a((AbstractC89171a) new C83511b(this));
    private final AbstractC89248d countDownComponent$delegate = C21572a.m40504a(getDiContainer(), C69938b.class);
    private final C21582f diContainer;
    public boolean enableRecordChooseMusicComponent = true;
    private C69905c internalCurrentMusic;
    public final C2563k<C89391z> musicAdded = new C2563k<>();
    public final C2563k<C89391z> musicCleared = new C2563k<>();
    private final AbstractC89248d musicCutComponent$delegate = C21572a.m40504a(getDiContainer(), C83735b.class);
    public final AbstractC83492a musicPlayApiComponent = ((AbstractC83492a) getDiContainer().mo35252b(AbstractC83492a.class, null));
    public final AbstractC22186b parentScene;
    private final AbstractC89248d planCUIApiComponent$delegate = C21572a.m40504a(getDiContainer(), AbstractC71864a.class);
    private final AbstractC89244h recommendMusicApiComponent$delegate = C89250i.m154774a(EnumC89331m.NONE, new C83510a(this));
    private final AbstractC89244h recordChooseMusicScene$delegate = C89250i.m154773a((AbstractC89171a) new C83526p(this));
    private final AbstractC89248d recordControlApi$delegate = C21572a.m40504a(getDiContainer(), AbstractC14193m.class);
    private final AbstractC89248d shortVideoContext$delegate = C21572a.m40504a(getDiContainer(), ShortVideoContext.class);
    public final C83506b states = new C83506b();
    private final AbstractC89248d stickerApiComponent$delegate = C21572a.m40504a(getDiContainer(), AbstractC84089j.class);
    private C89378p<? extends Effect, Boolean> stickerMusicCancelState;

    static {
        Covode.recordClassIndex(97395);
    }

    private final AbstractC83406b getBottomTabApiComponent() {
        return (AbstractC83406b) this.bottomTabApiComponent$delegate.mo23374a(this, $$delegatedProperties[4]);
    }

    private final AbstractC14177d getCameraApi() {
        return (AbstractC14177d) this.cameraApi$delegate.mo23374a(this, $$delegatedProperties[1]);
    }

    private final C69792ad getChooseMusicHandler() {
        return (C69792ad) this.chooseMusicHandler$delegate.getValue();
    }

    private final C69938b getCountDownComponent() {
        return (C69938b) this.countDownComponent$delegate.mo23374a(this, $$delegatedProperties[8]);
    }

    private final C83735b getMusicCutComponent() {
        return (C83735b) this.musicCutComponent$delegate.mo23374a(this, $$delegatedProperties[7]);
    }

    private final C83533f getRecordChooseMusicScene() {
        return (C83533f) this.recordChooseMusicScene$delegate.getValue();
    }

    public final ActivityC0945e getActivity() {
        return (ActivityC0945e) this.activity$delegate.mo23374a(this, $$delegatedProperties[0]);
    }

    /* Return type fixed from 'com.ss.android.ugc.gamora.recorder.choosemusic.d' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public AbstractC83490a getApiComponent() {
        return this;
    }

    public final AbstractC71864a getPlanCUIApiComponent() {
        return (AbstractC71864a) this.planCUIApiComponent$delegate.mo23374a(this, $$delegatedProperties[5]);
    }

    public final AbstractC83566a getRecommendMusicApiComponent() {
        return (AbstractC83566a) this.recommendMusicApiComponent$delegate.getValue();
    }

    public final AbstractC14193m getRecordControlApi() {
        return (AbstractC14193m) this.recordControlApi$delegate.mo23374a(this, $$delegatedProperties[2]);
    }

    public final ShortVideoContext getShortVideoContext() {
        return (ShortVideoContext) this.shortVideoContext$delegate.mo23374a(this, $$delegatedProperties[6]);
    }

    public final AbstractC84089j getStickerApiComponent() {
        return (AbstractC84089j) this.stickerApiComponent$delegate.mo23374a(this, $$delegatedProperties[3]);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.choosemusic.AbstractC83490a
    public C69905c getCurrentMusic() {
        return this.internalCurrentMusic;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public C21582f getDiContainer() {
        return this.diContainer;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.choosemusic.AbstractC83490a
    public /* bridge */ /* synthetic */ C2559g getMusicAdded() {
        return this.musicAdded;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.choosemusic.AbstractC83490a
    public /* bridge */ /* synthetic */ C2559g getMusicCleared() {
        return this.musicCleared;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public AbstractC20477i getReceiver() {
        return this;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.p<? extends com.ss.android.ugc.effectmanager.effect.model.Effect, java.lang.Boolean>, h.p<com.ss.android.ugc.effectmanager.effect.model.Effect, java.lang.Boolean> */
    @Override // com.p2082ss.android.ugc.gamora.recorder.choosemusic.AbstractC83490a
    public C89378p<Effect, Boolean> getStickerMusicCancelState() {
        return this.stickerMusicCancelState;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public AbstractC1204m getLifecycleOwner() {
        return AbstractC20382b.C20383a.m38581a(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public AbstractC20534v getLifecycleOwnerHolder() {
        return AbstractC20382b.C20383a.m38601b(this);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return AbstractC20382b.C20383a.m38604c(this);
    }

    public C2559g<Boolean> getUiLoadingMusicEvent() {
        return this.states.f186501h;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.choosemusic.AbstractC83490a
    public void stopPreviewMusic() {
        getCameraView().mo56983h();
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.d$a */
    public static final class C83510a extends AbstractC89220m implements AbstractC89171a<AbstractC83566a> {

        /* renamed from: a */
        final /* synthetic */ AbstractC21566a f186513a;

        static {
            Covode.recordClassIndex(97396);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C83510a(AbstractC21566a aVar) {
            super(0);
            this.f186513a = aVar;
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.bytedance.als.b, com.ss.android.ugc.gamora.recorder.choosemusic.recommend.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.AbstractC83566a invoke() {
            /*
                r3 = this;
                com.bytedance.o.a r0 = r3.f186513a
                com.bytedance.o.f r2 = r0.getDiContainer()
                java.lang.Class<com.ss.android.ugc.gamora.recorder.choosemusic.recommend.a> r1 = com.p2082ss.android.ugc.gamora.recorder.choosemusic.recommend.AbstractC83566a.class
                r0 = 0
                java.lang.Object r0 = r2.mo35252b(r1, r0)
                com.bytedance.als.b r0 = (com.bytedance.als.AbstractC2547b) r0
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.gamora.recorder.choosemusic.C83509d.C83510a.invoke():com.bytedance.als.b");
        }
    }

    private final ASCameraView getCameraView() {
        return getCameraApi().mo22747A();
    }

    public final void applyBackgroundVideoIfNeed() {
        getStickerApiComponent().mo128897E().mo119595e();
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.choosemusic.AbstractC83490a
    public void initStitch() {
        this.states.f186506m.mo6999a((C89391z) null);
    }

    public void notifyMusicChange() {
        this.states.f186498e.mo6999a((C89391z) null);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.choosemusic.AbstractC83490a
    public void tryHideMusicTips() {
        this.states.f186505l.mo6999a((Integer) null);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.d$b */
    static final class C83511b extends AbstractC89220m implements AbstractC89171a<C69792ad> {

        /* renamed from: a */
        final /* synthetic */ C83509d f186514a;

        static {
            Covode.recordClassIndex(97397);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83511b(C83509d dVar) {
            super(0);
            this.f186514a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C69792ad invoke() {
            ActivityC0945e activity = this.f186514a.getActivity();
            AbstractC14193m recordControlApi = this.f186514a.getRecordControlApi();
            C83509d dVar = this.f186514a;
            return new C69792ad(activity, recordControlApi, dVar, dVar.getShortVideoContext(), this.f186514a.getDiContainer());
        }
    }

    private final long getBackgroundVideoDuration() {
        C75439a aVar = getShortVideoContext().f155817b.f155662r;
        if (aVar != null) {
            return aVar.getMaxDuration();
        }
        return 0;
    }

    private final boolean isChangeBgVideoDuration() {
        C75439a aVar = getShortVideoContext().f155817b.f155662r;
        if (aVar == null || aVar.isMultiBgVideo()) {
            return false;
        }
        return true;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.choosemusic.AbstractC83490a
    public void changeMusicUi() {
        changeHasMusic(C70005cr.m123611a().f156482a);
        setupClickListener(false);
        changeUiEnableState(false);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.choosemusic.AbstractC83490a
    public boolean recordHasMusic() {
        Workspace workspace = getShortVideoContext().f155817b.f155652h;
        C89219l.m154716b(workspace, "");
        if (workspace.mo110093c() != null) {
            return true;
        }
        return false;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.choosemusic.AbstractC83490a
    public void stopStickerBGM() {
        getCameraView().mo56938f(false);
        getCameraView().mo56941g(true);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.d$g */
    public static final class C83516g implements AbstractC30012b {

        /* renamed from: a */
        final /* synthetic */ C83509d f186519a;

        static {
            Covode.recordClassIndex(97402);
        }

        @Override // com.p2082ss.android.medialib.listener.AbstractC30012b
        /* renamed from: a */
        public final void mo52866a(int i, int i2) {
        }

        /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.d$g$a */
        static final class C83517a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C83516g f186520a;

            static {
                Covode.recordClassIndex(97403);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C83517a(C83516g gVar) {
                super(0);
                this.f186520a = gVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                String e;
                AbstractC83492a aVar = this.f186520a.f186519a.musicPlayApiComponent;
                if (!(aVar == null || !aVar.mo128517c() || (e = this.f186520a.f186519a.getShortVideoContext().f155817b.mo109893e()) == null)) {
                    this.f186520a.f186519a.playMusic(e);
                }
                return C89391z.f203057a;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C83516g(C83509d dVar) {
            this.f186519a = dVar;
        }

        @Override // com.p2082ss.android.medialib.listener.AbstractC30012b
        /* renamed from: a */
        public final void mo52865a(int i) {
            C31098f.m64301a(new C83517a(this));
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.d$p */
    static final class C83526p extends AbstractC89220m implements AbstractC89171a<C83533f> {

        /* renamed from: a */
        final /* synthetic */ C83509d f186530a;

        static {
            Covode.recordClassIndex(97412);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83526p(C83509d dVar) {
            super(0);
            this.f186530a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C83533f invoke() {
            return new C83533f(this.f186530a.states, ((AbstractC71864a) this.f186530a.getDiContainer().mo35247a(AbstractC71864a.class)).mo113515d(), this.f186530a.getStickerApiComponent().mo23167t(), this.f186530a.getShortVideoContext());
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.choosemusic.AbstractC83490a
    public C89378p<Integer, Integer> getChooseMusicAnchorViewPosition() {
        C83533f recordChooseMusicScene = getRecordChooseMusicScene();
        int[] iArr = new int[2];
        FrameLayout frameLayout = recordChooseMusicScene.f186561g;
        if (frameLayout == null) {
            C89219l.m154710a("musicRootContainer");
        }
        frameLayout.getLocationOnScreen(iArr);
        View view = recordChooseMusicScene.f52550n;
        C89219l.m154716b(view, "");
        int width = view.getWidth();
        View view2 = recordChooseMusicScene.f52550n;
        C89219l.m154716b(view2, "");
        return C89387v.m154943a(Integer.valueOf(iArr[0] + (width / 2)), Integer.valueOf(iArr[1] + view2.getHeight()));
    }

    private final void initMusicUI() {
        C69905c cVar;
        if (!getShortVideoContext().f155817b.mo109889b() && !getShortVideoContext().f155817b.mo109890c() && !getShortVideoContext().mo110029e() && (cVar = C70005cr.m123611a().f156482a) != null) {
            Activity activity = this.parentScene.f52549m;
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            EffectTemplate effectTemplate = (EffectTemplate) activity.getIntent().getParcelableExtra("first_sticker");
            if (effectTemplate == null || !effectTemplate.isBusiness() || cVar.isCommerceMusic()) {
                getCameraView().mo56938f(false);
                getCameraView().mo56936e(true);
                changeHasMusic(cVar);
                tryShowMusicTip();
                monitorAutoSelectedMusic(getShortVideoContext().f155831p, cVar);
                return;
            }
            C70005cr.m123611a().mo70083a((C69905c) null);
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.choosemusic.AbstractC83490a
    public void clearMusic() {
        C70643dn.m124856a(getShortVideoContext());
        long backgroundVideoDuration = getBackgroundVideoDuration();
        if (backgroundVideoDuration > 0 && isChangeBgVideoDuration()) {
            getShortVideoContext().mo110001a(Math.min(getShortVideoContext().f155817b.f155646b, backgroundVideoDuration));
        }
        getRecordControlApi().mo22875a(new C14190j(getShortVideoContext().f155817b.f155646b));
        handleCancelMusicResultEvent();
        C70005cr.m123611a().mo70083a((C69905c) null);
        changeHasMusic(null);
    }

    @Override // com.bytedance.als.AbstractC2562j
    public void onResume() {
        C69905c cVar;
        super.onResume();
        if (getShortVideoContext().f155817b.mo109888a() && (cVar = C70005cr.m123611a().f156482a) != null) {
            C89219l.m154716b(cVar, "");
            if (cVar.isLocalMusic()) {
                Workspace workspace = getShortVideoContext().f155817b.f155652h;
                C89219l.m154716b(workspace, "");
                if (!C69823b.m123388a(workspace.mo110093c(), C2556g.m7474c(this))) {
                    changeHasMusic(null);
                    C70005cr.m123611a().f156482a = null;
                    getChooseMusicHandler().mo110146a(C40888d.C40889a.m82358a(true, null, null, null));
                }
            }
        }
    }

    private final void tryShowMusicTip() {
        C69905c cVar;
        if (getShortVideoContext() != null && getShortVideoContext().mo110014a()) {
            Activity activity = this.parentScene.f52549m;
            if (activity == null) {
                C89219l.m154715b();
            }
            C89219l.m154716b(activity, "");
            if (!C72847c.m128639e((Effect) activity.getIntent().getParcelableExtra("first_sticker"))) {
                getShortVideoContext().f155792ab = true;
                showMusicTips(1);
                Object a = getDiContainer().mo35249a(AbstractC83634a.class, (String) null);
                C89219l.m154716b(a, "");
                AbstractC83634a aVar = (AbstractC83634a) a;
                aVar.setNeedNoTouchListener(true);
                aVar.getNoBlockTouchEvent().mo6997a(this, new C83527q(this));
                if ((C89219l.m154714a((Object) "prop_reuse", (Object) getShortVideoContext().f155831p) || C89219l.m154714a((Object) "prop_page", (Object) getShortVideoContext().f155831p)) && (cVar = C70005cr.m123611a().f156482a) != null) {
                    Activity activity2 = this.parentScene.f52549m;
                    if (activity2 == null) {
                        C89219l.m154715b();
                    }
                    C89219l.m154716b(activity2, "");
                    EffectTemplate effectTemplate = (EffectTemplate) activity2.getIntent().getParcelableExtra("first_sticker");
                    if (effectTemplate != null) {
                        C39162r.m79460a("prop_music_show", new C84425b().mo129406a("creation_id", getShortVideoContext().f155830o).mo129406a("shoot_way", getShortVideoContext().f155831p).mo129406a("enter_from", "video_shoot_page").mo129406a("music_id", cVar.getMusicId()).mo129406a("prop_id", effectTemplate.getEffectId()).mo129406a("group_id", EnumC69833ak.INSTANCE.getVideoId()).f188764a);
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.choosemusic.AbstractC83490a
    public void handleCancelMusicResultEvent() {
        getCameraView().setMusicPath("");
        getCameraView().mo56918a((ASCameraView) "", (String) 0, 0L, 0L);
        getCameraView().mo56929b(false);
        AbstractC83492a aVar = this.musicPlayApiComponent;
        if (aVar != null) {
            aVar.mo128512a(getStickerApiComponent().mo23167t().mo119294f());
        }
        getStickerApiComponent().mo23130l();
        getShortVideoContext().f155822g = 0;
        getShortVideoContext().mo110023d(0);
        this.internalCurrentMusic = null;
        C70005cr.m123611a().mo70083a((C69905c) null);
        getShortVideoContext().f155817b.f155652h.mo110094d();
        getShortVideoContext().mo110011a((String) null);
        C84090k.m144599a(getStickerApiComponent(), new PrivacyCert(new C13349j("1051"), "Record audio when using sound effects on the shooting page.", new C13350k[]{C13401b.m24108b()}));
        this.musicCleared.mo6999a(C89391z.f203057a);
        if (!getShortVideoContext().f155817b.f155663s) {
            getRecordControlApi().mo22887a(getShortVideoContext().f155817b.f155664t, false);
        }
    }

    @Override // com.bytedance.als.AbstractC2562j
    public void onCreate() {
        C2559g<Boolean> b;
        C2559g<Boolean> a;
        super.onCreate();
        C83528e eVar = new C83528e(getActivity(), getCameraApi(), getStickerApiComponent(), getRecommendMusicApiComponent(), this, getBottomTabApiComponent(), getShortVideoContext());
        this.parentScene.mo36387a(R.id.dg9, getRecordChooseMusicScene(), "RecordChooseMusicScene");
        this.states.f186507n.mo6997a(this, new C83512c(eVar));
        this.states.f186494a.mo7036a(this, new C83518h(this));
        getCameraApi().mo22799ag().mo6997a(this, new C83519i(this));
        getBottomTabApiComponent().getBottomTabIndexChangeEvent().mo6997a(this, new C83520j(this));
        getPlanCUIApiComponent().mo113517e().mo6997a(this, new C83521k(this));
        getRecordControlApi().mo22908o().mo7038b(this, new C83522l(this));
        getRecordControlApi().mo22916w().mo6997a(this, new C83523m(this));
        getPlanCUIApiComponent().mo113507a().mo7036a(this, new C83524n(this));
        this.states.f186502i.mo6997a(this, new C83525o(this, eVar));
        AbstractC83492a aVar = this.musicPlayApiComponent;
        if (!(aVar == null || (a = aVar.mo128510a()) == null)) {
            a.mo6997a(this, new C83513d(this));
        }
        AbstractC83492a aVar2 = this.musicPlayApiComponent;
        if (!(aVar2 == null || (b = aVar2.mo128514b()) == null)) {
            b.mo6997a(this, new C83514e(this));
        }
        this.states.f186509p.mo6997a(this, new C83515f(this));
        getCameraApi().mo22747A().mo56909a(new C83516g(this));
        initMusicUI();
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.choosemusic.AbstractC83490a
    public void setStickerMusicCancelState(C89378p<? extends Effect, Boolean> pVar) {
        this.stickerMusicCancelState = pVar;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.d$m */
    static final class C83523m<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83509d f186526a;

        static {
            Covode.recordClassIndex(97409);
        }

        C83523m(C83509d dVar) {
            this.f186526a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f186526a.changeMusicUi();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.d$q */
    public static final class C83527q<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83509d f186531a;

        static {
            Covode.recordClassIndex(97413);
        }

        C83527q(C83509d dVar) {
            this.f186531a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f186531a.tryHideMusicTips();
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.choosemusic.AbstractC83490a
    public void showMusicTips(Integer num) {
        this.states.f186505l.mo6999a(num);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.choosemusic.AbstractC83490a
    public void changeCancelMusicBtnVisible(boolean z) {
        this.states.f186503j.mo6999a(Boolean.valueOf(z));
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.choosemusic.AbstractC83490a
    public void changeHasMusic(C69905c cVar) {
        this.internalCurrentMusic = cVar;
        this.states.f186500g.mo6999a(cVar);
    }

    public final void changeMusicAutoPlayState(boolean z) {
        this.states.f186508o.mo7019b(Boolean.valueOf(z));
    }

    public void changeUiEnableState(boolean z) {
        this.states.f186499f.mo7019b(Boolean.valueOf(z));
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.choosemusic.AbstractC83490a
    public void handleChooseMusic(C40888d dVar) {
        C89219l.m154721d(dVar, "");
        getChooseMusicHandler().mo110146a(dVar);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.choosemusic.AbstractC83490a
    public void setUiLoadingMusic(boolean z) {
        this.states.f186501h.mo6999a(Boolean.valueOf(z));
    }

    public void setupClickListener(boolean z) {
        this.states.f186504k.mo7019b(Boolean.valueOf(z));
    }

    public final void switchAutoPlayMusicUi(boolean z) {
        this.states.f186510q.mo6999a(Boolean.valueOf(z));
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.d$d */
    static final class C83513d<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83509d f186516a;

        static {
            Covode.recordClassIndex(97399);
        }

        C83513d(C83509d dVar) {
            this.f186516a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C83509d dVar = this.f186516a;
            C89219l.m154716b(bool, "");
            dVar.changeMusicAutoPlayState(bool.booleanValue());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.d$e */
    static final class C83514e<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83509d f186517a;

        static {
            Covode.recordClassIndex(97400);
        }

        C83514e(C83509d dVar) {
            this.f186517a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C83509d dVar = this.f186517a;
            C89219l.m154716b(bool, "");
            dVar.switchAutoPlayMusicUi(bool.booleanValue());
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.d$i */
    static final class C83519i<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83509d f186522a;

        static {
            Covode.recordClassIndex(97405);
        }

        C83519i(C83509d dVar) {
            this.f186522a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            if (((C14191k) obj).f34466b) {
                this.f186522a.startChooseMusicAnim(0.0f, 1.0f);
            } else {
                this.f186522a.startChooseMusicAnim(1.0f, 0.0f);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.d$h */
    static final class C83518h<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83509d f186521a;

        static {
            Covode.recordClassIndex(97404);
        }

        C83518h(C83509d dVar) {
            this.f186521a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                AbstractC22219j a = this.f186521a.parentScene.mo36386a("RecordChooseMusicScene");
                if (a != null) {
                    this.f186521a.parentScene.mo36417e(a);
                    return;
                }
                return;
            }
            AbstractC22219j a2 = this.f186521a.parentScene.mo36386a("RecordChooseMusicScene");
            if (a2 != null) {
                this.f186521a.parentScene.mo36413d(a2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.d$k */
    static final class C83521k<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83509d f186524a;

        static {
            Covode.recordClassIndex(97407);
        }

        C83521k(C83509d dVar) {
            this.f186524a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C89386u uVar = (C89386u) obj;
            if (((Number) uVar.getFirst()).intValue() == 12346 && ((Number) uVar.getSecond()).intValue() == -1 && this.f186524a.getShortVideoContext().f155753N) {
                this.f186524a.handleCancelMusicResultEvent();
            }
        }
    }

    public final void playMusic(String str) {
        Long l;
        if (getShortVideoContext().f155763X != 2) {
            l = Long.valueOf(getShortVideoContext().f155817b.mo109899k());
        } else {
            l = null;
        }
        AbstractC83492a aVar = this.musicPlayApiComponent;
        if (aVar != null) {
            AbstractC83492a.C83493a.m143875a(aVar, str, (long) getShortVideoContext().f155817b.f155661q, l, getStickerApiComponent().mo23167t().mo119294f());
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.choosemusic.AbstractC83490a
    public void startPreviewMusic(boolean z) {
        AbstractC63257p s = C63244g.m114602a().mo73291s();
        Objects.requireNonNull(s, "null cannot be cast to non-null type com.ss.android.ugc.aweme.port.`in`.IAnotherMusicService");
        AbstractC63154aa aaVar = (AbstractC63154aa) s;
        if (z || (!C89219l.m154714a(C40964c.m82474c().getClass(), aaVar.mo101554m()) && !getMusicCutComponent().mo128708f() && !getCountDownComponent().mo110376d())) {
            getCameraView().mo56940g();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.d$c */
    static final class C83512c<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83528e f186515a;

        static {
            Covode.recordClassIndex(97398);
        }

        C83512c(C83528e eVar) {
            this.f186515a = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C83528e eVar = this.f186515a;
            PrivacyCert privacyCert = new PrivacyCert(new C13349j("1030"), "Open the camera on the shooting page to preview and shoot the video.", new C13350k[]{C13401b.m24107a()});
            C89219l.m154721d(privacyCert, "");
            if (eVar.f186537f.f155817b.f155662r != null) {
                eVar.f186534c.mo128897E().mo119594d();
            }
            eVar.f186533b.mo22783a(new C83528e.C83532d(eVar));
            if (!C68026bl.m120328a() || !C68027bm.m120329a() || C63244g.m114602a().mo73255A().mo93901a()) {
                eVar.f186533b.mo22742b(C83528e.m143906a(), privacyCert);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.d$f */
    static final class C83515f<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83509d f186518a;

        static {
            Covode.recordClassIndex(97401);
        }

        C83515f(C83509d dVar) {
            this.f186518a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C83509d dVar = this.f186518a;
            C89219l.m154716b(bool, "");
            dVar.mobClickPlayMusic(bool.booleanValue());
            if (bool.booleanValue()) {
                AbstractC83492a aVar = this.f186518a.musicPlayApiComponent;
                if (aVar != null) {
                    aVar.mo128518d(this.f186518a.getStickerApiComponent().mo23167t().mo119294f());
                    return;
                }
                return;
            }
            AbstractC83492a aVar2 = this.f186518a.musicPlayApiComponent;
            if (aVar2 != null) {
                aVar2.mo128516c(this.f186518a.getStickerApiComponent().mo23167t().mo119294f());
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.d$j */
    static final class C83520j<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83509d f186523a;

        static {
            Covode.recordClassIndex(97406);
        }

        C83520j(C83509d dVar) {
            this.f186523a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Object obj2 = ((C83408c) obj).f186277c;
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.CharSequence");
            boolean z = false;
            if (TextUtils.equals((CharSequence) obj2, C63247i.f143610a.getString(R.string.f7u))) {
                this.f186523a.setChooseMusicVisible(null, false, false);
            } else if (!this.f186523a.getShortVideoContext().mo110018b() && !this.f186523a.getShortVideoContext().f155817b.mo109889b() && !this.f186523a.getShortVideoContext().f155817b.mo109890c()) {
                this.f186523a.setChooseMusicVisible(null, true, true);
                C83509d dVar = this.f186523a;
                if (dVar.getShortVideoContext().f155817b.mo109896h() == 0) {
                    z = true;
                }
                dVar.setEnable(z);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.d$l */
    static final class C83522l<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83509d f186525a;

        static {
            Covode.recordClassIndex(97408);
        }

        C83522l(C83509d dVar) {
            this.f186525a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            C14201t tVar = (C14201t) obj;
            if (tVar != null) {
                if (tVar.f34477b != 0 || !tVar.f34476a.isEmpty() || this.f186525a.getShortVideoContext().f155817b.f155653i) {
                    z = false;
                } else {
                    z = true;
                }
                this.f186525a.getShortVideoContext();
                if (C68109p.m120400a() != 2) {
                    this.f186525a.setEnable(z);
                } else if (z != this.f186525a.enableRecordChooseMusicComponent) {
                    this.f186525a.setEnable(z);
                    this.f186525a.enableRecordChooseMusicComponent = z;
                }
            }
        }
    }

    public final void mobClickPlayMusic(boolean z) {
        C39162r.m79460a("click_play_music", new C84425b().mo129406a("enter_from", "video_shoot_page").mo129406a("shoot_way", getShortVideoContext().f155831p).mo129406a("content_source", "shoot").mo129406a("content_type", "video").mo129406a("creation_id", getShortVideoContext().f155830o).mo129406a("music_id", getShortVideoContext().f155820e).mo129407a("play_status", z).f188764a);
    }

    public final void setEnable(boolean z) {
        if (getShortVideoContext().mo110018b() || getShortVideoContext().f155817b.mo109889b() || getShortVideoContext().f155817b.mo109890c() || getShortVideoContext().mo110032h()) {
            setChooseMusicVisible(false, null, null);
            return;
        }
        if (getShortVideoContext().mo110022c()) {
            z = false;
        }
        setupClickListener(z);
        changeUiEnableState(z);
        if (z) {
            if (C70005cr.m123611a().f156482a == null) {
                changeHasMusic(null);
            }
        } else if (C70005cr.m123611a().f156482a != null && getShortVideoContext().f155817b.mo109888a()) {
            changeHasMusic(C70005cr.m123611a().f156482a);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.d$n */
    static final class C83524n<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83509d f186527a;

        static {
            Covode.recordClassIndex(97410);
        }

        C83524n(C83509d dVar) {
            this.f186527a = dVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (this.f186527a.getShortVideoContext().mo110018b()) {
                this.f186527a.setChooseMusicVisible(false, null, null);
                return;
            }
            if (this.f186527a.getShortVideoContext().mo110032h()) {
                this.f186527a.setChooseMusicVisible(false, null, null);
            } else if (this.f186527a.getPlanCUIApiComponent().mo113519g()) {
                this.f186527a.setChooseMusicVisible(true, null, null);
            } else {
                this.f186527a.setChooseMusicVisible(bool, null, null);
            }
            if (!bool.booleanValue()) {
                this.f186527a.tryHideMusicTips();
            }
            if (this.f186527a.getShortVideoContext().f155817b.mo109889b() || this.f186527a.getShortVideoContext().f155817b.mo109890c()) {
                this.f186527a.setChooseMusicVisible(false, null, null);
            } else if (!bool.booleanValue()) {
                this.f186527a.setChooseMusicVisible(false, false, false);
            } else {
                this.f186527a.setChooseMusicVisible(null, bool, bool);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.d$o */
    static final class C83525o<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83509d f186528a;

        /* renamed from: b */
        final /* synthetic */ C83528e f186529b;

        static {
            Covode.recordClassIndex(97411);
        }

        C83525o(C83509d dVar, C83528e eVar) {
            this.f186528a = dVar;
            this.f186529b = eVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC83566a recommendMusicApiComponent;
            C89378p<MusicModel, Long> a;
            MusicModel first;
            String musicId;
            String str;
            boolean z = true;
            this.f186529b.mo128554a(true);
            this.f186528a.clearMusic();
            if (C46790cg.m90136a()) {
                C84425b a2 = new C84425b().mo129406a("creation_id", this.f186528a.getShortVideoContext().f155830o).mo129406a("enter_from", "video_shoot_page").mo129406a("shoot_way", this.f186528a.getShortVideoContext().f155831p);
                C69905c a3 = this.f186528a.states.f186500g.mo6996a();
                if (a3 != null) {
                    str = a3.getMusicId();
                } else {
                    str = null;
                }
                C39162r.m79460a("unselect_music", a2.mo129406a("music_id", str).f188764a);
            }
            if (C46952fr.m90237c() && (recommendMusicApiComponent = this.f186528a.getRecommendMusicApiComponent()) != null) {
                if (this.f186528a.getShortVideoContext().f155763X != 14) {
                    z = false;
                }
                C83621a value = recommendMusicApiComponent.mo128580a().getValue();
                if (!(value == null || (a = value.mo128632a(z)) == null || (first = a.getFirst()) == null || (musicId = first.getMusicId()) == null)) {
                    String str2 = this.f186528a.getShortVideoContext().f155830o;
                    C89219l.m154716b(str2, "");
                    C89219l.m154721d(musicId, "");
                    C89219l.m154721d(str2, "");
                    C89219l.m154721d("recommend", "");
                    C39162r.m79460a("click_delete_music", new C84425b().mo129406a("enter_from", "video_shoot_page").mo129406a("music_id", musicId).mo129406a("creation_id", str2).mo129406a("music_type", "recommend").f188764a);
                }
            }
            if (C65473f.m117200b()) {
                this.f186528a.clearMusic();
            }
            this.f186528a.applyBackgroundVideoIfNeed();
        }
    }

    public void startChooseMusicAnim(float f, float f2) {
        this.states.f186497d.mo7019b(C89387v.m154943a(Float.valueOf(f), Float.valueOf(f2)));
    }

    private final void monitorAutoSelectedMusic(String str, C69905c cVar) {
        AVChallenge aVChallenge;
        String str2;
        if (cVar != null) {
            C70005cr a = C70005cr.m123611a();
            String str3 = "";
            C89219l.m154716b(a, str3);
            List<AVChallenge> list = a.f156485d;
            if (TextUtils.equals(str, "challenge") && !C13603b.m24435a((Collection) list)) {
                C89219l.m154716b(list, str3);
                if (C89070n.m154583g((List) list) != null && (aVChallenge = (AVChallenge) C89070n.m154583g((List) list)) != null && aVChallenge.isCommerce) {
                    C69840ar a2 = new C69840ar().mo110189a("shoot_way", str);
                    AVChallenge aVChallenge2 = list.get(0);
                    if (aVChallenge2 == null || (str2 = aVChallenge2.cid) == null) {
                        str2 = str3;
                    }
                    C69840ar a3 = a2.mo110189a("challenge_id", str2);
                    String mid = cVar.getMid();
                    if (mid != null) {
                        str3 = mid;
                    }
                    C40982q.m82520a("autoselected_music_monitor", 0, a3.mo110189a("sticker_id", str3).mo110191a());
                }
            }
        }
    }

    public C83509d(AbstractC22186b bVar, C21582f fVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(fVar, "");
        this.parentScene = bVar;
        this.diContainer = fVar;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.choosemusic.AbstractC83490a
    public void handleChooseMusicResultEvent(C69905c cVar, String str) {
        if (cVar != null) {
            boolean a = getShortVideoContext().f155817b.mo109888a();
            getShortVideoContext().f155817b.f155652h.mo110090a(str);
            getShortVideoContext().mo110011a(str);
            getShortVideoContext().f155753N = false;
            getCameraView().setMusicPath(str);
            getCameraView().mo56918a((ASCameraView) str, (String) 0, 0L, 0L);
            getCameraView().mo56929b(true);
            getStickerApiComponent().mo23118a(true);
            if (!a) {
                getCameraView().mo56897a(getActivity(), getCameraApi().mo22812d().mo115067a());
            }
            int i = cVar.duration;
            if (i > 0) {
                getShortVideoContext().f155822g = i;
            }
            if (!getShortVideoContext().mo110022c()) {
                getShortVideoContext().mo110023d(0);
            }
            getShortVideoContext().f155820e = cVar.getMid();
            getShortVideoContext().f155824i = cVar.strongBeatUrl;
            C84090k.m144599a(getStickerApiComponent(), new PrivacyCert(new C13349j("1050"), "Record audio when using sound effects on the shooting page.", new C13350k[]{C13401b.m24108b()}));
            AbstractC83492a aVar = this.musicPlayApiComponent;
            if (aVar != null && aVar.mo128517c()) {
                playMusic(str);
            }
        }
        this.internalCurrentMusic = cVar;
        C70005cr.m123611a().mo70083a(cVar);
        if (cVar == null) {
            this.musicCleared.mo6999a(C89391z.f203057a);
        } else {
            this.musicAdded.mo6999a(C89391z.f203057a);
        }
        if (!getShortVideoContext().f155817b.f155663s) {
            getRecordControlApi().mo22887a(getShortVideoContext().f155817b.f155664t, false);
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    public <M1 extends C20536x<S1, PROP1>, PROP1 extends AbstractC20368af, S1 extends AbstractC20368af, R> R withSubstate(C20536x<S1, PROP1> xVar, AbstractC89172b<? super PROP1, ? extends R> bVar) {
        C89219l.m154721d(xVar, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38598a(xVar, bVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, VM2 extends JediViewModel<S2>, S2 extends AbstractC20368af, R> R withState(VM1 vm1, VM2 vm2, AbstractC89183m<? super S1, ? super S2, ? extends R> mVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(vm2, "");
        C89219l.m154721d(mVar, "");
        return (R) AbstractC20382b.C20383a.m38592a(vm1, vm2, mVar);
    }

    public <M1 extends C20536x<S1, PROP1>, PROP1 extends AbstractC20368af, S1 extends AbstractC20368af, M2 extends C20536x<S2, PROP2>, PROP2 extends AbstractC20368af, S2 extends AbstractC20368af, R> R withSubstate(C20536x<S1, PROP1> xVar, C20536x<S2, PROP2> xVar2, AbstractC89183m<? super PROP1, ? super PROP2, ? extends R> mVar) {
        C89219l.m154721d(xVar, "");
        C89219l.m154721d(xVar2, "");
        C89219l.m154721d(mVar, "");
        return (R) AbstractC20382b.C20383a.m38597a(xVar, xVar2, mVar);
    }

    public void setChooseMusicVisible(Boolean bool, Boolean bool2, Boolean bool3) {
        if (bool != null) {
            this.states.f186494a.mo7019b(Boolean.valueOf(bool.booleanValue()));
        }
        if (bool2 != null) {
            this.states.f186496c.mo7019b(Boolean.valueOf(bool2.booleanValue()));
        }
        if (bool3 != null) {
            this.states.f186495b.mo7019b(Boolean.valueOf(bool3.booleanValue()));
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.choosemusic.AbstractC83490a
    public void onChooseMusicDone(boolean z, String str, C69905c cVar, String str2) {
        if (z) {
            changeHasMusic(null);
        } else if (!TextUtils.isEmpty(str2)) {
            changeHasMusic(cVar);
            notifyMusicChange();
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public <S extends AbstractC20368af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38599a(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38606d(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public <S extends AbstractC20368af, A> void subscribeEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20391d<? extends A>> kVar, C20370ah<C20373ak<C20391d<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38602b(this, jediViewModel, kVar, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public <S extends AbstractC20368af, A> void subscribeMultiEvent(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends C20365ac<? extends A>> kVar, C20370ah<C20373ak<C20365ac<A>>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38605c(this, jediViewModel, kVar, ahVar, mVar);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, VM2 extends JediViewModel<S2>, S2 extends AbstractC20368af, VM3 extends JediViewModel<S3>, S3 extends AbstractC20368af, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, AbstractC89187q<? super S1, ? super S2, ? super S3, ? extends R> qVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(vm2, "");
        C89219l.m154721d(vm3, "");
        C89219l.m154721d(qVar, "");
        return (R) AbstractC20382b.C20383a.m38591a(vm1, vm2, vm3, qVar);
    }

    public <M1 extends C20536x<S1, PROP1>, PROP1 extends AbstractC20368af, S1 extends AbstractC20368af, M2 extends C20536x<S2, PROP2>, PROP2 extends AbstractC20368af, S2 extends AbstractC20368af, M3 extends C20536x<S3, PROP3>, PROP3 extends AbstractC20368af, S3 extends AbstractC20368af, R> R withSubstate(C20536x<S1, PROP1> xVar, C20536x<S2, PROP2> xVar2, C20536x<S3, PROP3> xVar3, AbstractC89187q<? super PROP1, ? super PROP2, ? super PROP3, ? extends R> qVar) {
        C89219l.m154721d(xVar, "");
        C89219l.m154721d(xVar2, "");
        C89219l.m154721d(xVar3, "");
        C89219l.m154721d(qVar, "");
        return (R) AbstractC20382b.C20383a.m38596a(xVar, xVar2, xVar3, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20382b.C20383a.m38585a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, VM2 extends JediViewModel<S2>, S2 extends AbstractC20368af, VM3 extends JediViewModel<S3>, S3 extends AbstractC20368af, VM4 extends JediViewModel<S4>, S4 extends AbstractC20368af, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, AbstractC89188r<? super S1, ? super S2, ? super S3, ? super S4, ? extends R> rVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(vm2, "");
        C89219l.m154721d(vm3, "");
        C89219l.m154721d(vm4, "");
        C89219l.m154721d(rVar, "");
        return (R) AbstractC20382b.C20383a.m38590a(vm1, vm2, vm3, vm4, rVar);
    }

    public <M1 extends C20536x<S1, PROP1>, PROP1 extends AbstractC20368af, S1 extends AbstractC20368af, M2 extends C20536x<S2, PROP2>, PROP2 extends AbstractC20368af, S2 extends AbstractC20368af, M3 extends C20536x<S3, PROP3>, PROP3 extends AbstractC20368af, S3 extends AbstractC20368af, M4 extends C20536x<S4, PROP4>, PROP4 extends AbstractC20368af, S4 extends AbstractC20368af, R> R withSubstate(C20536x<S1, PROP1> xVar, C20536x<S2, PROP2> xVar2, C20536x<S3, PROP3> xVar3, C20536x<S4, PROP4> xVar4, AbstractC89188r<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? extends R> rVar) {
        C89219l.m154721d(xVar, "");
        C89219l.m154721d(xVar2, "");
        C89219l.m154721d(xVar3, "");
        C89219l.m154721d(xVar4, "");
        C89219l.m154721d(rVar, "");
        return (R) AbstractC20382b.C20383a.m38595a(xVar, xVar2, xVar3, xVar4, rVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20382b.C20383a.m38584a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, VM2 extends JediViewModel<S2>, S2 extends AbstractC20368af, VM3 extends JediViewModel<S3>, S3 extends AbstractC20368af, VM4 extends JediViewModel<S4>, S4 extends AbstractC20368af, VM5 extends JediViewModel<S5>, S5 extends AbstractC20368af, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, VM4 vm4, VM5 vm5, AbstractC89189s<? super S1, ? super S2, ? super S3, ? super S4, ? super S5, ? extends R> sVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(vm2, "");
        C89219l.m154721d(vm3, "");
        C89219l.m154721d(vm4, "");
        C89219l.m154721d(vm5, "");
        C89219l.m154721d(sVar, "");
        return (R) AbstractC20382b.C20383a.m38589a(vm1, vm2, vm3, vm4, vm5, sVar);
    }

    public <M1 extends C20536x<S1, PROP1>, PROP1 extends AbstractC20368af, S1 extends AbstractC20368af, M2 extends C20536x<S2, PROP2>, PROP2 extends AbstractC20368af, S2 extends AbstractC20368af, M3 extends C20536x<S3, PROP3>, PROP3 extends AbstractC20368af, S3 extends AbstractC20368af, M4 extends C20536x<S4, PROP4>, PROP4 extends AbstractC20368af, S4 extends AbstractC20368af, M5 extends C20536x<S5, PROP5>, PROP5 extends AbstractC20368af, S5 extends AbstractC20368af, R> R withSubstate(C20536x<S1, PROP1> xVar, C20536x<S2, PROP2> xVar2, C20536x<S3, PROP3> xVar3, C20536x<S4, PROP4> xVar4, C20536x<S5, PROP5> xVar5, AbstractC89189s<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? super PROP5, ? extends R> sVar) {
        C89219l.m154721d(xVar, "");
        C89219l.m154721d(xVar2, "");
        C89219l.m154721d(xVar3, "");
        C89219l.m154721d(xVar4, "");
        C89219l.m154721d(xVar5, "");
        C89219l.m154721d(sVar, "");
        return (R) AbstractC20382b.C20383a.m38594a(xVar, xVar2, xVar3, xVar4, xVar5, sVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20382b.C20383a.m38586a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, A, B, C, D> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, C20370ah<C20376an<A, B, C, D>> ahVar, AbstractC89189s<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, C89391z> sVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(sVar, "");
        return AbstractC20382b.C20383a.m38587a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }

    public <S extends AbstractC20368af, A, B, C, D, E> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, AbstractC89290k<S, ? extends D> kVar4, AbstractC89290k<S, ? extends E> kVar5, C20370ah<C20377ao<A, B, C, D, E>> ahVar, AbstractC89190t<? super AbstractC20477i, ? super A, ? super B, ? super C, ? super D, ? super E, C89391z> tVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(kVar4, "");
        C89219l.m154721d(kVar5, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(tVar, "");
        return AbstractC20382b.C20383a.m38588a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, kVar5, ahVar, tVar);
    }
}
