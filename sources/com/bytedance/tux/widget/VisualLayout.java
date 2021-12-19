package com.bytedance.tux.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

public final class VisualLayout extends RelativeLayout {

    /* renamed from: a */
    private final C23413c f55494a;

    /* renamed from: b */
    private int f55495b;

    /* renamed from: c */
    private int f55496c;

    static {
        Covode.recordClassIndex(27365);
    }

    public VisualLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final int getMaxHeight() {
        return this.f55495b;
    }

    public final int getMaxWidth() {
        return this.f55496c;
    }

    public final C23413c getRectCornerHelper() {
        return this.f55494a;
    }

    public final float getBottomLeftRadius() {
        return this.f55494a.f55508a[4];
    }

    public final float getBottomRightRadius() {
        return this.f55494a.f55508a[6];
    }

    public final int getStrokeColor() {
        return this.f55494a.f55514g;
    }

    public final int getStrokeWidth() {
        return this.f55494a.f55515h;
    }

    public final float getTopLeftRadius() {
        return this.f55494a.f55508a[0];
    }

    public final float getTopRightRadius() {
        return this.f55494a.f55508a[2];
    }

    public final void invalidate() {
        this.f55494a.mo38153a(this);
        super.invalidate();
    }

    public final Drawable getBackground() {
        Drawable background = super.getBackground();
        if (background == null) {
            return null;
        }
        if (background instanceof C23407a) {
            return ((C23407a) background).f55499c;
        }
        return background;
    }

    public final void setClipBackground(boolean z) {
        this.f55494a.f55516i = z;
        invalidate();
    }

    public final void setMaxHeight(int i) {
        this.f55495b = i;
        requestLayout();
    }

    public final void setMaxWidth(int i) {
        this.f55496c = i;
        requestLayout();
    }

    public final void setRoundAsCircle(boolean z) {
        this.f55494a.f55513f = z;
        invalidate();
    }

    public final void setStrokeColor(int i) {
        this.f55494a.f55514g = i;
        invalidate();
    }

    public final void setStrokeWidth(int i) {
        this.f55494a.f55515h = i;
        invalidate();
    }

    public final void setBackground(Drawable drawable) {
        if (this.f55494a == null || !(drawable instanceof ColorDrawable)) {
            super.setBackground(drawable);
        } else {
            super.setBackground(new C23407a(this.f55494a, (ColorDrawable) drawable));
        }
    }

    public final void setBottomLeftRadius(int i) {
        float f = ((float) i) * 1.0f;
        this.f55494a.f55508a[6] = f;
        this.f55494a.f55508a[7] = f;
        invalidate();
    }

    public final void setBottomRightRadius(int i) {
        float f = ((float) i) * 1.0f;
        this.f55494a.f55508a[4] = f;
        this.f55494a.f55508a[5] = f;
        invalidate();
    }

    public final void setRadius(int i) {
        int length = this.f55494a.f55508a.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f55494a.f55508a[i2] = ((float) i) * 1.0f;
        }
        invalidate();
    }

    public final void setTopLeftRadius(int i) {
        float f = ((float) i) * 1.0f;
        this.f55494a.f55508a[0] = f;
        this.f55494a.f55508a[1] = f;
        invalidate();
    }

    public final void setTopRightRadius(int i) {
        float f = ((float) i) * 1.0f;
        this.f55494a.f55508a[2] = f;
        this.f55494a.f55508a[3] = f;
        invalidate();
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C89219l.m154719c(motionEvent, "");
        int action = motionEvent.getAction();
        if (action == 0) {
            if (!this.f55494a.f55511d.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        } else if (action != 1) {
            if (action == 3) {
                setPressed(false);
                refreshDrawableState();
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        refreshDrawableState();
        return super.dispatchTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        C89219l.m154719c(canvas, "");
        canvas.saveLayer(this.f55494a.f55512e, null, 31);
        super.dispatchDraw(canvas);
        C23413c cVar = this.f55494a;
        C89219l.m154719c(canvas, "");
        if (cVar.f55515h > 0) {
            cVar.f55510c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            cVar.f55510c.setColor(-1);
            cVar.f55510c.setStrokeWidth((float) (cVar.f55515h * 2));
            cVar.f55510c.setStyle(Paint.Style.STROKE);
            canvas.drawPath(cVar.f55509b, cVar.f55510c);
            cVar.f55510c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
            cVar.f55510c.setColor(cVar.f55514g);
            cVar.f55510c.setStyle(Paint.Style.STROKE);
            canvas.drawPath(cVar.f55509b, cVar.f55510c);
        }
        cVar.f55510c.setColor(-1);
        cVar.f55510c.setStyle(Paint.Style.FILL);
        if (Build.VERSION.SDK_INT <= 27) {
            cVar.f55510c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas.drawPath(cVar.f55509b, cVar.f55510c);
        } else {
            cVar.f55510c.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            Path path = new Path();
            path.addRect(0.0f, 0.0f, cVar.f55512e.width(), cVar.f55512e.height(), Path.Direction.CW);
            path.op(cVar.f55509b, Path.Op.DIFFERENCE);
            canvas.drawPath(path, cVar.f55510c);
        }
        canvas.restore();
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        MethodCollector.m26663i(7185);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 0 && (i4 = this.f55496c) > 0 && size > i4) {
            size = i4;
        }
        if (mode2 != 0 && (i3 = this.f55495b) > 0 && size2 > i3) {
            size2 = i3;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, mode), View.MeasureSpec.makeMeasureSpec(size2, mode2));
        MethodCollector.m26664o(7185);
    }

    private /* synthetic */ VisualLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private VisualLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154719c(context, "");
        C89219l.m154719c(attributeSet, "");
        MethodCollector.m26663i(7199);
        C89219l.m154719c(context, "");
        C89219l.m154719c(attributeSet, "");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.nu, R.attr.a_z, R.attr.aa0, R.attr.aa1, R.attr.aa2, R.attr.aa3, R.attr.aa4, R.attr.afn, R.attr.afo, R.attr.aoy, R.attr.aqe, R.attr.aqf, R.attr.aqg, R.attr.aqh, R.attr.aqi, R.attr.aqj, R.attr.ar3, R.attr.ar4});
        boolean z = obtainStyledAttributes.getBoolean(10, false);
        int color = obtainStyledAttributes.getColor(16, -1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(17, 0);
        boolean z2 = obtainStyledAttributes.getBoolean(9, false);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(11, 0);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(14, dimensionPixelSize2);
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(15, dimensionPixelSize2);
        int dimensionPixelSize5 = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize2);
        int dimensionPixelSize6 = obtainStyledAttributes.getDimensionPixelSize(13, dimensionPixelSize2);
        obtainStyledAttributes.recycle();
        this.f55494a = new C23413c(z, color, dimensionPixelSize, z2, dimensionPixelSize3, dimensionPixelSize4, dimensionPixelSize5, dimensionPixelSize6);
        this.f55495b = -1;
        this.f55496c = -1;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.aq6, R.attr.aq7});
        setMaxWidth(obtainStyledAttributes2.getDimensionPixelSize(1, -1));
        setMaxHeight(obtainStyledAttributes2.getDimensionPixelSize(0, -1));
        obtainStyledAttributes2.recycle();
        Drawable background = super.getBackground();
        if (background != null) {
            setBackground(background);
            MethodCollector.m26664o(7199);
            return;
        }
        MethodCollector.m26664o(7199);
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C23413c cVar = this.f55494a;
        C89219l.m154719c(this, "");
        cVar.f55512e.set(0.0f, 0.0f, (float) i, (float) i2);
        cVar.mo38153a(this);
    }
}
