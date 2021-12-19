package com.p2082ss.android.ugc.aweme.tools.live;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.C1764a;
import com.bytedance.als.AbstractC2565m;
import com.bytedance.als.ApiCenter;
import com.bytedance.bpea.basics.PrivacyCert;
import com.bytedance.covode.number.Covode;
import com.bytedance.creativex.recorder.p940b.p941a.AbstractC14177d;
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
import com.bytedance.scene.ktx.C22228c;
import com.google.p1998c.p1999a.AbstractC27235f;
import com.p2082ss.android.ugc.asve.recorder.effect.AbstractC31193a;
import com.p2082ss.android.ugc.asve.recorder.p2221c.AbstractC31133a;
import com.p2082ss.android.ugc.aweme.filter.FilterBean;
import com.p2082ss.android.ugc.aweme.port.internal.AbstractC63279g;
import com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63186am;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63238c;
import com.p2082ss.android.ugc.aweme.port.p3561in.C63244g;
import com.p2082ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;
import com.p2082ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p2082ss.android.ugc.aweme.shortvideo.C70005cr;
import com.p2082ss.android.ugc.aweme.shortvideo.C70747dv;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.p2082ss.android.ugc.aweme.shortvideo.p3835h.AbstractC71864a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3848n.AbstractC72453a;
import com.p2082ss.android.ugc.aweme.shortvideo.p3892x.AbstractC74317i;
import com.p2082ss.android.ugc.aweme.tools.live.sticker.C78626a;
import com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83467k;
import com.p2082ss.android.ugc.tools.utils.C84911q;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89386u;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.tools.live.a */
public final class C78615a extends AbstractC83467k implements AbstractC20382b {

    /* renamed from: b */
    public static final C78616a f176665b = new C78616a((byte) 0);

    /* renamed from: a */
    public RecordLiveViewModel f176666a;

    /* renamed from: c */
    private final AbstractC89244h f176667c = C89250i.m154773a((AbstractC89171a) C78617b.f176670a);

    /* renamed from: d */
    private volatile boolean f176668d;

    /* renamed from: e */
    private AbstractC63186am.AbstractC63187a f176669e;

    static {
        Covode.recordClassIndex(91754);
    }

