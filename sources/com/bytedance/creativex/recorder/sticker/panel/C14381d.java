package com.bytedance.creativex.recorder.sticker.panel;

import android.app.Activity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.ActivityC0218d;
import androidx.fragment.app.AbstractC0952i;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14170ab;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14198q;
import com.bytedance.creativex.recorder.sticker.p947a.AbstractC14330a;
import com.bytedance.creativex.recorder.sticker.p948b.C14339e;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20527q;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.C21582f;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.scene.AbstractC22219j;
import com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75573i;
import com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l;
import com.p2082ss.android.ugc.aweme.sticker.panel.p3972b.AbstractC75495c;
import com.p2082ss.android.ugc.aweme.sticker.types.p4000ar.text.C75972r;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84919c;
import com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84920d;
import com.p2082ss.android.ugc.tools.view.p4362a.C84921e;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.bytedance.creativex.recorder.sticker.panel.d */
public final class C14381d extends AbstractC22219j implements AbstractC14379b, AbstractC20527q {

    /* renamed from: d */
    public static final C14384b f34808d = new C14384b((byte) 0);

    /* renamed from: a */
    final AbstractC89244h f34809a;

    /* renamed from: b */
    public final AbstractC84917a f34810b;

    /* renamed from: c */
    public final C21582f f34811c;

    /* renamed from: e */
    private final AbstractC89244h f34812e;

    /* renamed from: f */
    private final AbstractC89244h f34813f;

    /* renamed from: g */
    private boolean f34814g;

    /* renamed from: h */
    private final C75972r.AbstractC75974b f34815h;

    /* renamed from: i */
    private final AbstractC84920d f34816i;

    static {
        Covode.recordClassIndex(16456);
    }

    /* renamed from: C */
    private final AbstractC75573i m26242C() {
        return (AbstractC75573i) this.f34813f.getValue();
    }

