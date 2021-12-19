package com.p2082ss.android.ugc.aweme.detail.p2751ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.p035f.C0671a;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.feed.widget.MarqueeView;

/* renamed from: com.ss.android.ugc.aweme.detail.ui.MarqueeView2 */
public class MarqueeView2 extends MarqueeView {
    static {
        Covode.recordClassIndex(49239);
    }

    public Paint getPaint() {
        return this.f116679a;
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.widget.MarqueeView
    public void setText(String str) {
        this.f116681c = str + "    ";
        this.f116685g = this.f116679a.measureText(this.f116681c);
        this.f116684f = 0.0f;
        this.f116687i = 0;
        this.f116688j = C0671a.m2407a().mo2695a(this.f116681c);
        requestLayout();
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.widget.MarqueeView
    public void onDraw(Canvas canvas) {
        int i;
        int i2;
        if (!TextUtils.isEmpty(this.f116681c)) {
            float f = 0.0f;
            if (this.f116685g != 0.0f) {
                if (this.f116688j) {
                    f = ((float) getWidth()) - this.f116685g;
                }
                long uptimeMillis = SystemClock.uptimeMillis();
                if (this.f116687i > 0) {
                    float f2 = ((float) ((uptimeMillis - this.f116687i) * ((long) this.f116682d))) / 1000.0f;
                    float f3 = this.f116684f;
                    if (this.f116688j) {
                        i2 = 1;
                    } else {
                        i2 = -1;
                    }
                    this.f116684f = f3 + (f2 * ((float) i2));
                    this.f116684f %= this.f116685g;
                }
                if (this.f116686h == 0) {
                    this.f116687i = uptimeMillis;
                }
                this.f116679a.getFontMetrics(this.f116680b);
                if (this.f116686h == 0) {
                    while (true) {
                        float measuredWidth = (float) getMeasuredWidth();
                        float f4 = this.f116684f;
                        if (this.f116688j) {
                            i = 1;
                        } else {
                            i = -1;
                        }
                        if (f >= measuredWidth + (f4 * ((float) i))) {
                            break;
                        }
                        canvas.drawText(this.f116681c, this.f116684f + f, -this.f116680b.top, this.f116679a);
                        f += this.f116685g;
                    }
                } else {
                    canvas.drawText(this.f116681c, this.f116684f + f, -this.f116680b.top, this.f116679a);
                }
                if (this.f116686h == 0) {
                    postInvalidateDelayed(this.f116683e);
                }
            }
        }
    }

    public MarqueeView2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.p2082ss.android.ugc.aweme.feed.widget.MarqueeView
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE || View.MeasureSpec.getMode(i2) == 0) {
            this.f116679a.getFontMetrics(this.f116680b);
            setMeasuredDimension(View.MeasureSpec.getSize(i), (int) (this.f116680b.bottom - this.f116680b.top));
            return;
        }
        super.onMeasure(i, i2);
    }
}
