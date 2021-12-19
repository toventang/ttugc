package com.p2082ss.android.ugc.aweme.services.edit;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.services.edit.ReplaceMusicNetWorkCallback */
public interface ReplaceMusicNetWorkCallback {
    static {
        Covode.recordClassIndex(79771);
    }

    void onFail(int i, ReplaceMusicRequest replaceMusicRequest);

    void onSuccess();
}
