package com.google.p1970ar.core;

import com.bytedance.covode.number.Covode;
import java.util.Collection;

/* renamed from: com.google.ar.core.DepthPoint */
public class DepthPoint extends TrackableBase {
    static {
        Covode.recordClassIndex(32592);
    }

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

    DepthPoint(long j, Session session) {
        super(j, session);
    }
}
