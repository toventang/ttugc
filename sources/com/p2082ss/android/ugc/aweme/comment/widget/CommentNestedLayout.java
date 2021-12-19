package com.p2082ss.android.ugc.aweme.comment.widget;

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
import android.widget.LinearLayout;
import androidx.core.p036g.C0693f;
import androidx.core.p037h.AbstractC0780j;
import androidx.core.p037h.AbstractC0784n;
import androidx.core.p037h.AbstractC0790t;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.p757v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.adaptation.C33403c;
import com.p2082ss.android.ugc.aweme.app.p2321b.C33716a;
import com.p2082ss.android.ugc.aweme.common.widget.scrollablelayout.C39211a;
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

/* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout */
public final class CommentNestedLayout extends LinearLayout implements AbstractC0784n {

    /* renamed from: L */
    private static final C0693f.C0696c<Rect> f87894L = new C0693f.C0696c<>(12);

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f87895a = {new C89225r(CommentNestedLayout.class, "mTouchScrollingChild", "getMTouchScrollingChild()Z", 0)};

    /* renamed from: i */
    public static final C37279b f87896i = new C37279b((byte) 0);

    /* renamed from: A */
    private final AbstractC89244h f87897A;

    /* renamed from: B */
    private View f87898B;

    /* renamed from: C */
    private final AbstractC89244h f87899C;

    /* renamed from: D */
    private C39211a.AbstractC39212a f87900D;

    /* renamed from: E */
    private boolean f87901E;

    /* renamed from: F */
    private final AbstractC89244h f87902F;

    /* renamed from: G */
    private AbstractC89172b<? super Boolean, C89391z> f87903G;

    /* renamed from: H */
    private final C37288j f87904H;

    /* renamed from: I */
    private final C37282e f87905I;

    /* renamed from: J */
    private final boolean f87906J;

    /* renamed from: K */
    private int f87907K;

    /* renamed from: b */
    public float f87908b;

    /* renamed from: c */
    public AbstractC48309ae f87909c;

    /* renamed from: d */
    public boolean f87910d;

    /* renamed from: e */
    public boolean f87911e;

    /* renamed from: f */
    public boolean f87912f;

    /* renamed from: g */
    public boolean f87913g;

    /* renamed from: h */
    public AbstractC89172b<? super Boolean, C89391z> f87914h;

    /* renamed from: j */
    private final AbstractC89244h f87915j;

    /* renamed from: k */
    private final AbstractC89244h f87916k;

    /* renamed from: l */
    private final AbstractC89244h f87917l;

    /* renamed from: m */
    private final AbstractC89244h f87918m;

    /* renamed from: n */
    private final AbstractC89244h f87919n;

    /* renamed from: o */
    private boolean f87920o;

    /* renamed from: p */
    private float f87921p;

    /* renamed from: q */
    private float f87922q;

    /* renamed from: r */
    private float f87923r;

    /* renamed from: s */
    private float f87924s;

    /* renamed from: t */
    private float f87925t;

    /* renamed from: u */
    private float f87926u;

    /* renamed from: v */
    private boolean f87927v;

    /* renamed from: w */
    private ObjectAnimator f87928w;

    /* renamed from: x */
    private boolean f87929x;

    /* renamed from: y */
    private final AbstractC89249e f87930y;

    /* renamed from: z */
    private final AbstractC89244h f87931z;

    public CommentNestedLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private final View getMCommentBgContainer() {
        return (View) this.f87897A.getValue();
    }

    private final View getMCommentListContainer() {
        return (View) this.f87899C.getValue();
    }

    private final float getMMaximumVelocity() {
        return ((Number) this.f87918m.getValue()).floatValue();
    }

    private final float getMMinimumVelocity() {
        return ((Number) this.f87917l.getValue()).floatValue();
    }

    private final View getMPlaceholder() {
        return (View) this.f87931z.getValue();
    }

    private final RecyclerView getMRecyclerView() {
        return (RecyclerView) this.f87902F.getValue();
    }

    private final boolean getMTouchScrollingChild() {
        return ((Boolean) this.f87930y.mo23374a(this, f87895a[0])).booleanValue();
    }

    private final int getMTouchSlop() {
        return ((Number) this.f87916k.getValue()).intValue();
    }

    private final VelocityTracker getMVelocityTracker() {
        return (VelocityTracker) this.f87919n.getValue();
    }

    private final void setMTouchScrollingChild(boolean z) {
        this.f87930y.mo143655a(f87895a[0], Boolean.valueOf(z));
    }

