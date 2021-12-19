package com.p2082ss.android.ugc.aweme.relation;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.base.api.BaseResponse;
import p4600h.p4611f.p4613b.C89214g;

/* renamed from: com.ss.android.ugc.aweme.relation.CheckMatchedFriendsResponse */
public final class CheckMatchedFriendsResponse extends BaseResponse {
    @AbstractC27891c(mo46611a = "has_data")
    private final boolean hasData;

    static {
        Covode.recordClassIndex(78386);
    }

    public CheckMatchedFriendsResponse() {
        this(false, 1, null);
    }

    public static /* synthetic */ CheckMatchedFriendsResponse copy$default(CheckMatchedFriendsResponse checkMatchedFriendsResponse, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = checkMatchedFriendsResponse.hasData;
        }
        return checkMatchedFriendsResponse.copy(z);
    }

    public final boolean component1() {
        return this.hasData;
    }

    public final CheckMatchedFriendsResponse copy(boolean z) {
        return new CheckMatchedFriendsResponse(z);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof CheckMatchedFriendsResponse) && this.hasData == ((CheckMatchedFriendsResponse) obj).hasData;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.hasData;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    @Override // com.p2082ss.android.ugc.aweme.base.api.BaseResponse
    public final String toString() {
        return "CheckMatchedFriendsResponse(hasData=" + this.hasData + ")";
    }

    public final boolean getHasData() {
        return this.hasData;
    }

    public CheckMatchedFriendsResponse(boolean z) {
        this.hasData = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CheckMatchedFriendsResponse(boolean z, int i, C89214g gVar) {
        this((i & 1) != 0 ? false : z);
    }
}
