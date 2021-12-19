package com.bytedance.android.livesdk.widget;

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
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

public class AdjustPercentBar extends View {

    /* renamed from: M */
    static Drawable f27075M;

    /* renamed from: N */
    static Drawable f27076N;

    /* renamed from: A */
    int f27077A;

    /* renamed from: B */
    String f27078B;

    /* renamed from: C */
    float f27079C;

    /* renamed from: D */
    boolean f27080D;

    /* renamed from: E */
    boolean f27081E;

    /* renamed from: F */
    Context f27082F;

    /* renamed from: G */
    boolean f27083G;

    /* renamed from: H */
    Rect f27084H;

    /* renamed from: I */
    public String f27085I;

    /* renamed from: J */
    public int f27086J;

    /* renamed from: K */
    Boolean f27087K;

    /* renamed from: L */
    boolean f27088L;

    /* renamed from: O */
    boolean f27089O;

    /* renamed from: P */
    ValueAnimator f27090P;

    /* renamed from: Q */
    boolean f27091Q;

    /* renamed from: R */
    public int f27092R;

    /* renamed from: S */
    public String f27093S;

    /* renamed from: T */
    public ValueAnimator f27094T;

    /* renamed from: U */
    public float f27095U;

    /* renamed from: V */
    public Handler f27096V;

    /* renamed from: W */
    public Runnable f27097W;

    /* renamed from: a */
    int f27098a;

    /* renamed from: aa */
    private AbstractC11338b f27099aa;

    /* renamed from: ab */
    private int f27100ab;

    /* renamed from: ac */
    private float f27101ac;

    /* renamed from: ad */
    private float f27102ad;

    /* renamed from: ae */
    private float f27103ae;

    /* renamed from: af */
    private float f27104af;

    /* renamed from: ag */
    private int f27105ag;

    /* renamed from: ah */
    private int f27106ah;

    /* renamed from: ai */
    private int f27107ai;

    /* renamed from: aj */
    private int f27108aj;

    /* renamed from: ak */
    private Runnable f27109ak;

    /* renamed from: al */
    private int f27110al;

    /* renamed from: am */
    private boolean f27111am;

    /* renamed from: b */
    int f27112b;

    /* renamed from: c */
    int f27113c;

    /* renamed from: d */
    int f27114d;

    /* renamed from: e */
    int f27115e;

    /* renamed from: f */
    int f27116f;

    /* renamed from: g */
    int f27117g;

    /* renamed from: h */
    int f27118h;

    /* renamed from: i */
    int f27119i;

    /* renamed from: j */
    int f27120j;

    /* renamed from: k */
    int f27121k;

    /* renamed from: l */
    int f27122l;

    /* renamed from: m */
    int f27123m;

    /* renamed from: n */
    int f27124n;

    /* renamed from: o */
    int f27125o;

    /* renamed from: p */
    int f27126p;

    /* renamed from: q */
    float f27127q;

    /* renamed from: r */
    int f27128r;

    /* renamed from: s */
    int f27129s;

    /* renamed from: t */
    Paint f27130t;

    /* renamed from: u */
    Paint f27131u;

    /* renamed from: v */
    Paint f27132v;

    /* renamed from: w */
    Paint f27133w;

    /* renamed from: x */
    Paint f27134x;

    /* renamed from: y */
    Paint f27135y;

    /* renamed from: z */
    int f27136z;

    /* renamed from: com.bytedance.android.livesdk.widget.AdjustPercentBar$b */
    public interface AbstractC11338b {
        static {
            Covode.recordClassIndex(12978);
        }

        /* renamed from: a */
        void mo9931a(int i);

        /* renamed from: b */
        void mo9953b(int i);
    }

    /* renamed from: com.bytedance.android.livesdk.widget.AdjustPercentBar$c */
    public static class C11339c implements AbstractC11338b {
        static {
            Covode.recordClassIndex(12979);
        }

        @Override // com.bytedance.android.livesdk.widget.AdjustPercentBar.AbstractC11338b
        /* renamed from: a */
        public void mo9931a(int i) {
        }

        @Override // com.bytedance.android.livesdk.widget.AdjustPercentBar.AbstractC11338b
        /* renamed from: b */
        public final void mo9953b(int i) {
        }
    }

    static {
        Covode.recordClassIndex(12970);
    }

