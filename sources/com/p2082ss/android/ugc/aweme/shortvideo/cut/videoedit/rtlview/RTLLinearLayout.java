package com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.C71827ew;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLLinearLayout */
public class RTLLinearLayout extends LinearLayout {

    /* renamed from: a */
    private int f157755a = C70636dh.m124831b(C71827ew.m126821a(getContext()));

    static {
        Covode.recordClassIndex(82995);
    }

    public float getLeftX() {
        return super.getX();
    }

    public float getStartX() {
        if (C0792v.m2768e(this) == 1) {
            return (((float) this.f157755a) - super.getX()) - ((float) getMeasuredWidth());
        }
        return super.getX();
    }

    public void setLeftX(float f) {
        super.setX(f);
    }

    public void setStartX(float f) {
        if (C0792v.m2768e(this) == 1) {
            super.setX((((float) this.f157755a) - f) - ((float) getMeasuredWidth()));
        } else {
            super.setX(f);
        }
    }

    public RTLLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(11587);
        MethodCollector.m26664o(11587);
    }
}
