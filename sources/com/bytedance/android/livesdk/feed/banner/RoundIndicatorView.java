package com.bytedance.android.livesdk.feed.banner;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

public class RoundIndicatorView extends View {

    /* renamed from: a */
    public int f21000a;

    /* renamed from: b */
    public ViewPager f21001b;

    /* renamed from: c */
    private int f21002c;

    /* renamed from: d */
    private int f21003d;

    /* renamed from: e */
    private float f21004e;

    /* renamed from: f */
    private float f21005f;

    /* renamed from: g */
    private float f21006g;

    /* renamed from: h */
    private Paint f21007h;

    /* renamed from: i */
    private float f21008i;

    /* renamed from: j */
    private float f21009j;

    /* renamed from: k */
    private int f21010k;

    static {
        Covode.recordClassIndex(9350);
    }

    /* renamed from: com.bytedance.android.livesdk.feed.banner.RoundIndicatorView$a */
    class C8497a implements ViewPager.AbstractC1579e {
        static {
            Covode.recordClassIndex(9351);
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageScrolled(int i, float f, int i2) {
        }

        C8497a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.AbstractC1579e
        public final void onPageSelected(int i) {
            if (RoundIndicatorView.this.f21000a > 0) {
                int i2 = i % RoundIndicatorView.this.f21000a;
                if (i2 < RoundIndicatorView.this.f21000a) {
                    RoundIndicatorView.this.setPosition(i2);
                } else {
                    RoundIndicatorView.this.setPosition(0);
                }
            }
        }
    }

    public void setPosition(int i) {
        this.f21010k = i;
        invalidate();
    }

    public void setCount(int i) {
        this.f21000a = i;
        measure(0, 0);
        invalidate();
    }

    public void setViewPager(ViewPager viewPager) {
        this.f21001b = viewPager;
        if (viewPager != null) {
            viewPager.addOnPageChangeListener(new C8497a());
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        MethodCollector.m26663i(3355);
        super.onDraw(canvas);
        this.f21008i = (float) getPaddingLeft();
        this.f21009j = (float) getPaddingTop();
        this.f21007h.setColor(this.f21003d);
        float f = this.f21008i;
        for (int i = 0; i < this.f21000a; i++) {
            if (this.f21010k == i) {
                this.f21007h.setColor(this.f21002c);
            } else {
                this.f21007h.setColor(this.f21003d);
            }
            float f2 = this.f21006g;
            canvas.drawCircle(f + f2, this.f21009j + f2, f2, this.f21007h);
            f += this.f21005f + this.f21004e;
        }
        MethodCollector.m26664o(3355);
    }

    public RoundIndicatorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824) {
            size = getPaddingLeft() + getPaddingRight();
            int i3 = this.f21000a;
            if (i3 > 0) {
                size = (int) (((float) size) + (((float) i3) * this.f21005f) + (((float) (i3 - 1)) * this.f21004e));
            }
            if (mode == Integer.MIN_VALUE) {
                size = Math.max(size, getSuggestedMinimumWidth());
            }
        }
        if (mode2 != 1073741824) {
            size2 = getPaddingBottom() + getPaddingTop();
            if (this.f21000a > 0) {
                size2 += (int) this.f21005f;
            }
            if (mode2 == Integer.MIN_VALUE) {
                size2 = Math.max(size2, getSuggestedMinimumHeight());
            }
        }
        setMeasuredDimension(size, size2);
    }

    private RoundIndicatorView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(3342);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a9y, R.attr.a9z, R.attr.a_0, R.attr.a_1, R.attr.a_2, R.attr.anb, R.attr.anc, R.attr.and, R.attr.ane, R.attr.anf}, 0, 0);
        this.f21004e = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        this.f21005f = dimension;
        this.f21006g = dimension / 2.0f;
        this.f21003d = obtainStyledAttributes.getColor(1, -1726079458);
        this.f21002c = obtainStyledAttributes.getColor(2, -10704);
        this.f21000a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f21007h = paint;
        paint.setAntiAlias(true);
        this.f21010k = 0;
        MethodCollector.m26664o(3342);
    }
}
