package com.google.p1970ar.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.p1970ar.core.exceptions.FatalException;

/* renamed from: com.google.ar.core.Anchor */
public class Anchor {
    long nativeHandle;
    final long nativeSymbolTableHandle;
    private final Session session;

    static {
        Covode.recordClassIndex(32557);
    }

    protected Anchor() {
    }

    private native void nativeDetach(long j, long j2);

    private native String nativeGetCloudAnchorId(long j, long j2);

    private native int nativeGetCloudAnchorState(long j, long j2);

    private native int nativeGetCloudLocalizationState(long j, long j2);

    private native Pose nativeGetPose(long j, long j2);

    private native int nativeGetTrackingState(long j, long j2);

    private static native void nativeReleaseAnchor(long j, long j2);

    public int hashCode() {
        return Long.valueOf(this.nativeHandle).hashCode();
    }

    public void detach() {
        MethodCollector.m26663i(13624);
        nativeDetach(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.m26664o(13624);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        MethodCollector.m26663i(13502);
        long j = this.nativeHandle;
        if (j != 0) {
            nativeReleaseAnchor(this.nativeSymbolTableHandle, j);
        }
        super.finalize();
        MethodCollector.m26664o(13502);
    }

    public String getCloudAnchorId() {
        MethodCollector.m26663i(13566);
        String nativeGetCloudAnchorId = nativeGetCloudAnchorId(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.m26664o(13566);
        return nativeGetCloudAnchorId;
    }

    public CloudAnchorState getCloudAnchorState() {
        MethodCollector.m26663i(13567);
        CloudAnchorState forNumber = CloudAnchorState.forNumber(nativeGetCloudAnchorState(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.m26664o(13567);
        return forNumber;
    }

    public CloudLocalizationState getCloudLocalizationState() {
        MethodCollector.m26663i(13623);
        CloudLocalizationState forNumber = CloudLocalizationState.forNumber(nativeGetCloudLocalizationState(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.m26664o(13623);
        return forNumber;
    }

    public Pose getPose() {
        MethodCollector.m26663i(13503);
        Pose nativeGetPose = nativeGetPose(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.m26664o(13503);
        return nativeGetPose;
    }

    public TrackingState getTrackingState() {
        MethodCollector.m26663i(13565);
        TrackingState forNumber = TrackingState.forNumber(nativeGetTrackingState(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.m26664o(13565);
        return forNumber;
    }

    /* renamed from: com.google.ar.core.Anchor$CloudLocalizationState */
    public enum CloudLocalizationState {
        NONE(0),
        EARTH(1),
        LOCAL_MAP(2),
        LOCAL_MAP_AND_EARTH(3);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(32559);
        }

        static CloudLocalizationState forNumber(int i) {
            CloudLocalizationState[] values = values();
            for (CloudLocalizationState cloudLocalizationState : values) {
                if (cloudLocalizationState.nativeCode == i) {
                    return cloudLocalizationState;
                }
            }
            StringBuilder sb = new StringBuilder(69);
            sb.append("Unexpected value for native CloudLocalizationState, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        private CloudLocalizationState(int i) {
            this.nativeCode = i;
        }
    }

    /* renamed from: com.google.ar.core.Anchor$CloudAnchorState */
    public enum CloudAnchorState {
        NONE(0),
        TASK_IN_PROGRESS(1),
        SUCCESS(2),
        ERROR_INTERNAL(-1),
        ERROR_NOT_AUTHORIZED(-2),
        ERROR_SERVICE_UNAVAILABLE(-3),
        ERROR_RESOURCE_EXHAUSTED(-4),
        ERROR_HOSTING_DATASET_PROCESSING_FAILED(-5),
        ERROR_CLOUD_ID_NOT_FOUND(-6),
        ERROR_RESOLVING_LOCALIZATION_NO_MATCH(-7),
        ERROR_RESOLVING_SDK_VERSION_TOO_OLD(-8),
        ERROR_RESOLVING_SDK_VERSION_TOO_NEW(-9),
        ERROR_HOSTING_SERVICE_UNAVAILABLE(-10),
        ERROR_RESOLVING_LOCALIZED_TOO_FAR_AWAY(-11);
        
        final int nativeCode;

        public final boolean isError() {
            return this.nativeCode < 0;
        }

        static {
            Covode.recordClassIndex(32558);
        }

        public static CloudAnchorState forNumber(int i) {
            CloudAnchorState[] values = values();
            for (CloudAnchorState cloudAnchorState : values) {
                if (cloudAnchorState.nativeCode == i) {
                    return cloudAnchorState;
                }
            }
            StringBuilder sb = new StringBuilder(63);
            sb.append("Unexpected value for native CloudAnchorState, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        private CloudAnchorState(int i) {
            this.nativeCode = i;
        }
    }

    public boolean equals(Object obj) {
        if ((obj instanceof Anchor) && ((Anchor) obj).nativeHandle == this.nativeHandle) {
            return true;
        }
        return false;
    }

    Anchor(long j, Session session2) {
        this.session = session2;
        this.nativeHandle = j;
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
    }
}
