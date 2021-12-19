package com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.top;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.p017a.p018a.C0196a;
import androidx.core.p036g.C0693f;
import androidx.core.p037h.C0789s;
import androidx.core.p037h.C0792v;
import androidx.p048g.p049a.p050a.C0995b;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;
import p4600h.C89386u;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4611f.p4613b.C89233z;

@ViewPager.AbstractC1575a
/* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a */
public final class C53362a extends HorizontalScrollView {

    /* renamed from: B */
    private static final C0693f.AbstractC0694a<C53377f> f122488B = new C0693f.C0696c(16);

    /* renamed from: i */
    public static final Interpolator f122489i = new C0995b();

    /* renamed from: j */
    public static final C53363a f122490j = new C53363a((byte) 0);

    /* renamed from: A */
    private boolean f122491A;

    /* renamed from: a */
    public final C53369e f122492a;

    /* renamed from: b */
    public int f122493b;

    /* renamed from: c */
    public boolean f122494c;

    /* renamed from: d */
    public final ArrayList<AbstractC53365c> f122495d;

    /* renamed from: e */
    C53379g f122496e;

    /* renamed from: f */
    public boolean f122497f;

    /* renamed from: g */
    public final int f122498g;

    /* renamed from: h */
    public AbstractC53364b f122499h;

    /* renamed from: k */
    private final ArrayList<C53377f> f122500k;

    /* renamed from: l */
    private C53377f f122501l;

    /* renamed from: m */
    private int f122502m;

    /* renamed from: n */
    private int f122503n;

    /* renamed from: o */
    private int f122504o;

    /* renamed from: p */
    private int f122505p;

    /* renamed from: q */
    private int f122506q;

    /* renamed from: r */
    private int f122507r;

    /* renamed from: s */
    private int f122508s;

    /* renamed from: t */
    private ValueAnimator f122509t;

    /* renamed from: u */
    private final float f122510u;

    /* renamed from: v */
    private final float f122511v;

    /* renamed from: w */
    private float f122512w;

    /* renamed from: x */
    private final C0693f.AbstractC0694a<C53380h> f122513x;

    /* renamed from: y */
    private boolean f122514y;

    /* renamed from: z */
    private boolean f122515z;

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a$b */
    public interface AbstractC53364b {
        static {
            Covode.recordClassIndex(62927);
        }

