package com.bytedance.ies.dmt.p1194ui.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.bytedance.ies.dmt.ui.widget.RectCornerRelativeLayout */
public final class RectCornerRelativeLayout extends RelativeLayout {

    /* renamed from: a */
    private C17280i f41338a;

    static {
        Covode.recordClassIndex(19747);
    }

    public final C17280i getMRectCornerHelper() {
        return this.f41338a;
    }

    public final float getBottomLeftRadius() {
        return this.f41338a.f41401a[4];
    }

    public final float getBottomRightRadius() {
        return this.f41338a.f41401a[6];
    }

    public final int getStrokeColor() {
        return this.f41338a.f41406f;
    }

    public final int getStrokeWidth() {
        return this.f41338a.f41408h;
    }

    public final float getTopLeftRadius() {
        return this.f41338a.f41401a[0];
    }

    public final float getTopRightRadius() {
        return this.f41338a.f41401a[2];
    }

    public final void invalidate() {
        C17280i iVar = this.f41338a;
        if (iVar != null) {
            iVar.mo27477a(this);
        }
        super.invalidate();
    }

    public final void setClipBackground(boolean z) {
        this.f41338a.f41409i = z;
        invalidate();
    }

    public final void setMRectCornerHelper(C17280i iVar) {
        C89219l.m154721d(iVar, "");
        this.f41338a = iVar;
    }

    public final void setRoundAsCircle(boolean z) {
        this.f41338a.f41404d = z;
        invalidate();
    }

    public final void setStrokeColor(int i) {
        this.f41338a.f41406f = i;
        invalidate();
    }

    public final void setStrokeWidth(int i) {
        this.f41338a.f41408h = i;
        invalidate();
    }

    public final void setBottomLeftRadius(int i) {
        float f = ((float) i) * 1.0f;
        this.f41338a.f41401a[6] = f;
        this.f41338a.f41401a[7] = f;
        invalidate();
    }

    public final void setBottomRightRadius(int i) {
        float f = ((float) i) * 1.0f;
        this.f41338a.f41401a[4] = f;
        this.f41338a.f41401a[5] = f;
        invalidate();
    }

