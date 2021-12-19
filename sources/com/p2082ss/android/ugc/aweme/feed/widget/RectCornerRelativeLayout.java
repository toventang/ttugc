package com.p2082ss.android.ugc.aweme.feed.widget;

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

/* renamed from: com.ss.android.ugc.aweme.feed.widget.RectCornerRelativeLayout */
public final class RectCornerRelativeLayout extends RelativeLayout {

    /* renamed from: a */
    private C50519k f116724a;

    static {
        Covode.recordClassIndex(59651);
    }

    public final C50519k getMRectCornerHelper() {
        return this.f116724a;
    }

    public final float getBottomLeftRadius() {
        return this.f116724a.f116755a[4];
    }

    public final float getBottomRightRadius() {
        return this.f116724a.f116755a[6];
    }

    public final int getStrokeColor() {
        return this.f116724a.f116760f;
    }

    public final int getStrokeWidth() {
        return this.f116724a.f116762h;
    }

    public final float getTopLeftRadius() {
        return this.f116724a.f116755a[0];
    }

    public final float getTopRightRadius() {
        return this.f116724a.f116755a[2];
    }

    public final void invalidate() {
        C50519k kVar = this.f116724a;
        if (kVar != null) {
            kVar.mo85840a(this);
        }
        super.invalidate();
    }

    public final void setClipBackground(boolean z) {
        this.f116724a.f116763i = z;
        invalidate();
    }

    public final void setMRectCornerHelper(C50519k kVar) {
        C89219l.m154721d(kVar, "");
        this.f116724a = kVar;
    }

    public final void setRoundAsCircle(boolean z) {
        this.f116724a.f116758d = z;
        invalidate();
    }

    public final void setStrokeColor(int i) {
        this.f116724a.f116760f = i;
        invalidate();
    }

    public final void setStrokeWidth(int i) {
        this.f116724a.f116762h = i;
        invalidate();
    }

    public final void setBottomLeftRadius(int i) {
        float f = ((float) i) * 1.0f;
        this.f116724a.f116755a[6] = f;
        this.f116724a.f116755a[7] = f;
        invalidate();
    }

    public final void setBottomRightRadius(int i) {
        float f = ((float) i) * 1.0f;
        this.f116724a.f116755a[4] = f;
        this.f116724a.f116755a[5] = f;
        invalidate();
    }

