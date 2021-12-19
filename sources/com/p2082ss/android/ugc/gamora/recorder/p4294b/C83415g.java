package com.p2082ss.android.ugc.gamora.recorder.p4294b;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.lifecycle.AbstractC1204m;
import com.C1764a;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.C2560h;
import com.bytedance.als.C2563k;
import com.bytedance.als.C2564l;
import com.bytedance.common.utility.C13628n;
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
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.p1559o.AbstractC21566a;
import com.bytedance.p1559o.C21582f;
import com.bytedance.p1559o.p1561b.C21572a;
import com.bytedance.scene.AbstractC22219j;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63247i;
import com.p2082ss.android.ugc.aweme.shortvideo.C71812ep;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.C74294n;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.ScrollableLinearLayout;
import com.p2082ss.android.ugc.aweme.shortvideo.widget.TabHost;
import com.p2082ss.android.ugc.aweme.utils.C80573ig;
import com.p2082ss.android.ugc.gamora.recorder.sticker.p4311c.AbstractC84089j;
import com.p2082ss.android.ugc.trill.R;
import java.util.Iterator;
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
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89232y;
import p4600h.p4616h.AbstractC89248d;
import p4600h.p4620k.AbstractC89286i;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.gamora.recorder.b.g */
public final class C83415g extends AbstractC22219j implements AbstractC20382b, AbstractC21566a {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f186301a = {new C89232y(C83415g.class, "stickerApiComponent", "getStickerApiComponent()Lcom/ss/android/ugc/gamora/recorder/sticker/sticker_core/StickerApiComponent;", 0)};

    /* renamed from: i */
    public static final C83416a f186302i = new C83416a((byte) 0);

    /* renamed from: b */
    final AbstractC89244h f186303b = C89250i.m154773a((AbstractC89171a) new C83421e(this));

    /* renamed from: c */
    public View f186304c;

    /* renamed from: d */
    int f186305d = -1;

    /* renamed from: e */
    public TabHost f186306e;

    /* renamed from: f */
    public int f186307f = C71812ep.m126783a(40.0d, C63247i.f143610a);

    /* renamed from: g */
    public C83408c f186308g;

    /* renamed from: h */
    public final C83410e f186309h;

    /* renamed from: j */
    private final AbstractC89248d f186310j = C21572a.m40505b(getDiContainer(), AbstractC84089j.class);

    /* renamed from: k */
    private final C21582f f186311k;

    /* renamed from: l */
    private final ShortVideoContext f186312l;

    /* renamed from: t */
    private final C2564l<Integer> f186313t;

    /* renamed from: u */
    private final C2560h<Boolean> f186314u;

    /* renamed from: v */
    private final C2563k<Boolean> f186315v;

