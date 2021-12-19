package com.p2082ss.bytertc.engine.data;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.engine.data.AudioPlaybackDevice */
public enum AudioPlaybackDevice {
    AUDIO_PLAYBACK_DEVICE_HEADSET(1),
    AUDIO_PLAYBACK_DEVICE_EARPIECE(2),
    AUDIO_PLAYBACK_DEVICE_SPEAKERPHONE(3),
    AUDIO_PLAYBACK_DEVICE_HEADSET_BLUETOOTH(4);
    
    private int value = 1;

    public final int value() {
        return this.value;
    }

    /* renamed from: com.ss.bytertc.engine.data.AudioPlaybackDevice$1 */
    static /* synthetic */ class C860881 {
        static final /* synthetic */ int[] $SwitchMap$com$ss$bytertc$engine$data$AudioPlaybackDevice;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0018 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0023 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002e */
        static {
            /*
                r0 = 100969(0x18a69, float:1.41488E-40)
                com.bytedance.covode.number.Covode.recordClassIndex(r0)
                com.ss.bytertc.engine.data.AudioPlaybackDevice[] r0 = com.p2082ss.bytertc.engine.data.AudioPlaybackDevice.values()
                int r0 = r0.length
                int[] r2 = new int[r0]
                com.p2082ss.bytertc.engine.data.AudioPlaybackDevice.C860881.$SwitchMap$com$ss$bytertc$engine$data$AudioPlaybackDevice = r2
                com.ss.bytertc.engine.data.AudioPlaybackDevice r0 = com.p2082ss.bytertc.engine.data.AudioPlaybackDevice.AUDIO_PLAYBACK_DEVICE_SPEAKERPHONE     // Catch:{ NoSuchFieldError -> 0x0018 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0018 }
                r0 = 1
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                int[] r2 = com.p2082ss.bytertc.engine.data.AudioPlaybackDevice.C860881.$SwitchMap$com$ss$bytertc$engine$data$AudioPlaybackDevice     // Catch:{ NoSuchFieldError -> 0x0023 }
                com.ss.bytertc.engine.data.AudioPlaybackDevice r0 = com.p2082ss.bytertc.engine.data.AudioPlaybackDevice.AUDIO_PLAYBACK_DEVICE_EARPIECE     // Catch:{ NoSuchFieldError -> 0x0023 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0023 }
                r0 = 2
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0023 }
            L_0x0023:
                int[] r2 = com.p2082ss.bytertc.engine.data.AudioPlaybackDevice.C860881.$SwitchMap$com$ss$bytertc$engine$data$AudioPlaybackDevice     // Catch:{ NoSuchFieldError -> 0x002e }
                com.ss.bytertc.engine.data.AudioPlaybackDevice r0 = com.p2082ss.bytertc.engine.data.AudioPlaybackDevice.AUDIO_PLAYBACK_DEVICE_HEADSET     // Catch:{ NoSuchFieldError -> 0x002e }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r0 = 3
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.p2082ss.bytertc.engine.data.AudioPlaybackDevice.C860881.$SwitchMap$com$ss$bytertc$engine$data$AudioPlaybackDevice     // Catch:{ NoSuchFieldError -> 0x0039 }
                com.ss.bytertc.engine.data.AudioPlaybackDevice r0 = com.p2082ss.bytertc.engine.data.AudioPlaybackDevice.AUDIO_PLAYBACK_DEVICE_HEADSET_BLUETOOTH     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r1 = r0.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r0 = 4
                r2[r1] = r0     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p2082ss.bytertc.engine.data.AudioPlaybackDevice.C860881.<clinit>():void");
        }
    }

    static {
        Covode.recordClassIndex(100968);
    }

    public final String toString() {
        int i = C860881.$SwitchMap$com$ss$bytertc$engine$data$AudioPlaybackDevice[ordinal()];
        if (i == 1) {
            return "kAudioPlaybackDeviceSpeakerphone";
        }
        if (i == 2) {
            return "kAudioPlaybackDeviceEarpiece";
        }
        if (i == 3) {
            return "kAudioPlaybackDeviceHeadset";
        }
        if (i != 4) {
            return "";
        }
        return "kAudioPlaybackDeviceHeadsetBluetooth";
    }

    public static AudioPlaybackDevice fromId(int i) {
        AudioPlaybackDevice[] values = values();
        for (AudioPlaybackDevice audioPlaybackDevice : values) {
            if (audioPlaybackDevice.value() == i) {
                return audioPlaybackDevice;
            }
        }
        return null;
    }

    private AudioPlaybackDevice(int i) {
        this.value = i;
    }
}
