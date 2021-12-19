package com.p2082ss.android.ugc.aweme.ftc.p3027b;

import android.app.Activity;
import android.text.TextUtils;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2559g;
import com.bytedance.als.C2563k;
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
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.scene.ktx.C22226a;
import com.p2082ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.ftc.p3026a.AbstractC51821a;
import com.p2082ss.android.ugc.aweme.ftc.p3027b.C51870b;
import com.p2082ss.android.ugc.aweme.ftc.p3027b.C51887g;
import com.p2082ss.android.ugc.aweme.ftc.p3034f.AbstractC52535a;
import com.p2082ss.android.ugc.aweme.p2722cy.p2723a.C40888d;
import com.p2082ss.android.ugc.aweme.p2730de.C40982q;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.C69840ar;
import com.p2082ss.android.ugc.aweme.shortvideo.C69903by;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70643dn;
import com.p2082ss.android.ugc.aweme.shortvideo.EnumC69833ak;
import com.p2082ss.android.ugc.aweme.shortvideo.EnumC69901bw;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.cutmusic.C70612k;
import com.p2082ss.android.ugc.aweme.shortvideo.p3835h.AbstractC71864a;
import com.p2082ss.android.ugc.aweme.shortvideo.record.p3857b.C72782a;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72847c;
import com.p2082ss.android.ugc.aweme.shortvideo.stitch.StitchParams;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.effectmanager.effect.model.template.EffectTemplate;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.C83408c;
import com.p2082ss.android.ugc.gamora.recorder.p4298e.AbstractC83634a;
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
import p4600h.C89386u;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.ftc.b.f */
public final class C51877f extends AbstractC2562j<AbstractC51869a> implements AbstractC20382b, AbstractC21566a, AbstractC51869a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f119537a = {new C89232y(C51877f.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0), new C89232y(C51877f.class, "cameraApi", "getCameraApi()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new C89232y(C51877f.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new C89232y(C51877f.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new C89232y(C51877f.class, "bottomTabApiComponent", "getBottomTabApiComponent()Lcom/ss/android/ugc/aweme/ftc/bottom/FTCBottomTabApiComponent;", 0), new C89232y(C51877f.class, "planCUIApiComponent", "getPlanCUIApiComponent()Lcom/ss/android/ugc/aweme/shortvideo/component/PlanCUIApiComponent;", 0), new C89232y(C51877f.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0)};

    /* renamed from: b */
    public final C2563k<C89391z> f119538b = new C2563k<>();

    /* renamed from: c */
    public final C2563k<C89391z> f119539c = new C2563k<>();

    /* renamed from: d */
    public final AbstractC22186b f119540d;

    /* renamed from: e */
    private final C51873c f119541e = new C51873c();

    /* renamed from: f */
    private final AbstractC89248d f119542f = C21572a.m40504a(getDiContainer(), ActivityC0945e.class);

    /* renamed from: g */
    private final AbstractC89248d f119543g = C21572a.m40504a(getDiContainer(), AbstractC14177d.class);

    /* renamed from: h */
    private final AbstractC89248d f119544h = C21572a.m40504a(getDiContainer(), AbstractC14193m.class);

    /* renamed from: i */
    private final AbstractC89248d f119545i = C21572a.m40504a(getDiContainer(), AbstractC84089j.class);

    /* renamed from: j */
    private final AbstractC89248d f119546j = C21572a.m40504a(getDiContainer(), AbstractC51821a.class);

    /* renamed from: k */
    private final AbstractC89248d f119547k = C21572a.m40504a(getDiContainer(), AbstractC71864a.class);

    /* renamed from: l */
    private final AbstractC89248d f119548l = C21572a.m40504a(getDiContainer(), ShortVideoContext.class);

    /* renamed from: m */
    private final AbstractC89244h f119549m = C89250i.m154773a((AbstractC89171a) new C51878a(this));

    /* renamed from: n */
    private final C21582f f119550n;

    static {
        Covode.recordClassIndex(61246);
    }

    /* renamed from: j */
    private final AbstractC14177d m96566j() {
        return (AbstractC14177d) this.f119543g.mo23374a(this, f119537a[1]);
    }

    /* renamed from: k */
    private final AbstractC84089j m96567k() {
        return (AbstractC84089j) this.f119545i.mo23374a(this, f119537a[3]);
    }

    /* renamed from: e */
    public final ActivityC0945e mo87593e() {
        return (ActivityC0945e) this.f119542f.mo23374a(this, f119537a[0]);
    }

    /* renamed from: f */
    public final AbstractC14193m mo87594f() {
        return (AbstractC14193m) this.f119544h.mo23374a(this, f119537a[2]);
    }

    /* renamed from: g */
    public final AbstractC71864a mo87595g() {
        return (AbstractC71864a) this.f119547k.mo23374a(this, f119537a[5]);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: h */
    public final ShortVideoContext mo87596h() {
        return (ShortVideoContext) this.f119548l.mo23374a(this, f119537a[6]);
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.p3027b.AbstractC51869a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2559g mo87570a() {
        return this.f119538b;
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.p3027b.AbstractC51869a
    /* renamed from: b */
    public final /* bridge */ /* synthetic */ C2559g mo87575b() {
        return this.f119539c;
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC51869a getApiComponent() {
        return this;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f119550n;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
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

    /* renamed from: l */
    private final ASCameraView m96568l() {
        return m96566j().mo22747A();
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.p3027b.AbstractC51869a
    /* renamed from: d */
    public final void mo87577d() {
        mo87589a(C70005cr.m123611a().f156482a);
        mo87591a(false);
    }

    /* renamed from: i */
    public final void mo87597i() {
        this.f119541e.f119529i.mo6999a((Integer) null);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.b.f$a */
    static final class C51878a extends AbstractC89220m implements AbstractC89171a<C51870b> {

        /* renamed from: a */
        final /* synthetic */ C51877f f119551a;

        static {
            Covode.recordClassIndex(61247);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51878a(C51877f fVar) {
            super(0);
            this.f119551a = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C51870b invoke() {
            ActivityC0945e e = this.f119551a.mo87593e();
            AbstractC14193m f = this.f119551a.mo87594f();
            C51877f fVar = this.f119551a;
            return new C51870b(e, f, fVar, fVar.mo87596h());
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.p3027b.AbstractC51869a
    /* renamed from: c */
    public final void mo87576c() {
        m96568l().mo56936e(true);
        m96568l().mo56938f(false);
        m96568l().setMusicPath("");
        m96568l().mo56918a((ASCameraView) "", (String) 0, 0L, 0L);
        m96568l().mo56929b(false);
        m96567k().mo23130l();
        mo87596h().f155822g = 0;
        mo87596h().mo110023d(0);
        mo87596h().f155817b.f155652h.mo110094d();
        mo87596h().mo110011a((String) null);
        C84090k.m144599a(m96567k(), new PrivacyCert(new C13349j("1053"), "Record audio when using sound effects on the shooting page.", new C13350k[]{C13401b.m24108b()}));
        this.f119539c.mo6999a(C89391z.f203057a);
        if (!mo87596h().f155817b.f155663s) {
            mo87594f().mo22887a(mo87596h().f155817b.f155664t, false);
        }
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        C69905c cVar;
        AVChallenge aVChallenge;
        String str;
        C69905c cVar2;
        super.onCreate();
        C51887g gVar = new C51887g(mo87593e(), m96566j(), m96567k(), this, mo87596h());
        this.f119540d.mo36387a(R.id.dg9, new C51891h(this.f119541e, ((AbstractC71864a) getDiContainer().mo35247a(AbstractC71864a.class)).mo113515d()), "FTCRecordChooseMusicScene");
        this.f119541e.f119531k.mo6997a(this, new C51879b(gVar));
        this.f119541e.f119521a.mo7036a(this, new C51880c(this));
        m96566j().mo22799ag().mo6997a(this, new C51881d(this));
        ((AbstractC51821a) this.f119546j.mo23374a(this, f119537a[4])).mo87556a().mo6997a(this, new C51882e(this));
        mo87594f().mo22908o().mo7038b(this, new C51883f(this));
        mo87594f().mo22916w().mo6997a(this, new C51884g(this));
        mo87595g().mo113507a().mo7036a(this, new C51885h(this));
        if (!mo87596h().f155817b.mo109889b() && !mo87596h().f155817b.mo109890c() && !mo87596h().mo110029e() && (cVar = C70005cr.m123611a().f156482a) != null) {
            m96568l().mo56938f(true);
            m96568l().mo56936e(false);
            mo87589a(cVar);
            mo87592b(false);
            String str2 = "";
            if (mo87596h() != null && mo87596h().mo110014a()) {
                Activity activity = this.f119540d.f52549m;
                if (activity == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(activity, str2);
                if (!C72847c.m128639e((Effect) activity.getIntent().getParcelableExtra("first_sticker"))) {
                    mo87596h().f155792ab = true;
                    mo87573a((Integer) 1);
                    Object a = getDiContainer().mo35249a(AbstractC83634a.class, (String) null);
                    C89219l.m154716b(a, str2);
                    AbstractC83634a aVar = (AbstractC83634a) a;
                    aVar.setNeedNoTouchListener(true);
                    aVar.getNoBlockTouchEvent().mo6997a(this, new C51886i(this));
                    if ((C89219l.m154714a((Object) "prop_reuse", (Object) mo87596h().f155831p) || C89219l.m154714a((Object) "prop_page", (Object) mo87596h().f155831p)) && (cVar2 = C70005cr.m123611a().f156482a) != null) {
                        Activity activity2 = this.f119540d.f52549m;
                        if (activity2 == null) {
                            C89219l.m154715b();
                        }
                        C89219l.m154716b(activity2, str2);
                        EffectTemplate effectTemplate = (EffectTemplate) activity2.getIntent().getParcelableExtra("first_sticker");
                        if (effectTemplate != null) {
                            C39162r.m79460a("prop_music_show", new C84425b().mo129406a("creation_id", mo87596h().f155830o).mo129406a("shoot_way", mo87596h().f155831p).mo129406a("enter_from", "video_shoot_page").mo129406a("music_id", cVar2.getMusicId()).mo129406a("prop_id", effectTemplate.getEffectId()).mo129406a("group_id", EnumC69833ak.INSTANCE.getVideoId()).f188764a);
                        }
                    }
                }
            }
            String str3 = mo87596h().f155831p;
            C70005cr a2 = C70005cr.m123611a();
            C89219l.m154716b(a2, str2);
            List<AVChallenge> list = a2.f156485d;
            if (TextUtils.equals(str3, "challenge") && !C13603b.m24435a((Collection) list)) {
                C89219l.m154716b(list, str2);
                if (C89070n.m154583g((List) list) != null && (aVChallenge = (AVChallenge) C89070n.m154583g((List) list)) != null && aVChallenge.isCommerce) {
                    C69840ar a3 = new C69840ar().mo110189a("shoot_way", str3);
                    AVChallenge aVChallenge2 = list.get(0);
                    if (aVChallenge2 == null || (str = aVChallenge2.cid) == null) {
                        str = str2;
                    }
                    C69840ar a4 = a3.mo110189a("challenge_id", str);
                    String mid = cVar.getMid();
                    if (mid != null) {
                        str2 = mid;
                    }
                    C40982q.m82520a("autoselected_music_monitor", 0, a4.mo110189a("sticker_id", str2).mo110191a());
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.b.f$g */
    static final class C51884g<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C51877f f119557a;

        static {
            Covode.recordClassIndex(61253);
        }

        C51884g(C51877f fVar) {
            this.f119557a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f119557a.mo87577d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.b.f$i */
    static final class C51886i<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C51877f f119559a;

        static {
            Covode.recordClassIndex(61255);
        }

        C51886i(C51877f fVar) {
            this.f119559a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f119559a.mo87597i();
        }
    }

    /* renamed from: a */
    public final void mo87589a(C69905c cVar) {
        this.f119541e.f119527g.mo6999a(cVar);
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.p3027b.AbstractC51869a
    /* renamed from: a */
    public final void mo87573a(Integer num) {
        this.f119541e.f119529i.mo6999a(num);
    }

    /* renamed from: b */
    public final void mo87592b(boolean z) {
        this.f119541e.f119526f.mo7019b(Boolean.valueOf(z));
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.b.f$c */
    static final class C51880c<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C51877f f119553a;

        static {
            Covode.recordClassIndex(61249);
        }

        C51880c(C51877f fVar) {
            this.f119553a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                C22226a.m41823a(this.f119553a.f119540d, "FTCRecordChooseMusicScene");
            } else {
                C22226a.m41824b(this.f119553a.f119540d, "FTCRecordChooseMusicScene");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.b.f$d */
    static final class C51881d<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C51877f f119554a;

        static {
            Covode.recordClassIndex(61250);
        }

        C51881d(C51877f fVar) {
            this.f119554a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            if (((C14191k) obj).f34466b) {
                this.f119554a.mo87588a(0.0f, 1.0f);
            } else {
                this.f119554a.mo87588a(1.0f, 0.0f);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.b.f$b */
    static final class C51879b<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C51887g f119552a;

        static {
            Covode.recordClassIndex(61248);
        }

        C51879b(C51887g gVar) {
            this.f119552a = gVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C51887g gVar = this.f119552a;
            PrivacyCert privacyCert = new PrivacyCert(new C13349j("1025"), "Open the camera on the shooting page to preview and shoot the video.", new C13350k[]{C13401b.m24107a()});
            AbstractC84089j jVar = gVar.f119562c;
            if (gVar.f119564e.f155817b.f155662r != null) {
                jVar.mo128897E().mo119594d();
            }
            gVar.f119561b.mo22783a(new C51887g.C51890c(gVar));
            gVar.f119561b.mo22742b(false, privacyCert);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.b.f$e */
    static final class C51882e<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C51877f f119555a;

        static {
            Covode.recordClassIndex(61251);
        }

        C51882e(C51877f fVar) {
            this.f119555a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C83408c cVar = (C83408c) obj;
            Object obj2 = cVar.f186277c;
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.CharSequence");
            if (!TextUtils.equals((CharSequence) obj2, C63247i.f143610a.getString(R.string.f7z))) {
                Object obj3 = cVar.f186277c;
                Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.CharSequence");
                if (!TextUtils.equals((CharSequence) obj3, C63247i.f143610a.getString(R.string.f7u))) {
                    if (!this.f119555a.mo87596h().f155817b.mo109889b() && !this.f119555a.mo87596h().f155817b.mo109890c()) {
                        this.f119555a.mo87590a((Boolean) null, (Boolean) true, (Boolean) true);
                        return;
                    }
                    return;
                }
            }
            this.f119555a.mo87590a((Boolean) null, (Boolean) false, (Boolean) false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.b.f$h */
    static final class C51885h<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C51877f f119558a;

        static {
            Covode.recordClassIndex(61254);
        }

        C51885h(C51877f fVar) {
            this.f119558a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (this.f119558a.mo87596h().mo110032h()) {
                this.f119558a.mo87590a((Boolean) false, (Boolean) null, (Boolean) null);
            } else if (this.f119558a.mo87595g().mo113519g()) {
                this.f119558a.mo87590a((Boolean) true, (Boolean) null, (Boolean) null);
            } else {
                this.f119558a.mo87590a(bool, (Boolean) null, (Boolean) null);
            }
            if (!bool.booleanValue()) {
                this.f119558a.mo87597i();
            }
            if (this.f119558a.mo87596h().f155817b.mo109889b() || this.f119558a.mo87596h().f155817b.mo109890c()) {
                this.f119558a.mo87590a((Boolean) false, (Boolean) null, (Boolean) null);
            } else {
                this.f119558a.mo87590a((Boolean) null, bool, bool);
            }
        }
    }

    /* renamed from: a */
    public final void mo87591a(boolean z) {
        this.f119541e.f119528h.mo7019b(Boolean.valueOf(z));
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.b.f$f */
    static final class C51883f<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C51877f f119556a;

        static {
            Covode.recordClassIndex(61252);
        }

        C51883f(C51877f fVar) {
            this.f119556a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            C14201t tVar = (C14201t) obj;
            if (tVar != null) {
                boolean z2 = false;
                if (tVar.f34477b != 0 || !tVar.f34476a.isEmpty() || this.f119556a.mo87596h().f155817b.f155653i) {
                    z = false;
                } else {
                    z = true;
                }
                C51877f fVar = this.f119556a;
                if (fVar.mo87596h().f155817b.mo109889b() || fVar.mo87596h().f155817b.mo109890c() || fVar.mo87596h().mo110032h()) {
                    fVar.mo87590a((Boolean) false, (Boolean) null, (Boolean) null);
                    return;
                }
                if (!fVar.mo87596h().mo110022c()) {
                    z2 = z;
                }
                fVar.mo87591a(z2);
                fVar.mo87592b(z2);
                if (z2) {
                    if (C70005cr.m123611a().f156482a == null) {
                        fVar.mo87589a((C69905c) null);
                    }
                } else if (C70005cr.m123611a().f156482a != null && fVar.mo87596h().f155817b.mo109888a()) {
                    fVar.mo87589a(C70005cr.m123611a().f156482a);
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.p3027b.AbstractC51869a
    /* renamed from: a */
    public final void mo87571a(C40888d dVar) {
        long j;
        long j2;
        long j3;
        long j4;
        EnumC69901bw a;
        C89219l.m154721d(dVar, "");
        C51870b bVar = (C51870b) this.f119549m.getValue();
        C89219l.m154721d(dVar, "");
        if (dVar.f95707a) {
            if (!bVar.f119516a.isFinishing()) {
                C70643dn.m124856a(bVar.f119519d);
                long b = bVar.mo87579b();
                if (b > 0 && bVar.mo87580c()) {
                    bVar.f119519d.mo110001a(Math.min(bVar.f119519d.f155817b.f155646b, b));
                }
                bVar.f119517b.mo22875a(new C14190j(bVar.f119519d.f155817b.f155646b));
                bVar.f119518c.mo87576c();
            }
        } else if (!TextUtils.isEmpty(dVar.f95710d) && !bVar.f119516a.isFinishing()) {
            String str = dVar.f95710d;
            C69905c cVar = dVar.f95709c;
            String str2 = dVar.f95708b;
            if (bVar.f119519d.f155817b.f155664t) {
                j = C51870b.f119514e;
            } else {
                j = 15000;
            }
            if (C72782a.m128364b(bVar.f119519d.f155743D.f155846a)) {
                StitchParams stitchParams = bVar.f119519d.f155743D.f155846a;
                if (stitchParams == null) {
                    C89219l.m154715b();
                }
                C89386u<Long, Long, Long> a2 = C72782a.m128363a(stitchParams, str, cVar, j);
                j2 = a2.component1().longValue();
                j3 = a2.component2().longValue();
                j4 = a2.component3().longValue();
            } else {
                if (cVar == null || TextUtils.isEmpty(str)) {
                    j2 = 0;
                    j3 = j;
                } else {
                    j2 = C69903by.m123467a(cVar, str);
                    j3 = Math.min(j2, j);
                }
                long b2 = bVar.mo87579b();
                if (b2 > 0 && bVar.mo87580c()) {
                    j3 = Math.min(j3, b2);
                }
                j4 = j3;
            }
            bVar.f119519d.f155823h = str2;
            bVar.f119519d.mo110011a(str);
            bVar.f119519d.mo110001a(j3);
            C70612k.m124747a(bVar.f119519d.f155817b.f155669y, new C51870b.C51872b(bVar));
            bVar.f119518c.mo87572a(cVar, str);
            if (cVar != null) {
                if (((long) cVar.shootDuration) > j || Math.abs(cVar.shootDuration - cVar.duration) >= 1000) {
                    AbstractC52535a a3 = bVar.mo87578a();
                    if (a3 != null) {
                        a3.mo88307a(true);
                    }
                } else {
                    AbstractC52535a a4 = bVar.mo87578a();
                    if (a4 != null) {
                        a4.mo88307a(false);
                    }
                }
            }
            if (bVar.f119519d.mo110022c()) {
                a = C51874d.m96561a(j, j4);
            } else {
                a = C51874d.m96561a(j, j2);
            }
            if (a == EnumC69901bw.MUSIC && dVar.f95711e) {
                bVar.f119518c.mo87573a((Integer) 1);
            }
            bVar.f119517b.mo22875a(new C14190j(j4));
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: a */
    public final void mo87588a(float f, float f2) {
        this.f119541e.f119524d.mo7019b(C89387v.m154943a(Float.valueOf(f), Float.valueOf(f2)));
    }

    public C51877f(AbstractC22186b bVar, C21582f fVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(fVar, "");
        this.f119540d = bVar;
        this.f119550n = fVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.p3027b.AbstractC51869a
    /* renamed from: a */
    public final void mo87572a(C69905c cVar, String str) {
        if (cVar != null) {
            boolean a = mo87596h().f155817b.mo109888a();
            m96568l().mo56938f(true);
            mo87596h().f155817b.f155652h.mo110090a(str);
            mo87596h().mo110011a(str);
            m96568l().setMusicPath(str);
            m96568l().mo56918a((ASCameraView) str, (String) 0, 0L, 0L);
            m96568l().mo56929b(true);
            m96568l().mo56936e(false);
            m96567k().mo23118a(true);
            if (!a) {
                m96568l().mo56897a(mo87593e(), m96566j().mo22812d().mo115067a());
            }
            int i = cVar.duration;
            if (i > 0) {
                mo87596h().f155822g = i;
            }
            if (!mo87596h().mo110022c()) {
                mo87596h().mo110023d(0);
            }
            mo87596h().f155820e = cVar.getMid();
            mo87596h().f155824i = cVar.strongBeatUrl;
            C84090k.m144599a(m96567k(), new PrivacyCert(new C13349j("1052"), "Record audio when using sound effects on the shooting page.", new C13350k[]{C13401b.m24108b()}));
            this.f119538b.mo6999a(C89391z.f203057a);
        } else {
            this.f119539c.mo6999a(C89391z.f203057a);
        }
        if (!mo87596h().f155817b.f155663s) {
            mo87594f().mo22887a(mo87596h().f155817b.f155664t, false);
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
    }

    /* renamed from: a */
    public final void mo87590a(Boolean bool, Boolean bool2, Boolean bool3) {
        if (bool != null) {
            this.f119541e.f119521a.mo7019b(Boolean.valueOf(bool.booleanValue()));
        }
        if (bool2 != null) {
            this.f119541e.f119523c.mo7019b(Boolean.valueOf(bool2.booleanValue()));
        }
        if (bool3 != null) {
            this.f119541e.f119522b.mo7019b(Boolean.valueOf(bool3.booleanValue()));
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.p3027b.AbstractC51869a
    /* renamed from: a */
    public final void mo87574a(boolean z, C69905c cVar, String str) {
        if (z) {
            mo87589a((C69905c) null);
        } else if (!TextUtils.isEmpty(str)) {
            mo87589a(cVar);
            this.f119541e.f119525e.mo6999a((Void) null);
        }
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
