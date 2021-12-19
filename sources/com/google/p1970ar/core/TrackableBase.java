package com.google.p1970ar.core;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Collection;

/* access modifiers changed from: package-private */
/* renamed from: com.google.ar.core.TrackableBase */
public class TrackableBase implements Trackable {
    long nativeHandle;
    protected final long nativeSymbolTableHandle;
    protected final Session session;

    static {
        Covode.recordClassIndex(32623);
    }

    TrackableBase(long j, Session session2) {
        this.session = session2;
        this.nativeHandle = j;
        this.nativeSymbolTableHandle = session2 == null ? 0 : session2.nativeSymbolTableHandle;
    }

    private native long nativeCreateAnchor(long j, long j2, Pose pose);

    private native long[] nativeGetAnchors(long j, long j2);

    private native int nativeGetTrackingState(long j, long j2);

    private static native int nativeGetType(long j, long j2);

    private static native void nativeReleaseTrackable(long j, long j2);

    public int hashCode() {
        return Long.valueOf(this.nativeHandle).hashCode();
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        MethodCollector.m26663i(14154);
        long j = this.nativeHandle;
        if (j != 0) {
            nativeReleaseTrackable(this.nativeSymbolTableHandle, j);
            this.nativeHandle = 0;
        }
        super.finalize();
        MethodCollector.m26664o(14154);
    }

    @Override // com.google.p1970ar.core.Trackable
    public Collection<Anchor> getAnchors() {
        MethodCollector.m26663i(14157);
        Session session2 = this.session;
        Collection<Anchor> convertNativeAnchorsToCollection = session2.convertNativeAnchorsToCollection(nativeGetAnchors(session2.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.m26664o(14157);
        return convertNativeAnchorsToCollection;
    }

    @Override // com.google.p1970ar.core.Trackable
    public TrackingState getTrackingState() {
        MethodCollector.m26663i(14155);
        TrackingState forNumber = TrackingState.forNumber(nativeGetTrackingState(this.session.nativeWrapperHandle, this.nativeHandle));
        MethodCollector.m26664o(14155);
        return forNumber;
    }

    @Override // com.google.p1970ar.core.Trackable
    public Anchor createAnchor(Pose pose) {
        MethodCollector.m26663i(14156);
        Anchor anchor = new Anchor(nativeCreateAnchor(this.session.nativeWrapperHandle, this.nativeHandle, pose), this.session);
        MethodCollector.m26664o(14156);
        return anchor;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof TrackableBase) && ((TrackableBase) obj).nativeHandle == this.nativeHandle) {
            return true;
        }
        return false;
    }

    static int internalGetType(long j, long j2) {
        MethodCollector.m26663i(14174);
        int nativeGetType = nativeGetType(j, j2);
        MethodCollector.m26664o(14174);
        return nativeGetType;
    }

    static void internalReleaseNativeHandle(long j, long j2) {
        MethodCollector.m26663i(14173);
        nativeReleaseTrackable(j, j2);
        MethodCollector.m26664o(14173);
    }
}
