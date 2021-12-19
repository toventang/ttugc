package com.p2082ss.android.ugc.aweme.services;

import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.services.IShortVideoConfig */
public interface IShortVideoConfig {

    /* renamed from: com.ss.android.ugc.aweme.services.IShortVideoConfig$MusicWaveDataListener */
    public interface MusicWaveDataListener {
        static {
            Covode.recordClassIndex(79643);
        }
    }

    static {
        Covode.recordClassIndex(79642);
    }

    String cutsameSdkVersion();

    void enableHookLibrary(boolean z);

    List<String> getBOEBypassHostList();

    List<String> getBOEBypassPathList();

    boolean getUsingOnline();

    boolean isHookLibrary();

    boolean isRecording();

    long maxDuetVideoTime();

    long maxRecordingTime();

    long maxStitchVideoTime();
}
