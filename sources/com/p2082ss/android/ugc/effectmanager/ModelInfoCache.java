package com.p2082ss.android.ugc.effectmanager;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.model.LocalModelInfo;
import com.p2082ss.android.ugc.effectmanager.model.ModelInfo;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.effectmanager.ModelInfoCache */
public final class ModelInfoCache {
    private LocalModelInfo localModelInfo;
    private ModelInfo serverModelInfo;

    static {
        Covode.recordClassIndex(95378);
    }

    public static /* synthetic */ ModelInfoCache copy$default(ModelInfoCache modelInfoCache, LocalModelInfo localModelInfo2, ModelInfo modelInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            localModelInfo2 = modelInfoCache.localModelInfo;
        }
        if ((i & 2) != 0) {
            modelInfo = modelInfoCache.serverModelInfo;
        }
        return modelInfoCache.copy(localModelInfo2, modelInfo);
    }

    public final LocalModelInfo component1() {
        return this.localModelInfo;
    }

    public final ModelInfo component2() {
        return this.serverModelInfo;
    }

    public final ModelInfoCache copy(LocalModelInfo localModelInfo2, ModelInfo modelInfo) {
        C89219l.m154719c(localModelInfo2, "");
        C89219l.m154719c(modelInfo, "");
        return new ModelInfoCache(localModelInfo2, modelInfo);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModelInfoCache)) {
            return false;
        }
        ModelInfoCache modelInfoCache = (ModelInfoCache) obj;
        return C89219l.m154714a(this.localModelInfo, modelInfoCache.localModelInfo) && C89219l.m154714a(this.serverModelInfo, modelInfoCache.serverModelInfo);
    }

    public final int hashCode() {
        LocalModelInfo localModelInfo2 = this.localModelInfo;
        int i = 0;
        int hashCode = (localModelInfo2 != null ? localModelInfo2.hashCode() : 0) * 31;
        ModelInfo modelInfo = this.serverModelInfo;
        if (modelInfo != null) {
            i = modelInfo.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "ModelInfoCache(localModelInfo=" + this.localModelInfo + ", serverModelInfo=" + this.serverModelInfo + ")";
    }

    public final LocalModelInfo getLocalModelInfo() {
        return this.localModelInfo;
    }

    public final ModelInfo getServerModelInfo() {
        return this.serverModelInfo;
    }

    public final void setLocalModelInfo(LocalModelInfo localModelInfo2) {
        C89219l.m154719c(localModelInfo2, "");
        this.localModelInfo = localModelInfo2;
    }

    public final void setServerModelInfo(ModelInfo modelInfo) {
        C89219l.m154719c(modelInfo, "");
        this.serverModelInfo = modelInfo;
    }

    public ModelInfoCache(LocalModelInfo localModelInfo2, ModelInfo modelInfo) {
        C89219l.m154719c(localModelInfo2, "");
        C89219l.m154719c(modelInfo, "");
        this.localModelInfo = localModelInfo2;
        this.serverModelInfo = modelInfo;
    }
}
