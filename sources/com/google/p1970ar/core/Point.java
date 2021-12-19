package com.google.p1970ar.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.p1970ar.core.exceptions.FatalException;
import java.util.Collection;

/* renamed from: com.google.ar.core.Point */
public class Point extends TrackableBase {
    static {
        Covode.recordClassIndex(32608);
    }

    private native int nativeGetOrientationMode(long j, long j2);

    private native Pose nativeGetPose(long j, long j2);

    private native Pose nativeGetPoseFromDistanceGuess(long j, long j2);

    private native Pose nativeGetPoseFromRealDepth(long j, long j2);

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

    protected Point() {
        super(0, null);
    }

    /* renamed from: com.google.ar.core.Point$OrientationMode */
    public enum OrientationMode {
        INITIALIZED_TO_IDENTITY(0),
        ESTIMATED_SURFACE_NORMAL(1);
        
        private final int nativeCode;

        static {
            Covode.recordClassIndex(32609);
        }

        static OrientationMode fromNumber(int i) {
            OrientationMode[] values = values();
            for (OrientationMode orientationMode : values) {
                if (orientationMode.nativeCode == i) {
                    return orientationMode;
                }
            }
            StringBuilder sb = new StringBuilder(69);
            sb.append("Unexpected value for native Point Orientation Mode, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        private OrientationMode(int i) {
            this.nativeCode = i;
        }
    }

    public OrientationMode getOrientationMode() {
        MethodCollector.m26663i(7087);
        OrientationMode fromNumber = OrientationMode.fromNumber(nativeGetOrientationMode(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.m26664o(7087);
        return fromNumber;
    }

    public Pose getPose() {
        MethodCollector.m26663i(6652);
        Pose nativeGetPose = nativeGetPose(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.m26664o(6652);
        return nativeGetPose;
    }

    public Pose getPoseFromDistanceGuess() {
        MethodCollector.m26663i(6789);
        Pose nativeGetPoseFromDistanceGuess = nativeGetPoseFromDistanceGuess(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.m26664o(6789);
        return nativeGetPoseFromDistanceGuess;
    }

    public Pose getPoseFromRealDepth() {
        MethodCollector.m26663i(6938);
        Pose nativeGetPoseFromRealDepth = nativeGetPoseFromRealDepth(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.m26664o(6938);
        return nativeGetPoseFromRealDepth;
    }

    public TrackingMethod getTrackingMethod() {
        MethodCollector.m26663i(7088);
        TrackingMethod fromNumber = TrackingMethod.fromNumber(nativeGetTrackingMethod(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.m26664o(7088);
        return fromNumber;
    }

    /* renamed from: com.google.ar.core.Point$TrackingMethod */
    public enum TrackingMethod {
        DISTANCE_GUESS(1),
        REAL_DEPTH(2),
        DISTANCE_GUESS_AND_REAL_DEPTH(3);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(32610);
        }

        static TrackingMethod fromNumber(int i) {
            TrackingMethod[] values = values();
            for (TrackingMethod trackingMethod : values) {
                if (trackingMethod.nativeCode == i) {
                    return trackingMethod;
                }
            }
            StringBuilder sb = new StringBuilder(72);
            sb.append("Unexpected value for native Point TrackingMethod Mode, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        private TrackingMethod(int i) {
            this.nativeCode = i;
        }
    }

    Point(long j, Session session) {
        super(j, session);
    }
}
