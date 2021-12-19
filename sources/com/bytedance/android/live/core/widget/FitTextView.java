package com.bytedance.android.live.core.widget;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.widget.TextView;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.covode.number.Covode;

public class FitTextView extends LiveTextView {

    /* renamed from: a */
    private Paint f11021a;

    /* renamed from: b */
    private float f11022b;

    /* renamed from: c */
    private float f11023c = 6.0f;

    static {
        Covode.recordClassIndex(4555);
    }

    /* renamed from: a */
    private static float m9802a(Context context, float f) {
        return f / context.getResources().getDisplayMetrics().scaledDensity;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
        m9803a(charSequence.toString(), getWidth());
    }

    public FitTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TextPaint textPaint = new TextPaint();
        this.f11021a = textPaint;
        textPaint.set((Paint) getPaint());
        this.f11022b = getTextSize();
    }

    /* renamed from: a */
    private void m9803a(String str, int i) {
        if (i > 0) {
            int paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
            float f = this.f11022b;
            this.f11021a.setTextSize(f);
            while (true) {
                if (this.f11021a.measureText(str) <= ((float) paddingLeft)) {
                    break;
                }
                f -= 1.0f;
                float f2 = this.f11023c;
                if (f <= f2) {
                    f = f2;
                    break;
                }
                this.f11021a.setTextSize(f);
            }
            setTextSize(m9802a(getContext(), f));
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (i != i3) {
            m9803a(getText().toString(), i);
        }
    }
}
