package com.p2082ss.android.ugc.aweme.feed.model;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.kakao.usermgmt.StringSet;

/* renamed from: com.ss.android.ugc.aweme.feed.model.HotSearchGuideWord */
public class HotSearchGuideWord {
    @AbstractC27891c(mo46611a = "breathe_times")
    public int breatheTimes;
    @AbstractC27891c(mo46611a = "word")
    public String displayWord;
    @AbstractC27891c(mo46611a = "search_word")
    public String searchWord;
    @AbstractC27891c(mo46611a = StringSet.type)
    public int type;

    static {
        Covode.recordClassIndex(58703);
    }

    public boolean isNormalWord() {
        if (this.type == 0) {
            return true;
        }
        return false;
    }

    public String getSearchWord() {
        if (TextUtils.isEmpty(this.searchWord)) {
            return this.displayWord;
        }
        return this.searchWord;
    }

    public boolean isAd() {
        if (this.type == 3) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "displayWord: " + this.displayWord + ", searchWord: " + this.searchWord + ", type: " + this.type;
    }
}
