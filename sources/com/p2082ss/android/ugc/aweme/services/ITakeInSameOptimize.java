package com.p2082ss.android.ugc.aweme.services;

import android.content.Context;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.services.ITakeInSameOptimize */
public interface ITakeInSameOptimize {
    static {
        Covode.recordClassIndex(79645);
    }

    boolean enableCombineMusicAndEffectDownload();

    boolean enableTakeInSameRecordOptimize(Context context);
}
