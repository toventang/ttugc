package com.p2082ss.android.ugc.aweme.tools.beauty.views;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.tools.utils.C84912r;
import com.p2082ss.android.ugc.trill.R;
import java.lang.reflect.Field;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.BeautySeekBar */
public final class BeautySeekBar extends View {

    /* renamed from: g */
    public static Drawable f175111g;

    /* renamed from: h */
    public static Drawable f175112h;

    /* renamed from: i */
    public static final C78059a f175113i = new C78059a((byte) 0);

    /* renamed from: A */
    private Paint f175114A;

    /* renamed from: B */
    private Paint f175115B;

    /* renamed from: C */
    private Paint f175116C;

    /* renamed from: D */
    private int f175117D;

    /* renamed from: E */
    private int f175118E;

    /* renamed from: F */
    private String f175119F;

    /* renamed from: G */
    private float f175120G;

    /* renamed from: H */
    private boolean f175121H;

    /* renamed from: I */
    private boolean f175122I;

    /* renamed from: J */
    private Context f175123J;

    /* renamed from: K */
    private boolean f175124K;

    /* renamed from: L */
    private Rect f175125L;

    /* renamed from: M */
    private AbstractC78062c f175126M;

    /* renamed from: N */
    private int f175127N;

    /* renamed from: O */
    private float f175128O;

    /* renamed from: P */
    private float f175129P;

    /* renamed from: Q */
    private float f175130Q;

    /* renamed from: R */
    private float f175131R;

    /* renamed from: S */
    private int f175132S;

    /* renamed from: T */
    private int f175133T;

    /* renamed from: U */
    private int f175134U;

    /* renamed from: V */
    private int f175135V;

    /* renamed from: W */
    private int f175136W;

    /* renamed from: a */
    public String f175137a;

    /* renamed from: aa */
    private boolean f175138aa;

    /* renamed from: ab */
    private boolean f175139ab;

    /* renamed from: ac */
    private boolean f175140ac;

    /* renamed from: ad */
    private boolean f175141ad;

    /* renamed from: ae */
    private ValueAnimator f175142ae;

    /* renamed from: af */
    private boolean f175143af;

    /* renamed from: ag */
    private final Runnable f175144ag;

    /* renamed from: ah */
    private int f175145ah;

    /* renamed from: ai */
    private boolean f175146ai;

    /* renamed from: b */
    public int f175147b;

    /* renamed from: c */
    public int f175148c;

    /* renamed from: d */
    public String f175149d;

    /* renamed from: e */
    public ValueAnimator f175150e;

    /* renamed from: f */
    public float f175151f;

    /* renamed from: j */
    private int f175152j;

    /* renamed from: k */
    private int f175153k;

    /* renamed from: l */
    private int f175154l;

    /* renamed from: m */
    private int f175155m;

    /* renamed from: n */
    private int f175156n;

    /* renamed from: o */
    private int f175157o;

    /* renamed from: p */
    private int f175158p;

    /* renamed from: q */
    private int f175159q;

    /* renamed from: r */
    private int f175160r;

    /* renamed from: s */
    private int f175161s;

    /* renamed from: t */
    private float f175162t;

    /* renamed from: u */
    private int f175163u;

    /* renamed from: v */
    private int f175164v;

    /* renamed from: w */
    private Paint f175165w;

    /* renamed from: x */
    private Paint f175166x;

    /* renamed from: y */
    private Paint f175167y;

    /* renamed from: z */
    private Paint f175168z;

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.BeautySeekBar$c */
    public interface AbstractC78062c {
        static {
            Covode.recordClassIndex(91155);
        }

        /* renamed from: a */
        void mo121572a();

        /* renamed from: a */
        void mo121573a(int i);

        /* renamed from: b */
        void mo121574b(int i);
    }

    static {
        Covode.recordClassIndex(91151);
    }

    public BeautySeekBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.BeautySeekBar$a */
    public static final class C78059a {
        static {
            Covode.recordClassIndex(91152);
        }

        private C78059a() {
        }

        public /* synthetic */ C78059a(byte b) {
            this();
        }

