package com.p2082ss.bytertc.engine.game;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.bytertc.engine.game.GameRTCEngineConfig */
public class GameRTCEngineConfig {
    public String appId;
    public AudioPerfProfile audioPerfProfile;
    public String deviceId;
    public RTCEnv rtcEnv;

    static {
        Covode.recordClassIndex(101001);
    }

    /* renamed from: com.ss.bytertc.engine.game.GameRTCEngineConfig$AudioPerfProfile */
    public enum AudioPerfProfile {
        AUDIO_PERF_PROFILE_AUTO(0),
        AUDIO_PERF_PROFILE_LOW(1),
        AUDIO_PERF_PROFILE_MID(2),
        AUDIO_PERF_PROFILE_HIGH(3);
        
        private int value;

        public final int value() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(101002);
        }

        private AudioPerfProfile(int i) {
            this.value = i;
        }
    }

    /* renamed from: com.ss.bytertc.engine.game.GameRTCEngineConfig$RTCEnv */
    public enum RTCEnv {
        PRODUCT(0),
        BOE(1),
        TEST(2);
        
        private int value;

        public final int value() {
            return this.value;
        }

        static {
            Covode.recordClassIndex(101003);
        }

        private RTCEnv(int i) {
            this.value = i;
        }
    }
}
