package com.p2082ss.android.ugc.aweme.following.p3003ui.controller;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AbstractC1196i;
import androidx.lifecycle.AbstractC1202k;
import androidx.lifecycle.AbstractC1204m;
import androidx.lifecycle.AbstractC1214u;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.p1194ui.widget.DmtStatusView;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1722h.C23163i;
import com.bytedance.tux.status.TuxStatusView;
import com.p2082ss.android.ugc.aweme.common.C39162r;
import com.p2082ss.android.ugc.aweme.following.p3003ui.viewmodel.TopRecommendVM;
import com.p2082ss.android.ugc.aweme.social.p3914a.C74700b;
import com.p2082ss.android.ugc.aweme.social.p3914a.C74707c;
import com.p2082ss.android.ugc.aweme.social.widget.C74743a;
import com.p2082ss.android.ugc.aweme.social.widget.card.AbstractC74788j;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.C74762g;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.C74764h;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.EnumC74754a;
import com.p2082ss.android.ugc.aweme.social.widget.card.p3920a.EnumC74761f;
import com.p2082ss.android.ugc.aweme.social.widget.card.view.AbstractC74890a;
import com.p2082ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89387v;
import p4600h.C89391z;
import p4600h.p4601a.C89041ag;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.p4614a.AbstractC89196a;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.following.ui.controller.RecommendController */
public final class RecommendController implements ViewTreeObserver.OnGlobalLayoutListener, AbstractC1202k, AbstractC1204m {

    /* renamed from: k */
    public static final AbstractC89244h f118114k = C89250i.m154773a((AbstractC89171a) C51207b.f118127a);

    /* renamed from: l */
    public static final C51205a f118115l = new C51205a((byte) 0);

    /* renamed from: a */
    public boolean f118116a;

    /* renamed from: b */
    public C74743a f118117b;

    /* renamed from: c */
    public LinearLayout f118118c;

    /* renamed from: d */
    public PowerList f118119d;

    /* renamed from: e */
    public AbstractC74788j f118120e;

    /* renamed from: f */
    public View f118121f;

    /* renamed from: g */
    public AbstractC89171a<C89391z> f118122g;

    /* renamed from: h */
    public DmtStatusView f118123h;

    /* renamed from: i */
    public boolean f118124i;

    /* renamed from: j */
    public final Fragment f118125j;

    /* renamed from: com.ss.android.ugc.aweme.following.ui.controller.RecommendController$a */
    public static final class C51205a {
        static {
            Covode.recordClassIndex(60409);
        }

        /* renamed from: a */
        private static int m95619a() {
            return ((Number) RecommendController.f118114k.getValue()).intValue();
        }

        private C51205a() {
        }

        public /* synthetic */ C51205a(byte b) {
            this();
        }

        /* renamed from: com.ss.android.ugc.aweme.following.ui.controller.RecommendController$a$a */
        public static final class C51206a extends AbstractC89220m implements AbstractC89172b<AbstractC74890a, C89391z> {

            /* renamed from: a */
            public static final C51206a f118126a = new C51206a();

            static {
                Covode.recordClassIndex(60410);
            }

