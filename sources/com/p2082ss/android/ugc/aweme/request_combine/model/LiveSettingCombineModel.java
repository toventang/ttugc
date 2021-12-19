package com.p2082ss.android.ugc.aweme.request_combine.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.live.settings.C58760c;
import com.p2082ss.android.ugc.aweme.request_combine.C67116a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.request_combine.model.LiveSettingCombineModel */
public final class LiveSettingCombineModel extends C67116a {
    @AbstractC27891c(mo46611a = "body")
    private C58760c liveSetting;

    static {
        Covode.recordClassIndex(78722);
    }

    public static /* synthetic */ LiveSettingCombineModel copy$default(LiveSettingCombineModel liveSettingCombineModel, C58760c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            cVar = liveSettingCombineModel.liveSetting;
        }
        return liveSettingCombineModel.copy(cVar);
    }

    public final C58760c component1() {
        return this.liveSetting;
    }

    public final LiveSettingCombineModel copy(C58760c cVar) {
        C89219l.m154721d(cVar, "");
        return new LiveSettingCombineModel(cVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof LiveSettingCombineModel) && C89219l.m154714a(this.liveSetting, ((LiveSettingCombineModel) obj).liveSetting);
        }
        return true;
    }

    public final int hashCode() {
        C58760c cVar = this.liveSetting;
        if (cVar != null) {
            return cVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "LiveSettingCombineModel(liveSetting=" + this.liveSetting + ")";
    }

    public final C58760c getLiveSetting() {
        return this.liveSetting;
    }

    public final void setLiveSetting(C58760c cVar) {
        C89219l.m154721d(cVar, "");
        this.liveSetting = cVar;
    }

    public LiveSettingCombineModel(C58760c cVar) {
        C89219l.m154721d(cVar, "");
        this.liveSetting = cVar;
    }
}
