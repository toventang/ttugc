package com.p2082ss.bytertc.engine.data;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.engine.data.MediaInputType */
public enum MediaInputType {
    MEDIA_INPUT_TYPE_EXTERNAL(0),
    MEDIA_INPUT_TYPE_INTERNAL(1);
    
    private int value;

    public final int value() {
        return this.value;
    }

    static {
        Covode.recordClassIndex(100978);
    }

    public static MediaInputType fromId(int i) {
        MediaInputType[] values = values();
        for (MediaInputType mediaInputType : values) {
            if (mediaInputType.value() == i) {
                return mediaInputType;
            }
        }
        return null;
    }

    private MediaInputType(int i) {
        this.value = i;
    }
}
