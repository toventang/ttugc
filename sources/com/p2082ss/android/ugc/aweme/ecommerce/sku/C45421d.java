package com.p2082ss.android.ugc.aweme.ecommerce.sku;

import android.app.Dialog;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import androidx.core.app.ActivityC0580d;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1204m;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.C13849d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
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
import com.bytedance.platform.godzilla.p1575b.p1583b.C21708b;
import com.p2082ss.android.ugc.aweme.base.arch.C34499i;
import com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44294a;
import com.p2082ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.p2082ss.android.ugc.aweme.ecommerce.router.AbstractC45262h;
import com.p2082ss.android.ugc.aweme.ecommerce.router.AbstractC45271m;
import com.p2082ss.android.ugc.aweme.ecommerce.router.C45263i;
import com.p2082ss.android.ugc.aweme.ecommerce.router.StrategyService;
import com.p2082ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.SkuPanelStarter;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.p2860b.AbstractC45390a;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.p2860b.C45391b;
import com.p2082ss.android.ugc.aweme.ecommerce.sku.p2860b.C45393c;
import com.p2082ss.android.ugc.aweme.ecommerce.util.KeyBoardVisibilityUtil;
import com.p2082ss.android.ugc.aweme.lancet.C58027i;
import com.p2082ss.android.ugc.aweme.utils.C80342dg;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
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
import p4600h.p4620k.AbstractC89290k;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.d */
public final class C45421d extends C44294a implements AbstractC20380ar<C34499i>, AbstractC20527q {

    /* renamed from: c */
    public static final C45422a f105828c = new C45422a((byte) 0);

    /* renamed from: a */
    public final C34499i f105829a = new C34499i();

    /* renamed from: b */
    public KeyBoardVisibilityUtil f105830b;

    /* renamed from: d */
    private final AbstractC89244h f105831d = C89250i.m154773a((AbstractC89171a) new C45425d(this));

    /* renamed from: e */
    private SparseArray f105832e;

    static {
        Covode.recordClassIndex(53895);
    }

