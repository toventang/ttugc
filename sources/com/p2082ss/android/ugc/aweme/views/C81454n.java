package com.p2082ss.android.ugc.aweme.views;

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
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import androidx.p048g.p049a.p050a.C0995b;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.ugc.aweme.views.n */
public final class C81454n extends Drawable implements Animatable {

    /* renamed from: a */
    static final Interpolator f182064a = new C0995b();

    /* renamed from: f */
    private static final Interpolator f182065f = new LinearInterpolator();

    /* renamed from: g */
    private static final int[] f182066g = {-16777216};

    /* renamed from: b */
    final C81458a f182067b;

    /* renamed from: c */
    public float f182068c;

    /* renamed from: d */
    float f182069d;

    /* renamed from: e */
    boolean f182070e;

    /* renamed from: h */
    private final ArrayList<Animation> f182071h = new ArrayList<>();

    /* renamed from: i */
    private Resources f182072i;

    /* renamed from: j */
    private View f182073j;

    /* renamed from: k */
    private Animation f182074k;

    /* renamed from: l */
    private double f182075l;

    /* renamed from: m */
    private double f182076m;

    /* renamed from: n */
    private final Drawable.Callback f182077n;

    public final int getOpacity() {
        return -3;
    }

    public final int getIntrinsicHeight() {
        return (int) this.f182076m;
    }

