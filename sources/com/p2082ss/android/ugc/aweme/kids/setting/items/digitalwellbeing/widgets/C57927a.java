package com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.widgets;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Property;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.AdapterView;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.widgets.a */
public class C57927a extends RelativeLayout {

    /* renamed from: A */
    private int f132037A;

    /* renamed from: B */
    private GestureDetector f132038B;

    /* renamed from: C */
    private RunnableC57933a f132039C;

    /* renamed from: D */
    private RunnableC57934b f132040D;

    /* renamed from: E */
    private GestureDetector.SimpleOnGestureListener f132041E = new GestureDetector.SimpleOnGestureListener() {
        /* class com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.widgets.C57927a.C579292 */

        static {
            Covode.recordClassIndex(67951);
        }

        public final boolean onDown(MotionEvent motionEvent) {
            C57927a.this.f132053k = false;
            return super.onDown(motionEvent);
        }

        public final void onLongPress(MotionEvent motionEvent) {
            C57927a aVar = C57927a.this;
            aVar.f132053k = aVar.f132049g.performLongClick();
            if (C57927a.this.f132053k) {
                if (C57927a.this.f132043a) {
                    C57927a.this.mo95244a(null);
                }
                C57927a.this.mo95243a();
            }
        }
    };

    /* renamed from: F */
    private Property<C57927a, Integer> f132042F = new Property<C57927a, Integer>(Integer.class, "rippleAlpha") {
        /* class com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.widgets.C57927a.C579325 */

        static {
            Covode.recordClassIndex(67954);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ Integer get(C57927a aVar) {
            return Integer.valueOf(aVar.getRippleAlpha());
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ void set(C57927a aVar, Integer num) {
            aVar.setRippleAlpha(num);
        }
    };

    /* renamed from: a */
    public boolean f132043a;

    /* renamed from: b */
    int f132044b;

    /* renamed from: c */
    public int f132045c;

    /* renamed from: d */
    public boolean f132046d;

    /* renamed from: e */
    public boolean f132047e;

    /* renamed from: f */
    public boolean f132048f;

    /* renamed from: g */
    public View f132049g;

    /* renamed from: h */
    ObjectAnimator f132050h;

    /* renamed from: i */
    boolean f132051i;

    /* renamed from: j */
    public boolean f132052j;

    /* renamed from: k */
    public boolean f132053k;

    /* renamed from: l */
    Property<C57927a, Float> f132054l = new Property<C57927a, Float>(Float.class, "radius") {
        /* class com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.widgets.C57927a.C579314 */

        static {
            Covode.recordClassIndex(67953);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ Float get(C57927a aVar) {
            return Float.valueOf(aVar.getRadius());
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // android.util.Property
        public final /* synthetic */ void set(C57927a aVar, Float f) {
            aVar.setRadius(f.floatValue());
        }
    };

    /* renamed from: m */
    private final Paint f132055m;

    /* renamed from: n */
    private final Rect f132056n = new Rect();

    /* renamed from: o */
    private int f132057o;

    /* renamed from: p */
    private boolean f132058p;

    /* renamed from: q */
    private int f132059q;

    /* renamed from: r */
    private int f132060r;

    /* renamed from: s */
    private Drawable f132061s;

    /* renamed from: t */
    private float f132062t;

    /* renamed from: u */
    private float f132063u;

    /* renamed from: v */
    private AdapterView f132064v;

    /* renamed from: w */
    private AnimatorSet f132065w;

    /* renamed from: x */
    private Point f132066x = new Point();

    /* renamed from: y */
    private Point f132067y = new Point();

    /* renamed from: z */
    private int f132068z;

    static {
        Covode.recordClassIndex(67949);
    }

    public boolean isInEditMode() {
        return true;
    }

    public <T extends View> T getChildView() {
        return (T) this.f132049g;
    }

    public float getRadius() {
        return this.f132063u;
    }

    /* renamed from: d */
    private void m104711d() {
        int i = Build.VERSION.SDK_INT;
    }

    public int getRippleAlpha() {
        return this.f132055m.getAlpha();
    }

    /* renamed from: a */
    public final void mo95243a() {
        RunnableC57934b bVar = this.f132040D;
        if (bVar != null) {
            removeCallbacks(bVar);
            this.f132052j = false;
        }
    }

    /* renamed from: c */
    private void m104710c() {
        AnimatorSet animatorSet = this.f132065w;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f132065w.removeAllListeners();
        }
        ObjectAnimator objectAnimator = this.f132050h;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    /* renamed from: b */
    public final AdapterView mo95246b() {
        AdapterView adapterView = this.f132064v;
        if (adapterView != null) {
            return adapterView;
        }
        ViewParent parent = getParent();
        while (!(parent instanceof AdapterView)) {
            try {
                parent = parent.getParent();
            } catch (NullPointerException unused) {
                throw new RuntimeException("Could not find a parent AdapterView");
            }
        }
        AdapterView adapterView2 = (AdapterView) parent;
        this.f132064v = adapterView2;
        return adapterView2;
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.widgets.a$a */
    class RunnableC57933a implements Runnable {
        static {
            Covode.recordClassIndex(67955);
        }

        public final void run() {
            if (!C57927a.this.f132053k) {
                if (C57927a.this.getParent() instanceof AdapterView) {
                    if (!C57927a.this.f132049g.performClick()) {
                        m104715a((AdapterView) C57927a.this.getParent());
                    }
                } else if (C57927a.this.f132048f) {
                    m104715a(C57927a.this.mo95246b());
                } else {
                    C57927a.this.f132049g.performClick();
                }
            }
        }

        private RunnableC57933a() {
        }

        /* renamed from: a */
        private void m104715a(AdapterView adapterView) {
            long j;
            int positionForView = adapterView.getPositionForView(C57927a.this);
            if (adapterView.getAdapter() != null) {
                j = adapterView.getAdapter().getItemId(positionForView);
            } else {
                j = 0;
            }
            if (positionForView != -1) {
                adapterView.performItemClick(C57927a.this, positionForView, j);
            }
        }

        /* synthetic */ RunnableC57933a(C57927a aVar, byte b) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.widgets.a$b */
    public final class RunnableC57934b implements Runnable {

        /* renamed from: b */
        private final MotionEvent f132077b;

        static {
            Covode.recordClassIndex(67956);
        }

        public final void run() {
            C57927a.this.f132052j = false;
            C57927a.this.f132049g.setLongClickable(false);
            C57927a.this.f132049g.onTouchEvent(this.f132077b);
            C57927a.this.f132049g.setPressed(true);
            if (C57927a.this.f132043a) {
                C57927a aVar = C57927a.this;
                if (!aVar.f132051i) {
                    if (aVar.f132050h != null) {
                        aVar.f132050h.cancel();
                    }
                    float sqrt = (float) (Math.sqrt(Math.pow((double) aVar.getWidth(), 2.0d) + Math.pow((double) aVar.getHeight(), 2.0d)) * 1.2000000476837158d);
                    aVar.f132050h = ObjectAnimator.ofFloat(aVar, aVar.f132054l, (float) aVar.f132044b, sqrt).setDuration(2500L);
                    aVar.f132050h.setInterpolator(new LinearInterpolator());
                    aVar.f132050h.start();
                }
            }
        }

        public RunnableC57934b(MotionEvent motionEvent) {
            this.f132077b = motionEvent;
        }
    }

    private float getEndRadius() {
        int i;
        int i2;
        int width = getWidth();
        int height = getHeight();
        int i3 = height / 2;
        if (width / 2 > this.f132066x.x) {
            i = width - this.f132066x.x;
        } else {
            i = this.f132066x.x;
        }
        float f = (float) i;
        if (i3 > this.f132066x.y) {
            i2 = height - this.f132066x.y;
        } else {
            i2 = this.f132066x.y;
        }
        return ((float) Math.sqrt(Math.pow((double) f, 2.0d) + Math.pow((double) ((float) i2), 2.0d))) * 1.2f;
    }

    public void setRippleDelayClick(boolean z) {
        this.f132046d = z;
    }

    public void setRippleDiameter(int i) {
        this.f132044b = i;
    }

    public void setRippleDuration(int i) {
        this.f132059q = i;
    }

    public void setRippleFadeDuration(int i) {
        this.f132060r = i;
    }

    public void setRippleHover(boolean z) {
        this.f132043a = z;
    }

    public void setRippleInAdapter(boolean z) {
        this.f132048f = z;
    }

    public void setRippleOverlay(boolean z) {
        this.f132058p = z;
    }

    public void setRipplePersistent(boolean z) {
        this.f132047e = z;
    }

    public void setRadius(float f) {
        this.f132063u = f;
        invalidate();
    }

    public void setRippleRoundedCorners(int i) {
        this.f132062t = (float) i;
        m104711d();
    }

    public void setDefaultRippleAlpha(float f) {
        int i = (int) (f * 255.0f);
        this.f132045c = i;
        this.f132055m.setAlpha(i);
        invalidate();
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        View view = this.f132049g;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            return;
        }
        throw new IllegalStateException("MaterialRippleLayout must have a child view to handle clicks");
    }

    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        View view = this.f132049g;
        if (view != null) {
            view.setOnLongClickListener(onLongClickListener);
            return;
        }
        throw new IllegalStateException("MaterialRippleLayout must have a child view to handle clicks");
    }

    public void setRippleAlpha(Integer num) {
        this.f132055m.setAlpha(num.intValue());
        invalidate();
    }

    public void setRippleBackground(int i) {
        ColorDrawable colorDrawable = new ColorDrawable(i);
        this.f132061s = colorDrawable;
        colorDrawable.setBounds(this.f132056n);
        invalidate();
    }

    public void setRippleColor(int i) {
        this.f132057o = i;
        this.f132055m.setColor(i);
        this.f132055m.setAlpha(this.f132045c);
        invalidate();
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r11) {
        /*
            r10 = this;
            android.view.View r8 = r10.f132049g
            float r0 = r11.getX()
            int r9 = (int) r0
            float r0 = r11.getY()
            int r7 = (int) r0
        L_0x000c:
            boolean r0 = r8 instanceof android.view.ViewGroup
            r6 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0039
            r4 = r8
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r3 = 0
        L_0x0016:
            int r0 = r4.getChildCount()
            if (r3 >= r0) goto L_0x0056
            android.view.View r2 = r4.getChildAt(r3)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r2.getHitRect(r1)
            boolean r0 = r1.contains(r9, r7)
            if (r0 == 0) goto L_0x0036
            int r0 = r1.left
            int r9 = r9 - r0
            int r0 = r1.top
            int r7 = r7 - r0
            r8 = r2
            goto L_0x000c
        L_0x0036:
            int r3 = r3 + 1
            goto L_0x0016
        L_0x0039:
            android.view.View r0 = r10.f132049g
            if (r8 == r0) goto L_0x0056
            boolean r0 = r8.isEnabled()
            if (r0 == 0) goto L_0x005c
            boolean r0 = r8.isClickable()
            if (r0 != 0) goto L_0x0055
            boolean r0 = r8.isLongClickable()
            if (r0 != 0) goto L_0x0055
            boolean r0 = r8.isFocusableInTouchMode()
            if (r0 == 0) goto L_0x005c
        L_0x0055:
            return r5
        L_0x0056:
            boolean r0 = r8.isFocusableInTouchMode()
            if (r0 != 0) goto L_0x0055
        L_0x005c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.widgets.C57927a.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: a */
    public final void mo95244a(final Runnable runnable) {
        if (!this.f132051i) {
            float endRadius = getEndRadius();
            m104710c();
            AnimatorSet animatorSet = new AnimatorSet();
            this.f132065w = animatorSet;
            animatorSet.addListener(new AnimatorListenerAdapter() {
                /* class com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.widgets.C57927a.C579303 */

                static {
                    Covode.recordClassIndex(67952);
                }

                public final void onAnimationEnd(Animator animator) {
                    if (!C57927a.this.f132047e) {
                        C57927a.this.setRadius(0.0f);
                        C57927a aVar = C57927a.this;
                        aVar.setRippleAlpha(Integer.valueOf(aVar.f132045c));
                    }
                    if (runnable != null && C57927a.this.f132046d) {
                        runnable.run();
                    }
                    C57927a.this.f132049g.setPressed(false);
                }
            });
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, this.f132054l, this.f132063u, endRadius);
            ofFloat.setDuration((long) this.f132059q);
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ObjectAnimator ofInt = ObjectAnimator.ofInt(this, this.f132042F, this.f132045c, 0);
            ofInt.setDuration((long) this.f132060r);
            ofInt.setInterpolator(new AccelerateInterpolator());
            ofInt.setStartDelay((long) ((this.f132059q - this.f132060r) - 50));
            if (this.f132047e) {
                this.f132065w.play(ofFloat);
            } else if (getRadius() > endRadius) {
                ofInt.setStartDelay(0);
                this.f132065w.play(ofInt);
            } else {
                this.f132065w.playTogether(ofFloat, ofInt);
            }
            this.f132065w.start();
        }
    }

    public void draw(Canvas canvas) {
        boolean z;
        boolean z2 = false;
        if (this.f132048f) {
            int positionForView = mo95246b().getPositionForView(this);
            if (positionForView != this.f132037A) {
                z = true;
            } else {
                z = false;
            }
            this.f132037A = positionForView;
            if (z) {
                mo95243a();
                m104710c();
                this.f132049g.setPressed(false);
                setRadius(0.0f);
            }
            z2 = z;
        }
        if (this.f132058p) {
            if (!z2) {
                this.f132061s.draw(canvas);
            }
            super.draw(canvas);
            if (!z2) {
                if (this.f132062t != 0.0f) {
                    Path path = new Path();
                    RectF rectF = new RectF(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight());
                    float f = this.f132062t;
                    path.addRoundRect(rectF, f, f, Path.Direction.CW);
                    canvas.clipPath(path);
                }
                canvas.drawCircle((float) this.f132066x.x, (float) this.f132066x.y, this.f132063u, this.f132055m);
                return;
            }
            return;
        }
        if (!z2) {
            this.f132061s.draw(canvas);
            canvas.drawCircle((float) this.f132066x.x, (float) this.f132066x.y, this.f132063u, this.f132055m);
        }
        super.draw(canvas);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a4, code lost:
        if (r4 == false) goto L_0x00a6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
        // Method dump skipped, instructions count: 316
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.widgets.C57927a.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public C57927a(Context context, AttributeSet attributeSet) {
        super(context, null, 0);
        MethodCollector.m26663i(9554);
        Paint paint = new Paint(1);
        this.f132055m = paint;
        setWillNotDraw(false);
        this.f132038B = new GestureDetector(context, this.f132041E);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{R.attr.a1x, R.attr.a1y, R.attr.a1z, R.attr.a20, R.attr.a21, R.attr.a22, R.attr.a23, R.attr.a24, R.attr.a25, R.attr.a26, R.attr.a27, R.attr.a28});
        this.f132057o = obtainStyledAttributes.getColor(2, -1);
        this.f132044b = obtainStyledAttributes.getDimensionPixelSize(4, (int) TypedValue.applyDimension(1, 35.0f, getResources().getDisplayMetrics()));
        this.f132058p = obtainStyledAttributes.getBoolean(9, false);
        this.f132043a = obtainStyledAttributes.getBoolean(7, true);
        this.f132059q = obtainStyledAttributes.getInt(5, 350);
        this.f132045c = (int) (obtainStyledAttributes.getFloat(0, 0.2f) * 255.0f);
        this.f132046d = obtainStyledAttributes.getBoolean(3, true);
        this.f132060r = obtainStyledAttributes.getInteger(6, 75);
        this.f132061s = new ColorDrawable(obtainStyledAttributes.getColor(1, 0));
        this.f132047e = obtainStyledAttributes.getBoolean(10, false);
        this.f132048f = obtainStyledAttributes.getBoolean(8, false);
        this.f132062t = (float) obtainStyledAttributes.getDimensionPixelSize(11, 0);
        obtainStyledAttributes.recycle();
        paint.setColor(this.f132057o);
        paint.setAlpha(this.f132045c);
        m104711d();
        MethodCollector.m26664o(9554);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        MethodCollector.m26663i(9701);
        if (getChildCount() <= 0) {
            this.f132049g = view;
            super.addView(view, i, layoutParams);
            MethodCollector.m26664o(9701);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("MaterialRippleLayout can host only one child");
        MethodCollector.m26664o(9701);
        throw illegalStateException;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f132056n.set(0, 0, i, i2);
        this.f132061s.setBounds(this.f132056n);
    }
}
