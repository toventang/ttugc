package com.p2082ss.android.ugc.aweme.discover.model.tab;

import com.bytedance.covode.number.Covode;

/* renamed from: com.ss.android.ugc.aweme.discover.model.tab.SearchTabJumpCenter */
public final class SearchTabJumpCenter {
    public static final SearchTabJumpCenter INSTANCE = new SearchTabJumpCenter();
    private static SearchTabViewModel searchTabViewModel;

    private SearchTabJumpCenter() {
    }

    public final SearchTabViewModel getSearchTabViewModel() {
        return searchTabViewModel;
    }

    static {
        Covode.recordClassIndex(50556);
    }

    public final void setSearchTabViewModel(SearchTabViewModel searchTabViewModel2) {
        searchTabViewModel = searchTabViewModel2;
    }
}
