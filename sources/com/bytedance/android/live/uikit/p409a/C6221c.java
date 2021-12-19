package com.bytedance.android.live.uikit.p409a;

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
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.Transformation;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: com.bytedance.android.live.uikit.a.c */
final class C6221c extends Drawable implements Animatable {

    /* renamed from: a */
    public static final Interpolator f15541a = new C6225a((byte) 0);

    /* renamed from: b */
    public static final Interpolator f15542b = new C6227c((byte) 0);

    /* renamed from: g */
    private static final Interpolator f15543g = new LinearInterpolator();

    /* renamed from: h */
    private static final Interpolator f15544h = new AccelerateDecelerateInterpolator();

    /* renamed from: c */
    final C6226b f15545c;

    /* renamed from: d */
    public float f15546d;

    /* renamed from: e */
    public float f15547e;

    /* renamed from: f */
    boolean f15548f;

    /* renamed from: i */
    private final int[] f15549i;

    /* renamed from: j */
    private final ArrayList<Animation> f15550j = new ArrayList<>();

    /* renamed from: k */
    private Resources f15551k;

    /* renamed from: l */
    private View f15552l;

    /* renamed from: m */
    private Animation f15553m;

    /* renamed from: n */
    private double f15554n;

    /* renamed from: o */
    private double f15555o;

    /* renamed from: p */
    private final Drawable.Callback f15556p;

    public final int getOpacity() {
        return -3;
    }

    /* renamed from: com.bytedance.android.live.uikit.a.c$a */
    static class C6225a extends AccelerateDecelerateInterpolator {
        static {
            Covode.recordClassIndex(6931);
        }

        private C6225a() {
        }

        /* synthetic */ C6225a(byte b) {
            this();
        }

        public final float getInterpolation(float f) {
            return super.getInterpolation(Math.max(0.0f, (f - 0.5f) * 2.0f));
        }
    }

    /* renamed from: com.bytedance.android.live.uikit.a.c$c */
    static class C6227c extends AccelerateDecelerateInterpolator {
        static {
            Covode.recordClassIndex(6933);
        }

        private C6227c() {
        }

        /* synthetic */ C6227c(byte b) {
            this();
        }

        public final float getInterpolation(float f) {
            return super.getInterpolation(Math.min(1.0f, f * 2.0f));
        }
    }

    public final int getIntrinsicHeight() {
        return (int) this.f15555o;
    }

