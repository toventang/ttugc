package com.p2082ss.android.ugc.aweme.discover.p2797ui.Dialog;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.p036g.C0693f;
import androidx.core.p037h.AbstractC0780j;
import androidx.core.p037h.AbstractC0784n;
import androidx.core.p037h.AbstractC0790t;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.adaptation.C33403c;
import com.p2082ss.android.ugc.aweme.app.p2321b.C33716a;
import com.p2082ss.android.ugc.aweme.base.utils.C34728n;
import com.p2082ss.android.ugc.aweme.feed.AbstractC48309ae;
import com.p2082ss.android.ugc.aweme.utils.C80593iw;
import com.p2082ss.android.ugc.trill.R;
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

/* renamed from: com.ss.android.ugc.aweme.discover.ui.Dialog.SearchNestedLayout */
public final class SearchNestedLayout extends LinearLayout implements AbstractC0784n {

    /* renamed from: K */
    private static final C0693f.C0696c<Rect> f99207K = new C0693f.C0696c<>(12);

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f99208a = {new C89225r(SearchNestedLayout.class, "mTouchScrollingChild", "getMTouchScrollingChild()Z", 0)};

    /* renamed from: h */
    public static final C42542b f99209h = new C42542b((byte) 0);

    /* renamed from: A */
    private final AbstractC89244h f99210A;

    /* renamed from: B */
    private final AbstractC89244h f99211B;

    /* renamed from: C */
    private boolean f99212C;

    /* renamed from: D */
    private final AbstractC89244h f99213D;

    /* renamed from: E */
    private AbstractC89172b<? super Boolean, C89391z> f99214E;

    /* renamed from: F */
    private final C42550i f99215F;

    /* renamed from: G */
    private final C42544d f99216G;

    /* renamed from: H */
    private final boolean f99217H;

    /* renamed from: I */
    private int f99218I;

    /* renamed from: J */
    private int f99219J;

    /* renamed from: b */
    public float f99220b;

    /* renamed from: c */
    public boolean f99221c;

    /* renamed from: d */
    public boolean f99222d;

    /* renamed from: e */
    public boolean f99223e;

    /* renamed from: f */
    public boolean f99224f;

    /* renamed from: g */
    public AbstractC89172b<? super Boolean, C89391z> f99225g;

    /* renamed from: i */
    private final AbstractC89244h f99226i;

    /* renamed from: j */
    private final AbstractC89244h f99227j;

    /* renamed from: k */
    private final AbstractC89244h f99228k;

    /* renamed from: l */
    private final AbstractC89244h f99229l;

    /* renamed from: m */
    private final AbstractC89244h f99230m;

    /* renamed from: n */
    private boolean f99231n;

    /* renamed from: o */
    private float f99232o;

    /* renamed from: p */
    private float f99233p;

    /* renamed from: q */
    private float f99234q;

    /* renamed from: r */
    private float f99235r;

    /* renamed from: s */
    private float f99236s;

    /* renamed from: t */
    private float f99237t;

    /* renamed from: u */
    private boolean f99238u;

    /* renamed from: v */
    private ObjectAnimator f99239v;

    /* renamed from: w */
    private AbstractC48309ae f99240w;

    /* renamed from: x */
    private AbstractC42556c f99241x;

    /* renamed from: y */
    private View.OnClickListener f99242y;

    /* renamed from: z */
    private final AbstractC89249e f99243z;

    public SearchNestedLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final View getMCommentBgContainer() {
        return (View) this.f99211B.getValue();
    }

    private final float getMMaximumVelocity() {
        return ((Number) this.f99229l.getValue()).floatValue();
    }

    private final float getMMinimumVelocity() {
        return ((Number) this.f99228k.getValue()).floatValue();
    }

    private final ViewGroup getMPlaceholder() {
        return (ViewGroup) this.f99210A.getValue();
    }

    private final boolean getMTouchScrollingChild() {
        return ((Boolean) this.f99243z.mo23374a(this, f99208a[0])).booleanValue();
    }

