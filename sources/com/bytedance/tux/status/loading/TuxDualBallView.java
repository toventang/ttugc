package com.bytedance.tux.status.loading;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import p4600h.p4611f.p4613b.C89219l;
import p4600h.p4615g.C89241a;
import p4600h.p4619j.C89271h;

public final class TuxDualBallView extends View {

    /* renamed from: f */
    public static final C23267a f55140f = new C23267a((byte) 0);

    /* renamed from: a */
    public float f55141a;

    /* renamed from: b */
    public boolean f55142b;

    /* renamed from: c */
    public boolean f55143c;

    /* renamed from: d */
    public boolean f55144d;

    /* renamed from: e */
    public boolean f55145e;

    /* renamed from: g */
    private int f55146g;

    /* renamed from: h */
    private int f55147h;

    /* renamed from: i */
    private Paint f55148i;

    /* renamed from: j */
    private final PorterDuffXfermode f55149j;

    /* renamed from: k */
    private final int f55150k;

    /* renamed from: l */
    private long f55151l;

    /* renamed from: m */
    private int f55152m;

    /* renamed from: n */
    private float f55153n;

    /* renamed from: o */
    private float f55154o;

    /* renamed from: p */
    private float f55155p;

    /* renamed from: q */
    private float f55156q;

    static {
        Covode.recordClassIndex(27212);
    }

    public TuxDualBallView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* renamed from: com.bytedance.tux.status.loading.TuxDualBallView$a */
    public static final class C23267a {
        static {
            Covode.recordClassIndex(27213);
        }

        private C23267a() {
        }

        public /* synthetic */ C23267a(byte b) {
            this();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo37885c();
    }

    /* renamed from: b */
    public final void mo37884b() {
        mo37883a();
        this.f55144d = true;
        this.f55142b = true;
        postInvalidate();
    }

    /* renamed from: c */
    public final void mo37885c() {
        this.f55144d = false;
        this.f55143c = false;
        this.f55141a = 0.0f;
    }

    /* renamed from: a */
    public final void mo37883a() {
        this.f55151l = -1;
        if (this.f55152m <= 0) {
            Resources system = Resources.getSystem();
            C89219l.m154709a((Object) system, "");
            setProgressBarInfo(C89241a.m154730a(TypedValue.applyDimension(1, 36.0f, system.getDisplayMetrics())));
        }
        int c = C89271h.m154772c(getMeasuredHeight(), getMeasuredWidth());
        int i = this.f55152m;
        if (1 <= c && i > c) {
            setProgressBarInfo(c);
        }
        this.f55143c = true;
    }

    public final void setAnimating(boolean z) {
        this.f55144d = z;
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        if (i != 0) {
            mo37885c();
        }
    }

    public final void setProgressBarInfo(int i) {
        if (i > 0) {
            this.f55152m = i;
            this.f55153n = ((float) i) / 2.0f;
            float f = ((float) (i >> 1)) * 0.32f;
            this.f55154o = f;
            float f2 = (((float) i) * 0.16f) + f;
            this.f55155p = f2;
            this.f55156q = ((float) i) - (f2 * 2.0f);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        int i;
        int i2;
        MethodCollector.m26663i(8323);
        C89219l.m154719c(canvas, "");
        super.onDraw(canvas);
        if ((this.f55144d || !this.f55142b) && this.f55143c) {
            if (this.f55142b) {
                long nanoTime = System.nanoTime() / 1000000;
                if (this.f55151l < 0) {
                    this.f55151l = nanoTime;
                }
                float f3 = ((float) (nanoTime - this.f55151l)) / 400.0f;
                this.f55141a = f3;
                int i3 = (int) f3;
                boolean z = true;
                if (((this.f55150k + i3) & 1) != 1) {
                    z = false;
                }
                this.f55145e = z;
                this.f55141a = f3 - ((float) i3);
            }
            float f4 = this.f55141a;
            if (((double) f4) < 0.5d) {
                f = f4 * 2.0f * f4;
            } else {
                f = ((f4 * 2.0f) * (2.0f - f4)) - 1.0f;
            }
            int i4 = this.f55152m;
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) i4, (float) i4, this.f55148i, 31);
            float f5 = (this.f55156q * f) + this.f55155p;
            if (((double) f) < 0.5d) {
                f2 = f * 2.0f;
            } else {
                f2 = 2.0f - (f * 2.0f);
            }
            float f6 = this.f55154o;
            float f7 = (0.25f * f2 * f6) + f6;
            Paint paint = this.f55148i;
            if (this.f55145e) {
                i = this.f55147h;
            } else {
                i = this.f55146g;
            }
            paint.setColor(i);
            canvas.drawCircle(f5, this.f55153n, f7, this.f55148i);
            float f8 = ((float) this.f55152m) - f5;
            float f9 = this.f55154o;
            float f10 = f9 - ((f2 * 0.375f) * f9);
            Paint paint2 = this.f55148i;
            if (this.f55145e) {
                i2 = this.f55146g;
            } else {
                i2 = this.f55147h;
            }
            paint2.setColor(i2);
            this.f55148i.setXfermode(this.f55149j);
            canvas.drawCircle(f8, this.f55153n, f10, this.f55148i);
            this.f55148i.setXfermode(null);
            canvas.restoreToCount(saveLayer);
            postInvalidateDelayed(17);
            MethodCollector.m26664o(8323);
            return;
        }
        MethodCollector.m26664o(8323);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        MethodCollector.m26663i(8320);
        super.onMeasure(i, i2);
        int c = C89271h.m154772c(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        int i3 = this.f55152m;
        if (1 > c) {
            MethodCollector.m26664o(8320);
            return;
        }
        if (i3 > c) {
            setProgressBarInfo(c);
        }
        MethodCollector.m26664o(8320);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TuxDualBallView(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxDualBallView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154719c(context, "");
        MethodCollector.m26663i(8783);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.FILL);
        this.f55148i = paint;
        this.f55149j = new PorterDuffXfermode(PorterDuff.Mode.DARKEN);
        this.f55151l = -1;
        this.f55152m = -1;
        this.f55146g = Color.parseColor("#FE2C55");
        this.f55147h = Color.parseColor("#25F4EE");
        MethodCollector.m26664o(8783);
    }
}
