package com.p2082ss.android.ugc.aweme.record;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.ShortVideoContext;

/* renamed from: com.ss.android.ugc.aweme.record.e */
public interface AbstractC66811e {
    static {
        Covode.recordClassIndex(78383);
    }

    long getMaxShootingDuration();

    long getMaxShootingDuration(boolean z, ShortVideoContext shortVideoContext);

    long resolveMaxDurationFor3MinWithMusic(ShortVideoContext shortVideoContext, long j);
}
