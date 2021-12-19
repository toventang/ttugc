package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.p036g.C0697g;
import androidx.p048g.p049a.p050a.C0995b;
import com.bytedance.covode.number.Covode;

/* renamed from: androidx.swiperefreshlayout.widget.b */
public class C1562b extends Drawable implements Animatable {

    /* renamed from: e */
    private static final Interpolator f5107e = new LinearInterpolator();

    /* renamed from: f */
    private static final Interpolator f5108f = new C0995b();

    /* renamed from: g */
    private static final int[] f5109g = {-16777216};

    /* renamed from: a */
    final C1565a f5110a;

    /* renamed from: b */
    public float f5111b;

    /* renamed from: c */
    float f5112c;

    /* renamed from: d */
    boolean f5113d;

    /* renamed from: h */
    private Resources f5114h;

    /* renamed from: i */
    private Animator f5115i;

    public int getOpacity() {
        return -3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.swiperefreshlayout.widget.b$a */
    public static class C1565a {

        /* renamed from: a */
        final RectF f5120a = new RectF();

        /* renamed from: b */
        final Paint f5121b;

        /* renamed from: c */
        final Paint f5122c;

        /* renamed from: d */
        final Paint f5123d;

        /* renamed from: e */
        public float f5124e;

        /* renamed from: f */
        public float f5125f;

        /* renamed from: g */
        public float f5126g;

        /* renamed from: h */
        public float f5127h;

        /* renamed from: i */
        public int[] f5128i;

        /* renamed from: j */
        int f5129j;

        /* renamed from: k */
        public float f5130k;

        /* renamed from: l */
        public float f5131l;

        /* renamed from: m */
        public float f5132m;

        /* renamed from: n */
        public boolean f5133n;

        /* renamed from: o */
        Path f5134o;

        /* renamed from: p */
        public float f5135p;

        /* renamed from: q */
        public float f5136q;

        /* renamed from: r */
        int f5137r;

        /* renamed from: s */
        int f5138s;

        /* renamed from: t */
        public int f5139t;

        /* renamed from: u */
        public int f5140u;

        static {
            Covode.recordClassIndex(1707);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public final int mo5197b() {
            return this.f5128i[this.f5129j];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final int mo5192a() {
            return (this.f5129j + 1) % this.f5128i.length;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final void mo5198c() {
            this.f5130k = this.f5124e;
            this.f5131l = this.f5125f;
            this.f5132m = this.f5126g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final void mo5199d() {
            this.f5130k = 0.0f;
            this.f5131l = 0.0f;
            this.f5132m = 0.0f;
            this.f5124e = 0.0f;
            this.f5125f = 0.0f;
            this.f5126g = 0.0f;
        }

        C1565a() {
            Paint paint = new Paint();
            this.f5121b = paint;
            Paint paint2 = new Paint();
            this.f5122c = paint2;
            Paint paint3 = new Paint();
            this.f5123d = paint3;
            this.f5124e = 0.0f;
            this.f5125f = 0.0f;
            this.f5126g = 0.0f;
            this.f5127h = 5.0f;
            this.f5135p = 1.0f;
            this.f5139t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo5193a(float f) {
            this.f5127h = f;
            this.f5121b.setStrokeWidth(f);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo5194a(int i) {
            this.f5129j = i;
            this.f5140u = this.f5128i[i];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo5195a(boolean z) {
            if (this.f5133n != z) {
                this.f5133n = z;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final void mo5196a(int[] iArr) {
            this.f5128i = iArr;
            mo5194a(0);
        }
    }

    public int getAlpha() {
        return this.f5110a.f5139t;
    }

    public boolean isRunning() {
        return this.f5115i.isRunning();
    }

    static {
        Covode.recordClassIndex(1704);
    }

    public void stop() {
        this.f5115i.cancel();
        this.f5111b = 0.0f;
        this.f5110a.mo5195a(false);
        this.f5110a.mo5194a(0);
        this.f5110a.mo5199d();
        invalidateSelf();
    }

    public void start() {
        this.f5115i.cancel();
        this.f5110a.mo5198c();
        if (this.f5110a.f5125f != this.f5110a.f5124e) {
            this.f5113d = true;
            this.f5115i.setDuration(666);
            this.f5115i.start();
            return;
        }
        this.f5110a.mo5194a(0);
        this.f5110a.mo5199d();
        this.f5115i.setDuration(1332);
        this.f5115i.start();
    }

    public void setAlpha(int i) {
        this.f5110a.f5139t = i;
        invalidateSelf();
    }

    /* renamed from: a */
    public final void mo5174a(float f) {
        C1565a aVar = this.f5110a;
        if (f != aVar.f5135p) {
            aVar.f5135p = f;
        }
        invalidateSelf();
    }

    /* renamed from: b */
    public final void mo5178b(float f) {
        this.f5110a.f5124e = 0.0f;
        this.f5110a.f5125f = f;
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f5110a.f5121b.setColorFilter(colorFilter);
        invalidateSelf();
    }

    /* renamed from: a */
    public final void mo5176a(int i) {
        if (i == 0) {
            m5223a(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            m5223a(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    public C1562b(Context context) {
        this.f5114h = ((Context) C0697g.m2452a(context)).getResources();
        final C1565a aVar = new C1565a();
        this.f5110a = aVar;
        aVar.mo5196a(f5109g);
        aVar.mo5193a(2.5f);
        invalidateSelf();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            /* class androidx.swiperefreshlayout.widget.C1562b.C15631 */

            static {
                Covode.recordClassIndex(1705);
            }

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                C1562b.m5224a(floatValue, aVar);
                C1562b.this.mo5175a(floatValue, aVar, false);
                C1562b.this.invalidateSelf();
            }
        });
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f5107e);
        ofFloat.addListener(new Animator.AnimatorListener() {
            /* class androidx.swiperefreshlayout.widget.C1562b.C15642 */

            static {
                Covode.recordClassIndex(1706);
            }

            public final void onAnimationCancel(Animator animator) {
            }

            public final void onAnimationEnd(Animator animator) {
            }

            public final void onAnimationStart(Animator animator) {
                C1562b.this.f5112c = 0.0f;
            }

            public final void onAnimationRepeat(Animator animator) {
                C1562b.this.mo5175a(1.0f, aVar, true);
                aVar.mo5198c();
                C1565a aVar = aVar;
                aVar.mo5194a(aVar.mo5192a());
                if (C1562b.this.f5113d) {
                    C1562b.this.f5113d = false;
                    animator.cancel();
                    animator.setDuration(1332);
                    animator.start();
                    aVar.mo5195a(false);
                    return;
                }
                C1562b.this.f5112c += 1.0f;
            }
        });
        this.f5115i = ofFloat;
    }

    /* renamed from: a */
    public final void mo5177a(boolean z) {
        this.f5110a.mo5195a(z);
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f5111b, bounds.exactCenterX(), bounds.exactCenterY());
        C1565a aVar = this.f5110a;
        RectF rectF = aVar.f5120a;
        float f = aVar.f5136q + (aVar.f5127h / 2.0f);
        if (aVar.f5136q <= 0.0f) {
            f = (((float) Math.min(bounds.width(), bounds.height())) / 2.0f) - Math.max((((float) aVar.f5137r) * aVar.f5135p) / 2.0f, aVar.f5127h / 2.0f);
        }
        rectF.set(((float) bounds.centerX()) - f, ((float) bounds.centerY()) - f, ((float) bounds.centerX()) + f, ((float) bounds.centerY()) + f);
        float f2 = (aVar.f5124e + aVar.f5126g) * 360.0f;
        float f3 = ((aVar.f5125f + aVar.f5126g) * 360.0f) - f2;
        aVar.f5121b.setColor(aVar.f5140u);
        aVar.f5121b.setAlpha(aVar.f5139t);
        float f4 = aVar.f5127h / 2.0f;
        rectF.inset(f4, f4);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, aVar.f5123d);
        float f5 = -f4;
        rectF.inset(f5, f5);
        canvas.drawArc(rectF, f2, f3, false, aVar.f5121b);
        if (aVar.f5133n) {
            if (aVar.f5134o == null) {
                aVar.f5134o = new Path();
                aVar.f5134o.setFillType(Path.FillType.EVEN_ODD);
            } else {
                aVar.f5134o.reset();
            }
            aVar.f5134o.moveTo(0.0f, 0.0f);
            aVar.f5134o.lineTo(((float) aVar.f5137r) * aVar.f5135p, 0.0f);
            aVar.f5134o.lineTo((((float) aVar.f5137r) * aVar.f5135p) / 2.0f, ((float) aVar.f5138s) * aVar.f5135p);
            aVar.f5134o.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((((float) aVar.f5137r) * aVar.f5135p) / 2.0f), rectF.centerY() + (aVar.f5127h / 2.0f));
            aVar.f5134o.close();
            aVar.f5122c.setColor(aVar.f5140u);
            aVar.f5122c.setAlpha(aVar.f5139t);
            canvas.save();
            canvas.rotate(f2 + f3, rectF.centerX(), rectF.centerY());
            canvas.drawPath(aVar.f5134o, aVar.f5122c);
            canvas.restore();
        }
        canvas.restore();
    }

    /* renamed from: a */
    static void m5224a(float f, C1565a aVar) {
        if (f > 0.75f) {
            float f2 = (f - 0.75f) / 0.25f;
            int b = aVar.mo5197b();
            int i = aVar.f5128i[aVar.mo5192a()];
            int i2 = (b >> 24) & 255;
            int i3 = (b >> 16) & 255;
            int i4 = (b >> 8) & 255;
            int i5 = b & 255;
            aVar.f5140u = ((i2 + ((int) (((float) (((i >> 24) & 255) - i2)) * f2))) << 24) | ((i3 + ((int) (((float) (((i >> 16) & 255) - i3)) * f2))) << 16) | ((i4 + ((int) (((float) (((i >> 8) & 255) - i4)) * f2))) << 8) | (i5 + ((int) (f2 * ((float) ((i & 255) - i5)))));
            return;
        }
        aVar.f5140u = aVar.mo5197b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo5175a(float f, C1565a aVar, boolean z) {
        float f2;
        float interpolation;
        if (this.f5113d) {
            m5224a(f, aVar);
            aVar.f5124e = aVar.f5130k + (((aVar.f5131l - 0.01f) - aVar.f5130k) * f);
            aVar.f5125f = aVar.f5131l;
            aVar.f5126g = aVar.f5132m + ((((float) (Math.floor((double) (aVar.f5132m / 0.8f)) + 1.0d)) - aVar.f5132m) * f);
        } else if (f != 1.0f || z) {
            float f3 = aVar.f5132m;
            if (f < 0.5f) {
                interpolation = aVar.f5130k;
                f2 = (f5108f.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + interpolation;
            } else {
                f2 = aVar.f5130k + 0.79f;
                interpolation = f2 - (((1.0f - f5108f.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
            }
            aVar.f5124e = interpolation;
            aVar.f5125f = f2;
            aVar.f5126g = f3 + (0.20999998f * f);
            this.f5111b = (f + this.f5112c) * 216.0f;
        }
    }

    /* renamed from: a */
    private void m5223a(float f, float f2, float f3, float f4) {
        C1565a aVar = this.f5110a;
        float f5 = this.f5114h.getDisplayMetrics().density;
        aVar.mo5193a(f2 * f5);
        aVar.f5136q = f * f5;
        aVar.mo5194a(0);
        aVar.f5137r = (int) (f3 * f5);
        aVar.f5138s = (int) (f4 * f5);
    }
}
