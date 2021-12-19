package com.p2082ss.android.ugc.tools.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.C1764a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.tools.view.widget.DoubleColorBallAnimationLayout */
public class DoubleColorBallAnimationLayout extends FrameLayout {

    /* renamed from: a */
    private View f190119a;

    static {
        Covode.recordClassIndex(99016);
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.f190119a;
        if (view != null) {
            view.setVisibility(i);
        }
    }

    public DoubleColorBallAnimationLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DoubleColorBallAnimationLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        MethodCollector.m26663i(10258);
        this.f190119a = C1764a.m5927a(LayoutInflater.from(context), R.layout.b3t, this, true).findViewById(R.id.anz);
        MethodCollector.m26664o(10258);
    }
}
