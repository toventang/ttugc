package com.p2082ss.android.ugc.aweme.account.common.widget.datepicker;

import android.media.AudioManager;
import android.media.SoundPool;
import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.account.common.widget.datepicker.a */
public final class C31603a {

    /* renamed from: a */
    private SoundPool f75625a;

    /* renamed from: b */
    private AudioManager f75626b;

    /* renamed from: c */
    private float f75627c;

    /* renamed from: d */
    private int f75628d;

    static {
        Covode.recordClassIndex(38332);
    }

    /* renamed from: a */
    public final void mo57638a() {
        float streamVolume = (float) this.f75626b.getStreamVolume(1);
        this.f75627c = streamVolume;
        int i = this.f75628d;
        if (i > 0) {
            this.f75625a.play(i, streamVolume, streamVolume, 0, 0, 1.0f);
        } else {
            this.f75626b.playSoundEffect(0, streamVolume);
        }
    }
}
