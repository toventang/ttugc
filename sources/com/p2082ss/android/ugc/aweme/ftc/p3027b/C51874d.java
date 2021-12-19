package com.p2082ss.android.ugc.aweme.ftc.p3027b;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.aweme.shortvideo.EnumC69901bw;

/* renamed from: com.ss.android.ugc.aweme.ftc.b.d */
public final class C51874d {
    static {
        Covode.recordClassIndex(61243);
    }

    /* renamed from: b */
    public static EnumC69901bw m96562b(long j, long j2) {
        return m96561a(j, j2);
    }

    /* renamed from: a */
    public static EnumC69901bw m96561a(long j, long j2) {
        if (j2 == 0) {
            return EnumC69901bw.NONE;
        }
        long min = Math.min(j, j2);
        if (min != j2 || min >= j) {
            return EnumC69901bw.NONE;
        }
        return EnumC69901bw.MUSIC;
    }
}
