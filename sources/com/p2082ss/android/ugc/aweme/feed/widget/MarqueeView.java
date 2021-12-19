package com.p2082ss.android.ugc.aweme.feed.widget;

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
import androidx.core.p035f.C0671a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17301b;
import com.bytedance.ies.dmt.p1194ui.widget.util.C17303d;
import com.p2082ss.android.ugc.aweme.lego.C58254p;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.widget.MarqueeView */
public class MarqueeView extends View {

    /* renamed from: a */
    public TextPaint f116679a;

    /* renamed from: b */
    protected Paint.FontMetrics f116680b;

    /* renamed from: c */
    protected String f116681c;

    /* renamed from: d */
    protected int f116682d;

    /* renamed from: e */
    protected long f116683e;

    /* renamed from: f */
    protected float f116684f;

    /* renamed from: g */
    protected float f116685g;

    /* renamed from: h */
    protected int f116686h;

    /* renamed from: i */
    protected long f116687i;

    /* renamed from: j */
    protected boolean f116688j;

    /* renamed from: k */
    protected int f116689k;

    static {
        Covode.recordClassIndex(59644);
    }

    /* renamed from: b */
    public final void mo85789b() {
        if (this.f116686h != 1) {
            this.f116686h = 1;
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f116686h == 0) {
            mo85790c();
        }
    }

    /* renamed from: a */
    public final void mo85788a() {
        int i = this.f116686h;
        if (i != 0) {
            if (i == 1) {
                this.f116686h = 0;
                invalidate();
            } else if (i == 2) {
                this.f116684f = 0.0f;
                this.f116687i = 0;
                this.f116686h = 0;
                invalidate();
            }
        }
    }

    /* renamed from: c */
    public final void mo85790c() {
        if (this.f116686h != 2) {
            this.f116686h = 2;
            this.f116684f = 0.0f;
            this.f116687i = 0;
            invalidate();
        }
    }

    public void setSpeed(int i) {
        this.f116682d = i;
    }

    public MarqueeView(Context context) {
        this(context, null);
    }

    public void setTextColor(int i) {
        TextPaint textPaint = this.f116679a;
        if (textPaint != null) {
            textPaint.setColor(i);
        }
    }

    public void setText(int i) {
        setText(getResources().getString(i));
    }

    public void setTextShadow(int i) {
        TextPaint textPaint = this.f116679a;
        if (textPaint != null) {
            textPaint.setShadowLayer(1.0f, 1.0f, 1.0f, i);
        }
    }

    public void setTextSize(int i) {
        TextPaint textPaint = this.f116679a;
        if (textPaint != null) {
            textPaint.setTextSize((float) i);
            this.f116679a.getFontMetrics(this.f116680b);
        }
    }

    public void setText(String str) {
        this.f116681c = str + "    ";
        C58254p.m105192a(false).execute(new Runnable() {
            /* class com.p2082ss.android.ugc.aweme.feed.widget.MarqueeView.RunnableC505011 */

            static {
                Covode.recordClassIndex(59645);
            }

            public final void run() {
                MarqueeView marqueeView = MarqueeView.this;
                marqueeView.f116685g = marqueeView.f116679a.measureText(MarqueeView.this.f116681c);
                while (MarqueeView.this.f116685g < ((float) MarqueeView.this.f116689k)) {
                    StringBuilder sb = new StringBuilder();
                    MarqueeView marqueeView2 = MarqueeView.this;
                    marqueeView2.f116681c = sb.append(marqueeView2.f116681c).append(MarqueeView.this.f116681c).toString();
                    MarqueeView marqueeView3 = MarqueeView.this;
                    marqueeView3.f116685g = marqueeView3.f116679a.measureText(MarqueeView.this.f116681c);
                }
                MarqueeView.this.f116684f = 0.0f;
                MarqueeView.this.f116687i = 0;
                MarqueeView.this.post(new Runnable() {
                    /* class com.p2082ss.android.ugc.aweme.feed.widget.MarqueeView.RunnableC505011.RunnableC505021 */

                    static {
                        Covode.recordClassIndex(59646);
                    }

                    public final void run() {
                        MarqueeView.this.requestLayout();
                    }
                });
            }
        });
        this.f116688j = C0671a.m2407a().mo2695a(this.f116681c);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        MethodCollector.m26663i(6034);
        super.onDraw(canvas);
        if (!TextUtils.isEmpty(this.f116681c)) {
            float f = 0.0f;
            if (this.f116685g != 0.0f) {
                long uptimeMillis = SystemClock.uptimeMillis();
                long j = this.f116687i;
                if (j > 0) {
                    float f2 = ((float) ((uptimeMillis - j) * ((long) this.f116682d))) / 1000.0f;
                    float f3 = this.f116684f;
                    if (this.f116688j) {
                        i3 = 1;
                    } else {
                        i3 = -1;
                    }
                    float f4 = f3 + (f2 * ((float) i3));
                    this.f116684f = f4;
                    this.f116684f = f4 % this.f116685g;
                }
                if (this.f116686h == 0) {
                    this.f116687i = uptimeMillis;
                }
                while (true) {
                    float measuredWidth = (float) getMeasuredWidth();
                    float f5 = this.f116684f;
                    boolean z = this.f116688j;
                    if (z) {
                        i = 1;
                    } else {
                        i = -1;
                    }
                    if (f >= measuredWidth + (((float) i) * f5)) {
                        break;
                    }
                    String str = this.f116681c;
                    if (z) {
                        i2 = -1;
                    } else {
                        i2 = 1;
                    }
                    canvas.drawText(str, f5 + (((float) i2) * f), -this.f116680b.top, this.f116679a);
                    f += this.f116685g;
                }
                if (this.f116686h == 0) {
                    postInvalidateDelayed(this.f116683e);
                }
                MethodCollector.m26664o(6034);
                return;
            }
        }
        MethodCollector.m26664o(6034);
    }

    public MarqueeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(6036);
        super.onMeasure(i, i2);
        int i3 = (int) this.f116685g;
        int i4 = (int) (this.f116680b.bottom - this.f116680b.top);
        if (View.MeasureSpec.getSize(i) <= i3) {
            i3 = View.MeasureSpec.getSize(i);
        }
        setMeasuredDimension(i3, i4);
        MethodCollector.m26664o(6036);
    }

    private MarqueeView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(5747);
        this.f116680b = new Paint.FontMetrics();
        this.f116682d = 25;
        this.f116683e = 16;
        this.f116689k = 0;
        TextPaint textPaint = new TextPaint();
        this.f116679a = textPaint;
        textPaint.setAntiAlias(true);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.acy, R.attr.asc, R.attr.asd, R.attr.ase});
        this.f116682d = obtainStyledAttributes.getDimensionPixelSize(0, this.f116682d);
        int color = obtainStyledAttributes.getColor(1, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(3, 28);
        int color2 = obtainStyledAttributes.getColor(2, 0);
        obtainStyledAttributes.recycle();
        this.f116679a.setTextSize((float) dimensionPixelSize);
        this.f116679a.setShadowLayer(1.0f, 1.0f, 1.0f, color2);
        this.f116679a.setColor(color);
        Typeface a = C17301b.m32033a().mo27611a(C17303d.f41567a);
        if (a != null) {
            this.f116679a.setTypeface(a);
        }
        this.f116679a.getFontMetrics(this.f116680b);
        this.f116686h = 2;
        this.f116689k = context.getResources().getDimensionPixelSize(R.dimen.g1);
        MethodCollector.m26664o(5747);
    }
}
