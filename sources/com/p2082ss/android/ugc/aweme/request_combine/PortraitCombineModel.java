package com.p2082ss.android.ugc.aweme.request_combine;

import com.bytedance.covode.number.Covode;
import com.google.gson.C28022o;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89214g;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.request_combine.PortraitCombineModel */
public final class PortraitCombineModel extends C67116a {
    @AbstractC27891c(mo46611a = "body")
    private C28022o portraitData;

    static {
        Covode.recordClassIndex(78699);
    }

    public PortraitCombineModel() {
        this(null, 1, null);
    }

    public static /* synthetic */ PortraitCombineModel copy$default(PortraitCombineModel portraitCombineModel, C28022o oVar, int i, Object obj) {
        if ((i & 1) != 0) {
            oVar = portraitCombineModel.portraitData;
        }
        return portraitCombineModel.copy(oVar);
    }

    public final C28022o component1() {
        return this.portraitData;
    }

    public final PortraitCombineModel copy(C28022o oVar) {
        return new PortraitCombineModel(oVar);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof PortraitCombineModel) && C89219l.m154714a(this.portraitData, ((PortraitCombineModel) obj).portraitData);
        }
        return true;
    }

    public final int hashCode() {
        C28022o oVar = this.portraitData;
        if (oVar != null) {
            return oVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "PortraitCombineModel(portraitData=" + this.portraitData + ")";
    }

    public final C28022o getPortraitData() {
        return this.portraitData;
    }

    public final void setPortraitData(C28022o oVar) {
        this.portraitData = oVar;
    }

    public PortraitCombineModel(C28022o oVar) {
        this.portraitData = oVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PortraitCombineModel(C28022o oVar, int i, C89214g gVar) {
        this((i & 1) != 0 ? null : oVar);
    }
}
