package com.p2082ss.android.ugc.aweme.p2231ab;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.ab.a */
public final class C31363a {
    static {
        Covode.recordClassIndex(38065);
    }

    /* renamed from: a */
    public static int m65572a(int i) {
        if (i == 20000) {
            return 0;
        }
        if (i == 20015) {
            return -2;
        }
        if (i == 22001 || i == 20007 || i == 20008) {
            return -5;
        }
        switch (i) {
            case 20003:
                return -4;
            case 20004:
            case 20005:
                return -2;
            default:
                switch (i) {
                    case 20011:
                    case 20012:
                        return -5;
                    case 20013:
                        return -2;
                    default:
                        return -1;
                }
        }
    }
}