    public final ViewConfiguration getMViewConfiguration() {
        return (ViewConfiguration) this.f87915j.getValue();
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

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout$b */
    public static final class C37279b {
        static {
            Covode.recordClassIndex(44646);
        }

        private C37279b() {
        }

        public /* synthetic */ C37279b(byte b) {
            this();
        }
    }

    public final boolean getBackFromVideo() {
        return this.f87929x;
    }

    public final boolean getHaveBangs() {
        return this.f87906J;
    }

    public final int getNotchHeight() {
        return this.f87907K;
    }

    public final AbstractC48309ae getOnShowHeightChangeListener() {
        return this.f87909c;
    }

    public final C39211a.AbstractC39212a getScrollableContainer() {
        return this.f87900D;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout$l */
    static final class C37290l extends AbstractC89220m implements AbstractC89171a<VelocityTracker> {

        /* renamed from: a */
        public static final C37290l f87945a = new C37290l();

        static {
            Covode.recordClassIndex(44657);
        }

        C37290l() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ VelocityTracker invoke() {
            return VelocityTracker.obtain();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout$m */
    static final class C37291m extends AbstractC89220m implements AbstractC89171a<ViewConfiguration> {

        /* renamed from: a */
        final /* synthetic */ Context f87946a;

        static {
            Covode.recordClassIndex(44658);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37291m(Context context) {
            super(0);
            this.f87946a = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ViewConfiguration invoke() {
            return ViewConfiguration.get(this.f87946a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout$c */
    static final class C37280c extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ CommentNestedLayout f87935a;

        static {
            Covode.recordClassIndex(44647);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37280c(CommentNestedLayout commentNestedLayout) {
            super(0);
            this.f87935a = commentNestedLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return this.f87935a.findViewById(R.id.b3y);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout$d */
    static final class C37281d extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ CommentNestedLayout f87936a;

        static {
            Covode.recordClassIndex(44648);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37281d(CommentNestedLayout commentNestedLayout) {
            super(0);
            this.f87936a = commentNestedLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            return this.f87936a.findViewById(R.id.cf2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout$i */
    static final class C37287i extends AbstractC89220m implements AbstractC89171a<RecyclerView> {

        /* renamed from: a */
        final /* synthetic */ CommentNestedLayout f87942a;

        static {
            Covode.recordClassIndex(44654);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37287i(CommentNestedLayout commentNestedLayout) {
            super(0);
            this.f87942a = commentNestedLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ RecyclerView invoke() {
            return this.f87942a.findViewById(R.id.dgn);
        }
    }

    private final boolean getMAnimating() {
        if (this.f87911e || this.f87912f) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo64852b() {
        if (!this.f87929x) {
            mo64850a(false, true);
        } else {
            this.f87929x = false;
        }
    }

    /* renamed from: c */
    public final void mo64853c() {
        this.f87927v = false;
        setMTouchScrollingChild(false);
        this.f87901E = false;
        this.f87926u = 0.0f;
    }

    public final View getCommentContainer() {
        if (this.f87898B == null) {
            this.f87898B = findViewById(R.id.b3z);
        }
        return this.f87898B;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout$f */
    static final class C37283f extends AbstractC89220m implements AbstractC89171a<Float> {

        /* renamed from: a */
        final /* synthetic */ CommentNestedLayout f87938a;

        static {
            Covode.recordClassIndex(44650);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37283f(CommentNestedLayout commentNestedLayout) {
            super(0);
            this.f87938a = commentNestedLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Float invoke() {
            ViewConfiguration mViewConfiguration = this.f87938a.getMViewConfiguration();
            C89219l.m154716b(mViewConfiguration, "");
            return Float.valueOf((float) mViewConfiguration.getScaledMaximumFlingVelocity());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout$g */
    static final class C37284g extends AbstractC89220m implements AbstractC89171a<Float> {

        /* renamed from: a */
        final /* synthetic */ CommentNestedLayout f87939a;

        static {
            Covode.recordClassIndex(44651);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37284g(CommentNestedLayout commentNestedLayout) {
            super(0);
            this.f87939a = commentNestedLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Float invoke() {
            ViewConfiguration mViewConfiguration = this.f87939a.getMViewConfiguration();
            C89219l.m154716b(mViewConfiguration, "");
            return Float.valueOf((float) mViewConfiguration.getScaledMinimumFlingVelocity());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout$h */
    static final class C37285h extends AbstractC89220m implements AbstractC89171a<View> {

        /* renamed from: a */
        final /* synthetic */ CommentNestedLayout f87940a;

        static {
            Covode.recordClassIndex(44652);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37285h(CommentNestedLayout commentNestedLayout) {
            super(0);
            this.f87940a = commentNestedLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ View invoke() {
            View findViewById = this.f87940a.findViewById(R.id.a9z);
            findViewById.setOnClickListener(new View$OnClickListenerC37286a(this));
            return findViewById;
        }

        /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout$h$a */
        static final class View$OnClickListenerC37286a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ C37285h f87941a;

            static {
                Covode.recordClassIndex(44653);
            }

            View$OnClickListenerC37286a(C37285h hVar) {
                this.f87941a = hVar;
            }

            public final void onClick(View view) {
                ClickAgent.onClick(view);
                this.f87941a.f87940a.mo64852b();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout$k */
    static final class C37289k extends AbstractC89220m implements AbstractC89171a<Integer> {

        /* renamed from: a */
        final /* synthetic */ CommentNestedLayout f87944a;

        static {
            Covode.recordClassIndex(44656);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37289k(CommentNestedLayout commentNestedLayout) {
            super(0);
            this.f87944a = commentNestedLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ Integer invoke() {
            ViewConfiguration mViewConfiguration = this.f87944a.getMViewConfiguration();
            C89219l.m154716b(mViewConfiguration, "");
            return Integer.valueOf(mViewConfiguration.getScaledTouchSlop());
        }
    }

    /* renamed from: a */
    public final boolean mo64851a() {
        if (this.f87912f) {
            return true;
        }
        if (this.f87911e || getTranslationY() >= this.f87908b) {
            return false;
        }
        return true;
    }

    public final RecyclerView getMScrollingChild() {
        View view;
        C39211a.AbstractC39212a aVar = this.f87900D;
        RecyclerView recyclerView = null;
        if (aVar != null) {
            view = aVar.mo62680m();
        } else {
            view = null;
        }
        if (view instanceof RecyclerView) {
            recyclerView = view;
        }
        RecyclerView recyclerView2 = recyclerView;
        if (recyclerView2 != null) {
            return recyclerView2;
        }
        RecyclerView mRecyclerView = getMRecyclerView();
        C89219l.m154716b(mRecyclerView, "");
        return mRecyclerView;
    }

    static {
        Covode.recordClassIndex(44643);
    }

    public final void setBackFromVideo(boolean z) {
        this.f87929x = z;
    }

    public final void setCommentContainer(View view) {
        this.f87898B = view;
    }

    public final void setNotchHeight(int i) {
        this.f87907K = i;
    }

    public final void setOnShowHeightChangeListener(AbstractC48309ae aeVar) {
        this.f87909c = aeVar;
    }

    public final void setPreScrollChangeListener(AbstractC89172b<? super Boolean, C89391z> bVar) {
        this.f87903G = bVar;
    }

    public final void setScrollableContainer(C39211a.AbstractC39212a aVar) {
        this.f87900D = aVar;
    }

    public final void setVisibleChangedListener(AbstractC89172b<? super Boolean, C89391z> bVar) {
        this.f87914h = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout$e */
    public static final class C37282e implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ CommentNestedLayout f87937a;

        static {
            Covode.recordClassIndex(44649);
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C37282e(CommentNestedLayout commentNestedLayout) {
            this.f87937a = commentNestedLayout;
        }

        public final void onAnimationCancel(Animator animator) {
            this.f87937a.f87911e = false;
            this.f87937a.mo64853c();
            this.f87937a.setMIsFocus(false);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f87937a.f87911e = false;
            this.f87937a.setVisibility(8);
            this.f87937a.mo64853c();
            this.f87937a.setMIsFocus(false);
        }

        public final void onAnimationStart(Animator animator) {
            AbstractC89172b<? super Boolean, C89391z> bVar;
            if ((this.f87937a.f87912f || (!this.f87937a.f87911e && this.f87937a.getTranslationY() <= this.f87937a.f87908b)) && (bVar = this.f87937a.f87914h) != null) {
                bVar.invoke(false);
            }
            this.f87937a.f87911e = true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout$j */
    public static final class C37288j implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ CommentNestedLayout f87943a;

        static {
            Covode.recordClassIndex(44655);
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C37288j(CommentNestedLayout commentNestedLayout) {
            this.f87943a = commentNestedLayout;
        }

        public final void onAnimationCancel(Animator animator) {
            this.f87943a.f87912f = false;
            this.f87943a.mo64853c();
            this.f87943a.setMIsFocus(true);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f87943a.f87912f = false;
            this.f87943a.mo64853c();
            this.f87943a.setMIsFocus(true);
        }

        public final void onAnimationStart(Animator animator) {
            AbstractC89172b<? super Boolean, C89391z> bVar;
            if (!this.f87943a.mo64851a() && (bVar = this.f87943a.f87914h) != null) {
                bVar.invoke(true);
            }
            this.f87943a.setVisibility(0);
            this.f87943a.f87912f = true;
        }
    }

    public final void setTranslationY(float f) {
        super.setTranslationY(f);
        AbstractC48309ae aeVar = this.f87909c;
        if (aeVar != null) {
            float f2 = this.f87908b;
            aeVar.mo72728a(f2 - f, f2);
        }
    }

    @Override // androidx.core.p037h.AbstractC0784n
    public final void onStopNestedScroll(View view) {
        boolean z;
        C89219l.m154721d(view, "");
        if (getTranslationY() * 2.0f < this.f87908b) {
            z = true;
        } else {
            z = false;
        }
        mo64850a(z, false);
    }

    public final void setMIsFocus(boolean z) {
        if (this.f87913g ^ z) {
            setFocusable(z);
            setFocusableInTouchMode(z);
            if (z) {
                requestFocus();
            } else {
                clearFocus();
            }
            this.f87913g = z;
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        if (motionEvent.getActionMasked() == 0) {
            this.f87920o = getMAnimating();
        }
        if (this.f87920o && !getMAnimating() && motionEvent.getActionMasked() == 2) {
            motionEvent.setAction(0);
            this.f87920o = false;
        }
        if (getVisibility() == 8) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: a */
    public final void mo64849a(boolean z) {
        ObjectAnimator objectAnimator;
        AbstractC89172b<? super Boolean, C89391z> bVar;
        if (z && mo64851a() && (bVar = this.f87914h) != null) {
            bVar.invoke(false);
        }
        ObjectAnimator objectAnimator2 = this.f87928w;
        if (!(objectAnimator2 == null || !objectAnimator2.isRunning() || (objectAnimator = this.f87928w) == null)) {
            objectAnimator.cancel();
        }
        setVisibility(8);
        float f = this.f87908b;
        if (f > 0.0f) {
            setTranslationY(f);
        }
        mo64853c();
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        if (motionEvent.getActionMasked() == 0) {
            mo64853c();
            float x = motionEvent.getX();
            this.f87921p = x;
            this.f87923r = x;
            float y = motionEvent.getY();
            this.f87922q = y;
            this.f87924s = y;
            this.f87925t = motionEvent.getRawY();
            getMVelocityTracker().clear();
            getMVelocityTracker().addMovement(motionEvent);
            View mPlaceholder = getMPlaceholder();
            C89219l.m154716b(mPlaceholder, "");
            this.f87901E = m75270a(mPlaceholder, motionEvent);
            setMTouchScrollingChild(m75270a(getMScrollingChild(), motionEvent));
        }
        if (getMAnimating()) {
            return true;
        }
        if (getVisibility() != 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (motionEvent.getActionMasked() == 3) {
            mo64853c();
        }
        if (motionEvent.getActionMasked() == 1) {
            mo64853c();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 2) {
                if (this.f87901E) {
                    return false;
                }
                float y2 = this.f87924s - motionEvent.getY();
                if (!getMTouchScrollingChild() && (this.f87927v || Math.abs(y2) > ((float) getMTouchSlop()))) {
                    this.f87927v = true;
                    return true;
                }
            }
        } else if (this.f87901E) {
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
                if (this.f87926u < 0.0f) {
                    z = true;
                } else {
                    z = false;
                }
                mo64850a(z, false);
            }
            mo64853c();
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                onStopNestedScroll(this);
                mo64853c();
            }
        } else if (!getMTouchScrollingChild()) {
            getMVelocityTracker().addMovement(motionEvent);
            float x = this.f87921p - motionEvent.getX();
            float y = this.f87922q - motionEvent.getY();
            if (this.f87927v || Math.abs(y) > ((float) getMTouchSlop())) {
                this.f87927v = true;
                onNestedPreScroll(getMScrollingChild(), (int) x, (int) y, new int[]{0, 0});
                AbstractC89172b<? super Boolean, C89391z> bVar = this.f87903G;
                if (bVar != null) {
                    bVar.invoke(true);
                }
            }
            this.f87926u = motionEvent.getRawY() - this.f87925t;
            this.f87925t = motionEvent.getRawY();
        }
        return true;
    }

    /* renamed from: a */
    private final boolean m75270a(View view, MotionEvent motionEvent) {
        if (view.getVisibility() != 0) {
            return false;
        }
        C0693f.C0696c<Rect> cVar = f87894L;
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
            f87894L.release(acquire);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        MethodCollector.m26663i(8589);
        super.onMeasure(i, i2);
        View mPlaceholder = getMPlaceholder();
        C89219l.m154716b(mPlaceholder, "");
        this.f87908b = ((float) getMeasuredHeight()) - ((float) mPlaceholder.getMeasuredHeight());
        MethodCollector.m26664o(8589);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64850a(boolean r7, boolean r8) {
        /*
        // Method dump skipped, instructions count: 167
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.comment.widget.CommentNestedLayout.mo64850a(boolean, boolean):void");
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.widget.CommentNestedLayout$a */
    public static final class C37278a extends AbstractC89247c<Boolean> {

        /* renamed from: a */
        final /* synthetic */ Object f87933a;

        /* renamed from: b */
        final /* synthetic */ CommentNestedLayout f87934b;

        static {
            Covode.recordClassIndex(44645);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C37278a(Object obj, Object obj2, CommentNestedLayout commentNestedLayout) {
            super(obj2);
            this.f87933a = obj;
            this.f87934b = commentNestedLayout;
        }

        @Override // p4600h.p4616h.AbstractC89247c
        /* renamed from: a */
        public final void mo10399a(AbstractC89286i<?> iVar, Boolean bool, Boolean bool2) {
            boolean z;
            C89219l.m154721d(iVar, "");
            if (bool2.booleanValue() ^ bool.booleanValue()) {
                CommentNestedLayout commentNestedLayout = this.f87934b;
                if (commentNestedLayout.getMScrollingChild().computeVerticalScrollExtent() >= this.f87934b.getMScrollingChild().computeVerticalScrollRange()) {
                    z = true;
                } else {
                    z = false;
                }
                commentNestedLayout.f87910d = z;
            }
        }
    }

    private /* synthetic */ CommentNestedLayout(Context context, AttributeSet attributeSet, byte b) {
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
        mo64850a(z, false);
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
    private CommentNestedLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        boolean z = false;
        MethodCollector.m26663i(8889);
        this.f87915j = C89250i.m154773a((AbstractC89171a) new C37291m(context));
        this.f87916k = C89250i.m154773a((AbstractC89171a) new C37289k(this));
        this.f87917l = C89250i.m154773a((AbstractC89171a) new C37284g(this));
        this.f87918m = C89250i.m154773a((AbstractC89171a) new C37283f(this));
        this.f87919n = C89250i.m154773a((AbstractC89171a) C37290l.f87945a);
        this.f87930y = new C37278a(false, false, this);
        this.f87931z = C89250i.m154773a((AbstractC89171a) new C37285h(this));
        this.f87897A = C89250i.m154773a((AbstractC89171a) new C37280c(this));
        this.f87899C = C89250i.m154773a((AbstractC89171a) new C37281d(this));
        this.f87902F = C89250i.m154773a((AbstractC89171a) new C37287i(this));
        this.f87904H = new C37288j(this);
        this.f87905I = new C37282e(this);
        setMIsFocus(true);
        setOnKeyListener(new View.OnKeyListener(this) {
            /* class com.p2082ss.android.ugc.aweme.comment.widget.CommentNestedLayout.View$OnKeyListenerC372771 */

            /* renamed from: a */
            final /* synthetic */ CommentNestedLayout f87932a;

            static {
                Covode.recordClassIndex(44644);
            }

            {
                this.f87932a = r1;
            }

            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                if (!this.f87932a.mo64851a() || i != 4) {
                    return false;
                }
                C89219l.m154716b(keyEvent, "");
                if (keyEvent.getAction() == 1) {
                    this.f87932a.mo64852b();
                }
                return true;
            }
        });
        if (C33716a.m69034a(getContext()) && C33403c.f79377m == 0) {
            z = true;
        }
        this.f87906J = z;
        this.f87907K = C33403c.m68511d(context);
        MethodCollector.m26664o(8889);
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
            float f3 = this.f87908b;
            if (f > f3) {
                f = f3;
            }
            setTranslationY(f);
            if (getMTouchScrollingChild() && !this.f87910d) {
                iArr[1] = iArr[1] + i2;
            }
        } else if (translationY == 0.0f) {
            if (view instanceof AbstractC0790t) {
                i3 = ((AbstractC0790t) view).computeVerticalScrollOffset();
            } else {
                i3 = 0;
            }
            if (i2 >= 0) {
                return;
            }
            if (i3 == 0 || !getMTouchScrollingChild()) {
                float f4 = translationY - ((float) i2);
                float f5 = this.f87908b;
                if (f4 > f5) {
                    f4 = f5;
                }
                setTranslationY(f4);
            }
        }
    }
}
