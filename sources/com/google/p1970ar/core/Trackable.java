package com.google.p1970ar.core;

import com.bytedance.covode.number.Covode;
import java.util.Collection;

/* renamed from: com.google.ar.core.Trackable */
public interface Trackable {
    static {
        Covode.recordClassIndex(32622);
    }

    Anchor createAnchor(Pose pose);

    Collection<Anchor> getAnchors();

    TrackingState getTrackingState();
}
