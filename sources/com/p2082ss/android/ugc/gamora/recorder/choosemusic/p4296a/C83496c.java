package com.p2082ss.android.ugc.gamora.recorder.choosemusic.p4296a;

import android.text.TextUtils;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.als.AbstractC2562j;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2559g;
import com.bytedance.als.C2563k;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14209z;
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
import com.p2082ss.android.medialib.listener.AbstractC30012b;
import com.p2082ss.android.ttve.model.VETrackParams;
import com.p2082ss.android.ugc.asve.p2217f.C31098f;
import com.p2082ss.android.ugc.asve.recorder.AbstractC31213i;
import com.p2082ss.android.ugc.aweme.property.C65473f;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.gamora.recorder.choosemusic.p4296a.AbstractC83492a;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.vesdk.C85310ah;
import com.p2082ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89378p;
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

/* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.a.c */
public final class C83496c extends AbstractC2562j<AbstractC83492a> implements AbstractC20382b, AbstractC21566a, AbstractC83492a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f186461a = {new C89232y(C83496c.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/TikTokCameraApiComponent;", 0), new C89232y(C83496c.class, "recordControlCoreComponent", "getRecordControlCoreComponent()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new C89232y(C83496c.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0)};

    /* renamed from: b */
    public final C83496c f186462b = this;

    /* renamed from: c */
    public final ShortVideoContext f186463c = ((ShortVideoContext) getDiContainer().mo35249a(ShortVideoContext.class, (String) null));

    /* renamed from: d */
    public final C2563k<Boolean> f186464d;

    /* renamed from: e */
    public boolean f186465e;

    /* renamed from: f */
    public final C83502d f186466f;

    /* renamed from: g */
    private final AbstractC89248d f186467g = C21572a.m40504a(getDiContainer(), AbstractC14209z.class);

    /* renamed from: h */
    private final AbstractC89248d f186468h = C21572a.m40504a(getDiContainer(), AbstractC14193m.class);

    /* renamed from: i */
    private final AbstractC89248d f186469i = C21572a.m40504a(getDiContainer(), AbstractC84089j.class);

    /* renamed from: j */
    private final C2563k<Boolean> f186470j;

    /* renamed from: k */
    private final C2559g<Boolean> f186471k;

    /* renamed from: l */
    private final C2559g<Boolean> f186472l;

    /* renamed from: m */
    private final int f186473m;

    /* renamed from: n */
    private final boolean f186474n;

    /* renamed from: o */
    private final Map<Integer, Boolean> f186475o;

    /* renamed from: p */
    private int f186476p;

    /* renamed from: q */
    private final C83500c f186477q;

    /* renamed from: r */
    private final C21582f f186478r;

    static {
        Covode.recordClassIndex(97382);
    }

    /* renamed from: d */
    public final AbstractC14209z mo128519d() {
        return (AbstractC14209z) this.f186467g.mo23374a(this, f186461a[0]);
    }

