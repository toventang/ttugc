package com.p2082ss.android.ugc.aweme.music.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.music.model.MusicSearchCorrectInfo */
public class MusicSearchCorrectInfo extends MusicModel implements Serializable {
    static final long serialVersionUID = 1;
    @AbstractC27891c(mo46611a = "corrected_query")
    String correctedKeyword;
    @AbstractC27891c(mo46611a = "correct_level")
    int correctedLevel;

    static {
        Covode.recordClassIndex(71411);
    }

    public String getCorrectedKeyword() {
        return this.correctedKeyword;
    }

    public int getCorrectedLevel() {
        return this.correctedLevel;
    }

    public void setCorrectedKeyword(String str) {
        this.correctedKeyword = str;
    }

    public void setCorrectedLevel(int i) {
        this.correctedLevel = i;
    }
}
