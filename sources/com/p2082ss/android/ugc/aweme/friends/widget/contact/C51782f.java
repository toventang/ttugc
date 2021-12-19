package com.p2082ss.android.ugc.aweme.friends.widget.contact;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC1214u;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.searchbar.AbstractC17247a;
import com.bytedance.ies.dmt.p1194ui.searchbar.SearchBar;
import com.bytedance.ies.foundation.fragment.C17372a;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.friends.widget.contact.p3025vm.EnumC51806a;
import com.p2082ss.android.ugc.aweme.friends.widget.contact.p3025vm.EnumC51807b;
import com.p2082ss.android.ugc.aweme.friends.widget.contact.p3025vm.SearchContactVM;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Objects;
import kotlinx.coroutines.AbstractC89568bz;
import kotlinx.coroutines.C89624i;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89378p;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.friends.widget.contact.f */
public final class C51782f extends C17372a implements KeyboardUtils.AbstractC34711a, AbstractC51779c {

    /* renamed from: f */
    public static final C51783a f119342f = new C51783a((byte) 0);

    /* renamed from: e */
    public C51780d f119343e;

    /* renamed from: g */
    private final AbstractC89244h f119344g = C89250i.m154773a((AbstractC89171a) new C51788e(this));

    /* renamed from: h */
    private final Handler f119345h = new Handler(Looper.getMainLooper());

    /* renamed from: i */
    private SparseArray f119346i;

    /* renamed from: com.ss.android.ugc.aweme.friends.widget.contact.f$g */
    static final class View$OnClickListenerC51790g implements View.OnClickListener {

        /* renamed from: a */
        public static final View$OnClickListenerC51790g f119353a = new View$OnClickListenerC51790g();

        static {
            Covode.recordClassIndex(61155);
        }

