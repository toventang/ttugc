package com.p2082ss.android.ugc.aweme.ecommerce.combinepayment.view;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.C0643b;
import com.bytedance.common.utility.C13628n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.ecommerce.combinepayment.view.PageStepper */
public final class PageStepper extends LinearLayout {

    /* renamed from: a */
    private int f103287a;

    /* renamed from: b */
    private int f103288b;

    /* renamed from: c */
    private int f103289c;

    /* renamed from: d */
    private int f103290d;

    /* renamed from: e */
    private final int f103291e;

    /* renamed from: f */
    private final int f103292f;

    static {
        Covode.recordClassIndex(52604);
    }

    public PageStepper(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    public final int getDarkColor() {
        return this.f103290d;
    }

    public final int getLightColor() {
        return this.f103289c;
    }

    public final int getLightStep() {
        return this.f103288b;
    }

    public final int getTotalStep() {
        return this.f103287a;
    }

    /* renamed from: a */
    private final void m87017a() {
        MethodCollector.m26663i(7474);
        removeAllViews();
        int i = this.f103287a;
        if (i > 0) {
            int i2 = 1;
            while (true) {
                View view = new View(getContext());
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, this.f103292f);
                layoutParams.weight = 1.0f;
                if (i2 != this.f103287a) {
                    layoutParams.rightMargin = this.f103291e;
                    int i3 = Build.VERSION.SDK_INT;
                    layoutParams.setMarginEnd(this.f103291e);
                }
                view.setLayoutParams(layoutParams);
                if (i2 <= this.f103288b) {
                    view.setBackgroundColor(this.f103289c);
                } else {
                    view.setBackgroundColor(this.f103290d);
                }
                addView(view);
                if (i2 == i) {
                    break;
                }
                i2++;
            }
        }
        MethodCollector.m26664o(7474);
    }

    public final void setDarkColor(int i) {
        this.f103290d = i;
    }

    public final void setLightColor(int i) {
        this.f103289c = i;
    }

    public final void setTotalStep(int i) {
        this.f103287a = i;
        m87017a();
    }

    public final void setLightStep(int i) {
        if (i <= 0) {
            this.f103288b = 0;
        } else {
            this.f103288b = i;
        }
        m87017a();
    }

    private /* synthetic */ PageStepper(Context context, AttributeSet attributeSet, byte b) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private PageStepper(Context context, AttributeSet attributeSet, char c) {
        super(context, attributeSet, 0);
        C89219l.m154721d(context, "");
        MethodCollector.m26663i(7640);
        this.f103287a = 3;
        this.f103288b = 1;
        this.f103289c = C0643b.m2378c(context, R.color.bh);
        this.f103290d = C0643b.m2378c(context, R.color.f);
        int b = (int) C13628n.m24520b(context, 2.0f);
        this.f103291e = b;
        this.f103292f = b;
        setOrientation(0);
        if (isInEditMode()) {
            this.f103289c = C0643b.m2378c(context, R.color.na);
            this.f103290d = C0643b.m2378c(context, R.color.j7);
            m87017a();
        }
        MethodCollector.m26664o(7640);
    }
}
