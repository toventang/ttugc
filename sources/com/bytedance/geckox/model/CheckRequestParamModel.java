package com.bytedance.geckox.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.google.gson.p2018a.AbstractC27891c;
import java.util.List;

public class CheckRequestParamModel {
    @AbstractC27891c(mo46611a = "group_name")
    private String group;
    @AbstractC27891c(mo46611a = "target_channels")
    private List<CheckRequestBodyModel.TargetChannel> targetChannels;

    static {
        Covode.recordClassIndex(17097);
    }

    public String getGroup() {
        return this.group;
    }

    public List<CheckRequestBodyModel.TargetChannel> getTargetChannels() {
        return this.targetChannels;
    }

    public void setGroup(String str) {
        this.group = str;
    }

    public void setTargetChannels(List<CheckRequestBodyModel.TargetChannel> list) {
        this.targetChannels = list;
    }

    public CheckRequestParamModel(String str) {
        this.group = str;
    }

    public CheckRequestParamModel(String str, List<CheckRequestBodyModel.TargetChannel> list) {
        this.group = str;
        this.targetChannels = list;
    }
}
