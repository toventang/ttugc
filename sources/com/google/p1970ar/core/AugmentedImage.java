package com.google.p1970ar.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.p1970ar.core.exceptions.FatalException;
import java.util.Collection;

/* renamed from: com.google.ar.core.AugmentedImage */
public class AugmentedImage extends TrackableBase {
    static {
        Covode.recordClassIndex(32569);
    }

    private native Pose nativeGetCenterPose(long j, long j2);

    private native float nativeGetExtentX(long j, long j2);

    private native float nativeGetExtentZ(long j, long j2);

    private native int nativeGetIndex(long j, long j2);

    private native String nativeGetName(long j, long j2);

    private native int nativeGetTrackingMethod(long j, long j2);

    @Override // com.google.p1970ar.core.TrackableBase, com.google.p1970ar.core.Trackable
    public /* bridge */ /* synthetic */ Anchor createAnchor(Pose pose) {
        return super.createAnchor(pose);
    }

    @Override // com.google.p1970ar.core.TrackableBase
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.p1970ar.core.TrackableBase, com.google.p1970ar.core.Trackable
    public /* bridge */ /* synthetic */ Collection getAnchors() {
        return super.getAnchors();
    }

    @Override // com.google.p1970ar.core.TrackableBase, com.google.p1970ar.core.Trackable
    public /* bridge */ /* synthetic */ TrackingState getTrackingState() {
        return super.getTrackingState();
    }

    @Override // com.google.p1970ar.core.TrackableBase
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public Pose getCenterPose() {
        MethodCollector.m26663i(9516);
        Pose nativeGetCenterPose = nativeGetCenterPose(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.m26664o(9516);
        return nativeGetCenterPose;
    }

    public float getExtentX() {
        MethodCollector.m26663i(9666);
        float nativeGetExtentX = nativeGetExtentX(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.m26664o(9666);
        return nativeGetExtentX;
    }

    public float getExtentZ() {
        MethodCollector.m26663i(9667);
        float nativeGetExtentZ = nativeGetExtentZ(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.m26664o(9667);
        return nativeGetExtentZ;
    }

    public int getIndex() {
        MethodCollector.m26663i(9668);
        int nativeGetIndex = nativeGetIndex(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.m26664o(9668);
        return nativeGetIndex;
    }

    public String getName() {
        MethodCollector.m26663i(9820);
        String nativeGetName = nativeGetName(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.m26664o(9820);
        return nativeGetName;
    }

    public TrackingMethod getTrackingMethod() {
        MethodCollector.m26663i(9965);
        TrackingMethod forNumber = TrackingMethod.forNumber(nativeGetTrackingMethod(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.m26664o(9965);
        return forNumber;
    }

    /* renamed from: com.google.ar.core.AugmentedImage$TrackingMethod */
    public enum TrackingMethod {
        NOT_TRACKING(0),
        FULL_TRACKING(1),
        LAST_KNOWN_POSE(2);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(32570);
        }

        static TrackingMethod forNumber(int i) {
            TrackingMethod[] values = values();
            for (TrackingMethod trackingMethod : values) {
                if (trackingMethod.nativeCode == i) {
                    return trackingMethod;
                }
            }
            StringBuilder sb = new StringBuilder(61);
            sb.append("Unexpected value for native TrackingMethod, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        private TrackingMethod(int i) {
            this.nativeCode = i;
        }
    }

    AugmentedImage(long j, Session session) {
        super(j, session);
    }
}
