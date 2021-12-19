package com.p2082ss.android.ugc.aweme.anchor.multi.p2314ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.anchor.multi.ui.BoundedRelativeLayout */
public final class BoundedRelativeLayout extends RelativeLayout {

    /* renamed from: a */
    private int f79606a;

    /* renamed from: b */
    private int f79607b;

    static {
        Covode.recordClassIndex(40370);
    }

    public BoundedRelativeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final void setMaxHeight(int i) {
        this.f79607b = i;
        requestLayout();
    }

    public final void setMaxWidth(int i) {
        this.f79606a = i;
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        MethodCollector.m26663i(5412);
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.f79606a;
        if (1 <= i3 && size > i3) {
            i = View.MeasureSpec.makeMeasureSpec(this.f79606a, View.MeasureSpec.getMode(i));
        }
        int size2 = View.MeasureSpec.getSize(i2);
        int i4 = this.f79607b;
        if (1 <= i4 && size2 > i4) {
            i2 = View.MeasureSpec.makeMeasureSpec(this.f79607b, View.MeasureSpec.getMode(i2));
        }
        super.onMeasure(i, i2);
        MethodCollector.m26664o(5412);
    }

    private /* synthetic */ BoundedRelativeLayout(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private BoundedRelativeLayout(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(5529);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.l1, R.attr.l4});
        C89219l.m154716b(obtainStyledAttributes, "");
        this.f79606a = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f79607b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        MethodCollector.m26664o(5529);
    }
}
