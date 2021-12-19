package com.p2082ss.android.p2092ad.splash.core.video;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ad.splash.core.video.d */
public class C29576d extends SurfaceView {
    static {
        Covode.recordClassIndex(35971);
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        if (i == 0) {
            super.onWindowVisibilityChanged(i);
        }
    }

    public C29576d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(10252);
        MethodCollector.m26664o(10252);
    }
}
