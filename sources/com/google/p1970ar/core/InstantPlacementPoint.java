package com.google.p1970ar.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.p1970ar.core.exceptions.FatalException;
import java.util.Collection;

/* renamed from: com.google.ar.core.InstantPlacementPoint */
public class InstantPlacementPoint extends TrackableBase {
    static {
        Covode.recordClassIndex(32599);
    }

    private native Pose nativeGetPose(long j, long j2);

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

    public Pose getPose() {
        MethodCollector.m26663i(7176);
        Pose nativeGetPose = nativeGetPose(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.m26664o(7176);
        return nativeGetPose;
    }

    public TrackingMethod getTrackingMethod() {
        MethodCollector.m26663i(7020);
        TrackingMethod fromNumber = TrackingMethod.fromNumber(nativeGetTrackingMethod(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.m26664o(7020);
        return fromNumber;
    }

    /* renamed from: com.google.ar.core.InstantPlacementPoint$TrackingMethod */
    public enum TrackingMethod {
        NOT_TRACKING(0),
        SCREENSPACE_WITH_APPROXIMATE_DISTANCE(1),
        FULL_TRACKING(2);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(32600);
        }

        static TrackingMethod fromNumber(int i) {
            TrackingMethod[] values = values();
            for (TrackingMethod trackingMethod : values) {
                if (trackingMethod.nativeCode == i) {
                    return trackingMethod;
                }
            }
            StringBuilder sb = new StringBuilder(88);
            sb.append("Unexpected value for native InstantPlacementPoint TrackingMethod Mode, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        private TrackingMethod(int i) {
            this.nativeCode = i;
        }
    }

    InstantPlacementPoint(long j, Session session) {
        super(j, session);
    }
}
