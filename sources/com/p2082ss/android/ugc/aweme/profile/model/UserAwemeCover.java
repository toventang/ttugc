package com.p2082ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27890b;
import com.google.gson.p2018a.AbstractC27891c;
import com.p2082ss.android.ugc.aweme.utils.C80365dx;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.UserAwemeCover */
public class UserAwemeCover implements Serializable {
    @AbstractC27890b(mo46609a = C80365dx.class)
    @AbstractC27891c(mo46611a = "aweme_info")
    String awemeInfo;
    @AbstractC27891c(mo46611a = "preview_end")
    int previewEnd;
    @AbstractC27891c(mo46611a = "preview_start")
    int previewStart;
    @AbstractC27891c(mo46611a = "pull_text")
    String pullText;

    static {
        Covode.recordClassIndex(75229);
    }

    public String getAwemeInfo() {
        return this.awemeInfo;
    }

    public int getPreviewEnd() {
        return this.previewEnd;
    }

    public int getPreviewStart() {
        return this.previewStart;
    }

    public String getPullText() {
        return this.pullText;
    }

    public void setAwemeInfo(String str) {
        this.awemeInfo = str;
    }

    public void setPreviewEnd(int i) {
        this.previewEnd = i;
    }

    public void setPreviewStart(int i) {
        this.previewStart = i;
    }

    public void setPullText(String str) {
        this.pullText = str;
    }
}
