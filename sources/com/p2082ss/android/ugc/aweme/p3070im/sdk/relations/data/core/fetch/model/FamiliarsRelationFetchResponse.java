package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.fetch.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.model.FamiliarsRelationFetchResponse */
public class FamiliarsRelationFetchResponse extends BaseResponse {
    @AbstractC27891c(mo46611a = "results")
    List<FamiliarRelation> relations;

    static {
        Covode.recordClassIndex(65630);
    }

    public List<FamiliarRelation> getRelations() {
        return this.relations;
    }

    public void setRelations(List<FamiliarRelation> list) {
        this.relations = list;
    }
}