            C51206a() {
                super(1);
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // p4600h.p4611f.p4612a.AbstractC89172b
            public final /* synthetic */ C89391z invoke(AbstractC74890a aVar) {
                AbstractC74890a aVar2 = aVar;
                C89219l.m154721d(aVar2, "");
                Resources system = Resources.getSystem();
                C89219l.m154709a((Object) system, "");
                C23163i.m43668b(aVar2, null, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system.getDisplayMetrics()))), null, null, false, 29);
                return C89391z.f203057a;
            }
        }

        /* renamed from: a */
        public static C74762g m95620a(EnumC74754a aVar, boolean z) {
            return new C74762g(C89041ag.m154421a(C89387v.m154943a(EnumC74761f.CONTACT, aVar), C89387v.m154943a(EnumC74761f.FACEBOOK, aVar)), true, z, m95619a());
        }

        /* renamed from: a */
        public static C74764h m95621a(EnumC74754a aVar, int i, int i2, RecyclerView recyclerView) {
            WeakReference weakReference;
            if (recyclerView != null) {
                weakReference = new WeakReference(recyclerView);
            } else {
                weakReference = null;
            }
            return new C74764h(aVar, i, i2, weakReference);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.controller.RecommendController$c */
    public static final class C51208c implements AbstractC89196a, Iterable<View> {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f118128a;

        static {
            Covode.recordClassIndex(60412);
        }

        /* Return type fixed from 'java.util.Iterator' to match base method */
        @Override // java.lang.Iterable
        public final /* synthetic */ Iterator<View> iterator() {
            return new Object(this) {
                /* class com.p2082ss.android.ugc.aweme.following.p3003ui.controller.RecommendController.C51208c.C512091 */

                /* renamed from: a */
                public int f118129a;

                /* renamed from: b */
                final /* synthetic */ C51208c f118130b;

                static {
                    Covode.recordClassIndex(60413);
                }

                public final void remove() {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public final boolean hasNext() {
                    if (this.f118129a < this.f118130b.f118128a.getChildCount()) {
                        return true;
                    }
                    return false;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // java.util.Iterator
                public final /* synthetic */ View next() {
                    ViewGroup viewGroup = this.f118130b.f118128a;
                    int i = this.f118129a;
                    this.f118129a = i + 1;
                    return viewGroup.getChildAt(i);
                }

                {
                    this.f118130b = r1;
                }
            };
        }

        public C51208c(ViewGroup viewGroup) {
            this.f118128a = viewGroup;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.controller.RecommendController$b */
    static final class C51207b extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        public static final C51207b f118127a = new C51207b();

        static {
            Covode.recordClassIndex(60411);
        }

        C51207b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            int i;
            if (C74700b.m131154b()) {
                i = 0;
            } else {
                i = 2;
            }
            return Integer.valueOf(i);
        }
    }

    /* renamed from: a */
    public final void mo86616a() {
        View view = this.f118121f;
        if (view != null) {
            view.setVisibility(8);
        }
        this.f118116a = true;
    }

    @Override // androidx.lifecycle.AbstractC1204m
    public final AbstractC1196i getLifecycle() {
        AbstractC1196i lifecycle = this.f118125j.getLifecycle();
        C89219l.m154716b(lifecycle, "");
        return lifecycle;
    }

    static {
        Covode.recordClassIndex(60408);
    }

    /* renamed from: b */
    public final TopRecommendVM mo86617b() {
        if (m95616a(this.f118125j)) {
            return (TopRecommendVM) C1181ae.m3881a(this.f118125j.requireActivity(), (C1175ad.AbstractC1177b) null).mo3983a(TopRecommendVM.class);
        }
        return null;
    }

    public final void onGlobalLayout() {
        Integer num;
        LinearLayout linearLayout = this.f118118c;
        if (linearLayout == null) {
            C89219l.m154710a("container");
        }
        if (linearLayout.getGlobalVisibleRect(new Rect())) {
            if (!C74700b.m131155c() && (num = C74707c.f167913a.f167896b) != null) {
                int intValue = num.intValue();
                int i = C74707c.m131159a().getInt("following_exp_ff_c", 0) + 1;
                if (i >= intValue) {
                    C74707c.m131159a().storeLong("following_h_ff_t", System.currentTimeMillis());
                } else {
                    C74707c.m131159a().storeInt("following_exp_ff_c", i);
                }
            }
            LinearLayout linearLayout2 = this.f118118c;
            if (linearLayout2 == null) {
                C89219l.m154710a("container");
            }
            linearLayout2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.controller.RecommendController$e */
    public static final class C51213e<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ RecommendController f118135a;

        static {
            Covode.recordClassIndex(60417);
        }

        public C51213e(RecommendController recommendController) {
            this.f118135a = recommendController;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            AbstractC89171a<C89391z> aVar = this.f118135a.f118122g;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    public RecommendController(Fragment fragment) {
        C89219l.m154721d(fragment, "");
        this.f118125j = fragment;
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.controller.RecommendController$g */
    public static final class C51215g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f118137a;

        /* renamed from: b */
        final /* synthetic */ WeakReference f118138b;

        static {
            Covode.recordClassIndex(60419);
        }

        public final void onAnimationCancel(Animator animator) {
            int i;
            View view = (View) this.f118138b.get();
            if (view != null) {
                if (this.f118137a) {
                    i = 0;
                } else {
                    i = 8;
                }
                view.setVisibility(i);
            }
        }

        public final void onAnimationEnd(Animator animator) {
            int i;
            View view = (View) this.f118138b.get();
            if (view != null) {
                if (this.f118137a) {
                    i = 0;
                } else {
                    i = 8;
                }
                view.setVisibility(i);
            }
        }

        C51215g(boolean z, WeakReference weakReference) {
            this.f118137a = z;
            this.f118138b = weakReference;
        }
    }

    /* renamed from: a */
    private static boolean m95616a(Fragment fragment) {
        if (fragment.getActivity() == null || fragment.isDetached() || !fragment.isAdded()) {
            return false;
        }
        return true;
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.controller.RecommendController$f */
    public static final class C51214f<T> implements AbstractC1214u {

        /* renamed from: a */
        final /* synthetic */ RecommendController f118136a;

        static {
            Covode.recordClassIndex(60418);
        }

        public C51214f(RecommendController recommendController) {
            this.f118136a = recommendController;
        }

        @Override // androidx.lifecycle.AbstractC1214u
        public final /* synthetic */ void onChanged(Object obj) {
            float f;
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                RecommendController recommendController = this.f118136a;
                LinearLayout linearLayout = recommendController.f118118c;
                if (linearLayout == null) {
                    C89219l.m154710a("container");
                }
                for (T t : new C51208c(linearLayout)) {
                    if (!(t instanceof TuxStatusView) && ((!C89219l.m154714a((Object) t, (Object) recommendController.f118121f) || !recommendController.f118116a) && (!booleanValue || t.getVisibility() != 0))) {
                        int i = 8;
                        if (booleanValue) {
                            f = 1.0f;
                        } else if (t.getVisibility() != 8) {
                            f = 0.0f;
                        }
                        WeakReference weakReference = new WeakReference(t);
                        if (!booleanValue) {
                            i = 0;
                        }
                        t.setVisibility(i);
                        t.animate().alpha(f).setDuration(100).setListener(new C51215g(booleanValue, weakReference));
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.following.ui.controller.RecommendController$d */
    public static final class C51210d extends AbstractC89220m implements AbstractC89172b<AbstractC74890a, C89391z> {

        /* renamed from: a */
        final /* synthetic */ RecommendController f118131a;

        /* renamed from: b */
        final /* synthetic */ TopRecommendVM f118132b;

        static {
            Covode.recordClassIndex(60414);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C51210d(RecommendController recommendController, TopRecommendVM topRecommendVM) {
            super(1);
            this.f118131a = recommendController;
            this.f118132b = topRecommendVM;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(AbstractC74890a aVar) {
            AbstractC74890a aVar2 = aVar;
            C89219l.m154721d(aVar2, "");
            if (C74700b.m131155c()) {
                ((TuxTextView) C1764a.m5927a(LayoutInflater.from(aVar2.getContext()), R.layout.amy, aVar2, true).findViewById(R.id.bew)).setOnClickListener(new View.OnClickListener(this) {
                    /* class com.p2082ss.android.ugc.aweme.following.p3003ui.controller.RecommendController.C51210d.View$OnClickListenerC512111 */

                    /* renamed from: a */
                    final /* synthetic */ C51210d f118133a;

                    static {
                        Covode.recordClassIndex(60415);
                    }

                    {
                        this.f118133a = r1;
                    }

                    public final void onClick(View view) {
                        ClickAgent.onClick(view);
                        this.f118133a.f118131a.f118124i = true;
                        C74707c.f167914b = false;
                        C74707c.m131159a().storeLong("following_h_t_k", System.currentTimeMillis());
                        C39162r.m79460a("hide_recommend_cell", C89041ag.m154412a(C89387v.m154943a("enter_from", "following_list")));
                        TopRecommendVM topRecommendVM = this.f118133a.f118132b;
                        topRecommendVM.mo86787a(false);
                        topRecommendVM.f118446b = true;
                    }
                });
            } else if (C74700b.m131156d()) {
                ((LinearLayout) C1764a.m5927a(LayoutInflater.from(aVar2.getContext()), R.layout.amz, aVar2, true).findViewById(R.id.dtn)).setOnClickListener(new View.OnClickListener(this) {
                    /* class com.p2082ss.android.ugc.aweme.following.p3003ui.controller.RecommendController.C51210d.View$OnClickListenerC512122 */

                    /* renamed from: a */
                    final /* synthetic */ C51210d f118134a;

                    static {
                        Covode.recordClassIndex(60416);
                    }

                    {
                        this.f118134a = r1;
                    }

                    public final void onClick(View view) {
                        ClickAgent.onClick(view);
                        this.f118134a.f118132b.f118448d.setValue(C89391z.f203057a);
                    }
                });
            }
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            Integer valueOf = Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 20.0f, system.getDisplayMetrics())));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            C23163i.m43668b(aVar2, null, valueOf, null, Integer.valueOf(C89241a.m154730a(TypedValue.applyDimension(1, 0.0f, system2.getDisplayMetrics()))), false, 21);
            aVar2.setVisibility(8);
            return C89391z.f203057a;
        }
    }

    @Override // androidx.lifecycle.AbstractC1202k
    public final void onStateChanged(AbstractC1204m mVar, AbstractC1196i.EnumC1198a aVar) {
        C89219l.m154721d(mVar, "");
        C89219l.m154721d(aVar, "");
        if (aVar == AbstractC1196i.EnumC1198a.ON_DESTROY) {
            mVar.getLifecycle().mo4013b(this);
        }
    }
}
