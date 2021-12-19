package com.p2082ss.android.ugc.aweme.p2730de;

import com.C1764a;
import com.bytedance.covode.number.Covode;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.de.r */
public final class C40983r {
    static {
        Covode.recordClassIndex(48835);
    }

    /* renamed from: a */
    public static String m82524a(int i) {
        int i2 = i / 1000;
        int i3 = i2 % 60;
        int i4 = i2 / 60;
        int i5 = i4 / 60;
        int i6 = i4 % 60;
        if (i5 == 0) {
            return C1764a.m5929a(Locale.getDefault(), "%02d:%02d", new Object[]{Integer.valueOf(i6), Integer.valueOf(i3)});
        }
        return C1764a.m5929a(Locale.getDefault(), "%02d:%02d:%02d", new Object[]{Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i3)});
    }
}
