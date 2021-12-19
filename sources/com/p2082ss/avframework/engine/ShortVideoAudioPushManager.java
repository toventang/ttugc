package com.p2082ss.avframework.engine;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p2082ss.avframework.engine.AudioDeviceModule;
import com.p2082ss.avframework.utils.TEBundle;

/* renamed from: com.ss.avframework.engine.ShortVideoAudioPushManager */
public class ShortVideoAudioPushManager extends NativeObject {
    private static ShortVideoAudioPushManager mSingleInstance;

    static {
        Covode.recordClassIndex(99980);
    }

    private native void nativeCreate();

    private native long nativeGetPlayerWrapper(AudioDeviceModule.AudioRenderSink audioRenderSink, int i, int i2, boolean z);

    private native boolean nativeGetReportStats(AudioDeviceModule.AudioRenderSink audioRenderSink, long j, TEBundle tEBundle);

    private native void nativePause();

    private native void nativeResume();

    private ShortVideoAudioPushManager() {
        MethodCollector.m26663i(1415);
        nativeCreate();
        MethodCollector.m26664o(1415);
    }

    public static void dispose() {
        ShortVideoAudioPushManager shortVideoAudioPushManager = mSingleInstance;
        if (shortVideoAudioPushManager != null) {
            shortVideoAudioPushManager.release();
            mSingleInstance = null;
        }
    }

    public static void pause() {
        MethodCollector.m26663i(1551);
        ShortVideoAudioPushManager shortVideoAudioPushManager = mSingleInstance;
        if (shortVideoAudioPushManager != null) {
            shortVideoAudioPushManager.nativePause();
        }
        MethodCollector.m26664o(1551);
    }

    public static void resume() {
        MethodCollector.m26663i(1556);
        ShortVideoAudioPushManager shortVideoAudioPushManager = mSingleInstance;
        if (shortVideoAudioPushManager != null) {
            shortVideoAudioPushManager.nativeResume();
        }
        MethodCollector.m26664o(1556);
    }

    public static long getAudioLongAddress(AudioDeviceModule.AudioRenderSink audioRenderSink, int i, int i2) {
        return getAudioLongAddress(audioRenderSink, i, i2, false);
    }

    public static boolean getReportStats(AudioDeviceModule.AudioRenderSink audioRenderSink, long j, TEBundle tEBundle) {
        MethodCollector.m26663i(1559);
        ShortVideoAudioPushManager shortVideoAudioPushManager = mSingleInstance;
        if (shortVideoAudioPushManager != null) {
            boolean nativeGetReportStats = shortVideoAudioPushManager.nativeGetReportStats(audioRenderSink, j, tEBundle);
            MethodCollector.m26664o(1559);
            return nativeGetReportStats;
        }
        MethodCollector.m26664o(1559);
        return false;
    }

    public static long getAudioLongAddress(AudioDeviceModule.AudioRenderSink audioRenderSink, int i, int i2, boolean z) {
        MethodCollector.m26663i(1548);
        if (mSingleInstance == null) {
            mSingleInstance = new ShortVideoAudioPushManager();
        }
        long nativeGetPlayerWrapper = mSingleInstance.nativeGetPlayerWrapper(audioRenderSink, i, i2, z);
        MethodCollector.m26664o(1548);
        return nativeGetPlayerWrapper;
    }
}
