package com.bytedance.helios.api.config;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.io.Serializable;
import p4600h.p4611f.p4613b.C89214g;

public class DefaultSampleRateConfig implements Serializable {
    @AbstractC27891c(mo46611a = "intercept_error")
    private final double interceptError;
    @AbstractC27891c(mo46611a = "monitor_error")
    private final double monitorError;
    @AbstractC27891c(mo46611a = "monitor_normal")
    private final double monitorNormal;

    static {
        Covode.recordClassIndex(17565);
    }

    public DefaultSampleRateConfig() {
        this(0.0d, 0.0d, 0.0d, 7, null);
    }

    public final double getInterceptError() {
        return this.interceptError;
    }

    public final double getMonitorError() {
        return this.monitorError;
    }

    public final double getMonitorNormal() {
        return this.monitorNormal;
    }

    public DefaultSampleRateConfig(double d, double d2, double d3) {
        this.monitorNormal = d;
        this.monitorError = d2;
        this.interceptError = d3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DefaultSampleRateConfig(double d, double d2, double d3, int i, C89214g gVar) {
        this((i & 1) != 0 ? 0.0d : d, (i & 2) != 0 ? 0.01d : d2, (i & 4) != 0 ? 1.0d : d3);
    }
}