    static {
        Covode.recordClassIndex(97301);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.g$a */
    public static final class C83416a {
        static {
            Covode.recordClassIndex(97302);
        }

        private C83416a() {
        }

        public /* synthetic */ C83416a(byte b) {
            this();
        }
    }

    @Override // com.bytedance.p1559o.AbstractC21566a
    public final C21582f getDiContainer() {
        return this.f186311k;
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

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.g$e */
    static final class C83421e extends AbstractC89220m implements AbstractC89171a<ScrollableLinearLayout> {

        /* renamed from: a */
        final /* synthetic */ C83415g f186321a;

        static {
            Covode.recordClassIndex(97307);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C83421e(C83415g gVar) {
            super(0);
            this.f186321a = gVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ScrollableLinearLayout invoke() {
            return C83415g.m143812b(this.f186321a).findViewById(R.id.acf);
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.g$b */
    static final class C83417b implements TabHost.AbstractC74261a {

        /* renamed from: a */
        final /* synthetic */ C83415g f186316a;

        static {
            Covode.recordClassIndex(97303);
        }

        C83417b(C83415g gVar) {
            this.f186316a = gVar;
        }

        /* renamed from: com.ss.android.ugc.gamora.recorder.b.g$b$a */
        static final class RunnableC83418a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ TextView f186317a;

            /* renamed from: b */
            final /* synthetic */ C83417b f186318b;

            static {
                Covode.recordClassIndex(97304);
            }

            RunnableC83418a(TextView textView, C83417b bVar) {
                this.f186317a = textView;
                this.f186318b = bVar;
            }

            public final void run() {
                ViewGroup.LayoutParams layoutParams = C83415g.m143811a(this.f186318b.f186316a).getLayoutParams();
                layoutParams.width = this.f186317a.getWidth();
                C83415g.m143811a(this.f186318b.f186316a).setLayoutParams(layoutParams);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.shortvideo.widget.TabHost.AbstractC74261a
        /* renamed from: a */
        public final void mo116853a(Object obj, int i, int i2, boolean z, boolean z2) {
            TextView textView;
            View childAt = ((ScrollableLinearLayout) this.f186316a.f186303b.getValue()).getChildAt(i);
            if (!(childAt instanceof C74294n)) {
                childAt = null;
            }
            C74294n nVar = (C74294n) childAt;
            if (nVar != null && (textView = nVar.getTextView()) != null) {
                textView.post(new RunnableC83418a(textView, this));
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ View m143811a(C83415g gVar) {
        View view = gVar.f186304c;
        if (view == null) {
            C89219l.m154710a("selectedBg");
        }
        return view;
    }

    /* renamed from: b */
    public static final /* synthetic */ TabHost m143812b(C83415g gVar) {
        TabHost tabHost = gVar.f186306e;
        if (tabHost == null) {
            C89219l.m154710a("tabHost");
        }
        return tabHost;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: a */
    public final int mo128436a(Object obj) {
        if (obj == null) {
            return -1;
        }
        TabHost tabHost = this.f186306e;
        if (tabHost == null) {
            C89219l.m154710a("tabHost");
        }
        int tabCount = tabHost.getTabCount();
        for (int i = 0; i < tabCount; i++) {
            TabHost tabHost2 = this.f186306e;
            if (tabHost2 == null) {
                C89219l.m154710a("tabHost");
            }
            if (C89219l.m154714a(obj, tabHost2.mo116829a(i))) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.g$d */
    static final class C83420d<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83415g f186320a;

        static {
            Covode.recordClassIndex(97306);
        }

        C83420d(C83415g gVar) {
            this.f186320a = gVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            int i;
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                i = C71812ep.m126783a(33.0d, C63247i.f143610a) + this.f186320a.f186307f;
            } else {
                i = this.f186320a.f186307f;
            }
            ViewGroup.LayoutParams layoutParams = C83415g.m143812b(this.f186320a).getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.bottomMargin = i + ((int) C13628n.m24520b(this.f186320a.f52549m, 100.0f)) + ((int) C13628n.m24520b(this.f186320a.f52549m, -12.5f));
            C83415g.m143812b(this.f186320a).setLayoutParams(layoutParams2);
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        View c = mo36475c(R.id.abt);
        C89219l.m154716b(c, "");
        TabHost tabHost = (TabHost) c;
        this.f186306e = tabHost;
        if (tabHost == null) {
            C89219l.m154710a("tabHost");
        }
        View findViewById = tabHost.findViewById(R.id.abs);
        C89219l.m154716b(findViewById, "");
        this.f186304c = findViewById;
        TabHost tabHost2 = this.f186306e;
        if (tabHost2 == null) {
            C89219l.m154710a("tabHost");
        }
        tabHost2.setVisibility(8);
        C83410e eVar = this.f186309h;
        C83417b bVar = new C83417b(this);
        C89219l.m154721d(bVar, "");
        eVar.f186292e = bVar;
        C83410e eVar2 = this.f186309h;
        ShortVideoContext shortVideoContext = this.f186312l;
        TabHost tabHost3 = this.f186306e;
        if (tabHost3 == null) {
            C89219l.m154710a("tabHost");
        }
        eVar2.mo128426a(shortVideoContext, tabHost3);
        this.f186313t.mo7036a(this, new C83419c(this));
        C2560h<Boolean> hVar = this.f186314u;
        if (hVar != null) {
            hVar.mo7036a(this, new C83420d(this));
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.b.g$c */
    static final class C83419c<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C83415g f186319a;

        static {
            Covode.recordClassIndex(97305);
        }

        C83419c(C83415g gVar) {
            this.f186319a = gVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            T t;
            int a;
            Integer num = (Integer) obj;
            TabHost b = C83415g.m143812b(this.f186319a);
            C89219l.m154716b(num, "");
            b.setVisibility(num.intValue());
            C83415g gVar = this.f186319a;
            boolean z = false;
            if (num.intValue() != 0) {
                if (gVar.f186305d >= 0) {
                    TabHost tabHost = gVar.f186306e;
                    if (tabHost == null) {
                        C89219l.m154710a("tabHost");
                    }
                    gVar.f186305d = tabHost.getCurrentIndex();
                }
                TabHost tabHost2 = gVar.f186306e;
                if (tabHost2 == null) {
                    C89219l.m154710a("tabHost");
                }
                tabHost2.mo116830a(-1, 0);
            } else if (gVar.f186305d < 0) {
                Iterator<T> it = gVar.f186309h.f186288a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (t.f186299b.f186285e) {
                        break;
                    }
                }
                T t2 = t;
                if (t2 == null || (a = gVar.mo128436a(t2.f186299b.f186283c)) < 0) {
                    a = gVar.mo128436a(C80573ig.m139668a(R.string.f7s));
                }
                gVar.f186305d = a;
                TabHost tabHost3 = gVar.f186306e;
                if (tabHost3 == null) {
                    C89219l.m154710a("tabHost");
                }
                int i = gVar.f186305d;
                C83408c cVar = gVar.f186308g;
                if (cVar != null) {
                    z = cVar.f186275a;
                }
                tabHost3.mo116832a(i, true, z, true);
            } else {
                TabHost tabHost4 = gVar.f186306e;
                if (tabHost4 == null) {
                    C89219l.m154710a("tabHost");
                }
                tabHost4.mo116830a(gVar.f186305d, 0);
            }
            gVar.f186308g = null;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.bhu, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
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

    public C83415g(C21582f fVar, ShortVideoContext shortVideoContext, C83410e eVar, C2564l<Integer> lVar, C2560h<Boolean> hVar, C2563k<Boolean> kVar) {
        C89219l.m154721d(fVar, "");
        C89219l.m154721d(shortVideoContext, "");
        C89219l.m154721d(eVar, "");
        C89219l.m154721d(lVar, "");
        C89219l.m154721d(hVar, "");
        C89219l.m154721d(kVar, "");
        this.f186311k = fVar;
        this.f186312l = shortVideoContext;
        this.f186309h = eVar;
        this.f186313t = lVar;
        this.f186314u = hVar;
        this.f186315v = kVar;
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
