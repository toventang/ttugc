package com.p2082ss.android.ugc.aweme.request_combine.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.AbstractC28019l;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.request_combine.C67116a;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.request_combine.model.AbTestCombineModel */
public final class AbTestCombineModel extends C67116a {
    @AbstractC27891c(mo46611a = "body")
    private AbstractC28019l abTestResponse;

    static {
        Covode.recordClassIndex(78717);
    }

    public static /* synthetic */ AbTestCombineModel copy$default(AbTestCombineModel abTestCombineModel, AbstractC28019l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            lVar = abTestCombineModel.abTestResponse;
        }
        return abTestCombineModel.copy(lVar);
    }

    public final AbstractC28019l component1() {
        return this.abTestResponse;
    }

    public final AbTestCombineModel copy(AbstractC28019l lVar) {
        C89219l.m154721d(lVar, "");
        return new AbTestCombineModel(lVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof AbTestCombineModel) && C89219l.m154714a(this.abTestResponse, ((AbTestCombineModel) obj).abTestResponse);
        }
        return true;
    }

    public final int hashCode() {
        AbstractC28019l lVar = this.abTestResponse;
        if (lVar != null) {
            return lVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "AbTestCombineModel(abTestResponse=" + this.abTestResponse + ")";
    }

    public final AbstractC28019l getAbTestResponse() {
        return this.abTestResponse;
    }

    public final void setAbTestResponse(AbstractC28019l lVar) {
        C89219l.m154721d(lVar, "");
        this.abTestResponse = lVar;
    }

    public AbTestCombineModel(AbstractC28019l lVar) {
        C89219l.m154721d(lVar, "");
        this.abTestResponse = lVar;
    }
}