    public final void setRadius(int i) {
        int length = this.f41338a.f41401a.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f41338a.f41401a[i2] = ((float) i) * 1.0f;
        }
        invalidate();
    }

    public final void setTopLeftRadius(int i) {
        float f = ((float) i) * 1.0f;
        this.f41338a.f41401a[0] = f;
        this.f41338a.f41401a[1] = f;
        invalidate();
    }

    public final void setTopRightRadius(int i) {
        float f = ((float) i) * 1.0f;
        this.f41338a.f41401a[2] = f;
        this.f41338a.f41401a[3] = f;
        invalidate();
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        int action = motionEvent.getAction();
        if (action == 0) {
            Region region = this.f41338a.f41410j;
            if (region == null) {
                C89219l.m154710a("mAreaRegion");
            }
            if (!region.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
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

    public final void draw(Canvas canvas) {
        C89219l.m154721d(canvas, "");
        if (this.f41338a.f41409i) {
            canvas.save();
            Path path = this.f41338a.f41402b;
            if (path == null) {
                C89219l.m154710a("mClipPath");
            }
            canvas.clipPath(path);
            super.draw(canvas);
            canvas.restore();
            return;
        }
        super.draw(canvas);
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        C89219l.m154721d(canvas, "");
        RectF rectF = this.f41338a.f41411k;
        if (rectF == null) {
            C89219l.m154710a("mLayer");
        }
        canvas.saveLayer(rectF, null, 31);
        super.dispatchDraw(canvas);
        C17280i iVar = this.f41338a;
        C89219l.m154721d(canvas, "");
        if (iVar.f41408h > 0) {
            Paint paint = iVar.f41403c;
            if (paint == null) {
                C89219l.m154710a("mPaint");
            }
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            Paint paint2 = iVar.f41403c;
            if (paint2 == null) {
                C89219l.m154710a("mPaint");
            }
            paint2.setColor(-1);
            Paint paint3 = iVar.f41403c;
            if (paint3 == null) {
                C89219l.m154710a("mPaint");
            }
            paint3.setStrokeWidth((float) (iVar.f41408h * 2));
            Paint paint4 = iVar.f41403c;
            if (paint4 == null) {
                C89219l.m154710a("mPaint");
            }
            paint4.setStyle(Paint.Style.STROKE);
            Path path = iVar.f41402b;
            if (path == null) {
                C89219l.m154710a("mClipPath");
            }
            Paint paint5 = iVar.f41403c;
            if (paint5 == null) {
                C89219l.m154710a("mPaint");
            }
            canvas.drawPath(path, paint5);
            Paint paint6 = iVar.f41403c;
            if (paint6 == null) {
                C89219l.m154710a("mPaint");
            }
            paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
            Paint paint7 = iVar.f41403c;
            if (paint7 == null) {
                C89219l.m154710a("mPaint");
            }
            paint7.setColor(iVar.f41406f);
            Paint paint8 = iVar.f41403c;
            if (paint8 == null) {
                C89219l.m154710a("mPaint");
            }
            paint8.setStyle(Paint.Style.STROKE);
            Path path2 = iVar.f41402b;
            if (path2 == null) {
                C89219l.m154710a("mClipPath");
            }
            Paint paint9 = iVar.f41403c;
            if (paint9 == null) {
                C89219l.m154710a("mPaint");
            }
            canvas.drawPath(path2, paint9);
        }
        Paint paint10 = iVar.f41403c;
        if (paint10 == null) {
            C89219l.m154710a("mPaint");
        }
        paint10.setColor(-1);
        Paint paint11 = iVar.f41403c;
        if (paint11 == null) {
            C89219l.m154710a("mPaint");
        }
        paint11.setStyle(Paint.Style.FILL);
        if (Build.VERSION.SDK_INT <= 27) {
            Paint paint12 = iVar.f41403c;
            if (paint12 == null) {
                C89219l.m154710a("mPaint");
            }
            paint12.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            Path path3 = iVar.f41402b;
            if (path3 == null) {
                C89219l.m154710a("mClipPath");
            }
            Paint paint13 = iVar.f41403c;
            if (paint13 == null) {
                C89219l.m154710a("mPaint");
            }
            canvas.drawPath(path3, paint13);
        } else {
            Paint paint14 = iVar.f41403c;
            if (paint14 == null) {
                C89219l.m154710a("mPaint");
            }
            paint14.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            Path path4 = new Path();
            RectF rectF2 = iVar.f41411k;
            if (rectF2 == null) {
                C89219l.m154710a("mLayer");
            }
            float width = rectF2.width();
            RectF rectF3 = iVar.f41411k;
            if (rectF3 == null) {
                C89219l.m154710a("mLayer");
            }
            path4.addRect(0.0f, 0.0f, width, rectF3.height(), Path.Direction.CW);
            Path path5 = iVar.f41402b;
            if (path5 == null) {
                C89219l.m154710a("mClipPath");
            }
            path4.op(path5, Path.Op.DIFFERENCE);
            Paint paint15 = iVar.f41403c;
            if (paint15 == null) {
                C89219l.m154710a("mPaint");
            }
            canvas.drawPath(path4, paint15);
        }
        canvas.restore();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public RectCornerRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
        C89219l.m154721d(context, "");
        C89219l.m154721d(attributeSet, "");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private RectCornerRelativeLayout(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        C89219l.m154721d(attributeSet, "");
        MethodCollector.m26663i(7543);
        this.f41338a = new C17280i();
        C17280i iVar = new C17280i();
        this.f41338a = iVar;
        C89219l.m154721d(context, "");
        C89219l.m154721d(attributeSet, "");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.nu, R.attr.a_z, R.attr.aa0, R.attr.aa1, R.attr.aa2, R.attr.aa3, R.attr.aa4, R.attr.afn, R.attr.afo, R.attr.aoy, R.attr.aqe, R.attr.aqf, R.attr.aqg, R.attr.aqh, R.attr.aqi, R.attr.aqj, R.attr.ar3, R.attr.ar4});
        C89219l.m154716b(obtainStyledAttributes, "");
        iVar.f41404d = obtainStyledAttributes.getBoolean(1, false);
        iVar.f41407g = obtainStyledAttributes.getColorStateList(7);
        if (iVar.f41407g != null) {
            ColorStateList colorStateList = iVar.f41407g;
            if (colorStateList == null) {
                C89219l.m154715b();
            }
            iVar.f41406f = colorStateList.getDefaultColor();
            ColorStateList colorStateList2 = iVar.f41407g;
            if (colorStateList2 == null) {
                C89219l.m154715b();
            }
            iVar.f41405e = colorStateList2.getDefaultColor();
        } else {
            iVar.f41406f = -1;
            iVar.f41405e = -1;
        }
        iVar.f41408h = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        iVar.f41409i = obtainStyledAttributes.getBoolean(0, false);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(5, dimensionPixelSize);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        int dimensionPixelSize5 = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        obtainStyledAttributes.recycle();
        float f = (float) dimensionPixelSize2;
        iVar.f41401a[0] = f;
        iVar.f41401a[1] = f;
        float f2 = (float) dimensionPixelSize3;
        iVar.f41401a[2] = f2;
        iVar.f41401a[3] = f2;
        float f3 = (float) dimensionPixelSize5;
        iVar.f41401a[4] = f3;
        iVar.f41401a[5] = f3;
        float f4 = (float) dimensionPixelSize4;
        iVar.f41401a[6] = f4;
        iVar.f41401a[7] = f4;
        iVar.f41411k = new RectF();
        iVar.f41402b = new Path();
        iVar.f41410j = new Region();
        iVar.f41403c = new Paint();
        Paint paint = iVar.f41403c;
        if (paint == null) {
            C89219l.m154710a("mPaint");
        }
        paint.setColor(-1);
        Paint paint2 = iVar.f41403c;
        if (paint2 == null) {
            C89219l.m154710a("mPaint");
        }
        paint2.setAntiAlias(true);
        MethodCollector.m26664o(7543);
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C17280i iVar = this.f41338a;
        C89219l.m154721d(this, "");
        RectF rectF = iVar.f41411k;
        if (rectF == null) {
            C89219l.m154710a("mLayer");
        }
        rectF.set(0.0f, 0.0f, (float) i, (float) i2);
        iVar.mo27477a(this);
    }
}
