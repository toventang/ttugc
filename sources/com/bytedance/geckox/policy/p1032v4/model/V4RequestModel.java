package com.bytedance.geckox.policy.p1032v4.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.Map;

/* renamed from: com.bytedance.geckox.policy.v4.model.V4RequestModel */
public class V4RequestModel {
    @AbstractC27891c(mo46611a = "custom")
    private Map<String, Object> custom;
    private V4DeploymentModel deployment;

    static {
        Covode.recordClassIndex(17149);
    }

    public Map<String, Object> getCustom() {
        return this.custom;
    }

    public V4DeploymentModel getDeployment() {
        return this.deployment;
    }

    public void setCustom(Map<String, Object> map) {
        this.custom = map;
    }

    public void setDeployment(V4DeploymentModel v4DeploymentModel) {
        this.deployment = v4DeploymentModel;
    }

    public V4RequestModel(Map<String, Object> map, V4DeploymentModel v4DeploymentModel) {
        this.custom = map;
        this.deployment = v4DeploymentModel;
    }
}
