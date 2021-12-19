package com.p2082ss.bytertc.engine.data;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.engine.data.AudioPerformanceProfile */
public enum AudioPerformanceProfile {
    AUDIO_PERFORMANCE_PROFILE_AUTO(0),
    AUDIO_PERFORMANCE_PROFILE_LOW(1),
    AUDIO_PERFORMANCE_PROFILE_MID(2),
    AUDIO_PERFORMANCE_PROFILE_HIGH(3);
    
    private int value;

    public final int value() {
        return this.value;
    }

    /* renamed from: com.ss.bytertc.engine.data.AudioPerformanceProfile$1 */
    static /* synthetic */ class C860871 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AudioPerformanceProfile;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        static {
            /*
                r0 = 100967(0x18a67, float:1.41485E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.bytertc.engine.data.AudioPerformanceProfile[] r0 = com.p2082ss.bytertc.engine.data.AudioPerformanceProfile.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.p2082ss.bytertc.engine.data.AudioPerformanceProfile.C860871.$SwitchMap$com$ss$bytertc$engine$data$AudioPerformanceProfile = r2
                com.ss.bytertc.engine.data.AudioPerformanceProfile r0 = com.p2082ss.bytertc.engine.data.AudioPerformanceProfile.AUDIO_PERFORMANCE_PROFILE_AUTO     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.p2082ss.bytertc.engine.data.AudioPerformanceProfile.C860871.$SwitchMap$com$ss$bytertc$engine$data$AudioPerformanceProfile     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.bytertc.engine.data.AudioPerformanceProfile r0 = com.p2082ss.bytertc.engine.data.AudioPerformanceProfile.AUDIO_PERFORMANCE_PROFILE_LOW     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.p2082ss.bytertc.engine.data.AudioPerformanceProfile.C860871.$SwitchMap$com$ss$bytertc$engine$data$AudioPerformanceProfile     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.bytertc.engine.data.AudioPerformanceProfile r0 = com.p2082ss.bytertc.engine.data.AudioPerformanceProfile.AUDIO_PERFORMANCE_PROFILE_MID     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.p2082ss.bytertc.engine.data.AudioPerformanceProfile.C860871.$SwitchMap$com$ss$bytertc$engine$data$AudioPerformanceProfile     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.ss.bytertc.engine.data.AudioPerformanceProfile r0 = com.p2082ss.bytertc.engine.data.AudioPerformanceProfile.AUDIO_PERFORMANCE_PROFILE_HIGH     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.bytertc.engine.data.AudioPerformanceProfile.C860871.<clinit>():void");
        }
    }

    static {
        Covode.recordClassIndex(100966);
    }

    public final String toString() {
        int i = C860871.$SwitchMap$com$ss$bytertc$engine$data$AudioPerformanceProfile[ordinal()];
        if (i == 1) {
            return "kAudioPerformanceProfileAuto";
        }
        if (i == 2) {
            return "kAudioPerformanceProfileLow";
        }
        if (i == 3) {
            return "kAudioPerformanceProfileMid";
        }
        if (i != 4) {
            return "";
        }
        return "kAudioPerformanceProfileHigh";
    }

    public static AudioPerformanceProfile fromId(int i) {
        AudioPerformanceProfile[] values = values();
        for (AudioPerformanceProfile audioPerformanceProfile : values) {
            if (audioPerformanceProfile.value() == i) {
                return audioPerformanceProfile;
            }
        }
        return null;
    }

    private AudioPerformanceProfile(int i) {
        this.value = i;
    }
}
