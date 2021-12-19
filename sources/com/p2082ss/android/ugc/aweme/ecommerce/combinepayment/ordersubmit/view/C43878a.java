package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view;

import android.os.Bundle;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtEditText;
import com.bytedance.jedi.arch.AbstractC20362a;
import com.bytedance.jedi.arch.AbstractC20367ae;
import com.bytedance.jedi.arch.AbstractC20368af;
import com.bytedance.jedi.arch.AbstractC20380ar;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.AbstractC20527q;
import com.bytedance.jedi.arch.AbstractC20534v;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.C20373ak;
import com.bytedance.jedi.arch.C20374al;
import com.bytedance.jedi.arch.C20375am;
import com.bytedance.jedi.arch.C20376an;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.tux.button.TuxButton;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.navigation.TuxNavBar;
import com.bytedance.tux.navigation.p1723a.C23187b;
import com.bytedance.tux.navigation.p1723a.C23194g;
import com.p2082ss.android.ugc.aweme.base.arch.C34499i;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel;
import com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.p2829a.C43732h;
import com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44294a;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45556c;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45571l;
import com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp;
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
import p4600h.p4622m.C89361p;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.a */
public final class C43878a extends C44294a implements AbstractC20380ar<C34499i>, AbstractC20527q {

    /* renamed from: b */
    public static final C43880b f102267b = new C43880b((byte) 0);

    /* renamed from: a */
    public final C34499i f102268a = new C34499i();

    /* renamed from: c */
    private final AbstractC89244h f102269c;

    /* renamed from: d */
    private long f102270d = SystemClock.elapsedRealtime();

    /* renamed from: e */
    private SparseArray f102271e;

