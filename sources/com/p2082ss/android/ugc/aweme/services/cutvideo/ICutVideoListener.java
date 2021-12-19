package com.p2082ss.android.ugc.aweme.services.cutvideo;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.services.cutvideo.ICutVideoListener */
public interface ICutVideoListener {
    static {
        Covode.recordClassIndex(79755);
    }

    void onCompileDone();

    void onCompileError(int i, int i2, float f, String str);

    void onCompileProgress(float f);

    void onStart();
}
