package com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget;

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
/* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.c */
public final class C34639c extends Drawable implements Animatable {

    /* renamed from: a */
    static final Interpolator f81769a = new C0995b();

    /* renamed from: f */
    private static final Interpolator f81770f = new LinearInterpolator();

    /* renamed from: g */
    private static final int[] f81771g = {-16777216};

    /* renamed from: b */
    final C34643a f81772b;

    /* renamed from: c */
    public float f81773c;

    /* renamed from: d */
    float f81774d;

    /* renamed from: e */
    boolean f81775e;

    /* renamed from: h */
    private final ArrayList<Animation> f81776h = new ArrayList<>();

    /* renamed from: i */
    private Resources f81777i;

    /* renamed from: j */
    private View f81778j;

    /* renamed from: k */
    private Animation f81779k;

    /* renamed from: l */
    private double f81780l;

    /* renamed from: m */
    private double f81781m;

    /* renamed from: n */
    private final Drawable.Callback f81782n;

    public final int getOpacity() {
        return -3;
    }

    public final int getIntrinsicHeight() {
        return (int) this.f81781m;
    }

    public final int getIntrinsicWidth() {
        return (int) this.f81780l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.ss.android.ugc.aweme.base.opensourcemodified.android.support.v4.widget.c$a */
    public static class C34643a {

        /* renamed from: a */
        final RectF f81788a = new RectF();

        /* renamed from: b */
        final Paint f81789b;

        /* renamed from: c */
        final Paint f81790c;

        /* renamed from: d */
        public float f81791d;

        /* renamed from: e */
        public float f81792e;

        /* renamed from: f */
        public float f81793f;

        /* renamed from: g */
        public float f81794g;

        /* renamed from: h */
        public float f81795h;

        /* renamed from: i */
        int[] f81796i;

        /* renamed from: j */
        int f81797j;

        /* renamed from: k */
        public float f81798k;

        /* renamed from: l */
        public float f81799l;

        /* renamed from: m */
        public float f81800m;

        /* renamed from: n */
        boolean f81801n;

        /* renamed from: o */
        Path f81802o;

        /* renamed from: p */
        float f81803p;

        /* renamed from: q */
        public double f81804q;

        /* renamed from: r */
        int f81805r;

        /* renamed from: s */
        int f81806s;

        /* renamed from: t */
        public int f81807t;

        /* renamed from: u */
        final Paint f81808u;

        /* renamed from: v */
        public int f81809v;

        /* renamed from: w */
        public int f81810w;

        /* renamed from: x */
        private final Drawable.Callback f81811x;

        static {
            Covode.recordClassIndex(41610);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final void mo61196d() {
            this.f81811x.invalidateDrawable(null);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final int mo61187a() {
            return (this.f81797j + 1) % this.f81796i.length;
        }

        /* renamed from: b */
        public final void mo61192b() {
            this.f81798k = this.f81791d;
            this.f81799l = this.f81792e;
            this.f81800m = this.f81793f;
        }

        /* renamed from: c */
        public final void mo61194c() {
            this.f81798k = 0.0f;
            this.f81799l = 0.0f;
            this.f81800m = 0.0f;
            mo61188a(0.0f);
            mo61193b(0.0f);
            mo61195c(0.0f);
        }

        /* renamed from: a */
        public final void mo61188a(float f) {
            this.f81791d = f;
            mo61196d();
        }

        /* renamed from: b */
        public final void mo61193b(float f) {
            this.f81792e = f;
            mo61196d();
        }

        /* renamed from: c */
        public final void mo61195c(float f) {
            this.f81793f = f;
            mo61196d();
        }

        /* renamed from: a */
        public final void mo61189a(int i) {
            this.f81797j = i;
            this.f81810w = this.f81796i[i];
        }

        /* renamed from: a */
        public final void mo61190a(boolean z) {
            if (this.f81801n != z) {
                this.f81801n = z;
                mo61196d();
            }
        }

        C34643a(Drawable.Callback callback) {
            Paint paint = new Paint();
            this.f81789b = paint;
            Paint paint2 = new Paint();
            this.f81790c = paint2;
            this.f81791d = 0.0f;
            this.f81792e = 0.0f;
            this.f81793f = 0.0f;
            this.f81794g = 5.0f;
            this.f81795h = 2.5f;
            this.f81808u = new Paint(1);
            this.f81811x = callback;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
        }

        /* renamed from: a */
        public final void mo61191a(int[] iArr) {
            this.f81796i = iArr;
            mo61189a(0);
        }
    }

    public final int getAlpha() {
        return this.f81772b.f81807t;
    }

    static {
        Covode.recordClassIndex(41606);
    }

    public final void stop() {
        this.f81778j.clearAnimation();
        mo61169d(0.0f);
        this.f81772b.mo61190a(false);
        this.f81772b.mo61189a(0);
        this.f81772b.mo61194c();
    }

    public final boolean isRunning() {
        ArrayList<Animation> arrayList = this.f81776h;
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
        this.f81779k.reset();
        this.f81772b.mo61192b();
        if (this.f81772b.f81792e != this.f81772b.f81791d) {
            this.f81775e = true;
            this.f81779k.setDuration(666);
            this.f81778j.startAnimation(this.f81779k);
            return;
        }
        this.f81772b.mo61189a(0);
        this.f81772b.mo61194c();
        this.f81779k.setDuration(1332);
        this.f81778j.startAnimation(this.f81779k);
    }

    /* renamed from: a */
    public final void mo61165a(boolean z) {
        this.f81772b.mo61190a(z);
    }

    /* renamed from: b */
    public final void mo61167b(int i) {
        this.f81772b.f81809v = i;
    }

    /* renamed from: c */
    public final void mo61168c(float f) {
        this.f81772b.mo61195c(f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo61169d(float f) {
        this.f81773c = f;
        invalidateSelf();
    }

    public final void setAlpha(int i) {
        this.f81772b.f81807t = i;
    }

    /* renamed from: a */
    public final void mo61163a(float f) {
        C34643a aVar = this.f81772b;
        if (f != aVar.f81803p) {
            aVar.f81803p = f;
            aVar.mo61196d();
        }
    }

    /* renamed from: b */
    public final void mo61166b(float f) {
        this.f81772b.mo61188a(0.0f);
        this.f81772b.mo61193b(f);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        C34643a aVar = this.f81772b;
        aVar.f81789b.setColorFilter(colorFilter);
        aVar.mo61196d();
    }

    /* renamed from: a */
    static float m70730a(C34643a aVar) {
        double d = (double) aVar.f81794g;
        Double.isNaN(d);
        return (float) Math.toRadians(d / (aVar.f81804q * 6.283185307179586d));
    }

    /* renamed from: a */
    public final void mo61164a(int i) {
        if (i == 0) {
            m70731a(56.0d, 56.0d, 12.5d, 3.0d, 12.0f, 6.0f);
        } else {
            m70731a(40.0d, 40.0d, 8.75d, 2.5d, 10.0f, 5.0f);
        }
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int save = canvas.save();
        canvas.rotate(this.f81773c, bounds.exactCenterX(), bounds.exactCenterY());
        C34643a aVar = this.f81772b;
        RectF rectF = aVar.f81788a;
        rectF.set(bounds);
        rectF.inset(aVar.f81795h, aVar.f81795h);
        float f = (aVar.f81791d + aVar.f81793f) * 360.0f;
        float f2 = ((aVar.f81792e + aVar.f81793f) * 360.0f) - f;
        aVar.f81789b.setColor(aVar.f81810w);
        canvas.drawArc(rectF, f, f2, false, aVar.f81789b);
        if (aVar.f81801n) {
            if (aVar.f81802o == null) {
                aVar.f81802o = new Path();
                aVar.f81802o.setFillType(Path.FillType.EVEN_ODD);
            } else {
                aVar.f81802o.reset();
            }
            float f3 = ((float) (((int) aVar.f81795h) / 2)) * aVar.f81803p;
            double cos = aVar.f81804q * Math.cos(0.0d);
            double exactCenterX = (double) bounds.exactCenterX();
            Double.isNaN(exactCenterX);
            float f4 = (float) (cos + exactCenterX);
            double sin = aVar.f81804q * Math.sin(0.0d);
            double exactCenterY = (double) bounds.exactCenterY();
            Double.isNaN(exactCenterY);
            aVar.f81802o.moveTo(0.0f, 0.0f);
            aVar.f81802o.lineTo(((float) aVar.f81805r) * aVar.f81803p, 0.0f);
            aVar.f81802o.lineTo((((float) aVar.f81805r) * aVar.f81803p) / 2.0f, ((float) aVar.f81806s) * aVar.f81803p);
            aVar.f81802o.offset(f4 - f3, (float) (sin + exactCenterY));
            aVar.f81802o.close();
            aVar.f81790c.setColor(aVar.f81810w);
            canvas.rotate((f + f2) - 5.0f, bounds.exactCenterX(), bounds.exactCenterY());
            canvas.drawPath(aVar.f81802o, aVar.f81790c);
        }
        if (aVar.f81807t < 255) {
            aVar.f81808u.setColor(aVar.f81809v);
            aVar.f81808u.setAlpha(255 - aVar.f81807t);
            canvas.drawCircle(bounds.exactCenterX(), bounds.exactCenterY(), (float) (bounds.width() / 2), aVar.f81808u);
        }
        canvas.restoreToCount(save);
    }

    C34639c(Context context, View view) {
        C346423 r1 = new Drawable.Callback() {
            /* class com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.C34639c.C346423 */

            static {
                Covode.recordClassIndex(41609);
            }

            public final void invalidateDrawable(Drawable drawable) {
                C34639c.this.invalidateSelf();
            }

            public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                C34639c.this.unscheduleSelf(runnable);
            }

            public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                C34639c.this.scheduleSelf(runnable, j);
            }
        };
        this.f81782n = r1;
        this.f81778j = view;
        this.f81777i = context.getResources();
        final C34643a aVar = new C34643a(r1);
        this.f81772b = aVar;
        aVar.mo61191a(f81771g);
        mo61164a(1);
        C346401 r12 = new Animation() {
            /* class com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.C34639c.C346401 */

            static {
                Covode.recordClassIndex(41607);
            }

            public final void applyTransformation(float f, Transformation transformation) {
                if (C34639c.this.f81775e) {
                    C34643a aVar = aVar;
                    C34639c.m70732a(f, aVar);
                    aVar.mo61188a(aVar.f81798k + (((aVar.f81799l - C34639c.m70730a(aVar)) - aVar.f81798k) * f));
                    aVar.mo61193b(aVar.f81799l);
                    aVar.mo61195c(aVar.f81800m + ((((float) (Math.floor((double) (aVar.f81800m / 0.8f)) + 1.0d)) - aVar.f81800m) * f));
                    return;
                }
                float a = C34639c.m70730a(aVar);
                float f2 = aVar.f81799l;
                float f3 = aVar.f81798k;
                float f4 = aVar.f81800m;
                C34639c.m70732a(f, aVar);
                if (f <= 0.5f) {
                    Interpolator interpolator = C34639c.f81769a;
                    aVar.mo61188a(f3 + ((0.8f - a) * interpolator.getInterpolation(f / 0.5f)));
                }
                if (f > 0.5f) {
                    Interpolator interpolator2 = C34639c.f81769a;
                    aVar.mo61193b(f2 + ((0.8f - a) * interpolator2.getInterpolation((f - 0.5f) / 0.5f)));
                }
                aVar.mo61195c(f4 + (0.25f * f));
                C34639c.this.mo61169d((f * 216.0f) + ((C34639c.this.f81774d / 5.0f) * 1080.0f));
            }
        };
        r12.setRepeatCount(-1);
        r12.setRepeatMode(1);
        r12.setInterpolator(f81770f);
        r12.setAnimationListener(new Animation.AnimationListener() {
            /* class com.p2082ss.android.ugc.aweme.base.opensourcemodified.android.support.p2378v4.widget.C34639c.animationAnimation$AnimationListenerC346412 */

            static {
                Covode.recordClassIndex(41608);
            }

            public final void onAnimationEnd(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
                C34639c.this.f81774d = 0.0f;
            }

            public final void onAnimationRepeat(Animation animation) {
                aVar.mo61192b();
                C34643a aVar = aVar;
                aVar.mo61189a(aVar.mo61187a());
                C34643a aVar2 = aVar;
                aVar2.mo61188a(aVar2.f81792e);
                if (C34639c.this.f81775e) {
                    C34639c.this.f81775e = false;
                    animation.setDuration(1332);
                    aVar.mo61190a(false);
                    return;
                }
                C34639c cVar = C34639c.this;
                cVar.f81774d = (cVar.f81774d + 1.0f) % 5.0f;
            }
        });
        this.f81779k = r12;
    }

    /* renamed from: a */
    static void m70732a(float f, C34643a aVar) {
        if (f > 0.75f) {
            float f2 = (f - 0.75f) / 0.25f;
            int i = aVar.f81796i[aVar.f81797j];
            int i2 = aVar.f81796i[aVar.mo61187a()];
            int i3 = (i >> 24) & 255;
            int i4 = (i >> 16) & 255;
            int i5 = (i >> 8) & 255;
            int i6 = i & 255;
            aVar.f81810w = ((i3 + ((int) (((float) (((i2 >> 24) & 255) - i3)) * f2))) << 24) | ((i4 + ((int) (((float) (((i2 >> 16) & 255) - i4)) * f2))) << 16) | ((i5 + ((int) (((float) (((i2 >> 8) & 255) - i5)) * f2))) << 8) | (i6 + ((int) (f2 * ((float) ((i2 & 255) - i6)))));
        }
    }

    /* renamed from: a */
    private void m70731a(double d, double d2, double d3, double d4, float f, float f2) {
        double d5;
        C34643a aVar = this.f81772b;
        float f3 = this.f81777i.getDisplayMetrics().density;
        double d6 = (double) f3;
        Double.isNaN(d6);
        this.f81780l = d * d6;
        Double.isNaN(d6);
        this.f81781m = d2 * d6;
        float f4 = ((float) d4) * f3;
        aVar.f81794g = f4;
        aVar.f81789b.setStrokeWidth(f4);
        aVar.mo61196d();
        Double.isNaN(d6);
        aVar.f81804q = d3 * d6;
        aVar.mo61189a(0);
        aVar.f81805r = (int) (f * f3);
        aVar.f81806s = (int) (f2 * f3);
        float min = (float) Math.min((int) this.f81780l, (int) this.f81781m);
        if (aVar.f81804q <= 0.0d || min < 0.0f) {
            d5 = Math.ceil((double) (aVar.f81794g / 2.0f));
        } else {
            double d7 = (double) (min / 2.0f);
            double d8 = aVar.f81804q;
            Double.isNaN(d7);
            d5 = d7 - d8;
        }
        aVar.f81795h = (float) d5;
    }
}