    /* renamed from: d */
    public final AbstractC84919c mo23197d() {
        return (AbstractC84919c) this.f34812e.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.bytedance.creativex.recorder.sticker.panel.d$b */
    public static final class C14384b {
        static {
            Covode.recordClassIndex(16459);
        }

        private C14384b() {
        }

        public /* synthetic */ C14384b(byte b) {
            this();
        }
    }

    @Override // com.bytedance.creativex.recorder.sticker.panel.AbstractC14379b
    /* renamed from: a */
    public final AbstractC22219j mo23193a() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20534v
    public final AbstractC1204m getLifecycleOwner() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20534v getLifecycleOwnerHolder() {
        return this;
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final AbstractC20367ae<AbstractC20477i> getReceiverHolder() {
        return this;
    }

    @Override // com.bytedance.creativex.recorder.sticker.panel.AbstractC14379b
    /* renamed from: b */
    public final void mo23195b() {
        m26242C().mo119142f();
    }

    @Override // com.bytedance.creativex.recorder.sticker.panel.AbstractC14379b
    /* renamed from: c */
    public final void mo23196c() {
        m26242C().mo119143g();
    }

    /* renamed from: com.bytedance.creativex.recorder.sticker.panel.d$c */
    static final class C14385c extends AbstractC89220m implements AbstractC89171a<AbstractC84919c> {

        /* renamed from: a */
        final /* synthetic */ C14381d f34821a;

        static {
            Covode.recordClassIndex(16460);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14385c(C14381d dVar) {
            super(0);
            this.f34821a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC84919c invoke() {
            if (this.f34821a.mo36486t() instanceof AbstractC84919c) {
                Activity t = this.f34821a.mo36486t();
                Objects.requireNonNull(t, "null cannot be cast to non-null type com.ss.android.ugc.tools.view.activity.AVListenableActivityRegistry");
                return t;
            } else if (this.f34821a.f34811c.mo35251b(AbstractC84919c.class) instanceof AbstractC84919c) {
                Object b = this.f34821a.f34811c.mo35251b(AbstractC84919c.class);
                Objects.requireNonNull(b, "null cannot be cast to non-null type com.ss.android.ugc.tools.view.activity.AVListenableActivityRegistry");
                return b;
            } else {
                Object a = this.f34821a.f34811c.mo35247a(AbstractC14170ab.class);
                Objects.requireNonNull(a, "null cannot be cast to non-null type com.ss.android.ugc.tools.view.activity.AVListenableActivityRegistry");
                return a;
            }
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.sticker.panel.d$e */
    static final class C14387e extends AbstractC89220m implements AbstractC89171a<AbstractC75573i> {

        /* renamed from: a */
        final /* synthetic */ C14381d f34823a;

        /* renamed from: b */
        final /* synthetic */ AbstractC75495c f34824b;

        static {
            Covode.recordClassIndex(16462);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C14387e(C14381d dVar, AbstractC75495c cVar) {
            super(0);
            this.f34823a = dVar;
            this.f34824b = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC75573i invoke() {
            ActivityC0218d dVar = (ActivityC0218d) this.f34823a.f34811c.mo35248a(ActivityC0218d.class, (String) null);
            AbstractC75495c cVar = this.f34824b;
            View c = this.f34823a.mo36475c(R.id.c6n);
            C89219l.m154716b(c, "");
            AbstractC0952i supportFragmentManager = dVar.getSupportFragmentManager();
            C89219l.m154716b(supportFragmentManager, "");
            AbstractC75573i a = cVar.mo119151a(dVar, (FrameLayout) c, dVar, supportFragmentManager);
            a.mo119134a(new C14388a(this));
            return a;
        }

        /* renamed from: com.bytedance.creativex.recorder.sticker.panel.d$e$a */
        public static final class C14388a implements AbstractC75576l {

            /* renamed from: a */
            final /* synthetic */ C14387e f34825a;

            static {
                Covode.recordClassIndex(16463);
            }

            @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
            /* renamed from: a */
            public final void mo23175a(View view) {
                C89219l.m154721d(view, "");
            }

            @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
            public final void cD_() {
            }

            C14388a(C14387e eVar) {
                this.f34825a = eVar;
            }

            @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
            /* renamed from: a */
            public final void mo23176a(AbstractC75576l.EnumC75577a aVar) {
                C89219l.m154721d(aVar, "");
                if (aVar == AbstractC75576l.EnumC75577a.BEFORE_ANIMATE) {
                    this.f34825a.f34823a.f34811c.mo35251b(AbstractC14198q.class);
                    AbstractC84919c d = this.f34825a.f34823a.mo23197d();
                    if (d != null) {
                        d.mo87533b(this.f34825a.f34823a.f34810b);
                    }
                }
            }

            @Override // com.p2082ss.android.ugc.aweme.sticker.panel.AbstractC75576l
            /* renamed from: b */
            public final void mo23177b(AbstractC75576l.EnumC75577a aVar) {
                C89219l.m154721d(aVar, "");
                if (aVar == AbstractC75576l.EnumC75577a.AFTER_ANIMATE) {
                    this.f34825a.f34823a.f34811c.mo35251b(AbstractC14198q.class);
                    AbstractC84919c d = this.f34825a.f34823a.mo23197d();
                    if (d != null) {
                        d.mo87535c(this.f34825a.f34823a.f34810b);
                    }
                }
            }
        }
    }

    /* renamed from: com.bytedance.creativex.recorder.sticker.panel.d$a */
    public static final class C14383a extends AbstractC89220m implements AbstractC89171a<RecordStickerPanelViewModel> {

        /* renamed from: a */
        final /* synthetic */ AbstractC22219j f34818a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f34819b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f34820c;

        static {
            Covode.recordClassIndex(16458);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14383a(AbstractC22219j jVar, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f34818a = jVar;
            this.f34819b = cVar;
            this.f34820c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v8, types: [com.bytedance.creativex.recorder.sticker.panel.RecordStickerPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v15, types: [com.bytedance.creativex.recorder.sticker.panel.RecordStickerPanelViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bytedance.creativex.recorder.sticker.panel.RecordStickerPanelViewModel invoke() {
            /*
                r6 = this;
                com.bytedance.scene.j r0 = r6.f34818a
                com.bytedance.scene.j r5 = r0.f52551o
                h.k.c r0 = r6.f34820c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r3 = r0.getCanonicalName()
                java.lang.String r4 = ""
                p4600h.p4611f.p4613b.C89219l.m154716b(r3, r4)
            L_0x0013:
                if (r5 == 0) goto L_0x003a
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ad r2 = com.bytedance.scene.C22267s.m41934a(r5, r0)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f34820c     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                java.lang.String r1 = r0.getCanonicalName()     // Catch:{ as -> 0x0035 }
                p4600h.p4611f.p4613b.C89219l.m154716b(r1, r4)     // Catch:{ as -> 0x0035 }
                h.k.c r0 = r6.f34819b     // Catch:{ as -> 0x0035 }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x0035 }
                androidx.lifecycle.ac r0 = m26250x6068b3ef(r2, r1, r0)     // Catch:{ as -> 0x0035 }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x0035 }
                goto L_0x0038
            L_0x0035:
                com.bytedance.scene.j r5 = r5.f52551o
                goto L_0x0013
            L_0x0038:
                if (r0 != 0) goto L_0x0052
            L_0x003a:
                com.bytedance.scene.j r0 = r6.f34818a
                androidx.fragment.app.e r1 = com.bytedance.scene.ktx.C22228c.m41832b(r0)
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r6.f34819b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m26250x6068b3ef(r1, r3, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0052:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.creativex.recorder.sticker.panel.C14381d.C14383a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_bytedance_creativex_recorder_sticker_panel_RecordStickerPanelScene$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m26250x6068b3ef(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    @Override // com.bytedance.creativex.recorder.sticker.panel.AbstractC14379b
    /* renamed from: a */
    public final void mo23194a(AbstractC14330a aVar) {
        C89219l.m154721d(aVar, "");
        if (!this.f34814g) {
            this.f34814g = true;
            aVar.mo23156a(m26242C());
            C75972r.AbstractC75974b bVar = this.f34815h;
            View c = mo36475c(R.id.c6p);
            C89219l.m154716b(c, "");
            aVar.mo23117a(bVar, (FrameLayout) c);
        }
    }

    public /* synthetic */ C14381d(C21582f fVar, AbstractC75495c cVar) {
        this(fVar, cVar, C143821.f34817a, new C84921e());
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.bi5, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.bytedance.creativex.recorder.sticker.panel.d$d */
    static final class C14386d implements AbstractC84917a {

        /* renamed from: a */
        final /* synthetic */ C14381d f34822a;

        static {
            Covode.recordClassIndex(16461);
        }

        C14386d(C14381d dVar) {
            this.f34822a = dVar;
        }

        @Override // com.p2082ss.android.ugc.tools.view.p4362a.AbstractC84917a
        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            AbstractC89171a<Boolean> aVar;
            RecordStickerPanelViewModel recordStickerPanelViewModel = (RecordStickerPanelViewModel) this.f34822a.f34809a.getValue();
            if (i != 4 || (((aVar = recordStickerPanelViewModel.f34799c.f34835b) != null && aVar.invoke().booleanValue()) || !C89219l.m154714a((Object) recordStickerPanelViewModel.f34798b.mo23122d().mo6996a(), (Object) true))) {
                return false;
            }
            recordStickerPanelViewModel.mo23139a(false);
            C14339e.m26184b(recordStickerPanelViewModel.f34798b);
            return true;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38708a(this, jediViewModel, ahVar, mVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38709a(this, jediViewModel, kVar, ahVar, mVar);
    }

    public C14381d(C21582f fVar, AbstractC75495c cVar, C75972r.AbstractC75974b bVar, AbstractC84920d dVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(cVar, "");
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(dVar, "");
        this.f34811c = fVar;
        this.f34815h = bVar;
        this.f34816i = dVar;
        this.f34812e = C89250i.m154773a((AbstractC89171a) new C14385c(this));
        AbstractC89277c a = C89204ab.m154669a(RecordStickerPanelViewModel.class);
        this.f34809a = C89250i.m154773a((AbstractC89171a) new C14383a(this, a, a));
        this.f34810b = new C14386d(this);
        this.f34813f = C89250i.m154773a((AbstractC89171a) new C14387e(this, cVar));
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20527q.C20528a.m38711a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20527q.C20528a.m38710a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A, B, C> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, AbstractC89290k<S, ? extends C> kVar3, C20370ah<C20375am<A, B, C>> ahVar, AbstractC89188r<? super AbstractC20477i, ? super A, ? super B, ? super C, C89391z> rVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(kVar3, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(rVar, "");
        return AbstractC20527q.C20528a.m38712a(this, jediViewModel, kVar, kVar2, kVar3, ahVar, rVar);
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
        return AbstractC20527q.C20528a.m38713a(this, jediViewModel, kVar, kVar2, kVar3, kVar4, ahVar, sVar);
    }
}