    public int getPercent() {
        return this.f27136z;
    }

    /* renamed from: b */
    private boolean m20091b() {
        if (this.f27108aj != 0) {
            return true;
        }
        int i = this.f27086J;
        if (i == 0 || i == 100) {
            return false;
        }
        return true;
    }

    public void buildDrawingCache() {
        if (Build.VERSION.SDK_INT >= 23 || ((long) getWidth()) * ((long) getHeight()) * 4 < 838860800) {
            super.buildDrawingCache();
        }
    }

    /* renamed from: c */
    private void m20093c() {
        float f;
        removeCallbacks(this.f27109ak);
        if (!this.f27091Q && !TextUtils.isEmpty(this.f27078B)) {
            ValueAnimator valueAnimator = this.f27090P;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f27090P.cancel();
            }
            Paint paint = this.f27135y;
            if (this.f27089O) {
                f = 0.0f;
            } else {
                f = 3.0f;
            }
            paint.setShadowLayer((float) C3966y.m9653a(f), 0.0f, 0.0f, this.f27122l);
            setTextAlpha(255);
            this.f27091Q = true;
            invalidate();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.widget.AdjustPercentBar$a */
    class RunnableC11335a implements Runnable {
        static {
            Covode.recordClassIndex(12975);
        }

        public final void run() {
            if (AdjustPercentBar.this.f27091Q) {
                if (AdjustPercentBar.this.f27090P != null) {
                    AdjustPercentBar.this.f27090P.removeAllListeners();
                    AdjustPercentBar.this.f27090P.cancel();
                }
                AdjustPercentBar.this.f27135y.setShadowLayer(0.0f, 0.0f, 0.0f, AdjustPercentBar.this.f27122l);
                AdjustPercentBar.this.f27090P = ValueAnimator.ofFloat(1.0f);
                AdjustPercentBar.this.f27090P.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.bytedance.android.livesdk.widget.AdjustPercentBar.RunnableC11335a.C113361 */

                    static {
                        Covode.recordClassIndex(12976);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        AdjustPercentBar.this.setTextAlpha((int) ((1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue()) * 255.0f));
                        AdjustPercentBar.this.invalidate();
                    }
                });
                AdjustPercentBar.this.f27090P.addListener(new AnimatorListenerAdapter() {
                    /* class com.bytedance.android.livesdk.widget.AdjustPercentBar.RunnableC11335a.C113372 */

                    static {
                        Covode.recordClassIndex(12977);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        super.onAnimationEnd(animator);
                    }
                });
                AdjustPercentBar.this.f27090P.setDuration(300L);
                AdjustPercentBar.this.f27090P.start();
                AdjustPercentBar.this.f27091Q = false;
            }
        }

        private RunnableC11335a() {
        }

