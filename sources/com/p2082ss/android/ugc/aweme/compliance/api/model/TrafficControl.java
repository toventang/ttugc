package com.p2082ss.android.ugc.aweme.compliance.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import java.util.List;
import p4600h.p4601a.C89086z;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.compliance.api.model.TrafficControl */
public final class TrafficControl implements Serializable {
    @AbstractC27891c(mo46611a = "business")
    private final String business;
    @AbstractC27891c(mo46611a = "strategy")
    private final List<Strategy> strategy;

    static {
        Covode.recordClassIndex(46897);
    }

    public TrafficControl() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.compliance.api.model.TrafficControl */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TrafficControl copy$default(TrafficControl trafficControl, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = trafficControl.business;
        }
        if ((i & 2) != 0) {
            list = trafficControl.strategy;
        }
        return trafficControl.copy(str, list);
    }

    public final String component1() {
        return this.business;
    }

    public final List<Strategy> component2() {
        return this.strategy;
    }

    public final TrafficControl copy(String str, List<Strategy> list) {
        return new TrafficControl(str, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrafficControl)) {
            return false;
        }
        TrafficControl trafficControl = (TrafficControl) obj;
        return C89219l.m154714a(this.business, trafficControl.business) && C89219l.m154714a(this.strategy, trafficControl.strategy);
    }

    public final int hashCode() {
        String str = this.business;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<Strategy> list = this.strategy;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "TrafficControl(business=" + this.business + ", strategy=" + this.strategy + ")";
    }

    public final String getBusiness() {
        return this.business;
    }

    public final List<Strategy> getStrategy() {
        return this.strategy;
    }

    public TrafficControl(String str, List<Strategy> list) {
        this.business = str;
        this.strategy = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TrafficControl(String str, List list, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? C89086z.INSTANCE : list);
    }
}
