package com.p2082ss.android.ugc.aweme.request_combine.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.request_combine.C67116a;
import com.p2082ss.android.ugc.aweme.setting.serverpush.p3728a.C68348f;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.request_combine.model.UserSettingCombineModel */
public final class UserSettingCombineModel extends C67116a {
    @AbstractC27891c(mo46611a = "body")
    private C68348f userSetting;

    static {
        Covode.recordClassIndex(78728);
    }

    public static /* synthetic */ UserSettingCombineModel copy$default(UserSettingCombineModel userSettingCombineModel, C68348f fVar, int i, Object obj) {
        if ((i & 1) != 0) {
            fVar = userSettingCombineModel.userSetting;
        }
        return userSettingCombineModel.copy(fVar);
    }

    public final C68348f component1() {
        return this.userSetting;
    }

    public final UserSettingCombineModel copy(C68348f fVar) {
        C89219l.m154721d(fVar, "");
        return new UserSettingCombineModel(fVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof UserSettingCombineModel) && C89219l.m154714a(this.userSetting, ((UserSettingCombineModel) obj).userSetting);
        }
        return true;
    }

    public final int hashCode() {
        C68348f fVar = this.userSetting;
        if (fVar != null) {
            return fVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "UserSettingCombineModel(userSetting=" + this.userSetting + ")";
    }

    public final C68348f getUserSetting() {
        return this.userSetting;
    }

    public final void setUserSetting(C68348f fVar) {
        C89219l.m154721d(fVar, "");
        this.userSetting = fVar;
    }

    public UserSettingCombineModel(C68348f fVar) {
        C89219l.m154721d(fVar, "");
        this.userSetting = fVar;
    }
}
