package com.p2082ss.android.ugc.aweme.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.views.RoundedFrameLayout */
public class RoundedFrameLayout extends FrameLayout {

    /* renamed from: a */
    private Path f181916a;

    /* renamed from: b */
    private int f181917b;

    static {
        Covode.recordClassIndex(94768);
    }

    public void setRadius(int i) {
        this.f181917b = i;
        m141134a(getMeasuredWidth(), getMeasuredHeight());
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (this.f181917b == 0 || Build.VERSION.SDK_INT >= 21) {
            super.dispatchDraw(canvas);
            return;
        }
        if (this.f181916a == null && this.f181917b > 0) {
            int width = getWidth();
            int height = getHeight();
            if (width > 0 && height > 0) {
                Path path = new Path();
                this.f181916a = path;
                RectF rectF = new RectF(0.0f, 0.0f, (float) width, (float) height);
                int i = this.f181917b;
                path.addRoundRect(rectF, new float[]{(float) i, (float) i, (float) i, (float) i, (float) i, (float) i, (float) i, (float) i}, Path.Direction.CW);
            }
        }
        Path path2 = this.f181916a;
        if (path2 != null) {
            canvas.clipPath(path2);
        }
        super.dispatchDraw(canvas);
    }

    public RoundedFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    private void m141134a(int i, int i2) {
        if (this.f181917b > 0 && Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(true);
            setOutlineProvider(new C81464q((float) this.f181917b, i, i2));
        }
    }

    private RoundedFrameLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(11988);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.aa7}, 0, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f181917b = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        }
        obtainStyledAttributes.recycle();
        MethodCollector.m26664o(11988);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f181917b == 0 || Build.VERSION.SDK_INT >= 21) {
            m141134a(i, i2);
        }
    }
}
