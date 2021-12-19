package com.p2082ss.android.ugc.aweme.shoutouts.review;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.ActivityC0945e;
import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1175ad;
import androidx.lifecycle.C1181ae;
import androidx.recyclerview.widget.RecyclerView;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.powerlist.C17656f;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.PowerStub;
import com.bytedance.ies.powerlist.p1230a.C17638b;
import com.bytedance.ies.powerlist.p1231b.AbstractC17641a;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.p1710c.C23008e;
import com.bytedance.tux.p1710c.C23009f;
import com.bytedance.tux.p1721g.C23144b;
import com.bytedance.tux.sheet.sheet.TuxSheetHandle;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.i18n.C53437b;
import com.p2082ss.android.ugc.aweme.shoutouts.api.AbstractC74385a;
import com.p2082ss.android.ugc.aweme.shoutouts.review.cell.C74558a;
import com.p2082ss.android.ugc.aweme.shoutouts.review.cell.ShoutoutReviewsCell;
import com.p2082ss.android.ugc.aweme.shoutouts.review.p3903a.AbstractC74530a;
import com.p2082ss.android.ugc.aweme.shoutouts.review.p3904b.C74542b;
import com.p2082ss.android.ugc.aweme.shoutouts.review.p3905c.EnumC74550a;
import com.p2082ss.android.ugc.aweme.shoutouts.review.view.C74585b;
import com.p2082ss.android.ugc.aweme.shoutouts.review.view.C74595d;
import com.p2082ss.android.ugc.aweme.shoutouts.review.view.ShoutOutPopupView;
import com.p2082ss.android.ugc.aweme.shoutouts.review.view.ShoutOutRatingBar;
import com.p2082ss.android.ugc.aweme.shoutouts.review.view.ShoutoutsReviewHeaderTop;
import com.p2082ss.android.ugc.trill.R;
import java.util.Arrays;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89388w;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;

/* renamed from: com.ss.android.ugc.aweme.shoutouts.review.c */
public final class C74544c extends FrameLayout implements AbstractC74530a {

    /* renamed from: d */
    public static int f167623d = C34728n.m70946a(240.0d);

    /* renamed from: e */
    public static final C74545a f167624e = new C74545a((byte) 0);

    /* renamed from: a */
    PowerList f167625a;

    /* renamed from: b */
    public AbstractC74385a f167626b;

    /* renamed from: c */
    public TuxSheetHandle f167627c;

    /* renamed from: f */
    private C74585b f167628f;

    /* renamed from: g */
    private final C74595d f167629g;

    /* renamed from: h */
    private long f167630h;

    /* renamed from: i */
    private float f167631i;

    /* renamed from: j */
    private float f167632j;

    /* renamed from: k */
    private LinearLayout f167633k;

    /* renamed from: l */
    private final AbstractC89244h f167634l;

    /* renamed from: m */
    private final AbstractC89244h f167635m;

    /* access modifiers changed from: package-private */
    public final ShoutOutPopupView getPopupView() {
        return (ShoutOutPopupView) this.f167634l.getValue();
    }

