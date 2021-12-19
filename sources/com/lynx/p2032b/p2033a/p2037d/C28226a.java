package com.lynx.p2032b.p2033a.p2037d;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.bytedance.covode.number.Covode;
import com.lynx.p2032b.p2033a.p2034a.AbstractC28217f;
import com.lynx.p2032b.p2033a.p2034a.AbstractC28220i;
import com.lynx.p2032b.p2033a.p2035b.C28224c;
import com.lynx.p2032b.p2033a.p2035b.EnumC28223b;
import com.lynx.p2032b.p2033a.p2039f.AbstractC28233a;
import com.lynx.p2032b.p2033a.p2041h.animationInterpolatorC28243b;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.lynx.b.a.d.a */
public final class C28226a extends AbstractC28233a implements AbstractC28217f {

    /* renamed from: a */
    protected int f66160a;

    /* renamed from: b */
    protected int f66161b;

    /* renamed from: c */
    protected boolean f66162c;

    /* renamed from: d */
    protected boolean f66163d;

    /* renamed from: e */
    protected boolean f66164e;

    /* renamed from: f */
    protected boolean f66165f;

    /* renamed from: g */
    protected Path f66166g;

    /* renamed from: h */
    protected Paint f66167h;

    /* renamed from: i */
    protected int f66168i;

    /* renamed from: j */
    protected int f66169j;

    /* renamed from: k */
    protected int f66170k;

    /* renamed from: l */
    protected int f66171l;

    /* renamed from: m */
    protected float f66172m;

    /* renamed from: n */
    protected float f66173n;

    /* renamed from: o */
    protected float f66174o;

    /* renamed from: p */
    protected float f66175p;

    /* renamed from: q */
    protected int f66176q;

    /* renamed from: r */
    protected float f66177r;

    /* renamed from: s */
    protected float f66178s;

    /* renamed from: t */
    protected float f66179t;

    /* renamed from: u */
    protected Animator f66180u;

    /* renamed from: v */
    protected RectF f66181v;

    static {
        Covode.recordClassIndex(34172);
    }

    @Override // com.lynx.p2032b.p2033a.p2034a.AbstractC28218g, com.lynx.p2032b.p2033a.p2039f.AbstractC28233a
    /* renamed from: a */
    public final boolean mo30707a() {
        return this.f66165f;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Animator animator = this.f66180u;
        if (animator != null) {
            animator.removeAllListeners();
            this.f66180u.end();
            this.f66180u = null;
        }
    }

