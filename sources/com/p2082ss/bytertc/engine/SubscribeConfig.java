package com.p2082ss.bytertc.engine;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.engine.SubscribeConfig */
public class SubscribeConfig {
    public boolean isScreen;
    public boolean subAudio;
    public boolean subVideo;
    public int videoIndex;

    static {
        Covode.recordClassIndex(100940);
    }

    public SubscribeConfig() {
    }

    public String toString() {
        return "SubscribeConfig{isScreen=" + this.isScreen + ", subVideo=" + this.subVideo + ", subAudio=" + this.subAudio + ", videoIndex=" + this.videoIndex + "}";
    }

    public SubscribeConfig(SubscribeConfig subscribeConfig) {
        if (subscribeConfig != null) {
            this.isScreen = subscribeConfig.isScreen;
            this.subVideo = subscribeConfig.subVideo;
            this.subAudio = subscribeConfig.subAudio;
            this.videoIndex = subscribeConfig.videoIndex;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SubscribeConfig subscribeConfig = (SubscribeConfig) obj;
            if (this.isScreen == subscribeConfig.isScreen && this.subVideo == subscribeConfig.subVideo && this.subAudio == subscribeConfig.subAudio && this.videoIndex == subscribeConfig.videoIndex) {
                return true;
            }
            return false;
        }
        return false;
    }

    private static SubscribeConfig create(boolean z, boolean z2, boolean z3, int i) {
        return new SubscribeConfig(z, z2, z3, i);
    }

    public SubscribeConfig(boolean z, boolean z2, boolean z3, int i) {
        this.isScreen = z;
        this.subVideo = z2;
        this.subAudio = z3;
        this.videoIndex = i;
    }
}