    /* renamed from: e */
    public final AbstractC84089j mo128520e() {
        return (AbstractC84089j) this.f186469i.mo23374a(this, f186461a[2]);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.choosemusic.p4296a.AbstractC83492a
    /* renamed from: a */
    public final C2559g<Boolean> mo128510a() {
        return this.f186471k;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.choosemusic.p4296a.AbstractC83492a
    /* renamed from: b */
    public final C2559g<Boolean> mo128514b() {
        return this.f186472l;
    }

    /* Return type fixed from 'com.bytedance.als.b' to match base method */
    @Override // com.bytedance.als.AbstractC2562j
    public final /* bridge */ /* synthetic */ AbstractC83492a getApiComponent() {
        return this.f186462b;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f186478r;
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

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.a.c$c */
    public static final class C83500c implements AbstractC30012b {

        /* renamed from: a */
        final /* synthetic */ C83496c f186482a;

        static {
            Covode.recordClassIndex(97386);
        }

        @Override // com.p2082ss.android.medialib.listener.AbstractC30012b
        /* renamed from: a */
        public final void mo52866a(int i, int i2) {
        }

        /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.a.c$c$a */
        static final class C83501a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C83500c f186483a;

            static {
                Covode.recordClassIndex(97387);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C83501a(C83500c cVar) {
                super(0);
                this.f186483a = cVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                this.f186483a.f186482a.mo128519d().mo22747A().mo56912a(this.f186483a.f186482a.f186466f);
                return C89391z.f203057a;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C83500c(C83496c cVar) {
            this.f186482a = cVar;
        }

        @Override // com.p2082ss.android.medialib.listener.AbstractC30012b
        /* renamed from: a */
        public final void mo52865a(int i) {
            C31098f.m64301a(new C83501a(this));
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.a.c$d */
    public static final class C83502d implements AbstractC31213i {

        /* renamed from: a */
        final /* synthetic */ C83496c f186484a;

        static {
            Covode.recordClassIndex(97388);
        }

        /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.a.c$d$a */
        static final class C83503a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C83502d f186485a;

            static {
                Covode.recordClassIndex(97389);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C83503a(C83502d dVar) {
                super(0);
                this.f186485a = dVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                this.f186485a.f186484a.mo128516c(this.f186485a.f186484a.mo128520e().mo23167t().mo119294f());
                this.f186485a.f186484a.f186465e = true;
                return C89391z.f203057a;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C83502d(C83496c cVar) {
            this.f186484a = cVar;
        }

        @Override // com.p2082ss.android.vesdk.AbstractC85541q
        public final void onCallback(int i, int i2, float f, String str) {
            if (i == C85310ah.f190922J) {
                C31098f.m64301a(new C83503a(this));
            }
        }
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onDestroy() {
        super.onDestroy();
        if (C65473f.m117200b()) {
            mo128519d().mo22747A().mo56925b(this.f186477q);
            mo128519d().mo22747A().mo56927b(this.f186466f);
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.choosemusic.p4296a.AbstractC83492a
    /* renamed from: c */
    public final boolean mo128517c() {
        Iterator<Boolean> it = this.f186475o.values().iterator();
        while (true) {
            boolean z = true;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                boolean booleanValue = it.next().booleanValue();
                if (!z || booleanValue) {
                    z = false;
                }
            }
        }
    }

    @Override // com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        this.f186476p = -1;
        if (C65473f.m117200b()) {
            mo128519d().mo22747A().mo56909a(this.f186477q);
            ((AbstractC14193m) this.f186468h.mo23374a(this, f186461a[1])).mo22900g().mo6997a(this, new C83497a(this));
            mo128520e().mo23129k().mo6997a(this, new C83498b(this));
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.a.c$a */
    static final class C83497a<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83496c f186479a;

        static {
            Covode.recordClassIndex(97383);
        }

        C83497a(C83496c cVar) {
            this.f186479a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            this.f186479a.mo128512a(null);
        }
    }

    /* renamed from: e */
    private final boolean m143878e(Effect effect) {
        return C83495b.m143876a(this.f186463c, effect);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.choosemusic.p4296a.AbstractC83492a
    /* renamed from: a */
    public final void mo128512a(Effect effect) {
        int i;
        if (m143878e(effect) && (i = this.f186476p) >= 0) {
            this.f186476p = -1;
            mo128519d().mo22943c(i, this.f186473m);
            mo128519d().mo22934a(this.f186473m, i);
            this.f186470j.mo6999a((Boolean) false);
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.choosemusic.p4296a.AbstractC83492a
    /* renamed from: c */
    public final void mo128516c(Effect effect) {
        if (m143878e(effect) && this.f186476p >= 0) {
            mo128519d().mo22943c(this.f186476p, this.f186473m);
            this.f186470j.mo6999a((Boolean) false);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.choosemusic.a.c$b */
    static final class C83498b<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83496c f186480a;

        static {
            Covode.recordClassIndex(97384);
        }

        C83498b(C83496c cVar) {
            this.f186480a = cVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            if (!this.f186480a.mo128519d().mo22747A().mo56984i()) {
                C89219l.m154716b(bool, "");
                if (bool.booleanValue()) {
                    C83496c cVar = this.f186480a;
                    cVar.mo128513a(cVar.f186463c.f155817b.mo109893e(), (long) this.f186480a.f186463c.f155817b.f155661q, Long.valueOf(this.f186480a.f186463c.f155817b.mo109899k()), null, new AbstractC89171a<C89391z>(this) {
                        /* class com.p2082ss.android.ugc.gamora.recorder.choosemusic.p4296a.C83496c.C83498b.C834991 */

                        /* renamed from: a */
                        final /* synthetic */ C83498b f186481a;

                        static {
                            Covode.recordClassIndex(97385);
                        }

                        {
                            this.f186481a = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // p4600h.p4611f.p4612a.AbstractC89171a
                        public final /* synthetic */ C89391z invoke() {
                            this.f186481a.f186480a.f186464d.mo6999a((Boolean) true);
                            return C89391z.f203057a;
                        }
                    });
                    return;
                }
                this.f186480a.mo128512a(null);
                this.f186480a.f186464d.mo6999a((Boolean) false);
            }
        }
    }

    public C83496c(C21582f fVar) {
        boolean z;
        C89219l.m154721d(fVar, "");
        this.f186478r = fVar;
        C2563k<Boolean> kVar = new C2563k<>();
        this.f186470j = kVar;
        this.f186471k = kVar;
        C2563k<Boolean> kVar2 = new C2563k<>();
        this.f186464d = kVar2;
        this.f186472l = kVar2;
        this.f186473m = 1;
        if (C65473f.m117199a() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f186474n = z;
        this.f186475o = new LinkedHashMap();
        this.f186476p = -1;
        this.f186465e = true;
        this.f186466f = new C83502d(this);
        this.f186477q = new C83500c(this);
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.choosemusic.p4296a.AbstractC83492a
    /* renamed from: b */
    public final void mo128515b(Effect effect) {
        if (m143878e(effect)) {
            if (this.f186476p >= 0) {
                mo128519d().mo22942b(this.f186476p, this.f186473m);
                mo128519d().mo22935a(this.f186476p, this.f186473m, this.f186474n);
                this.f186465e = false;
                this.f186470j.mo6999a((Boolean) true);
                return;
            }
            mo128513a(this.f186463c.f155817b.mo109893e(), (long) this.f186463c.f155817b.f155661q, Long.valueOf(this.f186463c.f155817b.mo109899k()), mo128520e().mo23167t().mo119294f(), AbstractC83492a.C83493a.C83494a.f186459a);
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.choosemusic.p4296a.AbstractC83492a
    /* renamed from: d */
    public final void mo128518d(Effect effect) {
        if (m143878e(effect)) {
            if (this.f186476p >= 0) {
                if (!this.f186474n && this.f186465e) {
                    mo128519d().mo22942b(this.f186476p, this.f186473m);
                    this.f186465e = false;
                }
                mo128519d().mo22935a(this.f186476p, this.f186473m, this.f186474n);
                this.f186470j.mo6999a((Boolean) true);
                return;
            }
            mo128513a(this.f186463c.f155817b.mo109893e(), (long) this.f186463c.f155817b.f155661q, Long.valueOf(this.f186463c.f155817b.mo109899k()), mo128520e().mo23167t().mo119294f(), AbstractC83492a.C83493a.C83494a.f186459a);
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.choosemusic.p4296a.AbstractC83492a
    /* renamed from: a */
    public final void mo128511a(int i, boolean z) {
        this.f186475o.put(Integer.valueOf(i), Boolean.valueOf(z));
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

    @Override // com.p2082ss.android.ugc.gamora.recorder.choosemusic.p4296a.AbstractC83492a
    /* renamed from: a */
    public final void mo128513a(String str, long j, Long l, Effect effect, AbstractC89171a<C89391z> aVar) {
        Integer num;
        C89378p pVar;
        VEUtils.C85279f audioFileInfo;
        C89219l.m154721d(aVar, "");
        if (TextUtils.isEmpty(str) || !m143878e(effect)) {
            mo128516c(effect);
            return;
        }
        if (this.f186476p >= 0) {
            mo128512a(effect);
        }
        int i = (int) j;
        Integer num2 = null;
        if (l != null) {
            num = Integer.valueOf((int) l.longValue());
        } else {
            num = null;
        }
        if (!(str == null || (audioFileInfo = VEUtils.getAudioFileInfo(str)) == null)) {
            num2 = Integer.valueOf(audioFileInfo.f190834d);
        }
        if (num == null) {
            if (num2 == null) {
                pVar = new C89378p(-1, -1);
            } else {
                pVar = new C89378p(Integer.valueOf(i), Integer.valueOf(num2.intValue() - i));
            }
        } else if (num2 == null) {
            pVar = new C89378p(Integer.valueOf(i), num);
        } else if (num.intValue() + i <= num2.intValue()) {
            pVar = new C89378p(Integer.valueOf(i), num);
        } else {
            pVar = new C89378p(0, Integer.valueOf(Math.min(num.intValue(), num2.intValue())));
        }
        int intValue = ((Number) pVar.component1()).intValue();
        int intValue2 = ((Number) pVar.component2()).intValue();
        if (intValue2 > 0 && intValue >= 0) {
            VETrackParams.C30671a aVar2 = new VETrackParams.C30671a();
            if (aVar2.f73355a.f73346a == null) {
                aVar2.f73355a.f73346a = new ArrayList();
            }
            aVar2.f73355a.f73346a.add(str);
            if (aVar2.f73355a.f73351f == null) {
                aVar2.f73355a.f73351f = new ArrayList();
            }
            aVar2.f73355a.f73351f.add(Double.valueOf(1.0d));
            if (aVar2.f73355a.f73347b == null) {
                aVar2.f73355a.f73347b = new ArrayList();
            }
            aVar2.f73355a.f73347b.add(Integer.valueOf(intValue));
            int i2 = intValue + intValue2;
            if (aVar2.f73355a.f73348c == null) {
                aVar2.f73355a.f73348c = new ArrayList();
            }
            aVar2.f73355a.f73348c.add(Integer.valueOf(i2));
            aVar2.f73355a.f73353h = VETrackParams.EnumC30672b.External;
            VETrackParams vETrackParams = aVar2.f73355a;
            AbstractC14209z d = mo128519d();
            int i3 = this.f186473m;
            C89219l.m154716b(vETrackParams, "");
            int a = d.mo22933a(i3, vETrackParams);
            if (a >= 0) {
                this.f186476p = a;
                mo128519d().mo22935a(a, this.f186473m, this.f186474n);
                this.f186465e = false;
                this.f186470j.mo6999a((Boolean) true);
                aVar.invoke();
            }
        }
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
