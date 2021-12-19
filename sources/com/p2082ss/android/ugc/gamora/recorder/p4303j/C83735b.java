package com.p2082ss.android.ugc.gamora.recorder.p4303j;

import android.app.Activity;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2559g;
import com.bytedance.als.C2563k;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14209z;
import com.bytedance.creativex.recorder.p940b.p941a.C14171ac;
import com.bytedance.creativex.recorder.p940b.p941a.C14190j;
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
import com.bytedance.scene.ktx.C22227b;
import com.bytedance.scene.ktx.C22228c;
import com.bytedance.scene.navigation.AbstractC22259h;
import com.bytedance.scene.navigation.C22239d;
import com.bytedance.scene.p1621c.C22154f;
import com.p2082ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.scene.C67279a;
import com.p2082ss.android.ugc.aweme.setting.p3721i.C68109p;
import com.p2082ss.android.ugc.aweme.shortvideo.C69792ad;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C69926ch;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3833f.C71833a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3876ui.VideoRecordNewActivity;
import com.p2082ss.android.ugc.aweme.shortvideo.sticker.C72847c;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.p4296a.AbstractC83492a;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.vesdk.VERecordData;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89391z;
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

/* renamed from: com.ss.android.ugc.gamora.recorder.j.b */
public final class C83735b extends AbstractC2562j<AbstractC83734a> implements AbstractC20382b, AbstractC21566a, AbstractC83734a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f186889a = {new C89232y(C83735b.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new C89232y(C83735b.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new C89232y(C83735b.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0), new C89232y(C83735b.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0), new C89232y(C83735b.class, "tiktokCameraApi", "getTiktokCameraApi()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0)};

    /* renamed from: g */
    public static final long f186890g = C63244g.m114602a().mo73284l().getMaxDurationResolver().getMaxShootingDuration();

    /* renamed from: h */
    public static final C83736a f186891h = new C83736a((byte) 0);

    /* renamed from: b */
    public final C83735b f186892b = this;

    /* renamed from: c */
    public final C2563k<Boolean> f186893c = new C2563k<>();

    /* renamed from: d */
    final AbstractC83492a f186894d = ((AbstractC83492a) getDiContainer().mo35252b(AbstractC83492a.class, null));

    /* renamed from: e */
    public boolean f186895e;

    /* renamed from: f */
    public final AbstractC22186b f186896f;

    /* renamed from: i */
    private final AbstractC89248d f186897i = C21572a.m40504a(getDiContainer(), AbstractC14177d.class);

    /* renamed from: j */
    private final AbstractC89248d f186898j = C21572a.m40504a(getDiContainer(), AbstractC14193m.class);

    /* renamed from: k */
    private final AbstractC89248d f186899k = C21572a.m40504a(getDiContainer(), ShortVideoContext.class);

    /* renamed from: l */
    private final AbstractC89248d f186900l = C21572a.m40504a(getDiContainer(), AbstractC84089j.class);

    /* renamed from: m */
    private final AbstractC89248d f186901m = C21572a.m40504a(getDiContainer(), AbstractC14209z.class);

    /* renamed from: n */
    private final C83744c f186902n = new C83744c(new C83742g(this));

    /* renamed from: o */
    private final AbstractC22259h f186903o = new C83737b(this);

    /* renamed from: p */
    private final C21582f f186904p;

    /* renamed from: b */
    public final AbstractC14177d mo128703b() {
        return (AbstractC14177d) this.f186897i.mo23374a(this, f186889a[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final AbstractC14193m mo128704c() {
        return (AbstractC14193m) this.f186898j.mo23374a(this, f186889a[1]);
    }

    /* renamed from: d */
    public final ShortVideoContext mo128706d() {
        return (ShortVideoContext) this.f186899k.mo23374a(this, f186889a[2]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final AbstractC84089j mo128707e() {
        return (AbstractC84089j) this.f186900l.mo23374a(this, f186889a[3]);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.j.b$a */
    public static final class C83736a {
        static {
            Covode.recordClassIndex(97626);
        }

        private C83736a() {
        }

        public /* synthetic */ C83736a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4303j.AbstractC83734a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2559g mo128699a() {
        return this.f186893c;
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC83734a getApiComponent() {
        return this.f186892b;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f186904p;
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

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo128709g() {
        C22227b.m41826b(this.f186896f).mo36532a(this.f186903o);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.gamora.recorder.j.b$h */
    public static final class C83743h extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83735b f186911a;

        static {
            Covode.recordClassIndex(97633);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83743h(C83735b bVar) {
            super(0);
            this.f186911a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            Objects.requireNonNull(this.f186911a.f186896f.f52549m, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity");
            this.f186911a.mo128703b().mo22779a(new C14171ac(true, false, 6));
            return C89391z.f203057a;
        }
    }

    /* renamed from: f */
    public final boolean mo128708f() {
        C22239d a = C22227b.m41825a(this.f186896f);
        if (a == null) {
            C89219l.m154715b();
        }
        return C67279a.m119197a(a, C83744c.class);
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.j.b$b */
    static final class C83737b implements AbstractC22259h {

        /* renamed from: a */
        final /* synthetic */ C83735b f186905a;

        static {
            Covode.recordClassIndex(97627);
        }

        C83737b(C83735b bVar) {
            this.f186905a = bVar;
        }

        @Override // com.bytedance.scene.navigation.AbstractC22259h
        /* renamed from: a */
        public final boolean mo36540a() {
            C83735b bVar = this.f186905a;
            bVar.mo128705c(true);
            AbstractC83492a aVar = bVar.f186894d;
            if (aVar != null) {
                aVar.mo128511a(0, false);
            }
            AbstractC83492a aVar2 = bVar.f186894d;
            if (aVar2 != null) {
                aVar2.mo128513a(bVar.mo128706d().f155817b.mo109893e(), (long) bVar.mo128706d().f155817b.f155661q, Long.valueOf(bVar.mo128706d().f155817b.mo109899k()), bVar.mo128707e().mo23167t().mo119294f(), AbstractC83492a.C83493a.C83494a.f186459a);
            }
            bVar.mo128709g();
            return false;
        }
    }

    static {
        Covode.recordClassIndex(97625);
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        if (mo128706d().f155817b.mo109889b() || mo128706d().f155817b.mo109890c()) {
            mo128701a(false);
        }
        mo128703b().mo22827o().mo6997a(C22228c.m41832b(this.f186896f), new C83738c(this));
        mo128704c().mo22908o().mo7038b(this, new C83739d(this));
        mo128704c().mo22916w().mo6997a(this, new C83740e(this));
        mo128704c().mo22912s().mo6997a(this, new C83741f(this));
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.j.b$c */
    static final class C83738c<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83735b f186906a;

        static {
            Covode.recordClassIndex(97628);
        }

        C83738c(C83735b bVar) {
            this.f186906a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f186906a.mo128702b(false);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.j.b$e */
    static final class C83740e<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83735b f186908a;

        static {
            Covode.recordClassIndex(97630);
        }

        C83740e(C83735b bVar) {
            this.f186908a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f186908a.mo128701a(false);
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4303j.AbstractC83734a
    /* renamed from: a */
    public final void mo128701a(boolean z) {
        this.f186893c.mo6999a(Boolean.valueOf(z));
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: c */
    public final void mo128705c(boolean z) {
        if (!C72847c.m128642h(mo128707e().mo23167t().mo119294f())) {
            return;
        }
        if (z) {
            mo128703b().mo22747A().mo56940g();
        } else {
            mo128703b().mo22747A().mo56983h();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.j.b$d */
    static final class C83739d<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83735b f186907a;

        static {
            Covode.recordClassIndex(97629);
        }

        C83739d(C83735b bVar) {
            this.f186907a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            long j;
            boolean z;
            C14201t tVar = (C14201t) obj;
            if (tVar != null) {
                C69905c cVar = C70005cr.m123611a().f156482a;
                if (this.f186907a.mo128706d().f155817b.f155664t) {
                    j = C83735b.f186890g;
                } else {
                    j = 15000;
                }
                if (tVar.f34477b != 0 || !tVar.f34476a.isEmpty() || this.f186907a.mo128706d().f155817b.f155653i || cVar == null || (((long) cVar.shootDuration) <= j && Math.abs(cVar.shootDuration - cVar.duration) < 1000)) {
                    z = false;
                } else {
                    z = true;
                }
                this.f186907a.mo128706d();
                if (C68109p.m120400a() != 2) {
                    this.f186907a.mo128701a(z);
                } else if (z != this.f186907a.f186895e) {
                    this.f186907a.mo128701a(z);
                    this.f186907a.f186895e = z;
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.j.b$f */
    static final class C83741f<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83735b f186909a;

        static {
            Covode.recordClassIndex(97631);
        }

        C83741f(C83735b bVar) {
            this.f186909a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            long j;
            VERecordData vERecordData;
            List<VERecordData.VERecordSegmentData> list;
            RetakeVideoContext n = this.f186909a.mo128706d().mo110038n();
            if ((n == null || (vERecordData = n.f155734d) == null || (list = vERecordData.f190794b) == null || list.size() <= 1) && this.f186909a.mo128706d().f155817b.mo109891d().isEmpty()) {
                if (!this.f186909a.mo128706d().f155817b.mo109889b()) {
                    C83735b bVar = this.f186909a;
                    bVar.mo128701a(true ^ bVar.mo128706d().f155817b.f155653i);
                }
                C83735b bVar2 = this.f186909a;
                if (C70005cr.m123611a().f156482a != null) {
                    C69905c cVar = C70005cr.m123611a().f156482a;
                    if (cVar != null) {
                        C89219l.m154716b(cVar, "");
                        if (bVar2.mo128706d().f155817b.f155664t) {
                            j = C69792ad.f155971b;
                        } else {
                            j = 15000;
                        }
                        bVar2.mo128700a(j, cVar);
                        return;
                    }
                    return;
                }
                bVar2.mo128701a(false);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4303j.AbstractC83734a
    /* renamed from: b */
    public final void mo128702b(boolean z) {
        if (C22227b.m41825a(this.f186896f) != null) {
            C22239d b = C22227b.m41826b(this.f186896f);
            if (z && !C67279a.m119197a(b, C83744c.class)) {
                AbstractC83492a aVar = this.f186894d;
                if (aVar != null) {
                    aVar.mo128511a(0, true);
                }
                AbstractC83492a aVar2 = this.f186894d;
                if (aVar2 != null) {
                    aVar2.mo128516c(null);
                }
                mo128705c(false);
                b.mo36537b(this.f186902n, (C22154f) null);
                C67279a.m119195a(b, C83744c.class, new C83743h(this));
                b.mo36528a(C22228c.m41832b(this.f186896f), this.f186903o);
            } else if (mo128708f()) {
                b.mo36536b(this.f186902n);
                mo128709g();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.j.b$g */
    static final class C83742g extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C83735b f186910a;

        static {
            Covode.recordClassIndex(97632);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83742g(C83735b bVar) {
            super(1);
            this.f186910a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            int intValue = num.intValue();
            C83735b bVar = this.f186910a;
            bVar.mo128702b(false);
            AbstractC1174ac a = C1181ae.m3881a(C22228c.m41832b(bVar.f186896f), (C1175ad.AbstractC1177b) null).mo3983a(ShortVideoContextViewModel.class);
            C89219l.m154716b(a, "");
            ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f155842a;
            Activity activity = bVar.f186896f.f52549m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity");
            C69926ch chVar = ((VideoRecordNewActivity) activity).f164826u;
            ASCameraView A = bVar.mo128703b().mo22747A();
            String str = shortVideoContext.f155817b.f155669y;
            long j = (long) intValue;
            C89219l.m154716b(shortVideoContext, "");
            A.mo56918a((ASCameraView) str, (String) j, shortVideoContext.f155817b.mo109896h(), 0L);
            if (intValue != shortVideoContext.f155817b.f155661q) {
                bVar.mo128704c().mo22887a(shortVideoContext.f155817b.f155664t, true);
            }
            shortVideoContext.mo110023d(intValue);
            C71833a.m126848a(shortVideoContext.f155817b.f155669y, C70005cr.m123611a().f156482a, intValue);
            AbstractC83492a aVar = bVar.f186894d;
            if (aVar != null) {
                aVar.mo128511a(0, false);
            }
            AbstractC83492a aVar2 = bVar.f186894d;
            if (aVar2 != null) {
                aVar2.mo128513a(shortVideoContext.f155817b.mo109893e(), j, Long.valueOf(shortVideoContext.f155817b.mo109899k()), bVar.mo128707e().mo23167t().mo119294f(), AbstractC83492a.C83493a.C83494a.f186459a);
            }
            if (chVar != null) {
                bVar.mo128704c().mo22875a(new C14190j(shortVideoContext.f155817b.f155646b));
                bVar.mo128703b().mo22779a(new C14171ac(true, false, 6));
            }
            this.f186910a.mo128705c(true);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4303j.AbstractC83734a
    /* renamed from: a */
    public final void mo128700a(long j, C69905c cVar) {
        C89219l.m154721d(cVar, "");
        if (cVar.musicType == 1) {
            if (((long) cVar.shootDuration) > j || Math.abs(cVar.shootDuration - cVar.duration) >= 1000) {
                mo128701a(true);
            } else {
                mo128701a(false);
            }
        } else if (cVar.musicType != 0) {
        } else {
            if (cVar.getLocalMusicDuration() > j) {
                mo128701a(true);
            } else {
                mo128701a(false);
            }
        }
    }

    public C83735b(AbstractC22186b bVar, C21582f fVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(fVar, "");
        this.f186896f = bVar;
        this.f186904p = fVar;
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
