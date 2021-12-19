package com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.pages;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.sticker.p3954d.AbstractC75300d;
import com.p2082ss.android.ugc.aweme.sticker.presenter.AbstractC75655o;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.AbstractC76151g;
import com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.p4015a.AbstractC76225f;
import com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76125l;
import com.p2082ss.android.ugc.effectmanager.effect.model.Effect;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.AbstractC85027b;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.C85029d;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.C85030e;
import com.p2082ss.android.ugc.tools.view.widget.p4368b.EnumC85026a;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p4560f.p4561a.AbstractC88979t;
import p4560f.p4561a.p4591l.C88960c;
import p4600h.C89378p;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.a */
public abstract class AbstractC76255a<ADAPTER extends AbstractC76225f<Effect>> extends Fragment implements AbstractC76268d<Fragment> {

    /* renamed from: a */
    protected RecyclerView f171301a;

    /* renamed from: b */
    protected LinearLayoutManager f171302b;

    /* renamed from: c */
    protected AbstractC85027b<EnumC85026a> f171303c;

    /* renamed from: d */
    public ADAPTER f171304d;

    /* renamed from: e */
    public int f171305e;

    /* renamed from: f */
    public RecyclerView.RecycledViewPool f171306f;

    /* renamed from: g */
    protected AbstractC76125l.C76126a f171307g;

    /* renamed from: h */
    protected AbstractC76125l.C76127b f171308h;

    /* renamed from: i */
    public boolean f171309i;

    /* renamed from: j */
    public final C88960c<Integer> f171310j;

    /* renamed from: k */
    public int f171311k = 10;

    /* renamed from: l */
    private AbstractC75655o f171312l;

    /* renamed from: m */
    private boolean f171313m;

    /* renamed from: n */
    private boolean f171314n;