    public final int getIntrinsicWidth() {
        return (int) this.f182075l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.views.n$a */
    public static class C81458a {

        /* renamed from: a */
        final RectF f182083a = new RectF();

        /* renamed from: b */
        final Paint f182084b;

        /* renamed from: c */
        final Paint f182085c;

        /* renamed from: d */
        public float f182086d;

        /* renamed from: e */
        public float f182087e;

        /* renamed from: f */
        public float f182088f;

        /* renamed from: g */
        public float f182089g;

        /* renamed from: h */
        public float f182090h;

        /* renamed from: i */
        int[] f182091i;

        /* renamed from: j */
        int f182092j;

        /* renamed from: k */
        public float f182093k;

        /* renamed from: l */
        public float f182094l;

        /* renamed from: m */
        public float f182095m;

        /* renamed from: n */
        boolean f182096n;

        /* renamed from: o */
        Path f182097o;

        /* renamed from: p */
        float f182098p;

        /* renamed from: q */
        public double f182099q;

        /* renamed from: r */
        int f182100r;

        /* renamed from: s */
        int f182101s;

        /* renamed from: t */
        public int f182102t;

        /* renamed from: u */
        final Paint f182103u;

        /* renamed from: v */
        public int f182104v;

        /* renamed from: w */
        public int f182105w;

        /* renamed from: x */
        private final Drawable.Callback f182106x;

        static {
            Covode.recordClassIndex(94830);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final void mo125177d() {
            this.f182106x.invalidateDrawable(null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final int mo125168a() {
            return (this.f182092j + 1) % this.f182091i.length;
        }

        /* renamed from: b */
        public final void mo125173b() {
            this.f182093k = this.f182086d;
            this.f182094l = this.f182087e;
            this.f182095m = this.f182088f;
        }

        /* renamed from: c */
        public final void mo125175c() {
            this.f182093k = 0.0f;
            this.f182094l = 0.0f;
            this.f182095m = 0.0f;
            mo125169a(0.0f);
            mo125174b(0.0f);
            mo125176c(0.0f);
        }

        /* renamed from: a */
        public final void mo125169a(float f) {
            this.f182086d = f;
            mo125177d();
        }

        /* renamed from: b */
        public final void mo125174b(float f) {
            this.f182087e = f;
            mo125177d();
        }

        /* renamed from: c */
        public final void mo125176c(float f) {
            this.f182088f = f;
            mo125177d();
        }

        /* renamed from: d */
        public final void mo125178d(float f) {
            if (f != this.f182098p) {
                this.f182098p = f;
                mo125177d();
            }
        }

        /* renamed from: a */
        public final void mo125170a(int i) {
            this.f182092j = i;
            this.f182105w = this.f182091i[i];
        }

        /* renamed from: a */
        public final void mo125171a(boolean z) {
            if (this.f182096n != z) {
                this.f182096n = z;
                mo125177d();
            }
        }

        C81458a(Drawable.Callback callback) {
            Paint paint = new Paint();
            this.f182084b = paint;
            Paint paint2 = new Paint();
            this.f182085c = paint2;
            this.f182086d = 0.0f;
            this.f182087e = 0.0f;
            this.f182088f = 0.0f;
            this.f182089g = 5.0f;
            this.f182090h = 2.5f;
            this.f182103u = new Paint(1);
            this.f182106x = callback;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
        }

        /* renamed from: a */
        public final void mo125172a(int[] iArr) {
            this.f182091i = iArr;
            mo125170a(0);
        }
    }

    public final int getAlpha() {
        return this.f182067b.f182102t;
    }

    static {
        Covode.recordClassIndex(94826);
    }

    public final void stop() {
        this.f182073j.clearAnimation();
        mo125150d(0.0f);
        this.f182067b.mo125171a(false);
        this.f182067b.mo125170a(0);
        this.f182067b.mo125175c();
    }

    public final boolean isRunning() {
        ArrayList<Animation> arrayList = this.f182071h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animation animation = arrayList.get(i);
            if (animation.hasStarted() && !animation.hasEnded()) {
                return true;
            }
        }
        return false;
    }

    public final void start() {
        this.f182074k.reset();
        this.f182067b.mo125173b();
        if (this.f182067b.f182087e != this.f182067b.f182086d) {
            this.f182070e = true;
            this.f182074k.setDuration(666);
            this.f182073j.startAnimation(this.f182074k);
            return;
        }
        this.f182067b.mo125170a(0);
        this.f182067b.mo125175c();
        this.f182074k.setDuration(1332);
        this.f182073j.startAnimation(this.f182074k);
    }

    /* renamed from: a */
    public final void mo125144a(float f) {
        this.f182067b.mo125178d(f);
    }

    /* renamed from: b */
    public final void mo125148b(int i) {
        this.f182067b.f182104v = i;
    }

    /* renamed from: c */
    public final void mo125149c(float f) {
        this.f182067b.mo125176c(f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo125150d(float f) {
        this.f182068c = f;
        invalidateSelf();
    }

    public final void setAlpha(int i) {
        this.f182067b.f182102t = i;
    }

    /* renamed from: a */
    public final void mo125146a(boolean z) {
        this.f182067b.mo125171a(z);
    }

    /* renamed from: b */
    public final void mo125147b(float f) {
        this.f182067b.mo125169a(0.0f);
        this.f182067b.mo125174b(f);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        C81458a aVar = this.f182067b;
        aVar.f182084b.setColorFilter(colorFilter);
        aVar.mo125177d();
    }

    /* renamed from: a */
    static float m141227a(C81458a aVar) {
        double d = (double) aVar.f182089g;
        Double.isNaN(d);
        return (float) Math.toRadians(d / (aVar.f182099q * 6.283185307179586d));
    }

    /* renamed from: a */
    public final void mo125145a(int i) {
        if (i == 0) {
            m141228a(56.0d, 56.0d, 12.5d, 3.0d, 12.0f, 6.0f);
        } else {
            m141228a(40.0d, 40.0d, 8.75d, 2.5d, 10.0f, 5.0f);
        }
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int save = canvas.save();
        canvas.rotate(this.f182068c, bounds.exactCenterX(), bounds.exactCenterY());
        C81458a aVar = this.f182067b;
        RectF rectF = aVar.f182083a;
        rectF.set(bounds);
        rectF.inset(aVar.f182090h, aVar.f182090h);
        float f = (aVar.f182086d + aVar.f182088f) * 360.0f;
        float f2 = ((aVar.f182087e + aVar.f182088f) * 360.0f) - f;
        aVar.f182084b.setColor(aVar.f182105w);
        canvas.drawArc(rectF, f, f2, false, aVar.f182084b);
        if (aVar.f182096n) {
            if (aVar.f182097o == null) {
                aVar.f182097o = new Path();
                aVar.f182097o.setFillType(Path.FillType.EVEN_ODD);
            } else {
                aVar.f182097o.reset();
            }
            float f3 = ((float) (((int) aVar.f182090h) / 2)) * aVar.f182098p;
            double cos = aVar.f182099q * Math.cos(0.0d);
            double exactCenterX = (double) bounds.exactCenterX();
            Double.isNaN(exactCenterX);
            float f4 = (float) (cos + exactCenterX);
            double sin = aVar.f182099q * Math.sin(0.0d);
            double exactCenterY = (double) bounds.exactCenterY();
            Double.isNaN(exactCenterY);
            aVar.f182097o.moveTo(0.0f, 0.0f);
            aVar.f182097o.lineTo(((float) aVar.f182100r) * aVar.f182098p, 0.0f);
            aVar.f182097o.lineTo((((float) aVar.f182100r) * aVar.f182098p) / 2.0f, ((float) aVar.f182101s) * aVar.f182098p);
            aVar.f182097o.offset(f4 - f3, (float) (sin + exactCenterY));
            aVar.f182097o.close();
            aVar.f182085c.setColor(aVar.f182105w);
            canvas.rotate((f + f2) - 5.0f, bounds.exactCenterX(), bounds.exactCenterY());
            canvas.drawPath(aVar.f182097o, aVar.f182085c);
        }
        if (aVar.f182102t < 255) {
            aVar.f182103u.setColor(aVar.f182104v);
            aVar.f182103u.setAlpha(255 - aVar.f182102t);
            canvas.drawCircle(bounds.exactCenterX(), bounds.exactCenterY(), (float) (bounds.width() / 2), aVar.f182103u);
        }
        canvas.restoreToCount(save);
    }

    C81454n(Context context, View view) {
        C814573 r1 = new Drawable.Callback() {
            /* class com.p2082ss.android.ugc.aweme.views.C81454n.C814573 */

            static {
                Covode.recordClassIndex(94829);
            }

            public final void invalidateDrawable(Drawable drawable) {
                C81454n.this.invalidateSelf();
            }

            public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                C81454n.this.unscheduleSelf(runnable);
            }

            public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                C81454n.this.scheduleSelf(runnable, j);
            }
        };
        this.f182077n = r1;
        this.f182073j = view;
        this.f182072i = context.getResources();
        final C81458a aVar = new C81458a(r1);
        this.f182067b = aVar;
        aVar.mo125172a(f182066g);
        mo125145a(1);
        C814551 r12 = new Animation() {
            /* class com.p2082ss.android.ugc.aweme.views.C81454n.C814551 */

            static {
                Covode.recordClassIndex(94827);
            }

            public final void applyTransformation(float f, Transformation transformation) {
                if (C81454n.this.f182070e) {
                    C81458a aVar = aVar;
                    C81454n.m141229a(f, aVar);
                    aVar.mo125169a(aVar.f182093k + (((aVar.f182094l - C81454n.m141227a(aVar)) - aVar.f182093k) * f));
                    aVar.mo125174b(aVar.f182094l);
                    aVar.mo125176c(aVar.f182095m + ((((float) (Math.floor((double) (aVar.f182095m / 0.8f)) + 1.0d)) - aVar.f182095m) * f));
                    return;
                }
                float a = C81454n.m141227a(aVar);
                float f2 = aVar.f182094l;
                float f3 = aVar.f182093k;
                float f4 = aVar.f182095m;
                C81454n.m141229a(f, aVar);
                if (f <= 0.5f) {
                    Interpolator interpolator = C81454n.f182064a;
                    aVar.mo125169a(f3 + ((0.8f - a) * interpolator.getInterpolation(f / 0.5f)));
                }
                if (f > 0.5f) {
                    Interpolator interpolator2 = C81454n.f182064a;
                    aVar.mo125174b(f2 + ((0.8f - a) * interpolator2.getInterpolation((f - 0.5f) / 0.5f)));
                }
                aVar.mo125176c(f4 + (0.25f * f));
                C81454n.this.mo125150d((f * 216.0f) + ((C81454n.this.f182069d / 5.0f) * 1080.0f));
            }
        };
        r12.setRepeatCount(-1);
        r12.setRepeatMode(1);
        r12.setInterpolator(f182065f);
        r12.setAnimationListener(new Animation.AnimationListener() {
            /* class com.p2082ss.android.ugc.aweme.views.C81454n.animationAnimation$AnimationListenerC814562 */

            static {
                Covode.recordClassIndex(94828);
            }

            public final void onAnimationEnd(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
                C81454n.this.f182069d = 0.0f;
            }

            public final void onAnimationRepeat(Animation animation) {
                aVar.mo125173b();
                C81458a aVar = aVar;
                aVar.mo125170a(aVar.mo125168a());
                C81458a aVar2 = aVar;
                aVar2.mo125169a(aVar2.f182087e);
                if (C81454n.this.f182070e) {
                    C81454n.this.f182070e = false;
                    animation.setDuration(1332);
                    aVar.mo125171a(false);
                    return;
                }
                C81454n nVar = C81454n.this;
                nVar.f182069d = (nVar.f182069d + 1.0f) % 5.0f;
            }
        });
        this.f182074k = r12;
    }

    /* renamed from: a */
    static void m141229a(float f, C81458a aVar) {
        if (f > 0.75f) {
            float f2 = (f - 0.75f) / 0.25f;
            int i = aVar.f182091i[aVar.f182092j];
            int i2 = aVar.f182091i[aVar.mo125168a()];
            int i3 = (i >> 24) & 255;
            int i4 = (i >> 16) & 255;
            int i5 = (i >> 8) & 255;
            int i6 = i & 255;
            aVar.f182105w = ((i3 + ((int) (((float) (((i2 >> 24) & 255) - i3)) * f2))) << 24) | ((i4 + ((int) (((float) (((i2 >> 16) & 255) - i4)) * f2))) << 16) | ((i5 + ((int) (((float) (((i2 >> 8) & 255) - i5)) * f2))) << 8) | (i6 + ((int) (f2 * ((float) ((i2 & 255) - i6)))));
        }
    }

    /* renamed from: a */
    private void m141228a(double d, double d2, double d3, double d4, float f, float f2) {
        double d5;
        C81458a aVar = this.f182067b;
        float f3 = this.f182072i.getDisplayMetrics().density;
        double d6 = (double) f3;
        Double.isNaN(d6);
        this.f182075l = d * d6;
        Double.isNaN(d6);
        this.f182076m = d2 * d6;
        float f4 = ((float) d4) * f3;
        aVar.f182089g = f4;
        aVar.f182084b.setStrokeWidth(f4);
        aVar.mo125177d();
        Double.isNaN(d6);
        aVar.f182099q = d3 * d6;
        aVar.mo125170a(0);
        aVar.f182100r = (int) (f * f3);
        aVar.f182101s = (int) (f2 * f3);
        float min = (float) Math.min((int) this.f182075l, (int) this.f182076m);
        if (aVar.f182099q <= 0.0d || min < 0.0f) {
            d5 = Math.ceil((double) (aVar.f182089g / 2.0f));
        } else {
            double d7 = (double) (min / 2.0f);
            double d8 = aVar.f182099q;
            Double.isNaN(d7);
            d5 = d7 - d8;
        }
        aVar.f182090h = (float) d5;
    }
}
