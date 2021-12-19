package com.p2082ss.android.ugc.aweme.music.p3476k;

import android.media.MediaPlayer;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.ss.android.ugc.aweme.music.k.c */
public class C60825c {

    /* renamed from: a */
    public static volatile MediaPlayer f138233a;

    static {
        Covode.recordClassIndex(71382);
    }

    /* renamed from: a */
    public static MediaPlayer m110422a() {
        MethodCollector.m26663i(3204);
        if (f138233a == null) {
            synchronized (C60825c.class) {
                try {
                    if (f138233a == null) {
                        f138233a = new MediaPlayer();
                    }
                } catch (Throwable th) {
                    MethodCollector.m26664o(3204);
                    throw th;
                }
            }
        }
        MediaPlayer mediaPlayer = f138233a;
        MethodCollector.m26664o(3204);
        return mediaPlayer;
    }
}