    static {
        Covode.recordClassIndex(52160);
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44310e, com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44294a
    /* renamed from: a */
    public final View mo74087a(int i) {
        if (this.f102271e == null) {
            this.f102271e = new SparseArray();
        }
        View view = (View) this.f102271e.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f102271e.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44310e, com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44294a
    /* renamed from: a */
    public final void mo74088a() {
        SparseArray sparseArray = this.f102271e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: b */
    public final OrderSubmitViewModel mo74804b() {
        return (OrderSubmitViewModel) this.f102269c.getValue();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44310e, com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44294a
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo74088a();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.a$b */
    public static final class C43880b {
        static {
            Covode.recordClassIndex(52162);
        }

        private C43880b() {
        }

        public /* synthetic */ C43880b(byte b) {
            this();
        }
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20380ar
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C34499i mo33721d() {
        return this.f102268a;
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

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.a$e */
    static final class C43883e extends AbstractC89220m implements AbstractC89171a<C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43878a f102278a;

        static {
            Covode.recordClassIndex(52165);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43883e(C43878a aVar) {
            super(0);
            this.f102278a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C89391z invoke() {
            this.f102278a.dismissAllowingStateLoss();
            return C89391z.f203057a;
        }
    }

    public C43878a() {
        super((byte) 0);
        AbstractC89277c a = C89204ab.m154669a(OrderSubmitViewModel.class);
        this.f102269c = C89250i.m154773a((AbstractC89171a) new C43879a(this, a, a));
    }

    /* renamed from: c */
    public final void mo74805c() {
        TuxTextView tuxTextView = (TuxTextView) mo74087a(R.id.cjh);
        C89219l.m154716b(tuxTextView, "");
        tuxTextView.setText(getString(R.string.fu1, Integer.valueOf(((DmtEditText) mo74087a(R.id.cjg)).length())));
    }

    @Override // androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44294a
    public final void onDestroy() {
        super.onDestroy();
        C43732h.m86732a(mo74804b().f101794p, "return", (Boolean) null, (Boolean) null, mo74804b().mo74424j(), Long.valueOf(SystemClock.elapsedRealtime() - this.f102270d), "message", "order_submit", 268);
        C43732h.f101922b = SystemClock.elapsedRealtime();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.a$a */
    public static final class C43879a extends AbstractC89220m implements AbstractC89171a<OrderSubmitViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f102272a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89277c f102273b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f102274c;

        static {
            Covode.recordClassIndex(52161);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43879a(Fragment fragment, AbstractC89277c cVar, AbstractC89277c cVar2) {
            super(0);
            this.f102272a = fragment;
            this.f102273b = cVar;
            this.f102274c = cVar2;
        }

        /* JADX WARN: Type inference failed for: r0v9, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARN: Type inference failed for: r0v14, types: [com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 2 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.OrderSubmitViewModel invoke() {
            /*
                r4 = this;
                androidx.fragment.app.Fragment r0 = r4.f102272a
                androidx.fragment.app.Fragment r3 = r0.getParentFragment()
                h.k.c r0 = r4.f102274c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                java.lang.String r2 = r0.getName()
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r2, r0)
            L_0x0015:
                if (r3 == 0) goto L_0x0031
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a     // Catch:{ as -> 0x002a }
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3879a(r3, r0)     // Catch:{ as -> 0x002a }
                h.k.c r0 = r4.f102273b     // Catch:{ as -> 0x002a }
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)     // Catch:{ as -> 0x002a }
                androidx.lifecycle.ac r0 = m86785xc976e77b(r1, r2, r0)     // Catch:{ as -> 0x002a }
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0     // Catch:{ as -> 0x002a }
                goto L_0x002f
            L_0x002a:
                androidx.fragment.app.Fragment r3 = r3.getParentFragment()
                goto L_0x0015
            L_0x002f:
                if (r0 != 0) goto L_0x0049
            L_0x0031:
                androidx.fragment.app.Fragment r0 = r4.f102272a
                androidx.fragment.app.e r1 = r0.requireActivity()
                androidx.lifecycle.ad$b r0 = com.bytedance.jedi.arch.C20392e.f48284a
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3881a(r1, r0)
                h.k.c r0 = r4.f102273b
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r0 = m86785xc976e77b(r1, r2, r0)
                com.bytedance.jedi.arch.JediViewModel r0 = (com.bytedance.jedi.arch.JediViewModel) r0
            L_0x0049:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.C43878a.C43879a.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_combinepayment_ordersubmit_view_MessageEditDialogFragment$$special$$inlined$hostViewModel$1_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m86785xc976e77b(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.a$f */
    public static final class C43884f extends C45571l {

        /* renamed from: a */
        final /* synthetic */ C43878a f102279a;

        static {
            Covode.recordClassIndex(52166);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C43884f(C43878a aVar) {
            this.f102279a = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.ecommerce.util.C45571l
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            this.f102279a.mo74805c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.a$c */
    public static final class C43881c extends AbstractView$OnClickListenerC80259bp {

        /* renamed from: a */
        final /* synthetic */ long f102275a = 700;

        /* renamed from: b */
        final /* synthetic */ C43878a f102276b;

        static {
            Covode.recordClassIndex(52163);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C43881c(C43878a aVar) {
            super(700);
            this.f102276b = aVar;
        }

        @Override // com.p2082ss.android.ugc.aweme.utils.AbstractView$OnClickListenerC80259bp
        /* renamed from: a */
        public final void mo60873a(View view) {
            if (view != null) {
                C43732h.m86725a("save", "confirm", this.f102276b.mo74804b().mo74424j(), "message", (String) null, (Boolean) null, (String) null, (Boolean) null, 240);
                OrderSubmitViewModel b = this.f102276b.mo74804b();
                DmtEditText dmtEditText = (DmtEditText) this.f102276b.mo74087a(R.id.cjg);
                C89219l.m154716b(dmtEditText, "");
                String valueOf = String.valueOf(dmtEditText.getText());
                Objects.requireNonNull(valueOf, "null cannot be cast to non-null type kotlin.CharSequence");
                String obj = C89361p.m154910b((CharSequence) valueOf).toString();
                C89219l.m154721d(obj, "");
                b.mo33689c(new OrderSubmitViewModel.C43715y(obj));
                b.f101798t = obj;
                this.f102276b.dismissAllowingStateLoss();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.ordersubmit.view.a$d */
    static final class C43882d extends AbstractC89220m implements AbstractC89172b<Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C43878a f102277a;

        static {
            Covode.recordClassIndex(52164);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C43882d(C43878a aVar) {
            super(1);
            this.f102277a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(Boolean bool) {
            if (!bool.booleanValue() && ((DmtEditText) this.f102277a.mo74087a(R.id.cjg)).hasFocus()) {
                ((DmtEditText) this.f102277a.mo74087a(R.id.cjg)).clearFocus();
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        C89219l.m154721d(view, "");
        C43882d dVar = new C43882d(this);
        C89219l.m154721d(dVar, "");
        this.f103306h = dVar;
        TuxNavBar.C23179a aVar = new TuxNavBar.C23179a();
        C23194g gVar = new C23194g();
        String string = getString(R.string.fui);
        C89219l.m154716b(string, "");
        TuxNavBar.C23179a a = aVar.mo37731a(gVar.mo37753a(string));
        C23187b a2 = new C23187b().mo37738a(R.raw.icon_x_mark_small);
        a2.f54930b = true;
        ((TuxNavBar) mo74087a(R.id.cjj)).setNavActions(a.mo37733b(a2.mo37741a((AbstractC89171a<C89391z>) new C43883e(this))));
        C43732h.m86724a("save", "confirm", mo74804b().mo74424j(), "message", (String) null, (Boolean) null, 112);
        ((TuxNavBar) mo74087a(R.id.cjj)).mo37727a(true);
        TuxButton tuxButton = (TuxButton) mo74087a(R.id.cji);
        C89219l.m154716b(tuxButton, "");
        tuxButton.setOnClickListener(new C43881c(this));
        C45556c.m88106a((EditText) mo74087a(R.id.cjg), 200);
        ((DmtEditText) mo74087a(R.id.cjg)).addTextChangedListener(new C43884f(this));
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString("message")) == null) {
            str = "";
        }
        C89219l.m154716b(str, "");
        ((DmtEditText) mo74087a(R.id.cjg)).setText(str);
        mo74805c();
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af> AbstractC88412b subscribe(JediViewModel<S> jediViewModel, C20370ah<S> ahVar, AbstractC89183m<? super AbstractC20477i, ? super S, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38708a(this, jediViewModel, ahVar, mVar);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        C43732h.m86715a(false, mo74804b().mo74424j(), "message", "order_submit", null, null, null, 112);
        mo74804b().mo74425k();
        return C1764a.m5927a(layoutInflater, R.layout.rg, viewGroup, false);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <S extends AbstractC20368af, A> AbstractC88412b selectSubscribe(JediViewModel<S> jediViewModel, AbstractC89290k<S, ? extends A> kVar, C20370ah<C20373ak<A>> ahVar, AbstractC89183m<? super AbstractC20477i, ? super A, C89391z> mVar) {
        C89219l.m154721d(jediViewModel, "");
        C89219l.m154721d(kVar, "");
        C89219l.m154721d(ahVar, "");
        C89219l.m154721d(mVar, "");
        return AbstractC20527q.C20528a.m38709a(this, jediViewModel, kVar, ahVar, mVar);
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
