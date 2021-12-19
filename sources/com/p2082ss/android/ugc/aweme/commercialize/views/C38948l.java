package com.p2082ss.android.ugc.aweme.commercialize.views;

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

/* renamed from: com.ss.android.ugc.aweme.commercialize.views.l */
public class C38948l extends FrameLayout {

    /* renamed from: a */
    private Path f92001a;

    /* renamed from: b */
    private int f92002b;

    static {
        Covode.recordClassIndex(46536);
    }

    public void setRadius(int i) {
        this.f92002b = i;
        mo67312a(getMeasuredWidth(), getMeasuredHeight());
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        if (this.f92002b == 0 || Build.VERSION.SDK_INT >= 21) {
            super.dispatchDraw(canvas);
            return;
        }
        if (this.f92001a == null && this.f92002b > 0) {
            int width = getWidth();
            int height = getHeight();
            if (width > 0 && height > 0) {
                Path path = new Path();
                this.f92001a = path;
                RectF rectF = new RectF(0.0f, 0.0f, (float) width, (float) height);
                int i = this.f92002b;
                path.addRoundRect(rectF, new float[]{(float) i, (float) i, (float) i, (float) i, (float) i, (float) i, (float) i, (float) i}, Path.Direction.CW);
            }
        }
        Path path2 = this.f92001a;
        if (path2 != null) {
            canvas.clipPath(path2);
        }
        super.dispatchDraw(canvas);
    }

    C38948l(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    private void mo67312a(int i, int i2) {
        if (this.f92002b > 0 && Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(true);
            setOutlineProvider(new C38949m((float) this.f92002b, i, i2));
        }
    }

    C38948l(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(8853);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.aa7}, 0, 0);
        if (obtainStyledAttributes.hasValue(0)) {
            this.f92002b = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        }
        obtainStyledAttributes.recycle();
        MethodCollector.m26664o(8853);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.f92002b == 0 || Build.VERSION.SDK_INT >= 21) {
            mo67312a(i, i2);
        }
    }
}
