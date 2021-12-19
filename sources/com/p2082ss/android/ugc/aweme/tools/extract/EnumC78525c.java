package com.p2082ss.android.ugc.aweme.tools.extract;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.tools.extract.c */
public enum EnumC78525c {
    RECORD_VIDEO_SOUND(1),
    UPLOAD_VIDEO_SOUND(2),
    EDIT_RECORD_SOUND(4),
    VOLUME_NOT_MUTE(8),
    MUSIC(16),
    EDIT_AUDIO_EFFECT(32);
    

    /* renamed from: b */
    private final int f176468b;

    public final int getTag() {
        return this.f176468b;
    }

    static {
        Covode.recordClassIndex(91657);
    }

    private EnumC78525c(int i) {
        this.f176468b = i;
    }
}
