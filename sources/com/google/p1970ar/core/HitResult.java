package com.google.p1970ar.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: com.google.ar.core.HitResult */
public class HitResult {
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    static {
        Covode.recordClassIndex(32595);
    }

    protected HitResult() {
    }

    private native long nativeCreateAnchor(long j, long j2);

    private static native void nativeDestroyHitResult(long j, long j2);

    private native float nativeGetDistance(long j, long j2);

    private native Pose nativeGetPose(long j, long j2);

    /* access modifiers changed from: package-private */
    public native long nativeAcquireTrackable(long j, long j2);

    public int hashCode() {
        return Long.valueOf(this.nativeHandle).hashCode();
    }

    public Anchor createAnchor() {
        MethodCollector.m26663i(8157);
        Anchor anchor = new Anchor(nativeCreateAnchor(this.session.nativeWrapperHandle, this.nativeHandle), this.session);
        MethodCollector.m26664o(8157);
        return anchor;
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        MethodCollector.m26663i(7719);
        long j = this.nativeHandle;
        if (j != 0) {
            nativeDestroyHitResult(this.nativeSymbolTableHandle, j);
        }
        super.finalize();
        MethodCollector.m26664o(7719);
    }

    public float getDistance() {
        MethodCollector.m26663i(8011);
        float nativeGetDistance = nativeGetDistance(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.m26664o(8011);
        return nativeGetDistance;
    }

    public Pose getHitPose() {
        MethodCollector.m26663i(8009);
        Pose nativeGetPose = nativeGetPose(this.session.nativeWrapperHandle, this.nativeHandle);
        MethodCollector.m26664o(8009);
        return nativeGetPose;
    }

    public Trackable getTrackable() {
        MethodCollector.m26663i(8013);
        Trackable createTrackable = this.session.createTrackable(nativeAcquireTrackable(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.m26664o(8013);
        return createTrackable;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof HitResult) && ((HitResult) obj).nativeHandle == this.nativeHandle) {
            return true;
        }
        return false;
    }

    HitResult(long j, Session session2) {
        this.session = session2;
        this.nativeHandle = j;
        this.nativeSymbolTableHandle = session2.nativeSymbolTableHandle;
    }
}
