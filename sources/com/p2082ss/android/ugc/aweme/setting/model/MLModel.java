package com.p2082ss.android.ugc.aweme.setting.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;
import java.util.Arrays;

/* renamed from: com.ss.android.ugc.aweme.setting.model.MLModel */
public class MLModel {
    @AbstractC27891c(mo46611a = "disable")
    public boolean disable;
    @AbstractC27891c(mo46611a = "package")
    public String packageUrl;
    @AbstractC27891c(mo46611a = "params")
    public int[] params;
    @AbstractC27891c(mo46611a = "scene")
    public String scene;
    @AbstractC27891c(mo46611a = StringSet.type)
    public int type = 3;

    static {
        Covode.recordClassIndex(80367);
    }

    public String toString() {
        return "MLModel{scene='" + this.scene + '\'' + ", packageUrl='" + this.packageUrl + '\'' + ", type=" + this.type + ", params=" + Arrays.toString(this.params) + ", disable=" + this.disable + '}';
    }
}
