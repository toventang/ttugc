package com.p2082ss.bytertc.engine.data;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.engine.data.AudioSampleRate */
public enum AudioSampleRate {
    AUDIO_SAMPLE_RATE_8000(8000),
    AUDIO_SAMPLE_RATE_16000(16000),
    AUDIO_SAMPLE_RATE_32000(32000),
    AUDIO_SAMPLE_RATE_44100(44100),
    AUDIO_SAMPLE_RATE_48000(48000);
    
    private int value;

    public final int value() {
        return this.value;
    }

    public final String toString() {
        int i = C860891.$SwitchMap$com$ss$bytertc$engine$data$AudioSampleRate[ordinal()];
        if (i == 1) {
            return "kAudioSampleRate8000";
        }
        if (i == 2) {
            return "kAudioSampleRate16000";
        }
        if (i == 3) {
            return "kAudioSampleRate32000";
        }
        if (i == 4) {
            return "kAudioSampleRate44100";
        }
        if (i != 5) {
            return "";
        }
        return "kAudioSampleRate48000";
    }

    /* renamed from: com.ss.bytertc.engine.data.AudioSampleRate$1 */
    static /* synthetic */ class C860891 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AudioSampleRate;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|(3:9|10|12)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0039 */
        static {
            /*
                r0 = 100971(0x18a6b, float:1.4149E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.bytertc.engine.data.AudioSampleRate[] r0 = com.p2082ss.bytertc.engine.data.AudioSampleRate.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.p2082ss.bytertc.engine.data.AudioSampleRate.C860891.$SwitchMap$com$ss$bytertc$engine$data$AudioSampleRate = r2
                com.ss.bytertc.engine.data.AudioSampleRate r0 = com.p2082ss.bytertc.engine.data.AudioSampleRate.AUDIO_SAMPLE_RATE_8000     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.p2082ss.bytertc.engine.data.AudioSampleRate.C860891.$SwitchMap$com$ss$bytertc$engine$data$AudioSampleRate     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.bytertc.engine.data.AudioSampleRate r0 = com.p2082ss.bytertc.engine.data.AudioSampleRate.AUDIO_SAMPLE_RATE_16000     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.p2082ss.bytertc.engine.data.AudioSampleRate.C860891.$SwitchMap$com$ss$bytertc$engine$data$AudioSampleRate     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.bytertc.engine.data.AudioSampleRate r0 = com.p2082ss.bytertc.engine.data.AudioSampleRate.AUDIO_SAMPLE_RATE_32000     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.p2082ss.bytertc.engine.data.AudioSampleRate.C860891.$SwitchMap$com$ss$bytertc$engine$data$AudioSampleRate     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.ss.bytertc.engine.data.AudioSampleRate r0 = com.p2082ss.bytertc.engine.data.AudioSampleRate.AUDIO_SAMPLE_RATE_44100     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r2 = com.p2082ss.bytertc.engine.data.AudioSampleRate.C860891.$SwitchMap$com$ss$bytertc$engine$data$AudioSampleRate     // Catch:{ NoSuchFieldError -> 0x0044 }
                com.ss.bytertc.engine.data.AudioSampleRate r0 = com.p2082ss.bytertc.engine.data.AudioSampleRate.AUDIO_SAMPLE_RATE_48000     // Catch:{ NoSuchFieldError -> 0x0044 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0044 }
                r0 = 5
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0044 }
            L_0x0044:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.bytertc.engine.data.AudioSampleRate.C860891.<clinit>():void");
        }
    }

    static {
        Covode.recordClassIndex(100970);
    }

    public static AudioSampleRate fromId(int i) {
        AudioSampleRate[] values = values();
        for (AudioSampleRate audioSampleRate : values) {
            if (audioSampleRate.value() == i) {
                return audioSampleRate;
            }
        }
        return null;
    }

    private AudioSampleRate(int i) {
        this.value = i;
    }
}
