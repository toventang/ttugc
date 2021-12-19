package com.p2082ss.android.ugc.aweme.commercialize.p2534ad;

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

/* renamed from: com.ss.android.ugc.aweme.commercialize.ad.AdRatingView */
public final class AdRatingView extends View {

    /* renamed from: a */
    private Drawable f88841a;

    /* renamed from: b */
    private Drawable f88842b;

    /* renamed from: c */
    private float f88843c;

    /* renamed from: d */
    private int f88844d;

    /* renamed from: e */
    private int f88845e;

    static {
        Covode.recordClassIndex(45004);
    }

    public AdRatingView(Context context) {
        this(context, (AttributeSet) null, 6);
    }

    public AdRatingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final int getRatingDivide() {
        return this.f88845e;
    }

    public final Drawable getRatingImage() {
        return this.f88842b;
    }

    public final float getRatingProgress() {
        return this.f88843c;
    }

    public final int getRatingStarNumber() {
        return this.f88844d;
    }

    public final Drawable getRatingUnImage() {
        return this.f88841a;
    }

    public final void setRatingDivide(int i) {
        this.f88845e = i;
        invalidate();
    }

    public final void setRatingProgress(float f) {
        this.f88843c = f;
        invalidate();
    }

    public final void setRatingStarNumber(int i) {
        this.f88844d = i;
        invalidate();
    }

    public final void setRatingImage(Drawable drawable) {
        C89219l.m154721d(drawable, "");
        this.f88842b = drawable;
        invalidate();
    }

    public final void setRatingUnImage(Drawable drawable) {
        C89219l.m154721d(drawable, "");
        this.f88841a = drawable;
        invalidate();
    }

    public final void draw(Canvas canvas) {
        super.draw(canvas);
        if (canvas != null) {
            float f = this.f88843c;
            float intrinsicHeight = ((float) ((((int) this.f88843c) * this.f88841a.getIntrinsicHeight()) + (((int) f) * this.f88845e))) + ((f - ((float) ((int) f))) * ((float) this.f88841a.getIntrinsicWidth()));
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, intrinsicHeight, (float) this.f88842b.getIntrinsicHeight());
            int i = this.f88844d;
            for (int i2 = 0; i2 < i; i2++) {
                int intrinsicWidth = (this.f88842b.getIntrinsicWidth() * i2) + (this.f88845e * i2);
                Drawable drawable = this.f88842b;
                drawable.setBounds(intrinsicWidth, 0, drawable.getIntrinsicWidth() + intrinsicWidth, this.f88842b.getIntrinsicHeight());
                this.f88842b.draw(canvas);
            }
            canvas.restore();
            canvas.save();
            canvas.clipRect(intrinsicHeight, 0.0f, (float) getWidth(), (float) this.f88841a.getIntrinsicHeight());
            int i3 = this.f88844d;
            for (int i4 = 0; i4 < i3; i4++) {
                int intrinsicWidth2 = (this.f88841a.getIntrinsicWidth() * i4) + (this.f88845e * i4);
                Drawable drawable2 = this.f88841a;
                drawable2.setBounds(intrinsicWidth2, 0, drawable2.getIntrinsicWidth() + intrinsicWidth2, this.f88841a.getIntrinsicHeight());
                this.f88841a.draw(canvas);
            }
            canvas.restore();
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        MethodCollector.m26663i(3415);
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int i4 = 0;
        if (mode == Integer.MIN_VALUE) {
            int intrinsicWidth = this.f88841a.getIntrinsicWidth();
            int i5 = this.f88844d;
            i3 = (intrinsicWidth * i5) + ((i5 - 1) * this.f88845e);
        } else if (mode == 0) {
            i3 = View.MeasureSpec.getSize(i);
        } else if (mode != 1073741824) {
            i3 = 0;
        } else {
            i3 = View.MeasureSpec.getSize(i);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode2 == Integer.MIN_VALUE) {
            i4 = this.f88841a.getIntrinsicHeight();
        } else if (mode2 == 0) {
            i4 = View.MeasureSpec.getSize(i2);
        } else if (mode2 == 1073741824) {
            i4 = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(i3, i4);
        MethodCollector.m26664o(3415);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    private /* synthetic */ AdRatingView(Context context, AttributeSet attributeSet, int i) {
        this(context, (i & 2) != 0 ? null : attributeSet, (byte) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AdRatingView(Context context, AttributeSet attributeSet, byte b) {
        super(context, attributeSet, 0);
        Drawable drawable;
        Drawable drawable2;
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(3470);
        if (Build.VERSION.SDK_INT >= 21) {
            drawable = context.getResources().getDrawable(R.drawable.b2x, null);
            C89219l.m154716b(drawable, "");
        } else {
            drawable = context.getResources().getDrawable(R.drawable.b2x);
            C89219l.m154716b(drawable, "");
        }
        this.f88841a = drawable;
        if (Build.VERSION.SDK_INT >= 21) {
            drawable2 = context.getResources().getDrawable(2131233902, null);
            C89219l.m154716b(drawable2, "");
        } else {
            drawable2 = context.getResources().getDrawable(2131233902);
            C89219l.m154716b(drawable2, "");
        }
        this.f88842b = drawable2;
        this.f88844d = 5;
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
            setRatingProgress(obtainStyledAttributes.getFloat(3, this.f88843c));
            setRatingStarNumber(obtainStyledAttributes.getInt(4, this.f88844d));
            setRatingDivide(obtainStyledAttributes.getDimensionPixelSize(1, this.f88845e));
            obtainStyledAttributes.recycle();
        }
        MethodCollector.m26664o(3470);
    }
}