        /* synthetic */ RunnableC11335a(AdjustPercentBar adjustPercentBar, byte b) {
            this();
        }
    }

    /* renamed from: a */
    private void m20087a() {
        this.f27125o = this.f27098a / 2;
        this.f27126p = C3966y.m9653a(32.0f);
        this.f27127q = (((float) this.f27098a) - (this.f27104af * 2.0f)) / ((float) this.f27106ah);
        this.f27083G = true;
        invalidate();
    }

    public void setIsTwoWayMode(boolean z) {
        this.f27111am = z;
    }

    public void setLevelAdjustBarTitle(String str) {
        this.f27085I = str;
    }

    public void setTextInCenter(boolean z) {
        this.f27088L = z;
    }

    public void setOnLevelChangeListener(final AbstractC11338b bVar) {
        this.f27099aa = new AbstractC11338b() {
            /* class com.bytedance.android.livesdk.widget.AdjustPercentBar.C113344 */

            static {
                Covode.recordClassIndex(12974);
            }

            @Override // com.bytedance.android.livesdk.widget.AdjustPercentBar.AbstractC11338b
            /* renamed from: b */
            public final void mo9953b(int i) {
                bVar.mo9953b(i);
            }

            @Override // com.bytedance.android.livesdk.widget.AdjustPercentBar.AbstractC11338b
            /* renamed from: a */
            public final void mo9931a(int i) {
                AdjustPercentBar.this.f27096V.removeCallbacks(AdjustPercentBar.this.f27097W);
                if (AdjustPercentBar.this.f27093S != null && i == AdjustPercentBar.this.f27086J) {
                    AdjustPercentBar.this.f27096V.postDelayed(AdjustPercentBar.this.f27097W, 100);
                } else if (AdjustPercentBar.this.f27094T != null) {
                    AdjustPercentBar.this.f27094T.cancel();
                    AdjustPercentBar.this.f27094T = null;
                }
                bVar.mo9931a(i);
            }
        };
    }

    public void setPercent(int i) {
        this.f27136z = i;
        invalidate();
    }

    /* renamed from: c */
    private int m20092c(int i) {
        if (C3966y.m9672g()) {
            return this.f27107ai - i;
        }
        return i;
    }

    public void setTextAlpha(int i) {
        this.f27110al = i;
        this.f27135y.setAlpha(i);
        this.f27134x.setAlpha(i);
    }

    /* renamed from: b */
    private int m20089b(int i) {
        int i2;
        int i3 = this.f27105ag;
        if (((float) (i % i3)) >= ((float) i3) / 2.0f) {
            i2 = (i / i3) + 1;
        } else {
            i2 = i / i3;
        }
        return i2 * i3;
    }

    /* renamed from: a */
    private int m20086a(int i) {
        int i2;
        if (this.f27105ag > 1) {
            i = m20089b(i);
        }
        if (i > this.f27106ah) {
            i2 = this.f27107ai;
        } else if (i <= 0) {
            i2 = this.f27108aj;
        } else {
            i2 = i + this.f27108aj;
        }
        if (!m20091b()) {
            return i2;
        }
        int i3 = this.f27086J;
        return (i2 < i3 + -2 || i2 > i3 + 2) ? i2 : i3;
    }

    public void buildDrawingCache(boolean z) {
        if (Build.VERSION.SDK_INT >= 23 || ((long) getWidth()) * ((long) getHeight()) * 4 < 838860800) {
            super.buildDrawingCache(z);
        }
    }

    /* renamed from: a */
    private void m20088a(boolean z) {
        this.f27130t.setColor(this.f27118h);
        if (z) {
            this.f27130t.setShadowLayer((float) C3966y.m9653a(1.0f), 0.0f, 0.0f, this.f27122l);
        }
        this.f27131u.setColor(this.f27119i);
        if (z) {
            this.f27131u.setShadowLayer((float) C3966y.m9653a(1.0f), 0.0f, 0.0f, this.f27122l);
        }
        this.f27132v.setColor(this.f27128r);
        if (z) {
            this.f27132v.setShadowLayer((float) C3966y.m9653a(3.0f), 0.0f, 0.0f, this.f27122l);
        }
        this.f27133w.setColor(this.f27124n);
        this.f27134x.setColor(this.f27129s);
        this.f27135y.setColor(this.f27118h);
        setTextAlpha(this.f27110al);
        this.f27089O = false;
        if (!this.f27089O && f27075M == null) {
            f27075M = getResources().getDrawable(R.drawable.btv);
        }
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        String str;
        Paint paint;
        int i;
        Drawable drawable;
        MethodCollector.m26663i(9986);
        super.onDraw(canvas);
        if (!this.f27083G) {
            MethodCollector.m26664o(9986);
            return;
        }
        if (C3966y.m9672g()) {
            f = this.f27104af;
            f2 = (float) (this.f27107ai - this.f27136z);
            f3 = this.f27127q;
        } else {
            f = this.f27104af;
            f2 = (float) (this.f27136z - this.f27108aj);
            f3 = this.f27127q;
        }
        float f7 = f + (f2 * f3);
        if (C3966y.m9672g()) {
            f4 = this.f27104af;
            f5 = (float) (this.f27107ai - this.f27086J);
            f6 = this.f27127q;
        } else {
            f4 = this.f27104af;
            f5 = (float) (this.f27086J - this.f27108aj);
            f6 = this.f27127q;
        }
        float f8 = f4 + (f5 * f6);
        float f9 = this.f27104af;
        int i2 = this.f27126p;
        canvas.drawLine(f9, (float) i2, ((float) this.f27098a) - f9, (float) i2, this.f27131u);
        if (!this.f27087K.booleanValue()) {
            C3966y.m9672g();
            int i3 = this.f27126p;
            canvas.drawLine(f7, (float) i3, f8, (float) i3, this.f27130t);
        } else if (C3966y.m9672g()) {
            int i4 = this.f27126p;
            canvas.drawLine(f7, (float) i4, ((float) this.f27098a) - this.f27104af, (float) i4, this.f27130t);
        } else {
            float f10 = this.f27104af;
            int i5 = this.f27126p;
            canvas.drawLine(f10, (float) i5, f7, (float) i5, this.f27130t);
        }
        int i6 = 255;
        this.f27132v.setAlpha(255);
        this.f27133w.setAlpha(255);
        this.f27135y.setAlpha(255);
        this.f27134x.setAlpha(255);
        canvas.drawCircle(f7, (float) this.f27126p, this.f27102ad, this.f27132v);
        int i7 = this.f27086J;
        if (i7 >= this.f27108aj && i7 <= this.f27107ai && m20091b()) {
            canvas.drawCircle(f8, (float) this.f27126p, (float) this.f27115e, this.f27133w);
        }
        int i8 = this.f27092R;
        if (i8 == Integer.MIN_VALUE) {
            i8 = this.f27136z;
        }
        if (this.f27095U == 0.0f) {
            str = String.valueOf(i8);
        } else {
            str = this.f27093S;
            if (str == null) {
                str = "";
            }
        }
        if (TextUtils.isEmpty(this.f27085I) || TextUtils.isEmpty(str)) {
            this.f27078B = str;
        } else {
            this.f27078B = this.f27085I + " " + str;
        }
        if (TextUtils.isEmpty(this.f27078B)) {
            MethodCollector.m26664o(9986);
            return;
        }
        if (this.f27088L) {
            paint = this.f27135y;
        } else {
            paint = this.f27134x;
        }
        Paint paint2 = this.f27134x;
        String str2 = this.f27078B;
        paint2.getTextBounds(str2, 0, str2.length(), this.f27084H);
        int width = this.f27084H.width();
        int a = C3966y.m9653a(14.0f);
        if (this.f27088L) {
            i = this.f27125o;
        } else {
            i = (int) f7;
        }
        int a2 = (i - (width / 2)) - C3966y.m9653a(1.0f);
        int i9 = this.f27126p - a;
        if (this.f27089O) {
            drawable = f27076N;
        } else {
            drawable = f27075M;
        }
        if (!this.f27088L && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int max = Math.max(width, intrinsicWidth);
            float f11 = this.f27095U;
            if (f11 == 1.0f) {
                i6 = this.f27110al;
                max += intrinsicWidth;
            } else if (f11 > 0.0f) {
                float f12 = (float) intrinsicWidth;
                max = (int) (((float) ((int) ((((float) (max - intrinsicWidth)) * f11) + f12))) + (f12 * f11));
            } else {
                i6 = this.f27110al;
            }
            drawable.setAlpha(i6);
            drawable.setBounds(0, 0, max, drawable.getIntrinsicHeight());
            canvas.save();
            canvas.translate(((float) i) - (((float) max) / 2.0f), (float) (this.f27126p - C3966y.m9653a(57.0f)));
            drawable.draw(canvas);
            canvas.restore();
        }
        float f13 = this.f27095U;
        if (f13 <= 0.0f || f13 >= 1.0f) {
            canvas.drawText(this.f27078B, (float) a2, (float) i9, paint);
            MethodCollector.m26664o(9986);
            return;
        }
        int alpha = paint.getAlpha();
        paint.setAlpha((int) (this.f27095U * 255.0f));
        canvas.drawText(this.f27078B, (float) a2, (float) i9, paint);
        paint.setAlpha(alpha);
        MethodCollector.m26664o(9986);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        AbstractC11338b bVar;
        if (!this.f27081E) {
            return true;
        }
        boolean z = false;
        if (motionEvent.getAction() == 0 && (motionEvent.getX() < this.f27104af - ((float) this.f27116f) || motionEvent.getX() > ((float) C3966y.m9664c()) - (this.f27104af - ((float) this.f27116f)))) {
            return false;
        }
        if (motionEvent.getAction() == 0 && Math.abs(motionEvent.getY() - ((float) this.f27126p)) > ((float) (this.f27112b - this.f27126p))) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            m20093c();
            this.f27077A = this.f27136z;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            double abs = (double) Math.abs(x - (this.f27104af + (((float) (this.f27136z - this.f27108aj)) * this.f27127q)));
            double d = (double) this.f27114d;
            Double.isNaN(d);
            if (abs <= d * 2.5d) {
                double abs2 = (double) Math.abs(y - ((float) this.f27126p));
                double d2 = (double) this.f27114d;
                Double.isNaN(d2);
                if (abs2 <= d2 * 2.5d) {
                    z = true;
                }
            }
            this.f27080D = !z;
            float x2 = motionEvent.getX();
            this.f27079C = x2;
            int c = m20092c(m20086a((int) ((x2 - this.f27104af) / this.f27127q)));
            if (this.f27136z != c) {
                this.f27136z = c;
                this.f27077A = c;
                AbstractC11338b bVar2 = this.f27099aa;
                if (bVar2 != null) {
                    bVar2.mo9931a(c);
                }
                invalidate();
            }
        } else if (action == 1) {
            float x3 = motionEvent.getX();
            if (!this.f27080D || Math.abs(x3 - this.f27079C) > ((float) C3966y.m9653a(3.0f))) {
                AbstractC11338b bVar3 = this.f27099aa;
                if (bVar3 != null) {
                    bVar3.mo9953b(this.f27136z);
                }
            } else {
                final int c2 = m20092c(m20086a((int) ((x3 - this.f27104af) / this.f27127q)));
                AbstractC11338b bVar4 = this.f27099aa;
                if (bVar4 != null) {
                    this.f27136z = c2;
                    bVar4.mo9931a(c2);
                    this.f27099aa.mo9953b(c2);
                }
                final int i3 = this.f27136z;
                this.f27081E = false;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setTarget(this);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    /* class com.bytedance.android.livesdk.widget.AdjustPercentBar.C113322 */

                    static {
                        Covode.recordClassIndex(12972);
                    }

                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        AdjustPercentBar adjustPercentBar = AdjustPercentBar.this;
                        int i = i3;
                        adjustPercentBar.f27136z = (int) (((float) i) + (((float) (c2 - i)) * floatValue));
                        AdjustPercentBar.this.invalidate();
                    }
                });
                ofFloat.addListener(new AnimatorListenerAdapter() {
                    /* class com.bytedance.android.livesdk.widget.AdjustPercentBar.C113333 */

                    static {
                        Covode.recordClassIndex(12973);
                    }

                    public final void onAnimationEnd(Animator animator) {
                        AdjustPercentBar.this.f27081E = true;
                        super.onAnimationEnd(animator);
                    }
                });
                ofFloat.setDuration(50L);
                ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                ofFloat.start();
            }
        } else if (action == 2) {
            m20093c();
            float x4 = motionEvent.getX();
            if (C3966y.m9672g()) {
                i = this.f27107ai;
                i2 = this.f27077A;
            } else {
                i = this.f27077A;
                i2 = this.f27108aj;
            }
            int c3 = m20092c(m20086a((i - i2) + ((int) ((x4 - this.f27079C) / this.f27127q))));
            AbstractC11338b bVar5 = this.f27099aa;
            if (!(bVar5 == null || this.f27136z == c3)) {
                this.f27136z = c3;
                bVar5.mo9931a(c3);
            }
            invalidate();
        } else if (action == 3 && (bVar = this.f27099aa) != null) {
            bVar.mo9953b(this.f27136z);
        }
        return true;
    }

    public AdjustPercentBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    public final void mo18118a(int i, int i2, int i3) {
        this.f27118h = i;
        this.f27119i = i2;
        this.f27128r = i3;
        m20088a(false);
    }

    private AdjustPercentBar(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(9983);
        this.f27113c = C3966y.m9653a(4.0f);
        this.f27114d = C3966y.m9653a(9.0f);
        this.f27115e = C3966y.m9653a(4.0f);
        this.f27116f = C3966y.m9653a(10.0f);
        this.f27117g = 1;
        this.f27081E = true;
        this.f27083G = false;
        this.f27084H = new Rect();
        this.f27085I = null;
        this.f27100ab = 0;
        this.f27101ac = 0.0f;
        this.f27102ad = 0.0f;
        this.f27103ae = 0.0f;
        this.f27104af = (float) C3966y.m9653a(40.0f);
        this.f27087K = true;
        this.f27088L = false;
        this.f27091Q = true;
        this.f27092R = Integer.MIN_VALUE;
        this.f27109ak = new RunnableC11335a(this, (byte) 0);
        this.f27110al = 0;
        this.f27095U = 0.1f;
        this.f27096V = new Handler(Looper.getMainLooper());
        this.f27097W = new Runnable() {
            /* class com.bytedance.android.livesdk.widget.AdjustPercentBar.RunnableC113311 */

            static {
                Covode.recordClassIndex(12971);
            }

            public final void run() {
            }
        };
        this.f27082F = context;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.an1, R.attr.an5, R.attr.anl, R.attr.anm, R.attr.ao2, R.attr.ao3, R.attr.ao4});
            String string = obtainStyledAttributes.getString(4);
            this.f27085I = string == null ? "" : string;
            this.f27100ab = obtainStyledAttributes.getColor(5, -16777216);
            this.f27101ac = obtainStyledAttributes.getDimension(6, (float) C3966y.m9653a(14.0f));
            this.f27104af = obtainStyledAttributes.getDimension(0, (float) C3966y.m9653a(40.0f));
            this.f27102ad = obtainStyledAttributes.getDimension(2, (float) this.f27114d);
            this.f27103ae = obtainStyledAttributes.getDimension(1, (float) this.f27113c);
            this.f27105ag = obtainStyledAttributes.getInt(3, this.f27117g);
            obtainStyledAttributes.recycle();
            setLayerType(1, null);
            this.f27118h = C3966y.m9663b((int) R.color.a1w);
            this.f27119i = 1040187391;
            this.f27120j = C3966y.m9663b((int) R.color.v7);
            this.f27121k = C3966y.m9663b((int) R.color.y4);
            this.f27122l = 1073741824;
            this.f27123m = C3966y.m9663b((int) R.color.c9);
            this.f27128r = C3966y.m9654a("#ff4e33", C3966y.m9663b((int) R.color.a1w));
            this.f27129s = C3966y.m9663b((int) R.color.a1w);
            this.f27124n = C3966y.m9663b((int) R.color.a1w);
            Paint paint = new Paint();
            this.f27130t = paint;
            paint.setStyle(Paint.Style.FILL);
            this.f27130t.setStrokeWidth(this.f27103ae);
            this.f27130t.setStrokeCap(Paint.Cap.ROUND);
            this.f27130t.setAntiAlias(true);
            Paint paint2 = new Paint();
            this.f27131u = paint2;
            paint2.setStyle(Paint.Style.FILL);
            this.f27131u.setStrokeWidth(this.f27103ae);
            this.f27131u.setStrokeCap(Paint.Cap.ROUND);
            this.f27131u.setAntiAlias(true);
            Paint paint3 = new Paint();
            this.f27132v = paint3;
            paint3.setStyle(Paint.Style.FILL);
            this.f27132v.setAntiAlias(true);
            Paint paint4 = new Paint();
            this.f27133w = paint4;
            paint4.setStyle(Paint.Style.FILL);
            this.f27133w.setAntiAlias(true);
            Paint paint5 = new Paint();
            this.f27134x = paint5;
            paint5.setTextSize(this.f27101ac);
            this.f27134x.setAntiAlias(true);
            Paint paint6 = new Paint();
            this.f27135y = paint6;
            paint6.setTextSize(this.f27101ac);
            this.f27135y.setAntiAlias(true);
            m20088a(true);
        }
        MethodCollector.m26664o(9983);
    }

    /* renamed from: a */
    public final void mo18119a(int i, int i2, int i3, boolean z) {
        m20090b(i, i2, i3, z);
    }

    /* renamed from: b */
    private void m20090b(int i, int i2, int i3, boolean z) {
        this.f27107ai = i;
        this.f27108aj = i2;
        if (i3 > i || i3 < i2) {
            this.f27086J = i;
        } else {
            this.f27086J = i3;
        }
        this.f27106ah = i - i2;
        this.f27087K = Boolean.valueOf(z);
        if (this.f27098a > 0 && this.f27112b > 0) {
            m20087a();
        }
        invalidate();
        this.f27093S = null;
        ValueAnimator valueAnimator = this.f27094T;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f27094T = null;
        }
        this.f27095U = 0.0f;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f27112b != getMeasuredHeight() || this.f27098a != getMeasuredWidth()) {
            this.f27098a = getMeasuredWidth();
            this.f27112b = getMeasuredHeight();
            m20087a();
        }
    }
}
