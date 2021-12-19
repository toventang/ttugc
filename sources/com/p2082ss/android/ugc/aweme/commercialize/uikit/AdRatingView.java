package com.p2082ss.android.ugc.aweme.commercialize.uikit;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.commercialize.uikit.AdRatingView */
public final class AdRatingView extends View {

    /* renamed from: a */
    private Drawable f91063a;

    /* renamed from: b */
    private Drawable f91064b;

    /* renamed from: c */
    private float f91065c;

    /* renamed from: d */
    private int f91066d;

    /* renamed from: e */
    private int f91067e;

    static {
        Covode.recordClassIndex(46075);
    }

    public AdRatingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final int getRatingDivide() {
        return this.f91067e;
    }

    public final Drawable getRatingImage() {
        return this.f91064b;
    }

    public final float getRatingProgress() {
        return this.f91065c;
    }

    public final int getRatingStarNumber() {
        return this.f91066d;
    }

    public final Drawable getRatingUnImage() {
        return this.f91063a;
    }

    public final void setRatingDivide(int i) {
        this.f91067e = i;
        invalidate();
    }

    public final void setRatingProgress(float f) {
        this.f91065c = f;
        invalidate();
    }

    public final void setRatingStarNumber(int i) {
        this.f91066d = i;
        invalidate();
    }

    public final void setRatingImage(Drawable drawable) {
        C89219l.m154721d(drawable, "");
        this.f91064b = drawable;
        invalidate();
    }

    public final void setRatingUnImage(Drawable drawable) {
        C89219l.m154721d(drawable, "");
        this.f91063a = drawable;
        invalidate();
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (canvas != null) {
            float f = this.f91065c;
            float intrinsicHeight = ((float) ((((int) this.f91065c) * this.f91063a.getIntrinsicHeight()) + (((int) f) * this.f91067e))) + ((f - ((float) ((int) f))) * ((float) this.f91063a.getIntrinsicWidth()));
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, intrinsicHeight, (float) this.f91064b.getIntrinsicHeight());
            int i = this.f91066d;
            for (int i2 = 0; i2 < i; i2++) {
                int intrinsicWidth = (this.f91064b.getIntrinsicWidth() * i2) + (this.f91067e * i2);
                Drawable drawable = this.f91064b;
                drawable.setBounds(intrinsicWidth, 0, drawable.getIntrinsicWidth() + intrinsicWidth, this.f91064b.getIntrinsicHeight());
                this.f91064b.draw(canvas);
            }
            canvas.restore();
            canvas.save();
            canvas.clipRect(intrinsicHeight, 0.0f, (float) getWidth(), (float) this.f91063a.getIntrinsicHeight());
            int i3 = this.f91066d;
            for (int i4 = 0; i4 < i3; i4++) {
                int intrinsicWidth2 = (this.f91063a.getIntrinsicWidth() * i4) + (this.f91067e * i4);
                Drawable drawable2 = this.f91063a;
                drawable2.setBounds(intrinsicWidth2, 0, drawable2.getIntrinsicWidth() + intrinsicWidth2, this.f91063a.getIntrinsicHeight());
                this.f91063a.draw(canvas);
            }
            canvas.restore();
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        MethodCollector.m26663i(8411);
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int i4 = 0;
        if (mode == Integer.MIN_VALUE) {
            int intrinsicWidth = this.f91063a.getIntrinsicWidth();
            int i5 = this.f91066d;
            i3 = (intrinsicWidth * i5) + ((i5 - 1) * this.f91067e);
        } else if (mode == 0) {
            i3 = View.MeasureSpec.getSize(i);
        } else if (mode != 1073741824) {
            i3 = 0;
        } else {
            i3 = View.MeasureSpec.getSize(i);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE) {
            i4 = this.f91063a.getIntrinsicHeight();
        } else if (mode2 == 0) {
            i4 = View.MeasureSpec.getSize(i2);
        } else if (mode2 == 1073741824) {
            i4 = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(i3, i4);
        MethodCollector.m26664o(8411);
    }

    private /* synthetic */ AdRatingView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AdRatingView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        Drawable drawable;
        Drawable drawable2;
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(8560);
        if (Build.VERSION.SDK_INT >= 21) {
            drawable = context.getResources().getDrawable(R.drawable.bl8, null);
            C89219l.m154716b(drawable, "");
        } else {
            drawable = context.getResources().getDrawable(R.drawable.bl8);
            C89219l.m154716b(drawable, "");
        }
        this.f91063a = drawable;
        if (Build.VERSION.SDK_INT >= 21) {
            drawable2 = context.getResources().getDrawable(2131233902, null);
            C89219l.m154716b(drawable2, "");
        } else {
            drawable2 = context.getResources().getDrawable(2131233902);
            C89219l.m154716b(drawable2, "");
        }
        this.f91064b = drawable2;
        this.f91066d = 5;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.a91, R.attr.a95, R.attr.a96, R.attr.a97, R.attr.a98, R.attr.a99});
            C89219l.m154716b(obtainStyledAttributes, "");
            Drawable drawable3 = obtainStyledAttributes.getDrawable(2);
            if (drawable3 != null) {
                C89219l.m154716b(drawable3, "");
                setRatingImage(drawable3);
            }
            Drawable drawable4 = obtainStyledAttributes.getDrawable(5);
            if (drawable4 != null) {
                C89219l.m154716b(drawable4, "");
                setRatingUnImage(drawable4);
            }
            setRatingProgress(obtainStyledAttributes.getFloat(3, this.f91065c));
            setRatingStarNumber(obtainStyledAttributes.getInt(4, this.f91066d));
            setRatingDivide(obtainStyledAttributes.getDimensionPixelSize(1, this.f91067e));
            obtainStyledAttributes.recycle();
        }
        MethodCollector.m26664o(8560);
    }
}
