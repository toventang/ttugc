package com.p2082ss.android.ugc.aweme.shortvideo.duet;

import android.app.Activity;
import android.content.DialogInterface;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.C1213t;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.gesture.api.AbstractC14315b;
import com.bytedance.creativex.recorder.gesture.api.AbstractC14318d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14189i;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14193m;
import com.bytedance.creativex.recorder.p940b.p941a.C14197p;
import com.bytedance.creativex.recorder.sticker.p948b.C14335a;
import com.bytedance.ies.dmt.p1194ui.dialog.C17197a;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20382b;
import com.bytedance.jedi.arch.C20365ac;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20391d;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.keva.Keva;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.group.AbstractC22186b;
import com.bytedance.scene.ktx.C22226a;
import com.bytedance.scene.ktx.C22227b;
import com.bytedance.scene.navigation.C22239d;
import com.bytedance.ui_component.AbstractC23520b;
import com.p2082ss.android.ugc.aweme.p2724cz.C40903b;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.tools.C78600h;
import com.p2082ss.android.ugc.aweme.tools.C78608j;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.tools.utils.C84909p;
import com.p2082ss.android.ugc.tools.view.widget.C85056k;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import java.util.Stack;
import p4560f.p4561a.p4562a.p4563a.C88391a;
import p4560f.p4561a.p4562a.p4564b.C88392a;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4560f.p4561a.p4565b.C88411a;
import p4560f.p4561a.p4567d.AbstractC88433f;
import p4560f.p4561a.p4589j.C88934a;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.z */
public final class C70735z extends AbstractC23520b<DuetLayoutModeViewModel> implements AbstractC20382b, AbstractC21566a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f158331a = {new C89232y(C70735z.class, "cameraApiComponent", "getCameraApiComponent()Lcom/bytedance/creativex/recorder/camera/api/CameraApiComponent;", 0), new C89232y(C70735z.class, "recordControlApi", "getRecordControlApi()Lcom/bytedance/creativex/recorder/camera/api/RecordControlApi;", 0), new C89232y(C70735z.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0)};

    /* renamed from: f */
    public static int f158332f = 3000;

    /* renamed from: k */
    public static final C70736a f158333k = new C70736a((byte) 0);

    /* renamed from: b */
    public final C1213t<C14335a> f158334b;

    /* renamed from: c */
    public final ShortVideoContext f158335c;

    /* renamed from: d */
    public final Stack<Integer> f158336d;

    /* renamed from: e */
    public boolean f158337e;

    /* renamed from: l */
    private final AbstractC89171a<DuetLayoutModeViewModel> f158338l = C70746i.f158356a;

    /* renamed from: m */
    private final C70701q f158339m;

    /* renamed from: n */
    private final AbstractC89248d f158340n;

    /* renamed from: o */
    private final AbstractC89248d f158341o;

    /* renamed from: p */
    private final AbstractC89248d f158342p;

    /* renamed from: q */
    private final C88411a f158343q;

    /* renamed from: r */
    private final ActivityC0945e f158344r;

    /* renamed from: s */
    private final AbstractC22186b f158345s;

    /* renamed from: t */
    private final C21582f f158346t;

    /* renamed from: a */
    public final AbstractC14177d mo111536a() {
        return (AbstractC14177d) this.f158340n.mo23374a(this, f158331a[0]);
    }

    /* renamed from: f */
    public final AbstractC14193m mo111538f() {
        return (AbstractC14193m) this.f158341o.mo23374a(this, f158331a[1]);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.z$a */
    public static final class C70736a {
        static {
            Covode.recordClassIndex(83207);
        }

        private C70736a() {
        }

        public /* synthetic */ C70736a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: b */
    public final AbstractC89171a<DuetLayoutModeViewModel> mo23031b() {
        return this.f158338l;
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: e */
    public final AbstractC22186b mo23034e() {
        return this.f158345s;
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f158346t;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.z$i */
    static final class C70746i extends AbstractC89220m implements AbstractC89171a<DuetLayoutModeViewModel> {

        /* renamed from: a */
        public static final C70746i f158356a = new C70746i();

        static {
            Covode.recordClassIndex(83217);
        }

        C70746i() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ DuetLayoutModeViewModel invoke() {
            return new DuetLayoutModeViewModel();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.z$g */
    public static final class C70742g implements AbstractC14189i {

        /* renamed from: a */
        final /* synthetic */ C70735z f158352a;

        static {
            Covode.recordClassIndex(83213);
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.z$g$a */
        static final class C70743a extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C70742g f158353a;

            static {
                Covode.recordClassIndex(83214);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C70743a(C70742g gVar) {
                super(0);
                this.f158353a = gVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                this.f158353a.f158352a.mo111538f().mo22880a(new C78600h("duet"));
                return C89391z.f203057a;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.z$g$b */
        static final class C70744b extends AbstractC89220m implements AbstractC89171a<C89391z> {

            /* renamed from: a */
            final /* synthetic */ C70742g f158354a;

            static {
                Covode.recordClassIndex(83215);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C70744b(C70742g gVar) {
                super(0);
                this.f158354a = gVar;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            @Override // p4600h.p4611f.p4612a.AbstractC89171a
            public final /* synthetic */ C89391z invoke() {
                this.f158354a.f158352a.mo111538f().mo22880a(new C78600h("duet"));
                return C89391z.f203057a;
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C70742g(C70735z zVar) {
            this.f158352a = zVar;
        }

        @Override // com.bytedance.creativex.recorder.p940b.p941a.AbstractC14189i
        /* renamed from: a */
        public final boolean mo22857a(C78600h hVar) {
            C89219l.m154721d(hVar, "");
            if (!this.f158352a.f158335c.f155754O) {
                return false;
            }
            Keva repo = Keva.getRepo("duet_keva_object");
            C89219l.m154716b(repo, "");
            if (repo.getBoolean("duet_green_screen", true)) {
                repo.storeBoolean("duet_green_screen", false);
                this.f158352a.mo111537a(new C70743a(this));
                return true;
            } else if (this.f158352a.f158337e || C89219l.m154714a((Object) "duet", (Object) hVar.f176645a)) {
                return false;
            } else {
                int i = 0;
                for (T t : this.f158352a.f158336d) {
                    C89219l.m154716b(t, "");
                    i += t.intValue();
                }
                if (i >= C70735z.f158332f) {
                    return false;
                }
                this.f158352a.mo111537a(new C70744b(this));
                return true;
            }
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: d */
    public final void mo23033d() {
        C70701q qVar = this.f158339m;
        if (!qVar.f158257C) {
            qVar.f158257C = true;
            C70662c cVar = qVar.f158286t;
            if (cVar != null) {
                cVar.mo70112b(new C40903b());
            }
        }
    }

    static {
        Covode.recordClassIndex(83206);
    }

    @Override // com.bytedance.ui_component.AbstractC23520b
    /* renamed from: c */
    public final void mo23032c() {
        this.f158345s.mo36417e(this.f158339m);
        C70701q qVar = this.f158339m;
        qVar.f158257C = false;
        C22239d b = C22227b.m41826b(qVar);
        Activity activity = qVar.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        b.mo36528a((ActivityC0945e) activity, qVar.f158288v);
        C70662c cVar = qVar.f158286t;
        if (cVar != null) {
            cVar.mo70110a(new C40903b());
        }
    }

    @Override // com.bytedance.ui_component.AbstractC23520b, com.bytedance.als.AbstractC2562j
    public final void onCreate() {
        super.onCreate();
        C22226a.m41822a(this.f158345s, R.id.dg9, this.f158339m, "DuetLayoutModeScene");
        mo111538f().mo22901h().mo6997a(this, new C70738c(this));
        mo111538f().mo22913t().mo6997a(this, new C70739d(this));
        mo111538f().mo22912s().mo6997a(this, new C70740e(this));
        AbstractC88412b a = ((AbstractC84089j) this.f158342p.mo23374a(this, f158331a[2])).mo23125g().mo143261a(C88391a.m153580a(C88392a.f200660a)).mo143254a(new C70741f(this), C84909p.f189747a);
        C89219l.m154716b(a, "");
        C88934a.m154195a(a, this.f158343q);
        mo111538f().mo22883a(C14197p.class, new C70742g(this));
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.z$c */
    static final class C70738c<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C70735z f158348a;

        static {
            Covode.recordClassIndex(83209);
        }

        C70738c(C70735z zVar) {
            this.f158348a = zVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            ((DuetLayoutModeViewModel) this.f158348a.getApiComponent()).mo111486b(true);
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.z$b */
    static final class C70737b extends AbstractC89220m implements AbstractC89172b<AbstractC14318d, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70735z f158347a;

        static {
            Covode.recordClassIndex(83208);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70737b(C70735z zVar) {
            super(1);
            this.f158347a = zVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC14318d dVar) {
            AbstractC14318d dVar2 = dVar;
            C89219l.m154721d(dVar2, "");
            AbstractC14315b bVar = (AbstractC14315b) this.f158347a.getDiContainer().mo35252b(AbstractC14315b.class, null);
            if (bVar != null) {
                bVar.mo23097a(dVar2, 2);
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.z$d */
    static final class C70739d<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C70735z f158349a;

        static {
            Covode.recordClassIndex(83210);
        }

        C70739d(C70735z zVar) {
            this.f158349a = zVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            ((DuetLayoutModeViewModel) this.f158349a.getApiComponent()).mo111486b(false);
            this.f158349a.f158336d.clear();
            this.f158349a.f158337e = false;
            this.f158349a.mo111536a().mo22747A().mo56903a(27561, 0, 0, "");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.z$f */
    static final class C70741f<T> implements AbstractC88433f {

        /* renamed from: a */
        final /* synthetic */ C70735z f158351a;

        static {
            Covode.recordClassIndex(83212);
        }

        C70741f(C70735z zVar) {
            this.f158351a = zVar;
        }

        @Override // p4560f.p4561a.p4567d.AbstractC88433f
        public final /* synthetic */ void accept(Object obj) {
            C89378p pVar = (C89378p) obj;
            pVar.component1();
            C14335a aVar = (C14335a) pVar.component2();
            this.f158351a.f158334b.postValue(aVar);
            if (aVar != null) {
                if (aVar.f34706a == 60) {
                    this.f158351a.f158336d.push(Integer.valueOf(aVar.f34708c));
                }
                if (aVar.f34706a == 61 && aVar.f34708c == 1) {
                    this.f158351a.f158337e = true;
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo111537a(AbstractC89171a<C89391z> aVar) {
        C85056k.m146252a(new C17197a.C17200a(this.f158344r).mo27194b(R.string.bdh).mo27190a(R.string.bdi, (DialogInterface.OnClickListener) new DialogInterface$OnClickListenerC70745h(aVar), false).mo27193a().mo27185c());
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.z$e */
    static final class C70740e<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C70735z f158350a;

        static {
            Covode.recordClassIndex(83211);
        }

        C70740e(C70735z zVar) {
            this.f158350a = zVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            if (this.f158350a.f158335c.f155817b.mo109891d().isEmpty()) {
                this.f158350a.mo111536a().mo22782a(new C78608j(3));
                ((DuetLayoutModeViewModel) this.f158350a.getApiComponent()).mo111486b(false);
            }
            if (!this.f158350a.f158336d.empty()) {
                this.f158350a.f158336d.pop();
            }
            this.f158350a.f158337e = false;
            this.f158350a.mo111536a().mo22747A().mo56903a(27560, 0, 0, "");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.shortvideo.duet.z$h */
    public static final class DialogInterface$OnClickListenerC70745h implements DialogInterface.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ AbstractC89171a f158355a;

        static {
            Covode.recordClassIndex(83216);
        }

        DialogInterface$OnClickListenerC70745h(AbstractC89171a aVar) {
            this.f158355a = aVar;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            this.f158355a.invoke();
        }
    }

    public C70735z(AbstractC22186b bVar, C21582f fVar) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(fVar, "");
        this.f158345s = bVar;
        this.f158346t = fVar;
        C1213t<C14335a> tVar = new C1213t<>();
        this.f158334b = tVar;
        this.f158339m = new C70701q(getDiContainer(), tVar, new C70737b(this));
        this.f158340n = C21572a.m40504a(getDiContainer(), AbstractC14177d.class);
        this.f158341o = C21572a.m40504a(getDiContainer(), AbstractC14193m.class);
        this.f158335c = (ShortVideoContext) getDiContainer().mo35249a(ShortVideoContext.class, (String) null);
        this.f158342p = C21572a.m40504a(getDiContainer(), AbstractC84089j.class);
        this.f158343q = new C88411a();
        this.f158336d = new Stack<>();
        this.f158344r = (ActivityC0945e) getDiContainer().mo35248a(ActivityC0945e.class, (String) null);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <S extends AbstractC20368af, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20382b, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        AbstractC20382b.C20383a.m38599a(this, jediViewModel, kVar, ahVar, mVar);
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
}
