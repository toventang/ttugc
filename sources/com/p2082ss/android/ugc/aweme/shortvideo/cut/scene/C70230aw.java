package com.p2082ss.android.ugc.aweme.shortvideo.cut.scene;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import com.C1764a;
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
import com.bytedance.jedi.arch.C20531t;
import com.bytedance.jedi.arch.JediViewModel;
import com.p2082ss.android.ugc.aweme.editSticker.p2877a.C45828d;
import com.p2082ss.android.ugc.aweme.record.DMTBgAnimRadioGroup;
import com.p2082ss.android.ugc.aweme.shortvideo.C70637di;
import com.p2082ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p2082ss.android.ugc.aweme.tools.EnumC78601i;
import com.p2082ss.android.ugc.aweme.tux.p4159a.p4168i.C79459a;
import com.p2082ss.android.ugc.gamora.p4273b.AbstractC82006b;
import com.p2082ss.android.ugc.trill.R;
import java.util.Objects;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4612a.AbstractC89188r;
import p4600h.p4611f.p4612a.AbstractC89189s;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.aw */
public class C70230aw extends AbstractC82006b implements AbstractC20382b {

    /* renamed from: h */
    public static final C70231a f157021h = new C70231a((byte) 0);

    /* renamed from: a */
    public AbstractC70299bu f157022a;

    /* renamed from: b */
    public DMTBgAnimRadioGroup f157023b;

    /* renamed from: c */
    public boolean f157024c = true;

    /* renamed from: d */
    protected CutMultiVideoViewModel f157025d;

    /* renamed from: e */
    protected CutVideoSpeedViewModel f157026e;

    /* renamed from: f */
    public float f157027f;

    /* renamed from: g */
    public EnumC78601i f157028g = EnumC78601i.NORMAL;

