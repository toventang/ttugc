package com.p2082ss.android.ugc.effectmanager;

import com.bytedance.covode.number.Covode;
import com.p2082ss.android.ugc.effectmanager.common.Multimap;
import com.p2082ss.android.ugc.effectmanager.model.ExtendedUrlModel;
import com.p2082ss.android.ugc.effectmanager.model.LocalModelInfo;
import com.p2082ss.android.ugc.effectmanager.model.ModelInfo;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.effectmanager.LoadedModelList */
public class LoadedModelList {
    Map<String, ModelInfo> mLoadedModelInfos = new HashMap();
    public Multimap<String, ModelInfoState> mRequirementModelInfoStateMap;

    static {
        Covode.recordClassIndex(95374);
    }

    /* renamed from: com.ss.android.ugc.effectmanager.LoadedModelList$ModelInfoState */
    public static class ModelInfoState {
        private boolean mLoaded;
        public ModelInfo mModelInfo;

        static {
            Covode.recordClassIndex(95375);
        }

        public ModelInfo getModelInfo() {
            return this.mModelInfo;
        }

        public boolean isLoaded() {
            return this.mLoaded;
        }

        public String getName() {
            return this.mModelInfo.getName();
        }

        public int getSize() {
            return this.mModelInfo.getType();
        }

        public ExtendedUrlModel getUrl() {
            return this.mModelInfo.getFileUrl();
        }

        public String getVersion() {
            return this.mModelInfo.getVersion();
        }

        public int hashCode() {
            return this.mModelInfo.hashCode();
        }

        public void setLoaded(boolean z) {
            this.mLoaded = z;
        }

        public ModelInfoState(ModelInfo modelInfo) {
            this.mModelInfo = modelInfo;
            modelInfo.getName();
        }

        public ModelInfoState(LocalModelInfo localModelInfo) {
            ModelInfo modelInfo = new ModelInfo();
            this.mModelInfo = modelInfo;
            modelInfo.setName(localModelInfo.getName());
            this.mModelInfo.setVersion(localModelInfo.getVersion());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            return this.mModelInfo.equals(((ModelInfoState) obj).mModelInfo);
        }
    }

    public Map<String, ModelInfo> getModelInfoList() {
        if (this.mLoadedModelInfos.isEmpty()) {
            for (ModelInfoState modelInfoState : this.mRequirementModelInfoStateMap.values()) {
                this.mLoadedModelInfos.put(modelInfoState.mModelInfo.getName(), modelInfoState.mModelInfo);
            }
        }
        return this.mLoadedModelInfos;
    }

    public ExtendedUrlModel getDownloadUrl(String str) {
        for (ModelInfoState modelInfoState : this.mRequirementModelInfoStateMap.values()) {
            if (modelInfoState.getName().equals(str)) {
                return modelInfoState.getUrl();
            }
        }
        throw new IllegalArgumentException("modelName " + str + " doesn't exist");
    }

    public void setRequirementModelInfoStateMap(Multimap<String, ModelInfoState> multimap) {
        this.mRequirementModelInfoStateMap = multimap;
        this.mLoadedModelInfos.clear();
        for (ModelInfoState modelInfoState : multimap.values()) {
            this.mLoadedModelInfos.put(modelInfoState.mModelInfo.getName(), modelInfoState.mModelInfo);
        }
    }
}
