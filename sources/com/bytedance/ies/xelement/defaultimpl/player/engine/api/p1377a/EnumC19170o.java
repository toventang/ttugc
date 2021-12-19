package com.bytedance.ies.xelement.defaultimpl.player.engine.api.p1377a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.bytedance.ies.xelement.defaultimpl.player.engine.api.a.o */
public enum EnumC19170o {
    PLAYBACK_STATE_START,
    PLAYBACK_STATE_PLAYING,
    PLAYBACK_STATE_PAUSED,
    PLAYBACK_STATE_STOPPED,
    PLAYBACK_STATE_ERROR;

    static {
        Covode.recordClassIndex(21933);
    }

    public final boolean isPlayingState() {
        int i = C19171p.f45322a[ordinal()];
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }
}
