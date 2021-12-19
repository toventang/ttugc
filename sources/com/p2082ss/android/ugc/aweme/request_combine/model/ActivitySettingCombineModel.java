package com.p2082ss.android.ugc.aweme.request_combine.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.p2388bg.C34825a;
import com.p2082ss.android.ugc.aweme.request_combine.C67116a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.request_combine.model.ActivitySettingCombineModel */
public final class ActivitySettingCombineModel extends C67116a {
    @AbstractC27891c(mo46611a = "body")
    private C34825a activitySetting;

    static {
        Covode.recordClassIndex(78718);
    }

    public static /* synthetic */ ActivitySettingCombineModel copy$default(ActivitySettingCombineModel activitySettingCombineModel, C34825a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = activitySettingCombineModel.activitySetting;
        }
        return activitySettingCombineModel.copy(aVar);
    }

    public final C34825a component1() {
        return this.activitySetting;
    }

    public final ActivitySettingCombineModel copy(C34825a aVar) {
        C89219l.m154721d(aVar, "");
        return new ActivitySettingCombineModel(aVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ActivitySettingCombineModel) && C89219l.m154714a(this.activitySetting, ((ActivitySettingCombineModel) obj).activitySetting);
        }
        return true;
    }

    public final int hashCode() {
        C34825a aVar = this.activitySetting;
        if (aVar != null) {
            return aVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ActivitySettingCombineModel(activitySetting=" + this.activitySetting + ")";
    }

    public final C34825a getActivitySetting() {
        return this.activitySetting;
    }

    public final void setActivitySetting(C34825a aVar) {
        C89219l.m154721d(aVar, "");
        this.activitySetting = aVar;
    }

    public ActivitySettingCombineModel(C34825a aVar) {
        C89219l.m154721d(aVar, "");
        this.activitySetting = aVar;
    }
}
