package com.bytedance.tux.skeleton;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

public final class TuxSkeletonView extends AbstractC23256f {

    /* renamed from: d */
    public static final C23236a f55072d = new C23236a((byte) 0);

    /* renamed from: e */
    private int f55073e;

    /* renamed from: f */
    private int f55074f;

    static {
        Covode.recordClassIndex(27178);
    }

    public TuxSkeletonView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* renamed from: com.bytedance.tux.skeleton.TuxSkeletonView$a */
    public static final class C23236a {
        static {
            Covode.recordClassIndex(27179);
        }

        private C23236a() {
        }

        public /* synthetic */ C23236a(byte b) {
            this();
        }
    }

    public final int getSkeletonHeight() {
        return this.f55074f;
    }

    public final int getSkeletonWidth() {
        return this.f55073e;
    }

    public final void setSkeletonHeight(int i) {
        this.f55074f = i;
        requestLayout();
    }

    public final void setSkeletonWidth(int i) {
        this.f55073e = i;
        requestLayout();
    }

    /* renamed from: a */
    private static int m43798a(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            mode = Integer.MIN_VALUE;
        }
        return View.MeasureSpec.makeMeasureSpec(size, mode);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        super.onMeasure(m43798a(i), m43798a(i2));
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        if (mo37841a()) {
            int i3 = this.f55073e;
            if (i3 == -2) {
                measuredWidth = measuredWidth2;
            } else if (i3 != -1) {
                if (i3 != 0) {
                    measuredWidth = i3;
                } else {
                    measuredWidth = measuredHeight;
                }
            }
            int i4 = this.f55074f;
            if (i4 == -2) {
                measuredHeight = measuredHeight2;
            } else if (i4 != -1) {
                if (i4 != 0) {
                    measuredHeight = i4;
                } else {
                    measuredHeight = getMeasuredWidth();
                }
            }
        } else {
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        getPlaceholders().get(0).setBounds(getPaddingLeft(), getPaddingTop(), getMeasuredWidth() - getPaddingRight(), getMeasuredHeight() - getPaddingBottom());
    }

    private /* synthetic */ TuxSkeletonView(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private TuxSkeletonView(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154719c(context, "");
        this.f55073e = -2;
        this.f55074f = -2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.aqq, R.attr.aqz}, 0, 0);
        setSkeletonWidth(obtainStyledAttributes.getLayoutDimension(1, -2));
        setSkeletonHeight(obtainStyledAttributes.getLayoutDimension(0, -2));
        obtainStyledAttributes.recycle();
        mo37862b();
    }
}
