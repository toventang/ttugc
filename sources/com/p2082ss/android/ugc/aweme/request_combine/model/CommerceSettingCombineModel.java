package com.p2082ss.android.ugc.aweme.request_combine.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.commercialize.model.C38256t;
import com.p2082ss.android.ugc.aweme.request_combine.C67116a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.request_combine.model.CommerceSettingCombineModel */
public final class CommerceSettingCombineModel extends C67116a {
    @AbstractC27891c(mo46611a = "body")
    private C38256t combineModel;

    static {
        Covode.recordClassIndex(78720);
    }

    public static /* synthetic */ CommerceSettingCombineModel copy$default(CommerceSettingCombineModel commerceSettingCombineModel, C38256t tVar, int i, Object obj) {
        if ((i & 1) != 0) {
            tVar = commerceSettingCombineModel.combineModel;
        }
        return commerceSettingCombineModel.copy(tVar);
    }

    public final C38256t component1() {
        return this.combineModel;
    }

    public final CommerceSettingCombineModel copy(C38256t tVar) {
        C89219l.m154721d(tVar, "");
        return new CommerceSettingCombineModel(tVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof CommerceSettingCombineModel) && C89219l.m154714a(this.combineModel, ((CommerceSettingCombineModel) obj).combineModel);
        }
        return true;
    }

    public final int hashCode() {
        C38256t tVar = this.combineModel;
        if (tVar != null) {
            return tVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "CommerceSettingCombineModel(combineModel=" + this.combineModel + ")";
    }

    public final C38256t getCombineModel() {
        return this.combineModel;
    }

    public final void setCombineModel(C38256t tVar) {
        C89219l.m154721d(tVar, "");
        this.combineModel = tVar;
    }

    public CommerceSettingCombineModel(C38256t tVar) {
        C89219l.m154721d(tVar, "");
        this.combineModel = tVar;
    }
}
