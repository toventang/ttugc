package com.google.p1970ar.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.p1970ar.core.exceptions.FatalException;
import java.nio.FloatBuffer;
import java.util.Collection;

/* renamed from: com.google.ar.core.Plane */
public class Plane extends TrackableBase {
    static {
        Covode.recordClassIndex(32605);
    }

    private native long nativeAcquireSubsumedBy(long j, long j2);

    private native Pose nativeGetCenterPose(long j, long j2);

    private native float nativeGetExtentX(long j, long j2);

    private native float nativeGetExtentZ(long j, long j2);

    private native float[] nativeGetPolygon(long j, long j2);

    private native int nativeGetType(long j, long j2);

    private native boolean nativeIsPoseInExtents(long j, long j2, Pose pose);

    private native boolean nativeIsPoseInPolygon(long j, long j2, Pose pose);

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

    protected Plane() {
        super(0, null);
    }

    public Pose getCenterPose() {
        MethodCollector.m26663i(6134);
        Pose nativeGetCenterPose = nativeGetCenterPose(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.m26664o(6134);
        return nativeGetCenterPose;
    }

    public float getExtentX() {
        MethodCollector.m26663i(6136);
        float nativeGetExtentX = nativeGetExtentX(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.m26664o(6136);
        return nativeGetExtentX;
    }

    public float getExtentZ() {
        MethodCollector.m26663i(6443);
        float nativeGetExtentZ = nativeGetExtentZ(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.m26664o(6443);
        return nativeGetExtentZ;
    }

    public FloatBuffer getPolygon() {
        MethodCollector.m26663i(6585);
        FloatBuffer wrap = FloatBuffer.wrap(nativeGetPolygon(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.m26664o(6585);
        return wrap;
    }

    public Type getType() {
        MethodCollector.m26663i(9893);
        Type forNumber = Type.forNumber(nativeGetType(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.m26664o(9893);
        return forNumber;
    }

    /* renamed from: com.google.ar.core.Plane$Type */
    public enum Type {
        HORIZONTAL_UPWARD_FACING(0),
        HORIZONTAL_DOWNWARD_FACING(1),
        VERTICAL(2);
        
        final int nativeCode;

        static {
            Covode.recordClassIndex(32606);
        }

        static Type forNumber(int i) {
            Type[] values = values();
            for (Type type : values) {
                if (type.nativeCode == i) {
                    return type;
                }
            }
            StringBuilder sb = new StringBuilder(57);
            sb.append("Unexpected value for native Plane.Type, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }

        private Type(int i) {
            this.nativeCode = i;
        }
    }

    public Plane getSubsumedBy() {
        MethodCollector.m26663i(9894);
        long nativeAcquireSubsumedBy = nativeAcquireSubsumedBy(this.session.nativeWrapperHandle, this.nativeHandle);
        if (nativeAcquireSubsumedBy == 0) {
            MethodCollector.m26664o(9894);
            return null;
        }
        Plane plane = new Plane(nativeAcquireSubsumedBy, this.session);
        MethodCollector.m26664o(9894);
        return plane;
    }

    public boolean isPoseInExtents(Pose pose) {
        MethodCollector.m26663i(6729);
        boolean nativeIsPoseInExtents = nativeIsPoseInExtents(this.session.nativeWrapperHandle, this.nativeHandle, pose);
        MethodCollector.m26664o(6729);
        return nativeIsPoseInExtents;
    }

    public boolean isPoseInPolygon(Pose pose) {
        MethodCollector.m26663i(6875);
        boolean nativeIsPoseInPolygon = nativeIsPoseInPolygon(this.session.nativeWrapperHandle, this.nativeHandle, pose);
        MethodCollector.m26664o(6875);
        return nativeIsPoseInPolygon;
    }

    Plane(long j, Session session) {
        super(j, session);
    }
}
