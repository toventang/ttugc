package com.p2082ss.android.ugc.aweme.ftc.p3034f;

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
import com.bytedance.scene.navigation.C22239d;
import com.bytedance.scene.p1621c.C22154f;
import com.p2082ss.android.ugc.asve.recorder.view.ASCameraView;
import com.p2082ss.android.ugc.aweme.ftc.C51913c;
import com.p2082ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.scene.C67279a;
import com.p2082ss.android.ugc.aweme.shortvideo.C69792ad;
import com.p2082ss.android.ugc.aweme.shortvideo.C69905c;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.RetakeVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.p2082ss.android.ugc.aweme.shortvideo.p3833f.C71833a;
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

/* renamed from: com.ss.android.ugc.aweme.ftc.f.b */
public final class C52536b extends AbstractC2562j<AbstractC52535a> implements AbstractC20382b, AbstractC21566a, AbstractC52535a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f120955a = {new C89232y(C52536b.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new C89232y(C52536b.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new C89232y(C52536b.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0)};

    /* renamed from: e */
    public static final long f120956e = C63244g.m114602a().mo73284l().getMaxDurationResolver().getMaxShootingDuration();

    /* renamed from: f */
    public static final C52537a f120957f = new C52537a((byte) 0);

    /* renamed from: b */
    public final C52536b f120958b = this;

    /* renamed from: c */
    public final C2563k<Boolean> f120959c = new C2563k<>();

    /* renamed from: d */
    public final AbstractC22186b f120960d;

    /* renamed from: g */
    private final AbstractC89248d f120961g = C21572a.m40504a(getDiContainer(), AbstractC14177d.class);

    /* renamed from: h */
    private final AbstractC89248d f120962h = C21572a.m40504a(getDiContainer(), AbstractC14193m.class);

    /* renamed from: i */
    private final AbstractC89248d f120963i = C21572a.m40504a(getDiContainer(), ShortVideoContext.class);

    /* renamed from: j */
    private final C21582f f120964j;

    /* renamed from: b */
    public final AbstractC14177d mo88309b() {
        return (AbstractC14177d) this.f120961g.mo23374a(this, f120955a[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final AbstractC14193m mo88310c() {
        return (AbstractC14193m) this.f120962h.mo23374a(this, f120955a[1]);
    }

    /* renamed from: d */
    public final ShortVideoContext mo88311d() {
        return (ShortVideoContext) this.f120963i.mo23374a(this, f120955a[2]);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.f.b$a */
    public static final class C52537a {
        static {
            Covode.recordClassIndex(61933);
        }

        private C52537a() {
        }

        public /* synthetic */ C52537a(byte b) {
            this();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.p3034f.AbstractC52535a
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C2559g mo88306a() {
        return this.f120959c;
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC52535a getApiComponent() {
        return this.f120958b;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f120964j;
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
    /* renamed from: com.ss.android.ugc.aweme.ftc.f.b$g */
    public static final class C52543g extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52536b f120970a;

        static {
            Covode.recordClassIndex(61939);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52543g(C52536b bVar) {
            super(0);
            this.f120970a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f120970a.mo88309b().mo22779a(new C14171ac(true, false, 6));
            return C89391z.f203057a;
        }
    }

    static {
        Covode.recordClassIndex(61932);
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        if (mo88311d().f155817b.mo109889b() || mo88311d().f155817b.mo109890c()) {
            mo88307a(false);
        }
        mo88309b().mo22827o().mo6997a(C22228c.m41832b(this.f120960d), new C52538b(this));
        mo88310c().mo22908o().mo7038b(this, new C52539c(this));
        mo88310c().mo22916w().mo6997a(this, new C52540d(this));
        mo88310c().mo22912s().mo6997a(this, new C52541e(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.f.b$b */
    static final class C52538b<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52536b f120965a;

        static {
            Covode.recordClassIndex(61934);
        }

        C52538b(C52536b bVar) {
            this.f120965a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f120965a.mo88308b(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.f.b$d */
    static final class C52540d<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52536b f120967a;

        static {
            Covode.recordClassIndex(61936);
        }

        C52540d(C52536b bVar) {
            this.f120967a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f120967a.mo88307a(false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.p3034f.AbstractC52535a
    /* renamed from: a */
    public final void mo88307a(boolean z) {
        this.f120959c.mo6999a(Boolean.valueOf(z));
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.f.b$c */
    static final class C52539c<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52536b f120966a;

        static {
            Covode.recordClassIndex(61935);
        }

        C52539c(C52536b bVar) {
            this.f120966a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            long j;
            boolean z;
            C14201t tVar = (C14201t) obj;
            if (tVar != null) {
                C69905c cVar = C70005cr.m123611a().f156482a;
                if (this.f120966a.mo88311d().f155817b.f155664t) {
                    j = C52536b.f120956e;
                } else {
                    j = 15000;
                }
                if (tVar.f34477b != 0 || !tVar.f34476a.isEmpty() || this.f120966a.mo88311d().f155817b.f155653i || cVar == null || (((long) cVar.shootDuration) <= j && Math.abs(cVar.shootDuration - cVar.duration) < 1000)) {
                    z = false;
                } else {
                    z = true;
                }
                this.f120966a.mo88307a(z);
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.p3034f.AbstractC52535a
    /* renamed from: b */
    public final void mo88308b(boolean z) {
        if (C22227b.m41825a(this.f120960d) != null) {
            C22239d b = C22227b.m41826b(this.f120960d);
            if (!z || C67279a.m119197a(b, C52544c.class)) {
                C22239d a = C22227b.m41825a(this.f120960d);
                if (a == null) {
                    C89219l.m154715b();
                }
                if (C67279a.m119197a(a, C52544c.class)) {
                    b.mo36524E();
                    return;
                }
                return;
            }
            b.mo36537b(new C52544c(new C52542f(this)), (C22154f) null);
            C67279a.m119195a(b, C52544c.class, new C52543g(this));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.f.b$e */
    static final class C52541e<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C52536b f120968a;

        static {
            Covode.recordClassIndex(61937);
        }

        C52541e(C52536b bVar) {
            this.f120968a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            long j;
            VERecordData vERecordData;
            List<VERecordData.VERecordSegmentData> list;
            RetakeVideoContext n = this.f120968a.mo88311d().mo110038n();
            if ((n == null || (vERecordData = n.f155734d) == null || (list = vERecordData.f190794b) == null || list.size() <= 1) && this.f120968a.mo88311d().f155817b.mo109891d().isEmpty()) {
                if (!this.f120968a.mo88311d().f155817b.mo109889b()) {
                    C52536b bVar = this.f120968a;
                    bVar.mo88307a(!bVar.mo88311d().f155817b.f155653i);
                }
                C52536b bVar2 = this.f120968a;
                if (C70005cr.m123611a().f156482a != null) {
                    C69905c cVar = C70005cr.m123611a().f156482a;
                    if (bVar2.mo88311d().f155817b.f155664t) {
                        j = C69792ad.f155971b;
                    } else {
                        j = 15000;
                    }
                    if (cVar == null || (((long) cVar.shootDuration) <= j && Math.abs(cVar.shootDuration - cVar.duration) < 1000)) {
                        bVar2.mo88307a(false);
                    } else {
                        bVar2.mo88307a(true);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.ftc.f.b$f */
    public static final class C52542f extends AbstractC89220m implements AbstractC89172b<Integer, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C52536b f120969a;

        static {
            Covode.recordClassIndex(61938);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C52542f(C52536b bVar) {
            super(1);
            this.f120969a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Integer num) {
            int intValue = num.intValue();
            C52536b bVar = this.f120969a;
            bVar.mo88308b(false);
            AbstractC1174ac a = C1181ae.m3881a(C22228c.m41832b(bVar.f120960d), (C1175ad.AbstractC1177b) null).mo3983a(ShortVideoContextViewModel.class);
            C89219l.m154716b(a, "");
            ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) a).f155842a;
            Activity activity = bVar.f120960d.f52549m;
            Objects.requireNonNull(activity, "null cannot be cast to non-null type com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity");
            C51913c cVar = ((FTCVideoRecordNewActivity) activity).f119428t;
            C89219l.m154716b(shortVideoContext, "");
            bVar.mo88309b().mo22747A().mo56918a((ASCameraView) shortVideoContext.f155817b.f155669y, (String) ((long) intValue), shortVideoContext.f155817b.mo109896h(), 0L);
            if (intValue != shortVideoContext.f155817b.f155661q) {
                bVar.mo88310c().mo22887a(shortVideoContext.f155817b.f155664t, true);
            }
            shortVideoContext.mo110023d(intValue);
            C71833a.m126848a(shortVideoContext.f155817b.f155669y, C70005cr.m123611a().f156482a, intValue);
            if (cVar != null) {
                bVar.mo88310c().mo22875a(new C14190j(shortVideoContext.f155817b.f155646b));
                bVar.mo88309b().mo22779a(new C14171ac(true, false, 6));
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    public C52536b(AbstractC22186b bVar, C21582f fVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(fVar, "");
        this.f120960d = bVar;
        this.f120964j = fVar;
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
