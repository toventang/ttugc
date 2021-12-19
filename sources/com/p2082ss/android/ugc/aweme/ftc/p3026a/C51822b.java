package com.p2082ss.android.ugc.aweme.ftc.p3026a;

import android.text.TextUtils;
import android.view.animation.Animation;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2559g;
import com.bytedance.als.C2563k;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.p940b.p941a.C14191k;
import com.bytedance.creativex.recorder.p940b.p941a.C14192l;
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
import com.bytedance.scene.AbstractC22219j;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.scene.ktx.C22226a;
import com.bytedance.scene.ktx.C22227b;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.shortvideo.C69841as;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.p3835h.AbstractC71864a;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.p2082ss.android.ugc.aweme.tools.C78610l;
import com.p2082ss.android.ugc.gamora.p4272a.C82004a;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83405a;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.C83408c;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.C83410e;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.C83414f;
import com.p2082ss.android.ugc.tools.p4344f.C84425b;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.EnumC89331m;
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

/* renamed from: com.ss.android.ugc.aweme.ftc.a.b */
public final class C51822b extends AbstractC2562j<AbstractC51821a> implements AbstractC20382b, AbstractC21566a, AbstractC51821a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f119449a = {new C89232y(C51822b.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new C89232y(C51822b.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new C89232y(C51822b.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0)};

    /* renamed from: b */
    public final AbstractC51821a f119450b = this;

    /* renamed from: c */
    final C83410e f119451c;

    /* renamed from: d */
    public final C51833c f119452d;

    /* renamed from: e */
    public final AbstractC22186b f119453e;

    /* renamed from: f */
    public final List<AbstractC83405a> f119454f;

    /* renamed from: g */
    private final AbstractC71864a f119455g;

    /* renamed from: h */
    private final AbstractC89248d f119456h;

    /* renamed from: i */
    private final AbstractC89248d f119457i;

    /* renamed from: j */
    private final AbstractC89248d f119458j;

    /* renamed from: k */
    private C82004a f119459k;

    /* renamed from: l */
    private final C2563k<C83408c> f119460l;

    /* renamed from: m */
    private final C2563k<String> f119461m;

    /* renamed from: n */
    private final C2559g<C83408c> f119462n;

    /* renamed from: o */
    private final C2563k<Boolean> f119463o;

    /* renamed from: p */
    private boolean f119464p;

    /* renamed from: q */
    private final AbstractC89244h f119465q;

    /* renamed from: r */
    private final C21582f f119466r;

    static {
        Covode.recordClassIndex(61191);
    }

    /* renamed from: d */
    private final AbstractC14193m m96529d() {
        return (AbstractC14193m) this.f119457i.mo23374a(this, f119449a[1]);
    }

    /* renamed from: b */
    public final AbstractC14177d mo87559b() {
        return (AbstractC14177d) this.f119456h.mo23374a(this, f119449a[0]);
    }

    /* renamed from: c */
    public final ShortVideoContext mo87560c() {
        return (ShortVideoContext) this.f119458j.mo23374a(this, f119449a[2]);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.p3026a.AbstractC51821a
    /* renamed from: a */
    public final C2559g<C83408c> mo87556a() {
        return this.f119462n;
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC51821a getApiComponent() {
        return this.f119450b;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f119466r;
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

    /* renamed from: com.ss.android.ugc.aweme.ftc.a.b$j */
    static final class C51832j extends AbstractC89220m implements AbstractC89171a<C69841as> {

        /* renamed from: a */
        final /* synthetic */ C51822b f119477a;

        static {
            Covode.recordClassIndex(61201);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51832j(C51822b bVar) {
            super(0);
            this.f119477a = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C69841as invoke() {
            this.f119477a.mo87559b();
            return new C69841as(this.f119477a.mo87560c(), this.f119477a.getDiContainer());
        }
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        T t;
        T t2;
        super.onCreate();
        Object a = this.f119453e.mo36471B().mo36579a("record_env_context");
        if (a == null) {
            C89219l.m154715b();
        }
        C82004a aVar = (C82004a) a;
        this.f119459k = aVar;
        C83410e eVar = this.f119451c;
        if (aVar == null) {
            C89219l.m154710a("recordEnv");
        }
        eVar.mo128427a(aVar, this.f119454f, this.f119460l, this.f119461m);
        List<C83414f> list = this.f119451c.f186288a;
        for (T t3 : list) {
            if (t3.f186300c != null) {
                C22226a.m41822a(this.f119453e, R.id.dg9, t3.f186300c, t3.f186300c.mo108523a());
            }
        }
        this.f119453e.mo36387a(R.id.dg9, this.f119452d, "FTCRecordBottomTabScene");
        AbstractC22186b bVar = this.f119453e;
        for (T t4 : list) {
            t4.f186298a.observe(C22227b.m41826b(bVar), new C51824b(bVar, t4));
        }
        this.f119463o.mo6997a(bVar, new C51823a(bVar));
        Iterator<T> it = list.iterator();
        while (true) {
            t = null;
            if (!it.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it.next();
            if (t2.f186299b.f186285e) {
                break;
            }
        }
        T t5 = t2;
        if (t5 != null) {
            m96528a(bVar, t5, true);
        }
        AbstractC22186b bVar2 = this.f119453e;
        if (!this.f119464p) {
            this.f119464p = true;
            Iterator<T> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                T next = it2.next();
                if (next.f186299b.f186285e) {
                    t = next;
                    break;
                }
            }
            T t6 = t;
            if (t6 != null) {
                m96528a(bVar2, t6, false);
                this.f119451c.mo128435e();
            }
        }
        this.f119462n.mo6997a(this, new C51825c(this));
        m96529d().mo22908o().mo7038b(this, new C51826d(this));
        m96529d().mo22901h().mo6997a(this, new C51827e(this));
        m96529d().mo22904k().mo6997a(this, new C51828f(this));
        m96529d().mo22916w().mo6997a(this, new C51829g(this));
        mo87559b().mo22799ag().mo6997a(this, new C51830h(this));
        mo87559b().mo22798af().mo6997a(this, new C51831i(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.a.b$e */
    static final class C51827e<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C51822b f119472a;

        static {
            Covode.recordClassIndex(61196);
        }

        C51827e(C51822b bVar) {
            this.f119472a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f119472a.mo87558a(false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.a.b$g */
    static final class C51829g<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C51822b f119474a;

        static {
            Covode.recordClassIndex(61198);
        }

        C51829g(C51822b bVar) {
            this.f119474a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f119474a.mo87558a(false);
        }
    }

    /* renamed from: a */
    public final void mo87558a(boolean z) {
        this.f119463o.mo6999a(Boolean.valueOf(z));
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.a.b$a */
    static final class C51823a<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ AbstractC22186b f119467a;

        static {
            Covode.recordClassIndex(61192);
        }

        C51823a(AbstractC22186b bVar) {
            this.f119467a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                C22226a.m41823a(this.f119467a, "FTCRecordBottomTabScene");
            } else {
                C22226a.m41824b(this.f119467a, "FTCRecordBottomTabScene");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.a.b$b */
    static final class C51824b<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ AbstractC22186b f119468a;

        /* renamed from: b */
        final /* synthetic */ C83414f f119469b;

        static {
            Covode.recordClassIndex(61193);
        }

        C51824b(AbstractC22186b bVar, C83414f fVar) {
            this.f119468a = bVar;
            this.f119469b = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                bool.booleanValue();
                if (this.f119469b.f186300c != null) {
                    if (bool.booleanValue()) {
                        this.f119468a.mo36417e(this.f119469b.f186300c);
                        this.f119469b.f186300c.mo108524b();
                        return;
                    }
                    this.f119469b.f186300c.mo108525d();
                    this.f119468a.mo36413d(this.f119469b.f186300c);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.a.b$d */
    static final class C51826d<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C51822b f119471a;

        static {
            Covode.recordClassIndex(61195);
        }

        C51826d(C51822b bVar) {
            this.f119471a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C14201t tVar = (C14201t) obj;
            if (tVar == null) {
                return;
            }
            if (!tVar.f34476a.isEmpty() || tVar.f34477b != 0) {
                this.f119471a.mo87558a(false);
            } else if (!this.f119471a.mo87560c().f155817b.f155653i && tVar.f34479d) {
                this.f119471a.mo87558a(true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.a.b$f */
    static final class C51828f<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C51822b f119473a;

        static {
            Covode.recordClassIndex(61197);
        }

        C51828f(C51822b bVar) {
            this.f119473a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f119473a.mo87560c().f155817b.mo109896h() <= 0 && !this.f119473a.mo87560c().f155817b.f155653i) {
                this.f119473a.mo87558a(true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.a.b$h */
    static final class C51830h<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C51822b f119475a;

        static {
            Covode.recordClassIndex(61199);
        }

        C51830h(C51822b bVar) {
            this.f119475a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C51833c cVar = this.f119475a.f119452d;
            Animation animation = ((C14191k) obj).f34465a;
            C89219l.m154721d(animation, "");
            TabHost tabHost = cVar.f119479a;
            if (tabHost == null) {
                C89219l.m154710a("tabHost");
            }
            tabHost.clearAnimation();
            TabHost tabHost2 = cVar.f119479a;
            if (tabHost2 == null) {
                C89219l.m154710a("tabHost");
            }
            tabHost2.startAnimation(animation);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.a.b$i */
    static final class C51831i<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C51822b f119476a;

        static {
            Covode.recordClassIndex(61200);
        }

        C51831i(C51822b bVar) {
            this.f119476a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C14192l lVar = (C14192l) obj;
            boolean z = false;
            if (lVar.f34468b) {
                if (this.f119476a.mo87560c().f155817b.mo109896h() == 0) {
                    z = true;
                }
                if (lVar.f34467a || (z && !this.f119476a.mo87560c().f155817b.f155653i)) {
                    this.f119476a.mo87558a(true);
                    return;
                }
                return;
            }
            this.f119476a.mo87558a(false);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.ftc.p3026a.AbstractC51821a
    /* renamed from: a */
    public final void mo87557a(C78610l lVar) {
        C89219l.m154721d(lVar, "");
        ((C69841as) this.f119465q.getValue()).onEvent(lVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ftc.a.b$c */
    static final class C51825c<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C51822b f119470a;

        static {
            Covode.recordClassIndex(61194);
        }

        C51825c(C51822b bVar) {
            this.f119470a = bVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C83408c cVar = (C83408c) obj;
            C51822b bVar = this.f119470a;
            C89219l.m154716b(cVar, "");
            C89219l.m154721d(cVar, "");
            String str = "";
            for (C83414f fVar : bVar.f119451c.f186288a) {
                Object obj2 = cVar.f186277c;
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.CharSequence");
                if (TextUtils.equals((CharSequence) obj2, fVar.f186299b.f186283c)) {
                    str = fVar.f186299b.f186284d;
                }
            }
            if (!TextUtils.equals(str, "")) {
                C39162r.m79460a("change_record_mode", new C84425b().mo129406a("creation_id", bVar.mo87560c().f155830o).mo129406a("shoot_way", bVar.mo87560c().f155831p).mo129403a("draft_id", bVar.mo87560c().f155740A).mo129406a("enter_from", "video_shoot_page").mo129406a("to_status", str).f188764a);
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

    /* renamed from: a */
    private static void m96528a(AbstractC22186b bVar, C83414f fVar, boolean z) {
        AbstractC22219j a = bVar.mo36386a("FTCRecordBottomTabScene");
        if (a == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(a, "");
        C51833c cVar = (C51833c) a;
        int a2 = cVar.mo87561a(fVar.f186299b.f186283c);
        if (a2 >= 0) {
            cVar.mo87562a(a2, z);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: java.util.List<? extends com.ss.android.ugc.gamora.recorder.b.a> */
    /* JADX WARN: Multi-variable type inference failed */
    public C51822b(AbstractC22186b bVar, C21582f fVar, List<? extends AbstractC83405a> list) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(list, "");
        this.f119453e = bVar;
        this.f119466r = fVar;
        this.f119454f = list;
        Object a = getDiContainer().mo35249a(AbstractC71864a.class, (String) null);
        C89219l.m154716b(a, "");
        AbstractC71864a aVar = (AbstractC71864a) a;
        this.f119455g = aVar;
        this.f119456h = C21572a.m40504a(getDiContainer(), AbstractC14177d.class);
        this.f119457i = C21572a.m40504a(getDiContainer(), AbstractC14193m.class);
        this.f119458j = C21572a.m40504a(getDiContainer(), ShortVideoContext.class);
        C2563k<C83408c> kVar = new C2563k<>();
        this.f119460l = kVar;
        this.f119461m = new C2563k<>();
        this.f119462n = kVar;
        C83410e eVar = new C83410e();
        this.f119451c = eVar;
        this.f119463o = new C2563k<>();
        this.f119452d = new C51833c(mo87560c(), eVar, aVar.mo113513c());
        this.f119465q = C89250i.m154774a(EnumC89331m.NONE, new C51832j(this));
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
