package com.p2082ss.android.ugc.aweme.request_combine.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.request_combine.C67116a;
import com.p2082ss.android.ugc.aweme.setting.model.C68188p;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.request_combine.model.ShareSettingCombineModel */
public final class ShareSettingCombineModel extends C67116a {
    @AbstractC27891c(mo46611a = "body")
    private C68188p shareSetting;

    static {
        Covode.recordClassIndex(78726);
    }

    public static /* synthetic */ ShareSettingCombineModel copy$default(ShareSettingCombineModel shareSettingCombineModel, C68188p pVar, int i, Object obj) {
        if ((i & 1) != 0) {
            pVar = shareSettingCombineModel.shareSetting;
        }
        return shareSettingCombineModel.copy(pVar);
    }

    public final C68188p component1() {
        return this.shareSetting;
    }

    public final ShareSettingCombineModel copy(C68188p pVar) {
        C89219l.m154721d(pVar, "");
        return new ShareSettingCombineModel(pVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ShareSettingCombineModel) && C89219l.m154714a(this.shareSetting, ((ShareSettingCombineModel) obj).shareSetting);
        }
        return true;
    }

    public final int hashCode() {
        C68188p pVar = this.shareSetting;
        if (pVar != null) {
            return pVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "ShareSettingCombineModel(shareSetting=" + this.shareSetting + ")";
    }

    public final C68188p getShareSetting() {
        return this.shareSetting;
    }

    public final void setShareSetting(C68188p pVar) {
        C89219l.m154721d(pVar, "");
        this.shareSetting = pVar;
    }

    public ShareSettingCombineModel(C68188p pVar) {
        C89219l.m154721d(pVar, "");
        this.shareSetting = pVar;
    }
}
