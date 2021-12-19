package com.p2082ss.android.ugc.aweme.detail.p2751ui.p2754c;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC0945e;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.p1722h.C23160g;
import com.bytedance.tux.widget.spring.SpringLayout;
import com.p2082ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.p2082ss.android.ugc.aweme.detail.p2749h.C41178b;
import com.p2082ss.android.ugc.aweme.detail.p2751ui.C41426z;
import com.p2082ss.android.ugc.aweme.detail.p2751ui.CanVerticalScroolFrameLayout;
import com.p2082ss.android.ugc.aweme.feed.adapter.AbstractC48149ai;
import com.p2082ss.android.ugc.aweme.p2725d.C40910b;
import com.p2082ss.android.ugc.aweme.story.p4019b.C76598h;
import com.p2082ss.android.ugc.trill.R;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4612a.AbstractC89187q;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.detail.ui.c.a */
public class C41387a extends C41426z {

    /* renamed from: q */
    public final int f96561q;

    /* renamed from: r */
    public int f96562r;

    /* renamed from: s */
    public int f96563s;

    /* renamed from: t */
    private final AbstractC89244h f96564t = C89250i.m154773a((AbstractC89171a) new C41391d(this));

    /* renamed from: u */
    private SparseArray f96565u;

    static {
        Covode.recordClassIndex(49282);
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34685e
    /* renamed from: a */
    public View mo61343a(int i) {
        if (this.f96565u == null) {
            this.f96565u = new SparseArray();
        }
        View view = (View) this.f96565u.get(i);
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this.f96565u.put(i, findViewById);
        return findViewById;
    }

    /* renamed from: d */
    public final C23160g mo70651d() {
        return (C23160g) this.f96564t.getValue();
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34685e
    /* renamed from: e */
    public void mo61344e() {
        SparseArray sparseArray = this.f96565u;
        if (sparseArray != null) {
            sparseArray.clear();
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2379ui.C34685e, com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.detail.p2751ui.C41426z
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo61344e();
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.ui.c.a$d */
    static final class C41391d extends AbstractC89220m implements AbstractC89171a<C23160g> {

        /* renamed from: a */
        final /* synthetic */ C41387a f96569a;

        static {
            Covode.recordClassIndex(49286);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41391d(C41387a aVar) {
            super(0);
            this.f96569a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ C23160g invoke() {
            Context context = this.f96569a.getContext();
            if (context == null) {
                return null;
            }
            C89219l.m154716b(context, "");
            return new C23160g(context);
        }
    }

    public C41387a() {
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        this.f96561q = C89241a.m154730a(TypedValue.applyDimension(1, 40.0f, system.getDisplayMetrics()));
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.ui.c.a$c */
    static final class C41390c extends AbstractC89220m implements AbstractC89172b<Integer, Boolean> {

        /* renamed from: a */
        final /* synthetic */ C41387a f96568a;

        static {
            Covode.recordClassIndex(49285);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41390c(C41387a aVar) {
            super(1);
            this.f96568a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ Boolean invoke(Integer num) {
            int intValue = num.intValue();
            C41178b bVar = this.f96568a.f96636k;
            C89219l.m154716b(bVar, "");
            return Boolean.valueOf(bVar.f114759N.canScrollVertically(intValue));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.ui.c.a$b */
    static final class View$OnTouchListenerC41389b implements View.OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ C41387a f96567a;

        static {
            Covode.recordClassIndex(49284);
        }

        View$OnTouchListenerC41389b(C41387a aVar) {
            this.f96567a = aVar;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            C89219l.m154716b(motionEvent, "");
            int action = motionEvent.getAction();
            if (action != 1 && action != 3) {
                return false;
            }
            if (this.f96567a.f96562r < this.f96567a.f96561q || this.f96567a.bn_()) {
                if (this.f96567a.f96562r <= (-this.f96567a.f96561q)) {
                    C41178b bVar = this.f96567a.f96636k;
                    C89219l.m154716b(bVar, "");
                    VerticalViewPager verticalViewPager = bVar.f114759N;
                    C89219l.m154716b(verticalViewPager, "");
                    if (verticalViewPager.getCurrentItem() == 0) {
                        C76598h.m134181a("slide");
                        ActivityC0945e activity = this.f96567a.getActivity();
                        if (activity != null) {
                            activity.finish();
                        }
                        return true;
                    }
                }
                C41178b bVar2 = this.f96567a.f96636k;
                C89219l.m154716b(bVar2, "");
                AbstractC48149ai aC = bVar2.mo81108aC();
                if (aC == null) {
                    return false;
                }
                aC.mo80106U();
                return false;
            }
            C76598h.m134181a("slide");
            ActivityC0945e activity2 = this.f96567a.getActivity();
            if (activity2 != null) {
                activity2.finish();
            }
            return true;
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.base.p2375f.AbstractC34586a, com.bytedance.ies.uikit.p1279a.AbstractC18234b, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.detail.p2751ui.C41426z
    public void onViewCreated(View view, Bundle bundle) {
        C89219l.m154721d(view, "");
        super.onViewCreated(view, bundle);
        CanVerticalScroolFrameLayout canVerticalScroolFrameLayout = (CanVerticalScroolFrameLayout) view.findViewById(R.id.dnh);
        if (canVerticalScroolFrameLayout != null) {
            canVerticalScroolFrameLayout.setChildListCanVerticalScrollCallback(new C41390c(this));
        }
        SpringLayout springLayout = (SpringLayout) view.findViewById(R.id.e5k);
        if (springLayout != null) {
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            springLayout.setMaxOverScrollDistance(TypedValue.applyDimension(1, 200.0f, system.getDisplayMetrics()));
            springLayout.setRubberBandCoefficient(0.4f);
            springLayout.setOnScrollChangeListener(new C41388a(this));
            springLayout.setOnTouchListener(new View$OnTouchListenerC41389b(this));
        }
    }

    @Override // com.p2082ss.android.ugc.p4254b.p4255a.p4256a.AbstractC81909a, androidx.fragment.app.Fragment, com.p2082ss.android.ugc.aweme.detail.p2751ui.C41426z
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C89219l.m154721d(layoutInflater, "");
        return C40910b.m82399a(getActivity(), R.layout.wt, layoutInflater, viewGroup);
    }

    /* renamed from: com.ss.android.ugc.aweme.detail.ui.c.a$a */
    static final class C41388a extends AbstractC89220m implements AbstractC89187q<Integer, Integer, Boolean, C89391z> {

        /* renamed from: a */
        final /* synthetic */ C41387a f96566a;

        static {
            Covode.recordClassIndex(49283);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41388a(C41387a aVar) {
            super(3);
            this.f96566a = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89187q
        public final /* synthetic */ C89391z invoke(Integer num, Integer num2, Boolean bool) {
            int intValue = num.intValue();
            num2.intValue();
            boolean booleanValue = bool.booleanValue();
            this.f96566a.f96562r = intValue;
            int min = Math.min(Math.abs(this.f96566a.f96562r), Math.abs(this.f96566a.f96563s));
            int max = Math.max(Math.abs(this.f96566a.f96562r), Math.abs(this.f96566a.f96563s));
            int i = this.f96566a.f96561q;
            if (min <= i && max >= i && !booleanValue) {
                if (Build.VERSION.SDK_INT >= 29) {
                    C23160g d = this.f96566a.mo70651d();
                    if (d != null) {
                        d.mo37653b();
                    }
                } else {
                    C23160g d2 = this.f96566a.mo70651d();
                    if (d2 != null) {
                        d2.mo37652a();
                    }
                }
            }
            this.f96566a.f96563s = intValue;
            return C89391z.f203057a;
        }
    }
}
