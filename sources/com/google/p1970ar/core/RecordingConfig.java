package com.google.p1970ar.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.google.ar.core.RecordingConfig */
public class RecordingConfig {
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    static {
        Covode.recordClassIndex(32614);
    }

    protected RecordingConfig() {
    }

    private native void nativeAddExternalDataTrack(long j, long j2, long j3);

    private static native long nativeCreateRecordingConfig(long j);

    private static native void nativeDestroyRecordingConfig(long j, long j2);

    private native boolean nativeGetAutoStopOnPause(long j, long j2);

    private native String nativeGetMp4DatasetFilePath(long j, long j2);

    private native int nativeGetRecordingRotation(long j, long j2);

    private native void nativeSetAutoStopOnPause(long j, long j2, boolean z);

    private native void nativeSetMp4DatasetFilePath(long j, long j2, String str);

    private native void nativeSetRecordingRotation(long j, long j2, int i);

    /* access modifiers changed from: protected */
    public void finalize() {
        MethodCollector.m26663i(13680);
        long j = this.nativeHandle;
        if (j != 0) {
            nativeDestroyRecordingConfig(this.nativeSymbolTableHandle, j);
            this.nativeHandle = 0;
        }
        super.finalize();
        MethodCollector.m26664o(13680);
    }

    public boolean getAutoStopOnPause() {
        MethodCollector.m26663i(13684);
        boolean nativeGetAutoStopOnPause = nativeGetAutoStopOnPause(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.m26664o(13684);
        return nativeGetAutoStopOnPause;
    }

    public String getMp4DatasetFilePath() {
        MethodCollector.m26663i(13682);
        String nativeGetMp4DatasetFilePath = nativeGetMp4DatasetFilePath(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.m26664o(13682);
        return nativeGetMp4DatasetFilePath;
    }

    public int getRecordingRotation() {
        MethodCollector.m26663i(13686);
        int nativeGetRecordingRotation = nativeGetRecordingRotation(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.m26664o(13686);
        return nativeGetRecordingRotation;
    }

    public RecordingConfig(Session session2) {
        MethodCollector.m26663i(13679);
        this.session = session2;
        this.nativeHandle = nativeCreateRecordingConfig(session2.nativeWrapperHandle);
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
        MethodCollector.m26664o(13679);
    }

    public RecordingConfig addExternalDataTrack(ExternalDataTrack externalDataTrack) {
        MethodCollector.m26663i(13687);
        nativeAddExternalDataTrack(this.session.nativeWrapperHandle, this.nativeHandle, externalDataTrack.nativeHandle);
        MethodCollector.m26664o(13687);
        return this;
    }

    public RecordingConfig setAutoStopOnPause(boolean z) {
        MethodCollector.m26663i(13683);
        nativeSetAutoStopOnPause(this.session.nativeWrapperHandle, this.nativeHandle, z);
        MethodCollector.m26664o(13683);
        return this;
    }

    public RecordingConfig setMp4DatasetFilePath(String str) {
        MethodCollector.m26663i(13681);
        nativeSetMp4DatasetFilePath(this.session.nativeWrapperHandle, this.nativeHandle, str);
        MethodCollector.m26664o(13681);
        return this;
    }

    public RecordingConfig setRecordingRotation(int i) {
        MethodCollector.m26663i(13685);
        nativeSetRecordingRotation(this.session.nativeWrapperHandle, this.nativeHandle, i);
        MethodCollector.m26664o(13685);
        return this;
    }
}
