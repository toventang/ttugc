package com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3245ui.nested;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.LinearLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p036g.C0693f;
import androidx.core.p037h.AbstractC0780j;
import androidx.core.p037h.AbstractC0784n;
import androidx.core.p037h.AbstractC0790t;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.material.appbar.AppBarLayout;
import com.p2082ss.android.ugc.aweme.base.utils.C34723i;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.common.controller.utils.p3184b.C55196f;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.AbstractC55865a;
import com.p2082ss.android.ugc.aweme.utils.C80593iw;
import com.p2082ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Objects;
import p4600h.AbstractC89244h;
import p4600h.C89250i;
import p4600h.C89391z;
import p4600h.p4611f.p4612a.AbstractC89171a;
import p4600h.p4611f.p4612a.AbstractC89172b;
import p4600h.p4611f.p4613b.AbstractC89220m;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89225r;
import p4600h.p4616h.AbstractC89247c;
import p4600h.p4616h.AbstractC89249e;
import p4600h.p4620k.AbstractC89286i;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.nested.ShareNestedLayout */
public final class ShareNestedLayout extends LinearLayout implements AbstractC0784n {

    /* renamed from: N */
    private static final C0693f.C0696c<Rect> f127950N = new C0693f.C0696c<>(12);

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f127951a = {new C89225r(ShareNestedLayout.class, "mTouchScrollingChild", "getMTouchScrollingChild()Z", 0)};

    /* renamed from: j */
    public static final C56109b f127952j = new C56109b((byte) 0);

    /* renamed from: A */
    private float f127953A;

    /* renamed from: B */
    private final AbstractC89249e f127954B;

    /* renamed from: C */
    private final AbstractC89244h f127955C;

    /* renamed from: D */
    private final AbstractC89244h f127956D;

    /* renamed from: E */
    private final AbstractC89244h f127957E;

    /* renamed from: F */
    private final AbstractC89244h f127958F;

    /* renamed from: G */
    private boolean f127959G;

    /* renamed from: H */
    private boolean f127960H;

    /* renamed from: I */
    private final AbstractC89244h f127961I;

    /* renamed from: J */
    private AbstractC89172b<? super Boolean, C89391z> f127962J;

    /* renamed from: K */
    private final C56120l f127963K;

    /* renamed from: L */
    private final C56114g f127964L;

    /* renamed from: M */
    private boolean f127965M;

    /* renamed from: O */
    private HashMap f127966O;

    /* renamed from: b */
    public float f127967b;

    /* renamed from: c */
    float f127968c;

    /* renamed from: d */
    public boolean f127969d;

    /* renamed from: e */
    public boolean f127970e;

    /* renamed from: f */
    public boolean f127971f;

    /* renamed from: g */
    public boolean f127972g;

    /* renamed from: h */
    public AbstractC89172b<? super Boolean, C89391z> f127973h;

    /* renamed from: i */
    public boolean f127974i;

    /* renamed from: k */
    private final AbstractC89244h f127975k;

    /* renamed from: l */
    private final AbstractC89244h f127976l;

    /* renamed from: m */
    private final AbstractC89244h f127977m;

    /* renamed from: n */
    private final AbstractC89244h f127978n;

    /* renamed from: o */
    private final AbstractC89244h f127979o;

    /* renamed from: p */
    private boolean f127980p;

    /* renamed from: q */
    private float f127981q;

    /* renamed from: r */
    private float f127982r;

    /* renamed from: s */
    private float f127983s;

    /* renamed from: t */
    private float f127984t;

    /* renamed from: u */
    private float f127985u;

    /* renamed from: v */
    private float f127986v;

    /* renamed from: w */
    private float f127987w;

    /* renamed from: x */
    private boolean f127988x;

    /* renamed from: y */
    private ObjectAnimator f127989y;

    /* renamed from: z */
    private boolean f127990z;

    public ShareNestedLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final float getMMaximumVelocity() {
        return ((Number) this.f127978n.getValue()).floatValue();
    }

    private final float getMMinimumVelocity() {
        return ((Number) this.f127977m.getValue()).floatValue();
    }

    private final View getMPlaceholder() {
        return (View) this.f127955C.getValue();
    }

    private final boolean getMTouchScrollingChild() {
        return ((Boolean) this.f127954B.mo23374a(this, f127951a[0])).booleanValue();
    }

    private final int getMTouchSlop() {
        return ((Number) this.f127976l.getValue()).intValue();
    }

    private final VelocityTracker getMVelocityTracker() {
        return (VelocityTracker) this.f127979o.getValue();
    }

