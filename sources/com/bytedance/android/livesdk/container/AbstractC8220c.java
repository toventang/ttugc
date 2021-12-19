package com.bytedance.android.livesdk.container;

import android.widget.FrameLayout;
import com.bytedance.android.live.p176b.AbstractC2932i;
import com.bytedance.android.livesdk.container.config.base.HybridConfig;
import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.container.c */
public interface AbstractC8220c {
    static {
        Covode.recordClassIndex(9045);
    }

    /* renamed from: a */
    void mo14480a();

    /* renamed from: b */
    void mo14481b();

    /* renamed from: c */
    void mo14482c();

    FrameLayout getFrameLayout();

    void setConfig(HybridConfig hybridConfig);

    void setContainerId(String str);

    void setHybridLoadListener(AbstractC2932i.AbstractC2935c cVar);
}
