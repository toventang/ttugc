package com.p2082ss.android.ugc.aweme.shortvideo.record;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.property.C65418da;
import com.p2082ss.android.ugc.aweme.property.C65419db;
import com.p2082ss.android.vesdk.VEVideoEncodeSettings;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.record.au */
public final class C72775au {
    static {
        Covode.recordClassIndex(85461);
    }

    /* renamed from: b */
    public static VEVideoEncodeSettings.ENCODE_PROFILE m128327b() {
        int a = m128326a();
        if (a == 1) {
            return VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_BASELINE;
        }
        if (a == 2) {
            return VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_MAIN;
        }
        if (a != 8) {
            return VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_UNKNOWN;
        }
        return VEVideoEncodeSettings.ENCODE_PROFILE.ENCODE_PROFILE_HIGH;
    }

    /* renamed from: a */
    public static int m128326a() {
        int i;
        if (C65419db.m117138a() != 1) {
            i = C65419db.m117138a();
        } else if (C65418da.m117137a() != 1) {
            i = C65418da.m117137a();
        } else {
            i = 1;
            return i;
        }
        if (!(i == 1 || i == 2 || i == 8)) {
            return 1;
        }
        return i;
    }
}
