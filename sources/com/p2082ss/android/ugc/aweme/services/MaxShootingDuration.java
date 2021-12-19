package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.property.C65391cd;
import com.p2082ss.android.ugc.aweme.shortvideo.C70629db;

/* renamed from: com.ss.android.ugc.aweme.services.MaxShootingDuration */
public final class MaxShootingDuration {
    public static final MaxShootingDuration INSTANCE = new MaxShootingDuration();

    private MaxShootingDuration() {
    }

    static {
        Covode.recordClassIndex(79693);
    }

    public final long getLength() {
        if (C70629db.m124815a() != 0) {
            return 180000;
        }
        return C65391cd.m117088a();
    }
}