    /* renamed from: b */
    private final AbstractC45390a m87993b() {
        return (AbstractC45390a) this.f105831d.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44310e, com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44294a
    /* renamed from: a */
    public final View mo74087a(int i) {
        if (this.f105832e == null) {
            this.f105832e = new SparseArray();
        }
        View view = (View) this.f105832e.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f105832e.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44310e, com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44294a
    /* renamed from: a */
    public final void mo74088a() {
        SparseArray sparseArray = this.f105832e;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.d$a */
    public static final class C45422a {
        static {
            Covode.recordClassIndex(53896);
        }

        private C45422a() {
        }

        public /* synthetic */ C45422a(byte b) {
            this();
        }
    }

    /* Return type fixed from 'androidx.lifecycle.ad$b' to match base method */
    @Override // com.bytedance.jedi.arch.AbstractC20380ar
    /* renamed from: d */
    public final /* bridge */ /* synthetic */ C34499i mo33721d() {
        return this.f105829a;
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

    @Override // com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44310e
    /* renamed from: e */
    public final AbstractC45271m mo75221e() {
        return m87993b();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        m87993b().mo76509d();
    }

    public C45421d() {
        super((byte) 0);
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44310e, com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44294a
    public final void onDestroyView() {
        super.onDestroyView();
        m87993b().mo76508c();
        int i = Build.VERSION.SDK_INT;
        KeyBoardVisibilityUtil keyBoardVisibilityUtil = this.f105830b;
        if (keyBoardVisibilityUtil != null) {
            keyBoardVisibilityUtil.mo76761a();
        }
        this.f105830b = null;
        mo74088a();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.d$d */
    static final class C45425d extends AbstractC89220m implements AbstractC89171a<AbstractC45390a> {

        /* renamed from: a */
        final /* synthetic */ C45421d f105835a;

        static {
            Covode.recordClassIndex(53899);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45425d(C45421d dVar) {
            super(0);
            this.f105835a = dVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AbstractC45390a invoke() {
            Uri uri;
            AbstractC45262h b = StrategyService.m87825b().mo76330a().mo76349a(new AbstractC89171a<AbstractC45271m>(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.sku.C45421d.C45425d.C454261 */

                /* renamed from: a */
                final /* synthetic */ C45425d f105836a;

                static {
                    Covode.recordClassIndex(53900);
                }

                {
                    this.f105836a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ AbstractC45271m invoke() {
                    return new C45393c(this.f105836a.f105835a);
                }
            }).mo76351b(new AbstractC89171a<AbstractC45271m>(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.sku.C45421d.C45425d.C454272 */

                /* renamed from: a */
                final /* synthetic */ C45425d f105837a;

                static {
                    Covode.recordClassIndex(53901);
                }

                {
                    this.f105837a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // p4600h.p4611f.p4612a.AbstractC89171a
                public final /* synthetic */ AbstractC45271m invoke() {
                    return new C45391b(this.f105837a.f105835a);
                }
            });
            Bundle arguments = this.f105835a.getArguments();
            if (arguments != null) {
                uri = (Uri) arguments.getParcelable("uri");
            } else {
                uri = null;
            }
            return C45263i.m87840a(b, uri);
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44294a
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m87993b().mo76505a();
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.appcompat.app.C0242i, com.google.android.material.bottomsheet.C26614b, com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44310e
    public final Dialog onCreateDialog(Bundle bundle) {
        Context context = getContext();
        if (context == null) {
            C89219l.m154715b();
        }
        C89219l.m154716b(context, "");
        DialogC45382a aVar = new DialogC45382a(context, getTheme());
        aVar.mo75219a(m87993b());
        return aVar;
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        C89219l.m154721d(bundle, "");
        super.onSaveInstanceState(bundle);
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            AbstractC45390a b = m87993b();
            C89219l.m154716b(activity, "");
            b.mo76359b(activity, bundle);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.d$c */
    static final class View$OnClickListenerC45424c implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C45421d f105834a;

        static {
            Covode.recordClassIndex(53898);
        }

        View$OnClickListenerC45424c(C45421d dVar) {
            this.f105834a = dVar;
        }

        public final void onClick(View view) {
            Object obj;
            ClickAgent.onClick(view);
            KeyBoardVisibilityUtil keyBoardVisibilityUtil = this.f105834a.f105830b;
            if (keyBoardVisibilityUtil == null) {
                return;
            }
            if (keyBoardVisibilityUtil.f106081a) {
                Context context = this.f105834a.getContext();
                IBinder iBinder = null;
                if (context != null) {
                    obj = m87998a(context, "input_method");
                } else {
                    obj = null;
                }
                Objects.requireNonNull(obj, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                InputMethodManager inputMethodManager = (InputMethodManager) obj;
                View view2 = this.f105834a.getView();
                if (view2 != null) {
                    iBinder = view2.getWindowToken();
                }
                inputMethodManager.hideSoftInputFromWindow(iBinder, 0);
                IEventCenter a = EventCenter.m87158a();
                String b = C80342dg.m139300a().mo46674b(new SkuPanelStarter.SkuKeyboardVisibilityParams(false));
                C89219l.m154716b(b, "");
                a.mo75479a("ec_sku_panel_keyboard_show", b);
                return;
            }
            this.f105834a.dismiss();
        }

        /* renamed from: a */
        private static Object m87998a(Context context, String str) {
            Object obj;
            MethodCollector.m26663i(8050);
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!C58027i.f132247b && "connectivity".equals(str)) {
                    try {
                        new C21708b().mo35361a();
                        C58027i.f132247b = true;
                        obj = context.getSystemService(str);
                    } catch (Throwable unused) {
                    }
                }
                obj = context.getSystemService(str);
            } else if (C58027i.f132246a) {
                synchronized (ClipboardManager.class) {
                    try {
                        obj = context.getSystemService(str);
                        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                            try {
                                Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                                declaredField.setAccessible(true);
                                declaredField.set(obj, new C58027i.HandlerC58028a((Handler) declaredField.get(obj)));
                            } catch (Exception e) {
                                C13849d.m25015a(e, "ClipboardManager Handler Reflect Fail");
                            }
                        }
                        C58027i.f132246a = false;
                    } finally {
                        MethodCollector.m26664o(8050);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }
    }

    @Override // androidx.fragment.app.DialogInterface$OnCancelListenerC0944d, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44294a
    public final void onActivityCreated(Bundle bundle) {
        ViewParent viewParent;
        View findViewById;
        ViewParent parent;
        super.onActivityCreated(bundle);
        m87993b().mo76507b();
        ActivityC0945e activity = getActivity();
        if (activity != null) {
            AbstractC45390a b = m87993b();
            C89219l.m154716b(activity, "");
            b.mo76357a(activity, bundle);
        }
        Context context = getContext();
        View view = null;
        if (!(context instanceof ActivityC0580d)) {
            context = null;
        }
        ActivityC0580d dVar = (ActivityC0580d) context;
        if (dVar != null) {
            this.f105830b = new KeyBoardVisibilityUtil(dVar, C45423b.f105833a);
        }
        View view2 = getView();
        if (view2 == null || (parent = view2.getParent()) == null) {
            viewParent = null;
        } else {
            viewParent = parent.getParent();
        }
        if (viewParent instanceof View) {
            view = viewParent;
        }
        View view3 = view;
        if (view3 != null && (findViewById = view3.findViewById(R.id.emn)) != null) {
            findViewById.setOnClickListener(new View$OnClickListenerC45424c(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        m87993b().mo76506a(view);
    }

    @Override // com.bytedance.jedi.arch.AbstractC20468h
    public final <VM1 extends JediViewModel<S1>, S1 extends AbstractC20368af, R> R withState(VM1 vm1, AbstractC89172b<? super S1, ? extends R> bVar) {
        C89219l.m154721d(vm1, "");
        C89219l.m154721d(bVar, "");
        return (R) AbstractC20527q.C20528a.m38714a(vm1, bVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.sku.d$b */
    static final class C45423b extends AbstractC89220m implements AbstractC89183m<Boolean, Integer, C89391z> {

        /* renamed from: a */
        public static final C45423b f105833a = new C45423b();

        static {
            Covode.recordClassIndex(53897);
        }

        C45423b() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(Boolean bool, Integer num) {
            boolean booleanValue = bool.booleanValue();
            num.intValue();
            IEventCenter a = EventCenter.m87158a();
            String b = C80342dg.m139300a().mo46674b(new SkuPanelStarter.SkuKeyboardVisibilityParams(booleanValue));
            C89219l.m154716b(b, "");
            a.mo75479a("ec_sku_panel_keyboard_show", b);
            return C89391z.f203057a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return m87993b().mo76504a(layoutInflater, viewGroup);
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
