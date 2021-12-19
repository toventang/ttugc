package com.p2082ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview;

import android.content.Context;
import android.util.AttributeSet;
import androidx.core.p037h.C0792v;
import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.lancet.C58030k;
import com.p2082ss.android.ugc.aweme.shortvideo.C70636dh;
import com.p2082ss.android.ugc.aweme.shortvideo.C71827ew;
import com.p2082ss.android.ugc.tools.view.widget.AVAutoRTLImageView;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLImageView */
public class RTLImageView extends AVAutoRTLImageView {

    /* renamed from: a */
    private int f157754a;

    static {
        Covode.recordClassIndex(82994);
    }

    public float getLeftX() {
        return super.getX();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C58030k.m104850a(this);
    }

    /* renamed from: a */
    private void m124564a() {
        this.f157754a = C70636dh.m124831b(C71827ew.m126821a(getContext()));
    }

    public float getStartX() {
        if (C0792v.m2768e(this) == 1) {
            return (((float) this.f157754a) - super.getX()) - ((float) getMeasuredWidth());
        }
        return super.getX();
    }

    public void setLeftX(float f) {
        super.setX(f);
    }

    public RTLImageView(Context context) {
        super(context);
        m124564a();
    }

    public void setStartX(float f) {
        if (C0792v.m2768e(this) == 1) {
            f = (((float) this.f157754a) - f) - ((float) getMeasuredWidth());
        }
        super.setX(f);
    }

    public RTLImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m124564a();
    }
}