    private final int getMTouchSlop() {
        return ((Number) this.f99227j.getValue()).intValue();
    }

    private final VelocityTracker getMVelocityTracker() {
        return (VelocityTracker) this.f99230m.getValue();
    }

    private final void setMTouchScrollingChild(boolean z) {
        this.f99243z.mo143655a(f99208a[0], Boolean.valueOf(z));
    }

    public final NestedScrollingChildFrameLayout getMScrollingChild() {
        return (NestedScrollingChildFrameLayout) this.f99213D.getValue();
    }

    public final ViewConfiguration getMViewConfiguration() {
        return (ViewConfiguration) this.f99226i.getValue();
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

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.Dialog.SearchNestedLayout$b */
    public static final class C42542b {
        static {
            Covode.recordClassIndex(50637);
        }

        private C42542b() {
        }

        public /* synthetic */ C42542b(byte b) {
            this();
        }
    }

    public final boolean getHaveBangs() {
        return this.f99217H;
    }

    public final int getHeightOffset() {
        return this.f99219J;
    }

    public final AbstractC48309ae getMOnShowHeightChangeListener() {
        return this.f99240w;
    }

    public final int getNotchHeight() {
        return this.f99218I;
    }

    public final View.OnClickListener getOnCancelListener() {
        return this.f99242y;
    }

    public final AbstractC42556c getOnDialogListener() {
        return this.f99241x;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.Dialog.SearchNestedLayout$k */
    static final class C42552k extends AbstractC89220m implements AbstractC89171a<VelocityTracker> {

        /* renamed from: a */
        public static final C42552k f99256a = new C42552k();

        static {
            Covode.recordClassIndex(50647);
        }

        C42552k() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ VelocityTracker invoke() {
            return VelocityTracker.obtain();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.Dialog.SearchNestedLayout$l */
    static final class C42553l extends AbstractC89220m implements AbstractC89171a<ViewConfiguration> {

        /* renamed from: a */
        final /* synthetic */ Context f99257a;

        static {
            Covode.recordClassIndex(50648);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42553l(Context context) {
            super(0);
            this.f99257a = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ViewConfiguration invoke() {
            return ViewConfiguration.get(this.f99257a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.Dialog.SearchNestedLayout$c */
    static final class C42543c extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ SearchNestedLayout f99247a;

        static {
            Covode.recordClassIndex(50638);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42543c(SearchNestedLayout searchNestedLayout) {
            super(0);
            this.f99247a = searchNestedLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return this.f99247a.findViewById(R.id.aki);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.Dialog.SearchNestedLayout$h */
    static final class C42549h extends AbstractC89220m implements AbstractC89171a<NestedScrollingChildFrameLayout> {

        /* renamed from: a */
        final /* synthetic */ SearchNestedLayout f99253a;

        static {
            Covode.recordClassIndex(50644);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42549h(SearchNestedLayout searchNestedLayout) {
            super(0);
            this.f99253a = searchNestedLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ NestedScrollingChildFrameLayout invoke() {
            return this.f99253a.findViewById(R.id.akp);
        }
    }

    private final boolean getMAnimating() {
        if (this.f99222d || this.f99223e) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo72691b() {
        this.f99238u = false;
        setMTouchScrollingChild(false);
        this.f99212C = false;
        this.f99237t = 0.0f;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.Dialog.SearchNestedLayout$e */
    static final class C42545e extends AbstractC89220m implements AbstractC89171a<Float> {

        /* renamed from: a */
        final /* synthetic */ SearchNestedLayout f99249a;

        static {
            Covode.recordClassIndex(50640);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42545e(SearchNestedLayout searchNestedLayout) {
            super(0);
            this.f99249a = searchNestedLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Float invoke() {
            ViewConfiguration mViewConfiguration = this.f99249a.getMViewConfiguration();
            C89219l.m154716b(mViewConfiguration, "");
            return Float.valueOf((float) mViewConfiguration.getScaledMaximumFlingVelocity());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.Dialog.SearchNestedLayout$f */
    static final class C42546f extends AbstractC89220m implements AbstractC89171a<Float> {

        /* renamed from: a */
        final /* synthetic */ SearchNestedLayout f99250a;

        static {
            Covode.recordClassIndex(50641);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42546f(SearchNestedLayout searchNestedLayout) {
            super(0);
            this.f99250a = searchNestedLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Float invoke() {
            ViewConfiguration mViewConfiguration = this.f99250a.getMViewConfiguration();
            C89219l.m154716b(mViewConfiguration, "");
            return Float.valueOf((float) mViewConfiguration.getScaledMinimumFlingVelocity());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.Dialog.SearchNestedLayout$g */
    static final class C42547g extends AbstractC89220m implements AbstractC89171a<ViewGroup> {

        /* renamed from: a */
        final /* synthetic */ SearchNestedLayout f99251a;

        static {
            Covode.recordClassIndex(50642);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42547g(SearchNestedLayout searchNestedLayout) {
            super(0);
            this.f99251a = searchNestedLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ViewGroup invoke() {
            ViewGroup viewGroup = (ViewGroup) this.f99251a.findViewById(R.id.cy3);
            viewGroup.setOnClickListener(new View$OnClickListenerC42548a(this));
            return viewGroup;
        }

        /* renamed from: com.ss.android.ugc.aweme.discover.ui.Dialog.SearchNestedLayout$g$a */
        static final class View$OnClickListenerC42548a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C42547g f99252a;

            static {
                Covode.recordClassIndex(50643);
            }

            View$OnClickListenerC42548a(C42547g gVar) {
                this.f99252a = gVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f99252a.f99251a.mo72689a(false, true);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.Dialog.SearchNestedLayout$j */
    static final class C42551j extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ SearchNestedLayout f99255a;

        static {
            Covode.recordClassIndex(50646);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C42551j(SearchNestedLayout searchNestedLayout) {
            super(0);
            this.f99255a = searchNestedLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            ViewConfiguration mViewConfiguration = this.f99255a.getMViewConfiguration();
            C89219l.m154716b(mViewConfiguration, "");
            return Integer.valueOf(mViewConfiguration.getScaledTouchSlop());
        }
    }

    /* renamed from: a */
    public final boolean mo72690a() {
        if (this.f99223e) {
            return true;
        }
        if (this.f99222d || getTranslationY() >= this.f99220b) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(50634);
    }

    public final void setHeightOffset(int i) {
        this.f99219J = i;
    }

    public final void setMOnShowHeightChangeListener(AbstractC48309ae aeVar) {
        this.f99240w = aeVar;
    }

    public final void setNotchHeight(int i) {
        this.f99218I = i;
    }

    public final void setOnCancelListener(View.OnClickListener onClickListener) {
        this.f99242y = onClickListener;
    }

    public final void setOnDialogListener(AbstractC42556c cVar) {
        this.f99241x = cVar;
    }

    public final void setPreScrollChangeListener(AbstractC89172b<? super Boolean, C89391z> bVar) {
        this.f99214E = bVar;
    }

    public final void setVisibleChangedListener(AbstractC89172b<? super Boolean, C89391z> bVar) {
        this.f99225g = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.Dialog.SearchNestedLayout$d */
    public static final class C42544d implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ SearchNestedLayout f99248a;

        static {
            Covode.recordClassIndex(50639);
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C42544d(SearchNestedLayout searchNestedLayout) {
            this.f99248a = searchNestedLayout;
        }

        public final void onAnimationCancel(Animator animator) {
            this.f99248a.f99222d = false;
            this.f99248a.mo72691b();
            this.f99248a.setMIsFocus(false);
            AbstractC42556c onDialogListener = this.f99248a.getOnDialogListener();
            if (onDialogListener != null) {
                onDialogListener.mo72726a(false);
            }
        }

        public final void onAnimationEnd(Animator animator) {
            this.f99248a.f99222d = false;
            this.f99248a.setVisibility(8);
            this.f99248a.mo72691b();
            this.f99248a.setMIsFocus(false);
            AbstractC42556c onDialogListener = this.f99248a.getOnDialogListener();
            if (onDialogListener != null) {
                onDialogListener.mo72726a(false);
            }
            View.OnClickListener onCancelListener = this.f99248a.getOnCancelListener();
            if (onCancelListener != null) {
                onCancelListener.onClick(this.f99248a);
            }
        }

        public final void onAnimationStart(Animator animator) {
            AbstractC89172b<? super Boolean, C89391z> bVar;
            if ((this.f99248a.f99223e || (!this.f99248a.f99222d && this.f99248a.getTranslationY() <= this.f99248a.f99220b)) && (bVar = this.f99248a.f99225g) != null) {
                bVar.invoke(false);
            }
            this.f99248a.f99222d = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.Dialog.SearchNestedLayout$i */
    public static final class C42550i implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ SearchNestedLayout f99254a;

        static {
            Covode.recordClassIndex(50645);
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C42550i(SearchNestedLayout searchNestedLayout) {
            this.f99254a = searchNestedLayout;
        }

        public final void onAnimationCancel(Animator animator) {
            this.f99254a.f99223e = false;
            this.f99254a.mo72691b();
            this.f99254a.setMIsFocus(true);
            AbstractC42556c onDialogListener = this.f99254a.getOnDialogListener();
            if (onDialogListener != null) {
                onDialogListener.mo72726a(true);
            }
        }

        public final void onAnimationEnd(Animator animator) {
            this.f99254a.f99223e = false;
            this.f99254a.mo72691b();
            this.f99254a.setMIsFocus(true);
            AbstractC42556c onDialogListener = this.f99254a.getOnDialogListener();
            if (onDialogListener != null) {
                onDialogListener.mo72726a(true);
            }
        }

        public final void onAnimationStart(Animator animator) {
            AbstractC89172b<? super Boolean, C89391z> bVar;
            if (!this.f99254a.mo72690a() && (bVar = this.f99254a.f99225g) != null) {
                bVar.invoke(true);
            }
            this.f99254a.setVisibility(0);
            this.f99254a.f99223e = true;
        }
    }

    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        AbstractC48309ae aeVar = this.f99240w;
        if (aeVar != null) {
            float f2 = this.f99220b;
            aeVar.mo72728a(f2 - f, f2);
        }
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public final void onStopNestedScroll(View view) {
        boolean z;
        C89219l.m154721d(view, "");
        getTranslationY();
        getTranslationY();
        if (getTranslationY() * 2.0f < this.f99220b) {
            z = true;
        } else {
            z = false;
        }
        mo72689a(z, false);
    }

    public final void setMIsFocus(boolean z) {
        if (this.f99224f ^ z) {
            setFocusable(z);
            setFocusableInTouchMode(z);
            if (z) {
                requestFocus();
            } else {
                clearFocus();
            }
            this.f99224f = z;
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        if (motionEvent.getActionMasked() == 0) {
            this.f99231n = getMAnimating();
        }
        if (this.f99231n && !getMAnimating() && motionEvent.getActionMasked() == 2) {
            motionEvent.setAction(0);
            this.f99231n = false;
        }
        if (getVisibility() == 8) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        if (motionEvent.getActionMasked() == 0) {
            mo72691b();
            float x = motionEvent.getX();
            this.f99232o = x;
            this.f99234q = x;
            float y = motionEvent.getY();
            this.f99233p = y;
            this.f99235r = y;
            this.f99236s = motionEvent.getRawY();
            getMVelocityTracker().clear();
            getMVelocityTracker().addMovement(motionEvent);
            ViewGroup mPlaceholder = getMPlaceholder();
            C89219l.m154716b(mPlaceholder, "");
            this.f99212C = m85043a(mPlaceholder, motionEvent);
            NestedScrollingChildFrameLayout mScrollingChild = getMScrollingChild();
            C89219l.m154716b(mScrollingChild, "");
            setMTouchScrollingChild(m85043a(mScrollingChild, motionEvent));
        }
        if (getMAnimating()) {
            return true;
        }
        if (getVisibility() != 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 3) {
            mo72691b();
        }
        if (motionEvent.getActionMasked() == 1) {
            mo72691b();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 2) {
                if (this.f99212C) {
                    return false;
                }
                float y2 = this.f99235r - motionEvent.getY();
                if (!getMTouchScrollingChild() && (this.f99238u || Math.abs(y2) > ((float) getMTouchSlop()))) {
                    this.f99238u = true;
                    return true;
                }
            }
        } else if (this.f99212C) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        C89219l.m154721d(motionEvent, "");
        if (getMAnimating()) {
            return true;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            VelocityTracker mVelocityTracker = getMVelocityTracker();
            mVelocityTracker.computeCurrentVelocity(1000, getMMaximumVelocity());
            if (Math.abs(mVelocityTracker.getYVelocity()) <= getMMinimumVelocity() || getMAnimating()) {
                onStopNestedScroll(this);
            } else {
                if (this.f99237t < 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                mo72689a(z, false);
            }
            mo72691b();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                onStopNestedScroll(this);
                mo72691b();
            }
        } else if (!getMTouchScrollingChild()) {
            getMVelocityTracker().addMovement(motionEvent);
            float x = this.f99232o - motionEvent.getX();
            float y = this.f99233p - motionEvent.getY();
            if (this.f99238u || Math.abs(y) > ((float) getMTouchSlop())) {
                this.f99238u = true;
                NestedScrollingChildFrameLayout mScrollingChild = getMScrollingChild();
                C89219l.m154716b(mScrollingChild, "");
                onNestedPreScroll(mScrollingChild, (int) x, (int) y, new int[]{0, 0});
                AbstractC89172b<? super Boolean, C89391z> bVar = this.f99214E;
                if (bVar != null) {
                    bVar.invoke(true);
                }
            }
            this.f99237t = motionEvent.getRawY() - this.f99236s;
            this.f99236s = motionEvent.getRawY();
        }
        return true;
    }

    /* renamed from: a */
    private final boolean m85043a(View view, MotionEvent motionEvent) {
        if (view.getVisibility() != 0) {
            return false;
        }
        C0693f.C0696c<Rect> cVar = f99207K;
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
            f99207K.release(acquire);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        MethodCollector.m26663i(7589);
        super.onMeasure(i, i2);
        ViewGroup mPlaceholder = getMPlaceholder();
        C89219l.m154716b(mPlaceholder, "");
        this.f99220b = ((float) getMeasuredHeight()) - ((float) mPlaceholder.getMeasuredHeight());
        MethodCollector.m26664o(7589);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0031  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo72689a(boolean r7, boolean r8) {
        /*
        // Method dump skipped, instructions count: 168
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.discover.p2797ui.Dialog.SearchNestedLayout.mo72689a(boolean, boolean):void");
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.Dialog.SearchNestedLayout$a */
    public static final class C42541a extends AbstractC89247c<Boolean> {

        /* renamed from: a */
        final /* synthetic */ Object f99245a;

        /* renamed from: b */
        final /* synthetic */ SearchNestedLayout f99246b;

        static {
            Covode.recordClassIndex(50636);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C42541a(Object obj, Object obj2, SearchNestedLayout searchNestedLayout) {
            super(obj2);
            this.f99245a = obj;
            this.f99246b = searchNestedLayout;
        }

        @Override // p4600h.p4616h.AbstractC89247c
        /* renamed from: a */
        public final void mo10399a(AbstractC89286i<?> iVar, Boolean bool, Boolean bool2) {
            boolean z;
            C89219l.m154721d(iVar, "");
            if (bool2.booleanValue() ^ bool.booleanValue()) {
                SearchNestedLayout searchNestedLayout = this.f99246b;
                if (searchNestedLayout.getMScrollingChild().computeVerticalScrollExtent() >= this.f99246b.getMScrollingChild().computeVerticalScrollRange()) {
                    z = true;
                } else {
                    z = false;
                }
                searchNestedLayout.f99221c = z;
            }
        }
    }

    private /* synthetic */ SearchNestedLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
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

    @Override // androidx.core.p037h.AbstractC0784n
    public final boolean onNestedPreFling(View view, float f, float f2) {
        boolean z;
        C89219l.m154721d(view, "");
        if ((view instanceof AbstractC0790t) && ((AbstractC0790t) view).computeVerticalScrollOffset() != 0) {
            return false;
        }
        if (getTranslationY() * 2.0f < this.f99220b) {
            z = true;
        } else {
            z = false;
        }
        mo72689a(z, false);
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private SearchNestedLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        boolean z = false;
        MethodCollector.m26663i(7768);
        this.f99226i = C89250i.m154773a((AbstractC89171a) new C42553l(context));
        this.f99227j = C89250i.m154773a((AbstractC89171a) new C42551j(this));
        this.f99228k = C89250i.m154773a((AbstractC89171a) new C42546f(this));
        this.f99229l = C89250i.m154773a((AbstractC89171a) new C42545e(this));
        this.f99230m = C89250i.m154773a((AbstractC89171a) C42552k.f99256a);
        this.f99243z = new C42541a(false, false, this);
        this.f99210A = C89250i.m154773a((AbstractC89171a) new C42547g(this));
        this.f99211B = C89250i.m154773a((AbstractC89171a) new C42543c(this));
        this.f99213D = C89250i.m154773a((AbstractC89171a) new C42549h(this));
        this.f99215F = new C42550i(this);
        this.f99216G = new C42544d(this);
        setMIsFocus(true);
        setOnKeyListener(new View.OnKeyListener(this) {
            /* class com.p2082ss.android.ugc.aweme.discover.p2797ui.Dialog.SearchNestedLayout.View$OnKeyListenerC425401 */

            /* renamed from: a */
            final /* synthetic */ SearchNestedLayout f99244a;

            static {
                Covode.recordClassIndex(50635);
            }

            {
                this.f99244a = r1;
            }

            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (!this.f99244a.mo72690a() || i != 4) {
                    return false;
                }
                C89219l.m154716b(keyEvent, "");
                if (keyEvent.getAction() == 1) {
                    this.f99244a.mo72689a(false, true);
                }
                return true;
            }
        });
        if (C33716a.m69034a(getContext()) && C33403c.f79377m == 0) {
            z = true;
        }
        this.f99217H = z;
        this.f99218I = C33403c.m68511d(context);
        this.f99219J = C34728n.m70946a(8.0d);
        MethodCollector.m26664o(7768);
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        int i3;
        C89219l.m154721d(view, "");
        C89219l.m154721d(iArr, "");
        float translationY = getTranslationY();
        float f = 0.0f;
        if (translationY > 0.0f) {
            float f2 = translationY - ((float) i2);
            if (f2 >= 0.0f) {
                f = f2;
            }
            float f3 = this.f99220b;
            if (f > f3) {
                f = f3;
            }
            setTranslationY(f);
            if (getMTouchScrollingChild()) {
                iArr[1] = iArr[1] + i2;
            }
        } else if (translationY == 0.0f) {
            if (view instanceof AbstractC0790t) {
                i3 = ((AbstractC0790t) view).computeVerticalScrollOffset();
            } else {
                i3 = 0;
            }
            if (i2 < 0 && (i3 == 0 || !getMTouchScrollingChild())) {
                float f4 = translationY - ((float) i2);
                float f5 = this.f99220b;
                if (f4 > f5) {
                    f4 = f5;
                }
                setTranslationY(f4);
            }
        }
        getMTouchScrollingChild();
    }
}
