package com.bytedance.geckox.policy.loop.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LoopRequestModel {
    @AbstractC27891c(mo46611a = "custom")
    private Map<String, Object> custom;
    private LoopDeploymentModel deployment;

    static {
        Covode.recordClassIndex(17140);
    }

    public static class LoopDeploymentModel {
        @AbstractC27891c(mo46611a = "group_name")
        private List<String> groupName;
        @AbstractC27891c(mo46611a = "target_channels")
        private List<CheckRequestBodyModel.TargetChannel> targetChannels;

        static {
            Covode.recordClassIndex(17141);
        }

        public List<String> getGroupName() {
            return this.groupName;
        }

        public List<CheckRequestBodyModel.TargetChannel> getTargetChannels() {
            return this.targetChannels;
        }

        public LoopDeploymentModel() {
            this.groupName = new ArrayList();
            this.targetChannels = new ArrayList();
        }

        public void setTargetChannels(List<CheckRequestBodyModel.TargetChannel> list) {
            this.targetChannels = list;
        }

        public LoopDeploymentModel(List<String> list, List<CheckRequestBodyModel.TargetChannel> list2) {
            this.groupName = list;
            this.targetChannels = list2;
        }
    }

    public Map<String, Object> getCustom() {
        return this.custom;
    }

    public LoopDeploymentModel getDeployment() {
        return this.deployment;
    }

    public void setCustom(Map<String, Object> map) {
        this.custom = map;
    }

    public void setDeployment(LoopDeploymentModel loopDeploymentModel) {
        this.deployment = loopDeploymentModel;
    }

    public LoopRequestModel(Map<String, Object> map, LoopDeploymentModel loopDeploymentModel) {
        this.custom = map;
        this.deployment = loopDeploymentModel;
    }
}