    /* renamed from: H */
    private final AbstractC63279g m137212H() {
        return (AbstractC63279g) this.f176667c.getValue();
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83467k
    /* renamed from: a */
    public final String mo108523a() {
        return "RecordLiveScene";
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.a$a */
    public static final class C78616a {
        static {
            Covode.recordClassIndex(91755);
        }

        private C78616a() {
        }

        public /* synthetic */ C78616a(byte b) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public final /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.a$b */
    static final class C78617b extends AbstractC89220m implements AbstractC89171a<AbstractC63279g> {

        /* renamed from: a */
        public static final C78617b f176670a = new C78617b();

        static {
            Covode.recordClassIndex(91756);
        }

        C78617b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC63279g invoke() {
            return C63238c.f143592s.mo93845d();
        }
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83467k
    /* renamed from: D */
    public final boolean mo122519D() {
        mo122518C();
        return false;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83467k
    /* renamed from: E */
    public final boolean mo122520E() {
        mo122518C();
        return false;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83467k
    /* renamed from: F */
    public final boolean mo122521F() {
        mo122518C();
        return false;
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83467k
    /* renamed from: G */
    public final boolean mo122522G() {
        mo122518C();
        return false;
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

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83467k
    /* renamed from: d */
    public final void mo108525d() {
        AbstractC63279g C = mo122518C();
        View view = this.f52550n;
        Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
        C.mo95872a((ViewGroup) view);
        AbstractC63186am amVar = C63238c.f143592s;
        AbstractC63186am.AbstractC63187a aVar = this.f176669e;
        if (aVar == null) {
            C89219l.m154710a("mLiveStartListener");
        }
        amVar.mo93841b(aVar);
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: n_ */
    public final void mo22713n_() {
        AbstractC63186am amVar = C63238c.f143592s;
        AbstractC63186am.AbstractC63187a aVar = this.f176669e;
        if (aVar == null) {
            C89219l.m154710a("mLiveStartListener");
        }
        amVar.mo93841b(aVar);
        super.mo22713n_();
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.a$d */
    public static final class C78619d implements AbstractC63279g.AbstractC63280a {

        /* renamed from: a */
        final /* synthetic */ C78615a f176672a;

        /* renamed from: b */
        final /* synthetic */ AbstractC63279g f176673b;

        static {
            Covode.recordClassIndex(91758);
        }

        /* renamed from: c */
        private boolean m137226c() {
            if (C78615a.m137213a(this.f176672a).f176664d == null) {
                return false;
            }
            ShortVideoContext shortVideoContext = C78615a.m137213a(this.f176672a).f176664d;
            if (shortVideoContext == null) {
                C89219l.m154715b();
            }
            if (!shortVideoContext.f155817b.mo109889b()) {
                ShortVideoContext shortVideoContext2 = C78615a.m137213a(this.f176672a).f176664d;
                if (shortVideoContext2 == null) {
                    C89219l.m154715b();
                }
                if (!shortVideoContext2.f155817b.mo109890c()) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63279g.AbstractC63280a
        /* renamed from: a */
        public final void mo101865a() {
            if (m137226c() && this.f176673b.mo95870a() != null) {
                View a = this.f176673b.mo95870a();
                if (a == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(a, "");
                a.setVisibility(8);
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.port.internal.AbstractC63279g.AbstractC63280a
        /* renamed from: b */
        public final void mo101866b() {
            if (m137226c() && this.f176673b.mo95870a() != null) {
                View a = this.f176673b.mo95870a();
                if (a == null) {
                    C89219l.m154715b();
                }
                C89219l.m154716b(a, "");
                a.setVisibility(0);
            }
        }

        C78619d(C78615a aVar, AbstractC63279g gVar) {
            this.f176672a = aVar;
            this.f176673b = gVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.a$g */
    static final class C78622g implements AbstractC63186am.AbstractC63187a {

        /* renamed from: a */
        final /* synthetic */ C78615a f176676a;

        static {
            Covode.recordClassIndex(91761);
        }

        C78622g(C78615a aVar) {
            this.f176676a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.port.p3561in.AbstractC63186am.AbstractC63187a
        /* renamed from: a */
        public final void mo101625a() {
            C84911q.m145921a("OnLiveStartListener#onStartLive");
            RecordLiveViewModel a = C78615a.m137213a(this.f176676a);
            AbstractC31133a aVar = a.f176663c;
            if (aVar == null) {
                C89219l.m154710a("mediaController");
            }
            aVar.mo56592a((PrivacyCert) null);
            a.mo122517a().mo22743c(false, null);
        }
    }

    /* renamed from: C */
    public final AbstractC63279g mo122518C() {
        AbstractC74317i filterModule;
        if (!this.f176668d) {
            boolean z = true;
            this.f176668d = true;
            AbstractC63279g H = m137212H();
            Activity activity = this.f52549m;
            RecordLiveViewModel recordLiveViewModel = this.f176666a;
            if (recordLiveViewModel == null) {
                C89219l.m154710a("recordLiveViewModel");
            }
            H.mo95871a(activity, recordLiveViewModel.f176661a);
            RecordLiveViewModel recordLiveViewModel2 = this.f176666a;
            if (recordLiveViewModel2 == null) {
                C89219l.m154710a("recordLiveViewModel");
            }
            IRecordingOperationPanel iRecordingOperationPanel = recordLiveViewModel2.f176661a;
            if (!(iRecordingOperationPanel == null || (filterModule = iRecordingOperationPanel.filterModule()) == null)) {
                filterModule.mo113485a(new C78618c(this));
            }
            H.mo95875a(new View[0]);
            H.mo95874a(new C78619d(this, H));
            RecordLiveViewModel recordLiveViewModel3 = this.f176666a;
            if (recordLiveViewModel3 == null) {
                C89219l.m154710a("recordLiveViewModel");
            }
            AbstractC14177d a = recordLiveViewModel3.mo122517a();
            AbstractC63186am amVar = C63238c.f143592s;
            if (a.mo22757K() != 1) {
                z = false;
            }
            amVar.mo93842b(z);
        }
        return m137212H();
    }

    @Override // com.p2082ss.android.ugc.gamora.recorder.p4294b.AbstractC83467k
    /* renamed from: b */
    public final void mo108524b() {
        String str;
        String str2;
        mo122518C();
        Bundle bundle = new Bundle();
        RecordLiveViewModel recordLiveViewModel = this.f176666a;
        if (recordLiveViewModel == null) {
            C89219l.m154710a("recordLiveViewModel");
        }
        ShortVideoContext shortVideoContext = recordLiveViewModel.f176664d;
        String str3 = null;
        if (shortVideoContext != null) {
            str = shortVideoContext.f155831p;
        } else {
            str = null;
        }
        bundle.putString("shoot_way", str);
        RecordLiveViewModel recordLiveViewModel2 = this.f176666a;
        if (recordLiveViewModel2 == null) {
            C89219l.m154710a("recordLiveViewModel");
        }
        ShortVideoContext shortVideoContext2 = recordLiveViewModel2.f176664d;
        if (shortVideoContext2 != null) {
            str2 = shortVideoContext2.f155837v;
        } else {
            str2 = null;
        }
        bundle.putString("enter_from", str2);
        bundle.putString("video_id", C70747dv.m124972a());
        RecordLiveViewModel recordLiveViewModel3 = this.f176666a;
        if (recordLiveViewModel3 == null) {
            C89219l.m154710a("recordLiveViewModel");
        }
        ShortVideoContext shortVideoContext3 = recordLiveViewModel3.f176664d;
        if (shortVideoContext3 != null) {
            str3 = shortVideoContext3.f155828m;
        }
        bundle.putString("sourceParams", str3);
        bundle.putString("enter_from_type", String.valueOf(C78626a.f176685a));
        C70005cr a = C70005cr.m123611a();
        C89219l.m154716b(a, "");
        List<AVChallenge> list = a.f156485d;
        C89219l.m154716b(list, "");
        if (!list.isEmpty()) {
            C70005cr a2 = C70005cr.m123611a();
            C89219l.m154716b(a2, "");
            String b = C63244g.m114602a().mo73261G().mo46674b(a2.f156485d.get(0));
            C89219l.m154716b(b, "");
            bundle.putString("challenge", b);
        }
        AbstractC63279g C = mo122518C();
        View view = this.f52550n;
        Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
        C.mo95873a((ViewGroup) view, bundle);
        RecordLiveViewModel recordLiveViewModel4 = this.f176666a;
        if (recordLiveViewModel4 == null) {
            C89219l.m154710a("recordLiveViewModel");
        }
        ShortVideoContext shortVideoContext4 = recordLiveViewModel4.f176664d;
        if (shortVideoContext4 != null && shortVideoContext4.f155817b.f155650f.isEmpty()) {
            AbstractC63186am amVar = C63238c.f143592s;
            AbstractC63186am.AbstractC63187a aVar = this.f176669e;
            if (aVar == null) {
                C89219l.m154710a("mLiveStartListener");
            }
            amVar.mo93838a(aVar);
        }
        if (this.f176666a == null) {
            C89219l.m154710a("recordLiveViewModel");
        }
        mo122518C();
    }

    /* renamed from: a */
    public static final /* synthetic */ RecordLiveViewModel m137213a(C78615a aVar) {
        RecordLiveViewModel recordLiveViewModel = aVar.f176666a;
        if (recordLiveViewModel == null) {
            C89219l.m154710a("recordLiveViewModel");
        }
        return recordLiveViewModel;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.a$e */
    static final class C78620e<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C78615a f176674a;

        static {
            Covode.recordClassIndex(91759);
        }

        C78620e(C78615a aVar) {
            this.f176674a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C89386u uVar = (C89386u) obj;
            ((Number) uVar.component1()).intValue();
            ((Number) uVar.component2()).intValue();
            uVar.component3();
            this.f176674a.mo122518C();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.live.a$f */
    static final class C78621f<T> implements AbstractC2565m {

        /* renamed from: a */
        final /* synthetic */ C78615a f176675a;

        static {
            Covode.recordClassIndex(91760);
        }

        C78621f(C78615a aVar) {
            this.f176675a = aVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u, com.bytedance.als.AbstractC2565m
        public final /* synthetic */ void onChanged(Object obj) {
            C89378p pVar = (C89378p) obj;
            pVar.component1();
            ((Number) pVar.component2()).intValue();
            this.f176675a.mo122518C();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.live.a$c */
    public static final class C78618c<F, T> implements AbstractC27235f {

        /* renamed from: a */
        final /* synthetic */ C78615a f176671a;

        static {
            Covode.recordClassIndex(91757);
        }

        C78618c(C78615a aVar) {
            this.f176671a = aVar;
        }

        @Override // com.google.p1998c.p1999a.AbstractC27235f
        /* renamed from: a */
        public final /* synthetic */ Object mo45319a(Object obj) {
            FilterBean filterBean = (FilterBean) obj;
            if (filterBean != null) {
                this.f176671a.mo122518C();
                AbstractC31193a w = C78615a.m137213a(this.f176671a).mo122517a().mo22835w();
                C89219l.m154716b(filterBean, "");
                String filterFolder = filterBean.getFilterFolder();
                C89219l.m154716b(filterFolder, "");
                Float valueOf = Float.valueOf(w.mo56792b(filterFolder));
                if (valueOf != null) {
                    return valueOf;
                }
            }
            return Float.valueOf(0.0f);
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        ((AbstractC71864a) ApiCenter.C2545a.m7450a(C22228c.m41832b(this)).mo7013a(AbstractC71864a.class)).mo113517e().mo6997a(this, new C78620e(this));
        ((AbstractC72453a) ApiCenter.C2545a.m7450a(C22228c.m41832b(this)).mo7013a(AbstractC72453a.class)).mo114725a().mo6997a(this, new C78621f(this));
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC1174ac a = C1181ae.m3881a((ActivityC0945e) activity, (C1175ad.AbstractC1177b) null).mo3983a(RecordLiveViewModel.class);
        C89219l.m154716b(a, "");
        this.f176666a = (RecordLiveViewModel) a;
        this.f176669e = new C78622g(this);
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
        View a = C1764a.m5927a(layoutInflater, R.layout.bhz, viewGroup, false);
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