        /* renamed from: a */
        void mo89895a(C53377f fVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a$c */
    public interface AbstractC53365c {
        static {
            Covode.recordClassIndex(62928);
        }

        /* renamed from: a */
        void mo89896a(C53377f fVar);

        /* renamed from: b */
        void mo89897b(C53377f fVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a$f */
    public static final class C53377f {

        /* renamed from: f */
        public static final C53378a f122557f = new C53378a((byte) 0);

        /* renamed from: a */
        public int f122558a = -1;

        /* renamed from: b */
        public View f122559b;

        /* renamed from: c */
        public C53362a f122560c;

        /* renamed from: d */
        public C53380h f122561d;

        /* renamed from: e */
        public Object f122562e;

        static {
            Covode.recordClassIndex(62940);
        }

        /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a$f$a */
        public static final class C53378a {
            static {
                Covode.recordClassIndex(62941);
            }

            private C53378a() {
            }

            public /* synthetic */ C53378a(byte b) {
                this();
            }
        }

        /* renamed from: c */
        private void m98471c() {
            C53380h hVar = this.f122561d;
            if (hVar != null) {
                hVar.mo89948a();
            }
        }

        /* renamed from: a */
        public final void mo89946a() {
            C53362a aVar = this.f122560c;
            if (aVar != null) {
                aVar.mo89843a((C53362a) this, (C53377f) true);
                return;
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout".toString());
        }

        /* renamed from: b */
        public final boolean mo89947b() {
            C53362a aVar = this.f122560c;
            if (aVar == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout".toString());
            } else if (aVar.getSelectedTabPosition() == this.f122558a) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: a */
        public final C53377f mo89945a(View view) {
            this.f122559b = view;
            m98471c();
            return this;
        }
    }

    public C53362a(Context context, char c) {
        this(context, (byte) 0);
    }

    public final void addView(View view) {
        C89219l.m154721d(view, "");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        C89219l.m154721d(view, "");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(layoutParams, "");
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        C89219l.m154721d(view, "");
        C89219l.m154721d(layoutParams, "");
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a$a */
    public static final class C53363a {
        static {
            Covode.recordClassIndex(62926);
        }

        private C53363a() {
        }

        public /* synthetic */ C53363a(byte b) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a$d */
    public class C53366d extends LinearLayout {

        /* renamed from: a */
        public int f122516a;

        /* renamed from: b */
        public int f122517b;

        /* renamed from: c */
        public int f122518c;

        /* renamed from: d */
        float f122519d;

        /* renamed from: e */
        public C89386u<Float, Float, ? extends Paint> f122520e;

        /* renamed from: g */
        private final Paint f122522g;

        /* renamed from: h */
        private int f122523h = -1;

        /* renamed from: i */
        private float f122524i;

        /* renamed from: j */
        private int f122525j = -1;

        /* renamed from: k */
        private int f122526k = -1;

        /* renamed from: l */
        private int f122527l = -1;

        /* renamed from: m */
        private ValueAnimator f122528m;

        /* renamed from: n */
        private int f122529n = Integer.MAX_VALUE;

        /* renamed from: o */
        private boolean f122530o;

        /* renamed from: p */
        private int f122531p;

        /* renamed from: q */
        private LinearGradient f122532q;

        /* renamed from: r */
        private LinearGradient f122533r;

        /* renamed from: s */
        private Paint f122534s;

        /* renamed from: t */
        private PorterDuffXfermode f122535t;

        /* renamed from: u */
        private int f122536u = -1;

        /* renamed from: v */
        private float f122537v;

        static {
            Covode.recordClassIndex(62929);
        }

        /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: h.u<java.lang.Float, java.lang.Float, ? extends android.graphics.Paint>, h.u<java.lang.Float, java.lang.Float, android.graphics.Paint> */
        public final C89386u<Float, Float, Paint> getBarrierTriple() {
            return this.f122520e;
        }

        public final PorterDuffXfermode getMDuffXferMode() {
            return this.f122535t;
        }

        public final boolean getMIsDragged() {
            return this.f122530o;
        }

        public final int getMLayerId() {
            return this.f122536u;
        }

        public final LinearGradient getMLeftGradient() {
            return this.f122532q;
        }

        public final Paint getMOverBorderPaint() {
            return this.f122534s;
        }

        public final LinearGradient getMRightGradient() {
            return this.f122533r;
        }

        /* access modifiers changed from: protected */
        public final Paint getMSelectedIndicatorPaint() {
            return this.f122522g;
        }

        public final int getMSelectedPosition() {
            return this.f122523h;
        }

        public final float getMSelectionOffset() {
            return this.f122524i;
        }

        public final float getStripMargin() {
            return this.f122537v;
        }

        public final float getIndicatorPosition() {
            return ((float) this.f122523h) + this.f122524i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo89898a() {
            int i;
            View childAt = getChildAt(this.f122523h);
            int i2 = -1;
            if (childAt == null || childAt.getWidth() <= 0) {
                i = -1;
            } else {
                i2 = childAt.getLeft();
                i = childAt.getRight();
                if (this.f122517b > 0) {
                    int abs = Math.abs(i - i2) / 2;
                    int i3 = this.f122518c;
                    i2 = (i2 + abs) - i3;
                    i = (i - abs) + i3;
                }
                if (this.f122524i > 0.0f && this.f122523h < getChildCount() - 1) {
                    View childAt2 = getChildAt(this.f122523h + 1);
                    C89219l.m154716b(childAt2, "");
                    int left = childAt2.getLeft();
                    int right = childAt2.getRight();
                    if (this.f122517b > 0) {
                        int abs2 = Math.abs(right - left) / 2;
                        int i4 = this.f122518c;
                        left = (left + abs2) - i4;
                        right = (right - abs2) + i4;
                    }
                    float f = this.f122524i;
                    i2 = (int) ((((float) left) * f) + ((1.0f - f) * ((float) i2)));
                    i = (int) ((((float) right) * f) + ((1.0f - f) * ((float) i)));
                }
            }
            mo89900a(i2, i);
        }

        public final void setBarrierTriple(C89386u<Float, Float, ? extends Paint> uVar) {
            this.f122520e = uVar;
        }

        public final void setMDuffXferMode(PorterDuffXfermode porterDuffXfermode) {
            this.f122535t = porterDuffXfermode;
        }

        public final void setMIsDragged(boolean z) {
            this.f122530o = z;
        }

        public final void setMLayerId(int i) {
            this.f122536u = i;
        }

        public final void setMLeftGradient(LinearGradient linearGradient) {
            this.f122532q = linearGradient;
        }

        public final void setMOverBorderPaint(Paint paint) {
            this.f122534s = paint;
        }

        public final void setMRightGradient(LinearGradient linearGradient) {
            this.f122533r = linearGradient;
        }

        public final void setMSelectedPosition(int i) {
            this.f122523h = i;
        }

        public final void setMSelectionOffset(float f) {
            this.f122524i = f;
        }

        public final void setSelectedTabHorizontalPadding(int i) {
            this.f122531p = i;
        }

        public final void setStripMargin(float f) {
            this.f122537v = f;
        }

        public final void setTabStripMargin(float f) {
            this.f122537v = f;
            C0792v.m2764c(this);
        }

        public final void setSelectedIndicatorHeight(int i) {
            if (this.f122516a != i) {
                this.f122516a = i;
                C0792v.m2764c(this);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a$d$b */
        public static final class C53368b extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ C53366d f122543a;

            /* renamed from: b */
            final /* synthetic */ int f122544b;

            static {
                Covode.recordClassIndex(62931);
            }

            public final void onAnimationEnd(Animator animator) {
                C89219l.m154721d(animator, "");
                this.f122543a.setMSelectedPosition(this.f122544b);
                this.f122543a.setMSelectionOffset(0.0f);
            }

            C53368b(C53366d dVar, int i) {
                this.f122543a = dVar;
                this.f122544b = i;
            }
        }

        public void onRtlPropertiesChanged(int i) {
            super.onRtlPropertiesChanged(i);
            if (Build.VERSION.SDK_INT < 23 && this.f122525j != i) {
                requestLayout();
                this.f122525j = i;
            }
        }

        public final void setSelectedIndicatorColor(int i) {
            if (this.f122522g.getColor() != i) {
                this.f122522g.setColor(i);
                C0792v.m2764c(this);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a$d$a */
        public static final class C53367a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C53366d f122538a;

            /* renamed from: b */
            final /* synthetic */ C89233z.C89236c f122539b;

            /* renamed from: c */
            final /* synthetic */ C89233z.C89236c f122540c;

            /* renamed from: d */
            final /* synthetic */ int f122541d;

            /* renamed from: e */
            final /* synthetic */ int f122542e;

            static {
                Covode.recordClassIndex(62930);
            }

            C53367a(C53366d dVar, C89233z.C89236c cVar, C89233z.C89236c cVar2, int i, int i2) {
                this.f122538a = dVar;
                this.f122539b = cVar;
                this.f122540c = cVar2;
                this.f122541d = i;
                this.f122542e = i2;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C89219l.m154716b(valueAnimator, "");
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (this.f122538a.f122517b > 0) {
                    int abs = Math.abs(this.f122539b.element - this.f122540c.element) / 2;
                    C89233z.C89236c cVar = this.f122540c;
                    cVar.element = (cVar.element + abs) - this.f122538a.f122518c;
                    C89233z.C89236c cVar2 = this.f122539b;
                    cVar2.element = (cVar2.element - abs) + this.f122538a.f122518c;
                }
                this.f122538a.mo89900a(C53366d.m98461a(this.f122541d, this.f122540c.element, animatedFraction), C53366d.m98461a(this.f122542e, this.f122539b.element, animatedFraction));
            }
        }

        /* access modifiers changed from: protected */
        public void onDraw(Canvas canvas) {
            MethodCollector.m26663i(2550);
            super.onDraw(canvas);
            int i = -1;
            if (C53362a.this.getMMode() == 0 && this.f122519d > 0.0f) {
                C53362a aVar = C53362a.this;
                if ((aVar.canScrollHorizontally(-1) || aVar.canScrollHorizontally(1)) && canvas != null) {
                    i = canvas.saveLayer((float) C53362a.this.getScrollX(), 0.0f, ((float) C53362a.this.getScrollX()) + ((float) getWidth()), (float) getHeight(), this.f122534s, 31);
                }
            }
            this.f122536u = i;
            MethodCollector.m26664o(2550);
        }

        public final void setOverBorderWidth(float f) {
            this.f122519d = f;
            if (f > 0.0f) {
                this.f122532q = new LinearGradient(0.0f, 0.0f, f, 0.0f, new int[]{0, 0, -16777216}, new float[]{0.0f, 0.3f, 1.0f}, Shader.TileMode.CLAMP);
                this.f122533r = new LinearGradient(0.0f, 0.0f, f, 0.0f, new int[]{-16777216, 0, 0}, new float[]{0.0f, 0.7f, 1.0f}, Shader.TileMode.CLAMP);
                this.f122536u = -1;
                if (this.f122534s == null) {
                    this.f122534s = new Paint(1);
                }
                if (this.f122535t == null) {
                    this.f122535t = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
                }
            }
        }

        public void draw(Canvas canvas) {
            int i;
            float f;
            float f2;
            float f3;
            float f4;
            Paint paint;
            Float second;
            Float first;
            Float first2;
            Float second2;
            int i2;
            C89219l.m154721d(canvas, "");
            C53366d dVar = this;
            super.draw(canvas);
            int i3 = dVar.f122526k;
            if (i3 >= 0 && (i2 = dVar.f122527l) > i3) {
                int i4 = dVar.f122531p;
                canvas.drawRect(((float) i3) + ((float) i4), (((float) dVar.getHeight()) - ((float) dVar.f122516a)) + dVar.f122537v, ((float) i2) - ((float) i4), ((float) dVar.getHeight()) + dVar.f122537v, dVar.f122522g);
            }
            int childCount = dVar.getChildCount();
            if (childCount > 1 && dVar.f122520e != null) {
                dVar = dVar;
                if (C0792v.m2768e(dVar) == 1) {
                    i = 0;
                    childCount--;
                } else {
                    i = 1;
                }
                while (i < childCount) {
                    float height = (float) dVar.getHeight();
                    C89386u<Float, Float, ? extends Paint> uVar = dVar.f122520e;
                    if (uVar == null || (second2 = uVar.getSecond()) == null) {
                        f = 0.0f;
                    } else {
                        f = second2.floatValue();
                    }
                    float f5 = (height - f) / 2.0f;
                    View childAt = dVar.getChildAt(i);
                    C89386u<Float, Float, ? extends Paint> uVar2 = dVar.f122520e;
                    if (uVar2 == null || (first2 = uVar2.getFirst()) == null) {
                        f2 = 0.0f;
                    } else {
                        f2 = first2.floatValue();
                    }
                    C89219l.m154716b(childAt, "");
                    float left = ((float) childAt.getLeft()) - (f2 / 2.0f);
                    float left2 = (float) childAt.getLeft();
                    C89386u<Float, Float, ? extends Paint> uVar3 = dVar.f122520e;
                    if (uVar3 == null || (first = uVar3.getFirst()) == null) {
                        f3 = 0.0f;
                    } else {
                        f3 = first.floatValue();
                    }
                    float f6 = left2 + f3;
                    C89386u<Float, Float, ? extends Paint> uVar4 = dVar.f122520e;
                    if (uVar4 == null || (second = uVar4.getSecond()) == null) {
                        f4 = 0.0f;
                    } else {
                        f4 = second.floatValue();
                    }
                    float f7 = f5 + f4;
                    C89386u<Float, Float, ? extends Paint> uVar5 = dVar.f122520e;
                    if (uVar5 != null) {
                        paint = (Paint) uVar5.getThird();
                        if (paint != null) {
                            canvas.drawRect(left, f5, f6, f7, paint);
                            i++;
                        }
                    } else {
                        paint = null;
                    }
                    C89219l.m154715b();
                    canvas.drawRect(left, f5, f6, f7, paint);
                    i++;
                }
            }
            if (dVar.f122519d > 0.0f && dVar.f122536u > 0) {
                Paint paint2 = dVar.f122534s;
                if (paint2 != null) {
                    paint2.setXfermode(dVar.f122535t);
                }
                canvas.save();
                canvas.translate((float) C53362a.this.getScrollX(), 0.0f);
                if (C53362a.this.canScrollHorizontally(-1)) {
                    Paint paint3 = dVar.f122534s;
                    if (paint3 != null) {
                        paint3.setShader(dVar.f122532q);
                    }
                    if (dVar.f122534s != null) {
                        float f8 = dVar.f122519d;
                        float height2 = (float) dVar.getHeight();
                        Paint paint4 = dVar.f122534s;
                        if (paint4 == null) {
                            C89219l.m154715b();
                        }
                        canvas.drawRect(0.0f, 0.0f, f8, height2, paint4);
                    }
                }
                if (C53362a.this.canScrollHorizontally(1)) {
                    canvas.translate(((float) C53362a.this.getWidth()) - dVar.f122519d, 0.0f);
                    Paint paint5 = dVar.f122534s;
                    if (paint5 != null) {
                        paint5.setShader(dVar.f122533r);
                    }
                    if (dVar.f122534s != null) {
                        float f9 = dVar.f122519d;
                        float height3 = (float) dVar.getHeight();
                        Paint paint6 = dVar.f122534s;
                        if (paint6 == null) {
                            C89219l.m154715b();
                        }
                        canvas.drawRect(0.0f, 0.0f, f9, height3, paint6);
                    }
                }
                Paint paint7 = dVar.f122534s;
                if (paint7 != null) {
                    paint7.setXfermode(null);
                }
                canvas.restore();
                canvas.restoreToCount(dVar.f122536u);
            }
        }

        /* renamed from: a */
        public final void mo89899a(int i, float f) {
            ValueAnimator valueAnimator = this.f122528m;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                ValueAnimator valueAnimator2 = this.f122528m;
                if (valueAnimator2 == null) {
                    C89219l.m154715b();
                }
                valueAnimator2.cancel();
            }
            this.f122523h = i;
            this.f122524i = f;
            mo89898a();
        }

        public C53366d(Context context) {
            super(context);
            MethodCollector.m26663i(2563);
            setWillNotDraw(false);
            this.f122522g = new Paint();
            MethodCollector.m26664o(2563);
        }

        /* renamed from: a */
        public final void mo89900a(int i, int i2) {
            if (i != this.f122526k || i2 != this.f122527l) {
                this.f122526k = i;
                this.f122527l = i2;
                C0792v.m2764c(this);
            }
        }

        /* renamed from: b */
        public final void mo89901b(int i, int i2) {
            boolean z;
            int i3;
            int i4;
            int i5;
            ValueAnimator valueAnimator = this.f122528m;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                ValueAnimator valueAnimator2 = this.f122528m;
                if (valueAnimator2 == null) {
                    C89219l.m154715b();
                }
                valueAnimator2.cancel();
            }
            if (C0792v.m2768e(this) == 1) {
                z = true;
            } else {
                z = false;
            }
            View childAt = getChildAt(i);
            if (childAt == null) {
                mo89898a();
                return;
            }
            C89233z.C89236c cVar = new C89233z.C89236c();
            cVar.element = childAt.getLeft();
            C89233z.C89236c cVar2 = new C89233z.C89236c();
            cVar2.element = childAt.getRight();
            if (Math.abs(i - this.f122523h) <= 1) {
                i3 = this.f122526k;
                i5 = this.f122527l;
            } else {
                int b = C53362a.this.mo89849b(24);
                if (i < this.f122523h) {
                    if (!z) {
                        i4 = cVar2.element;
                    }
                    i3 = cVar.element - b;
                    i5 = i3;
                } else {
                    if (z) {
                        i4 = cVar2.element;
                    }
                    i3 = cVar.element - b;
                    i5 = i3;
                }
                i3 = i4 + b;
                i5 = i3;
            }
            if (i3 != cVar.element || i5 != cVar2.element) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f122528m = valueAnimator3;
                valueAnimator3.setInterpolator(C53362a.f122489i);
                valueAnimator3.setDuration((long) i2);
                valueAnimator3.setFloatValues(0.0f, 1.0f);
                valueAnimator3.addUpdateListener(new C53367a(this, cVar2, cVar, i3, i5));
                valueAnimator3.addListener(new C53368b(this, i));
                valueAnimator3.start();
            }
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x009d, code lost:
            if (r7 != false) goto L_0x00aa;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onMeasure(int r12, int r13) {
            /*
            // Method dump skipped, instructions count: 391
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.top.C53362a.C53366d.onMeasure(int, int):void");
        }

        /* renamed from: a */
        public static int m98461a(int i, int i2, float f) {
            return i + Math.round(f * ((float) (i2 - i)));
        }

        /* access modifiers changed from: protected */
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            MethodCollector.m26663i(2212);
            super.onLayout(z, i, i2, i3, i4);
            ValueAnimator valueAnimator = this.f122528m;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                mo89898a();
                MethodCollector.m26664o(2212);
                return;
            }
            ValueAnimator valueAnimator2 = this.f122528m;
            if (valueAnimator2 == null) {
                C89219l.m154715b();
            }
            valueAnimator2.cancel();
            ValueAnimator valueAnimator3 = this.f122528m;
            if (valueAnimator3 == null) {
                C89219l.m154715b();
            }
            long duration = valueAnimator3.getDuration();
            int i5 = this.f122523h;
            ValueAnimator valueAnimator4 = this.f122528m;
            if (valueAnimator4 == null) {
                C89219l.m154715b();
            }
            mo89901b(i5, Math.round((1.0f - valueAnimator4.getAnimatedFraction()) * ((float) duration)));
            MethodCollector.m26664o(2212);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a$h */
    public final class C53380h extends LinearLayout {

        /* renamed from: b */
        private C53377f f122569b;

        /* renamed from: c */
        private View f122570c;

        /* renamed from: d */
        private TextView f122571d;

        static {
            Covode.recordClassIndex(62943);
        }

        public final TextView getMCustomTextView$homepage_common_release() {
            return this.f122571d;
        }

        public final C53377f getTab() {
            return this.f122569b;
        }

        public final boolean performClick() {
            boolean performClick = super.performClick();
            if (this.f122569b == null) {
                return performClick;
            }
            if (!performClick) {
                playSoundEffect(0);
            }
            if (C53362a.this.f122499h != null) {
                AbstractC53364b bVar = C53362a.this.f122499h;
                if (bVar == null) {
                    C89219l.m154715b();
                }
                bVar.mo89895a(this.f122569b);
            } else {
                C53377f fVar = this.f122569b;
                if (fVar == null) {
                    C89219l.m154715b();
                }
                fVar.mo89946a();
            }
            return true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo89948a() {
            /*
                r7 = this;
                r6 = 351(0x15f, float:4.92E-43)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26663i(r6)
                com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a$f r5 = r7.f122569b
                r4 = 0
                if (r5 == 0) goto L_0x0058
                android.view.View r3 = r5.f122559b
            L_0x000c:
                r2 = 1
                if (r3 == 0) goto L_0x004c
                android.view.ViewParent r1 = r3.getParent()
                if (r1 != 0) goto L_0x0041
            L_0x0015:
                r7.addView(r3)
            L_0x0018:
                r7.f122570c = r3
                r0 = 16908308(0x1020014, float:2.3877285E-38)
                android.view.View r1 = r3.findViewById(r0)
                boolean r0 = r1 instanceof android.widget.TextView
                if (r0 != 0) goto L_0x003f
            L_0x0025:
                android.widget.TextView r4 = (android.widget.TextView) r4
                r7.f122571d = r4
                if (r4 == 0) goto L_0x002e
                r4.setMaxLines(r2)
            L_0x002e:
                if (r5 == 0) goto L_0x003d
                boolean r0 = r5.mo89947b()
                if (r0 == 0) goto L_0x003d
            L_0x0036:
                r7.setSelected(r2)
                com.bytedance.frameworks.apm.trace.MethodCollector.m26664o(r6)
                return
            L_0x003d:
                r2 = 0
                goto L_0x0036
            L_0x003f:
                r4 = r1
                goto L_0x0025
            L_0x0041:
                r0 = r7
                if (r1 == r0) goto L_0x0018
                if (r1 == 0) goto L_0x0015
                android.view.ViewGroup r1 = (android.view.ViewGroup) r1
                r1.removeView(r3)
                goto L_0x0015
            L_0x004c:
                android.view.View r0 = r7.f122570c
                if (r0 == 0) goto L_0x0055
                r7.removeView(r0)
                r7.f122570c = r4
            L_0x0055:
                r7.f122571d = r4
                goto L_0x002e
            L_0x0058:
                r3 = r4
                goto L_0x000c
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.top.C53362a.C53380h.mo89948a():void");
        }

        public final void setMCustomTextView$homepage_common_release(TextView textView) {
            this.f122571d = textView;
        }

        /* renamed from: a */
        public final void mo89949a(C53377f fVar) {
            if (!C89219l.m154714a(fVar, this.f122569b)) {
                this.f122569b = fVar;
            }
        }

        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            C89219l.m154721d(accessibilityEvent, "");
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.a$b");
        }

        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            C89219l.m154721d(accessibilityNodeInfo, "");
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.a$b");
        }

        public final void setTab(C53377f fVar) {
            if (!C89219l.m154714a(fVar, this.f122569b)) {
                this.f122569b = fVar;
                mo89948a();
            }
        }

        public final void setSelected(boolean z) {
            boolean z2;
            if (isSelected() != z) {
                z2 = true;
            } else {
                z2 = false;
            }
            super.setSelected(z);
            if (z2 && z) {
                int i = Build.VERSION.SDK_INT;
            }
            View view = this.f122570c;
            if (view != null) {
                view.setSelected(z);
            }
            TextView textView = this.f122571d;
            if (textView != null) {
                textView.setSelected(z);
            }
        }

        public C53380h(Context context) {
            super(context);
            MethodCollector.m26663i(371);
            if (C53362a.this.getMTabBackgroundResId() != 0) {
                if (context == null) {
                    C89219l.m154715b();
                }
                C0792v.m2746a(this, C0196a.m619b(context, C53362a.this.getMTabBackgroundResId()));
            }
            setGravity(17);
            setOrientation(1);
            setClickable(true);
            C0792v.m2749a(this, C0789s.m2732a(getContext()));
            MethodCollector.m26664o(371);
        }

        public final void onMeasure(int i, int i2) {
            MethodCollector.m26663i(320);
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            int i3 = C53362a.this.f122493b;
            if (i3 > 0 && (mode == 0 || size > i3)) {
                i = View.MeasureSpec.makeMeasureSpec(C53362a.this.f122493b, Integer.MIN_VALUE);
            }
            super.onMeasure(i, i2);
            MethodCollector.m26664o(320);
        }
    }

    public final boolean getEnableAnimation() {
        return this.f122515z;
    }

    public final int getMCustomTabResId() {
        return this.f122508s;
    }

    public final int getMMode() {
        return this.f122507r;
    }

    public final C53379g getMPageChangeListener() {
        return this.f122496e;
    }

    public final int getMTabBackgroundResId() {
        return this.f122503n;
    }

    public final int getMTabGravity() {
        return this.f122506q;
    }

    public final boolean getRepeatAnim() {
        return this.f122514y;
    }

    public final boolean getSwipeMode() {
        return this.f122491A;
    }

    public final int getTabGravity() {
        return this.f122506q;
    }

    public final int getTabMode() {
        return this.f122507r;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* renamed from: a */
    public final void mo89844a(boolean z) {
        int childCount = this.f122492a.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f122492a.getChildAt(i);
            C89219l.m154716b(childAt, "");
            childAt.setMinimumWidth(getTabMinWidth());
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            m98441a((LinearLayout.LayoutParams) layoutParams);
            if (z) {
                childAt.requestLayout();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a$i */
    public static final class RunnableC53381i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C53362a f122572a;

        static {
            Covode.recordClassIndex(62944);
        }

        RunnableC53381i(C53362a aVar) {
            this.f122572a = aVar;
        }

        public final void run() {
            this.f122572a.requestLayout();
        }
    }

    private final float getScrollPosition() {
        return this.f122492a.getIndicatorPosition();
    }

    private final int getTabMinWidth() {
        int i = this.f122504o;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    public final int getTabCount() {
        return this.f122500k.size();
    }

    public final int getTabStripLeftPadding() {
        return this.f122492a.getPaddingLeft();
    }

    public final int getTabStripRightPadding() {
        return this.f122492a.getPaddingRight();
    }

    /* renamed from: b */
    private final LinearLayout.LayoutParams m98444b() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        m98441a(layoutParams);
        return layoutParams;
    }

    public final int getSelectedTabPosition() {
        C53377f fVar = this.f122501l;
        if (fVar != null) {
            return fVar.f122558a;
        }
        return -1;
    }

    public final boolean shouldDelayChildPressedState() {
        if (getTabScrollRange() > 0) {
            return true;
        }
        return false;
    }

    static {
        Covode.recordClassIndex(62925);
    }

    /* renamed from: d */
    private final void m98449d() {
        C0792v.m2741a(this.f122492a, 0, 0, 0, 0);
        int i = this.f122507r;
        if (i == 0) {
            this.f122492a.setGravity(8388611);
        } else if (i == 1) {
            this.f122492a.setGravity(1);
        }
        mo89844a(true);
    }

    private final int getTabScrollRange() {
        return Math.max(0, ((this.f122492a.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    /* renamed from: a */
    private final C53380h m98440a() {
        C53380h hVar;
        C0693f.AbstractC0694a<C53380h> aVar = this.f122513x;
        if (aVar == null || (hVar = aVar.acquire()) == null) {
            hVar = new C53380h(getContext());
        }
        hVar.setFocusable(true);
        hVar.setMinimumWidth(getTabMinWidth());
        return hVar;
    }

    /* renamed from: c */
    private final void m98447c() {
        if (this.f122509t == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f122509t = valueAnimator;
            valueAnimator.setInterpolator(f122489i);
            ValueAnimator valueAnimator2 = this.f122509t;
            if (valueAnimator2 == null) {
                C89219l.m154715b();
            }
            valueAnimator2.setDuration(200L);
            ValueAnimator valueAnimator3 = this.f122509t;
            if (valueAnimator3 == null) {
                C89219l.m154715b();
            }
            valueAnimator3.addUpdateListener(new C53382j(this));
        }
    }

    private final int getDefaultHeight() {
        int size = this.f122500k.size();
        for (int i = 0; i < size; i++) {
            C53377f fVar = this.f122500k.get(i);
            C89219l.m154716b(fVar, "");
            View view = fVar.f122559b;
            if (view != null && view.getHeight() > 58) {
                return 58;
            }
        }
        return 48;
    }

    private final void setTabMinWidth(int i) {
        this.f122504o = i;
    }

    public final void setAutoFillWhenScrollable(boolean z) {
        this.f122494c = z;
    }

    public final void setCustomTabViewResId(int i) {
        this.f122508s = i;
    }

    public final void setEnableAnimation(boolean z) {
        this.f122515z = z;
    }

    public final void setMCustomTabResId(int i) {
        this.f122508s = i;
    }

    public final void setMMode(int i) {
        this.f122507r = i;
    }

    public final void setMPageChangeListener(C53379g gVar) {
        this.f122496e = gVar;
    }

    public final void setMTabBackgroundResId(int i) {
        this.f122503n = i;
    }

    public final void setMTabGravity(int i) {
        this.f122506q = i;
    }

    public final void setOnTabClickListener(AbstractC53364b bVar) {
        this.f122499h = bVar;
    }

    public final void setOverBorderOffset(float f) {
        this.f122512w = f;
    }

    public final void setRepeatAnim(boolean z) {
        this.f122514y = z;
    }

    public final void setSwipeMode(boolean z) {
        this.f122491A = z;
    }

    public final void setTouchable(boolean z) {
        this.f122497f = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a$e */
    public final class C53369e extends C53366d {

        /* renamed from: g */
        final float f122545g = 0.6f;

        /* renamed from: h */
        public final AnimatorSet f122546h = new AnimatorSet();

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a$e$b */
        public static final class C53372b implements TimeInterpolator {

            /* renamed from: a */
            public static final C53372b f122550a = new C53372b();

            static {
                Covode.recordClassIndex(62935);
            }

            C53372b() {
            }

            public final float getInterpolation(float f) {
                return f < 0.33333334f ? f * 1.5f : (f * 0.75f) + 0.25f;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a$e$c */
        public static final class C53373c implements TimeInterpolator {

            /* renamed from: a */
            public static final C53373c f122551a = new C53373c();

            static {
                Covode.recordClassIndex(62936);
            }

            C53373c() {
            }

            public final float getInterpolation(float f) {
                return f < 0.33333334f ? f * 1.5f : (f * 0.75f) + 0.25f;
            }
        }

        static {
            Covode.recordClassIndex(62932);
        }

        /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a$e$a */
        public static final class C53371a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C53369e f122549a;

            static {
                Covode.recordClassIndex(62934);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C53371a(C53369e eVar) {
                this.f122549a = eVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object obj;
                Paint mSelectedIndicatorPaint = this.f122549a.getMSelectedIndicatorPaint();
                if (valueAnimator != null) {
                    obj = valueAnimator.getAnimatedValue();
                } else {
                    obj = null;
                }
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Int");
                mSelectedIndicatorPaint.setAlpha(((Integer) obj).intValue());
                C0792v.m2764c(this.f122549a);
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a$e$f */
        public static final class C53376f extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ C53369e f122556a;

            static {
                Covode.recordClassIndex(62939);
            }

            /* JADX WARN: Incorrect args count in method signature: ()V */
            C53376f(C53369e eVar) {
                this.f122556a = eVar;
            }

            public final void onAnimationEnd(Animator animator) {
                C89219l.m154721d(animator, "");
                if (C53362a.this.getRepeatAnim()) {
                    this.f122556a.f122546h.start();
                }
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a$e$d */
        public static final class C53374d implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C53369e f122552a;

            /* renamed from: b */
            final /* synthetic */ C89233z.C89234a f122553b;

            static {
                Covode.recordClassIndex(62937);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object obj;
                C53369e eVar = this.f122552a;
                if (valueAnimator != null) {
                    obj = valueAnimator.getAnimatedValue();
                } else {
                    obj = null;
                }
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Float");
                eVar.setMSelectionOffset(((Float) obj).floatValue());
                if (!this.f122553b.element) {
                    C53369e eVar2 = this.f122552a;
                    eVar2.setMSelectionOffset(1.0f - eVar2.getMSelectionOffset());
                }
                this.f122552a.mo89898a();
                C53369e eVar3 = this.f122552a;
                eVar3.mo89938b(eVar3.getMSelectedPosition(), this.f122552a.getMSelectionOffset());
            }

            C53374d(C53369e eVar, C89233z.C89234a aVar) {
                this.f122552a = eVar;
                this.f122553b = aVar;
            }
        }

        /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a$e$e */
        public static final class C53375e implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ C53369e f122554a;

            /* renamed from: b */
            final /* synthetic */ C89233z.C89234a f122555b;

            static {
                Covode.recordClassIndex(62938);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Object obj;
                C53369e eVar = this.f122554a;
                if (valueAnimator != null) {
                    obj = valueAnimator.getAnimatedValue();
                } else {
                    obj = null;
                }
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Float");
                eVar.setMSelectionOffset(((Float) obj).floatValue());
                if (!this.f122555b.element) {
                    C53369e eVar2 = this.f122554a;
                    eVar2.setMSelectionOffset(1.0f - eVar2.getMSelectionOffset());
                }
                this.f122554a.mo89898a();
                C53369e eVar3 = this.f122554a;
                eVar3.mo89938b(eVar3.getMSelectedPosition(), this.f122554a.getMSelectionOffset());
            }

            C53375e(C53369e eVar, C89233z.C89234a aVar) {
                this.f122554a = eVar;
                this.f122555b = aVar;
            }
        }

        public C53369e(Context context) {
            super(context);
            getMSelectedIndicatorPaint().setShadowLayer((float) getHeight(), 0.0f, (float) getWidth(), Color.parseColor("#26000000"));
            C53362a.this.f122495d.add(new AbstractC53365c(this) {
                /* class com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.top.C53362a.C53369e.C533701 */

                /* renamed from: a */
                final /* synthetic */ C53369e f122548a;

                static {
                    Covode.recordClassIndex(62933);
                }

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.f122548a = r1;
                }

                @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.top.C53362a.AbstractC53365c
                /* renamed from: b */
                public final void mo89897b(C53377f fVar) {
                    C53380h hVar;
                    TextView mCustomTextView$homepage_common_release;
                    if (!C53362a.this.getSwipeMode()) {
                        this.f122548a.mo89937a(fVar, true);
                    }
                    if (fVar != null && (hVar = fVar.f122561d) != null && (mCustomTextView$homepage_common_release = hVar.getMCustomTextView$homepage_common_release()) != null) {
                        C17301b.m32033a().mo27614a(mCustomTextView$homepage_common_release, C17303d.f41573g);
                    }
                }

                @Override // com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.top.C53362a.AbstractC53365c
                /* renamed from: a */
                public final void mo89896a(C53377f fVar) {
                    C53380h hVar;
                    TextView mCustomTextView$homepage_common_release;
                    TextView mCustomTextView$homepage_common_release2;
                    C89219l.m154721d(fVar, "");
                    C53380h hVar2 = fVar.f122561d;
                    int childCount = this.f122548a.getChildCount();
                    if (childCount >= 0) {
                        int i = 0;
                        while (true) {
                            View childAt = this.f122548a.getChildAt(i);
                            if ((childAt instanceof C53380h) && (mCustomTextView$homepage_common_release = (hVar = (C53380h) childAt).getMCustomTextView$homepage_common_release()) != null && mCustomTextView$homepage_common_release.getVisibility() == 0 && (mCustomTextView$homepage_common_release2 = hVar.getMCustomTextView$homepage_common_release()) != null) {
                                mCustomTextView$homepage_common_release2.setAlpha(this.f122548a.f122545g);
                            }
                            if (i == childCount) {
                                break;
                            }
                            i++;
                        }
                    }
                    if (hVar2 instanceof C53380h) {
                        TextView mCustomTextView$homepage_common_release3 = hVar2.getMCustomTextView$homepage_common_release();
                        if (mCustomTextView$homepage_common_release3 != null) {
                            mCustomTextView$homepage_common_release3.setAlpha(1.0f);
                        }
                        C17301b.m32033a().mo27614a(mCustomTextView$homepage_common_release3, C17303d.f41568b);
                    }
                    if (!C53362a.this.getSwipeMode()) {
                        this.f122548a.mo89937a(fVar, false);
                    }
                }
            });
        }

        /* renamed from: a */
        public final void mo89936a(int i, boolean z) {
            boolean z2 = false;
            if (z) {
                if (this.f122546h.isRunning()) {
                    this.f122546h.cancel();
                }
                C89233z.C89234a aVar = new C89233z.C89234a();
                aVar.element = false;
                if (i != getMSelectedPosition()) {
                    if (getMSelectedPosition() - i > 0) {
                        z2 = true;
                    }
                    aVar.element = z2;
                    setMSelectedPosition(i);
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.3f);
                    C89219l.m154716b(ofFloat, "");
                    ofFloat.setDuration(400L);
                    ofFloat.addUpdateListener(new C53374d(this, aVar));
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.3f, 1.0f);
                    C89219l.m154716b(ofFloat2, "");
                    ofFloat2.setDuration(900L);
                    ofFloat2.addUpdateListener(new C53375e(this, aVar));
                    this.f122546h.play(ofFloat).before(ofFloat2);
                    this.f122546h.start();
                    this.f122546h.addListener(new C53376f(this));
                    return;
                }
                return;
            }
            C53362a.this.setRepeatAnim(false);
            if (this.f122546h.isRunning()) {
                this.f122546h.cancel();
            }
            C53377f a = C53362a.this.mo89839a(i);
            if (a != null) {
                a.mo89946a();
            }
        }

        /* renamed from: b */
        public final void mo89938b(int i, float f) {
            TextView mCustomTextView$homepage_common_release;
            C53380h hVar;
            TextView mCustomTextView$homepage_common_release2;
            TextView mCustomTextView$homepage_common_release3;
            TextView mCustomTextView$homepage_common_release4;
            TextView mCustomTextView$homepage_common_release5;
            View childAt = getChildAt(i);
            if (f <= 0.0f || i >= getChildCount() - 1) {
                int i2 = 0;
                int childCount = getChildCount();
                if (childCount >= 0) {
                    while (true) {
                        View childAt2 = getChildAt(i2);
                        if ((childAt2 instanceof C53380h) && (mCustomTextView$homepage_common_release2 = (hVar = (C53380h) childAt2).getMCustomTextView$homepage_common_release()) != null && mCustomTextView$homepage_common_release2.getVisibility() == 0 && (mCustomTextView$homepage_common_release3 = hVar.getMCustomTextView$homepage_common_release()) != null) {
                            mCustomTextView$homepage_common_release3.setAlpha(this.f122545g);
                        }
                        if (i2 == childCount) {
                            break;
                        }
                        i2++;
                    }
                }
                if ((childAt instanceof C53380h) && (mCustomTextView$homepage_common_release = ((C53380h) childAt).getMCustomTextView$homepage_common_release()) != null) {
                    mCustomTextView$homepage_common_release.setAlpha(1.0f);
                    return;
                }
                return;
            }
            if ((childAt instanceof C53380h) && (mCustomTextView$homepage_common_release5 = ((C53380h) childAt).getMCustomTextView$homepage_common_release()) != null && mCustomTextView$homepage_common_release5.getVisibility() == 0) {
                mCustomTextView$homepage_common_release5.setAlpha(1.0f - ((1.0f - this.f122545g) * f));
            }
            View childAt3 = getChildAt(i + 1);
            if ((childAt3 instanceof C53380h) && (mCustomTextView$homepage_common_release4 = ((C53380h) childAt3).getMCustomTextView$homepage_common_release()) != null && mCustomTextView$homepage_common_release4.getVisibility() == 0) {
                float f2 = this.f122545g;
                mCustomTextView$homepage_common_release4.setAlpha(f2 + ((1.0f - f2) * f));
            }
        }

        /* renamed from: a */
        public final void mo89937a(C53377f fVar, boolean z) {
            C53380h hVar;
            TextView mCustomTextView$homepage_common_release;
            ObjectAnimator objectAnimator;
            ObjectAnimator objectAnimator2 = null;
            if (fVar != null && (hVar = fVar.f122561d) != null && (mCustomTextView$homepage_common_release = hVar.getMCustomTextView$homepage_common_release()) != null) {
                float f = 1.125f;
                float f2 = 1.0f;
                if (z) {
                    if (C53362a.this.getEnableAnimation()) {
                        objectAnimator2 = ObjectAnimator.ofFloat(mCustomTextView$homepage_common_release, "scaleX", mCustomTextView$homepage_common_release.getScaleX(), 1.0f).setDuration(200L);
                        objectAnimator = ObjectAnimator.ofFloat(mCustomTextView$homepage_common_release, "scaleY", mCustomTextView$homepage_common_release.getScaleY(), 1.0f).setDuration(200L);
                    } else {
                        objectAnimator = null;
                    }
                    f = 1.0f;
                    f2 = 0.6f;
                } else if (C53362a.this.getEnableAnimation()) {
                    objectAnimator2 = ObjectAnimator.ofFloat(mCustomTextView$homepage_common_release, "scaleX", mCustomTextView$homepage_common_release.getScaleX(), 1.25f, 1.125f).setDuration(300L);
                    objectAnimator2.setInterpolator(C53372b.f122550a);
                    objectAnimator = ObjectAnimator.ofFloat(mCustomTextView$homepage_common_release, "scaleY", mCustomTextView$homepage_common_release.getScaleY(), 1.25f, 1.125f).setDuration(300L);
                    objectAnimator.setInterpolator(C53373c.f122551a);
                } else {
                    objectAnimator = null;
                }
                if (C53362a.this.getEnableAnimation()) {
                    ObjectAnimator duration = ObjectAnimator.ofFloat(mCustomTextView$homepage_common_release, "alpha", mCustomTextView$homepage_common_release.getAlpha(), f2).setDuration(200L);
                    C89219l.m154716b(duration, "");
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(duration, objectAnimator2, objectAnimator);
                    animatorSet.start();
                    return;
                }
                mCustomTextView$homepage_common_release.setScaleX(f);
                mCustomTextView$homepage_common_release.setScaleY(f);
                mCustomTextView$homepage_common_release.setAlpha(f2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a$g */
    public static final class C53379g implements ViewPager.AbstractC1579e {

        /* renamed from: a */
        final WeakReference<C53362a> f122563a;

        /* renamed from: b */
        int f122564b;

        /* renamed from: c */
        int f122565c;

        /* renamed from: d */
        public boolean f122566d;

        /* renamed from: e */
        private final AccelerateInterpolator f122567e = new AccelerateInterpolator();

        static {
            Covode.recordClassIndex(62942);
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrollStateChanged(int i) {
            this.f122564b = this.f122565c;
            this.f122565c = i;
        }

        public C53379g(C53362a aVar) {
            C89219l.m154721d(aVar, "");
            this.f122563a = new WeakReference<>(aVar);
            this.f122566d = true;
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            boolean z;
            C53362a aVar = this.f122563a.get();
            if (aVar != null && aVar.getSelectedTabPosition() != i && i < aVar.getTabCount()) {
                int i2 = this.f122565c;
                if (i2 == 0 || (i2 == 2 && this.f122564b == 0)) {
                    z = true;
                } else {
                    z = false;
                }
                aVar.mo89843a(aVar.mo89839a(i), z);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0016, code lost:
            if (r4 == 2) goto L_0x0018;
         */
        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onPageScrolled(int r7, float r8, int r9) {
            /*
                r6 = this;
                java.lang.ref.WeakReference<com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a> r0 = r6.f122563a
                java.lang.Object r5 = r0.get()
                com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a r5 = (com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.top.C53362a) r5
                if (r5 == 0) goto L_0x0033
                int r4 = r6.f122565c
                r3 = 0
                r2 = 2
                r1 = 1
                if (r4 != r2) goto L_0x0015
                int r0 = r6.f122564b
                if (r0 != r1) goto L_0x0036
            L_0x0015:
                r1 = 1
                if (r4 != r2) goto L_0x001c
            L_0x0018:
                int r0 = r6.f122564b
                if (r0 == 0) goto L_0x0034
            L_0x001c:
                r0 = 1
            L_0x001d:
                r5.mo89841a(r7, r8, r1, r0)
                com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a$e r1 = r5.f122492a
                int r0 = r6.f122565c
                if (r0 != r2) goto L_0x002a
                int r0 = r6.f122564b
                if (r0 == 0) goto L_0x002b
            L_0x002a:
                r3 = 1
            L_0x002b:
                r1.setMIsDragged(r3)
                com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a$e r0 = r5.f122492a
                androidx.core.p037h.C0792v.m2764c(r0)
            L_0x0033:
                return
            L_0x0034:
                r0 = 0
                goto L_0x001d
            L_0x0036:
                r1 = 0
                goto L_0x0018
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.top.C53362a.C53379g.onPageScrolled(int, float, int):void");
        }
    }

    /* renamed from: c */
    private void m98448c(int i) {
        mo89841a(i, 0.0f, true, true);
    }

    public final void setOverBorderTransparentWidth(float f) {
        this.f122492a.setOverBorderWidth(f);
    }

    public final void setSelectedTabHorizontalPadding(int i) {
        this.f122492a.setSelectedTabHorizontalPadding(i);
    }

    public final void setSelectedTabIndicatorColor(int i) {
        this.f122492a.setSelectedIndicatorColor(i);
    }

    public final void setSelectedTabIndicatorHeight(int i) {
        this.f122492a.setSelectedIndicatorHeight(i);
    }

    public final void setTabStripMargin(float f) {
        this.f122492a.setTabStripMargin(f);
    }

    /* renamed from: a */
    public final void mo89842a(C53377f fVar) {
        C89219l.m154721d(fVar, "");
        m98442a(fVar, this.f122500k.size());
    }

    @Override // android.widget.FrameLayout, android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        C89219l.m154721d(attributeSet, "");
        FrameLayout.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        C89219l.m154716b(generateDefaultLayoutParams, "");
        return generateDefaultLayoutParams;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f122497f || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public final void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        m98447c();
        ValueAnimator valueAnimator = this.f122509t;
        if (valueAnimator == null) {
            C89219l.m154715b();
        }
        valueAnimator.addListener(animatorListener);
    }

    public final void setTabGravity(int i) {
        if (this.f122506q != i) {
            this.f122506q = i;
            m98449d();
        }
    }

    public final void setTabMode(int i) {
        if (i != this.f122507r) {
            this.f122507r = i;
            m98449d();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.homepage.ui.view.tab.top.a$j */
    public static final class C53382j implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C53362a f122573a;

        static {
            Covode.recordClassIndex(62945);
        }

        C53382j(C53362a aVar) {
            this.f122573a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C53362a aVar = this.f122573a;
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            aVar.scrollTo(((Integer) animatedValue).intValue(), 0);
        }
    }

    /* renamed from: b */
    private final void m98445b(C53377f fVar) {
        this.f122492a.addView(fVar.f122561d, fVar.f122558a, m98444b());
        this.f122492a.post(new RunnableC53381i(this));
    }

    public final boolean canScrollHorizontally(int i) {
        int computeHorizontalScrollOffset = computeHorizontalScrollOffset();
        int computeHorizontalScrollRange = computeHorizontalScrollRange() - computeHorizontalScrollExtent();
        if (computeHorizontalScrollRange == 0) {
            return false;
        }
        if (i < 0) {
            if (((float) computeHorizontalScrollOffset) - this.f122512w > 0.0f) {
                return true;
            }
            return false;
        } else if (((float) computeHorizontalScrollOffset) + this.f122512w < ((float) (computeHorizontalScrollRange - 1))) {
            return true;
        } else {
            return false;
        }
    }

    public final void setTabMargin(int i) {
        this.f122502m = mo89849b(i);
        int tabCount = getTabCount();
        for (int i2 = 0; i2 < tabCount; i2++) {
            View childAt = this.f122492a.getChildAt(i2);
            C89219l.m154716b(childAt, "");
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = mo89849b(i);
            marginLayoutParams.rightMargin = mo89849b(i);
            childAt.setLayoutParams(marginLayoutParams);
        }
    }

    public final void setTabMode(String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 66669991) {
                if (hashCode == 97445748 && str.equals("fixed") && this.f122507r != 1) {
                    this.f122507r = 1;
                    m98449d();
                }
            } else if (str.equals("scrollable") && this.f122507r != 0) {
                this.f122507r = 0;
                m98449d();
            }
        }
    }

    /* renamed from: d */
    private final void m98450d(int i) {
        if (i != -1) {
            if (getWindowToken() != null && C0792v.m2788v(this)) {
                C53369e eVar = this.f122492a;
                int childCount = eVar.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = eVar.getChildAt(i2);
                    C89219l.m154716b(childAt, "");
                    if (childAt.getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int a = m98439a(i, 0.0f);
                if (scrollX != a) {
                    m98447c();
                    ValueAnimator valueAnimator = this.f122509t;
                    if (valueAnimator == null) {
                        C89219l.m154715b();
                    }
                    valueAnimator.setIntValues(scrollX, a);
                    ValueAnimator valueAnimator2 = this.f122509t;
                    if (valueAnimator2 == null) {
                        C89219l.m154715b();
                    }
                    valueAnimator2.start();
                }
                this.f122492a.mo89901b(i, 200);
                return;
            }
            m98448c(i);
        }
    }

    private final void setSelectedTabView(int i) {
        boolean z;
        int childCount = this.f122492a.getChildCount();
        if (i < childCount) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.f122492a.getChildAt(i2);
                C89219l.m154716b(childAt, "");
                if (i2 == i) {
                    z = true;
                } else {
                    z = false;
                }
                childAt.setSelected(z);
                if (childAt instanceof C53380h) {
                    C53380h hVar = (C53380h) childAt;
                    TextView mCustomTextView$homepage_common_release = hVar.getMCustomTextView$homepage_common_release();
                    if (hVar.isSelected()) {
                        if (mCustomTextView$homepage_common_release != null) {
                            mCustomTextView$homepage_common_release.setAlpha(1.0f);
                        }
                    } else if (mCustomTextView$homepage_common_release != null) {
                        mCustomTextView$homepage_common_release.setAlpha(this.f122492a.f122545g);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final int mo89849b(int i) {
        Resources resources = getResources();
        C89219l.m154716b(resources, "");
        return Math.round(resources.getDisplayMetrics().density * ((float) i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private C53362a(Context context) {
        super(context, null, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(963);
        this.f122500k = new ArrayList<>();
        this.f122493b = Integer.MAX_VALUE;
        this.f122495d = new ArrayList<>();
        this.f122513x = new C0693f.C0695b(12);
        this.f122514y = true;
        this.f122515z = true;
        setHorizontalScrollBarEnabled(false);
        C53369e eVar = new C53369e(context);
        this.f122492a = eVar;
        super.addView(eVar, 0, new FrameLayout.LayoutParams(-2, -1));
        eVar.setSelectedIndicatorHeight(0);
        eVar.setSelectedIndicatorColor(0);
        this.f122504o = -1;
        this.f122505p = -1;
        this.f122503n = 0;
        this.f122507r = 1;
        this.f122506q = 0;
        getResources();
        this.f122510u = C13628n.m24520b(getContext(), 1.5f);
        this.f122511v = C13628n.m24520b(getContext(), 1.5f);
        Resources resources = getResources();
        C89219l.m154716b(resources, "");
        this.f122498g = resources.getConfiguration().orientation;
        m98449d();
        MethodCollector.m26664o(963);
    }

    /* renamed from: a */
    private final void m98441a(LinearLayout.LayoutParams layoutParams) {
        if (this.f122507r == 1 && this.f122506q == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        int i = this.f122502m;
        if (i != 0) {
            layoutParams.leftMargin = i;
            layoutParams.rightMargin = this.f122502m;
        }
    }

    /* renamed from: a */
    public final C53377f mo89839a(int i) {
        if (i < 0 || i >= getTabCount()) {
            return null;
        }
        return this.f122500k.get(i);
    }

    public /* synthetic */ C53362a(Context context, byte b) {
        this(context);
    }

    /* renamed from: a */
    private void m98442a(C53377f fVar, int i) {
        C89219l.m154721d(fVar, "");
        if (fVar.f122560c == this) {
            m98446b(fVar, i);
            m98445b(fVar);
            return;
        }
        throw new IllegalArgumentException("Tab belongs to a different TabLayout.".toString());
    }

    /* renamed from: b */
    private final void m98446b(C53377f fVar, int i) {
        fVar.f122558a = i;
        this.f122500k.add(i, fVar);
        int size = this.f122500k.size();
        while (true) {
            i++;
            if (i < size) {
                this.f122500k.get(i).f122558a = i;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private final int m98439a(int i, float f) {
        View view;
        int i2;
        int i3 = 0;
        if (this.f122507r != 0) {
            return 0;
        }
        View childAt = this.f122492a.getChildAt(i);
        int i4 = i + 1;
        if (i4 < this.f122492a.getChildCount()) {
            view = this.f122492a.getChildAt(i4);
        } else {
            view = null;
        }
        if (childAt != null) {
            i2 = childAt.getWidth();
        } else {
            i2 = 0;
        }
        if (view != null) {
            i3 = view.getWidth();
        }
        if (childAt == null) {
            C89219l.m154715b();
        }
        int left = (childAt.getLeft() + (i2 / 2)) - (getWidth() / 2);
        int i5 = (int) (((float) (i2 + i3 + (this.f122502m * 4))) * 0.5f * f);
        if (C0792v.m2768e(this) == 0) {
            return left + i5;
        }
        return left - i5;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0059, code lost:
        if (r4.getMeasuredWidth() != getMeasuredWidth()) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0067, code lost:
        if (r4.getMeasuredWidth() < getMeasuredWidth()) goto L_0x0069;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r7, int r8) {
        /*
        // Method dump skipped, instructions count: 167
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.homepage.p3055ui.view.tab.top.C53362a.onMeasure(int, int):void");
    }

    /* renamed from: a */
    public final C53377f mo89840a(View view, String str) {
        C89219l.m154721d(str, "");
        C53377f acquire = f122488B.acquire();
        if (acquire == null) {
            acquire = new C53377f();
        }
        acquire.f122560c = this;
        acquire.f122562e = str;
        acquire.f122561d = m98440a();
        if (view != null) {
            C53380h hVar = acquire.f122561d;
            if (hVar == null) {
                C89219l.m154715b();
            }
            hVar.mo89949a(acquire);
            acquire.mo89945a(view);
        } else {
            C53380h hVar2 = acquire.f122561d;
            if (hVar2 == null) {
                C89219l.m154715b();
            }
            hVar2.setTab(acquire);
        }
        return acquire;
    }

    /* renamed from: a */
    public final void mo89843a(C53377f fVar, boolean z) {
        int i;
        C53377f fVar2 = this.f122501l;
        if (!C89219l.m154714a(fVar2, fVar)) {
            if (fVar != null) {
                i = fVar.f122558a;
            } else {
                i = -1;
            }
            if (z) {
                if ((fVar2 == null || fVar2.f122558a == -1) && i != -1) {
                    m98448c(i);
                } else {
                    m98450d(i);
                }
                if (i != -1) {
                    setSelectedTabView(i);
                }
            }
            if (fVar2 != null) {
                for (int size = this.f122495d.size() - 1; size >= 0; size--) {
                    this.f122495d.get(size).mo89897b(fVar2);
                }
            }
            this.f122501l = fVar;
            if (fVar != null) {
                for (int size2 = this.f122495d.size() - 1; size2 >= 0; size2--) {
                    this.f122495d.get(size2).mo89896a(fVar);
                }
            }
        } else if (fVar2 != null) {
            if (fVar == null) {
                C89219l.m154715b();
            }
            for (int size3 = this.f122495d.size() - 1; size3 >= 0; size3--) {
                this.f122495d.get(size3);
            }
            m98450d(fVar.f122558a);
        }
    }

    /* renamed from: a */
    public final void mo89841a(int i, float f, boolean z, boolean z2) {
        int round = Math.round(((float) i) + f);
        if (round >= 0 && round < this.f122492a.getChildCount()) {
            if (z2) {
                this.f122492a.mo89899a(i, f);
            }
            ValueAnimator valueAnimator = this.f122509t;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                ValueAnimator valueAnimator2 = this.f122509t;
                if (valueAnimator2 == null) {
                    C89219l.m154715b();
                }
                valueAnimator2.cancel();
            }
            scrollTo(m98439a(i, f), 0);
            if (z) {
                setSelectedTabView(round);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean overScrollBy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        C53369e eVar = this.f122492a;
        if (C53362a.this.f122497f && i3 > 0 && eVar.f122519d > 0.0f) {
            C0792v.m2764c(eVar);
        }
        return super.overScrollBy(i, i2, i3, i4, i5, i6, 10, i8, z);
    }
}
