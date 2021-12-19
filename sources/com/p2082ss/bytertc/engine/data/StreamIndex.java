package com.p2082ss.bytertc.engine.data;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.engine.data.StreamIndex */
public enum StreamIndex {
    STREAM_INDEX_MAIN(0),
    STREAM_INDEX_SCREEN(1);
    
    private int value;

    public final int value() {
        return this.value;
    }

    public final String toString() {
        if (this == STREAM_INDEX_MAIN) {
            return "kStreamIndexMain";
        }
        return "kStreamIndexScreen";
    }

    static {
        Covode.recordClassIndex(100988);
    }

    public static StreamIndex fromId(int i) {
        StreamIndex[] values = values();
        for (StreamIndex streamIndex : values) {
            if (streamIndex.value() == i) {
                return streamIndex;
            }
        }
        return null;
    }

    private StreamIndex(int i) {
        this.value = i;
    }
}
