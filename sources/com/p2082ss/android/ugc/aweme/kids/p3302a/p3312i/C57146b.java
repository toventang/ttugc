package com.p2082ss.android.ugc.aweme.kids.p3302a.p3312i;

import android.media.MediaPlayer;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.aweme.kids.a.i.b */
public class C57146b {

    /* renamed from: a */
    public static volatile MediaPlayer f130106a;

    static {
        Covode.recordClassIndex(67040);
    }

    /* renamed from: a */
    public static MediaPlayer m103541a() {
        MethodCollector.m26663i(11180);
        if (f130106a == null) {
            synchronized (C57146b.class) {
                try {
                    if (f130106a == null) {
                        f130106a = new MediaPlayer();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(11180);
                    throw th;
                }
            }
        }
        MediaPlayer mediaPlayer = f130106a;
        MethodCollector.m26664o(11180);
        return mediaPlayer;
    }
}
