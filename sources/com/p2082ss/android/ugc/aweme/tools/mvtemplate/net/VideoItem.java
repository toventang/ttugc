package com.p2082ss.android.ugc.aweme.tools.mvtemplate.net;

import com.bytedance.covode.number.Covode;
import com.google.gson.p2018a.AbstractC27891c;
import p4600h.p4611f.p4613b.C89219l;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.VideoItem */
public final class VideoItem {
    private String algorithm = "";
    private String content;
    @AbstractC27891c(mo46611a = "video_conf")
    private String jsonResult = "";

    static {
        Covode.recordClassIndex(92130);
    }

    public final String getAlgorithm() {
        return this.algorithm;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getJsonResult() {
        return this.jsonResult;
    }

    public final void setContent(String str) {
        this.content = str;
    }

    public final void setAlgorithm(String str) {
        C89219l.m154721d(str, "");
        this.algorithm = str;
    }

    public final void setJsonResult(String str) {
        C89219l.m154721d(str, "");
        this.jsonResult = str;
    }
}
