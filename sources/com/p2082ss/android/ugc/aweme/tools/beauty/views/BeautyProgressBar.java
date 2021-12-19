package com.p2082ss.android.ugc.aweme.tools.beauty.views;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.filter.widget.FilterBeautySeekBar;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.beauty.views.BeautyProgressBar */
public final class BeautyProgressBar extends FilterBeautySeekBar {

    /* renamed from: h */
    public boolean f175108h;

    /* renamed from: i */
    private int f175109i;

    /* renamed from: j */
    private int f175110j;

    static {
        Covode.recordClassIndex(91150);
    }

    public final int getMaxValue() {
        return this.f175110j;
    }

    public final int getMinValue() {
        return this.f175109i;
    }

    @Override // com.p2082ss.android.ugc.aweme.filter.widget.FilterBeautySeekBar
    public final int getProgress() {
        String valueOf;
        int progress = super.getProgress();
        if (this.f175108h) {
            float f = (float) progress;
            if (f >= ((float) getMax()) / 2.0f) {
                valueOf = String.valueOf((int) (((((float) this.f175110j) / (((float) getMax()) / 2.0f)) * f) - ((float) this.f175110j)));
            } else {
                valueOf = String.valueOf((int) ((((-((float) this.f175109i)) / (((float) getMax()) / 2.0f)) * f) + ((float) this.f175109i)));
            }
        } else {
            valueOf = String.valueOf((int) (((((float) (this.f175110j - this.f175109i)) / ((float) getMax())) * ((float) progress)) + ((float) this.f175109i)));
        }
        this.f117531a = valueOf;
        return progress;
    }

    public final void setDoubleDirection(boolean z) {
        this.f175108h = z;
    }

    public final void setMaxValue(int i) {
        this.f175110j = i;
    }

    public final void setMinValue(int i) {
        this.f175109i = i;
    }

    public final synchronized void setProgress(int i) {
        MethodCollector.m26663i(8701);
        int progress = super.getProgress();
        super.setProgress(i);
        if (progress == super.getProgress()) {
            invalidate();
        }
        MethodCollector.m26664o(8701);
    }

    public BeautyProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (context != null) {
            Paint paint = this.f117533c;
            C89219l.m154716b(paint, "");
            paint.setColor(context.getResources().getColor(R.color.e0));
            Paint paint2 = this.f117533c;
            C89219l.m154716b(paint2, "");
            paint2.setFakeBoldText(true);
        }
    }
}
