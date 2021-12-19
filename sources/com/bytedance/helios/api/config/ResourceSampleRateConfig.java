package com.bytedance.helios.api.config;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

public final class ResourceSampleRateConfig extends DefaultSampleRateConfig implements Serializable {
    @AbstractC27891c(mo46611a = "resource_id")
    private final String resourceId;

    static {
        Covode.recordClassIndex(17570);
    }

    public ResourceSampleRateConfig() {
        this(null, 0.0d, 0.0d, 0.0d, 15, null);
    }

    public final String getResourceId() {
        return this.resourceId;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ResourceSampleRateConfig(String str, double d, double d2, double d3) {
        super(d, d2, d3);
        C89219l.m154719c(str, "");
        this.resourceId = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ResourceSampleRateConfig(String str, double d, double d2, double d3, int i, C89214g gVar) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0d : d, (i & 4) != 0 ? 0.01d : d2, (i & 8) != 0 ? 1.0d : d3);
    }
}
