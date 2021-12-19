package com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.p030b.C0622a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.KTVView */
public class KTVView extends View {

    /* renamed from: a */
    private Paint f157574a;

    /* renamed from: b */
    private int f157575b;

    /* renamed from: c */
    private int f157576c;

    /* renamed from: d */
    private int f157577d;

    static {
        Covode.recordClassIndex(82957);
    }

    public void setColor(int i) {
        this.f157574a.setColor(i);
        invalidate();
    }

    public void setLength(int i) {
        this.f157575b = i;
        int i2 = this.f157576c;
        this.f157577d = C0622a.m2312a(i + i2, i2, getWidth() - getPaddingRight());
        invalidate();
    }

    public void setStart(int i) {
        this.f157576c = i;
        this.f157577d = C0622a.m2312a(this.f157575b + i, i, getWidth() - getPaddingRight());
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Drawable background = getBackground();
        if (background != null) {
            int saveLayer = canvas.saveLayer(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), null, 31);
            background.draw(canvas);
            canvas.drawRect((float) this.f157576c, 0.0f, (float) this.f157577d, (float) getHeight(), this.f157574a);
            canvas.restoreToCount(saveLayer);
        }
    }

    public KTVView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    private KTVView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(10302);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843173}, 0, 0);
        int color = obtainStyledAttributes.getColor(0, -16777216);
        obtainStyledAttributes.recycle();
        Paint paint = new Paint(1);
        this.f157574a = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f157574a.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
        this.f157574a.setColor(color);
        MethodCollector.m26664o(10302);
    }
}
