package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.ISearchHistoryManager */
public interface ISearchHistoryManager {
    static {
        Covode.recordClassIndex(50459);
    }

    void clearForAccountChange();

    void clearSearchHistory();

    void clearSearchHistory(int i);

    void deleteSearchHistory(SearchHistory searchHistory);

    String getKey();

    List<SearchHistory> getSearchHistory();

    List<SearchHistory> getSearchHistoryByType(int i);

    void recordSearchHistory(SearchHistory searchHistory);

    void saveSearchHistory();
}
