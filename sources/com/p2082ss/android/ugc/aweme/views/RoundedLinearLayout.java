package com.p2082ss.android.ugc.aweme.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.views.RoundedLinearLayout */
public class RoundedLinearLayout extends LinearLayout {

    /* renamed from: a */
    private Path f181918a;

    /* renamed from: b */
    private int f181919b;

    static {
        Covode.recordClassIndex(94769);
    }

    public void setRadius(int i) {
        this.f181919b = i;
        if (getHeight() != 0 && getWidth() != 0) {
            m141135a(getWidth(), getHeight());
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (this.f181919b == 0 || Build.VERSION.SDK_INT >= 21) {
            super.dispatchDraw(canvas);
            return;
        }
        if (this.f181918a == null && this.f181919b > 0) {
            int width = getWidth();
            int height = getHeight();
            if (width > 0 && height > 0) {
                Path path = new Path();
                this.f181918a = path;
                RectF rectF = new RectF(0.0f, 0.0f, (float) width, (float) height);
                int i = this.f181919b;
                path.addRoundRect(rectF, new float[]{(float) i, (float) i, (float) i, (float) i, (float) i, (float) i, (float) i, (float) i}, Path.Direction.CW);
            }
        }
        Path path2 = this.f181918a;
        if (path2 != null) {
            canvas.clipPath(path2);
        }
        super.dispatchDraw(canvas);
    }

    public RoundedLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: a */
    private void m141135a(int i, int i2) {
        if (this.f181919b > 0 && Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(true);
            setOutlineProvider(new C81464q((float) this.f181919b, i, i2));
        }
    }

    private RoundedLinearLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(11975);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.aa7}, 0, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f181919b = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        }
        obtainStyledAttributes.recycle();
        MethodCollector.m26664o(11975);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f181919b == 0 || Build.VERSION.SDK_INT >= 21) {
            m141135a(i, i2);
        }
    }
}
