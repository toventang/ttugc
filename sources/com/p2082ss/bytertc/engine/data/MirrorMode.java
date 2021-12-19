package com.p2082ss.bytertc.engine.data;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.engine.data.MirrorMode */
public enum MirrorMode {
    MIRROR_MODE_OFF(0),
    MIRROR_MODE_ON(1);
    
    private int value;

    public final int value() {
        return this.value;
    }

    public final String toString() {
        if (this == MIRROR_MODE_ON) {
            return "kMirrorModeOn";
        }
        return "kMirrorModeOff";
    }

    static {
        Covode.recordClassIndex(100979);
    }

    public static MirrorMode fromId(int i) {
        MirrorMode[] values = values();
        for (MirrorMode mirrorMode : values) {
            if (mirrorMode.value() == i) {
                return mirrorMode;
            }
        }
        return null;
    }

    private MirrorMode(int i) {
        this.value = i;
    }
}
