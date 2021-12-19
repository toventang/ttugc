package com.p084a.p085a;

import android.content.Context;
import android.view.C0174a;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p084a.p088b.AbstractC1876e;
import com.p2082ss.android.ugc.aweme.feed.p2970ui.seekbar.MutableSeekBar;
import com.p2082ss.android.ugc.trill.R;

/* renamed from: com.a.a.bh */
public final class C1801bh implements AbstractC1876e {
    static {
        Covode.recordClassIndex(1971);
    }

    @Override // com.p084a.p088b.AbstractC1876e
    /* renamed from: a */
    public final View mo5574a(Context context, ViewGroup viewGroup, boolean z) {
        MethodCollector.m26663i(65);
        context.getResources();
        FrameLayout frameLayout = new FrameLayout(context);
        ViewGroup.MarginLayoutParams a = C0174a.m576a(viewGroup, -1, -1);
        MutableSeekBar mutableSeekBar = new MutableSeekBar(context);
        mutableSeekBar.setId(R.id.dtt);
        mutableSeekBar.setMax(10000);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        C0174a.m578a(mutableSeekBar);
        if (mutableSeekBar.getParent() == null) {
            frameLayout.addView(mutableSeekBar, layoutParams);
        }
        C0174a.m578a(frameLayout);
        frameLayout.setLayoutParams(a);
        if (viewGroup != null && z) {
            viewGroup.addView(frameLayout);
        }
        MethodCollector.m26664o(65);
        return frameLayout;
    }
}
