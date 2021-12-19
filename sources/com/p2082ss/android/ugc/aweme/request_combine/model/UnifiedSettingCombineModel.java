package com.p2082ss.android.ugc.aweme.request_combine.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28019l;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.request_combine.C67116a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.request_combine.model.UnifiedSettingCombineModel */
public final class UnifiedSettingCombineModel extends C67116a {
    @AbstractC27891c(mo46611a = "body")
    private AbstractC28019l setting;

    static {
        Covode.recordClassIndex(78727);
    }

    public static /* synthetic */ UnifiedSettingCombineModel copy$default(UnifiedSettingCombineModel unifiedSettingCombineModel, AbstractC28019l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = unifiedSettingCombineModel.setting;
        }
        return unifiedSettingCombineModel.copy(lVar);
    }

    public final AbstractC28019l component1() {
        return this.setting;
    }

    public final UnifiedSettingCombineModel copy(AbstractC28019l lVar) {
        C89219l.m154721d(lVar, "");
        return new UnifiedSettingCombineModel(lVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof UnifiedSettingCombineModel) && C89219l.m154714a(this.setting, ((UnifiedSettingCombineModel) obj).setting);
        }
        return true;
    }

    public final int hashCode() {
        AbstractC28019l lVar = this.setting;
        if (lVar != null) {
            return lVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "UnifiedSettingCombineModel(setting=" + this.setting + ")";
    }

    public final AbstractC28019l getSetting() {
        return this.setting;
    }

    public final void setSetting(AbstractC28019l lVar) {
        C89219l.m154721d(lVar, "");
        this.setting = lVar;
    }

    public UnifiedSettingCombineModel(AbstractC28019l lVar) {
        C89219l.m154721d(lVar, "");
        this.setting = lVar;
    }
}
