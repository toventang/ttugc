package com.p2082ss.android.ugc.aweme.shortvideo.edit.infosticker.interact;

import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.InteractionCheckInfo */
public class InteractionCheckInfo {
    private List<String> options;
    private String question;

    static {
        Covode.recordClassIndex(83562);
    }

    public List<String> getOptions() {
        return this.options;
    }

    public String getQuestion() {
        return this.question;
    }

    public void setOptions(List<String> list) {
        this.options = list;
    }

    public void setQuestion(String str) {
        this.question = str;
    }
}