    private final void setMTouchScrollingChild(boolean z) {
        this.f127954B.mo143655a(f127951a[0], Boolean.valueOf(z));
    }

    /* renamed from: c */
    public final View mo92960c() {
        if (this.f127966O == null) {
            this.f127966O = new HashMap();
        }
        View view = (View) this.f127966O.get(Integer.valueOf((int) R.id.adj));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.adj);
        this.f127966O.put(Integer.valueOf((int) R.id.adj), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: package-private */
    public final AppBarLayout getAppBar() {
        return (AppBarLayout) this.f127957E.getValue();
    }

    public final CoordinatorLayout getCoordinatorLayout() {
        return (CoordinatorLayout) this.f127958F.getValue();
    }

    /* access modifiers changed from: package-private */
    public final LinearLayout getMContent() {
        return (LinearLayout) this.f127956D.getValue();
    }

    public final RecyclerView getMScrollingChild() {
        return (RecyclerView) this.f127961I.getValue();
    }

    public final ViewConfiguration getMViewConfiguration() {
        return (ViewConfiguration) this.f127975k.getValue();
    }

    public final int getNestedScrollAxes() {
        return 0;
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        C89219l.m154721d(view, "");
        return false;
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        C89219l.m154721d(view, "");
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(view2, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.nested.ShareNestedLayout$b */
    public static final class C56109b {
        static {
            Covode.recordClassIndex(65909);
        }

        private C56109b() {
        }

        public /* synthetic */ C56109b(byte b) {
            this();
        }
    }

    public final boolean getMCanDragUp() {
        return this.f127990z;
    }

    public final float getPeekHeight() {
        return this.f127953A;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.nested.ShareNestedLayout$n */
    static final class C56122n extends AbstractC89220m implements AbstractC89171a<VelocityTracker> {

        /* renamed from: a */
        public static final C56122n f128006a = new C56122n();

        static {
            Covode.recordClassIndex(65922);
        }

        C56122n() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ VelocityTracker invoke() {
            return VelocityTracker.obtain();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.nested.ShareNestedLayout$o */
    static final class C56123o extends AbstractC89220m implements AbstractC89171a<ViewConfiguration> {

        /* renamed from: a */
        final /* synthetic */ Context f128007a;

        static {
            Covode.recordClassIndex(65923);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56123o(Context context) {
            super(0);
            this.f128007a = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ViewConfiguration invoke() {
            return ViewConfiguration.get(this.f128007a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.nested.ShareNestedLayout$d */
    static final class C56111d extends AbstractC89220m implements AbstractC89171a<AppBarLayout> {

        /* renamed from: a */
        final /* synthetic */ ShareNestedLayout f127995a;

        static {
            Covode.recordClassIndex(65911);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56111d(ShareNestedLayout shareNestedLayout) {
            super(0);
            this.f127995a = shareNestedLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ AppBarLayout invoke() {
            return this.f127995a.findViewById(R.id.bj7);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.nested.ShareNestedLayout$e */
    static final class C56112e extends AbstractC89220m implements AbstractC89171a<CoordinatorLayout> {

        /* renamed from: a */
        final /* synthetic */ ShareNestedLayout f127996a;

        static {
            Covode.recordClassIndex(65912);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56112e(ShareNestedLayout shareNestedLayout) {
            super(0);
            this.f127996a = shareNestedLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ CoordinatorLayout invoke() {
            return this.f127996a.findViewById(R.id.bj8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.nested.ShareNestedLayout$f */
    static final class C56113f extends AbstractC89220m implements AbstractC89171a<LinearLayout> {

        /* renamed from: a */
        final /* synthetic */ ShareNestedLayout f127997a;

        static {
            Covode.recordClassIndex(65913);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56113f(ShareNestedLayout shareNestedLayout) {
            super(0);
            this.f127997a = shareNestedLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ LinearLayout invoke() {
            return this.f127997a.findViewById(R.id.adj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.nested.ShareNestedLayout$i */
    static final class C56116i extends AbstractC89220m implements AbstractC89171a<Float> {

        /* renamed from: a */
        final /* synthetic */ Context f128000a;

        static {
            Covode.recordClassIndex(65916);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56116i(Context context) {
            super(0);
            this.f128000a = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Float invoke() {
            return Float.valueOf(C13628n.m24520b(this.f128000a, 1000.0f));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.nested.ShareNestedLayout$k */
    static final class C56119k extends AbstractC89220m implements AbstractC89171a<RecyclerView> {

        /* renamed from: a */
        final /* synthetic */ ShareNestedLayout f128003a;

        static {
            Covode.recordClassIndex(65919);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56119k(ShareNestedLayout shareNestedLayout) {
            super(0);
            this.f128003a = shareNestedLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RecyclerView invoke() {
            return this.f128003a.findViewById(R.id.acd);
        }
    }

    private final boolean getMAnimating() {
        if (this.f127970e || this.f127971f) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo92959b() {
        this.f127988x = false;
        setMTouchScrollingChild(false);
        this.f127960H = false;
        this.f127987w = 0.0f;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.nested.ShareNestedLayout$h */
    static final class C56115h extends AbstractC89220m implements AbstractC89171a<Float> {

        /* renamed from: a */
        final /* synthetic */ ShareNestedLayout f127999a;

        static {
            Covode.recordClassIndex(65915);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56115h(ShareNestedLayout shareNestedLayout) {
            super(0);
            this.f127999a = shareNestedLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Float invoke() {
            ViewConfiguration mViewConfiguration = this.f127999a.getMViewConfiguration();
            C89219l.m154716b(mViewConfiguration, "");
            return Float.valueOf((float) mViewConfiguration.getScaledMaximumFlingVelocity());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.nested.ShareNestedLayout$j */
    static final class C56117j extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ ShareNestedLayout f128001a;

        static {
            Covode.recordClassIndex(65917);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56117j(ShareNestedLayout shareNestedLayout) {
            super(0);
            this.f128001a = shareNestedLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            View findViewById = this.f128001a.findViewById(R.id.d2b);
            findViewById.setOnClickListener(new View$OnClickListenerC56118a(this));
            return findViewById;
        }

        /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.nested.ShareNestedLayout$j$a */
        static final class View$OnClickListenerC56118a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C56117j f128002a;

            static {
                Covode.recordClassIndex(65918);
            }

            View$OnClickListenerC56118a(C56117j jVar) {
                this.f128002a = jVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f128002a.f128001a.mo92957a(false, true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.nested.ShareNestedLayout$m */
    static final class C56121m extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ ShareNestedLayout f128005a;

        static {
            Covode.recordClassIndex(65921);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C56121m(ShareNestedLayout shareNestedLayout) {
            super(0);
            this.f128005a = shareNestedLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            ViewConfiguration mViewConfiguration = this.f128005a.getMViewConfiguration();
            C89219l.m154716b(mViewConfiguration, "");
            return Integer.valueOf(mViewConfiguration.getScaledTouchSlop());
        }
    }

    /* renamed from: a */
    public final boolean mo92958a() {
        if (this.f127971f) {
            return true;
        }
        if (this.f127970e || getTranslationY() >= this.f127967b) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(65906);
    }

    public final void setMCanDragUp(boolean z) {
        this.f127990z = z;
    }

    public final void setPeekHeight(float f) {
        this.f127953A = f;
    }

    public final void setPreScrollChangeListener(AbstractC89172b<? super Boolean, C89391z> bVar) {
        this.f127962J = bVar;
    }

    public final void setVisibleChangedListener(AbstractC89172b<? super Boolean, C89391z> bVar) {
        this.f127973h = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.nested.ShareNestedLayout$g */
    public static final class C56114g implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ ShareNestedLayout f127998a;

        static {
            Covode.recordClassIndex(65914);
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56114g(ShareNestedLayout shareNestedLayout) {
            this.f127998a = shareNestedLayout;
        }

        public final void onAnimationCancel(Animator animator) {
            this.f127998a.f127970e = false;
            this.f127998a.mo92959b();
            this.f127998a.setMIsFocus(false);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f127998a.f127970e = false;
            this.f127998a.setVisibility(8);
            this.f127998a.mo92959b();
            this.f127998a.setMIsFocus(false);
        }

        public final void onAnimationStart(Animator animator) {
            AbstractC89172b<? super Boolean, C89391z> bVar;
            if ((this.f127998a.f127971f || (!this.f127998a.f127970e && this.f127998a.getTranslationY() <= this.f127998a.f127967b)) && (bVar = this.f127998a.f127973h) != null) {
                bVar.invoke(false);
            }
            this.f127998a.f127970e = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.nested.ShareNestedLayout$l */
    public static final class C56120l implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ ShareNestedLayout f128004a;

        static {
            Covode.recordClassIndex(65920);
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56120l(ShareNestedLayout shareNestedLayout) {
            this.f128004a = shareNestedLayout;
        }

        public final void onAnimationCancel(Animator animator) {
            this.f128004a.f127971f = false;
            this.f128004a.mo92959b();
            this.f128004a.setMIsFocus(true);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f128004a.f127971f = false;
            this.f128004a.mo92959b();
            this.f128004a.setMIsFocus(true);
        }

        public final void onAnimationStart(Animator animator) {
            AbstractC89172b<? super Boolean, C89391z> bVar;
            if (!this.f128004a.mo92958a() && (bVar = this.f128004a.f127973h) != null) {
                bVar.invoke(true);
            }
            this.f128004a.setVisibility(0);
            this.f128004a.f127971f = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.nested.ShareNestedLayout$p */
    public static final class C56124p extends AbstractC55865a {

        /* renamed from: a */
        final /* synthetic */ ShareNestedLayout f128008a;

        static {
            Covode.recordClassIndex(65924);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C56124p(ShareNestedLayout shareNestedLayout) {
            this.f128008a = shareNestedLayout;
        }

        @Override // com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.p3229ui.AbstractC55865a
        /* renamed from: a */
        public final void mo92713a(AbstractC55865a.EnumC55866a aVar) {
            boolean z;
            ShareNestedLayout shareNestedLayout = this.f128008a;
            if (aVar == AbstractC55865a.EnumC55866a.EXPANDED) {
                z = true;
            } else {
                z = false;
            }
            shareNestedLayout.f127974i = z;
            if (!C55196f.m100911a(this.f128008a.getContext())) {
                return;
            }
            if (aVar == AbstractC55865a.EnumC55866a.EXPANDED) {
                this.f128008a.getCoordinatorLayout().setPadding(0, 0, 0, 0);
            } else if (aVar == AbstractC55865a.EnumC55866a.COLLAPSED) {
                this.f128008a.getCoordinatorLayout().setPadding(0, 0, 0, C34723i.m70929c());
            }
        }
    }

    public final void setMIsFocus(boolean z) {
        if (this.f127972g ^ z) {
            setFocusable(z);
            setFocusableInTouchMode(z);
            if (z) {
                requestFocus();
            } else {
                clearFocus();
            }
            this.f127972g = z;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.nested.ShareNestedLayout$c */
    public static final class C56110c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ ShareNestedLayout f127994a;

        static {
            Covode.recordClassIndex(65910);
        }

        C56110c(ShareNestedLayout shareNestedLayout) {
            this.f127994a = shareNestedLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            int floatValue = (int) ((Float) animatedValue).floatValue();
            LinearLayout linearLayout = (LinearLayout) this.f127994a.mo92960c();
            C89219l.m154716b(linearLayout, "");
            ViewGroup.LayoutParams layoutParams = linearLayout.getLayoutParams();
            layoutParams.height = floatValue;
            LinearLayout linearLayout2 = (LinearLayout) this.f127994a.mo92960c();
            C89219l.m154716b(linearLayout2, "");
            linearLayout2.setLayoutParams(layoutParams);
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        if (motionEvent.getActionMasked() == 0) {
            this.f127980p = getMAnimating();
        }
        if (this.f127980p && !getMAnimating() && motionEvent.getActionMasked() == 2) {
            motionEvent.setAction(0);
            this.f127980p = false;
        }
        if (getVisibility() == 8) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: a */
    private final void m101993a(int i) {
        if (!getMAnimating()) {
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, View.TRANSLATION_Y, getTranslationY(), 0.0f);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f127967b, (float) i);
            C89219l.m154716b(ofFloat2, "");
            ofFloat2.addUpdateListener(new C56110c(this));
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.setDuration(200L);
            animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
            animatorSet.start();
        }
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public final void onStopNestedScroll(View view) {
        C89219l.m154721d(view, "");
        int f = C34723i.m70933f(getContext());
        float f2 = this.f127953A;
        float f3 = (((float) f) + f2) / 2.0f;
        float f4 = f2 / 2.0f;
        if (!this.f127990z) {
            float f5 = this.f127967b;
            if (getTranslationY() * 2.0f > f5) {
                mo92957a(false, false);
            } else {
                m101993a((int) f5);
            }
        } else if (this.f127967b - getTranslationY() > f3) {
            m101993a(f);
        } else if (this.f127967b - getTranslationY() < f4) {
            mo92957a(false, false);
        } else {
            m101993a((int) this.f127953A);
        }
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        if (motionEvent.getActionMasked() == 0) {
            mo92959b();
            float x = motionEvent.getX();
            this.f127981q = x;
            this.f127983s = x;
            float y = motionEvent.getY();
            this.f127982r = y;
            this.f127984t = y;
            this.f127985u = motionEvent.getRawX();
            this.f127986v = motionEvent.getRawY();
            getMVelocityTracker().clear();
            getMVelocityTracker().addMovement(motionEvent);
            View mPlaceholder = getMPlaceholder();
            C89219l.m154716b(mPlaceholder, "");
            this.f127960H = m101994a(mPlaceholder, motionEvent);
            RecyclerView mScrollingChild = getMScrollingChild();
            C89219l.m154716b(mScrollingChild, "");
            setMTouchScrollingChild(m101994a(mScrollingChild, motionEvent));
        }
        if (getMAnimating()) {
            return true;
        }
        if (getVisibility() != 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 3) {
            mo92959b();
        }
        if (motionEvent.getActionMasked() == 1) {
            mo92959b();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f127965M = this.f127974i;
            if (this.f127960H) {
                return false;
            }
        } else if (actionMasked == 2) {
            if (this.f127960H) {
                return false;
            }
            float y2 = this.f127984t - motionEvent.getY();
            if (this.f127990z && this.f127968c > 0.0f && Math.abs(y2) > ((float) getMTouchSlop()) && y2 > 0.0f) {
                this.f127988x = true;
                return true;
            } else if (this.f127965M && !getMScrollingChild().canScrollVertically(-1) && Math.abs(y2) > ((float) getMTouchSlop()) && y2 < 0.0f) {
                this.f127988x = true;
                return true;
            } else if (!getMTouchScrollingChild() && (this.f127988x || Math.abs(y2) > ((float) getMTouchSlop()))) {
                this.f127988x = true;
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        if (getMAnimating()) {
            return true;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            VelocityTracker mVelocityTracker = getMVelocityTracker();
            mVelocityTracker.computeCurrentVelocity(1000, getMMaximumVelocity());
            if (Math.abs(mVelocityTracker.getYVelocity()) > getMMinimumVelocity() && !getMAnimating()) {
                if (this.f127987w >= 0.0f) {
                    mo92957a(false, false);
                } else if (this.f127990z) {
                    m101993a(C34723i.m70933f(getContext()));
                }
                mo92959b();
            }
            onStopNestedScroll(this);
            mo92959b();
        } else if (actionMasked == 2) {
            getMVelocityTracker().addMovement(motionEvent);
            float rawX = this.f127985u - motionEvent.getRawX();
            float rawY = this.f127986v - motionEvent.getRawY();
            this.f127987w = motionEvent.getRawY() - this.f127986v;
            this.f127985u = motionEvent.getRawX();
            this.f127986v = motionEvent.getRawY();
            if (this.f127988x || Math.abs(rawY) > ((float) getMTouchSlop())) {
                this.f127988x = true;
                RecyclerView mScrollingChild = getMScrollingChild();
                C89219l.m154716b(mScrollingChild, "");
                onNestedPreScroll(mScrollingChild, (int) rawX, (int) rawY, new int[]{0, 0});
                AbstractC89172b<? super Boolean, C89391z> bVar = this.f127962J;
                if (bVar != null) {
                    bVar.invoke(true);
                }
            }
        } else if (actionMasked == 3) {
            onStopNestedScroll(this);
            mo92959b();
        }
        return true;
    }

    /* renamed from: a */
    public final void mo92956a(boolean z, float f) {
        this.f127990z = z;
        if (z && f != 0.0f) {
            this.f127953A = f;
        }
    }

    /* renamed from: a */
    private final boolean m101994a(View view, MotionEvent motionEvent) {
        if (view.getVisibility() != 0) {
            return false;
        }
        C0693f.C0696c<Rect> cVar = f127950N;
        Rect acquire = cVar.acquire();
        if (acquire == null) {
            acquire = new Rect();
        }
        C80593iw.m139731a(this, view, acquire);
        try {
            boolean contains = acquire.contains((int) motionEvent.getX(), (int) motionEvent.getY());
            acquire.setEmpty();
            cVar.release(acquire);
            return contains;
        } catch (Throwable th) {
            acquire.setEmpty();
            f127950N.release(acquire);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        MethodCollector.m26663i(1068);
        super.onMeasure(i, i2);
        View mPlaceholder = getMPlaceholder();
        C89219l.m154716b(mPlaceholder, "");
        this.f127968c = (float) mPlaceholder.getMeasuredHeight();
        float measuredHeight = (float) getMeasuredHeight();
        View mPlaceholder2 = getMPlaceholder();
        C89219l.m154716b(mPlaceholder2, "");
        this.f127967b = measuredHeight - ((float) mPlaceholder2.getMeasuredHeight());
        MethodCollector.m26664o(1068);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo92957a(boolean r7, boolean r8) {
        /*
        // Method dump skipped, instructions count: 146
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3245ui.nested.ShareNestedLayout.mo92957a(boolean, boolean):void");
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.share.ui.nested.ShareNestedLayout$a */
    public static final class C56108a extends AbstractC89247c<Boolean> {

        /* renamed from: a */
        final /* synthetic */ Object f127992a;

        /* renamed from: b */
        final /* synthetic */ ShareNestedLayout f127993b;

        static {
            Covode.recordClassIndex(65908);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56108a(Object obj, Object obj2, ShareNestedLayout shareNestedLayout) {
            super(obj2);
            this.f127992a = obj;
            this.f127993b = shareNestedLayout;
        }

        @Override // p4600h.p4616h.AbstractC89247c
        /* renamed from: a */
        public final void mo10399a(AbstractC89286i<?> iVar, Boolean bool, Boolean bool2) {
            boolean z;
            C89219l.m154721d(iVar, "");
            if (bool2.booleanValue() ^ bool.booleanValue()) {
                ShareNestedLayout shareNestedLayout = this.f127993b;
                if (shareNestedLayout.getMScrollingChild().computeVerticalScrollExtent() >= this.f127993b.getMScrollingChild().computeVerticalScrollRange()) {
                    z = true;
                } else {
                    z = false;
                }
                shareNestedLayout.f127969d = z;
            }
        }
    }

    private /* synthetic */ ShareNestedLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public final boolean onNestedPreFling(View view, float f, float f2) {
        boolean z;
        C89219l.m154721d(view, "");
        if ((view instanceof AbstractC0790t) && ((AbstractC0790t) view).computeVerticalScrollOffset() != 0) {
            return false;
        }
        if (f2 > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        mo92957a(z, false);
        return true;
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(view2, "");
        if (!(view2 instanceof AbstractC0780j) || (i & 2) == 0) {
            return false;
        }
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ShareNestedLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(1501);
        this.f127975k = C89250i.m154773a((AbstractC89171a) new C56123o(context));
        this.f127976l = C89250i.m154773a((AbstractC89171a) new C56121m(this));
        this.f127977m = C89250i.m154773a((AbstractC89171a) new C56116i(context));
        this.f127978n = C89250i.m154773a((AbstractC89171a) new C56115h(this));
        this.f127979o = C89250i.m154773a((AbstractC89171a) C56122n.f128006a);
        this.f127990z = true;
        this.f127954B = new C56108a(false, false, this);
        this.f127955C = C89250i.m154773a((AbstractC89171a) new C56117j(this));
        this.f127956D = C89250i.m154773a((AbstractC89171a) new C56113f(this));
        this.f127957E = C89250i.m154773a((AbstractC89171a) new C56111d(this));
        this.f127958F = C89250i.m154773a((AbstractC89171a) new C56112e(this));
        this.f127961I = C89250i.m154773a((AbstractC89171a) new C56119k(this));
        this.f127963K = new C56120l(this);
        this.f127964L = new C56114g(this);
        this.f127974i = true;
        setMIsFocus(true);
        setOnKeyListener(new View.OnKeyListener(this) {
            /* class com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3245ui.nested.ShareNestedLayout.View$OnKeyListenerC561071 */

            /* renamed from: a */
            final /* synthetic */ ShareNestedLayout f127991a;

            static {
                Covode.recordClassIndex(65907);
            }

            {
                this.f127991a = r1;
            }

            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (!this.f127991a.mo92958a() || i != 4) {
                    return false;
                }
                C89219l.m154716b(keyEvent, "");
                if (keyEvent.getAction() == 1) {
                    this.f127991a.mo92957a(false, true);
                }
                return true;
            }
        });
        MethodCollector.m26664o(1501);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0096, code lost:
        if (r0 == null) goto L_0x0098;
     */
    @Override // androidx.core.p037h.AbstractC0784n
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onNestedPreScroll(android.view.View r6, int r7, int r8, int[] r9) {
        /*
        // Method dump skipped, instructions count: 220
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.p3070im.sdk.share.p3245ui.nested.ShareNestedLayout.onNestedPreScroll(android.view.View, int, int, int[]):void");
    }
}
