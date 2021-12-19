package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown;

import com.bytedance.covode.number.Covode;
import java.util.GregorianCalendar;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.livecountdown.c */
public final class C71168c {
    static {
        Covode.recordClassIndex(83674);
    }

    /* renamed from: a */
    public static final long m125749a(long j) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTimeInMillis(j);
        return new GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5), gregorianCalendar.get(11), gregorianCalendar.get(12), 0).getTimeInMillis();
    }

    /* renamed from: a */
    public static final C71167b m125750a(long j, long j2) {
        float f = ((float) (j - j2)) / 1000.0f;
        if (f <= 0.0f) {
            return new C71167b("0", "0", "0", "0", j);
        }
        int i = (int) (f / 86400.0f);
        float f2 = (float) ((int) (f - (((((float) i) * 24.0f) * 60.0f) * 60.0f)));
        int i2 = (int) (f2 / 3600.0f);
        float f3 = (float) ((int) (f2 - ((((float) i2) * 60.0f) * 60.0f)));
        int i3 = (int) (f3 / 60.0f);
        return new C71167b(String.valueOf(i), String.valueOf(i2), String.valueOf(i3), String.valueOf((int) (f3 - (((float) i3) * 60.0f))), j);
    }
}
