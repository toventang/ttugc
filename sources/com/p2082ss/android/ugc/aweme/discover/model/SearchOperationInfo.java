package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.Objects;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchOperationInfo */
public final class SearchOperationInfo implements Serializable {
    @AbstractC27891c(mo46611a = "live_room")
    private Aweme aweme;
    @AbstractC27891c(mo46611a = "activity")
    private SearchOperation operation;

    static {
        Covode.recordClassIndex(50510);
    }

    public final Aweme getAweme() {
        return this.aweme;
    }

    public final SearchOperation getOperation() {
        return this.operation;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.operation.hashCode() * 31;
        Aweme aweme2 = this.aweme;
        if (aweme2 != null) {
            i = aweme2.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    public final void setAweme(Aweme aweme2) {
        this.aweme = aweme2;
    }

    public final void setOperation(SearchOperation searchOperation) {
        C89219l.m154721d(searchOperation, "");
        this.operation = searchOperation;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        Class<?> cls2 = getClass();
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!C89219l.m154714a(cls2, cls)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.model.SearchOperationInfo");
        SearchOperationInfo searchOperationInfo = (SearchOperationInfo) obj;
        if (!(!C89219l.m154714a(this.operation, searchOperationInfo.operation)) && !(!C89219l.m154714a(this.aweme, searchOperationInfo.aweme))) {
            return true;
        }
        return false;
    }

    public SearchOperationInfo(SearchOperation searchOperation, Aweme aweme2) {
        C89219l.m154721d(searchOperation, "");
        this.operation = searchOperation;
        this.aweme = aweme2;
    }
}
