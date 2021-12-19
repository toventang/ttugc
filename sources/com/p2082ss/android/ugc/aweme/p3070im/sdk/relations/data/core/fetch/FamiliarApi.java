package com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.fetch;

import com.bytedance.covode.number.Covode;
import com.google.p1998c.p2006h.p2007a.AbstractFutureC27655q;
import com.p2082ss.android.ugc.aweme.p3070im.sdk.relations.data.core.fetch.model.FamiliarsRelationFetchResponse;
import p4640l.p4644b.AbstractC89719c;
import p4640l.p4644b.AbstractC89721e;
import p4640l.p4644b.AbstractC89731o;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.FamiliarApi */
public interface FamiliarApi {
    static {
        Covode.recordClassIndex(65620);
    }

    @AbstractC89731o(mo144285a = "im/spotlight/friend_relation/")
    @AbstractC89721e
    AbstractFutureC27655q<FamiliarsRelationFetchResponse> getSpotlightRelationOfFriends(@AbstractC89719c(mo144273a = "params") String str);
}