    public final int getIntrinsicWidth() {
        return (int) this.f15554n;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.android.live.uikit.a.c$b */
    public static class C6226b {

        /* renamed from: a */
        final RectF f15562a = new RectF();

        /* renamed from: b */
        final Paint f15563b;

        /* renamed from: c */
        final Paint f15564c;

        /* renamed from: d */
        public float f15565d;

        /* renamed from: e */
        public float f15566e;

        /* renamed from: f */
        public float f15567f;

        /* renamed from: g */
        public float f15568g;

        /* renamed from: h */
        public float f15569h;

        /* renamed from: i */
        int[] f15570i;

        /* renamed from: j */
        public int f15571j;

        /* renamed from: k */
        public float f15572k;

        /* renamed from: l */
        public float f15573l;

        /* renamed from: m */
        public float f15574m;

        /* renamed from: n */
        boolean f15575n;

        /* renamed from: o */
        Path f15576o;

        /* renamed from: p */
        float f15577p;

        /* renamed from: q */
        public double f15578q;

        /* renamed from: r */
        int f15579r;

        /* renamed from: s */
        int f15580s;

        /* renamed from: t */
        public int f15581t;

        /* renamed from: u */
        final Paint f15582u;

        /* renamed from: v */
        public int f15583v;

        /* renamed from: w */
        private final Drawable.Callback f15584w;

        static {
            Covode.recordClassIndex(6932);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public final void mo12191c() {
            this.f15584w.invalidateDrawable(null);
        }

        /* renamed from: a */
        public final void mo12185a() {
            this.f15572k = this.f15565d;
            this.f15573l = this.f15566e;
            this.f15574m = this.f15567f;
        }

        /* renamed from: b */
        public final void mo12189b() {
            this.f15572k = 0.0f;
            this.f15573l = 0.0f;
            this.f15574m = 0.0f;
            mo12186a(0.0f);
            mo12190b(0.0f);
            mo12192c(0.0f);
        }

        /* renamed from: a */
        public final void mo12186a(float f) {
            this.f15565d = f;
            mo12191c();
        }

        /* renamed from: b */
        public final void mo12190b(float f) {
            this.f15566e = f;
            mo12191c();
        }

        /* renamed from: c */
        public final void mo12192c(float f) {
            this.f15567f = f;
            mo12191c();
        }

        /* renamed from: a */
        public final void mo12187a(boolean z) {
            if (this.f15575n != z) {
                this.f15575n = z;
                mo12191c();
            }
        }

        /* renamed from: a */
        public final void mo12188a(int[] iArr) {
            this.f15570i = iArr;
            this.f15571j = 0;
        }

        public C6226b(Drawable.Callback callback) {
            Paint paint = new Paint();
            this.f15563b = paint;
            Paint paint2 = new Paint();
            this.f15564c = paint2;
            this.f15565d = 0.0f;
            this.f15566e = 0.0f;
            this.f15567f = 0.0f;
            this.f15568g = 5.0f;
            this.f15569h = 2.5f;
            this.f15582u = new Paint();
            this.f15584w = callback;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
        }
    }

    public final int getAlpha() {
        return this.f15545c.f15581t;
    }

    public final void stop() {
        this.f15552l.clearAnimation();
        mo12165b(0.0f);
        this.f15545c.mo12187a(false);
        this.f15545c.f15571j = 0;
        this.f15545c.mo12189b();
    }

    static {
        Covode.recordClassIndex(6927);
    }

    public final boolean isRunning() {
        ArrayList<Animation> arrayList = this.f15550j;
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
        this.f15553m.reset();
        this.f15545c.mo12185a();
        if (this.f15545c.f15566e != this.f15545c.f15565d) {
            this.f15548f = true;
            this.f15553m.setDuration(666);
            this.f15552l.startAnimation(this.f15553m);
            return;
        }
        this.f15545c.f15571j = 0;
        this.f15545c.mo12189b();
        this.f15553m.setDuration(1333);
        this.f15552l.startAnimation(this.f15553m);
    }

    /* renamed from: a */
    public final void mo12164a(boolean z) {
        this.f15545c.mo12187a(z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo12165b(float f) {
        this.f15546d = f;
        invalidateSelf();
    }

    public final void setAlpha(int i) {
        this.f15545c.f15581t = i;
    }

    /* renamed from: a */
    public final void mo12162a(float f) {
        this.f15545c.mo12186a(0.0f);
        this.f15545c.mo12190b(f);
    }

    /* renamed from: b */
    public final void mo12166b(int i) {
        this.f15545c.f15583v = i;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        C6226b bVar = this.f15545c;
        bVar.f15563b.setColorFilter(colorFilter);
        bVar.mo12191c();
    }

    /* renamed from: a */
    public final void mo12163a(int i) {
        if (i == 0) {
            m13504a(56.0d, 56.0d, 12.5d, 3.0d, 12.0f, 6.0f);
        } else {
            m13504a(40.0d, 40.0d, 8.75d, 2.5d, 10.0f, 5.0f);
        }
    }

    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int save = canvas.save();
        canvas.rotate(this.f15546d, bounds.exactCenterX(), bounds.exactCenterY());
        C6226b bVar = this.f15545c;
        RectF rectF = bVar.f15562a;
        rectF.set(bounds);
        rectF.inset(bVar.f15569h, bVar.f15569h);
        float f = (bVar.f15565d + bVar.f15567f) * 360.0f;
        float f2 = ((bVar.f15566e + bVar.f15567f) * 360.0f) - f;
        bVar.f15563b.setColor(bVar.f15570i[bVar.f15571j]);
        canvas.drawArc(rectF, f, f2, false, bVar.f15563b);
        if (bVar.f15575n) {
            if (bVar.f15576o == null) {
                bVar.f15576o = new Path();
                bVar.f15576o.setFillType(Path.FillType.EVEN_ODD);
            } else {
                bVar.f15576o.reset();
            }
            float f3 = ((float) (((int) bVar.f15569h) / 2)) * bVar.f15577p;
            double cos = bVar.f15578q * Math.cos(0.0d);
            double exactCenterX = (double) bounds.exactCenterX();
            Double.isNaN(exactCenterX);
            float f4 = (float) (cos + exactCenterX);
            double sin = bVar.f15578q * Math.sin(0.0d);
            double exactCenterY = (double) bounds.exactCenterY();
            Double.isNaN(exactCenterY);
            bVar.f15576o.moveTo(0.0f, 0.0f);
            bVar.f15576o.lineTo(((float) bVar.f15579r) * bVar.f15577p, 0.0f);
            bVar.f15576o.lineTo((((float) bVar.f15579r) * bVar.f15577p) / 2.0f, ((float) bVar.f15580s) * bVar.f15577p);
            bVar.f15576o.offset(f4 - f3, (float) (sin + exactCenterY));
            bVar.f15576o.close();
            bVar.f15564c.setColor(bVar.f15570i[bVar.f15571j]);
            canvas.rotate((f + f2) - 5.0f, bounds.exactCenterX(), bounds.exactCenterY());
            canvas.drawPath(bVar.f15576o, bVar.f15564c);
        }
        if (bVar.f15581t < 255) {
            bVar.f15582u.setColor(bVar.f15583v);
            bVar.f15582u.setAlpha(255 - bVar.f15581t);
            canvas.drawCircle(bounds.exactCenterX(), bounds.exactCenterY(), (float) (bounds.width() / 2), bVar.f15582u);
        }
        canvas.restoreToCount(save);
    }

    public C6221c(Context context, View view) {
        int[] iArr = {-16777216};
        this.f15549i = iArr;
        C62243 r1 = new Drawable.Callback() {
            /* class com.bytedance.android.live.uikit.p409a.C6221c.C62243 */

            static {
                Covode.recordClassIndex(6930);
            }

            public final void invalidateDrawable(Drawable drawable) {
                C6221c.this.invalidateSelf();
            }

            public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                C6221c.this.unscheduleSelf(runnable);
            }

            public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                C6221c.this.scheduleSelf(runnable, j);
            }
        };
        this.f15556p = r1;
        this.f15552l = view;
        this.f15551k = context.getResources();
        final C6226b bVar = new C6226b(r1);
        this.f15545c = bVar;
        bVar.mo12188a(iArr);
        mo12163a(1);
        C62221 r12 = new Animation() {
            /* class com.bytedance.android.live.uikit.p409a.C6221c.C62221 */

            static {
                Covode.recordClassIndex(6928);
            }

            public final void applyTransformation(float f, Transformation transformation) {
                if (C6221c.this.f15548f) {
                    C6226b bVar = bVar;
                    bVar.mo12186a(bVar.f15572k + ((bVar.f15573l - bVar.f15572k) * f));
                    bVar.mo12192c(bVar.f15574m + ((((float) (Math.floor((double) (bVar.f15574m / 0.8f)) + 1.0d)) - bVar.f15574m) * f));
                    return;
                }
                double d = (double) bVar.f15568g;
                Double.isNaN(d);
                float radians = (float) Math.toRadians(d / (bVar.f15578q * 6.283185307179586d));
                float f2 = bVar.f15573l;
                float f3 = bVar.f15572k;
                float f4 = bVar.f15574m;
                bVar.mo12190b(f2 + ((0.8f - radians) * C6221c.f15542b.getInterpolation(f)));
                bVar.mo12186a(f3 + (C6221c.f15541a.getInterpolation(f) * 0.8f));
                bVar.mo12192c(f4 + (0.25f * f));
                C6221c.this.mo12165b((f * 144.0f) + ((C6221c.this.f15547e / 5.0f) * 720.0f));
            }
        };
        r12.setRepeatCount(-1);
        r12.setRepeatMode(1);
        r12.setInterpolator(f15543g);
        r12.setAnimationListener(new Animation.AnimationListener() {
            /* class com.bytedance.android.live.uikit.p409a.C6221c.animationAnimation$AnimationListenerC62232 */

            static {
                Covode.recordClassIndex(6929);
            }

            public final void onAnimationEnd(Animation animation) {
            }

            public final void onAnimationStart(Animation animation) {
                C6221c.this.f15547e = 0.0f;
            }

            public final void onAnimationRepeat(Animation animation) {
                bVar.mo12185a();
                C6226b bVar = bVar;
                bVar.f15571j = (bVar.f15571j + 1) % bVar.f15570i.length;
                C6226b bVar2 = bVar;
                bVar2.mo12186a(bVar2.f15566e);
                if (C6221c.this.f15548f) {
                    C6221c.this.f15548f = false;
                    animation.setDuration(1333);
                    bVar.mo12187a(false);
                    return;
                }
                C6221c cVar = C6221c.this;
                cVar.f15547e = (cVar.f15547e + 1.0f) % 5.0f;
            }
        });
        this.f15553m = r12;
    }

    /* renamed from: a */
    private void m13504a(double d, double d2, double d3, double d4, float f, float f2) {
        double d5;
        C6226b bVar = this.f15545c;
        float f3 = this.f15551k.getDisplayMetrics().density;
        double d6 = (double) f3;
        Double.isNaN(d6);
        this.f15554n = d * d6;
        Double.isNaN(d6);
        this.f15555o = d2 * d6;
        float f4 = ((float) d4) * f3;
        bVar.f15568g = f4;
        bVar.f15563b.setStrokeWidth(f4);
        bVar.mo12191c();
        Double.isNaN(d6);
        bVar.f15578q = d3 * d6;
        bVar.f15571j = 0;
        bVar.f15579r = (int) (f * f3);
        bVar.f15580s = (int) (f2 * f3);
        float min = (float) Math.min((int) this.f15554n, (int) this.f15555o);
        if (bVar.f15578q <= 0.0d || min < 0.0f) {
            d5 = Math.ceil((double) (bVar.f15568g / 2.0f));
        } else {
            double d7 = (double) (min / 2.0f);
            double d8 = bVar.f15578q;
            Double.isNaN(d7);
            d5 = d7 - d8;
        }
        bVar.f15569h = (float) d5;
    }
}
