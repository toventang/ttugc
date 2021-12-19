package com.p2082ss.android.ugc.aweme.ecommerce.review;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.content.C0643b;
import androidx.fragment.app.AbstractC0952i;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1171ab;
import androidx.lifecycle.C1175ad;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.DmtLoadingLayout;
import com.bytedance.jedi.arch.AbstractC20467g;
import com.bytedance.jedi.arch.AbstractC20477i;
import com.bytedance.jedi.arch.C20370ah;
import com.bytedance.jedi.arch.lifecycleAwareLazy;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.jedi.ext.adapter.extension.C20645b;
import com.bytedance.jedi.ext.adapter.p1465a.AbstractC20593c;
import com.bytedance.jedi.ext.adapter.p1465a.AbstractC20595e;
import com.bytedance.jedi.ext.adapter.p1465a.C20592b;
import com.bytedance.jedi.ext.adapter.p1465a.C20601g;
import com.bytedance.provider.p1587vm.ScopeViewModel;
import com.bytedance.tux.status.TuxStatusView;
import com.google.android.material.appbar.AppBarLayout;
import com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b;
import com.p2082ss.android.ugc.aweme.ecommerce.common.p2834a.C44306c;
import com.p2082ss.android.ugc.aweme.ecommerce.pdp.view.compat.C44998a;
import com.p2082ss.android.ugc.aweme.ecommerce.review.C45157f;
import com.p2082ss.android.ugc.aweme.ecommerce.review.p2854a.AbstractC45150a;
import com.p2082ss.android.ugc.aweme.ecommerce.review.repo.C45180a;
import com.p2082ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewFilterStruct;
import com.p2082ss.android.ugc.aweme.ecommerce.review.view.C45211c;
import com.p2082ss.android.ugc.aweme.ecommerce.review.view.RatingNumber;
import com.p2082ss.android.ugc.aweme.ecommerce.review.view.RatingStar;
import com.p2082ss.android.ugc.aweme.ecommerce.review.view.ReviewFilterGroup;
import com.p2082ss.android.ugc.aweme.ecommerce.review.viewholder.ReviewCellViewHolder;
import com.p2082ss.android.ugc.aweme.ecommerce.track.C45544c;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45563h;
import com.p2082ss.android.ugc.aweme.ecommerce.util.C45565j;
import com.p2082ss.android.ugc.aweme.ecommerce.util.ScrollTopLinearLayoutManager;
import com.p2082ss.android.ugc.aweme.utils.ActivityStack;
import com.p2082ss.android.ugc.trill.R;
import java.util.List;
import p4560f.p4561a.p4565b.AbstractC88412b;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4601a.C89070n;
import p4600h.p4611f.C89170a;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89183m;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89204ab;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4620k.AbstractC89277c;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.review.a */
public final class C45121a extends AbstractC34488b {

    /* renamed from: j */
    public static final C45125c f105202j = new C45125c((byte) 0);

    /* renamed from: b */
    final Handler f105203b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public boolean f105204c;

    /* renamed from: d */
    final Runnable f105205d;

    /* renamed from: e */
    long f105206e;

    /* renamed from: k */
    private final AbstractC89244h f105207k = C89250i.m154773a((AbstractC89171a) new C45147t(this));

    /* renamed from: l */
    private final AbstractC89244h f105208l = C89250i.m154773a((AbstractC89171a) new C45144q(this));

    /* renamed from: m */
    private final AbstractC89244h f105209m = C89250i.m154773a((AbstractC89171a) new C45146s(this));

    /* renamed from: n */
    private final lifecycleAwareLazy f105210n;

    /* renamed from: o */
    private SparseArray f105211o;

    static {
        Covode.recordClassIndex(53555);
    }