    static {
        Covode.recordClassIndex(89206);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo119982j() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract void mo119983k();

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractC76268d
    /* renamed from: l */
    public final /* bridge */ /* synthetic */ Fragment mo119984l() {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final boolean mo119985m() {
        if (this.f171312l != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final RecyclerView mo119971a() {
        RecyclerView recyclerView = this.f171301a;
        if (recyclerView == null) {
            C89219l.m154710a("recyclerView");
        }
        return recyclerView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final LinearLayoutManager mo119974b() {
        LinearLayoutManager linearLayoutManager = this.f171302b;
        if (linearLayoutManager == null) {
            C89219l.m154710a("layoutManager");
        }
        return linearLayoutManager;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final AbstractC85027b<EnumC85026a> mo119976c() {
        AbstractC85027b<EnumC85026a> bVar = this.f171303c;
        if (bVar == null) {
            C89219l.m154710a("statusView");
        }
        return bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final AbstractC75300d mo119978e() {
        AbstractC76125l.C76127b bVar = this.f171308h;
        if (bVar == null) {
            C89219l.m154710a("requiredDependency");
        }
        return bVar.f171025b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final AbstractC76151g mo119979f() {
        AbstractC76125l.C76127b bVar = this.f171308h;
        if (bVar == null) {
            C89219l.m154710a("requiredDependency");
        }
        return bVar.f171028e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final AbstractC76125l.C76126a mo119980g() {
        AbstractC76125l.C76126a aVar = this.f171307g;
        if (aVar == null) {
            C89219l.m154710a("optionalDependency");
        }
        return aVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76118e
    /* renamed from: h */
    public final AbstractC88979t<Integer> mo119144h() {
        AbstractC88979t<Integer> c = this.f171310j.mo143283c();
        C89219l.m154716b(c, "");
        return c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final AbstractC76125l.C76127b mo119981i() {
        AbstractC76125l.C76127b bVar = this.f171308h;
        if (bVar == null) {
            C89219l.m154710a("requiredDependency");
        }
        return bVar;
    }

    public AbstractC76255a() {
        C88960c<Integer> cVar = new C88960c<>();
        C89219l.m154716b(cVar, "");
        this.f171310j = cVar;
    }

    /* renamed from: d */
    public final AbstractC75655o mo119977d() {
        AbstractC75655o oVar = this.f171312l;
        if (oVar != null) {
            return oVar;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        if (mo119985m()) {
            RecyclerView recyclerView = this.f171301a;
            if (recyclerView == null) {
                C89219l.m154710a("recyclerView");
            }
            recyclerView.mo4452f();
            RecyclerView recyclerView2 = this.f171301a;
            if (recyclerView2 == null) {
                C89219l.m154710a("recyclerView");
            }
            recyclerView2.mo4422c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.a$a */
    public static final class C76256a extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        final /* synthetic */ AbstractC76255a f171315a;

        static {
            Covode.recordClassIndex(89207);
        }

        C76256a(AbstractC76255a aVar) {
            this.f171315a = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            this.f171315a.f171310j.onNext(Integer.valueOf(i));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.a$d */
    public static final class C76260d extends AbstractC89220m implements AbstractC89172b<ViewGroup, View> {

        /* renamed from: a */
        final /* synthetic */ AbstractC76255a f171319a;

        static {
            Covode.recordClassIndex(89211);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76260d(AbstractC76255a aVar) {
            super(1);
            this.f171319a = aVar;
        }

        /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.a$d$a */
        static final class View$OnClickListenerC76263a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C76260d f171322a;

            static {
                Covode.recordClassIndex(89214);
            }

            View$OnClickListenerC76263a(C76260d dVar) {
                this.f171322a = dVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f171322a.f171319a.mo119983k();
            }
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ View invoke(ViewGroup viewGroup) {
            AbstractC89172b<? super ViewGroup, ? extends C89378p<? extends View, ? extends View>> bVar;
            C89378p pVar;
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            if (!(!this.f171319a.mo119985m() || (bVar = this.f171319a.mo119981i().f171029f.f169832f) == null || (pVar = (C89378p) bVar.invoke(viewGroup2)) == null)) {
                Object component1 = pVar.component1();
                ((View) pVar.component2()).setOnClickListener(new View$OnClickListenerC76263a(this));
                if (component1 != null) {
                    return component1;
                }
            }
            return C85030e.m146191a(viewGroup2, new AbstractC89187q<TextView, TextView, TextView, C89391z>(this) {
                /* class com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractC76255a.C76260d.C762611 */

                /* renamed from: a */
                final /* synthetic */ C76260d f171320a;

                static {
                    Covode.recordClassIndex(89212);
                }

                {
                    this.f171320a = r2;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
                @Override // p4600h.p4611f.p4612a.AbstractC89187q
                public final /* synthetic */ C89391z invoke(TextView textView, TextView textView2, TextView textView3) {
                    TextView textView4 = textView;
                    TextView textView5 = textView2;
                    TextView textView6 = textView3;
                    C89219l.m154721d(textView4, "");
                    C89219l.m154721d(textView5, "");
                    C89219l.m154721d(textView6, "");
                    textView4.setText(R.string.gzs);
                    textView5.setText(R.string.gzr);
                    textView6.setText(R.string.gzy);
                    textView6.setOnClickListener(new View.OnClickListener(this) {
                        /* class com.p2082ss.android.ugc.aweme.sticker.view.internal.pager.pages.AbstractC76255a.C76260d.C762611.View$OnClickListenerC762621 */

                        /* renamed from: a */
                        final /* synthetic */ C762611 f171321a;

                        static {
                            Covode.recordClassIndex(89213);
                        }

                        {
                            this.f171321a = r1;
                        }

                        public final void onClick(View view) {
                            ClickAgent.onClick(view);
                            this.f171321a.f171320a.f171319a.mo119983k();
                        }
                    });
                    return C89391z.f203057a;
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        this.f171309i = z;
        if (this.f171313m && !this.f171314n) {
            mo119982j();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.a$b */
    public static final class C76257b extends AbstractC89220m implements AbstractC89172b<ViewGroup, View> {

        /* renamed from: a */
        final /* synthetic */ AbstractC76255a f171316a;

        static {
            Covode.recordClassIndex(89208);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76257b(AbstractC76255a aVar) {
            super(1);
            this.f171316a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ View invoke(ViewGroup viewGroup) {
            AbstractC89172b<? super ViewGroup, ? extends View> bVar;
            Object invoke;
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            if (!this.f171316a.mo119985m() || (bVar = this.f171316a.mo119981i().f171029f.f169829c) == null || (invoke = bVar.invoke(viewGroup2)) == null) {
                return C85030e.m146192a(viewGroup2);
            }
            return invoke;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.a$c */
    public static final class C76258c extends AbstractC89220m implements AbstractC89172b<ViewGroup, View> {

        /* renamed from: a */
        final /* synthetic */ AbstractC76255a f171317a;

        static {
            Covode.recordClassIndex(89209);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C76258c(AbstractC76255a aVar) {
            super(1);
            this.f171317a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ View invoke(ViewGroup viewGroup) {
            AbstractC89172b<? super ViewGroup, ? extends View> bVar;
            Object invoke;
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            if (!this.f171317a.mo119985m() || (bVar = this.f171317a.mo119981i().f171029f.f169830d) == null || (invoke = bVar.invoke(viewGroup2)) == null) {
                return C85030e.m146190a(viewGroup2, C762591.f171318a);
            }
            return invoke;
        }
    }

    /* renamed from: a */
    public LinearLayoutManager mo119970a(View view) {
        int i;
        C89219l.m154721d(view, "");
        if (!mo119985m()) {
            i = 5;
        } else {
            AbstractC76125l.C76127b bVar = this.f171308h;
            if (bVar == null) {
                C89219l.m154710a("requiredDependency");
            }
            i = bVar.f171029f.f169827a;
        }
        view.getContext();
        return new GridLayoutManager(i, 1, false);
    }

    /* renamed from: a */
    public void mo119973a(List<? extends Effect> list) {
        C89219l.m154721d(list, "");
        ADAPTER adapter = this.f171304d;
        if (adapter != null && getActivity() != null && !list.isEmpty()) {
            adapter.f171235i = this.f171305e;
            adapter.mo119952a(list);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public AbstractC85027b<EnumC85026a> mo119975b(View view) {
        C89219l.m154721d(view, "");
        Map a = C89041ag.m154421a(C89387v.m154943a(EnumC85026a.LOADING, new C76257b(this)), C89387v.m154943a(EnumC85026a.EMPTY, new C76258c(this)), C89387v.m154943a(EnumC85026a.ERROR, new C76260d(this)));
        Context context = view.getContext();
        C89219l.m154716b(context, "");
        C85029d dVar = new C85029d(context, a, EnumC85026a.NONE, (byte) 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        dVar.setLayoutParams(layoutParams);
        View view2 = getView();
        Objects.requireNonNull(view2, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) view2).addView(dVar);
        return dVar;
    }

    @Override // com.p2082ss.android.ugc.aweme.sticker.view.p4013a.AbstractC76118e
    /* renamed from: b */
    public final void mo119137b(int i, boolean z) {
        if (this.f171304d == null || i < 0) {
            return;
        }
        if (z) {
            RecyclerView recyclerView = this.f171301a;
            if (recyclerView == null) {
                C89219l.m154710a("recyclerView");
            }
            recyclerView.mo4435d(i);
            return;
        }
        RecyclerView recyclerView2 = this.f171301a;
        if (recyclerView2 == null) {
            C89219l.m154710a("recyclerView");
        }
        recyclerView2.mo4413b(i);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        int i;
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        this.f171302b = mo119970a(view);
        C89219l.m154721d(view, "");
        View findViewById = view.findViewById(R.id.e93);
        RecyclerView recyclerView = (RecyclerView) findViewById;
        if (!mo119985m()) {
            i = 5;
        } else {
            AbstractC76125l.C76127b bVar = this.f171308h;
            if (bVar == null) {
                C89219l.m154710a("requiredDependency");
            }
            i = bVar.f171029f.f169828b;
        }
        recyclerView.setItemViewCacheSize(i);
        recyclerView.setRecycledViewPool(this.f171306f);
        C89219l.m154716b(findViewById, "");
        LinearLayoutManager linearLayoutManager = this.f171302b;
        if (linearLayoutManager == null) {
            C89219l.m154710a("layoutManager");
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.mo4405a(new C76256a(this));
        this.f171301a = recyclerView;
        this.f171303c = mo119975b(view);
        this.f171313m = true;
        if (this.f171309i && !this.f171314n) {
            mo119982j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.a_j, viewGroup, false);
    }

    /* renamed from: a */
    public final void mo119972a(int i, AbstractC76125l.C76127b bVar, AbstractC76125l.C76126a aVar, RecyclerView.RecycledViewPool recycledViewPool) {
        C89219l.m154721d(bVar, "");
        C89219l.m154721d(aVar, "");
        this.f171305e = i;
        this.f171312l = bVar.f171024a;
        this.f171308h = bVar;
        this.f171307g = aVar;
        this.f171306f = recycledViewPool;
    }
}
