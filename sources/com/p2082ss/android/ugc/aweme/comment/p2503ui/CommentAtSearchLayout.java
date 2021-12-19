package com.p2082ss.android.ugc.aweme.comment.p2503ui;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2385bd.C34791a;
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

/* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentAtSearchLayout */
public final class CommentAtSearchLayout extends FrameLayout {

    /* renamed from: a */
    static final /* synthetic */ AbstractC89286i[] f87135a = {new C89225r(CommentAtSearchLayout.class, "_isShowing", "get_isShowing()Z", 0)};

    /* renamed from: d */
    public static final C36997b f87136d = new C36997b((byte) 0);

    /* renamed from: b */
    public boolean f87137b;

    /* renamed from: c */
    public boolean f87138c;

    /* renamed from: e */
    private ValueAnimator f87139e;

    /* renamed from: f */
    private final AbstractC89249e f87140f;

    /* renamed from: g */
    private int f87141g;

    /* renamed from: h */
    private final AbstractC89244h f87142h;

    /* renamed from: i */
    private AbstractC89172b<? super Boolean, C89391z> f87143i;

    static {
        Covode.recordClassIndex(44347);
    }

    public CommentAtSearchLayout(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public CommentAtSearchLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final boolean get_isShowing() {
        return ((Boolean) this.f87140f.mo23374a(this, f87135a[0])).booleanValue();
    }

    private final void set_isShowing(boolean z) {
        this.f87140f.mo143655a(f87135a[0], Boolean.valueOf(z));
    }

    public final ViewGroup.MarginLayoutParams getMarginLayoutParams() {
        return (ViewGroup.MarginLayoutParams) this.f87142h.getValue();
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentAtSearchLayout$b */
    public static final class C36997b {
        static {
            Covode.recordClassIndex(44349);
        }

        private C36997b() {
        }

        public /* synthetic */ C36997b(byte b) {
            this();
        }
    }

    public final int getAdjustMargin() {
        return this.f87141g;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.f.a.b<? super java.lang.Boolean, h.z>, h.f.a.b<java.lang.Boolean, h.z> */
    public final AbstractC89172b<Boolean, C89391z> getVisibilityChangeListener() {
        return this.f87143i;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentAtSearchLayout$c */
    static final class C36998c extends AbstractC89220m implements AbstractC89171a<ViewGroup.MarginLayoutParams> {

        /* renamed from: a */
        final /* synthetic */ CommentAtSearchLayout f87146a;

        static {
            Covode.recordClassIndex(44350);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36998c(CommentAtSearchLayout commentAtSearchLayout) {
            super(0);
            this.f87146a = commentAtSearchLayout;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // p4600h.p4611f.p4612a.AbstractC89171a
        public final /* synthetic */ ViewGroup.MarginLayoutParams invoke() {
            ViewGroup.LayoutParams layoutParams = this.f87146a.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            return layoutParams;
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f87139e.cancel();
    }

    /* renamed from: a */
    public final void mo64495a() {
        if (!get_isShowing()) {
            set_isShowing(true);
            m74644a(getMarginLayoutParams().bottomMargin, 0);
        }
    }

    /* renamed from: b */
    public final void mo64496b() {
        if (get_isShowing()) {
            set_isShowing(false);
            m74644a(getMarginLayoutParams().bottomMargin, (-getHeight()) - this.f87141g);
        }
    }

    public final void setAnimating(boolean z) {
        this.f87137b = z;
    }

    public final void setClosing(boolean z) {
        this.f87138c = z;
    }

    public final void setVisibilityChangeListener(AbstractC89172b<? super Boolean, C89391z> bVar) {
        this.f87143i = bVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentAtSearchLayout$d */
    public static final class C36999d implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ CommentAtSearchLayout f87147a;

        /* renamed from: b */
        final /* synthetic */ boolean f87148b;

        static {
            Covode.recordClassIndex(44351);
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationCancel(Animator animator) {
            this.f87147a.setClosing(false);
            this.f87147a.setAnimating(false);
        }

        public final void onAnimationEnd(Animator animator) {
            this.f87147a.setClosing(false);
            this.f87147a.setAnimating(false);
        }

        public final void onAnimationStart(Animator animator) {
            if (!this.f87148b) {
                this.f87147a.setClosing(true);
            }
            this.f87147a.setAnimating(true);
        }

        C36999d(CommentAtSearchLayout commentAtSearchLayout, boolean z) {
            this.f87147a = commentAtSearchLayout;
            this.f87148b = z;
        }
    }

    public final void setInitValue(int i) {
        getMarginLayoutParams().bottomMargin = (-i) - this.f87141g;
        requestLayout();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentAtSearchLayout$e */
    public static final class C37000e implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ CommentAtSearchLayout f87149a;

        static {
            Covode.recordClassIndex(44352);
        }

        C37000e(CommentAtSearchLayout commentAtSearchLayout) {
            this.f87149a = commentAtSearchLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ViewGroup.MarginLayoutParams marginLayoutParams = this.f87149a.getMarginLayoutParams();
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            marginLayoutParams.bottomMargin = ((Integer) animatedValue).intValue();
            this.f87149a.requestLayout();
        }
    }

    public final void setAdjustMargin(int i) {
        this.f87141g = i;
        getMarginLayoutParams().bottomMargin = (-getLayoutParams().height) - i;
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom() + i);
        requestLayout();
    }

    /* renamed from: a */
    private final void m74644a(int i, int i2) {
        boolean z;
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f87139e.cancel();
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f87139e = valueAnimator;
        valueAnimator.setIntValues(i, i2);
        this.f87139e.setInterpolator(new C34791a());
        this.f87139e.setDuration(350L);
        this.f87139e.addListener(new C36999d(this, z));
        this.f87139e.addUpdateListener(new C37000e(this));
        this.f87139e.start();
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentAtSearchLayout$a */
    public static final class C36996a extends AbstractC89247c<Boolean> {

        /* renamed from: a */
        final /* synthetic */ Object f87144a;

        /* renamed from: b */
        final /* synthetic */ CommentAtSearchLayout f87145b;

        static {
            Covode.recordClassIndex(44348);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C36996a(Object obj, Object obj2, CommentAtSearchLayout commentAtSearchLayout) {
            super(obj2);
            this.f87144a = obj;
            this.f87145b = commentAtSearchLayout;
        }

        @Override // p4600h.p4616h.AbstractC89247c
        /* renamed from: a */
        public final void mo10399a(AbstractC89286i<?> iVar, Boolean bool, Boolean bool2) {
            C89219l.m154721d(iVar, "");
            boolean booleanValue = bool2.booleanValue();
            bool.booleanValue();
            AbstractC89172b<Boolean, C89391z> visibilityChangeListener = this.f87145b.getVisibilityChangeListener();
            if (visibilityChangeListener != null) {
                visibilityChangeListener.invoke(Boolean.valueOf(booleanValue));
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ CommentAtSearchLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private CommentAtSearchLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(9229);
        this.f87139e = new ValueAnimator();
        this.f87140f = new C36996a(false, false, this);
        this.f87142h = C89250i.m154773a((AbstractC89171a) new C36998c(this));
        MethodCollector.m26664o(9229);
    }
}
