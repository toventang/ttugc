package com.mammon.audiosdk;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.librarian.Librarian;
import com.p2082ss.android.ugc.aweme.lancet.C58032m;

public class AutoVolume {
    private static native float Native_GetAutoVolume(float[] fArr);

    static {
        Covode.recordClassIndex(35061);
        long uptimeMillis = SystemClock.uptimeMillis();
        Librarian.m38964a("audioeffect", false, (Context) null);
        C58032m.m104852a(uptimeMillis, "audioeffect");
    }
}