        View$OnClickListenerC51790g() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(61147);
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    /* renamed from: a */
    public final View mo27715a(int i) {
        if (this.f119346i == null) {
            this.f119346i = new SparseArray();
        }
        View view = (View) this.f119346i.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f119346i.put(i, findViewById);
        return findViewById;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a
    public final void bx_() {
        SparseArray sparseArray = this.f119346i;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: d */
    public final SearchContactVM mo87511d() {
        return (SearchContactVM) this.f119344g.getValue();
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        bx_();
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.widget.contact.f$a */
    public static final class C51783a {
        static {
            Covode.recordClassIndex(61148);
        }

        private C51783a() {
        }

        /* renamed from: com.ss.android.ugc.aweme.friends.widget.contact.f$a$a */
        public static final class C51784a extends AbstractC89220m implements AbstractC89172b<C51782f, C89391z> {

            /* renamed from: a */
            public static final C51784a f119347a = new C51784a();

            static {
                Covode.recordClassIndex(61149);
            }

            C51784a() {
                super(1);
            }

            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(C51782f fVar) {
                C89219l.m154721d(fVar, "");
                return C89391z.f203057a;
            }
        }

        public /* synthetic */ C51783a(byte b) {
            this();
        }

        /* renamed from: a */
        public static C51782f m96477a(AbstractC89172b<? super C51782f, C89391z> bVar) {
            C89219l.m154721d(bVar, "");
            C51782f fVar = new C51782f();
            bVar.invoke(fVar);
            return fVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.widget.contact.f$i */
    public static final class C51792i extends AbstractC17247a {

        /* renamed from: a */
        final /* synthetic */ C51782f f119355a;

        static {
            Covode.recordClassIndex(61157);
        }

        @Override // com.bytedance.ies.dmt.p1194ui.searchbar.AbstractC17248b, com.bytedance.ies.dmt.p1194ui.searchbar.AbstractC17247a
        /* renamed from: a */
        public final void mo27294a() {
            this.f119355a.mo87511d().mo87528c();
        }

        C51792i(C51782f fVar) {
            this.f119355a = fVar;
        }

        @Override // com.bytedance.ies.dmt.p1194ui.searchbar.AbstractC17248b, com.bytedance.ies.dmt.p1194ui.searchbar.AbstractC17247a
        /* renamed from: a */
        public final void mo27295a(String str) {
            if (str != null) {
                if (str.length() > 0 && (this.f119355a.mo87513f() == EnumC51807b.ON_SHOW || this.f119355a.mo87513f() == EnumC51807b.ON_SEARCH_END)) {
                    this.f119355a.mo87511d().f119386c.setValue(EnumC51807b.ON_SEARCH_START);
                } else if (str.length() == 0 && this.f119355a.mo87513f() == EnumC51807b.ON_SEARCH_START) {
                    this.f119355a.mo87511d().mo87528c();
                }
                SearchContactVM d = this.f119355a.mo87511d();
                C89219l.m154721d(str, "");
                AbstractC89568bz unused = C89624i.m155555a(d.f119363b, null, null, new SearchContactVM.C51802b(d, str, null), 3);
            }
        }

        @Override // com.bytedance.ies.dmt.p1194ui.searchbar.AbstractC17248b, com.bytedance.ies.dmt.p1194ui.searchbar.AbstractC17247a
        /* renamed from: a */
        public final void mo27296a(boolean z, String str) {
            if (z) {
                this.f119355a.mo87511d();
                C39162r.m79452a().execute(SearchContactVM.RunnableC51804c.f119397a);
            }
        }
    }

    /* renamed from: f */
    public final EnumC51807b mo87513f() {
        return mo87511d().f119388e.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.widget.contact.f$d */
    static final class RunnableC51787d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C51782f f119350a;

        static {
            Covode.recordClassIndex(61152);
        }

        RunnableC51787d(C51782f fVar) {
            this.f119350a = fVar;
        }

        public final void run() {
            View e;
            if (this.f119350a.mo87513f() == EnumC51807b.ON_SEARCH_START && (e = this.f119350a.mo87512e()) != null) {
                e.requestFocus();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.friends.widget.contact.f$e */
    public static final class C51788e extends AbstractC89220m implements AbstractC89171a<SearchContactVM> {

        /* renamed from: a */
        final /* synthetic */ C51782f f119351a;

        static {
            Covode.recordClassIndex(61153);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C51788e(C51782f fVar) {
            super(0);
            this.f119351a = fVar;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.ac, java.lang.Object, com.ss.android.ugc.aweme.friends.widget.contact.vm.SearchContactVM] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ com.p2082ss.android.ugc.aweme.friends.widget.contact.p3025vm.SearchContactVM invoke() {
            /*
                r3 = this;
                com.ss.android.ugc.aweme.friends.widget.contact.f r1 = r3.f119351a
                java.lang.String r2 = ""
                p4600h.p4611f.p4613b.C89219l.m154721d(r1, r2)
                r0 = 0
                androidx.lifecycle.ad r1 = androidx.lifecycle.C1181ae.m3879a(r1, r0)
                java.lang.Class<com.ss.android.ugc.aweme.friends.widget.contact.vm.SearchContactVM> r0 = com.p2082ss.android.ugc.aweme.friends.widget.contact.p3025vm.SearchContactVM.class
                androidx.lifecycle.ac r0 = r1.mo3983a(r0)
                p4600h.p4611f.p4613b.C89219l.m154716b(r0, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.friends.widget.contact.C51782f.C51788e.invoke():java.lang.Object");
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.widget.contact.AbstractC51779c
    /* renamed from: a */
    public final void mo87503a() {
        if (this.f41692a && mo87513f() != EnumC51807b.ON_HIDE) {
            mo87511d().mo87527b();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils.AbstractC34711a
    /* renamed from: b */
    public final void mo61027b() {
        if (mo87513f() == EnumC51807b.ON_SHOW || mo87513f() == EnumC51807b.ON_SEARCH_START) {
            this.f119345h.removeCallbacksAndMessages(null);
        }
    }

    /* renamed from: e */
    public final View mo87512e() {
        ViewParent viewParent;
        View view = getView();
        View view2 = null;
        if (view != null) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        if (viewParent instanceof View) {
            view2 = viewParent;
        }
        return view2;
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, com.p2082ss.android.ugc.aweme.base.utils.KeyboardUtils.AbstractC34711a
    /* renamed from: c */
    public final void mo64296c() {
        if (mo87513f() == EnumC51807b.ON_SHOW || mo87513f() == EnumC51807b.ON_SEARCH_START) {
            this.f119345h.removeCallbacksAndMessages(null);
            this.f119345h.postDelayed(new RunnableC51787d(this), 300);
        }
    }

    /* renamed from: b */
    public final void mo87510b(int i) {
        View e;
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        View e2 = mo87512e();
        if ((e2 == null || (layoutParams2 = e2.getLayoutParams()) == null || layoutParams2.height != i) && (e = mo87512e()) != null) {
            View e3 = mo87512e();
            if (e3 == null || (layoutParams = e3.getLayoutParams()) == null) {
                layoutParams = null;
            } else {
                layoutParams.height = i;
            }
            e.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.widget.contact.f$b */
    static final class C51785b<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C51782f f119348a;

        static {
            Covode.recordClassIndex(61150);
        }

        C51785b(C51782f fVar) {
            this.f119348a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            C89378p pVar = (C89378p) obj;
            List<T> list = (List) pVar.component2();
            list.size();
            int i = C51794g.f119359a[((EnumC51806a) pVar.component1()).ordinal()];
            if (i == 1) {
                C51782f fVar = this.f119348a;
                RecyclerView recyclerView = (RecyclerView) fVar.mo27715a(R.id.dqm);
                C89219l.m154716b(recyclerView, "");
                recyclerView.setVisibility(8);
                TuxTextView tuxTextView = (TuxTextView) fVar.mo27715a(R.id.dql);
                C89219l.m154716b(tuxTextView, "");
                tuxTextView.setVisibility(0);
            } else if (i == 2) {
                C51782f fVar2 = this.f119348a;
                TuxTextView tuxTextView2 = (TuxTextView) fVar2.mo27715a(R.id.dql);
                C89219l.m154716b(tuxTextView2, "");
                tuxTextView2.setVisibility(8);
                RecyclerView recyclerView2 = (RecyclerView) fVar2.mo27715a(R.id.dqm);
                C89219l.m154716b(recyclerView2, "");
                recyclerView2.setVisibility(0);
                C51780d dVar = this.f119348a.f119343e;
                if (dVar == null) {
                    C89219l.m154710a("inviteContactAdapter");
                }
                dVar.mo5018a(list);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.widget.contact.f$h */
    static final class C51791h<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C51782f f119354a;

        static {
            Covode.recordClassIndex(61156);
        }

        C51791h(C51782f fVar) {
            this.f119354a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            Boolean bool = (Boolean) obj;
            C89219l.m154716b(bool, "");
            if (bool.booleanValue()) {
                ((TuxStatusView) this.f119354a.mo27715a(R.id.dqo)).mo37867a();
                TuxStatusView tuxStatusView = (TuxStatusView) this.f119354a.mo27715a(R.id.dqo);
                C89219l.m154716b(tuxStatusView, "");
                tuxStatusView.setVisibility(0);
                return;
            }
            ((TuxStatusView) this.f119354a.mo27715a(R.id.dqo)).mo37867a();
            TuxStatusView tuxStatusView2 = (TuxStatusView) this.f119354a.mo27715a(R.id.dqo);
            C89219l.m154716b(tuxStatusView2, "");
            tuxStatusView2.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.widget.contact.f$j */
    public static final class C51793j implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C51782f f119356a;

        /* renamed from: b */
        final /* synthetic */ WeakReference f119357b;

        /* renamed from: c */
        final /* synthetic */ boolean f119358c;

        static {
            Covode.recordClassIndex(61158);
        }

        C51793j(C51782f fVar, WeakReference weakReference, boolean z) {
            this.f119356a = fVar;
            this.f119357b = weakReference;
            this.f119358c = z;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view = (View) this.f119357b.get();
            if (view != null) {
                C89219l.m154716b(view, "");
                C89219l.m154716b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                float floatValue = ((Float) animatedValue).floatValue();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                Resources system = Resources.getSystem();
                C89219l.m154709a((Object) system, "");
                layoutParams.height = C89241a.m154730a(TypedValue.applyDimension(1, 44.0f * floatValue, system.getDisplayMetrics()));
                view.setLayoutParams(layoutParams);
                view.setAlpha(floatValue);
                if (floatValue == 0.0f && this.f119358c) {
                    view.setVisibility(8);
                    View e = this.f119356a.mo87512e();
                    if (e != null) {
                        e.setVisibility(8);
                    }
                }
            }
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.friends.widget.contact.AbstractC51779c
    /* renamed from: a */
    public final void mo87504a(List<? extends AbstractC51770a> list) {
        C89219l.m154721d(list, "");
        if (this.f41692a && mo87513f() == EnumC51807b.ON_HIDE) {
            mo87511d().mo87526a(list);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.widget.contact.f$c */
    static final class C51786c<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ C51782f f119349a;

        static {
            Covode.recordClassIndex(61151);
        }

        C51786c(C51782f fVar) {
            this.f119349a = fVar;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            EnumC51807b bVar = (EnumC51807b) obj;
            if (bVar != null) {
                int i = C51794g.f119360b[bVar.ordinal()];
                if (i == 1) {
                    this.f119349a.mo87510b(-2);
                    this.f119349a.mo87509a(false);
                    FrameLayout frameLayout = (FrameLayout) this.f119349a.mo27715a(R.id.dqn);
                    C89219l.m154716b(frameLayout, "");
                    frameLayout.setVisibility(8);
                } else if (i == 2) {
                    this.f119349a.mo87510b(-2);
                    this.f119349a.mo87509a(true);
                    FrameLayout frameLayout2 = (FrameLayout) this.f119349a.mo27715a(R.id.dqn);
                    C89219l.m154716b(frameLayout2, "");
                    frameLayout2.setVisibility(8);
                } else if (i == 3) {
                    this.f119349a.mo87510b(-1);
                    View e = this.f119349a.mo87512e();
                    if (e != null) {
                        e.setVisibility(0);
                    }
                    FrameLayout frameLayout3 = (FrameLayout) this.f119349a.mo27715a(R.id.dqn);
                    C89219l.m154716b(frameLayout3, "");
                    frameLayout3.setVisibility(0);
                } else if (i == 4) {
                    this.f119349a.mo87510b(-2);
                    View e2 = this.f119349a.mo87512e();
                    if (e2 != null) {
                        e2.setVisibility(0);
                    }
                    FrameLayout frameLayout4 = (FrameLayout) this.f119349a.mo27715a(R.id.dqn);
                    C89219l.m154716b(frameLayout4, "");
                    frameLayout4.setVisibility(8);
                    ((SearchBar) this.f119349a.mo27715a(R.id.dqj)).mo27285c();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo87509a(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        if (!z) {
            View e = mo87512e();
            if (e != null) {
                e.setVisibility(0);
            }
            SearchBar searchBar = (SearchBar) mo27715a(R.id.dqj);
            C89219l.m154716b(searchBar, "");
            searchBar.setVisibility(0);
        }
        WeakReference weakReference = new WeakReference(mo27715a(R.id.dqj));
        ValueAnimator ofFloat = ObjectAnimator.ofFloat(f, 1.0f - f);
        ofFloat.addUpdateListener(new C51793j(this, weakReference, z));
        ofFloat.setDuration(150L).start();
    }

    @Override // com.bytedance.ies.foundation.fragment.C17372a, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        ((SearchBar) mo27715a(R.id.dqj)).setSearchBarEventHandler(new C51792i(this));
        RecyclerView recyclerView = (RecyclerView) mo27715a(R.id.dqm);
        C89219l.m154716b(recyclerView, "");
        requireContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        C51780d dVar = new C51780d(this, mo87511d());
        this.f119343e = dVar;
        dVar.f119337d = new C51791h(this);
        RecyclerView recyclerView2 = (RecyclerView) mo27715a(R.id.dqm);
        C89219l.m154716b(recyclerView2, "");
        C51780d dVar2 = this.f119343e;
        if (dVar2 == null) {
            C89219l.m154710a("inviteContactAdapter");
        }
        recyclerView2.setAdapter(dVar2);
        RecyclerView recyclerView3 = (RecyclerView) mo27715a(R.id.dqm);
        C89219l.m154716b(recyclerView3, "");
        recyclerView3.setItemAnimator(null);
        View e = mo87512e();
        if (e != null) {
            e.setOnKeyListener(new View$OnKeyListenerC51789f(this));
        }
        View e2 = mo87512e();
        if (e2 != null) {
            e2.setOnClickListener(View$OnClickListenerC51790g.f119353a);
        }
        KeyboardUtils.m70895a(this, getView(), this);
        mo87511d().f119389f.observe(this, new C51785b(this));
        mo87511d().f119388e.observe(this, new C51786c(this));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.a2u, viewGroup, false);
    }

    /* renamed from: com.ss.android.ugc.aweme.friends.widget.contact.f$f */
    static final class View$OnKeyListenerC51789f implements View.OnKeyListener {

        /* renamed from: a */
        final /* synthetic */ C51782f f119352a;

        static {
            Covode.recordClassIndex(61154);
        }

        View$OnKeyListenerC51789f(C51782f fVar) {
            this.f119352a = fVar;
        }

        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            C89219l.m154721d(view, "");
            C89219l.m154721d(keyEvent, "");
            keyEvent.getAction();
            if (i != 4 || keyEvent.getAction() != 1 || this.f119352a.mo87513f() != EnumC51807b.ON_SEARCH_START) {
                return false;
            }
            this.f119352a.mo87511d().mo87528c();
            return true;
        }
    }
}