    static {
        Covode.recordClassIndex(82673);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.aw$a */
    public static final class C70231a {
        static {
            Covode.recordClassIndex(82674);
        }

        private C70231a() {
        }

        public /* synthetic */ C70231a(byte b) {
            this();
        }
    }

    /* Return type fixed from 'com.bytedance.jedi.arch.g' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20367ae
    public /* bridge */ /* synthetic */ AbstractC20477i getReceiver() {
        return this;
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

    /* access modifiers changed from: protected */
    public final CutMultiVideoViewModel cy_() {
        CutMultiVideoViewModel cutMultiVideoViewModel = this.f157025d;
        if (cutMultiVideoViewModel == null) {
            C89219l.m154710a("cutMultiVideoViewModel");
        }
        return cutMultiVideoViewModel;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo110865b() {
        DMTBgAnimRadioGroup dMTBgAnimRadioGroup = this.f157023b;
        if (dMTBgAnimRadioGroup == null) {
            C89219l.m154710a("speedView");
        }
        ViewGroup.LayoutParams layoutParams = dMTBgAnimRadioGroup.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin = (int) this.f157027f;
        DMTBgAnimRadioGroup dMTBgAnimRadioGroup2 = this.f157023b;
        if (dMTBgAnimRadioGroup2 == null) {
            C89219l.m154710a("speedView");
        }
        dMTBgAnimRadioGroup2.setLayoutParams(layoutParams2);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.aw$g */
    public static final class C70237g implements DMTBgAnimRadioGroup.AbstractC66762b {

        /* renamed from: a */
        final /* synthetic */ C70230aw f157034a;

        static {
            Covode.recordClassIndex(82680);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C70237g(C70230aw awVar) {
            this.f157034a = awVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.record.DMTBgAnimRadioGroup.AbstractC66762b
        /* renamed from: a */
        public final void mo88359a(int i) {
            if (this.f157034a.f157024c) {
                this.f157034a.f157028g = C70230aw.m123957d(i);
                this.f157034a.cy_().f156532d.setValue(Float.valueOf(C70230aw.m123957d(i).value()));
            }
        }

        @Override // com.p2082ss.android.ugc.aweme.record.DMTBgAnimRadioGroup.AbstractC66762b
        /* renamed from: b */
        public final boolean mo88360b(int i) {
            float f;
            if (!this.f157034a.f157024c || this.f157034a.f157022a == null) {
                return false;
            }
            AbstractC70299bu buVar = this.f157034a.f157022a;
            if (buVar != null) {
                f = buVar.mo87661G();
            } else {
                f = 0.0f;
            }
            float value = this.f157034a.f157028g.value();
            float value2 = C70230aw.m123957d(i).value();
            if (((long) ((f * value) / value2)) >= C70637di.m124840a() / 1000) {
                return true;
            }
            Activity t = this.f157034a.mo36486t();
            C89219l.m154716b(t, "");
            String string = t.getResources().getString(R.string.h79, Integer.valueOf((int) ((((float) (C70637di.m124840a() / 1000)) * value2) / value)));
            C89219l.m154716b(string, "");
            new C79459a(this.f157034a.mo36486t()).mo123052a(string).mo123053a();
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo110863a(CutMultiVideoViewModel cutMultiVideoViewModel) {
        C89219l.m154721d(cutMultiVideoViewModel, "");
        this.f157025d = cutMultiVideoViewModel;
    }

    /* renamed from: a */
    public static final /* synthetic */ DMTBgAnimRadioGroup m123956a(C70230aw awVar) {
        DMTBgAnimRadioGroup dMTBgAnimRadioGroup = awVar.f157023b;
        if (dMTBgAnimRadioGroup == null) {
            C89219l.m154710a("speedView");
        }
        return dMTBgAnimRadioGroup;
    }

    @Override // com.bytedance.jedi.arch.AbstractC20382b
    public <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af> S1 getState(VM1 vm1) {
        C89219l.m154721d(vm1, "");
        return (S1) AbstractC20382b.C20383a.m38582a(this, vm1);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.aw$d */
    static final class C70234d<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C70230aw f157031a;

        static {
            Covode.recordClassIndex(82677);
        }

        C70234d(C70230aw awVar) {
            this.f157031a = awVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Float f = (Float) obj;
            if (f != null) {
                float floatValue = f.floatValue();
                View view = this.f157031a.f52550n;
                C89219l.m154716b(view, "");
                view.setAlpha(floatValue);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.aw$f */
    static final class C70236f<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C70230aw f157033a;

        static {
            Covode.recordClassIndex(82679);
        }

        C70236f(C70230aw awVar) {
            this.f157033a = awVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            float a;
            Float f = (Float) obj;
            C70230aw awVar = this.f157033a;
            if (f != null) {
                a = f.floatValue();
            } else {
                Activity t = awVar.mo36486t();
                C89219l.m154716b(t, "");
                a = C45828d.m88452a(t, 163.0f);
            }
            awVar.f157027f = a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.aw$e */
    static final class C70235e<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C70230aw f157032a;

        static {
            Covode.recordClassIndex(82678);
        }

        C70235e(C70230aw awVar) {
            this.f157032a = awVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            EnumC78601i iVar = (EnumC78601i) obj;
            if (iVar != null) {
                this.f157032a.f157028g = iVar;
                DMTBgAnimRadioGroup a = C70230aw.m123956a(this.f157032a);
                int i = C70238ax.f157035a[iVar.ordinal()];
                int i2 = 2;
                if (i == 1) {
                    i2 = 0;
                } else if (i == 2) {
                    i2 = 1;
                } else if (i != 3) {
                    i2 = -1;
                }
                a.setCurrentItem(i2);
                C70230aw.m123956a(this.f157032a).requestLayout();
            }
        }
    }

    /* renamed from: d */
    public static EnumC78601i m123957d(int i) {
        if (i == 0) {
            return EnumC78601i.SLOW;
        }
        if (i == 1) {
            return EnumC78601i.NORMAL;
        }
        if (i == 2) {
            return EnumC78601i.FAST;
        }
        throw new IllegalArgumentException("unknown view: ".concat(String.valueOf(i)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo110864a(CutVideoSpeedViewModel cutVideoSpeedViewModel) {
        C89219l.m154721d(cutVideoSpeedViewModel, "");
        this.f157026e = cutVideoSpeedViewModel;
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public void mo22704a(Bundle bundle) {
        super.mo22704a(bundle);
        Activity activity = this.f52549m;
        Objects.requireNonNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AbstractC1174ac a = C1181ae.m3881a((ActivityC0945e) activity, (C1175ad.AbstractC1177b) null).mo3983a(CutMultiVideoViewModel.class);
        C89219l.m154716b(a, "");
        this.f157025d = (CutMultiVideoViewModel) a;
        Activity activity2 = this.f52549m;
        Objects.requireNonNull(activity2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        JediViewModel a2 = C20531t.m38716a((ActivityC0945e) activity2).mo33800a(CutVideoSpeedViewModel.class);
        C89219l.m154716b(a2, "");
        CutVideoSpeedViewModel cutVideoSpeedViewModel = (CutVideoSpeedViewModel) a2;
        this.f157026e = cutVideoSpeedViewModel;
        if (cutVideoSpeedViewModel == null) {
            C89219l.m154710a("speedViewModel");
        }
        selectNonNullSubscribe(cutVideoSpeedViewModel, C70239ay.f157036a, new C20370ah(), new C70232b(this));
        CutVideoSpeedViewModel cutVideoSpeedViewModel2 = this.f157026e;
        if (cutVideoSpeedViewModel2 == null) {
            C89219l.m154710a("speedViewModel");
        }
        selectNonNullSubscribe(cutVideoSpeedViewModel2, C70240az.f157037a, new C20370ah(), new C70233c(this));
        CutVideoSpeedViewModel cutVideoSpeedViewModel3 = this.f157026e;
        if (cutVideoSpeedViewModel3 == null) {
            C89219l.m154710a("speedViewModel");
        }
        cutVideoSpeedViewModel3.mo110752b().observe(this, new C70234d(this));
        CutVideoSpeedViewModel cutVideoSpeedViewModel4 = this.f157026e;
        if (cutVideoSpeedViewModel4 == null) {
            C89219l.m154710a("speedViewModel");
        }
        cutVideoSpeedViewModel4.mo110748a().observe(this, new C70235e(this));
        CutVideoSpeedViewModel cutVideoSpeedViewModel5 = this.f157026e;
        if (cutVideoSpeedViewModel5 == null) {
            C89219l.m154710a("speedViewModel");
        }
        cutVideoSpeedViewModel5.mo110755g().observe(this, new C70236f(this));
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20382b.C20383a.m38593a(this, vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.aw$b */
    static final class C70232b extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70230aw f157029a;

        static {
            Covode.recordClassIndex(82675);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70232b(C70230aw awVar) {
            super(2);
            this.f157029a = awVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            this.f157029a.f157024c = booleanValue;
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final View mo22702a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C89219l.m154721d(layoutInflater, "");
        C89219l.m154721d(viewGroup, "");
        View a = C1764a.m5927a(layoutInflater, R.layout.aru, viewGroup, false);
        C89219l.m154716b(a, "");
        return a;
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.scene.aw$c */
    static final class C70233c extends AbstractC89220m implements AbstractC89183m<AbstractC20382b, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C70230aw f157030a;

        static {
            Covode.recordClassIndex(82676);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C70233c(C70230aw awVar) {
            super(2);
            this.f157030a = awVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20382b bVar, Boolean bool) {
            int i;
            boolean booleanValue = bool.booleanValue();
            C89219l.m154721d(bVar, "");
            if (booleanValue) {
                this.f157030a.mo110865b();
            }
            DMTBgAnimRadioGroup a = C70230aw.m123956a(this.f157030a);
            if (booleanValue) {
                i = 0;
            } else {
                i = 8;
            }
            a.setVisibility(i);
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.scene.AbstractC22219j
    /* renamed from: a */
    public final void mo36473a(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.mo36473a(view, bundle);
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        this.f157027f = C45828d.m88452a(context, 163.0f);
        DMTBgAnimRadioGroup dMTBgAnimRadioGroup = (DMTBgAnimRadioGroup) view;
        this.f157023b = dMTBgAnimRadioGroup;
        if (dMTBgAnimRadioGroup == null) {
            C89219l.m154710a("speedView");
        }
        String c_ = mo36476c_(R.string.fyl);
        C89219l.m154716b(c_, "");
        dMTBgAnimRadioGroup.mo105718a(c_);
        String c_2 = mo36476c_(R.string.g29);
        C89219l.m154716b(c_2, "");
        dMTBgAnimRadioGroup.mo105718a(c_2);
        String c_3 = mo36476c_(R.string.brq);
        C89219l.m154716b(c_3, "");
        dMTBgAnimRadioGroup.mo105718a(c_3);
        DMTBgAnimRadioGroup dMTBgAnimRadioGroup2 = this.f157023b;
        if (dMTBgAnimRadioGroup2 == null) {
            C89219l.m154710a("speedView");
        }
        dMTBgAnimRadioGroup2.setCurrentItem(1);
        DMTBgAnimRadioGroup dMTBgAnimRadioGroup3 = this.f157023b;
        if (dMTBgAnimRadioGroup3 == null) {
            C89219l.m154710a("speedView");
        }
        dMTBgAnimRadioGroup3.setOnItemChangeListener(new C70237g(this));
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20382b.C20383a.m38583a(this, jediViewModel, ahVar, mVar);
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

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, A, B> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, AbstractC89290k<S, ? extends B> kVar2, C20370ah<C20374al<A, B>> ahVar, AbstractC89187q<? super AbstractC20477i, ? super A, ? super B, C89391z> qVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(kVar2, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(qVar, "");
        return AbstractC20382b.C20383a.m38585a(this, jediViewModel, kVar, kVar2, ahVar, qVar);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public <S extends AbstractC20368af, T> AbstractC88412b asyncSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends AbstractC20362a<? extends T>> kVar, C20370ah<C20373ak<AbstractC20362a<T>>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super Throwable, C89391z> mVar, AbstractC89172b<? super AbstractC20477i, C89391z> bVar, AbstractC89183m<? super AbstractC20477i, ? super T, C89391z> mVar2) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        return AbstractC20382b.C20383a.m38584a(this, jediViewModel, kVar, ahVar, mVar, bVar, mVar2);
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
}
