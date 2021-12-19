package com.p2082ss.android.p2160ml.process.p2162bl;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2160ml.process.AbstractC30097a;
import java.util.List;

/* renamed from: com.ss.android.ml.process.bl.AfOPModel */
public class AfOPModel implements AbstractC30097a {
    public List<String> args;
    public List<String> labels;

    /* renamed from: op */
    public String f71839op;
    public List<Float> opts;

    static {
        Covode.recordClassIndex(36609);
    }

    @Override // com.p2082ss.android.p2160ml.process.AbstractC30112b
    public List<String> getArgs() {
        return this.args;
    }

    @Override // com.p2082ss.android.p2160ml.process.AbstractC30097a
    public List<String> getLabels() {
        return this.labels;
    }

    @Override // com.p2082ss.android.p2160ml.process.AbstractC30112b
    public List<Float> getOPTs() {
        return this.opts;
    }

    @Override // com.p2082ss.android.p2160ml.process.AbstractC30112b
    public String getOperator() {
        return this.f71839op;
    }

    public String toString() {
        return "AfOPModel{labels=" + this.labels + ", op='" + this.f71839op + '\'' + ", args=" + this.args + ", opts=" + this.opts + '}';
    }
}
