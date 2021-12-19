package com.bytedance.android.livesdk.model;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.android.livesdk.model.ae */
public final class C9518ae {
    static {
        Covode.recordClassIndex(11057);
    }

    /* renamed from: a */
    public static final boolean m17826a(Hashtag hashtag) {
        String str;
        Long l;
        if (hashtag == null || (str = hashtag.title) == null || str.length() == 0 || (((l = hashtag.f23083id) != null && l.longValue() == 0) || hashtag.f23083id == null)) {
            return false;
        }
        return true;
    }
}