    /* renamed from: com.lynx.b.a.d.a$1 */
    static /* synthetic */ class C282271 {

        /* renamed from: a */
        static final /* synthetic */ int[] f66182a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        static {
            /*
                r0 = 34173(0x857d, float:4.7887E-41)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.lynx.b.a.b.b[] r0 = com.lynx.p2032b.p2033a.p2035b.EnumC28223b.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.lynx.p2032b.p2033a.p2037d.C28226a.C282271.f66182a = r2
                com.lynx.b.a.b.b r0 = com.lynx.p2032b.p2033a.p2035b.EnumC28223b.None     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.lynx.p2032b.p2033a.p2037d.C28226a.C282271.f66182a     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.lynx.b.a.b.b r0 = com.lynx.p2032b.p2033a.p2035b.EnumC28223b.PullDownToRefresh     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.lynx.p2032b.p2033a.p2037d.C28226a.C282271.<clinit>():void");
        }
    }

    public C28226a(Context context) {
        this(context, (byte) 0);
    }

    /* renamed from: a */
    private C28226a m56374a(int i) {
        this.f66161b = i;
        this.f66162c = true;
        return this;
    }

    /* renamed from: b */
    private C28226a m56375b(int i) {
        this.f66160a = i;
        this.f66163d = true;
        return this;
    }

    @Override // com.lynx.p2032b.p2033a.p2034a.AbstractC28218g, com.lynx.p2032b.p2033a.p2039f.AbstractC28233a
    public final void setPrimaryColors(int... iArr) {
        if (iArr.length > 0 && !this.f66162c) {
            m56374a(iArr[0]);
            this.f66162c = false;
        }
        if (iArr.length > 1 && !this.f66163d) {
            m56375b(iArr[1]);
            this.f66163d = false;
        }
    }

    /* renamed from: com.lynx.b.a.d.a$a */
    protected class C28228a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        byte f66183a;

        static {
            Covode.recordClassIndex(34174);
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            byte b = this.f66183a;
            if (b == 0) {
                C28226a.this.f66179t = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            } else if (1 == b) {
                if (C28226a.this.f66164e) {
                    valueAnimator.cancel();
                    return;
                } else {
                    C28226a.this.f66169j = ((Integer) valueAnimator.getAnimatedValue()).intValue() / 2;
                }
            } else if (2 == b) {
                C28226a.this.f66172m = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            } else if (3 == b) {
                C28226a.this.f66175p = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            } else if (4 == b) {
                C28226a.this.f66176q = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            }
            C28226a.this.invalidate();
        }

        C28228a(byte b) {
            this.f66183a = b;
        }
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        int i;
        float f;
        float f2;
        float f3;
        int width = getWidth();
        if (isInEditMode()) {
            i = getHeight();
        } else {
            i = this.f66171l;
        }
        this.f66166g.reset();
        this.f66166g.lineTo(0.0f, (float) this.f66168i);
        Path path = this.f66166g;
        int i2 = this.f66170k;
        float f4 = 2.0f;
        if (i2 >= 0) {
            f = (float) i2;
        } else {
            f = ((float) width) / 2.0f;
        }
        int i3 = this.f66168i;
        float f5 = (float) width;
        path.quadTo(f, (float) (this.f66169j + i3), f5, (float) i3);
        this.f66166g.lineTo(f5, 0.0f);
        this.f66167h.setColor(this.f66161b);
        canvas.drawPath(this.f66166g, this.f66167h);
        if (this.f66172m > 0.0f) {
            this.f66167h.setColor(this.f66160a);
            float f6 = (float) i;
            float f7 = f6 / animationInterpolatorC28243b.f66203c;
            float f8 = 7.0f;
            float f9 = (f5 * 1.0f) / 7.0f;
            float f10 = this.f66173n;
            float f11 = f9 * f10;
            if (f10 > 1.0f) {
                f2 = ((f10 - 1.0f) * f9) / f10;
            } else {
                f2 = 0.0f;
            }
            float f12 = f11 - f2;
            if (f10 > 1.0f) {
                f3 = (((f10 - 1.0f) * f6) / 2.0f) / f10;
            } else {
                f3 = 0.0f;
            }
            float f13 = f6 - f3;
            int i4 = 0;
            do {
                float f14 = (((float) i4) + 1.0f) - 4.0f;
                Paint paint = this.f66167h;
                double abs = (double) (this.f66172m * (1.0f - ((Math.abs(f14) / f8) * f4)) * 255.0f);
                double d = (double) f7;
                Double.isNaN(d);
                Double.isNaN(abs);
                paint.setAlpha((int) (abs * (1.0d - (1.0d / Math.pow((d / 800.0d) + 1.0d, 15.0d)))));
                float f15 = this.f66174o * (1.0f - (1.0f / ((f7 / 10.0f) + 1.0f)));
                canvas.drawCircle(((f5 / 2.0f) - (f15 / 2.0f)) + (f12 * f14), f13 / 2.0f, f15, this.f66167h);
                i4++;
                f8 = 7.0f;
                f4 = 2.0f;
            } while (i4 < 7);
            this.f66167h.setAlpha(255);
        }
        if (this.f66180u != null || isInEditMode()) {
            float f16 = this.f66177r;
            float f17 = this.f66179t;
            float f18 = f16 * f17;
            float f19 = this.f66178s * f17;
            this.f66167h.setColor(this.f66160a);
            this.f66167h.setStyle(Paint.Style.FILL);
            float f20 = f5 / 2.0f;
            float f21 = ((float) i) / 2.0f;
            canvas.drawCircle(f20, f21, f18, this.f66167h);
            this.f66167h.setStyle(Paint.Style.STROKE);
            float f22 = f18 + f19;
            canvas.drawCircle(f20, f21, f22, this.f66167h);
            this.f66167h.setColor((this.f66161b & 16777215) | 1426063360);
            this.f66167h.setStyle(Paint.Style.FILL);
            this.f66181v.set(f20 - f18, f21 - f18, f20 + f18, f18 + f21);
            canvas.drawArc(this.f66181v, 270.0f, (float) this.f66176q, true, this.f66167h);
            this.f66167h.setStyle(Paint.Style.STROKE);
            this.f66181v.set(f20 - f22, f21 - f22, f20 + f22, f21 + f22);
            canvas.drawArc(this.f66181v, 270.0f, (float) this.f66176q, false, this.f66167h);
            this.f66167h.setStyle(Paint.Style.FILL);
        }
        if (this.f66175p > 0.0f) {
            this.f66167h.setColor(this.f66160a);
            canvas.drawCircle(f5 / 2.0f, ((float) i) / 2.0f, this.f66175p, this.f66167h);
        }
        super.dispatchDraw(canvas);
    }

    @Override // com.lynx.p2032b.p2033a.p2034a.AbstractC28218g, com.lynx.p2032b.p2033a.p2039f.AbstractC28233a
    /* renamed from: a */
    public final int mo30701a(AbstractC28220i iVar, boolean z) {
        Animator animator = this.f66180u;
        if (animator != null) {
            animator.removeAllListeners();
            this.f66180u.end();
            this.f66180u = null;
        }
        int width = getWidth();
        int i = this.f66171l;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f66177r, (float) Math.sqrt((double) ((width * width) + (i * i))));
        ofFloat.setDuration(400L);
        ofFloat.addUpdateListener(new C28228a((byte) 3));
        ofFloat.start();
        return 400;
    }