    /* access modifiers changed from: package-private */
    public final ShoutoutsReviewsViewModel getViewModel() {
        return (ShoutoutsReviewsViewModel) this.f167635m.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.c$a */
    public static final class C74545a {
        static {
            Covode.recordClassIndex(87351);
        }

        private C74545a() {
        }

        public /* synthetic */ C74545a(byte b) {
            this();
        }
    }

    public final EnumC74550a getCurrentStyle() {
        C74585b bVar = this.f167628f;
        if (bVar != null) {
            return bVar.getCurrentStyle();
        }
        return null;
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.c$d */
    static final class C74548d extends AbstractC89220m implements AbstractC89171a<ShoutOutPopupView> {

        /* renamed from: a */
        final /* synthetic */ C74544c f167639a;

        static {
            Covode.recordClassIndex(87354);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74548d(C74544c cVar) {
            super(0);
            this.f167639a = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ShoutOutPopupView invoke() {
            ShoutOutPopupView shoutOutPopupView = (ShoutOutPopupView) this.f167639a.findViewById(R.id.e0t);
            C89219l.m154716b(shoutOutPopupView, "");
            shoutOutPopupView.setVisibility(0);
            return shoutOutPopupView;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.c$e */
    static final class C74549e extends AbstractC89220m implements AbstractC89171a<ShoutoutsReviewsViewModel> {

        /* renamed from: a */
        final /* synthetic */ Context f167640a;

        static {
            Covode.recordClassIndex(87355);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C74549e(Context context) {
            super(0);
            this.f167640a = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ShoutoutsReviewsViewModel invoke() {
            Context context = this.f167640a;
            Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            AbstractC1174ac a = C1181ae.m3881a((ActivityC0945e) context, (C1175ad.AbstractC1177b) null).mo3983a(ShoutoutsReviewsViewModel.class);
            C89219l.m154716b(a, "");
            return a;
        }
    }

    static {
        Covode.recordClassIndex(87350);
    }

    /* renamed from: a */
    public final void mo117203a() {
        this.f167629g.getHeaderSteps().setOnlyView(true);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        MethodCollector.m26663i(373);
        super.onAttachedToWindow();
        Context context = getContext();
        if (context != null) {
            View findViewById = findViewById(R.id.e0a);
            C89219l.m154716b(findViewById, "");
            this.f167633k = (LinearLayout) findViewById;
            Resources resources = getResources();
            C89219l.m154716b(resources, "");
            double d = (double) resources.getDisplayMetrics().heightPixels;
            Double.isNaN(d);
            CoordinatorLayout coordinatorLayout = new CoordinatorLayout(context);
            ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, ((int) (d * 0.9d)) - C34728n.m70946a(84.0d));
            LinearLayout linearLayout = this.f167633k;
            if (linearLayout == null) {
                C89219l.m154710a("contentLayout");
            }
            linearLayout.addView(coordinatorLayout, layoutParams);
            FrameLayout frameLayout = new FrameLayout(context);
            coordinatorLayout.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
            frameLayout.setBackground(C23009f.m43397a(C74546b.f167636a).mo37389a(context));
            PowerList powerList = new PowerList(context);
            this.f167625a = powerList;
            RecyclerView.AbstractC1350a adapter = powerList.getAdapter();
            if (adapter != null) {
                PowerStub g = ((PowerAdapter) adapter).mo28058g();
                if (g != null) {
                    C17638b e = g.mo28103e();
                    if (!e.mo28105a().containsKey(C74544c.class)) {
                        e.mo28105a().put(C74544c.class, this);
                    } else {
                        RuntimeException runtimeException = new RuntimeException("already contains control type :" + C74544c.class);
                        MethodCollector.m26664o(373);
                        throw runtimeException;
                    }
                }
                frameLayout.addView(this.f167625a, new FrameLayout.LayoutParams(-1, -1));
                PowerList powerList2 = this.f167625a;
                if (powerList2 == null) {
                    C89219l.m154715b();
                }
                powerList2.mo28083a(ShoutoutReviewsCell.class);
                PowerList powerList3 = this.f167625a;
                if (powerList3 == null) {
                    C89219l.m154715b();
                }
                powerList3.mo28079a(0, this.f167629g);
                ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
                if (layoutParams2 != null) {
                    ((CoordinatorLayout.C0560e) layoutParams2).mo2538a(new BottomSheetBehavior());
                    this.f167627c = new TuxSheetHandle(context, null, 0, 6);
                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams3.gravity = 1;
                    Resources system = Resources.getSystem();
                    C89219l.m154709a((Object) system, "");
                    layoutParams3.topMargin = C89241a.m154730a(TypedValue.applyDimension(1, 4.0f, system.getDisplayMetrics()));
                    TuxSheetHandle tuxSheetHandle = this.f167627c;
                    if (tuxSheetHandle == null) {
                        C89219l.m154710a("sheetHandle");
                    }
                    frameLayout.addView(tuxSheetHandle, layoutParams3);
                    BottomSheetBehavior a = BottomSheetBehavior.m52754a(frameLayout);
                    C89219l.m154716b(a, "");
                    a.mo43976b(f167623d - C34728n.m70946a(84.0d));
                    a.f62894h = false;
                    a.f62901o = new C74547c(this);
                    this.f167628f = new C74585b(context, (byte) 0);
                    LinearLayout linearLayout2 = this.f167633k;
                    if (linearLayout2 == null) {
                        C89219l.m154710a("contentLayout");
                    }
                    linearLayout2.addView(this.f167628f, new FrameLayout.LayoutParams(-1, -2));
                    mo117206a(EnumC74550a.CREATOR_MANAGE);
                    MethodCollector.m26664o(373);
                    return;
                }
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
                MethodCollector.m26664o(373);
                throw nullPointerException;
            }
            C89388w wVar = new C89388w("null cannot be cast to non-null type");
            MethodCollector.m26664o(373);
            throw wVar;
        }
        MethodCollector.m26664o(373);
    }

    public final void setBottomSheetCallback(AbstractC74385a aVar) {
        this.f167626b = aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.c$c */
    public static final class C74547c extends BottomSheetBehavior.AbstractC26607a {

        /* renamed from: a */
        final /* synthetic */ C74544c f167637a;

        /* renamed from: b */
        private int f167638b;

        static {
            Covode.recordClassIndex(87353);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C74547c(C74544c cVar) {
            this.f167637a = cVar;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC26607a
        /* renamed from: a */
        public final void mo37774a(View view, float f) {
            C89219l.m154721d(view, "");
            int i = this.f167638b;
            if (i != 3 && i != 4) {
                C74544c.m130971a(this.f167637a).getBottomSheetCallback().mo37774a(view, f);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC26607a
        /* renamed from: a */
        public final void mo37775a(View view, int i) {
            AbstractC74385a aVar;
            C89219l.m154721d(view, "");
            this.f167638b = i;
            C74544c.m130971a(this.f167637a).getBottomSheetCallback().mo37775a(view, i);
            if (i == 3) {
                AbstractC74385a aVar2 = this.f167637a.f167626b;
                if (aVar2 != null) {
                    aVar2.mo93983a(true);
                }
            } else if (i == 4 && (aVar = this.f167637a.f167626b) != null) {
                aVar.mo93983a(false);
            }
        }
    }

    public final void setDescription(String str) {
        if (str != null) {
            this.f167629g.setDescription(str);
        }
    }

    public final void setPostIntroVideoListener(AbstractC89172b<? super AbstractC89171a<C89391z>, C89391z> bVar) {
        getPopupView().setPostIntroVideoListener(bVar);
    }

    /* renamed from: a */
    public static final /* synthetic */ TuxSheetHandle m130971a(C74544c cVar) {
        TuxSheetHandle tuxSheetHandle = cVar.f167627c;
        if (tuxSheetHandle == null) {
            C89219l.m154710a("sheetHandle");
        }
        return tuxSheetHandle;
    }

    public final void setGotoSeeNewRequestListener(AbstractC89171a<C89391z> aVar) {
        C89219l.m154721d(aVar, "");
        getPopupView().setGotoSeeNewRequestListener(aVar);
    }

    public final void setReviewBottomBtnClickListener(C74585b.AbstractC74587a aVar) {
        C89219l.m154721d(aVar, "");
        C74585b bVar = this.f167628f;
        if (bVar != null) {
            bVar.setReviewBottomBtnClickListener(aVar);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.c$b */
    static final class C74546b extends AbstractC89220m implements AbstractC89172b<C23008e, C89391z> {

        /* renamed from: a */
        public static final C74546b f167636a = new C74546b();

        static {
            Covode.recordClassIndex(87352);
        }

        C74546b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // p4600h.p4611f.p4612a.AbstractC89172b
        public final /* synthetic */ C89391z invoke(C23008e eVar) {
            C23008e eVar2 = eVar;
            C89219l.m154721d(eVar2, "");
            eVar2.f54462a = -1;
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            eVar2.f54470i = Float.valueOf(TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            C89219l.m154709a((Object) system2, "");
            eVar2.f54471j = Float.valueOf(TypedValue.applyDimension(1, 8.0f, system2.getDisplayMetrics()));
            return C89391z.f203057a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C74544c(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(875);
        this.f167629g = new C74595d(context, (byte) 0);
        this.f167634l = C89250i.m154773a((AbstractC89171a) new C74548d(this));
        this.f167635m = C89250i.m154773a((AbstractC89171a) new C74549e(context));
        LayoutInflater.from(context).inflate(R.layout.azq, this);
        MethodCollector.m26664o(875);
    }

    @Override // com.p2082ss.android.ugc.aweme.shoutouts.review.p3903a.AbstractC74530a
    /* renamed from: a */
    public final void mo117193a(C74542b bVar) {
        C17656f<AbstractC17641a> state;
        Integer valueOf;
        PowerList powerList;
        C17656f<AbstractC17641a> state2;
        C89219l.m154721d(bVar, "");
        PowerList powerList2 = this.f167625a;
        if (powerList2 != null && (state = powerList2.getState()) != null && (valueOf = Integer.valueOf(state.mo28139c(bVar))) != null && (powerList = this.f167625a) != null && (state2 = powerList.getState()) != null) {
            state2.mo28136b(valueOf.intValue(), bVar);
        }
    }

    /* renamed from: a */
    public final void mo117204a(int i) {
        ShoutOutPopupView popupView = getPopupView();
        ViewGroup.LayoutParams layoutParams = popupView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        int i2 = f167623d;
        Resources system = Resources.getSystem();
        C89219l.m154709a((Object) system, "");
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i2 + C89241a.m154730a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics())) + i;
        popupView.requestLayout();
        View view = popupView.f167672b;
        if (view == null) {
            C89219l.m154710a("clNewRequestView");
        }
        view.setVisibility(0);
        View view2 = popupView.f167672b;
        if (view2 == null) {
            C89219l.m154710a("clNewRequestView");
        }
        view2.findViewById(R.id.f70).setOnClickListener(new ShoutOutPopupView.View$OnClickListenerC74567a(popupView));
    }

    /* renamed from: a */
    public final void mo117206a(EnumC74550a aVar) {
        C89219l.m154721d(aVar, "");
        C74585b bVar = this.f167628f;
        if (bVar != null) {
            bVar.mo117265a(aVar);
        }
    }

    @Override // com.p2082ss.android.ugc.aweme.shoutouts.review.p3903a.AbstractC74530a
    /* renamed from: a */
    public final void mo117194a(C74558a aVar) {
        C17656f<AbstractC17641a> state;
        C17656f<AbstractC17641a> state2;
        C89219l.m154721d(aVar, "");
        PowerList powerList = this.f167625a;
        ActivityC0945e eVar = null;
        if (powerList != null && (state = powerList.getState()) != null && Integer.valueOf(state.mo28139c(aVar.f167662a)) != null) {
            PowerList powerList2 = this.f167625a;
            if (!(powerList2 == null || (state2 = powerList2.getState()) == null)) {
                state2.mo28137b(aVar.f167662a);
            }
            Context context = getContext();
            if (context instanceof ActivityC0945e) {
                eVar = context;
            }
            ActivityC0945e eVar2 = eVar;
            if (eVar2 != null) {
                new C23144b(eVar2).mo37635a("Deleted").mo37637b();
            }
            this.f167630h--;
            float f = this.f167632j - ((float) aVar.f167662a.f167615e);
            this.f167632j = f;
            if (f < 0.0f) {
                this.f167632j = 0.0f;
            }
            long j = this.f167630h;
            if (((int) j) == 0) {
                this.f167629g.mo117269a(0.0f, 0);
            } else {
                this.f167629g.mo117269a(this.f167632j / ((float) j), j);
            }
        }
    }

    public /* synthetic */ C74544c(Context context, byte b) {
        this(context);
    }

    /* renamed from: a */
    public final void mo117205a(int i, int i2, String str, float f, long j, boolean z, boolean z2) {
        ShoutoutsReviewHeaderTop headerTop = this.f167629g.getHeaderTop();
        headerTop.f167719m = z;
        TuxTextView tuxTextView = headerTop.f167713g;
        if (tuxTextView == null) {
            C89219l.m154710a("tvPrice");
        }
        tuxTextView.setText(String.valueOf(i));
        if (str != null) {
            TuxTextView tuxTextView2 = headerTop.f167714h;
            if (tuxTextView2 == null) {
                C89219l.m154710a("tvExchangeRate");
            }
            Context context = headerTop.getContext();
            C89219l.m154716b(context, "");
            String string = context.getResources().getString(R.string.bot);
            C89219l.m154716b(string, "");
            String a = C1764a.m5928a("%s%.2f", Arrays.copyOf(new Object[]{str, Float.valueOf(((float) i2) / 100.0f)}, 2));
            C89219l.m154716b(a, "");
            String a2 = C1764a.m5928a(string, Arrays.copyOf(new Object[]{a}, 1));
            C89219l.m154716b(a2, "");
            tuxTextView2.setText(a2);
        } else {
            TuxTextView tuxTextView3 = headerTop.f167714h;
            if (tuxTextView3 == null) {
                C89219l.m154710a("tvExchangeRate");
            }
            Context context2 = headerTop.getContext();
            C89219l.m154716b(context2, "");
            String string2 = context2.getResources().getString(R.string.bot);
            C89219l.m154716b(string2, "");
            String a3 = C1764a.m5928a(string2, Arrays.copyOf(new Object[]{"--"}, 1));
            C89219l.m154716b(a3, "");
            tuxTextView3.setText(a3);
        }
        if (!z2 || j < 10) {
            ShoutOutRatingBar shoutOutRatingBar = headerTop.f167715i;
            if (shoutOutRatingBar == null) {
                C89219l.m154710a("ratingBar");
            }
            Context context3 = headerTop.getContext();
            C89219l.m154716b(context3, "");
            shoutOutRatingBar.setStarIdleDrawable(context3.getResources().getDrawable(2131233845));
            ShoutOutRatingBar shoutOutRatingBar2 = headerTop.f167715i;
            if (shoutOutRatingBar2 == null) {
                C89219l.m154710a("ratingBar");
            }
            shoutOutRatingBar2.setStar(0.0f);
            TuxTextView tuxTextView4 = headerTop.f167716j;
            if (tuxTextView4 == null) {
                C89219l.m154710a("tvRatingCount");
            }
            tuxTextView4.setText(headerTop.getContext().getString(R.string.dgd));
            TextView textView = headerTop.f167718l;
            if (textView == null) {
                C89219l.m154710a("tvRatingAvg");
            }
            textView.setVisibility(8);
        } else {
            ShoutOutRatingBar shoutOutRatingBar3 = headerTop.f167715i;
            if (shoutOutRatingBar3 == null) {
                C89219l.m154710a("ratingBar");
            }
            shoutOutRatingBar3.setStar(f);
            TuxTextView tuxTextView5 = headerTop.f167716j;
            if (tuxTextView5 == null) {
                C89219l.m154710a("tvRatingCount");
            }
            String string3 = headerTop.getContext().getString(R.string.dc9);
            C89219l.m154716b(string3, "");
            String a4 = C1764a.m5928a(string3, Arrays.copyOf(new Object[]{C53437b.m98615a(j)}, 1));
            C89219l.m154716b(a4, "");
            tuxTextView5.setText(a4);
            TextView textView2 = headerTop.f167718l;
            if (textView2 == null) {
                C89219l.m154710a("tvRatingAvg");
            }
            String a5 = C1764a.m5928a("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
            C89219l.m154716b(a5, "");
            textView2.setText(a5);
            TextView textView3 = headerTop.f167718l;
            if (textView3 == null) {
                C89219l.m154710a("tvRatingAvg");
            }
            textView3.setVisibility(0);
        }
        ImageView imageView = headerTop.f167717k;
        if (imageView == null) {
            C89219l.m154710a("ivHelp");
        }
        imageView.setOnClickListener(new ShoutoutsReviewHeaderTop.View$OnClickListenerC74583a(headerTop));
        this.f167630h = j;
        this.f167631i = f;
        this.f167632j = ((float) j) * f;
    }
}
