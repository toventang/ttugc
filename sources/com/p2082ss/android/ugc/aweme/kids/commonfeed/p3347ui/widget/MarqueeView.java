package com.p2082ss.android.ugc.aweme.kids.commonfeed.p3347ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.kids.commonfeed.ui.widget.MarqueeView */
public class MarqueeView extends View {

    /* renamed from: a */
    protected TextPaint f131210a;

    /* renamed from: b */
    protected Paint.FontMetrics f131211b;

    /* renamed from: c */
    protected String f131212c;

    /* renamed from: d */
    protected int f131213d;

    /* renamed from: e */
    protected long f131214e;

    /* renamed from: f */
    protected float f131215f;

    /* renamed from: g */
    protected float f131216g;

    /* renamed from: h */
    protected int f131217h;

    /* renamed from: i */
    protected long f131218i;

    /* renamed from: j */
    protected boolean f131219j;

    /* renamed from: k */
    protected int f131220k;

    static {
        Covode.recordClassIndex(67456);
    }

    /* renamed from: b */
    public final void mo94802b() {
        if (this.f131217h != 1) {
            this.f131217h = 1;
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f131217h == 0) {
            mo94803c();
        }
    }

    /* renamed from: a */
    public final void mo94801a() {
        int i = this.f131217h;
        if (i != 0) {
            if (i == 1) {
                this.f131217h = 0;
                invalidate();
            } else if (i == 2) {
                this.f131215f = 0.0f;
                this.f131218i = 0;
                this.f131217h = 0;
                invalidate();
            }
        }
    }

    /* renamed from: c */
    public final void mo94803c() {
        if (this.f131217h != 2) {
            this.f131217h = 2;
            this.f131215f = 0.0f;
            this.f131218i = 0;
            invalidate();
        }
    }

    public void setSpeed(int i) {
        this.f131213d = i;
    }

    public void setTextColor(int i) {
        TextPaint textPaint = this.f131210a;
        if (textPaint != null) {
            textPaint.setColor(i);
        }
    }

    public void setText(int i) {
        setText(getResources().getString(i));
    }

    public void setTextShadow(int i) {
        TextPaint textPaint = this.f131210a;
        if (textPaint != null) {
            textPaint.setShadowLayer(1.0f, 1.0f, 1.0f, i);
        }
    }

    public void setTextSize(int i) {
        TextPaint textPaint = this.f131210a;
        if (textPaint != null) {
            textPaint.setTextSize((float) i);
        }
    }

    public void setText(String str) {
        String str2 = str + "    ";
        this.f131212c = str2;
        this.f131216g = this.f131210a.measureText(str2);
        while (this.f131216g < ((float) this.f131220k)) {
            String str3 = this.f131212c + this.f131212c;
            this.f131212c = str3;
            this.f131216g = this.f131210a.measureText(str3);
        }
        this.f131215f = 0.0f;
        this.f131218i = 0;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        MethodCollector.m26663i(7755);
        super.onDraw(canvas);
        if (!TextUtils.isEmpty(this.f131212c)) {
            float f = 0.0f;
            if (this.f131216g != 0.0f) {
                long uptimeMillis = SystemClock.uptimeMillis();
                long j = this.f131218i;
                if (j > 0) {
                    float f2 = ((float) ((uptimeMillis - j) * ((long) this.f131213d))) / 1000.0f;
                    float f3 = this.f131215f;
                    if (this.f131219j) {
                        i3 = 1;
                    } else {
                        i3 = -1;
                    }
                    float f4 = f3 + (f2 * ((float) i3));
                    this.f131215f = f4;
                    this.f131215f = f4 % this.f131216g;
                }
                if (this.f131217h == 0) {
                    this.f131218i = uptimeMillis;
                }
                this.f131210a.getFontMetrics(this.f131211b);
                while (true) {
                    float measuredWidth = (float) getMeasuredWidth();
                    float f5 = this.f131215f;
                    boolean z = this.f131219j;
                    if (z) {
                        i = 1;
                    } else {
                        i = -1;
                    }
                    if (f >= measuredWidth + (((float) i) * f5)) {
                        break;
                    }
                    String str = this.f131212c;
                    if (z) {
                        i2 = -1;
                    } else {
                        i2 = 1;
                    }
                    canvas.drawText(str, f5 + (((float) i2) * f), -this.f131211b.top, this.f131210a);
                    f += this.f131216g;
                }
                if (this.f131217h == 0) {
                    postInvalidateDelayed(this.f131214e);
                }
                MethodCollector.m26664o(7755);
                return;
            }
        }
        MethodCollector.m26664o(7755);
    }

    public MarqueeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        MethodCollector.m26663i(7895);
        super.onMeasure(i, i2);
        this.f131210a.getFontMetrics(this.f131211b);
        int i4 = (int) (this.f131211b.bottom - this.f131211b.top);
        boolean z = false;
        if (!TextUtils.isEmpty(this.f131212c)) {
            i3 = (int) this.f131210a.measureText(this.f131212c);
        } else {
            i3 = 0;
        }
        if (View.MeasureSpec.getSize(i) <= i3) {
            i3 = View.MeasureSpec.getSize(i);
        }
        setMeasuredDimension(i3, i4);
        if (C0792v.m2768e(this) == 1) {
            z = true;
        }
        this.f131219j = z;
        MethodCollector.m26664o(7895);
    }

    private MarqueeView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(7577);
        this.f131211b = new Paint.FontMetrics();
        this.f131213d = 25;
        this.f131214e = 16;
        this.f131220k = 0;
        TextPaint textPaint = new TextPaint();
        this.f131210a = textPaint;
        textPaint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.acy, R.attr.asc, R.attr.asd, R.attr.ase});
        this.f131213d = obtainStyledAttributes.getDimensionPixelSize(0, this.f131213d);
        int color = obtainStyledAttributes.getColor(1, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(3, 28);
        int color2 = obtainStyledAttributes.getColor(2, 0);
        obtainStyledAttributes.recycle();
        this.f131210a.setTextSize((float) dimensionPixelSize);
        this.f131210a.setShadowLayer(1.0f, 1.0f, 1.0f, color2);
        this.f131210a.setColor(color);
        Typeface a = C17301b.m32033a().mo27611a(C17303d.f41567a);
        if (a != null) {
            this.f131210a.setTypeface(a);
        }
        this.f131217h = 2;
        this.f131220k = context.getResources().getDimensionPixelSize(R.dimen.n3);
        MethodCollector.m26664o(7577);
    }
}