    private C28226a(Context context, byte b) {
        super(context);
        this.f66170k = -1;
        this.f66181v = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f66198x = C28224c.f66144c;
        this.f66166g = new Path();
        Paint paint = new Paint();
        this.f66167h = paint;
        paint.setAntiAlias(true);
        this.f66174o = (float) animationInterpolatorC28243b.m56416a(7.0f);
        this.f66177r = (float) animationInterpolatorC28243b.m56416a(20.0f);
        this.f66178s = (float) animationInterpolatorC28243b.m56416a(7.0f);
        this.f66167h.setStrokeWidth((float) animationInterpolatorC28243b.m56416a(3.0f));
        setMinimumHeight(animationInterpolatorC28243b.m56416a(100.0f));
        if (isInEditMode()) {
            this.f66168i = 1000;
            this.f66179t = 1.0f;
            this.f66176q = 270;
        } else {
            this.f66179t = 0.0f;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{R.attr.ad4, R.attr.adm, R.attr.aeg});
        this.f66165f = obtainStyledAttributes.getBoolean(1, this.f66165f);
        m56375b(obtainStyledAttributes.getColor(0, -1));
        m56374a(obtainStyledAttributes.getColor(2, -14540254));
        this.f66163d = obtainStyledAttributes.hasValue(0);
        this.f66162c = obtainStyledAttributes.hasValue(2);
        obtainStyledAttributes.recycle();
    }

    @Override // com.lynx.p2032b.p2033a.p2034a.AbstractC28218g, com.lynx.p2032b.p2033a.p2039f.AbstractC28233a
    /* renamed from: a */
    public final void mo30702a(float f, int i, int i2) {
        this.f66170k = i;
        invalidate();
    }

    @Override // com.lynx.p2032b.p2033a.p2039f.AbstractC28233a, com.lynx.p2032b.p2033a.p2040g.AbstractC28239f
    /* renamed from: a */
    public final void mo30705a(AbstractC28220i iVar, EnumC28223b bVar, EnumC28223b bVar2) {
        int i = C282271.f66182a[bVar2.ordinal()];
        if (i == 1 || i == 2) {
            this.f66172m = 1.0f;
            this.f66179t = 0.0f;
            this.f66175p = 0.0f;
        }
    }

    @Override // com.lynx.p2032b.p2033a.p2034a.AbstractC28218g, com.lynx.p2032b.p2033a.p2039f.AbstractC28233a
    /* renamed from: a */
    public final void mo30704a(AbstractC28220i iVar, int i, int i2) {
        this.f66168i = i - 1;
        this.f66164e = false;
        animationInterpolatorC28243b bVar = new animationInterpolatorC28243b(animationInterpolatorC28243b.f66202b);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setInterpolator(bVar);
        ofFloat.addUpdateListener(new C28228a((byte) 2));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setInterpolator(bVar);
        ofFloat2.addUpdateListener(new C28228a((byte) 0));
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 360);
        ofInt.setDuration(720L);
        ofInt.setRepeatCount(-1);
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.addUpdateListener(new C28228a((byte) 4));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(ofFloat, ofFloat2, ofInt);
        animatorSet.start();
        int i3 = this.f66169j;
        ValueAnimator ofInt2 = ValueAnimator.ofInt(i3, 0, -((int) (((float) i3) * 0.8f)), 0, -((int) (((float) i3) * 0.4f)), 0);
        ofInt2.addUpdateListener(new C28228a((byte) 1));
        ofInt2.setInterpolator(new animationInterpolatorC28243b(animationInterpolatorC28243b.f66202b));
        ofInt2.setDuration(800L);
        ofInt2.start();
        this.f66180u = animatorSet;
    }

    @Override // com.lynx.p2032b.p2033a.p2034a.AbstractC28218g, com.lynx.p2032b.p2033a.p2039f.AbstractC28233a
    /* renamed from: a */
    public final void mo30706a(boolean z, float f, int i, int i2, int i3) {
        this.f66171l = i;
        if (z || this.f66164e) {
            this.f66164e = true;
            this.f66168i = Math.min(i2, i);
            this.f66169j = (int) (((float) Math.max(0, i - i2)) * 1.9f);
            this.f66173n = f;
            invalidate();
        }
    }
}
