package com.bytedance.android.livesdk.chatroom.p499ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.util.AttributeSet;
import com.bytedance.android.live.design.widget.LiveTextView;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.NoMoreSpaceTextView */
public class NoMoreSpaceTextView extends LiveTextView {

    /* renamed from: a */
    private int f19089a;

    /* renamed from: b */
    private int f19090b;

    /* renamed from: c */
    private boolean f19091c;

    static {
        Covode.recordClassIndex(8490);
    }

    public void scrollBy(int i, int i2) {
    }

    public void scrollTo(int i, int i2) {
    }

    private int getSpaceExtra() {
        if (getLineCount() == this.f19090b) {
            return this.f19089a;
        }
        int lineCount = getLineCount();
        this.f19090b = lineCount;
        this.f19089a = 0;
        int i = lineCount - 1;
        Layout layout = getLayout();
        if (i >= 0 && getMeasuredHeight() == layout.getHeight()) {
            Paint.FontMetricsInt fontMetricsInt = layout.getPaint().getFontMetricsInt();
            Rect rect = new Rect();
            this.f19089a = (rect.bottom - (fontMetricsInt.ascent - layout.getLineAscent(i))) - (getLineBounds(i, rect) + fontMetricsInt.bottom);
        }
        return this.f19089a;
    }

    public void setAlpha(float f) {
        super.setAlpha(f);
    }

    public void setAlwaysInvalidate(boolean z) {
        this.f19091c = z;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (this.f19091c) {
            invalidate();
        }
    }

    public NoMoreSpaceTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight() - getSpaceExtra());
    }

    private NoMoreSpaceTextView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
    }
}
