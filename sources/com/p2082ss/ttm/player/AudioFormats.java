package com.p2082ss.ttm.player;

import android.media.audiofx.AudioEffect;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.ttm.player.AudioFormats */
public class AudioFormats {

    /* renamed from: a */
    static final int[] f192521a = {4000, 8000, 11025, 16000, 22050, 32000, 37800, 44056, 44100, 47250, 48000, 50000, 50400, 88200, 96000, 176400, 192000, 352800, 2822400, 5644800};

    /* renamed from: b */
    private static boolean f192522b;

    /* renamed from: c */
    private static boolean f192523c;

    static {
        Covode.recordClassIndex(101383);
    }

    public static boolean isLicencedDolbyDevice() {
        if (f192522b) {
            return f192523c;
        }
        AudioEffect.Descriptor[] queryEffects = AudioEffect.queryEffects();
        int length = queryEffects.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            } else if (queryEffects[i].implementor.contains("Dolby Laboratories")) {
                f192523c = true;
                break;
            } else {
                i++;
            }
        }
        f192522b = true;
        return f192523c;
    }
}
