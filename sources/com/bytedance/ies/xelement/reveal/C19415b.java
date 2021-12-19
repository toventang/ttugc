package com.bytedance.ies.xelement.reveal;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.ies.xelement.reveal.b */
public final class C19415b extends OverScroller {
    static {
        Covode.recordClassIndex(22225);
    }

    public C19415b(Context context, Interpolator interpolator) {
        super(context, interpolator);
    }

    public final void startScroll(int i, int i2, int i3, int i4, int i5) {
        super.startScroll(i, i2, i3, i4, Math.min(300, i5));
    }
}