        /* renamed from: a */
        public static float m136470a(Context context) {
            C89219l.m154721d(context, "");
            return C78063d.m136475a(context, 9.0f);
        }

        /* renamed from: b */
        public static float m136471b(Context context) {
            C89219l.m154721d(context, "");
            return C78063d.m136475a(context, 10.0f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.BeautySeekBar$d */
    public static final class C78063d {

        /* renamed from: a */
        public static final C78063d f175171a = new C78063d();

        private C78063d() {
        }

        static {
            Covode.recordClassIndex(91156);
        }

        /* renamed from: a */
        public static float m136475a(Context context, float f) {
            C89219l.m154721d(context, "");
            return C84912r.m145930a(context, f);
        }
    }

    public final float getMActionDownX() {
        return this.f175120G;
    }

    public final int getMBarLocationY() {
        return this.f175161s;
    }

    public final int getMCenterX() {
        return this.f175160r;
    }

    public final int getMColorBlack() {
        return this.f175156n;
    }

    public final int getMColorBlackHint() {
        return this.f175157o;
    }

    public final int getMColorCircle() {
        return this.f175163u;
    }

    public final int getMColorText() {
        return this.f175164v;
    }

    public final int getMColorTextShadow() {
        return this.f175158p;
    }

    public final int getMColorTransparent() {
        return this.f175159q;
    }

    public final int getMColorWhite() {
        return this.f175154l;
    }

    public final int getMColorWhiteHint() {
        return this.f175155m;
    }

    public final Context getMContext() {
        return this.f175123J;
    }

    public final int getMCurPercent() {
        return this.f175117D;
    }

    public final float getMEveryIndexLength() {
        return this.f175162t;
    }

    public final ValueAnimator getMFadeAnimator() {
        return this.f175142ae;
    }

    public final boolean getMHaveInit() {
        return this.f175124K;
    }

    public final boolean getMIsClick() {
        return this.f175121H;
    }

    public final boolean getMIsNormalType() {
        return this.f175139ab;
    }

    public final boolean getMIsTextInCenter() {
        return this.f175140ac;
    }

    public final boolean getMIsTextShowing() {
        return this.f175143af;
    }

    public final Paint getMPaintBar() {
        return this.f175165w;
    }

    public final Paint getMPaintBarHint() {
        return this.f175166x;
    }

    public final Paint getMPaintCircle() {
        return this.f175167y;
    }

    public final Paint getMPaintDefaultCircle() {
        return this.f175168z;
    }

    public final Paint getMPaintTextCenter() {
        return this.f175115B;
    }

    public final Paint getMPaintTextFollow() {
        return this.f175114A;
    }

    public final String getMText() {
        return this.f175119F;
    }

    public final Rect getMTextBounds() {
        return this.f175125L;
    }

    public final boolean getMTouchAble() {
        return this.f175122I;
    }

    public final boolean getMUseBlackUi() {
        return this.f175141ad;
    }

    public final int getMViewHeight() {
        return this.f175153k;
    }

    public final int getMViewWidth() {
        return this.f175152j;
    }

    public final int getMaxPercent() {
        return this.f175134U;
    }

    public final int getMinPercent() {
        return this.f175135V;
    }

    public final Paint getPaintSuggestCirvle() {
        return this.f175116C;
    }

    public final int getPercent() {
        return this.f175117D;
    }

    public final int getSuggestPercent() {
        return this.f175136W;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.BeautySeekBar$e */
    public static final class C78064e implements AbstractC78062c {

        /* renamed from: a */
        final /* synthetic */ BeautySeekBar f175172a;

        /* renamed from: b */
        final /* synthetic */ AbstractC78062c f175173b;

        static {
            Covode.recordClassIndex(91157);
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.beauty.views.BeautySeekBar.AbstractC78062c
        /* renamed from: a */
        public final void mo121572a() {
            this.f175173b.mo121572a();
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.beauty.views.BeautySeekBar.AbstractC78062c
        /* renamed from: b */
        public final void mo121574b(int i) {
            this.f175173b.mo121574b(i);
        }

        @Override // com.p2082ss.android.ugc.aweme.tools.beauty.views.BeautySeekBar.AbstractC78062c
        /* renamed from: a */
        public final void mo121573a(int i) {
            ValueAnimator valueAnimator;
            if ((this.f175172a.f175149d == null || i != this.f175172a.f175147b) && (valueAnimator = this.f175172a.f175150e) != null) {
                valueAnimator.cancel();
                this.f175172a.f175150e = null;
            }
            this.f175173b.mo121573a(i);
        }

        C78064e(BeautySeekBar beautySeekBar, AbstractC78062c cVar) {
            this.f175172a = beautySeekBar;
            this.f175173b = cVar;
        }
    }

    /* renamed from: b */
    private final boolean m136466b() {
        if (this.f175135V != 0) {
            return true;
        }
        int i = this.f175147b;
        if (i == 0 || i == 100) {
            return false;
        }
        return true;
    }

    public final void buildDrawingCache() {
        if (Build.VERSION.SDK_INT >= 23 || ((long) getWidth()) * ((long) getHeight()) * 4 < 838860800) {
            super.buildDrawingCache();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.BeautySeekBar$b */
    final class RunnableC78060b implements Runnable {
        static {
            Covode.recordClassIndex(91153);
        }

        public final void run() {
            if (BeautySeekBar.this.getMIsTextShowing()) {
                ValueAnimator mFadeAnimator = BeautySeekBar.this.getMFadeAnimator();
                if (mFadeAnimator != null) {
                    mFadeAnimator.removeAllListeners();
                    mFadeAnimator.cancel();
                }
                BeautySeekBar.this.getMPaintTextCenter().setShadowLayer(0.0f, 0.0f, 0.0f, BeautySeekBar.this.getMColorTextShadow());
                BeautySeekBar.this.setMFadeAnimator(ValueAnimator.ofFloat(1.0f));
                ValueAnimator mFadeAnimator2 = BeautySeekBar.this.getMFadeAnimator();
                if (mFadeAnimator2 != null) {
                    mFadeAnimator2.addUpdateListener(new C78061a(this));
                    mFadeAnimator2.setDuration(300L);
                    mFadeAnimator2.start();
                }
                BeautySeekBar.this.setMIsTextShowing(false);
            }
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public RunnableC78060b() {
        }

        /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.BeautySeekBar$b$a */
        static final class C78061a implements ValueAnimator.AnimatorUpdateListener {

            /* renamed from: a */
            final /* synthetic */ RunnableC78060b f175170a;

            static {
                Covode.recordClassIndex(91154);
            }

            C78061a(RunnableC78060b bVar) {
                this.f175170a = bVar;
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C89219l.m154716b(valueAnimator, "");
                Object animatedValue = valueAnimator.getAnimatedValue();
                Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
                BeautySeekBar.this.setTextAlpha((int) ((1.0f - ((Float) animatedValue).floatValue()) * 255.0f));
                BeautySeekBar.this.invalidate();
            }
        }
    }

    /* renamed from: a */
    private void m136463a() {
        this.f175160r = this.f175152j / 2;
        Context context = getContext();
        C89219l.m154716b(context, "");
        this.f175161s = (int) C78063d.m136475a(context, 32.0f);
        this.f175162t = (((float) this.f175152j) - (this.f175131R * 2.0f)) / ((float) this.f175133T);
        this.f175124K = true;
        invalidate();
    }

    /* renamed from: c */
    private void m136467c() {
        float f;
        removeCallbacks(this.f175144ag);
        if (!this.f175143af && !TextUtils.isEmpty(this.f175119F)) {
            ValueAnimator valueAnimator = this.f175142ae;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                valueAnimator.cancel();
            }
            Paint paint = this.f175115B;
            Context context = getContext();
            C89219l.m154716b(context, "");
            if (this.f175141ad) {
                f = 0.0f;
            } else {
                f = 3.0f;
            }
            paint.setShadowLayer(C78063d.m136475a(context, f), 0.0f, 0.0f, this.f175158p);
            setTextAlpha(255);
            this.f175143af = true;
            invalidate();
        }
    }

    public final void setIsTwoWayMode(boolean z) {
        this.f175146ai = z;
    }

    public final void setLevelAdjustBarTitle(String str) {
        this.f175137a = str;
    }

    public final void setMActionDownX(float f) {
        this.f175120G = f;
    }

    public final void setMBarLocationY(int i) {
        this.f175161s = i;
    }

    public final void setMCenterX(int i) {
        this.f175160r = i;
    }

    public final void setMColorBlack(int i) {
        this.f175156n = i;
    }

    public final void setMColorBlackHint(int i) {
        this.f175157o = i;
    }

    public final void setMColorCircle(int i) {
        this.f175163u = i;
    }

    public final void setMColorText(int i) {
        this.f175164v = i;
    }

    public final void setMColorTextShadow(int i) {
        this.f175158p = i;
    }

    public final void setMColorTransparent(int i) {
        this.f175159q = i;
    }

    public final void setMColorWhite(int i) {
        this.f175154l = i;
    }

    public final void setMColorWhiteHint(int i) {
        this.f175155m = i;
    }

    public final void setMContext(Context context) {
        this.f175123J = context;
    }

    public final void setMCurPercent(int i) {
        this.f175117D = i;
    }

    public final void setMEveryIndexLength(float f) {
        this.f175162t = f;
    }

    public final void setMFadeAnimator(ValueAnimator valueAnimator) {
        this.f175142ae = valueAnimator;
    }

    public final void setMHaveInit(boolean z) {
        this.f175124K = z;
    }

    public final void setMIsClick(boolean z) {
        this.f175121H = z;
    }

    public final void setMIsNormalType(boolean z) {
        this.f175139ab = z;
    }

    public final void setMIsTextInCenter(boolean z) {
        this.f175140ac = z;
    }

    public final void setMIsTextShowing(boolean z) {
        this.f175143af = z;
    }

    public final void setMTouchAble(boolean z) {
        this.f175122I = z;
    }

    public final void setMUseBlackUi(boolean z) {
        this.f175141ad = z;
    }

    public final void setMViewHeight(int i) {
        this.f175153k = i;
    }

    public final void setMViewWidth(int i) {
        this.f175152j = i;
    }

    public final void setNeedShowSuggestCircle(boolean z) {
        this.f175138aa = z;
    }

    public final void setSuggestPercent(int i) {
        this.f175136W = i;
    }

    public final void setTextInCenter(boolean z) {
        this.f175140ac = z;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.BeautySeekBar$g */
    public static final class C78066g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ BeautySeekBar f175177a;

        static {
            Covode.recordClassIndex(91159);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C78066g(BeautySeekBar beautySeekBar) {
            this.f175177a = beautySeekBar;
        }

        public final void onAnimationEnd(Animator animator) {
            C89219l.m154721d(animator, "");
            this.f175177a.setMTouchAble(true);
            super.onAnimationEnd(animator);
        }
    }

    public final void setBarPadding(float f) {
        this.f175131R = f;
        m136463a();
    }

    public final void setMPaintBar(Paint paint) {
        C89219l.m154721d(paint, "");
        this.f175165w = paint;
    }

    public final void setMPaintBarHint(Paint paint) {
        C89219l.m154721d(paint, "");
        this.f175166x = paint;
    }

    public final void setMPaintCircle(Paint paint) {
        C89219l.m154721d(paint, "");
        this.f175167y = paint;
    }

    public final void setMPaintDefaultCircle(Paint paint) {
        C89219l.m154721d(paint, "");
        this.f175168z = paint;
    }

    public final void setMPaintTextCenter(Paint paint) {
        C89219l.m154721d(paint, "");
        this.f175115B = paint;
    }

    public final void setMPaintTextFollow(Paint paint) {
        C89219l.m154721d(paint, "");
        this.f175114A = paint;
    }

    public final void setMText(String str) {
        C89219l.m154721d(str, "");
        this.f175119F = str;
    }

    public final void setMTextBounds(Rect rect) {
        C89219l.m154721d(rect, "");
        this.f175125L = rect;
    }

    public final void setPaintSuggestCirvle(Paint paint) {
        C89219l.m154721d(paint, "");
        this.f175116C = paint;
    }

    public final void setPercent(int i) {
        this.f175117D = i;
        invalidate();
    }

    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        C89219l.m154721d(accessibilityEvent, "");
        super.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    public final void setBarHeight(float f) {
        this.f175165w.setStrokeWidth(f);
        this.f175166x.setStrokeWidth(f);
    }

    public final void setDefaultCircleConfig(int i) {
        this.f175168z.setColor(getResources().getColor(i));
    }

    public final void setOnLevelChangeListener(AbstractC78062c cVar) {
        C89219l.m154721d(cVar, "");
        this.f175126M = new C78064e(this, cVar);
    }

    public final void setSuggestCircleColor(int i) {
        this.f175116C.setColor(getResources().getColor(i));
    }

    public final void setTextAlpha(int i) {
        this.f175145ah = i;
        this.f175115B.setAlpha(i);
        this.f175114A.setAlpha(i);
    }

    public final void setTextSize(float f) {
        this.f175115B.setTextSize(f);
        this.f175114A.setTextSize(f);
    }

    /* renamed from: b */
    private final int m136465b(int i) {
        int i2;
        int i3 = this.f175132S;
        if (((float) (i % i3)) >= ((float) i3) / 2.0f) {
            i2 = (i / i3) + 1;
        } else {
            i2 = i / i3;
        }
        return i2 * i3;
    }

    /* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.BeautySeekBar$f */
    static final class C78065f implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ BeautySeekBar f175174a;

        /* renamed from: b */
        final /* synthetic */ int f175175b;

        /* renamed from: c */
        final /* synthetic */ int f175176c;

        static {
            Covode.recordClassIndex(91158);
        }

        C78065f(BeautySeekBar beautySeekBar, int i, int i2) {
            this.f175174a = beautySeekBar;
            this.f175175b = i;
            this.f175176c = i2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C89219l.m154716b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            float floatValue = ((Float) animatedValue).floatValue();
            BeautySeekBar beautySeekBar = this.f175174a;
            int i = this.f175175b;
            beautySeekBar.setMCurPercent((int) (((float) i) + (((float) (this.f175176c - i)) * floatValue)));
            this.f175174a.invalidate();
        }
    }

    /* renamed from: a */
    private int m136462a(int i) {
        int i2;
        if (this.f175132S > 1) {
            i = m136465b(i);
        }
        if (i > this.f175133T) {
            i2 = this.f175134U;
        } else if (i <= 0) {
            i2 = this.f175135V;
        } else {
            i2 = i + this.f175135V;
        }
        if (!m136466b()) {
            return i2;
        }
        int i3 = this.f175147b;
        return (i2 < i3 + -2 || i2 > i3 + 2) ? i2 : i3;
    }

    private final void setCurrentProgress(int i) {
        if (!(this.f175126M == null || this.f175117D == i)) {
            this.f175117D = Math.min(this.f175134U, Math.max(i, this.f175135V));
            AbstractC78062c cVar = this.f175126M;
            if (cVar == null) {
                C89219l.m154715b();
            }
            cVar.mo121573a(this.f175117D);
        }
        invalidate();
        sendAccessibilityEvent(4);
    }

    public final void buildDrawingCache(boolean z) {
        if (Build.VERSION.SDK_INT >= 23 || ((long) getWidth()) * ((long) getHeight()) * 4 < 838860800) {
            super.buildDrawingCache(z);
        }
    }

    public final void setContentDescription(CharSequence charSequence) {
        try {
            Field declaredField = View.class.getDeclaredField("mContentDescription");
            C89219l.m154716b(declaredField, "");
            declaredField.setAccessible(true);
            declaredField.set(this, charSequence);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
            super.setContentDescription(charSequence);
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            super.setContentDescription(charSequence);
        }
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        C89219l.m154721d(accessibilityNodeInfo, "");
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (Build.VERSION.SDK_INT >= 24) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS);
        }
        if (Build.VERSION.SDK_INT >= 21 && isEnabled()) {
            if (this.f175117D > this.f175135V) {
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
            }
            if (this.f175117D < this.f175134U) {
                accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            }
        }
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo.RangeInfo obtain = AccessibilityNodeInfo.RangeInfo.obtain(0, (float) this.f175135V, (float) this.f175134U, (float) this.f175117D);
        C89219l.m154716b(obtain, "");
        accessibilityNodeInfo.setRangeInfo(obtain);
    }

    /* renamed from: a */
    private void m136464a(boolean z) {
        this.f175165w.setColor(this.f175154l);
        if (z) {
            Paint paint = this.f175165w;
            Context context = getContext();
            C89219l.m154716b(context, "");
            paint.setShadowLayer(C78063d.m136475a(context, 1.0f), 0.0f, 0.0f, this.f175158p);
        }
        this.f175166x.setColor(this.f175155m);
        if (z) {
            Paint paint2 = this.f175166x;
            Context context2 = getContext();
            C89219l.m154716b(context2, "");
            paint2.setShadowLayer(C78063d.m136475a(context2, 1.0f), 0.0f, 0.0f, this.f175158p);
        }
        this.f175167y.setColor(this.f175163u);
        if (z) {
            Paint paint3 = this.f175167y;
            Context context3 = getContext();
            C89219l.m154716b(context3, "");
            paint3.setShadowLayer(C78063d.m136475a(context3, 3.0f), 0.0f, 0.0f, this.f175158p);
        }
        this.f175168z.setColor(this.f175154l);
        this.f175116C.setColor(getResources().getColor(17170443));
        this.f175114A.setColor(this.f175164v);
        this.f175115B.setColor(this.f175154l);
        setTextAlpha(this.f175145ah);
        this.f175141ad = false;
        if (!this.f175141ad && f175111g == null) {
            f175111g = getResources().getDrawable(R.drawable.d7);
        }
        invalidate();
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        String str;
        Paint paint;
        int i;
        Drawable drawable;
        int i2;
        MethodCollector.m26663i(9479);
        C89219l.m154721d(canvas, "");
        super.onDraw(canvas);
        if (!this.f175124K) {
            MethodCollector.m26664o(9479);
            return;
        }
        int i3 = this.f175117D;
        int i4 = this.f175135V;
        float f = this.f175131R;
        float f2 = this.f175162t;
        float f3 = (((float) (i3 - i4)) * f2) + f;
        float f4 = f + (((float) (this.f175147b - i4)) * f2);
        float f5 = f + (((float) (this.f175136W - i4)) * f2);
        int i5 = this.f175161s;
        canvas.drawLine(f, (float) i5, ((float) this.f175152j) - f, (float) i5, this.f175166x);
        if (this.f175139ab) {
            float f6 = this.f175131R;
            int i6 = this.f175161s;
            canvas.drawLine(f6, (float) i6, f3, (float) i6, this.f175165w);
        } else {
            int i7 = this.f175161s;
            canvas.drawLine(f3, (float) i7, f4, (float) i7, this.f175165w);
        }
        this.f175167y.setAlpha(255);
        this.f175168z.setAlpha(255);
        this.f175116C.setAlpha(255);
        this.f175115B.setAlpha(255);
        this.f175114A.setAlpha(255);
        int i8 = this.f175135V;
        int i9 = this.f175134U;
        int i10 = this.f175147b;
        if (i8 <= i10 && i9 >= i10 && m136466b()) {
            float f7 = (float) this.f175161s;
            Context context = getContext();
            C89219l.m154716b(context, "");
            canvas.drawCircle(f4, f7, C78063d.m136475a(context, 2.0f), this.f175168z);
        }
        int i11 = this.f175135V;
        int i12 = this.f175134U;
        int i13 = this.f175136W;
        if (i11 <= i13 && i12 >= i13 && this.f175138aa) {
            Context context2 = getContext();
            C89219l.m154716b(context2, "");
            canvas.drawCircle(f5, (float) this.f175161s, C78063d.m136475a(context2, 3.0f), this.f175116C);
        }
        canvas.drawCircle(f3, (float) this.f175161s, this.f175129P, this.f175167y);
        int i14 = this.f175148c;
        if (i14 == Integer.MIN_VALUE) {
            i14 = this.f175117D;
        }
        if (this.f175151f == 0.0f) {
            str = String.valueOf(i14);
        } else {
            str = this.f175149d;
            if (str == null) {
                str = "";
            }
        }
        if (!TextUtils.isEmpty(this.f175137a) && !TextUtils.isEmpty(str)) {
            str = this.f175137a + ' ' + str;
        }
        this.f175119F = str;
        if (TextUtils.isEmpty(str)) {
            MethodCollector.m26664o(9479);
            return;
        }
        if (this.f175140ac) {
            paint = this.f175115B;
        } else {
            paint = this.f175114A;
        }
        Paint paint2 = this.f175114A;
        String str2 = this.f175119F;
        paint2.getTextBounds(str2, 0, str2.length(), this.f175125L);
        int width = this.f175125L.width();
        Context context3 = getContext();
        C89219l.m154716b(context3, "");
        int a = (int) C78063d.m136475a(context3, 14.0f);
        if (this.f175140ac) {
            i = this.f175160r;
        } else {
            i = (int) f3;
        }
        Context context4 = getContext();
        C89219l.m154716b(context4, "");
        int a2 = (i - (width / 2)) - ((int) C78063d.m136475a(context4, 1.0f));
        int i15 = this.f175161s - a;
        if (this.f175141ad) {
            drawable = f175112h;
        } else {
            drawable = f175111g;
        }
        if (!this.f175140ac && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int max = Math.max(width, intrinsicWidth);
            float f8 = this.f175151f;
            if (f8 == 1.0f) {
                i2 = this.f175145ah;
                max += intrinsicWidth;
            } else if (f8 > 0.0f) {
                max = ((int) (((float) intrinsicWidth) + (((float) (max - intrinsicWidth)) * f8))) + (intrinsicWidth * ((int) f8));
                i2 = 255;
            } else {
                i2 = this.f175145ah;
            }
            float f9 = ((float) i) - (((float) max) / 2.0f);
            Context context5 = getContext();
            C89219l.m154716b(context5, "");
            float a3 = ((float) this.f175161s) - C78063d.m136475a(context5, 57.0f);
            drawable.setAlpha(i2);
            drawable.setBounds(0, 0, max, drawable.getIntrinsicHeight());
            canvas.save();
            canvas.translate(f9, a3);
            drawable.draw(canvas);
            canvas.restore();
        }
        float f10 = this.f175151f;
        if (f10 <= 0.0f || f10 >= 1.0f) {
            canvas.drawText(this.f175119F, (float) a2, (float) i15, paint);
            MethodCollector.m26664o(9479);
            return;
        }
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (this.f175151f * 255.0f));
        canvas.drawText(this.f175119F, (float) a2, (float) i15, paint);
        paint.setAlpha(alpha);
        MethodCollector.m26664o(9479);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0051, code lost:
        if (r3 > (r2 - (r1 - com.p2082ss.android.ugc.aweme.tools.beauty.views.BeautySeekBar.C78059a.m136471b(r0)))) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
        // Method dump skipped, instructions count: 434
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.tools.beauty.views.BeautySeekBar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (!isEnabled()) {
            return false;
        }
        if (i == 4096 || i == 8192) {
            int max = Math.max(1, Math.round(((float) (this.f175134U - this.f175135V)) / 20.0f));
            if (i == 8192) {
                max = -max;
            }
            setCurrentProgress(this.f175117D + max);
            return true;
        } else if (i != 16908349) {
            return super.performAccessibilityAction(i, bundle);
        } else {
            if (Build.VERSION.SDK_INT < 24 || bundle == null || !bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                return false;
            }
            setCurrentProgress((int) bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"));
            return true;
        }
    }

    private /* synthetic */ BeautySeekBar(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* renamed from: a */
    public final void mo121790a(int i, int i2, int i3) {
        this.f175154l = i;
        this.f175155m = i2;
        this.f175163u = i3;
        m136464a(false);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private BeautySeekBar(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        String str = "";
        C89219l.m154721d(context, str);
        MethodCollector.m26663i(9799);
        this.f175165w = new Paint();
        this.f175166x = new Paint();
        this.f175167y = new Paint();
        this.f175168z = new Paint();
        this.f175114A = new Paint();
        this.f175115B = new Paint();
        this.f175116C = new Paint();
        this.f175119F = str;
        this.f175122I = true;
        this.f175125L = new Rect();
        this.f175131R = C78063d.m136475a(context, 40.0f);
        this.f175138aa = true;
        this.f175139ab = true;
        this.f175143af = true;
        this.f175148c = Integer.MIN_VALUE;
        this.f175144ag = new RunnableC78060b();
        this.f175151f = 0.1f;
        this.f175123J = context;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.jt, R.attr.ju, R.attr.jv, R.attr.jw, R.attr.jx, R.attr.jy, R.attr.jz, R.attr.k0});
            C89219l.m154716b(obtainStyledAttributes, str);
            String string = obtainStyledAttributes.getString(5);
            this.f175137a = string != null ? string : str;
            this.f175127N = obtainStyledAttributes.getColor(6, -16777216);
            this.f175128O = obtainStyledAttributes.getDimension(7, C78063d.m136475a(context, 14.0f));
            this.f175131R = obtainStyledAttributes.getDimension(0, C78063d.m136475a(context, 40.0f));
            this.f175129P = obtainStyledAttributes.getDimension(3, C78059a.m136470a(context));
            this.f175130Q = obtainStyledAttributes.getDimension(2, C78063d.m136475a(context, 4.0f));
            this.f175132S = obtainStyledAttributes.getInt(4, 1);
            this.f175164v = obtainStyledAttributes.getColor(1, getResources().getColor(17170443));
            obtainStyledAttributes.recycle();
            setLayerType(1, null);
            this.f175154l = 17170443;
            this.f175155m = 1040187391;
            this.f175156n = R.color.e_;
            this.f175157o = R.color.dy;
            this.f175158p = 1073741824;
            this.f175159q = R.color.ur;
            this.f175163u = 17170443;
            this.f175165w.setStyle(Paint.Style.FILL);
            this.f175165w.setStrokeWidth(this.f175130Q);
            this.f175165w.setStrokeCap(Paint.Cap.ROUND);
            this.f175165w.setAntiAlias(true);
            this.f175166x.setStyle(Paint.Style.FILL);
            this.f175166x.setStrokeWidth(this.f175130Q);
            this.f175166x.setStrokeCap(Paint.Cap.ROUND);
            this.f175166x.setAntiAlias(true);
            this.f175167y.setStyle(Paint.Style.FILL);
            this.f175167y.setAntiAlias(true);
            this.f175168z.setStyle(Paint.Style.FILL);
            this.f175168z.setAntiAlias(true);
            this.f175116C.setStyle(Paint.Style.FILL);
            this.f175116C.setAntiAlias(true);
            this.f175114A.setTextSize(this.f175128O);
            this.f175114A.setAntiAlias(true);
            this.f175115B.setTextSize(this.f175128O);
            this.f175115B.setAntiAlias(true);
            m136464a(true);
            setImportantForAccessibility(1);
            setFocusable(true);
            setFocusableInTouchMode(true);
            setClickable(true);
            if (Build.VERSION.SDK_INT >= 26) {
                setFocusedByDefault(true);
            }
        }
        MethodCollector.m26664o(9799);
    }

    /* renamed from: a */
    public void mo121791a(int i, int i2, boolean z) {
        int i3;
        this.f175134U = i;
        this.f175135V = i2;
        if (i2 <= 0 && i >= 0) {
            i3 = 0;
        } else {
            i3 = i;
        }
        this.f175147b = i3;
        this.f175133T = i - i2;
        this.f175139ab = z;
        if (this.f175152j > 0 && this.f175153k > 0) {
            m136463a();
        }
        invalidate();
        this.f175149d = null;
        ValueAnimator valueAnimator = this.f175150e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f175150e = null;
        }
        this.f175151f = 0.0f;
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f175153k != getMeasuredHeight() || this.f175152j != getMeasuredWidth()) {
            this.f175152j = getMeasuredWidth();
            this.f175153k = getMeasuredHeight();
            m136463a();
        }
    }
}