    public final void setRadius(int i) {
        int length = this.f116724a.f116755a.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.f116724a.f116755a[i2] = ((float) i) * 1.0f;
        }
        invalidate();
    }

    public final void setTopLeftRadius(int i) {
        float f = ((float) i) * 1.0f;
        this.f116724a.f116755a[0] = f;
        this.f116724a.f116755a[1] = f;
        invalidate();
    }

    public final void setTopRightRadius(int i) {
        float f = ((float) i) * 1.0f;
        this.f116724a.f116755a[2] = f;
        this.f116724a.f116755a[3] = f;
        invalidate();
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C89219l.m154721d(motionEvent, "");
        int action = motionEvent.getAction();
        if (action == 0) {
            Region region = this.f116724a.f116764j;
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
        if (this.f116724a.f116763i) {
            canvas.save();
            Path path = this.f116724a.f116756b;
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
        RectF rectF = this.f116724a.f116765k;
        if (rectF == null) {
            C89219l.m154710a("mLayer");
        }
        canvas.saveLayer(rectF, null, 31);
        super.dispatchDraw(canvas);
        C50519k kVar = this.f116724a;
        C89219l.m154721d(canvas, "");
        if (kVar.f116762h > 0) {
            Paint paint = kVar.f116757c;
            if (paint == null) {
                C89219l.m154710a("mPaint");
            }
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            Paint paint2 = kVar.f116757c;
            if (paint2 == null) {
                C89219l.m154710a("mPaint");
            }
            paint2.setColor(-1);
            Paint paint3 = kVar.f116757c;
            if (paint3 == null) {
                C89219l.m154710a("mPaint");
            }
            paint3.setStrokeWidth((float) (kVar.f116762h * 2));
            Paint paint4 = kVar.f116757c;
            if (paint4 == null) {
                C89219l.m154710a("mPaint");
            }
            paint4.setStyle(Paint.Style.STROKE);
            Path path = kVar.f116756b;
            if (path == null) {
                C89219l.m154710a("mClipPath");
            }
            Paint paint5 = kVar.f116757c;
            if (paint5 == null) {
                C89219l.m154710a("mPaint");
            }
            canvas.drawPath(path, paint5);
            Paint paint6 = kVar.f116757c;
            if (paint6 == null) {
                C89219l.m154710a("mPaint");
            }
            paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_OVER));
            Paint paint7 = kVar.f116757c;
            if (paint7 == null) {
                C89219l.m154710a("mPaint");
            }
            paint7.setColor(kVar.f116760f);
            Paint paint8 = kVar.f116757c;
            if (paint8 == null) {
                C89219l.m154710a("mPaint");
            }
            paint8.setStyle(Paint.Style.STROKE);
            Path path2 = kVar.f116756b;
            if (path2 == null) {
                C89219l.m154710a("mClipPath");
            }
            Paint paint9 = kVar.f116757c;
            if (paint9 == null) {
                C89219l.m154710a("mPaint");
            }
            canvas.drawPath(path2, paint9);
        }
        Paint paint10 = kVar.f116757c;
        if (paint10 == null) {
            C89219l.m154710a("mPaint");
        }
        paint10.setColor(-1);
        Paint paint11 = kVar.f116757c;
        if (paint11 == null) {
            C89219l.m154710a("mPaint");
        }
        paint11.setStyle(Paint.Style.FILL);
        if (Build.VERSION.SDK_INT <= 27) {
            Paint paint12 = kVar.f116757c;
            if (paint12 == null) {
                C89219l.m154710a("mPaint");
            }
            paint12.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            Path path3 = kVar.f116756b;
            if (path3 == null) {
                C89219l.m154710a("mClipPath");
            }
            Paint paint13 = kVar.f116757c;
            if (paint13 == null) {
                C89219l.m154710a("mPaint");
            }
            canvas.drawPath(path3, paint13);
        } else {
            Paint paint14 = kVar.f116757c;
            if (paint14 == null) {
                C89219l.m154710a("mPaint");
            }
            paint14.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            Path path4 = new Path();
            RectF rectF2 = kVar.f116765k;
            if (rectF2 == null) {
                C89219l.m154710a("mLayer");
            }
            float width = rectF2.width();
            RectF rectF3 = kVar.f116765k;
            if (rectF3 == null) {
                C89219l.m154710a("mLayer");
            }
            path4.addRect(0.0f, 0.0f, width, rectF3.height(), Path.Direction.CW);
            Path path5 = kVar.f116756b;
            if (path5 == null) {
                C89219l.m154710a("mClipPath");
            }
            path4.op(path5, Path.Op.DIFFERENCE);
            Paint paint15 = kVar.f116757c;
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
        MethodCollector.m26663i(6501);
        this.f116724a = new C50519k();
        C50519k kVar = new C50519k();
        this.f116724a = kVar;
        C89219l.m154721d(context, "");
        C89219l.m154721d(attributeSet, "");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.nu, R.attr.a_z, R.attr.aa0, R.attr.aa1, R.attr.aa2, R.attr.aa3, R.attr.aa4, R.attr.afn, R.attr.afo, R.attr.aoy, R.attr.aqe, R.attr.aqf, R.attr.aqg, R.attr.aqh, R.attr.aqi, R.attr.aqj, R.attr.ar3, R.attr.ar4});
        C89219l.m154716b(obtainStyledAttributes, "");
        kVar.f116758d = obtainStyledAttributes.getBoolean(1, false);
        kVar.f116761g = obtainStyledAttributes.getColorStateList(7);
        if (kVar.f116761g != null) {
            ColorStateList colorStateList = kVar.f116761g;
            if (colorStateList == null) {
                C89219l.m154715b();
            }
            kVar.f116760f = colorStateList.getDefaultColor();
            ColorStateList colorStateList2 = kVar.f116761g;
            if (colorStateList2 == null) {
                C89219l.m154715b();
            }
            kVar.f116759e = colorStateList2.getDefaultColor();
        } else {
            kVar.f116760f = -1;
            kVar.f116759e = -1;
        }
        kVar.f116762h = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        kVar.f116763i = obtainStyledAttributes.getBoolean(0, false);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, 0);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(5, dimensionPixelSize);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        int dimensionPixelSize5 = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        obtainStyledAttributes.recycle();
        float f = (float) dimensionPixelSize2;
        kVar.f116755a[0] = f;
        kVar.f116755a[1] = f;
        float f2 = (float) dimensionPixelSize3;
        kVar.f116755a[2] = f2;
        kVar.f116755a[3] = f2;
        float f3 = (float) dimensionPixelSize5;
        kVar.f116755a[4] = f3;
        kVar.f116755a[5] = f3;
        float f4 = (float) dimensionPixelSize4;
        kVar.f116755a[6] = f4;
        kVar.f116755a[7] = f4;
        kVar.f116765k = new RectF();
        kVar.f116756b = new Path();
        kVar.f116764j = new Region();
        kVar.f116757c = new Paint();
        Paint paint = kVar.f116757c;
        if (paint == null) {
            C89219l.m154710a("mPaint");
        }
        paint.setColor(-1);
        Paint paint2 = kVar.f116757c;
        if (paint2 == null) {
            C89219l.m154710a("mPaint");
        }
        paint2.setAntiAlias(true);
        MethodCollector.m26664o(6501);
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C50519k kVar = this.f116724a;
        C89219l.m154721d(this, "");
        RectF rectF = kVar.f116765k;
        if (rectF == null) {
            C89219l.m154710a("mLayer");
        }
        rectF.set(0.0f, 0.0f, (float) i, (float) i2);
        kVar.mo85840a(this);
    }
}
