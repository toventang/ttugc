package com.p2082ss.android.p2092ad.splash.core.video2;

import android.content.Context;
import android.view.Surface;
import android.view.ViewGroup;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ad.splash.core.video2.h */
public interface AbstractC29622h {
    static {
        Covode.recordClassIndex(36018);
    }

    /* renamed from: a */
    void mo51845a();

    Context getApplicationContext();

    Surface getSurface();

    void setSurfaceLayoutParams(ViewGroup.LayoutParams layoutParams);

    void setSurfaceViewVisibility(int i);

    void setVideoViewCallback(AbstractC29623i iVar);
}
