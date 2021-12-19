package com.bytedance.geckox.policy.p1032v4.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.geckox.policy.v4.model.V4DeploymentModel */
public class V4DeploymentModel {
    @AbstractC27891c(mo46611a = "group_name")
    private List<C15005a> groupName;
    @AbstractC27891c(mo46611a = "target_channels")
    private List<CheckRequestBodyModel.TargetChannel> targetChannels;

    static {
        Covode.recordClassIndex(17147);
    }

    /* renamed from: com.bytedance.geckox.policy.v4.model.V4DeploymentModel$a */
    public static class C15005a {
        @AbstractC27891c(mo46611a = StringSet.name)

        /* renamed from: a */
        public String f36665a;
        @AbstractC27891c(mo46611a = "from")

        /* renamed from: b */
        public String f36666b;

        static {
            Covode.recordClassIndex(17148);
        }

        public C15005a() {
        }

        public C15005a(String str) {
            this.f36665a = str;
        }
    }

    public List<C15005a> getGroupName() {
        return this.groupName;
    }

    public List<CheckRequestBodyModel.TargetChannel> getTargetChannels() {
        return this.targetChannels;
    }

    public V4DeploymentModel() {
        this.groupName = new ArrayList();
        this.targetChannels = new ArrayList();
    }

    public void setTargetChannels(List<CheckRequestBodyModel.TargetChannel> list) {
        this.targetChannels = list;
    }

    public V4DeploymentModel(List<C15005a> list, List<CheckRequestBodyModel.TargetChannel> list2) {
        this.groupName = list;
        this.targetChannels = list2;
    }
}
