package com.p2082ss.ugc.effectplatform.model.algorithm;

import com.bytedance.covode.number.Covode;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.ugc.effectplatform.model.algorithm.SingleAlgorithmModelResponse */
public final class SingleAlgorithmModelResponse {
    private ModelInfo data;

    static {
        Covode.recordClassIndex(102558);
    }

    public static /* synthetic */ SingleAlgorithmModelResponse copy$default(SingleAlgorithmModelResponse singleAlgorithmModelResponse, ModelInfo modelInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            modelInfo = singleAlgorithmModelResponse.data;
        }
        return singleAlgorithmModelResponse.copy(modelInfo);
    }

    public final ModelInfo component1() {
        return this.data;
    }

    public final SingleAlgorithmModelResponse copy(ModelInfo modelInfo) {
        C89219l.m154719c(modelInfo, "");
        return new SingleAlgorithmModelResponse(modelInfo);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof SingleAlgorithmModelResponse) && C89219l.m154714a(this.data, ((SingleAlgorithmModelResponse) obj).data);
        }
        return true;
    }

    public final int hashCode() {
        ModelInfo modelInfo = this.data;
        if (modelInfo != null) {
            return modelInfo.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "SingleAlgorithmModelResponse(data=" + this.data + ")";
    }

    public final ModelInfo getData() {
        return this.data;
    }

    public final void setData(ModelInfo modelInfo) {
        C89219l.m154719c(modelInfo, "");
        this.data = modelInfo;
    }

    public SingleAlgorithmModelResponse(ModelInfo modelInfo) {
        C89219l.m154719c(modelInfo, "");
        this.data = modelInfo;
    }
}
