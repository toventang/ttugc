package com.bytedance.geckox.policy.p1032v4;

import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.bytedance.geckox.policy.v4.UpdateModel */
public class UpdateModel {
    private List<String> channels;
    private List<String> groups;

    static {
        Covode.recordClassIndex(17142);
    }

    public UpdateModel() {
    }

    public List<String> getChannels() {
        return this.channels;
    }

    public List<String> getGroups() {
        return this.groups;
    }

    public void setChannels(List<String> list) {
        this.channels = list;
    }

    public void setGroups(List<String> list) {
        this.groups = list;
    }

    public UpdateModel(List<String> list, List<String> list2) {
        this.groups = list;
        this.channels = list2;
    }
}
