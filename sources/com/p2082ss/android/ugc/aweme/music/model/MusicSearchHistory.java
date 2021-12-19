package com.p2082ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;

/* renamed from: com.ss.android.ugc.aweme.music.model.MusicSearchHistory */
public class MusicSearchHistory {
    @AbstractC27891c(mo46611a = "keyword")
    public String keyword;
    @AbstractC27891c(mo46611a = "int")
    public int type;

    static {
        Covode.recordClassIndex(71412);
    }

    public MusicSearchHistory() {
    }

    public int hashCode() {
        String str = this.keyword;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public MusicSearchHistory(String str) {
        this.keyword = str;
        this.type = 1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            String str = this.keyword;
            String str2 = ((MusicSearchHistory) obj).keyword;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public MusicSearchHistory(String str, int i) {
        this.keyword = str;
        this.type = i;
    }
}
