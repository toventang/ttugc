package com.bytedance.android.live.broadcast.api.blockword;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;
import com.bytedance.android.live.core.p218f.C3966y;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class BlockWordMaxHeightScrollView extends ScrollView {
    static {
        Covode.recordClassIndex(3502);
    }

    public BlockWordMaxHeightScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(6028);
        MethodCollector.m26664o(6028);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        MethodCollector.m26663i(6030);
        if (C3042b.f8881a) {
            i2 = View.MeasureSpec.makeMeasureSpec(C3966y.m9653a(148.0f), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        MethodCollector.m26664o(6030);
    }
}
