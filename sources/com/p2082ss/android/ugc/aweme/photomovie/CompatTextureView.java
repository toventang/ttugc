package com.p2082ss.android.ugc.aweme.photomovie;

import android.content.Context;
import android.util.AttributeSet;
import android.view.TextureView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.android.ugc.aweme.p2730de.C40970e;

/* renamed from: com.ss.android.ugc.aweme.photomovie.CompatTextureView */
public class CompatTextureView extends TextureView {
    static {
        Covode.recordClassIndex(73720);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
        } catch (Exception e) {
            C40970e.m82487a((Throwable) e);
        }
    }

    public CompatTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        MethodCollector.m26663i(6466);
        MethodCollector.m26664o(6466);
    }
}
