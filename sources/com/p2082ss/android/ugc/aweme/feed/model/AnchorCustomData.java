package com.p2082ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.Map;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AnchorCustomData */
public final class AnchorCustomData implements Serializable {
    private final boolean openOnLaunch;
    private boolean shouldOpen;
    private final Map<String, String> trackingData;

    static {
        Covode.recordClassIndex(58602);
    }

    public AnchorCustomData() {
        this(false, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.feed.model.AnchorCustomData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AnchorCustomData copy$default(AnchorCustomData anchorCustomData, boolean z, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            z = anchorCustomData.openOnLaunch;
        }
        if ((i & 2) != 0) {
            map = anchorCustomData.trackingData;
        }
        return anchorCustomData.copy(z, map);
    }

    public final boolean component1() {
        return this.openOnLaunch;
    }

    public final Map<String, String> component2() {
        return this.trackingData;
    }

    public final AnchorCustomData copy(boolean z, Map<String, String> map) {
        return new AnchorCustomData(z, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnchorCustomData)) {
            return false;
        }
        AnchorCustomData anchorCustomData = (AnchorCustomData) obj;
        return this.openOnLaunch == anchorCustomData.openOnLaunch && C89219l.m154714a(this.trackingData, anchorCustomData.trackingData);
    }

    public final int hashCode() {
        boolean z = this.openOnLaunch;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = i * 31;
        Map<String, String> map = this.trackingData;
        return i4 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "AnchorCustomData(openOnLaunch=" + this.openOnLaunch + ", trackingData=" + this.trackingData + ")";
    }

    public final boolean getOpenOnLaunch() {
        return this.openOnLaunch;
    }

    public final boolean getShouldOpen() {
        return this.shouldOpen;
    }

    public final Map<String, String> getTrackingData() {
        return this.trackingData;
    }

    public final void setShouldOpen(boolean z) {
        this.shouldOpen = z;
    }

    public AnchorCustomData(boolean z, Map<String, String> map) {
        this.openOnLaunch = z;
        this.trackingData = map;
        this.shouldOpen = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AnchorCustomData(boolean z, Map map, int i, C89214g gVar) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : map);
    }
}
