package com.p2082ss.android.p2160ml.process.p2162bl;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.p2160ml.process.AbstractC30113c;
import java.util.List;

/* renamed from: com.ss.android.ml.process.bl.PreOPModel */
public class PreOPModel implements AbstractC30113c {
    public List<String> args;
    public String feature;
    public List<String> lables;
    public int length;

    /* renamed from: op */
    public String f71840op;
    public List<Float> opts;
    public String type;
    public int vector_length;
    public int vector_num;

    static {
        Covode.recordClassIndex(36611);
    }

    @Override // com.p2082ss.android.p2160ml.process.AbstractC30112b
    public List<String> getArgs() {
        return this.args;
    }

    @Override // com.p2082ss.android.p2160ml.process.AbstractC30113c
    public String getFeature() {
        return this.feature;
    }

    @Override // com.p2082ss.android.p2160ml.process.AbstractC30113c
    public List<String> getLabels() {
        return this.lables;
    }

    @Override // com.p2082ss.android.p2160ml.process.AbstractC30112b
    public List<Float> getOPTs() {
        return this.opts;
    }

    @Override // com.p2082ss.android.p2160ml.process.AbstractC30112b
    public String getOperator() {
        return this.f71840op;
    }

    @Override // com.p2082ss.android.p2160ml.process.AbstractC30113c
    public String getType() {
        return this.type;
    }

    @Override // com.p2082ss.android.p2160ml.process.AbstractC30113c
    public int getVectorLength() {
        return this.vector_length;
    }

    @Override // com.p2082ss.android.p2160ml.process.AbstractC30113c
    public int getVectorNum() {
        return this.vector_num;
    }

    @Override // com.p2082ss.android.p2160ml.process.AbstractC30113c
    public int getLength() {
        if (getVectorLength() <= 0 || getVectorNum() <= 0) {
            return this.length;
        }
        return getVectorLength() * getVectorNum();
    }

    public String toString() {
        return "PreOPModel{feature='" + this.feature + '\'' + ", op='" + this.f71840op + '\'' + ", args=" + this.args + ", opts=" + this.opts + ", lables=" + this.lables + ", length=" + this.length + ", type='" + this.type + '\'' + ", vector_length=" + this.vector_length + ", vector_num=" + this.vector_num + '}';
    }
}
