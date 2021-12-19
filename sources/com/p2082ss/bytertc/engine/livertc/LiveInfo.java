package com.p2082ss.bytertc.engine.livertc;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.engine.livertc.LiveInfo */
public class LiveInfo {
    public int mixType;

    static {
        Covode.recordClassIndex(101079);
    }

    public int getMixType() {
        return this.mixType;
    }

    /* renamed from: com.ss.bytertc.engine.livertc.LiveInfo$Builder */
    public static class Builder {
        public int mixType;

        static {
            Covode.recordClassIndex(101080);
        }

        /* access modifiers changed from: package-private */
        public LiveInfo build() {
            return new LiveInfo(this);
        }

        public Builder setMixType(int i) {
            this.mixType = i;
            return this;
        }
    }

    public String toString() {
        return "LiveInfo{mixType=" + this.mixType + '}';
    }

    public void setMixType(int i) {
        this.mixType = i;
    }

    /* renamed from: com.ss.bytertc.engine.livertc.LiveInfo$LiveInfoBuilder */
    public class LiveInfoBuilder {
        public int mixType;

        static {
            Covode.recordClassIndex(101081);
        }

        public LiveInfoBuilder() {
        }
    }

    public LiveInfo(int i) {
        this.mixType = i;
    }

    public LiveInfo(Builder builder) {
        this.mixType = builder.mixType;
    }
}
