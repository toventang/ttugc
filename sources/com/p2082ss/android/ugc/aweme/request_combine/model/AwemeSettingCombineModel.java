package com.p2082ss.android.ugc.aweme.request_combine.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28019l;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.request_combine.C67116a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.request_combine.model.AwemeSettingCombineModel */
public final class AwemeSettingCombineModel extends C67116a {
    @AbstractC27891c(mo46611a = "body")
    private AbstractC28019l awemeSetting;

    static {
        Covode.recordClassIndex(78719);
    }

    public static /* synthetic */ AwemeSettingCombineModel copy$default(AwemeSettingCombineModel awemeSettingCombineModel, AbstractC28019l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = awemeSettingCombineModel.awemeSetting;
        }
        return awemeSettingCombineModel.copy(lVar);
    }

    public final AbstractC28019l component1() {
        return this.awemeSetting;
    }

    public final AwemeSettingCombineModel copy(AbstractC28019l lVar) {
        C89219l.m154721d(lVar, "");
        return new AwemeSettingCombineModel(lVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof AwemeSettingCombineModel) && C89219l.m154714a(this.awemeSetting, ((AwemeSettingCombineModel) obj).awemeSetting);
        }
        return true;
    }

    public final int hashCode() {
        AbstractC28019l lVar = this.awemeSetting;
        if (lVar != null) {
            return lVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "AwemeSettingCombineModel(awemeSetting=" + this.awemeSetting + ")";
    }

    public final AbstractC28019l getAwemeSetting() {
        return this.awemeSetting;
    }

    public final void setAwemeSetting(AbstractC28019l lVar) {
        C89219l.m154721d(lVar, "");
        this.awemeSetting = lVar;
    }

    public AwemeSettingCombineModel(AbstractC28019l lVar) {
        C89219l.m154721d(lVar, "");
        this.awemeSetting = lVar;
    }
}
