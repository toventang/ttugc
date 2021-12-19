package com.bytedance.ies.xelement.viewpager;

import android.content.Context;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.tasm.behavior.AbstractC28520j;

/* renamed from: com.bytedance.ies.xelement.viewpager.a */
public final class C19446a extends LinearLayout {

    /* renamed from: a */
    private int f46076a;

    static {
        Covode.recordClassIndex(22278);
    }

    public final int getOverflow() {
        return this.f46076a;
    }

    private Rect getBoundRectForOverflow() {
        int i;
        if (this.f46076a == 3 || !(getContext() instanceof AbstractC28520j)) {
            return null;
        }
        int width = getWidth();
        int height = getHeight();
        DisplayMetrics displayMetrics = ((AbstractC28520j) getContext()).f67075p;
        int i2 = 0;
        if ((getOverflow() & 1) != 0) {
            i = 0 - displayMetrics.widthPixels;
            width += displayMetrics.widthPixels * 2;
        } else {
            i = 0;
        }
        if ((getOverflow() & 2) != 0) {
            i2 = 0 - displayMetrics.heightPixels;
            height += displayMetrics.heightPixels * 2;
        }
        return new Rect(i, i2, width + i, height + i2);
    }

    public final void setOverflow(int i) {
        this.f46076a = i;
    }

    public C19446a(Context context) {
        super(context);
        MethodCollector.m26663i(6883);
        MethodCollector.m26664o(6883);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        MethodCollector.m26663i(6885);
        super.onLayout(z, i, i2, i3, i4);
        if (this.f46076a != 0) {
            if (getParent() instanceof ViewGroup) {
                ((ViewGroup) getParent()).setClipChildren(false);
            }
            setClipChildren(false);
            C0792v.m2745a(this, getBoundRectForOverflow());
            if (getChildAt(0) != null) {
                C0792v.m2745a(getChildAt(0), getBoundRectForOverflow());
            }
        }
        MethodCollector.m26664o(6885);
    }
}