    /* renamed from: e */
    private float m87766e() {
        return ((Number) this.f105207k.getValue()).floatValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b
    /* renamed from: a */
    public final View mo60929a(int i) {
        if (this.f105211o == null) {
            this.f105211o = new SparseArray();
        }
        View view = (View) this.f105211o.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f105211o.put(i, findViewById);
        return findViewById;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b
    /* renamed from: a */
    public final void mo60930a() {
        SparseArray sparseArray = this.f105211o;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    /* renamed from: b */
    public final ProductReviewViewModel mo76219b() {
        return (ProductReviewViewModel) this.f105210n.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.base.arch.AbstractC34488b
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo60930a();
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.a$c */
    public static final class C45125c {
        static {
            Covode.recordClassIndex(53559);
        }

        private C45125c() {
        }

        public /* synthetic */ C45125c(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.a$u */
    public static final class C45148u extends RecyclerView.AbstractC1371n {
        static {
            Covode.recordClassIndex(53582);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            C89219l.m154721d(recyclerView, "");
        }

        C45148u() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4753a(RecyclerView recyclerView, int i) {
            C89219l.m154721d(recyclerView, "");
            super.mo4753a(recyclerView, i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.a$e */
    public static final class C45129e implements TuxStatusView.AbstractC23262b {

        /* renamed from: a */
        public final FrameLayout f105222a;

        /* renamed from: b */
        public boolean f105223b;

        /* renamed from: c */
        final /* synthetic */ C45121a f105224c;

        /* renamed from: d */
        private final View f105225d;

        /* renamed from: e */
        private final DmtLoadingLayout f105226e;

        static {
            Covode.recordClassIndex(53563);
        }

        @Override // com.bytedance.tux.status.TuxStatusView.AbstractC23262b
        /* renamed from: b */
        public final void mo37875b() {
            this.f105222a.setVisibility(8);
        }

        @Override // com.bytedance.tux.status.TuxStatusView.AbstractC23262b
        /* renamed from: a */
        public final void mo37874a() {
            this.f105222a.setVisibility(0);
            if (this.f105223b) {
                this.f105226e.setVisibility(0);
                View view = this.f105225d;
                C89219l.m154716b(view, "");
                view.setVisibility(8);
                return;
            }
            this.f105226e.setVisibility(8);
            View view2 = this.f105225d;
            C89219l.m154716b(view2, "");
            view2.setVisibility(0);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45129e(C45121a aVar) {
            this.f105224c = aVar;
            MethodCollector.m26663i(7229);
            View a = C1764a.m5927a(LayoutInflater.from(aVar.requireContext()), R.layout.qn, null, false);
            this.f105225d = a;
            DmtLoadingLayout dmtLoadingLayout = new DmtLoadingLayout(aVar.requireContext());
            this.f105226e = dmtLoadingLayout;
            FrameLayout frameLayout = new FrameLayout(aVar.requireContext());
            C89219l.m154716b(a, "");
            a.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            dmtLoadingLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            frameLayout.addView(a);
            frameLayout.addView(dmtLoadingLayout);
            this.f105222a = frameLayout;
            MethodCollector.m26664o(7229);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.a$a */
    public static final class C45122a extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ AbstractC89277c f105212a;

        static {
            Covode.recordClassIndex(53556);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45122a(AbstractC89277c cVar) {
            super(0);
            this.f105212a = cVar;
        }

        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final String invoke() {
            String name = C89170a.m154665a(this.f105212a).getName();
            C89219l.m154709a((Object) name, "");
            return name;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.a$q */
    static final class C45144q extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ C45121a f105242a;

        static {
            Covode.recordClassIndex(53578);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45144q(C45121a aVar) {
            super(0);
            this.f105242a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            Bundle arguments = this.f105242a.getArguments();
            int i = 0;
            if (arguments != null) {
                i = arguments.getInt("review_count", 0);
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.a$r */
    static final class RunnableC45145r implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C45121a f105243a;

        static {
            Covode.recordClassIndex(53579);
        }

        RunnableC45145r(C45121a aVar) {
            this.f105243a = aVar;
        }

        public final void run() {
            this.f105243a.mo76218a(true);
            TuxStatusView tuxStatusView = (TuxStatusView) this.f105243a.mo60929a(R.id.djs);
            if (tuxStatusView != null) {
                tuxStatusView.setVisibility(8);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.a$s */
    static final class C45146s extends AbstractC89220m implements AbstractC89171a<String> {

        /* renamed from: a */
        final /* synthetic */ C45121a f105244a;

        static {
            Covode.recordClassIndex(53580);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45146s(C45121a aVar) {
            super(0);
            this.f105244a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ String invoke() {
            String string;
            Bundle arguments = this.f105244a.getArguments();
            if (arguments == null || (string = arguments.getString("product_id", "")) == null) {
                return "";
            }
            return string;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.a$t */
    static final class C45147t extends AbstractC89220m implements AbstractC89171a<Float> {

        /* renamed from: a */
        final /* synthetic */ C45121a f105245a;

        static {
            Covode.recordClassIndex(53581);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45147t(C45121a aVar) {
            super(0);
            this.f105245a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Float invoke() {
            Bundle arguments = this.f105245a.getArguments();
            float f = -1.0f;
            if (arguments != null) {
                f = arguments.getFloat("review_score", -1.0f);
            }
            return Float.valueOf(f);
        }
    }

    /* renamed from: c */
    public final void mo76220c() {
        this.f105206e = SystemClock.elapsedRealtime();
        this.f105203b.removeCallbacks(this.f105205d);
        mo76218a(false);
        TuxStatusView tuxStatusView = (TuxStatusView) mo60929a(R.id.djs);
        if (tuxStatusView != null) {
            tuxStatusView.setVisibility(0);
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C45157f fVar = mo76219b().f105179b;
        if (fVar != null) {
            fVar.f105265g = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.a$b */
    public static final class C45123b extends AbstractC89220m implements AbstractC89171a<ProductReviewViewModel> {

        /* renamed from: a */
        final /* synthetic */ Fragment f105213a;

        /* renamed from: b */
        final /* synthetic */ AbstractC89171a f105214b;

        /* renamed from: c */
        final /* synthetic */ AbstractC89277c f105215c;

        /* renamed from: d */
        final /* synthetic */ AbstractC89183m f105216d;

        static {
            Covode.recordClassIndex(53557);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C45123b(Fragment fragment, AbstractC89171a aVar, AbstractC89277c cVar, AbstractC89183m mVar) {
            super(0);
            this.f105213a = fragment;
            this.f105214b = aVar;
            this.f105215c = cVar;
            this.f105216d = mVar;
        }

        /* JADX WARN: Type inference failed for: r2v2, types: [com.ss.android.ugc.aweme.ecommerce.review.ProductReviewViewModel, java.lang.Object, com.bytedance.jedi.arch.JediViewModel] */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.p2082ss.android.ugc.aweme.ecommerce.review.ProductReviewViewModel invoke() {
            /*
                r3 = this;
                androidx.fragment.app.Fragment r1 = r3.f105213a
                r0 = r1
                com.bytedance.jedi.arch.ar r0 = (com.bytedance.jedi.arch.AbstractC20380ar) r0
                androidx.lifecycle.ad$b r0 = r0.mo33721d()
                androidx.lifecycle.ad r2 = androidx.lifecycle.C1181ae.m3879a(r1, r0)
                h.f.a.a r0 = r3.f105214b
                java.lang.Object r1 = r0.invoke()
                java.lang.String r1 = (java.lang.String) r1
                h.k.c r0 = r3.f105215c
                java.lang.Class r0 = p4600h.p4611f.C89170a.m154665a(r0)
                androidx.lifecycle.ac r2 = m87772x4aa9b1a0(r2, r1, r0)
                com.bytedance.jedi.arch.JediViewModel r2 = (com.bytedance.jedi.arch.JediViewModel) r2
                com.bytedance.jedi.arch.z r1 = r2.f48234j
                java.lang.Class<com.ss.android.ugc.aweme.ecommerce.review.ProductReviewViewModel> r0 = com.p2082ss.android.ugc.aweme.ecommerce.review.ProductReviewViewModel.class
                com.bytedance.jedi.arch.y r1 = r1.mo33696a(r0)
                if (r1 == 0) goto L_0x0033
                java.lang.String r0 = ""
                p4600h.p4611f.p4613b.C89219l.m154709a(r2, r0)
                r1.binding(r2)
            L_0x0033:
                com.ss.android.ugc.aweme.ecommerce.review.a$b$1 r0 = new com.ss.android.ugc.aweme.ecommerce.review.a$b$1
                r0.<init>(r3)
                r2.mo33686a_(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.review.C45121a.C45123b.invoke():com.bytedance.jedi.arch.JediViewModel");
        }

        /* renamed from: com_ss_android_ugc_aweme_ecommerce_review_ProductReviewFragment$$special$$inlined$viewModel$2_androidx_lifecycle_VScopeLancet_get */
        public static AbstractC1174ac m87772x4aa9b1a0(C1175ad adVar, String str, Class cls) {
            if (cls.equals(ScopeViewModel.class)) {
                return adVar.mo3984a(str, cls);
            }
            AbstractC1174ac a = adVar.mo3984a(str, cls);
            C1171ab.m3870a(a, adVar);
            return a;
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        C45157f fVar = mo76219b().f105179b;
        if (fVar != null) {
            if (ActivityStack.isAppBackGround()) {
                fVar.f105262d = "close";
            }
            C45544c.m88080a(fVar.f105268j, "tiktokec_stay_page", new C45157f.C45172n(fVar));
            fVar.f105262d = "return";
        }
    }

    public C45121a() {
        C45149v vVar = new C45149v(this);
        AbstractC89277c a = C89204ab.m154669a(ProductReviewViewModel.class);
        C45122a aVar = new C45122a(a);
        this.f105210n = new lifecycleAwareLazy(this, aVar, new C45123b(this, aVar, a, vVar));
        this.f105205d = new RunnableC45145r(this);
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.a$o */
    public static final class C45142o extends RecyclerView.AbstractC1371n {

        /* renamed from: a */
        public int f105239a;

        /* renamed from: b */
        final /* synthetic */ C45121a f105240b;

        static {
            Covode.recordClassIndex(53576);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C45142o(C45121a aVar) {
            this.f105240b = aVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1371n
        /* renamed from: a */
        public final void mo4754a(RecyclerView recyclerView, int i, int i2) {
            C89219l.m154721d(recyclerView, "");
            int i3 = this.f105239a + i2;
            this.f105239a = i3;
            int i4 = C45563h.f106106b;
            AppBarLayout appBarLayout = (AppBarLayout) this.f105240b.mo60929a(R.id.djo);
            C89219l.m154716b(appBarLayout, "");
            if (i3 < (i4 - appBarLayout.getHeight()) - C45563h.f106111g) {
                CardView cardView = (CardView) this.f105240b.mo60929a(R.id.el0);
                if (cardView != null) {
                    cardView.setVisibility(8);
                    return;
                }
                return;
            }
            CardView cardView2 = (CardView) this.f105240b.mo60929a(R.id.el0);
            if (cardView2 != null) {
                cardView2.setVisibility(0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.a$i */
    static final class C45134i extends AbstractC89220m implements AbstractC89172b<ViewGroup, JediViewHolder<? extends AbstractC20467g, AbstractC45150a>> {

        /* renamed from: a */
        final /* synthetic */ C45121a f105231a;

        static {
            Covode.recordClassIndex(53568);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45134i(C45121a aVar) {
            super(1);
            this.f105231a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ JediViewHolder<? extends AbstractC20467g, AbstractC45150a> invoke(ViewGroup viewGroup) {
            ViewGroup viewGroup2 = viewGroup;
            C89219l.m154721d(viewGroup2, "");
            AbstractC0952i childFragmentManager = this.f105231a.getChildFragmentManager();
            C89219l.m154716b(childFragmentManager, "");
            return new ReviewCellViewHolder(childFragmentManager, viewGroup2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.a$l */
    static final class C45139l extends AbstractC89220m implements AbstractC89172b<AbstractC20477i, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45121a f105236a;

        static {
            Covode.recordClassIndex(53573);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45139l(C45121a aVar) {
            super(1);
            this.f105236a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar) {
            C89219l.m154721d(iVar, "");
            this.f105236a.mo76220c();
            TuxStatusView tuxStatusView = (TuxStatusView) this.f105236a.mo60929a(R.id.djs);
            if (tuxStatusView != null) {
                tuxStatusView.mo37867a();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.a$n */
    static final class C45141n extends AbstractC89220m implements AbstractC89172b<AbstractC20477i, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45121a f105238a;

        static {
            Covode.recordClassIndex(53575);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45141n(C45121a aVar) {
            super(1);
            this.f105238a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar) {
            C89219l.m154721d(iVar, "");
            this.f105238a.mo76219b().f105180c.f105256a = true;
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ProductReviewViewModel b = mo76219b();
        Context requireContext = requireContext();
        C89219l.m154716b(requireContext, "");
        C45157f fVar = new C45157f(requireContext);
        fVar.f105259a = m87766e();
        fVar.f105260b = ((Number) this.f105208l.getValue()).intValue();
        String str = (String) this.f105209m.getValue();
        C89219l.m154721d(str, "");
        fVar.f105261c = str;
        b.f105179b = fVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.a$p */
    static final class View$OnClickListenerC45143p implements View.OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C45121a f105241a;

        static {
            Covode.recordClassIndex(53577);
        }

        View$OnClickListenerC45143p(C45121a aVar) {
            this.f105241a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            ((AppBarLayout) this.f105241a.mo60929a(R.id.djo)).mo43718a(true, true, true);
            ((RecyclerView) this.f105241a.mo60929a(R.id.djn)).mo4435d(0);
            C45157f fVar = this.f105241a.mo76219b().f105179b;
            if (fVar != null) {
                C89219l.m154721d("to_top", "");
                C45544c.m88080a(fVar.f105268j, "tiktokec_button_click", new C45157f.C45160c("to_top"));
            }
            this.f105241a.mo60929a(R.id.djj);
        }
    }

    /* renamed from: a */
    public final void mo76218a(boolean z) {
        AppBarLayout.C26570b bVar = null;
        if (z) {
            View a = mo60929a(R.id.djp);
            if (a != null) {
                ViewGroup.LayoutParams layoutParams = a.getLayoutParams();
                if (layoutParams instanceof AppBarLayout.C26570b) {
                    bVar = layoutParams;
                }
                AppBarLayout.C26570b bVar2 = (AppBarLayout.C26570b) bVar;
                if (bVar2 != null) {
                    bVar2.f62704a = 1;
                    a.setLayoutParams(bVar2);
                }
            }
            RecyclerView recyclerView = (RecyclerView) mo60929a(R.id.djn);
            if (recyclerView != null) {
                recyclerView.setVisibility(0);
                return;
            }
            return;
        }
        View a2 = mo60929a(R.id.djp);
        if (a2 != null) {
            ViewGroup.LayoutParams layoutParams2 = a2.getLayoutParams();
            if (layoutParams2 instanceof AppBarLayout.C26570b) {
                bVar = layoutParams2;
            }
            AppBarLayout.C26570b bVar3 = bVar;
            if (bVar3 != null) {
                bVar3.f62704a = -1;
                a2.setLayoutParams(bVar3);
            }
        }
        RecyclerView recyclerView2 = (RecyclerView) mo60929a(R.id.djn);
        if (recyclerView2 != null) {
            recyclerView2.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.a$f */
    static final class C45130f extends AbstractC89220m implements AbstractC89183m<ViewGroup, AbstractC89171a<? extends C89391z>, AbstractC20593c> {

        /* renamed from: a */
        final /* synthetic */ C45121a f105227a;

        static {
            Covode.recordClassIndex(53564);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45130f(C45121a aVar) {
            super(2);
            this.f105227a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ AbstractC20593c invoke(ViewGroup viewGroup, AbstractC89171a<? extends C89391z> aVar) {
            C89219l.m154721d(viewGroup, "");
            C89219l.m154721d(aVar, "");
            return new AbstractC20593c(this) {
                /* class com.p2082ss.android.ugc.aweme.ecommerce.review.C45121a.C45130f.C451311 */

                /* renamed from: a */
                final /* synthetic */ C45130f f105228a;

                static {
                    Covode.recordClassIndex(53565);
                }

                @Override // com.bytedance.jedi.ext.adapter.p1465a.AbstractC20593c
                /* renamed from: a */
                public final void mo33847a(int i) {
                }

                @Override // com.bytedance.jedi.ext.adapter.p1465a.AbstractC20593c
                /* renamed from: a */
                public final View mo33846a() {
                    MethodCollector.m26663i(6971);
                    View view = new View(this.f105228a.f105227a.getContext());
                    MethodCollector.m26664o(6971);
                    return view;
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f105228a = r1;
                }
            };
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.a$h */
    static final class C45133h extends AbstractC89220m implements AbstractC89183m<Integer, Object, Boolean> {

        /* renamed from: a */
        public static final C45133h f105230a = new C45133h();

        static {
            Covode.recordClassIndex(53567);
        }

        C45133h() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ Boolean invoke(Integer num, Object obj) {
            num.intValue();
            return Boolean.valueOf(obj instanceof AbstractC45150a.C45151a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.a$g */
    static final class C45132g extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, String, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45121a f105229a;

        static {
            Covode.recordClassIndex(53566);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45132g(C45121a aVar) {
            super(2);
            this.f105229a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, String str) {
            C89219l.m154721d(iVar, "");
            this.f105229a.mo76220c();
            TuxStatusView tuxStatusView = (TuxStatusView) this.f105229a.mo60929a(R.id.djs);
            if (tuxStatusView != null) {
                tuxStatusView.mo37867a();
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.a$j */
    static final class C45135j extends AbstractC89220m implements AbstractC89183m<ViewGroup, AbstractC89171a<? extends C89391z>, AbstractC20595e> {

        /* renamed from: a */
        public static final C45135j f105232a = new C45135j();

        static {
            Covode.recordClassIndex(53569);
        }

        C45135j() {
            super(2);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ AbstractC20595e invoke(ViewGroup viewGroup, AbstractC89171a<? extends C89391z> aVar) {
            ViewGroup viewGroup2 = viewGroup;
            AbstractC89171a<? extends C89391z> aVar2 = aVar;
            C89219l.m154721d(viewGroup2, "");
            C89219l.m154721d(aVar2, "");
            return new C44306c(viewGroup2, aVar2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.a$v */
    static final class C45149v extends AbstractC89220m implements AbstractC89183m<ProductReviewState, Bundle, ProductReviewState> {

        /* renamed from: a */
        final /* synthetic */ C45121a f105246a;

        static {
            Covode.recordClassIndex(53583);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45149v(C45121a aVar) {
            super(2);
            this.f105246a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ ProductReviewState invoke(ProductReviewState productReviewState, Bundle bundle) {
            String str;
            ProductReviewState productReviewState2 = productReviewState;
            C89219l.m154721d(productReviewState2, "");
            Bundle arguments = this.f105246a.getArguments();
            if (arguments != null) {
                str = arguments.getString("product_id");
            } else {
                str = null;
            }
            return ProductReviewState.copy$default(productReviewState2, 0, null, 0.0f, String.valueOf(str), null, null, 55, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.a$k */
    static final class C45136k extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, Throwable, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45121a f105233a;

        static {
            Covode.recordClassIndex(53570);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45136k(C45121a aVar) {
            super(2);
            this.f105233a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, Throwable th) {
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(th, "");
            this.f105233a.mo76220c();
            if (th instanceof C45180a.C45181a) {
                TuxStatusView tuxStatusView = (TuxStatusView) this.f105233a.mo60929a(R.id.djs);
                if (tuxStatusView != null) {
                    tuxStatusView.setStatus(C45565j.m88113b(!this.f105233a.f105204c, new AbstractC89171a<C89391z>(this) {
                        /* class com.p2082ss.android.ugc.aweme.ecommerce.review.C45121a.C45136k.C451371 */

                        /* renamed from: a */
                        final /* synthetic */ C45136k f105234a;

                        static {
                            Covode.recordClassIndex(53571);
                        }

                        {
                            this.f105234a = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // p4600h.p4611f.p4612a.AbstractC89171a
                        public final /* synthetic */ C89391z invoke() {
                            this.f105234a.f105233a.mo76219b().mo33757k();
                            return C89391z.f203057a;
                        }
                    }));
                }
            } else {
                TuxStatusView tuxStatusView2 = (TuxStatusView) this.f105233a.mo60929a(R.id.djs);
                if (tuxStatusView2 != null) {
                    tuxStatusView2.setStatus(C45565j.m88112a(!this.f105233a.f105204c, new AbstractC89171a<C89391z>(this) {
                        /* class com.p2082ss.android.ugc.aweme.ecommerce.review.C45121a.C45136k.C451382 */

                        /* renamed from: a */
                        final /* synthetic */ C45136k f105235a;

                        static {
                            Covode.recordClassIndex(53572);
                        }

                        {
                            this.f105235a = r2;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        @Override // p4600h.p4611f.p4612a.AbstractC89171a
                        public final /* synthetic */ C89391z invoke() {
                            this.f105235a.f105233a.mo76219b().mo33757k();
                            return C89391z.f203057a;
                        }
                    }));
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.a$m */
    static final class C45140m extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, List<? extends AbstractC45150a>, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45121a f105237a;

        static {
            Covode.recordClassIndex(53574);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45140m(C45121a aVar) {
            super(2);
            this.f105237a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, List<? extends AbstractC45150a> list) {
            List<? extends AbstractC45150a> list2 = list;
            C89219l.m154721d(iVar, "");
            C89219l.m154721d(list2, "");
            if (list2.isEmpty()) {
                this.f105237a.mo76220c();
                TuxStatusView tuxStatusView = (TuxStatusView) this.f105237a.mo60929a(R.id.djs);
                if (tuxStatusView != null) {
                    TuxStatusView.C23263c cVar = new TuxStatusView.C23263c();
                    String string = this.f105237a.getString(R.string.bhb);
                    C89219l.m154716b(string, "");
                    cVar.mo37879a(string);
                    String string2 = this.f105237a.getString(R.string.bhc);
                    C89219l.m154716b(string2, "");
                    cVar.mo37878a((CharSequence) string2);
                    tuxStatusView.setStatus(cVar);
                }
            } else {
                C45121a aVar = this.f105237a;
                aVar.mo76218a(true);
                aVar.f105203b.postDelayed(aVar.f105205d, 100 - (SystemClock.elapsedRealtime() - aVar.f105206e));
                C45157f fVar = aVar.mo76219b().f105179b;
                if (fVar != null && !fVar.f105267i) {
                    fVar.f105267i = true;
                    C45544c.m88080a(fVar.f105268j, "tiktokec_enter_page", new C45157f.C45162e(fVar));
                }
            }
            return C89391z.f203057a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.review.a$d */
    static final class C45126d extends AbstractC89220m implements AbstractC89183m<AbstractC20477i, AbstractC45150a.C45152b, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C45121a f105218a;

        /* renamed from: b */
        final /* synthetic */ C45129e f105219b;

        static {
            Covode.recordClassIndex(53560);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C45126d(C45121a aVar, C45129e eVar) {
            super(2);
            this.f105218a = aVar;
            this.f105219b = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89183m
        public final /* synthetic */ C89391z invoke(AbstractC20477i iVar, AbstractC45150a.C45152b bVar) {
            int i;
            AbstractC45150a.C45152b bVar2 = bVar;
            C89219l.m154721d(iVar, "");
            if (bVar2 != null) {
                this.f105218a.f105204c = true;
                this.f105219b.f105223b = true;
                AppBarLayout appBarLayout = (AppBarLayout) this.f105218a.mo60929a(R.id.djo);
                C89219l.m154716b(appBarLayout, "");
                int i2 = 0;
                appBarLayout.setVisibility(0);
                ReviewFilterGroup reviewFilterGroup = (ReviewFilterGroup) this.f105218a.mo60929a(R.id.b1r);
                List<ReviewFilterStruct> list = bVar2.f105253a;
                C89219l.m154721d(list, "");
                if (reviewFilterGroup.f105383a.getChildCount() == 0) {
                    reviewFilterGroup.f105383a.removeAllViews();
                    int i3 = 0;
                    for (T t : list) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            C89070n.m154520a();
                        }
                        T t2 = t;
                        Context context = reviewFilterGroup.getContext();
                        C89219l.m154716b(context, "");
                        C45211c cVar = new C45211c(context, (byte) 0);
                        TextView pre = cVar.getPre();
                        C89219l.m154716b(pre, "");
                        pre.setText(t2.f105337b);
                        TextView suf = cVar.getSuf();
                        C89219l.m154716b(suf, "");
                        suf.setText(t2.f105338c);
                        View star = cVar.getStar();
                        C89219l.m154716b(star, "");
                        if (t2.f105339d == 2) {
                            i = 0;
                        } else {
                            i = 8;
                        }
                        star.setVisibility(i);
                        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                        marginLayoutParams.rightMargin = C45563h.f106110f;
                        marginLayoutParams.bottomMargin = C45563h.f106110f;
                        int i5 = Build.VERSION.SDK_INT;
                        marginLayoutParams.setMarginEnd(C45563h.f106110f);
                        cVar.setLayoutParams(marginLayoutParams);
                        cVar.setTag(t2);
                        cVar.setOnClickListener(new ReviewFilterGroup.View$OnClickListenerC45205a(i3, reviewFilterGroup));
                        reviewFilterGroup.f105383a.addView(cVar);
                        i3 = i4;
                    }
                }
                ((ReviewFilterGroup) this.f105218a.mo60929a(R.id.b1r)).setOnSelectedChangeListener(new AbstractC89183m<Integer, ReviewFilterStruct, C89391z>(this) {
                    /* class com.p2082ss.android.ugc.aweme.ecommerce.review.C45121a.C45126d.C451271 */

                    /* renamed from: a */
                    final /* synthetic */ C45126d f105220a;

                    static {
                        Covode.recordClassIndex(53561);
                    }

                    {
                        this.f105220a = r2;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
                        r3 = new com.p2082ss.android.ugc.aweme.ecommerce.review.C45157f.C45159b(r2, r1, r0);
                        r4.f105263e = r3;
                        r4.f105264f.clear();
                        r4.f105266h.clear();
                        com.p2082ss.android.ugc.aweme.ecommerce.track.C45544c.m88080a(r4.f105268j, "tiktokec_filter_click", new com.p2082ss.android.ugc.aweme.ecommerce.review.C45157f.C45163f(r4, r3));
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004b, code lost:
                        if (r1 == null) goto L_0x0019;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001b, code lost:
                        if (r8 != null) goto L_0x001d;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001d, code lost:
                        r0 = r8.f105336a;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
                        if (r0 != null) goto L_0x0023;
                     */
                    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
                        r0 = "-1";
                     */
                    @Override // p4600h.p4611f.p4612a.AbstractC89183m
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final /* synthetic */ p4600h.C89391z invoke(java.lang.Integer r7, com.p2082ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewFilterStruct r8) {
                        /*
                            r6 = this;
                            java.lang.Number r7 = (java.lang.Number) r7
                            int r2 = r7.intValue()
                            com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewFilterStruct r8 = (com.p2082ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewFilterStruct) r8
                            com.ss.android.ugc.aweme.ecommerce.review.a$d r0 = r6.f105220a
                            com.ss.android.ugc.aweme.ecommerce.review.a r0 = r0.f105218a
                            com.ss.android.ugc.aweme.ecommerce.review.ProductReviewViewModel r5 = r0.mo76219b()
                            com.ss.android.ugc.aweme.ecommerce.review.f r4 = r5.f105179b
                            if (r4 == 0) goto L_0x003e
                            com.ss.android.ugc.aweme.ecommerce.review.f$b r3 = new com.ss.android.ugc.aweme.ecommerce.review.f$b
                            if (r8 != 0) goto L_0x0049
                            r2 = -1
                        L_0x0019:
                            java.lang.String r1 = "all"
                            if (r8 == 0) goto L_0x0021
                        L_0x001d:
                            java.lang.String r0 = r8.f105336a
                            if (r0 != 0) goto L_0x0023
                        L_0x0021:
                            java.lang.String r0 = "-1"
                        L_0x0023:
                            r3.<init>(r2, r1, r0)
                            r4.f105263e = r3
                            java.util.Set<java.lang.String> r0 = r4.f105264f
                            r0.clear()
                            java.util.HashSet<java.lang.String> r0 = r4.f105266h
                            r0.clear()
                            android.content.Context r2 = r4.f105268j
                            com.ss.android.ugc.aweme.ecommerce.review.f$f r1 = new com.ss.android.ugc.aweme.ecommerce.review.f$f
                            r1.<init>(r4, r3)
                            java.lang.String r0 = "tiktokec_filter_click"
                            com.p2082ss.android.ugc.aweme.ecommerce.track.C45544c.m88080a(r2, r0, r1)
                        L_0x003e:
                            com.ss.android.ugc.aweme.ecommerce.review.ProductReviewViewModel$k r0 = new com.ss.android.ugc.aweme.ecommerce.review.ProductReviewViewModel$k
                            r0.<init>(r8)
                            r5.mo33689c(r0)
                            h.z r0 = p4600h.C89391z.f203057a
                            return r0
                        L_0x0049:
                            java.lang.String r1 = r8.f105337b
                            if (r1 != 0) goto L_0x001d
                            goto L_0x0019
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.ecommerce.review.C45121a.C45126d.C451271.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                });
                View view = this.f105218a.getView();
                if (view != null) {
                    view.post(new Runnable(this) {
                        /* class com.p2082ss.android.ugc.aweme.ecommerce.review.C45121a.C45126d.RunnableC451282 */

                        /* renamed from: a */
                        final /* synthetic */ C45126d f105221a;

                        static {
                            Covode.recordClassIndex(53562);
                        }

                        {
                            this.f105221a = r1;
                        }

                        public final void run() {
                            TuxStatusView tuxStatusView = (TuxStatusView) this.f105221a.f105218a.mo60929a(R.id.djs);
                            if (tuxStatusView != null) {
                                ViewGroup.LayoutParams layoutParams = tuxStatusView.getLayoutParams();
                                if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                                    layoutParams = null;
                                }
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                if (marginLayoutParams != null) {
                                    AppBarLayout appBarLayout = (AppBarLayout) this.f105221a.f105218a.mo60929a(R.id.djo);
                                    C89219l.m154716b(appBarLayout, "");
                                    marginLayoutParams.topMargin = appBarLayout.getHeight();
                                    tuxStatusView.setLayoutParams(marginLayoutParams);
                                }
                            }
                        }
                    });
                }
                for (T t3 : bVar2.f105253a) {
                    int i6 = i2 + 1;
                    if (i2 < 0) {
                        C89070n.m154520a();
                    }
                    T t4 = t3;
                    C45157f fVar = this.f105218a.mo76219b().f105179b;
                    if (fVar != null) {
                        C45544c.m88080a(fVar.f105268j, "tiktokec_filter_name_show", new C45157f.C45164g(fVar, t4, i2));
                    }
                    i2 = i6;
                }
            }
            return C89391z.f203057a;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        if (m87766e() >= 0.0f) {
            ((RatingNumber) mo60929a(R.id.deh)).getMaxScore().setText("5");
            ((RatingNumber) mo60929a(R.id.deh)).getScore().setText(String.valueOf(m87766e()));
            ((RatingStar) mo60929a(R.id.dei)).setRate(m87766e());
            ((RatingStar) mo60929a(R.id.dei)).setStarSize(16);
            LinearLayout linearLayout = (LinearLayout) mo60929a(R.id.deg);
            C89219l.m154716b(linearLayout, "");
            linearLayout.setVisibility(0);
        } else {
            LinearLayout linearLayout2 = (LinearLayout) mo60929a(R.id.deg);
            C89219l.m154716b(linearLayout2, "");
            linearLayout2.setVisibility(8);
        }
        RecyclerView recyclerView = (RecyclerView) mo60929a(R.id.djn);
        C89219l.m154716b(recyclerView, "");
        Context requireContext = requireContext();
        C89219l.m154716b(requireContext, "");
        recyclerView.setLayoutManager(new ScrollTopLinearLayoutManager(requireContext));
        ((RecyclerView) mo60929a(R.id.djn)).mo4402a(new C44998a(C0643b.m2378c(requireContext(), R.color.b6), 0, 0.0f, 6));
        AbstractC88412b unused = selectSubscribe(mo76219b(), C45154c.f105255a, new C20370ah(), new C45132g(this));
        C20601g gVar = (C20601g) C20592b.m38823a((C20645b) C20645b.C20646a.m38886a(this, mo76219b().f105180c).mo33901a(C45133h.f105230a, null, new C45134i(this))).mo33839a(244).mo33841a(C45135j.f105232a);
        gVar.f48761q = mo76219b();
        C20601g gVar2 = (C20601g) gVar.mo33840a(new C45139l(this), new C45136k(this), new C45140m(this));
        C45141n nVar = new C45141n(this);
        C89219l.m154719c(nVar, "");
        gVar2.f48665m = nVar;
        C20601g gVar3 = gVar2;
        C45130f fVar = new C45130f(this);
        C89219l.m154719c(fVar, "");
        gVar3.f48660h = fVar;
        RecyclerView recyclerView2 = (RecyclerView) mo60929a(R.id.djn);
        C89219l.m154716b(recyclerView2, "");
        gVar3.mo33882a(recyclerView2);
        ((RecyclerView) mo60929a(R.id.djn)).mo4405a(new C45148u());
        C45129e eVar = new C45129e(this);
        ((TuxStatusView) mo60929a(R.id.djs)).mo37868a(eVar.f105222a);
        ((TuxStatusView) mo60929a(R.id.djs)).mo37869a(eVar);
        AbstractC88412b unused2 = selectSubscribe(mo76219b(), C45153b.f105254a, new C20370ah(), new C45126d(this, eVar));
        CardView cardView = (CardView) mo60929a(R.id.el0);
        C89219l.m154716b(cardView, "");
        cardView.setVisibility(8);
        ((RecyclerView) mo60929a(R.id.djn)).mo4405a(new C45142o(this));
        CardView cardView2 = (CardView) mo60929a(R.id.el0);
        if (cardView2 != null) {
            cardView2.setOnClickListener(new View$OnClickListenerC45143p(this));
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C1764a.m5927a(layoutInflater, R.layout.qe, viewGroup, false);
    }
}
