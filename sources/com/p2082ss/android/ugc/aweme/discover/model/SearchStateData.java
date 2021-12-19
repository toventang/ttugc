package com.p2082ss.android.ugc.aweme.discover.model;

import androidx.lifecycle.AbstractC1174ac;
import androidx.lifecycle.C1213t;
import com.bytedance.covode.number.Covode;
import java.util.Objects;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchStateData */
public final class SearchStateData extends AbstractC1174ac {
    private C1213t<Integer> searchStateData;

    static {
        Covode.recordClassIndex(50513);
    }

    public final C1213t<Integer> getSearchState() {
        if (this.searchStateData == null) {
            this.searchStateData = new C1213t<>();
        }
        C1213t<Integer> tVar = this.searchStateData;
        Objects.requireNonNull(tVar, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.Int>");
        return tVar;
    }
}
