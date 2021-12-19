package com.p2082ss.android.ugc.aweme.discover.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.search.C67458j;
import java.util.Arrays;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchHistory */
public class SearchHistory {
    @AbstractC27891c(mo46611a = "keyword")
    public String keyword;
    @AbstractC27891c(mo46611a = "int")
    public int type;
    @AbstractC27891c(mo46611a = "uid")
    public String uid;

    static {
        Covode.recordClassIndex(50483);
    }

    public SearchHistory() {
    }

    public String toString() {
        return this.keyword;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.keyword, this.uid});
    }

    public SearchHistory(String str) {
        this.keyword = str;
        this.type = 1;
    }

    public static int toHistoryType(int i) {
        if (i == C67458j.f151134c) {
            return 16;
        }
        if (i == C67458j.f151136e) {
            return 17;
        }
        if (i == C67458j.f151137f) {
            return 22;
        }
        if (i == C67458j.f151138g) {
            return 18;
        }
        if (i == C67458j.f151135d) {
            return 19;
        }
        if (i == C67458j.f151133b) {
            return 20;
        }
        if (i == C67458j.f151139h) {
            return 21;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            SearchHistory searchHistory = (SearchHistory) obj;
            String str = this.keyword;
            if (str == null ? searchHistory.keyword == null : str.equals(searchHistory.keyword)) {
                String str2 = this.uid;
                if (str2 == null ? searchHistory.uid != null : !str2.equals(searchHistory.uid)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public SearchHistory(String str, int i) {
        this.keyword = str;
        this.type = i;
    }

    public SearchHistory(String str, int i, String str2) {
        this.keyword = str;
        this.type = i;
        this.uid = str2;
    }
}
